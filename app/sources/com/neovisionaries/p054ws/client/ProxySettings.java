package com.neovisionaries.p054ws.client;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.net.SocketFactory;

/* loaded from: classes27.dex */
public class ProxySettings {
    private String mHost;
    private String mId;
    private String mPassword;
    private int mPort;
    private boolean mSecure;
    private String[] mServerNames;
    private final WebSocketFactory mWebSocketFactory;
    private final Map<String, List<String>> mHeaders = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private final SocketFactorySettings mSocketFactorySettings = new SocketFactorySettings();

    ProxySettings(WebSocketFactory webSocketFactory) {
        this.mWebSocketFactory = webSocketFactory;
        reset();
    }

    public ProxySettings reset() {
        this.mSecure = false;
        this.mHost = null;
        this.mPort = -1;
        this.mId = null;
        this.mPassword = null;
        this.mHeaders.clear();
        this.mServerNames = null;
        return this;
    }

    public boolean isSecure() {
        return this.mSecure;
    }

    public String getHost() {
        return this.mHost;
    }

    public ProxySettings setHost(String str) {
        this.mHost = str;
        return this;
    }

    public int getPort() {
        return this.mPort;
    }

    public ProxySettings setPort(int i) {
        this.mPort = i;
        return this;
    }

    public String getId() {
        return this.mId;
    }

    public ProxySettings setId(String str) {
        this.mId = str;
        return this;
    }

    public String getPassword() {
        return this.mPassword;
    }

    public ProxySettings setPassword(String str) {
        this.mPassword = str;
        return this;
    }

    public ProxySettings setCredentials(String str, String str2) {
        return setId(str).setPassword(str2);
    }

    public Map<String, List<String>> getHeaders() {
        return this.mHeaders;
    }

    SocketFactory selectSocketFactory() {
        return this.mSocketFactorySettings.selectSocketFactory(this.mSecure);
    }

    public String[] getServerNames() {
        return this.mServerNames;
    }
}
