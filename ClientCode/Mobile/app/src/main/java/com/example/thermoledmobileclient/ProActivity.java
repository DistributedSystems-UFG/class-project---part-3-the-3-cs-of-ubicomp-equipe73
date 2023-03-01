package com.example.thermoledmobileclient;

        import androidx.annotation.Nullable;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.lifecycle.LiveData;
        import androidx.lifecycle.MutableLiveData;
        import androidx.lifecycle.ViewModel;
        import androidx.lifecycle.ViewModelProvider;

        import android.app.Activity;
        import android.content.Context;
        import android.os.AsyncTask;
        import android.os.Bundle;
        import android.os.IBinder;
        import android.text.TextUtils;
        import android.util.Log;
        import android.view.View;
        import android.view.inputmethod.InputMethodManager;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Switch;
        import android.widget.TextView;

        import android.app.IntentService;

        import android.Manifest;
        import android.content.BroadcastReceiver;

        import android.content.Intent;
        import android.content.IntentFilter;

        import android.content.pm.PackageManager;
        import android.graphics.Color;
        import android.net.Uri;
        import android.os.Bundle;
        import androidx.core.content.ContextCompat;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.WindowManager;
        import android.widget.Toast;

        import com.github.mikephil.charting.charts.LineChart;
        import com.github.mikephil.charting.components.YAxis.AxisDependency;
        import com.github.mikephil.charting.data.Entry;
        import com.github.mikephil.charting.data.LineData;
        import com.github.mikephil.charting.data.LineDataSet;
        import com.github.mikephil.charting.highlight.Highlight;
        import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
        import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
        import com.github.mikephil.charting.utils.ColorTemplate;

        import java.util.ArrayList;

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


public class ProActivity extends AppCompatActivity{
    private TextView temperatureResultText;
    private String host;
    private int port;
    private int key;

    private Switch greenSwitch;
    private Switch redSwitch;

    private LineChart chart;
    private Button ledOffButton;

    private LoggedInUser user;
    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.example.thermoledmobileclient");
        registerReceiver(broadcastReceiver, intentFilter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro);
        LoginViewModel vm = new ViewModelProvider(this, new LoginViewModelFactory())
                .get(LoginViewModel.class);
        user = vm.getLoggedInUser();
        host = user.getUserHost();
        port = user.getUserPort();
        key = user.getUserId();
        greenSwitch = (Switch) findViewById(R.id.greenSwitch);
        redSwitch = (Switch) findViewById(R.id.redSwitch);
        chart = findViewById(R.id.chart1);

        chart.setDrawGridBackground(false);
        chart.getDescription().setEnabled(false);
;
        addEntry(30.0f);
        Intent si = new Intent(this,GRPCService.class);
        si.putExtra("host",host);
        si.putExtra("port",port);
        si.putExtra("key",key);
        startService(si);
    }


    BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String s1 = intent.getStringExtra("DATAPASSED");
            addEntry(Float.parseFloat(s1));
        }
    };


    private final int[] colors = ColorTemplate.VORDIPLOM_COLORS;

    private void addEntry(float value) {

        LineData data = chart.getData();

        if (data == null) {
            data = new LineData();
            chart.setData(data);
        }

        ILineDataSet set = data.getDataSetByIndex(0);
        // set.addEntry(...); // can be called as well

        if (set == null) {
            set = createSet();
            data.addDataSet(set);
        }

        // choose a random dataSet
        int randomDataSetIndex = (int) (Math.random() * data.getDataSetCount());
        ILineDataSet randomSet = data.getDataSetByIndex(randomDataSetIndex);

        data.addEntry(new Entry(randomSet.getEntryCount(), value), randomDataSetIndex);
        data.notifyDataChanged();

        // let the chart know it's data has changed
        chart.notifyDataSetChanged();

        chart.setVisibleXRangeMaximum(6);
        //chart.setVisibleYRangeMaximum(15, AxisDependency.LEFT);
//
//            // this automatically refreshes the chart (calls invalidate())
        chart.moveViewTo(data.getEntryCount() - 7, 50f, AxisDependency.LEFT);

    }
    private void removeLastEntry() {

        LineData data = chart.getData();

        if (data != null) {

            ILineDataSet set = data.getDataSetByIndex(0);

            if (set != null) {

                Entry e = set.getEntryForXValue(set.getEntryCount() - 1, Float.NaN);

                data.removeEntry(e, 0);
                // or remove by index
                // mData.removeEntryByXValue(xIndex, dataSetIndex);
                data.notifyDataChanged();
                chart.notifyDataSetChanged();
                chart.invalidate();
            }
        }
    }

    private void addDataSet() {

        LineData data = chart.getData();

        if (data == null) {
            chart.setData(new LineData());
        } else {
            int count = (data.getDataSetCount() + 1);
            int amount = data.getDataSetByIndex(0).getEntryCount();

            ArrayList<Entry> values = new ArrayList<>();

            for (int i = 0; i < amount; i++) {
                values.add(new Entry(i, (float) (Math.random() * 50f) + 50f * count));
            }

            LineDataSet set = new LineDataSet(values, "DataSet " + count);
            set.setLineWidth(2.5f);
            set.setCircleRadius(4.5f);

            int color = colors[count % colors.length];

            set.setColor(color);
            set.setCircleColor(color);
            set.setHighLightColor(color);
            set.setValueTextSize(10f);
            set.setValueTextColor(color);

            data.addDataSet(set);
            data.notifyDataChanged();
            chart.notifyDataSetChanged();
            chart.invalidate();
        }
    }

    private void removeDataSet() {

        LineData data = chart.getData();

        if (data != null) {

            data.removeDataSet(data.getDataSetByIndex(data.getDataSetCount() - 1));

            chart.notifyDataSetChanged();
            chart.invalidate();
        }
    }

    private LineDataSet createSet() {

        LineDataSet set = new LineDataSet(null, "Temperature");
        set.setLineWidth(2.5f);
        set.setCircleRadius(4.5f);
        set.setColor(Color.rgb(240, 99, 99));
        set.setCircleColor(Color.rgb(240, 99, 99));
        set.setHighLightColor(Color.rgb(190, 190, 190));
        set.setAxisDependency(AxisDependency.LEFT);
        set.setValueTextSize(10f);

        return set;
    }


    public void redSwitchRequest(View view) {
        String swap;
        redSwitch.setEnabled(false);
        if(redSwitch.isChecked())
            swap = "1";
        else
            swap = "0";
        Integer iport = new Integer(port);
        Integer ikey = new Integer(key);
        new GrpcTask2(this).execute(host,iport.toString(), ikey.toString(),"red",swap);
    }

    public void greenSwitchRequest(View view) {
        String swap;
        greenSwitch.setEnabled(false);

        if(greenSwitch.isChecked())
            swap = "1";
        else
            swap = "0";

        Integer iport = new Integer(port);
        Integer ikey = new Integer(key);
        new GrpcTask2(this).execute(host,iport.toString(), ikey.toString(),"green",swap);
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
            String ledname = params[3];
            String ledState = params[4];
            try {
                channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
                IoTServiceGrpc.IoTServiceBlockingStub stub = IoTServiceGrpc.newBlockingStub(channel);
                LedRequest request = LedRequest.newBuilder().setLedname(ledname).setKey(key).setState(Integer.parseInt(ledState)).build();
                LedReply reply = stub.blinkLed(request);
                return ledname;
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
            Switch reds;
            if (result.equals("red")) {
                reds = (Switch) activity.findViewById(R.id.redSwitch);
            } else {
                reds = (Switch) activity.findViewById(R.id.greenSwitch);
            }
            reds.setEnabled(true);

        }
    }


    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadcastReceiver);
    }
}