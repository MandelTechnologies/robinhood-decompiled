package com.robinhood.websocket.p413md;

import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.android.BuildConfig;
import com.robinhood.websocket.WebsocketConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MdConstants.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020!R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006&"}, m3636d2 = {"Lcom/robinhood/websocket/md/MdConstants;", "", "<init>", "()V", "ENABLE_LOGGING", "", "getENABLE_LOGGING", "()Z", "LOGGING_TAG", "", "DISCONNECT_DELAY_TIME_MS", "", "MAX_RETRY_TIMES", "", "RECONNECT_INITIAL_DELAY_IN_MS", "RECONNECT_MAX_DELAY_IN_MS", "SOCKET_VERSION_PREFIX", "SOCKET_TIMEOUT_IN_S", "SOCKET_KEEPALIVE_TIMEOUT_IN_S", "REMOVE_SUBSCRIPTION_TIMEOUT_IN_MS", "WEB_SOCKET_MAIN_CHANNEL", "FEED_SUBSCRIPTION_CHANNEL", "FEED_SERVICE", "FEED_AGGREGATE_PERIOD", "FEED_ACCEPT_DATA_FORMAT", "FEED_CONTRACT_TYPE", "AUTHORIZATION_HEADER", "CALLER_HEADER", "CALLER_VALUE", "getAuthorizationHeaderValue", "token", "getWebsocketUrl", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "CONFIGURATION", "Lcom/robinhood/websocket/WebsocketConfiguration;", "getCONFIGURATION", "()Lcom/robinhood/websocket/WebsocketConfiguration;", "lib-websocket-md_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class MdConstants {
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String CALLER_HEADER = "mdstreaming-caller-id";
    public static final String CALLER_VALUE = "android_equities_ladder";
    private static final WebsocketConfiguration CONFIGURATION;
    public static final long DISCONNECT_DELAY_TIME_MS = 3000;
    private static final boolean ENABLE_LOGGING;
    public static final String FEED_ACCEPT_DATA_FORMAT = "FULL";
    public static final int FEED_AGGREGATE_PERIOD = 10;
    public static final String FEED_CONTRACT_TYPE = "AUTO";
    public static final String FEED_SERVICE = "FEED";
    public static final int FEED_SUBSCRIPTION_CHANNEL = 1;
    public static final MdConstants INSTANCE = new MdConstants();
    public static final String LOGGING_TAG = "MD websocket";
    public static final int MAX_RETRY_TIMES = 10;
    public static final long RECONNECT_INITIAL_DELAY_IN_MS = 1000;
    public static final long RECONNECT_MAX_DELAY_IN_MS = 30000;
    public static final long REMOVE_SUBSCRIPTION_TIMEOUT_IN_MS = 5000;
    public static final int SOCKET_KEEPALIVE_TIMEOUT_IN_S = 60;
    public static final int SOCKET_TIMEOUT_IN_S = 120;
    public static final String SOCKET_VERSION_PREFIX = "1.0-RH-Android/";
    public static final int WEB_SOCKET_MAIN_CHANNEL = 0;

    private MdConstants() {
    }

    static {
        boolean z = BuildConfig.DEBUG;
        ENABLE_LOGGING = z;
        CONFIGURATION = new WebsocketConfiguration(1000L, 30000L, 10, true, 3000L, 5000L, z, LOGGING_TAG);
    }

    public final boolean getENABLE_LOGGING() {
        return ENABLE_LOGGING;
    }

    public final String getAuthorizationHeaderValue(String token) {
        return "Bearer " + token;
    }

    public final String getWebsocketUrl(TargetBackend targetBackend) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        String apolloNamespace = targetBackend.getEndpoint().getApolloNamespace();
        if (targetBackend.isApollo() && apolloNamespace != null) {
            return "wss://mdstreamingserver--" + apolloNamespace + ".apollo.rhinternal.net/feed/";
        }
        return "wss://api.robinhood.com/marketdata/streaming/";
    }

    public final WebsocketConfiguration getCONFIGURATION() {
        return CONFIGURATION;
    }
}
