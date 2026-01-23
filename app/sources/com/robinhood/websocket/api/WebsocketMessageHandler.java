package com.robinhood.websocket.api;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;

/* compiled from: WebsocketMessageHandler.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007J/\u0010\b\u001a\u0004\u0018\u0001H\t\"\b\b\u0002\u0010\t*\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bH&¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/websocket/api/WebsocketMessageHandler;", "ResponseT", "DataT", "", "deserialize", "message", "", "(Ljava/lang/String;)Ljava/lang/Object;", "extractMessageForTopic", "T", WebsocketGatewayConstants.TOPIC_KEY, "Lcom/robinhood/websocket/api/WebsocketTopic;", "(Ljava/lang/Object;Lcom/robinhood/websocket/api/WebsocketTopic;)Ljava/lang/Object;", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface WebsocketMessageHandler<ResponseT, DataT> {
    ResponseT deserialize(String message);

    <T extends DataT> T extractMessageForTopic(ResponseT message, WebsocketTopic<? extends T> topic);
}
