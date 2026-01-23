package com.neovisionaries.p054ws.client;

/* loaded from: classes27.dex */
class PingSender extends PeriodicalFrameSender {
    public PingSender(WebSocket webSocket, PayloadGenerator payloadGenerator) {
        super(webSocket, "PingSender", payloadGenerator);
    }

    @Override // com.neovisionaries.p054ws.client.PeriodicalFrameSender
    protected WebSocketFrame createFrame(byte[] bArr) {
        return WebSocketFrame.createPingFrame(bArr);
    }
}
