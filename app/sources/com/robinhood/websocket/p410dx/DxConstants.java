package com.robinhood.websocket.p410dx;

import com.robinhood.utils.android.BuildConfig;
import com.robinhood.websocket.WebsocketConfiguration;
import kotlin.Metadata;

/* compiled from: DxConstants.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006'"}, m3636d2 = {"Lcom/robinhood/websocket/dx/DxConstants;", "", "<init>", "()V", "ENABLE_LOGGING", "", "getENABLE_LOGGING", "()Z", "LOGGING_TAG", "", "MARKETDATA_SESSION_TYPE", "DISCONNECT_DELAY_TIME_MS", "", "MAX_RETRY_TIMES", "", "RECONNECT_INITIAL_DELAY_IN_MS", "RECONNECT_MAX_DELAY_IN_MS", "SOCKET_VERSION_PREFIX", "SOCKET_TIMEOUT_IN_S", "REMOVE_SUBSCRIPTION_TIMEOUT_IN_MS", "WEB_SOCKET_MAIN_CHANNEL", "FEED_SUBSCRIPTION_CHANNEL", "FEED_SERVICE", "FEED_DATA_FORMAT", "FEED_CONTRACT_TYPE", "FEED_AGGREGATE_PERIOD", "", "DOM_SUBSCRIPTION_START_CHANNEL", "DOM_SUBSCRIPTION_CHANNEL_INTERVAL", "DOM_SERVICE", "DOM_SOURCE_FOR_FUTURES", "DOM_SOURCE_FOR_CRYPTO", "DOM_DEPTH_LIMIT", "DOM_DATA_FORMAT", "DOM_AGGREGATE_PERIOD", "CONFIGURATION", "Lcom/robinhood/websocket/WebsocketConfiguration;", "getCONFIGURATION", "()Lcom/robinhood/websocket/WebsocketConfiguration;", "lib-websocket-dx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DxConstants {
    private static final WebsocketConfiguration CONFIGURATION;
    public static final long DISCONNECT_DELAY_TIME_MS = 3000;
    public static final float DOM_AGGREGATE_PERIOD = 0.25f;
    public static final String DOM_DATA_FORMAT = "FULL";
    public static final int DOM_DEPTH_LIMIT = 10;
    public static final String DOM_SERVICE = "DOM";
    public static final String DOM_SOURCE_FOR_CRYPTO = "AGGREGATE";
    public static final String DOM_SOURCE_FOR_FUTURES = "glbx";
    public static final int DOM_SUBSCRIPTION_CHANNEL_INTERVAL = 2;
    public static final int DOM_SUBSCRIPTION_START_CHANNEL = 3;
    private static final boolean ENABLE_LOGGING;
    public static final float FEED_AGGREGATE_PERIOD = 0.25f;
    public static final String FEED_CONTRACT_TYPE = "AUTO";
    public static final String FEED_DATA_FORMAT = "FULL";
    public static final String FEED_SERVICE = "FEED";
    public static final int FEED_SUBSCRIPTION_CHANNEL = 1;
    public static final DxConstants INSTANCE = new DxConstants();
    public static final String LOGGING_TAG = "DX websocket";
    public static final String MARKETDATA_SESSION_TYPE = "futures";
    public static final int MAX_RETRY_TIMES = 10;
    public static final long RECONNECT_INITIAL_DELAY_IN_MS = 1000;
    public static final long RECONNECT_MAX_DELAY_IN_MS = 30000;
    public static final long REMOVE_SUBSCRIPTION_TIMEOUT_IN_MS = 5000;
    public static final int SOCKET_TIMEOUT_IN_S = 60;
    public static final String SOCKET_VERSION_PREFIX = "1.0-RH-Android/";
    public static final int WEB_SOCKET_MAIN_CHANNEL = 0;

    private DxConstants() {
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
}
