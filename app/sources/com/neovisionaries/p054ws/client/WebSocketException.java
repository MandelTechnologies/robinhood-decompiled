package com.neovisionaries.p054ws.client;

/* loaded from: classes27.dex */
public class WebSocketException extends Exception {
    private final WebSocketError mError;

    public WebSocketException(WebSocketError webSocketError, String str) {
        super(str);
        this.mError = webSocketError;
    }

    public WebSocketException(WebSocketError webSocketError, String str, Throwable th) {
        super(str, th);
        this.mError = webSocketError;
    }

    public WebSocketError getError() {
        return this.mError;
    }
}
