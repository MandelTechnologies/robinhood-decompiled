package com.robinhood.websocket;

import com.robinhood.api.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: WebsocketConfiguration.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\bHÂ\u0003J\t\u0010#\u001a\u00020\rHÂ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\t\u0010(\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/websocket/WebsocketConfiguration;", "", "reconnectInitialDelay", "", "reconnectMaxDelay", "reconnectRetryAttempts", "", "reconnectOnClose", "", "disconnectTimeout", "dataSubscriptionTimeout", "enableLogging", "loggingTag", "", "<init>", "(JJIZJJZLjava/lang/String;)V", "getReconnectInitialDelay", "()J", "getReconnectMaxDelay", "getReconnectRetryAttempts", "()I", "getReconnectOnClose", "()Z", "getDisconnectTimeout", "getDataSubscriptionTimeout", "log", "", "msg", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WebsocketConfiguration {
    private final long dataSubscriptionTimeout;
    private final long disconnectTimeout;
    private final boolean enableLogging;
    private final String loggingTag;
    private final long reconnectInitialDelay;
    private final long reconnectMaxDelay;
    private final boolean reconnectOnClose;
    private final int reconnectRetryAttempts;

    public WebsocketConfiguration() {
        this(0L, 0L, 0, false, 0L, 0L, false, null, 255, null);
    }

    /* renamed from: component7, reason: from getter */
    private final boolean getEnableLogging() {
        return this.enableLogging;
    }

    /* renamed from: component8, reason: from getter */
    private final String getLoggingTag() {
        return this.loggingTag;
    }

    public static /* synthetic */ WebsocketConfiguration copy$default(WebsocketConfiguration websocketConfiguration, long j, long j2, int i, boolean z, long j3, long j4, boolean z2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = websocketConfiguration.reconnectInitialDelay;
        }
        return websocketConfiguration.copy(j, (i2 & 2) != 0 ? websocketConfiguration.reconnectMaxDelay : j2, (i2 & 4) != 0 ? websocketConfiguration.reconnectRetryAttempts : i, (i2 & 8) != 0 ? websocketConfiguration.reconnectOnClose : z, (i2 & 16) != 0 ? websocketConfiguration.disconnectTimeout : j3, (i2 & 32) != 0 ? websocketConfiguration.dataSubscriptionTimeout : j4, (i2 & 64) != 0 ? websocketConfiguration.enableLogging : z2, (i2 & 128) != 0 ? websocketConfiguration.loggingTag : str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getReconnectInitialDelay() {
        return this.reconnectInitialDelay;
    }

    /* renamed from: component2, reason: from getter */
    public final long getReconnectMaxDelay() {
        return this.reconnectMaxDelay;
    }

    /* renamed from: component3, reason: from getter */
    public final int getReconnectRetryAttempts() {
        return this.reconnectRetryAttempts;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getReconnectOnClose() {
        return this.reconnectOnClose;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDisconnectTimeout() {
        return this.disconnectTimeout;
    }

    /* renamed from: component6, reason: from getter */
    public final long getDataSubscriptionTimeout() {
        return this.dataSubscriptionTimeout;
    }

    public final WebsocketConfiguration copy(long reconnectInitialDelay, long reconnectMaxDelay, int reconnectRetryAttempts, boolean reconnectOnClose, long disconnectTimeout, long dataSubscriptionTimeout, boolean enableLogging, String loggingTag) {
        Intrinsics.checkNotNullParameter(loggingTag, "loggingTag");
        return new WebsocketConfiguration(reconnectInitialDelay, reconnectMaxDelay, reconnectRetryAttempts, reconnectOnClose, disconnectTimeout, dataSubscriptionTimeout, enableLogging, loggingTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebsocketConfiguration)) {
            return false;
        }
        WebsocketConfiguration websocketConfiguration = (WebsocketConfiguration) other;
        return this.reconnectInitialDelay == websocketConfiguration.reconnectInitialDelay && this.reconnectMaxDelay == websocketConfiguration.reconnectMaxDelay && this.reconnectRetryAttempts == websocketConfiguration.reconnectRetryAttempts && this.reconnectOnClose == websocketConfiguration.reconnectOnClose && this.disconnectTimeout == websocketConfiguration.disconnectTimeout && this.dataSubscriptionTimeout == websocketConfiguration.dataSubscriptionTimeout && this.enableLogging == websocketConfiguration.enableLogging && Intrinsics.areEqual(this.loggingTag, websocketConfiguration.loggingTag);
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.reconnectInitialDelay) * 31) + Long.hashCode(this.reconnectMaxDelay)) * 31) + Integer.hashCode(this.reconnectRetryAttempts)) * 31) + Boolean.hashCode(this.reconnectOnClose)) * 31) + Long.hashCode(this.disconnectTimeout)) * 31) + Long.hashCode(this.dataSubscriptionTimeout)) * 31) + Boolean.hashCode(this.enableLogging)) * 31) + this.loggingTag.hashCode();
    }

    public String toString() {
        return "WebsocketConfiguration(reconnectInitialDelay=" + this.reconnectInitialDelay + ", reconnectMaxDelay=" + this.reconnectMaxDelay + ", reconnectRetryAttempts=" + this.reconnectRetryAttempts + ", reconnectOnClose=" + this.reconnectOnClose + ", disconnectTimeout=" + this.disconnectTimeout + ", dataSubscriptionTimeout=" + this.dataSubscriptionTimeout + ", enableLogging=" + this.enableLogging + ", loggingTag=" + this.loggingTag + ")";
    }

    public WebsocketConfiguration(long j, long j2, int i, boolean z, long j3, long j4, boolean z2, String loggingTag) {
        Intrinsics.checkNotNullParameter(loggingTag, "loggingTag");
        this.reconnectInitialDelay = j;
        this.reconnectMaxDelay = j2;
        this.reconnectRetryAttempts = i;
        this.reconnectOnClose = z;
        this.disconnectTimeout = j3;
        this.dataSubscriptionTimeout = j4;
        this.enableLogging = z2;
        this.loggingTag = loggingTag;
    }

    public final long getReconnectInitialDelay() {
        return this.reconnectInitialDelay;
    }

    public final long getReconnectMaxDelay() {
        return this.reconnectMaxDelay;
    }

    public final int getReconnectRetryAttempts() {
        return this.reconnectRetryAttempts;
    }

    public final boolean getReconnectOnClose() {
        return this.reconnectOnClose;
    }

    public final long getDisconnectTimeout() {
        return this.disconnectTimeout;
    }

    public final long getDataSubscriptionTimeout() {
        return this.dataSubscriptionTimeout;
    }

    public /* synthetic */ WebsocketConfiguration(long j, long j2, int i, boolean z, long j3, long j4, boolean z2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1000L : j, (i2 & 2) != 0 ? 30000L : j2, (i2 & 4) != 0 ? 10 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 5000L : j3, (i2 & 32) == 0 ? j4 : 5000L, (i2 & 64) == 0 ? z2 : false, (i2 & 128) != 0 ? "RH websocket" : str);
    }

    public final void log(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (this.enableLogging && BuildConfig.DEBUG) {
            Timber.INSTANCE.mo3356i("[" + this.loggingTag + "] " + msg, new Object[0]);
        }
    }
}
