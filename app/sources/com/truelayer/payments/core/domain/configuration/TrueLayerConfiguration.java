package com.truelayer.payments.core.domain.configuration;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: TrueLayerConfiguration.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/configuration/TrueLayerConfiguration;", "", "environment", "Lcom/truelayer/payments/core/domain/configuration/Environment;", "httpConfig", "Lcom/truelayer/payments/core/domain/configuration/HttpConnectionConfiguration;", "paymentsApiUri", "Lokhttp3/HttpUrl;", "paymentsExperienceApiUri", "(Lcom/truelayer/payments/core/domain/configuration/Environment;Lcom/truelayer/payments/core/domain/configuration/HttpConnectionConfiguration;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)V", "getEnvironment", "()Lcom/truelayer/payments/core/domain/configuration/Environment;", "getHttpConfig", "()Lcom/truelayer/payments/core/domain/configuration/HttpConnectionConfiguration;", "getPaymentsApiUri", "()Lokhttp3/HttpUrl;", "getPaymentsExperienceApiUri", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TrueLayerConfiguration {
    private final Environment environment;
    private final HttpConnectionConfiguration httpConfig;
    private final HttpUrl paymentsApiUri;
    private final HttpUrl paymentsExperienceApiUri;

    public TrueLayerConfiguration() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TrueLayerConfiguration copy$default(TrueLayerConfiguration trueLayerConfiguration, Environment environment, HttpConnectionConfiguration httpConnectionConfiguration, HttpUrl httpUrl, HttpUrl httpUrl2, int i, Object obj) {
        if ((i & 1) != 0) {
            environment = trueLayerConfiguration.environment;
        }
        if ((i & 2) != 0) {
            httpConnectionConfiguration = trueLayerConfiguration.httpConfig;
        }
        if ((i & 4) != 0) {
            httpUrl = trueLayerConfiguration.paymentsApiUri;
        }
        if ((i & 8) != 0) {
            httpUrl2 = trueLayerConfiguration.paymentsExperienceApiUri;
        }
        return trueLayerConfiguration.copy(environment, httpConnectionConfiguration, httpUrl, httpUrl2);
    }

    /* renamed from: component1, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    /* renamed from: component2, reason: from getter */
    public final HttpConnectionConfiguration getHttpConfig() {
        return this.httpConfig;
    }

    /* renamed from: component3, reason: from getter */
    public final HttpUrl getPaymentsApiUri() {
        return this.paymentsApiUri;
    }

    /* renamed from: component4, reason: from getter */
    public final HttpUrl getPaymentsExperienceApiUri() {
        return this.paymentsExperienceApiUri;
    }

    public final TrueLayerConfiguration copy(Environment environment, HttpConnectionConfiguration httpConfig, HttpUrl paymentsApiUri, HttpUrl paymentsExperienceApiUri) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(httpConfig, "httpConfig");
        return new TrueLayerConfiguration(environment, httpConfig, paymentsApiUri, paymentsExperienceApiUri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrueLayerConfiguration)) {
            return false;
        }
        TrueLayerConfiguration trueLayerConfiguration = (TrueLayerConfiguration) other;
        return this.environment == trueLayerConfiguration.environment && Intrinsics.areEqual(this.httpConfig, trueLayerConfiguration.httpConfig) && Intrinsics.areEqual(this.paymentsApiUri, trueLayerConfiguration.paymentsApiUri) && Intrinsics.areEqual(this.paymentsExperienceApiUri, trueLayerConfiguration.paymentsExperienceApiUri);
    }

    public int hashCode() {
        int iHashCode = ((this.environment.hashCode() * 31) + this.httpConfig.hashCode()) * 31;
        HttpUrl httpUrl = this.paymentsApiUri;
        int iHashCode2 = (iHashCode + (httpUrl == null ? 0 : httpUrl.hashCode())) * 31;
        HttpUrl httpUrl2 = this.paymentsExperienceApiUri;
        return iHashCode2 + (httpUrl2 != null ? httpUrl2.hashCode() : 0);
    }

    public String toString() {
        return "TrueLayerConfiguration(environment=" + this.environment + ", httpConfig=" + this.httpConfig + ", paymentsApiUri=" + this.paymentsApiUri + ", paymentsExperienceApiUri=" + this.paymentsExperienceApiUri + ")";
    }

    public TrueLayerConfiguration(Environment environment, HttpConnectionConfiguration httpConfig, HttpUrl httpUrl, HttpUrl httpUrl2) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(httpConfig, "httpConfig");
        this.environment = environment;
        this.httpConfig = httpConfig;
        this.paymentsApiUri = httpUrl;
        this.paymentsExperienceApiUri = httpUrl2;
    }

    public /* synthetic */ TrueLayerConfiguration(Environment environment, HttpConnectionConfiguration httpConnectionConfiguration, HttpUrl httpUrl, HttpUrl httpUrl2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Environment.PRODUCTION : environment, (i & 2) != 0 ? new HttpConnectionConfiguration(0L, null, 3, null) : httpConnectionConfiguration, (i & 4) != 0 ? null : httpUrl, (i & 8) != 0 ? null : httpUrl2);
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final HttpConnectionConfiguration getHttpConfig() {
        return this.httpConfig;
    }

    public final HttpUrl getPaymentsApiUri() {
        return this.paymentsApiUri;
    }

    public final HttpUrl getPaymentsExperienceApiUri() {
        return this.paymentsExperienceApiUri;
    }
}
