package com.neovisionaries.p054ws.client;

/* loaded from: classes27.dex */
class NoMoreFrameException extends WebSocketException {
    public NoMoreFrameException() {
        super(WebSocketError.NO_MORE_FRAME, "No more WebSocket frame from the server.");
    }
}
