package com.example.thermoledmobileclient.data;

import android.app.Activity;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.thermoledmobileclient.R;
import com.example.thermoledmobileclient.data.model.LoggedInUser;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import io.grpc.examples.iotservice.IoTServiceGrpc;
import io.grpc.examples.iotservice.LoginReply;
import io.grpc.examples.iotservice.LoginRequest;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {
    private ManagedChannel channel;
    public Result<LoggedInUser> login(String host, String username, String password) {
        int port = 50051;
        try {
            // TODO: handle loggedInUser authentication
            channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
            IoTServiceGrpc.IoTServiceBlockingStub stub = IoTServiceGrpc.newBlockingStub(channel);
            LoginRequest request = LoginRequest.newBuilder().setLogin(username).setPassword(password).build();
            LoginReply reply = stub.userLogin(request);
            if(!reply.getStatus().equals("OK"))
                return new Result.Error(new IOException("Error logging in",new Exception(reply.getStatus())));
            LoggedInUser User =
                    new LoggedInUser(
                            reply.getKey(),
                           username,host,reply.getAccess());
            return new Result.Success<>(User);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }

}