package com.robinhood.android.api.creditcard;

import com.robinhood.android.api.creditcard.interceptors.AddX1ClientHeaderInterceptor;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* compiled from: CreditCardApiModule_ProvideXsellRetrofitFactory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fBD\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0011\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/api/creditcard/CreditCardApiModule_ProvideXsellRetrofitFactory;", "Ldagger/internal/Factory;", "Lretrofit2/Retrofit;", "retrofit", "Ljavax/inject/Provider;", "okHttpClient", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "requestHeaderInterceptor", "Lcom/robinhood/android/api/creditcard/interceptors/AddX1ClientHeaderInterceptor;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CreditCardApiModule_ProvideXsellRetrofitFactory implements Factory<Retrofit> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Endpoint> endpoint;
    private final Provider<OkHttpClient> okHttpClient;
    private final Provider<AddX1ClientHeaderInterceptor> requestHeaderInterceptor;
    private final Provider<Retrofit> retrofit;

    @JvmStatic
    public static final CreditCardApiModule_ProvideXsellRetrofitFactory create(Provider<Retrofit> provider, Provider<OkHttpClient> provider2, Provider<AddX1ClientHeaderInterceptor> provider3, Provider<Endpoint> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final Retrofit provideXsellRetrofit(Retrofit retrofit, Lazy<OkHttpClient> lazy, AddX1ClientHeaderInterceptor addX1ClientHeaderInterceptor, Endpoint endpoint) {
        return INSTANCE.provideXsellRetrofit(retrofit, lazy, addX1ClientHeaderInterceptor, endpoint);
    }

    public CreditCardApiModule_ProvideXsellRetrofitFactory(Provider<Retrofit> retrofit, Provider<OkHttpClient> okHttpClient, Provider<AddX1ClientHeaderInterceptor> requestHeaderInterceptor, Provider<Endpoint> endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(requestHeaderInterceptor, "requestHeaderInterceptor");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.retrofit = retrofit;
        this.okHttpClient = okHttpClient;
        this.requestHeaderInterceptor = requestHeaderInterceptor;
        this.endpoint = endpoint;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        Companion companion = INSTANCE;
        Retrofit retrofit = this.retrofit.get();
        Intrinsics.checkNotNullExpressionValue(retrofit, "get(...)");
        Lazy<OkHttpClient> lazy = DoubleCheck.lazy(this.okHttpClient);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        AddX1ClientHeaderInterceptor addX1ClientHeaderInterceptor = this.requestHeaderInterceptor.get();
        Intrinsics.checkNotNullExpressionValue(addX1ClientHeaderInterceptor, "get(...)");
        Endpoint endpoint = this.endpoint.get();
        Intrinsics.checkNotNullExpressionValue(endpoint, "get(...)");
        return companion.provideXsellRetrofit(retrofit, lazy, addX1ClientHeaderInterceptor, endpoint);
    }

    /* compiled from: CreditCardApiModule_ProvideXsellRetrofitFactory.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H\u0007J3\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/api/creditcard/CreditCardApiModule_ProvideXsellRetrofitFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/api/creditcard/CreditCardApiModule_ProvideXsellRetrofitFactory;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "okHttpClient", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "requestHeaderInterceptor", "Lcom/robinhood/android/api/creditcard/interceptors/AddX1ClientHeaderInterceptor;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "provideXsellRetrofit", "Ldagger/Lazy;", "lib-api-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CreditCardApiModule_ProvideXsellRetrofitFactory create(Provider<Retrofit> retrofit, Provider<OkHttpClient> okHttpClient, Provider<AddX1ClientHeaderInterceptor> requestHeaderInterceptor, Provider<Endpoint> endpoint) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(requestHeaderInterceptor, "requestHeaderInterceptor");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            return new CreditCardApiModule_ProvideXsellRetrofitFactory(retrofit, okHttpClient, requestHeaderInterceptor, endpoint);
        }

        @JvmStatic
        public final Retrofit provideXsellRetrofit(Retrofit retrofit, Lazy<OkHttpClient> okHttpClient, AddX1ClientHeaderInterceptor requestHeaderInterceptor, Endpoint endpoint) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(requestHeaderInterceptor, "requestHeaderInterceptor");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Object objCheckNotNull = Preconditions.checkNotNull(CreditCardApiModule.INSTANCE.provideXsellRetrofit(retrofit, okHttpClient, requestHeaderInterceptor, endpoint), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Retrofit) objCheckNotNull;
        }
    }
}
