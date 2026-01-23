package com.robinhood.websocket.api;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: WebsocketSource.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0001\u0010\u0005*\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/websocket/api/WebsocketSource;", "DataT", "", "stream", "Lkotlinx/coroutines/flow/Flow;", "T", WebsocketGatewayConstants.TOPIC_KEY, "Lcom/robinhood/websocket/api/WebsocketTopic;", "preConnectSocket", "", "maintainConnection", "", "timeoutMs", "", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface WebsocketSource<DataT> {
    void maintainConnection(long timeoutMs);

    Flow preConnectSocket();

    <T extends DataT> Flow<T> stream(WebsocketTopic<? extends T> topic);
}
