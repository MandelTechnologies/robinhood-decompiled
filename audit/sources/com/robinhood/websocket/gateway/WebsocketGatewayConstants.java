package com.robinhood.websocket.gateway;

import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.android.BuildConfig;
import com.robinhood.websocket.WebsocketConfiguration;
import com.robinhood.websocket.gateway.models.WebsocketGatewayData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebsocketGatewayConstants.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001e\u001a\u00020\t\"\b\b\u0000\u0010\u001f*\u00020 2\u0006\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u001f0$J\u0010\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/websocket/gateway/WebsocketGatewayConstants;", "", "<init>", "()V", "ENABLE_LOGGING", "", "getENABLE_LOGGING", "()Z", "LOGGING_TAG", "", "CLIENT_PING_INTERVAL_MS", "", "CLIENT_IDLE_TIMEOUT_MS", "DISCONNECT_DELAY_TIME_MS", "MAX_RETRY_TIMES", "", "RECONNECT_INITIAL_DELAY_IN_MS", "RECONNECT_MAX_DELAY_IN_MS", "REMOVE_SUBSCRIPTION_TIMEOUT_IN_MS", "CONFIGURATION", "Lcom/robinhood/websocket/WebsocketConfiguration;", "getCONFIGURATION", "()Lcom/robinhood/websocket/WebsocketConfiguration;", "TOPIC_KEY", "TOPIC_FUTURES_ORDER_UPDATE", "OPCODE_KEY", "OPCODE_DATA", "OPCODE_PING", "OPCODE_PONG", "DATA_KEY", "getWebsocketUrl", "T", "Lcom/robinhood/websocket/gateway/models/WebsocketGatewayData;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", WebsocketGatewayConstants.TOPIC_KEY, "Lcom/robinhood/websocket/gateway/WebsocketGatewayTopic;", "PROTOCOL_HEADER", "getProtocolHeaderValue", "authToken", "lib-websocket-gateway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class WebsocketGatewayConstants {
    public static final long CLIENT_IDLE_TIMEOUT_MS = 20000;
    public static final long CLIENT_PING_INTERVAL_MS = 30000;
    private static final WebsocketConfiguration CONFIGURATION;
    public static final String DATA_KEY = "data";
    public static final long DISCONNECT_DELAY_TIME_MS = 3000;
    private static final boolean ENABLE_LOGGING;
    public static final WebsocketGatewayConstants INSTANCE = new WebsocketGatewayConstants();
    public static final String LOGGING_TAG = "Websocket Gateway";
    public static final int MAX_RETRY_TIMES = 10;
    public static final int OPCODE_DATA = 1;
    public static final String OPCODE_KEY = "opCode";
    public static final int OPCODE_PING = 9;
    public static final int OPCODE_PONG = 10;
    public static final String PROTOCOL_HEADER = "Sec-Websocket-Protocol";
    public static final long RECONNECT_INITIAL_DELAY_IN_MS = 1000;
    public static final long RECONNECT_MAX_DELAY_IN_MS = 30000;
    public static final long REMOVE_SUBSCRIPTION_TIMEOUT_IN_MS = 5000;
    public static final String TOPIC_FUTURES_ORDER_UPDATE = "futures_order_update";
    public static final String TOPIC_KEY = "topic";

    private WebsocketGatewayConstants() {
    }

    static {
        boolean z = BuildConfig.DEBUG;
        ENABLE_LOGGING = z;
        CONFIGURATION = new WebsocketConfiguration(1000L, 30000L, 10, false, 3000L, 5000L, z, LOGGING_TAG, 8, null);
    }

    public final boolean getENABLE_LOGGING() {
        return ENABLE_LOGGING;
    }

    public final WebsocketConfiguration getCONFIGURATION() {
        return CONFIGURATION;
    }

    public final <T extends WebsocketGatewayData> String getWebsocketUrl(TargetBackend targetBackend, WebsocketGatewayTopic<T> topic) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(topic, "topic");
        return targetBackend.getEndpoint().getWebsocketGatewayUrl().newBuilder().addPathSegments("wss/connect/").addQueryParameter(TOPIC_KEY, topic.getTopicId()).build().getUrl();
    }

    public final String getProtocolHeaderValue(String authToken) {
        return "rh-wss-web, " + authToken;
    }
}
