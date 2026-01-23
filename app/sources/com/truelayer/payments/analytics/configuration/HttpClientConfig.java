package com.truelayer.payments.analytics.configuration;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpClientConfig.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/truelayer/payments/analytics/configuration/HttpClientConfig;", "", "connectionTimeoutMillis", "", "headers", "", "Lcom/truelayer/payments/analytics/configuration/HttpHeader;", "enableDebugLogging", "", "(JLjava/util/List;Z)V", "getConnectionTimeoutMillis", "()J", "getEnableDebugLogging", "()Z", "getHeaders", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
final /* data */ class HttpClientConfig {
    private final long connectionTimeoutMillis;
    private final boolean enableDebugLogging;
    private final List<HttpHeader> headers;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpClientConfig copy$default(HttpClientConfig httpClientConfig, long j, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = httpClientConfig.connectionTimeoutMillis;
        }
        if ((i & 2) != 0) {
            list = httpClientConfig.headers;
        }
        if ((i & 4) != 0) {
            z = httpClientConfig.enableDebugLogging;
        }
        return httpClientConfig.copy(j, list, z);
    }

    /* renamed from: component1, reason: from getter */
    public final long getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public final List<HttpHeader> component2() {
        return this.headers;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnableDebugLogging() {
        return this.enableDebugLogging;
    }

    public final HttpClientConfig copy(long connectionTimeoutMillis, List<HttpHeader> headers, boolean enableDebugLogging) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new HttpClientConfig(connectionTimeoutMillis, headers, enableDebugLogging);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpClientConfig)) {
            return false;
        }
        HttpClientConfig httpClientConfig = (HttpClientConfig) other;
        return this.connectionTimeoutMillis == httpClientConfig.connectionTimeoutMillis && Intrinsics.areEqual(this.headers, httpClientConfig.headers) && this.enableDebugLogging == httpClientConfig.enableDebugLogging;
    }

    public int hashCode() {
        return (((Long.hashCode(this.connectionTimeoutMillis) * 31) + this.headers.hashCode()) * 31) + Boolean.hashCode(this.enableDebugLogging);
    }

    public String toString() {
        return "HttpClientConfig(connectionTimeoutMillis=" + this.connectionTimeoutMillis + ", headers=" + this.headers + ", enableDebugLogging=" + this.enableDebugLogging + ")";
    }

    public HttpClientConfig(long j, List<HttpHeader> headers, boolean z) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.connectionTimeoutMillis = j;
        this.headers = headers;
        this.enableDebugLogging = z;
    }

    public /* synthetic */ HttpClientConfig(long j, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, (i & 4) != 0 ? true : z);
    }

    public final long getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public final List<HttpHeader> getHeaders() {
        return this.headers;
    }

    public final boolean getEnableDebugLogging() {
        return this.enableDebugLogging;
    }
}
