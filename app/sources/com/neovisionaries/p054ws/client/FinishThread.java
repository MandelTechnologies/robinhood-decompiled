package com.neovisionaries.p054ws.client;

/* loaded from: classes27.dex */
class FinishThread extends WebSocketThread {
    public FinishThread(WebSocket webSocket) {
        super("FinishThread", webSocket, ThreadType.FINISH_THREAD);
    }

    @Override // com.neovisionaries.p054ws.client.WebSocketThread
    public void runMain() {
        this.mWebSocket.finish();
    }
}
