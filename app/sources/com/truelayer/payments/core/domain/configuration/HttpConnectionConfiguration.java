package com.truelayer.payments.core.domain.configuration;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: HttpConnectionConfiguration.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\b\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/configuration/HttpConnectionConfiguration;", "", "timeoutMs", "", "httpDebugLoggingLevel", "Lcom/truelayer/payments/core/domain/configuration/HttpLoggingLevel;", "testingMode", "", "(JLcom/truelayer/payments/core/domain/configuration/HttpLoggingLevel;Z)V", "(JLcom/truelayer/payments/core/domain/configuration/HttpLoggingLevel;)V", "getHttpDebugLoggingLevel", "()Lcom/truelayer/payments/core/domain/configuration/HttpLoggingLevel;", "setHttpDebugLoggingLevel", "(Lcom/truelayer/payments/core/domain/configuration/HttpLoggingLevel;)V", "getTimeoutMs", "()J", "setTimeoutMs", "(J)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HttpConnectionConfiguration {
    public static final long MIN_ALLOWED_TIMEOUT_MS = 35000;
    private HttpConnectionConfiguration2 httpDebugLoggingLevel;
    private long timeoutMs;

    public HttpConnectionConfiguration() {
        this(0L, null, 3, null);
    }

    public static /* synthetic */ HttpConnectionConfiguration copy$default(HttpConnectionConfiguration httpConnectionConfiguration, long j, HttpConnectionConfiguration2 httpConnectionConfiguration2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = httpConnectionConfiguration.timeoutMs;
        }
        if ((i & 2) != 0) {
            httpConnectionConfiguration2 = httpConnectionConfiguration.httpDebugLoggingLevel;
        }
        return httpConnectionConfiguration.copy(j, httpConnectionConfiguration2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimeoutMs() {
        return this.timeoutMs;
    }

    /* renamed from: component2, reason: from getter */
    public final HttpConnectionConfiguration2 getHttpDebugLoggingLevel() {
        return this.httpDebugLoggingLevel;
    }

    public final HttpConnectionConfiguration copy(long timeoutMs, HttpConnectionConfiguration2 httpDebugLoggingLevel) {
        return new HttpConnectionConfiguration(timeoutMs, httpDebugLoggingLevel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpConnectionConfiguration)) {
            return false;
        }
        HttpConnectionConfiguration httpConnectionConfiguration = (HttpConnectionConfiguration) other;
        return this.timeoutMs == httpConnectionConfiguration.timeoutMs && this.httpDebugLoggingLevel == httpConnectionConfiguration.httpDebugLoggingLevel;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.timeoutMs) * 31;
        HttpConnectionConfiguration2 httpConnectionConfiguration2 = this.httpDebugLoggingLevel;
        return iHashCode + (httpConnectionConfiguration2 == null ? 0 : httpConnectionConfiguration2.hashCode());
    }

    public String toString() {
        return "HttpConnectionConfiguration(timeoutMs=" + this.timeoutMs + ", httpDebugLoggingLevel=" + this.httpDebugLoggingLevel + ")";
    }

    public HttpConnectionConfiguration(long j, HttpConnectionConfiguration2 httpConnectionConfiguration2) {
        this.timeoutMs = j;
        this.httpDebugLoggingLevel = httpConnectionConfiguration2;
        if (j < MIN_ALLOWED_TIMEOUT_MS) {
            this.timeoutMs = MIN_ALLOWED_TIMEOUT_MS;
        }
    }

    public final long getTimeoutMs() {
        return this.timeoutMs;
    }

    public final void setTimeoutMs(long j) {
        this.timeoutMs = j;
    }

    public /* synthetic */ HttpConnectionConfiguration(long j, HttpConnectionConfiguration2 httpConnectionConfiguration2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MIN_ALLOWED_TIMEOUT_MS : j, (i & 2) != 0 ? HttpConnectionConfiguration2.None : httpConnectionConfiguration2);
    }

    public final HttpConnectionConfiguration2 getHttpDebugLoggingLevel() {
        return this.httpDebugLoggingLevel;
    }

    public final void setHttpDebugLoggingLevel(HttpConnectionConfiguration2 httpConnectionConfiguration2) {
        this.httpDebugLoggingLevel = httpConnectionConfiguration2;
    }

    public /* synthetic */ HttpConnectionConfiguration(long j, HttpConnectionConfiguration2 httpConnectionConfiguration2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MIN_ALLOWED_TIMEOUT_MS : j, (i & 2) != 0 ? HttpConnectionConfiguration2.None : httpConnectionConfiguration2, z);
    }

    public HttpConnectionConfiguration(long j, HttpConnectionConfiguration2 httpConnectionConfiguration2, boolean z) {
        this(j, httpConnectionConfiguration2);
        if (z) {
            this.timeoutMs = j;
        }
    }
}
