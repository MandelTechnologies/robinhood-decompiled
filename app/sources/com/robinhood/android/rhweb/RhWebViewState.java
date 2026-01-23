package com.robinhood.android.rhweb;

import com.robinhood.android.lib.webview.data.WebConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import p479j$.time.Duration;

/* compiled from: RhWebViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\"\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0014¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebViewState;", "", "Lokhttp3/HttpUrl;", "url", "Lcom/robinhood/android/lib/webview/data/WebConfig;", "webConfig", "j$/time/Duration", "loadingFallbackTimeout", "<init>", "(Lokhttp3/HttpUrl;Lcom/robinhood/android/lib/webview/data/WebConfig;Lj$/time/Duration;)V", "component1", "()Lokhttp3/HttpUrl;", "component2", "()Lcom/robinhood/android/lib/webview/data/WebConfig;", "component3", "()Lj$/time/Duration;", "copy", "(Lokhttp3/HttpUrl;Lcom/robinhood/android/lib/webview/data/WebConfig;Lj$/time/Duration;)Lcom/robinhood/android/rhweb/RhWebViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lokhttp3/HttpUrl;", "getUrl", "Lcom/robinhood/android/lib/webview/data/WebConfig;", "getWebConfig", "Lj$/time/Duration;", "getLoadingFallbackTimeout", "userAgentSuffix", "Ljava/lang/String;", "getUserAgentSuffix", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhWebViewState {
    private final Duration loadingFallbackTimeout;
    private final HttpUrl url;
    private final String userAgentSuffix;
    private final WebConfig webConfig;

    public static /* synthetic */ RhWebViewState copy$default(RhWebViewState rhWebViewState, HttpUrl httpUrl, WebConfig webConfig, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            httpUrl = rhWebViewState.url;
        }
        if ((i & 2) != 0) {
            webConfig = rhWebViewState.webConfig;
        }
        if ((i & 4) != 0) {
            duration = rhWebViewState.loadingFallbackTimeout;
        }
        return rhWebViewState.copy(httpUrl, webConfig, duration);
    }

    /* renamed from: component1, reason: from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final WebConfig getWebConfig() {
        return this.webConfig;
    }

    /* renamed from: component3, reason: from getter */
    public final Duration getLoadingFallbackTimeout() {
        return this.loadingFallbackTimeout;
    }

    public final RhWebViewState copy(HttpUrl url, WebConfig webConfig, Duration loadingFallbackTimeout) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(webConfig, "webConfig");
        return new RhWebViewState(url, webConfig, loadingFallbackTimeout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhWebViewState)) {
            return false;
        }
        RhWebViewState rhWebViewState = (RhWebViewState) other;
        return Intrinsics.areEqual(this.url, rhWebViewState.url) && Intrinsics.areEqual(this.webConfig, rhWebViewState.webConfig) && Intrinsics.areEqual(this.loadingFallbackTimeout, rhWebViewState.loadingFallbackTimeout);
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + this.webConfig.hashCode()) * 31;
        Duration duration = this.loadingFallbackTimeout;
        return iHashCode + (duration == null ? 0 : duration.hashCode());
    }

    public String toString() {
        return "RhWebViewState(url=" + this.url + ", webConfig=" + this.webConfig + ", loadingFallbackTimeout=" + this.loadingFallbackTimeout + ")";
    }

    public RhWebViewState(HttpUrl url, WebConfig webConfig, Duration duration) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(webConfig, "webConfig");
        this.url = url;
        this.webConfig = webConfig;
        this.loadingFallbackTimeout = duration;
        this.userAgentSuffix = "rhwebview/" + webConfig.getAppVersionString();
    }

    public /* synthetic */ RhWebViewState(HttpUrl httpUrl, WebConfig webConfig, Duration duration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpUrl, webConfig, (i & 4) != 0 ? null : duration);
    }

    public final HttpUrl getUrl() {
        return this.url;
    }

    public final WebConfig getWebConfig() {
        return this.webConfig;
    }

    public final Duration getLoadingFallbackTimeout() {
        return this.loadingFallbackTimeout;
    }

    public final String getUserAgentSuffix() {
        return this.userAgentSuffix;
    }
}
