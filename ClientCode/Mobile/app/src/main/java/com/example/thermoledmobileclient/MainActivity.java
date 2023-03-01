package com.example.thermoledmobileclient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.thermoledmobileclient.data.model.LoggedInUser;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.examples.iotservice.IoTServiceGrpc;
import io.grpc.examples.iotservice.LedReply;
import io.grpc.examples.iotservice.LedRequest;
import io.grpc.examples.iotservice.TemperatureReply;
import io.grpc.examples.iotservice.TemperatureRequest;


import com.example.thermoledmobileclient.ui.login.LoginViewModel;
import com.example.thermoledmobileclient.ui.login.LoginViewModelFactory;
public class MainActivity extends AppCompatActivity {
    private TextView temperatureResultText;
    private String host;
    private int port;
    private int key;
    private Button getTemperatureButton;
    private Button ledOnButton;
    private Button ledOffButton;

    private LoggedInUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginViewModel vm = new ViewModelProvider(this, new LoginViewModelFactory())
                .get(LoginViewModel.class);
        user = vm.getLoggedInUser();
        temperatureResultText = (TextView) findViewById(R.id.textViewTemperature);
        host = user.getUserHost();
        port = user.getUserPort();
        key = user.getUserId();
//        hostEdit = (EditText) findViewById(R.id.host);
//        portEdit = (EditText) findViewById(R.id.port);
        getTemperatureButton = (Button) findViewById(R.id.getTempButton);
        ledOnButton = (Button) findViewById(R.id.ledOnButton);
        ledOffButton = (Button) findViewById(R.id.ledOffButton);

    }

    public void sendTemperatureRequest(View view) {
//        ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE))
//                .hideSoftInputFromWindow(hostEdit.getWindowToken(), 0);
        getTemperatureButton.setEnabled(false);
        temperatureResultText.setText("");
        Integer iport = new Integer(port);
        Integer ikey = new Integer(key);
        new GrpcTask(this).execute(host,iport.toString(), ikey.toString());
    }

    private static class GrpcTask extends AsyncTask<String, Void, String> {
        private final WeakReference<Activity> activityReference;
        private ManagedChannel channel;


        private GrpcTask(Activity activity) {
            this.activityReference = new WeakReference<Activity>(activity);
        }

        @Override
        protected String doInBackground(String... params) {

            String host = params[0];
            String portStr = params[1];
            String keyStr = params[2];
            int port = TextUtils.isEmpty(portStr) ? 0 : Integer.parseInt(portStr);
            int key = TextUtils.isEmpty(keyStr) ? 0 : Integer.parseInt(keyStr);

            try {
                channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
                IoTServiceGrpc.IoTServiceBlockingStub stub = IoTServiceGrpc.newBlockingStub(channel);
                TemperatureRequest request = TemperatureRequest.newBuilder().setKey(key).build();
                TemperatureReply reply = stub.sayTemperature(request);
                if(reply.getStatus().equals("OK"))
                    return reply.getTemperature();
                throw new Exception(reply.getStatus());
            } catch (Exception e) {
                StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw);
                e.printStackTrace(pw);
                pw.flush();
                return String.format("Failed... : %n%s", sw);
            }
        }

        @Override
        protected void onPostExecute(String result) {
            try {
                channel.shutdown().awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            Activity activity = activityReference.get();
            if (activity == null) {
                return;
            }
            TextView temperatureResultText = (TextView) activity.findViewById(R.id.textViewTemperature);
            Button getTemperatureButton = (Button) activity.findViewById(R.id.getTempButton);
            temperatureResultText.setText(result);
            getTemperatureButton.setEnabled(true);
        }
    }

    public void ledOnRequest(View view) {
//        ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE))
//                .hideSoftInputFromWindow(hostEdit.getWindowToken(), 0);
        ledOnButton.setEnabled(false);
        Integer iport = new Integer(port);
        Integer ikey = new Integer(key);
        new GrpcTask2(this).execute(host,iport.toString(), ikey.toString(),"1");
    }

    public void ledOffRequest(View view) {
//        ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE))
//                .hideSoftInputFromWindow(hostEdit.getWindowToken(), 0);
        ledOffButton.setEnabled(false);

        Integer iport = new Integer(port);
        Integer ikey = new Integer(key);
        new GrpcTask2(this).execute(host,iport.toString(), ikey.toString(),"0");
    }

    private static class GrpcTask2 extends AsyncTask<String, Void, String> {
        private final WeakReference<Activity> activityReference;
        private ManagedChannel channel;


        private GrpcTask2(Activity activity) {
            this.activityReference = new WeakReference<Activity>(activity);
        }

        @Override
        protected String doInBackground(String... params) {

            String host = params[0];
            String portStr = params[1];
            String keyStr = params[2];
            int port = TextUtils.isEmpty(portStr) ? 0 : Integer.parseInt(portStr);
            int key = TextUtils.isEmpty(keyStr) ? 0 : Integer.parseInt(keyStr);
            String ledState = params[3];
            try {
                channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
                IoTServiceGrpc.IoTServiceBlockingStub stub = IoTServiceGrpc.newBlockingStub(channel);
                LedRequest request = LedRequest.newBuilder().setLedname("red").setKey(key).setState(Integer.parseInt(ledState)).build();
                LedReply reply = stub.blinkLed(request);
                return Integer.toString(reply.getLedstateMap().get("red"));
            } catch (Exception e) {
                StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw);
                e.printStackTrace(pw);
                pw.flush();
                return String.format("Failed... : %n%s", sw);
            }
        }

        @Override
        protected void onPostExecute(String result) {
            try {
                channel.shutdown().awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            Activity activity = activityReference.get();
            if (activity == null) {
                return;
            }
            if (result.equals("1")) {
                Button ledOnButton = (Button) activity.findViewById(R.id.ledOnButton);
                ledOnButton.setEnabled(true);
            } else {
                Button ledOffButton = (Button) activity.findViewById(R.id.ledOffButton);
                ledOffButton.setEnabled(true);
            }

        }
    }
}