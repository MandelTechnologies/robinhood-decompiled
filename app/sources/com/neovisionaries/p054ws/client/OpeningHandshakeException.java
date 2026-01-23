package com.neovisionaries.p054ws.client;

import java.util.List;
import java.util.Map;

/* loaded from: classes27.dex */
public class OpeningHandshakeException extends WebSocketException {
    private final byte[] mBody;
    private final Map<String, List<String>> mHeaders;
    private final StatusLine mStatusLine;

    OpeningHandshakeException(WebSocketError webSocketError, String str, StatusLine statusLine, Map<String, List<String>> map) {
        this(webSocketError, str, statusLine, map, null);
    }

    OpeningHandshakeException(WebSocketError webSocketError, String str, StatusLine statusLine, Map<String, List<String>> map, byte[] bArr) {
        super(webSocketError, str);
        this.mStatusLine = statusLine;
        this.mHeaders = map;
        this.mBody = bArr;
    }
}
