package com.robinhood.websocket.utils;

import com.robinhood.websocket.api.WebsocketTopic;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;

/* compiled from: DataFlowManager.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J(\u0010\u0003\u001a\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/websocket/utils/DataFlowSubscriptionListener;", "DataT", "", "onSubscribedChanged", "", "T", WebsocketGatewayConstants.TOPIC_KEY, "Lcom/robinhood/websocket/api/WebsocketTopic;", "subscribed", "", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.websocket.utils.DataFlowSubscriptionListener, reason: use source file name */
/* loaded from: classes12.dex */
public interface DataFlowManager5<DataT> {
    <T extends DataT> void onSubscribedChanged(WebsocketTopic<? extends T> topic, boolean subscribed);
}
