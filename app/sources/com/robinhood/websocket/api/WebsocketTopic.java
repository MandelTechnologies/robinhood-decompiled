package com.robinhood.websocket.api;

import kotlin.Metadata;

/* compiled from: WebsocketTopic.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/websocket/api/WebsocketTopic;", "DataT", "", "cacheLatestValue", "", "getCacheLatestValue", "()Z", "cacheTimeoutMs", "", "getCacheTimeoutMs", "()J", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface WebsocketTopic<DataT> {

    /* compiled from: WebsocketTopic.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <DataT> boolean getCacheLatestValue(WebsocketTopic<? extends DataT> websocketTopic) {
            return false;
        }

        public static <DataT> long getCacheTimeoutMs(WebsocketTopic<? extends DataT> websocketTopic) {
            return 30000L;
        }
    }

    boolean getCacheLatestValue();

    long getCacheTimeoutMs();
}
