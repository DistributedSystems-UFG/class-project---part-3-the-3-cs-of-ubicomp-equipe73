package com.example.thermoledmobileclient.data.model;

import java.io.Serializable;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser{

    private int userId;
    private String displayName;
    private String host;
    private int port = 50051;
    private int access;

    public LoggedInUser(int userId, String displayName, String host,int access) {
        this.userId = userId;
        this.displayName = displayName;
        this.host = host;
        this.access = access;
    }

    public int getUserId() {
        return userId;
    }

    public int getUserPort() {
        return port;
    }

    public String getUserHost() {
        return host;
    }

    public int getAccess() {
        return access;
    }

    public String getDisplayName() {
        return displayName;
    }
}