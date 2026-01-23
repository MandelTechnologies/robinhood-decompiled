package com.neovisionaries.p054ws.client;

/* loaded from: classes27.dex */
class PongSender extends PeriodicalFrameSender {
    public PongSender(WebSocket webSocket, PayloadGenerator payloadGenerator) {
        super(webSocket, "PongSender", payloadGenerator);
    }

    @Override // com.neovisionaries.p054ws.client.PeriodicalFrameSender
    protected WebSocketFrame createFrame(byte[] bArr) {
        return WebSocketFrame.createPongFrame(bArr);
    }
}
