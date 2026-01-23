package com.twilio.twilsock.client;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.twilio.util.ErrorInfo;
import kotlin.Metadata;

/* compiled from: TwilsockTransport.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockTransportListener;", "", "onMessageReceived", "", WebsocketGatewayConstants.DATA_KEY, "", "onTransportConnected", "onTransportDisconnected", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.twilsock.client.TwilsockTransportListener, reason: use source file name */
/* loaded from: classes12.dex */
public interface TwilsockTransport7 {
    void onMessageReceived(byte[] data);

    void onTransportConnected();

    void onTransportDisconnected(ErrorInfo errorInfo);
}
