package com.robinhood.websocket.gateway;

import com.robinhood.websocket.api.WebsocketTopic;
import com.robinhood.websocket.gateway.models.WebsocketGatewayData;
import kotlin.Metadata;

/* compiled from: WebsocketGatewayTopic.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0006J\b\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0001\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/websocket/gateway/WebsocketGatewayTopic;", "T", "Lcom/robinhood/websocket/gateway/models/WebsocketGatewayData;", "Lcom/robinhood/websocket/api/WebsocketTopic;", "getTopicId", "", "FuturesOrderUpdates", "Lcom/robinhood/websocket/gateway/WebsocketGatewayTopic$FuturesOrderUpdates;", "lib-websocket-gateway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface WebsocketGatewayTopic<T extends WebsocketGatewayData> extends WebsocketTopic<T> {
    String getTopicId();

    /* compiled from: WebsocketGatewayTopic.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <T extends WebsocketGatewayData> boolean getCacheLatestValue(WebsocketGatewayTopic<T> websocketGatewayTopic) {
            return WebsocketTopic.DefaultImpls.getCacheLatestValue(websocketGatewayTopic);
        }

        public static <T extends WebsocketGatewayData> long getCacheTimeoutMs(WebsocketGatewayTopic<T> websocketGatewayTopic) {
            return WebsocketTopic.DefaultImpls.getCacheTimeoutMs(websocketGatewayTopic);
        }
    }

    /* compiled from: WebsocketGatewayTopic.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0006HÖ\u0001¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/websocket/gateway/WebsocketGatewayTopic$FuturesOrderUpdates;", "Lcom/robinhood/websocket/gateway/WebsocketGatewayTopic;", "Lcom/robinhood/websocket/gateway/models/WebsocketGatewayData$FuturesOrderUpdateData;", "<init>", "()V", "getTopicId", "", "equals", "", "other", "", "hashCode", "", "toString", "lib-websocket-gateway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FuturesOrderUpdates implements WebsocketGatewayTopic<WebsocketGatewayData.FuturesOrderUpdateData> {
        public static final FuturesOrderUpdates INSTANCE = new FuturesOrderUpdates();

        public boolean equals(Object other) {
            return this == other || (other instanceof FuturesOrderUpdates);
        }

        public int hashCode() {
            return 602787562;
        }

        public String toString() {
            return "FuturesOrderUpdates";
        }

        private FuturesOrderUpdates() {
        }

        @Override // com.robinhood.websocket.api.WebsocketTopic
        public boolean getCacheLatestValue() {
            return DefaultImpls.getCacheLatestValue(this);
        }

        @Override // com.robinhood.websocket.api.WebsocketTopic
        public long getCacheTimeoutMs() {
            return DefaultImpls.getCacheTimeoutMs(this);
        }

        @Override // com.robinhood.websocket.gateway.WebsocketGatewayTopic
        public String getTopicId() {
            return WebsocketGatewayConstants.TOPIC_FUTURES_ORDER_UPDATE;
        }
    }
}
