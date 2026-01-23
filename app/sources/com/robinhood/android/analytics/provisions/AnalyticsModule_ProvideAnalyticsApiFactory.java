package com.robinhood.android.analytics.provisions;

import com.robinhood.analytics.api.TraderAnalyticsApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.networking.OkHttpClientFactory;
import com.robinhood.networking.interceptor.GzipRequestInterceptor;
import com.robinhood.targetbackend.Endpoint;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

/* compiled from: AnalyticsModule_ProvideAnalyticsApiFactory.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010BI\u0012\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0019\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/analytics/provisions/AnalyticsModule_ProvideAnalyticsApiFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/api/TraderAnalyticsApi;", "endpoint", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/Endpoint;", "Lkotlin/jvm/JvmSuppressWildcards;", "clientFactory", "Lcom/robinhood/networking/OkHttpClientFactory;", "rhInterceptor", "Lokhttp3/Interceptor;", "gzipRequestInterceptor", "Lcom/robinhood/networking/interceptor/GzipRequestInterceptor;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AnalyticsModule_ProvideAnalyticsApiFactory implements Factory<TraderAnalyticsApi> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<OkHttpClientFactory> clientFactory;
    private final Provider<Endpoint> endpoint;
    private final Provider<GzipRequestInterceptor> gzipRequestInterceptor;
    private final Provider<Interceptor> rhInterceptor;

    @JvmStatic
    public static final AnalyticsModule_ProvideAnalyticsApiFactory create(Provider<Endpoint> provider, Provider<OkHttpClientFactory> provider2, Provider<Interceptor> provider3, Provider<GzipRequestInterceptor> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final TraderAnalyticsApi provideAnalyticsApi(Lazy<Endpoint> lazy, OkHttpClientFactory okHttpClientFactory, Lazy<Interceptor> lazy2, GzipRequestInterceptor gzipRequestInterceptor) {
        return INSTANCE.provideAnalyticsApi(lazy, okHttpClientFactory, lazy2, gzipRequestInterceptor);
    }

    public AnalyticsModule_ProvideAnalyticsApiFactory(Provider<Endpoint> endpoint, Provider<OkHttpClientFactory> clientFactory, Provider<Interceptor> rhInterceptor, Provider<GzipRequestInterceptor> gzipRequestInterceptor) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(clientFactory, "clientFactory");
        Intrinsics.checkNotNullParameter(rhInterceptor, "rhInterceptor");
        Intrinsics.checkNotNullParameter(gzipRequestInterceptor, "gzipRequestInterceptor");
        this.endpoint = endpoint;
        this.clientFactory = clientFactory;
        this.rhInterceptor = rhInterceptor;
        this.gzipRequestInterceptor = gzipRequestInterceptor;
    }

    @Override // javax.inject.Provider
    public TraderAnalyticsApi get() {
        Companion companion = INSTANCE;
        Lazy<Endpoint> lazy = DoubleCheck.lazy(this.endpoint);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        OkHttpClientFactory okHttpClientFactory = this.clientFactory.get();
        Intrinsics.checkNotNullExpressionValue(okHttpClientFactory, "get(...)");
        Lazy<Interceptor> lazy2 = DoubleCheck.lazy(this.rhInterceptor);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        GzipRequestInterceptor gzipRequestInterceptor = this.gzipRequestInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(gzipRequestInterceptor, "get(...)");
        return companion.provideAnalyticsApi(lazy, okHttpClientFactory, lazy2, gzipRequestInterceptor);
    }

    /* compiled from: AnalyticsModule_ProvideAnalyticsApiFactory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\t0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H\u0007J>\u0010\u0010\u001a\u00020\u00112\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\t0\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/analytics/provisions/AnalyticsModule_ProvideAnalyticsApiFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/analytics/provisions/AnalyticsModule_ProvideAnalyticsApiFactory;", "endpoint", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/Endpoint;", "Lkotlin/jvm/JvmSuppressWildcards;", "clientFactory", "Lcom/robinhood/networking/OkHttpClientFactory;", "rhInterceptor", "Lokhttp3/Interceptor;", "gzipRequestInterceptor", "Lcom/robinhood/networking/interceptor/GzipRequestInterceptor;", "provideAnalyticsApi", "Lcom/robinhood/analytics/api/TraderAnalyticsApi;", "Ldagger/Lazy;", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AnalyticsModule_ProvideAnalyticsApiFactory create(Provider<Endpoint> endpoint, Provider<OkHttpClientFactory> clientFactory, Provider<Interceptor> rhInterceptor, Provider<GzipRequestInterceptor> gzipRequestInterceptor) {
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(clientFactory, "clientFactory");
            Intrinsics.checkNotNullParameter(rhInterceptor, "rhInterceptor");
            Intrinsics.checkNotNullParameter(gzipRequestInterceptor, "gzipRequestInterceptor");
            return new AnalyticsModule_ProvideAnalyticsApiFactory(endpoint, clientFactory, rhInterceptor, gzipRequestInterceptor);
        }

        @JvmStatic
        public final TraderAnalyticsApi provideAnalyticsApi(Lazy<Endpoint> endpoint, OkHttpClientFactory clientFactory, Lazy<Interceptor> rhInterceptor, GzipRequestInterceptor gzipRequestInterceptor) {
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(clientFactory, "clientFactory");
            Intrinsics.checkNotNullParameter(rhInterceptor, "rhInterceptor");
            Intrinsics.checkNotNullParameter(gzipRequestInterceptor, "gzipRequestInterceptor");
            Object objCheckNotNull = Preconditions.checkNotNull(AnalyticsModule.INSTANCE.provideAnalyticsApi(endpoint, clientFactory, rhInterceptor, gzipRequestInterceptor), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (TraderAnalyticsApi) objCheckNotNull;
        }
    }
}
