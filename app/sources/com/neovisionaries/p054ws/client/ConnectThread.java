package com.neovisionaries.p054ws.client;

/* loaded from: classes27.dex */
class ConnectThread extends WebSocketThread {
    public ConnectThread(WebSocket webSocket) {
        super("ConnectThread", webSocket, ThreadType.CONNECT_THREAD);
    }

    @Override // com.neovisionaries.p054ws.client.WebSocketThread
    public void runMain() {
        try {
            this.mWebSocket.connect();
        } catch (WebSocketException e) {
            handleError(e);
        }
    }

    private void handleError(WebSocketException webSocketException) {
        ListenerManager listenerManager = this.mWebSocket.getListenerManager();
        listenerManager.callOnError(webSocketException);
        listenerManager.callOnConnectError(webSocketException);
    }
}
