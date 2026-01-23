package com.truelayer.payments.core.configuration;

import android.content.Context;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.truelayer.payments.core.domain.configuration.Environment;
import com.truelayer.payments.core.domain.configuration.TrueLayerConfiguration;
import com.truelayer.payments.core.domain.utils.Outcome;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: Configuration.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/core/configuration/Configuration;", "", "environment", "Lcom/truelayer/payments/core/domain/configuration/Environment;", "httpClientConfig", "Lcom/truelayer/payments/core/configuration/HttpClientConfig;", "(Lcom/truelayer/payments/core/domain/configuration/Environment;Lcom/truelayer/payments/core/configuration/HttpClientConfig;)V", "getEnvironment", "()Lcom/truelayer/payments/core/domain/configuration/Environment;", "getHttpClientConfig", "()Lcom/truelayer/payments/core/configuration/HttpClientConfig;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Configuration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Environment environment;
    private final HttpClientConfig httpClientConfig;

    public static /* synthetic */ Configuration copy$default(Configuration configuration, Environment environment, HttpClientConfig httpClientConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            environment = configuration.environment;
        }
        if ((i & 2) != 0) {
            httpClientConfig = configuration.httpClientConfig;
        }
        return configuration.copy(environment, httpClientConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    /* renamed from: component2, reason: from getter */
    public final HttpClientConfig getHttpClientConfig() {
        return this.httpClientConfig;
    }

    public final Configuration copy(Environment environment, HttpClientConfig httpClientConfig) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(httpClientConfig, "httpClientConfig");
        return new Configuration(environment, httpClientConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) other;
        return this.environment == configuration.environment && Intrinsics.areEqual(this.httpClientConfig, configuration.httpClientConfig);
    }

    public int hashCode() {
        return (this.environment.hashCode() * 31) + this.httpClientConfig.hashCode();
    }

    public String toString() {
        return "Configuration(environment=" + this.environment + ", httpClientConfig=" + this.httpClientConfig + ")";
    }

    public Configuration(Environment environment, HttpClientConfig httpClientConfig) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(httpClientConfig, "httpClientConfig");
        this.environment = environment;
        this.httpClientConfig = httpClientConfig;
    }

    public /* synthetic */ Configuration(Environment environment, HttpClientConfig httpClientConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Environment.PRODUCTION : environment, httpClientConfig);
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final HttpClientConfig getHttpClientConfig() {
        return this.httpClientConfig;
    }

    /* compiled from: Configuration.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/truelayer/payments/core/configuration/Configuration$Companion;", "", "()V", "init", "Lcom/truelayer/payments/core/configuration/Configuration;", "context", "Landroid/content/Context;", BuildFlavors.EXTERNAL, "Lcom/truelayer/payments/core/domain/configuration/TrueLayerConfiguration;", "init$payments_core_release", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Configuration init$payments_core_release(Context context, TrueLayerConfiguration external) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(external, "external");
            HttpUrl paymentsApiUri = external.getPaymentsApiUri();
            if (paymentsApiUri == null) {
                paymentsApiUri = (HttpUrl) Outcome.expect$default(Configuration5.initPaymentsUri(external.getEnvironment()), null, 1, null);
            }
            HttpUrl httpUrl = paymentsApiUri;
            HttpUrl paymentsExperienceApiUri = external.getPaymentsExperienceApiUri();
            if (paymentsExperienceApiUri == null) {
                paymentsExperienceApiUri = (HttpUrl) Outcome.expect$default(Configuration5.initPaymentsExperienceUri(external.getEnvironment()), null, 1, null);
            }
            return new Configuration(external.getEnvironment(), new HttpClientConfig(httpUrl, paymentsExperienceApiUri, Configuration5.getAppNameHeader(context), "truelayer-android-payment-sdk/3.0.1 (Android; vc:400)", external.getHttpConfig()));
        }
    }
}
