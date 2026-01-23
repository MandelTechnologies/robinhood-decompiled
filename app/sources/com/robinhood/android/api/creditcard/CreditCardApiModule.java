package com.robinhood.android.api.creditcard;

import com.robinhood.android.api.creditcard.annotation.CreditCardRetrofit;
import com.robinhood.android.api.creditcard.annotation.XsellRetrofit;
import com.robinhood.android.api.creditcard.interceptors.AddX1ClientHeaderInterceptor;
import com.robinhood.api.annotation.BrokebackOkHttpClient;
import com.robinhood.api.annotation.BrokebackRetrofit;
import com.robinhood.networking.BuildConfig;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* compiled from: CreditCardApiModule.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0007J2\u0010\u0010\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/api/creditcard/CreditCardApiModule;", "", "<init>", "()V", "provideCreditCardRetrofit", "Lretrofit2/Retrofit;", "retrofit", "okHttpClient", "Ldagger/Lazy;", "Lokhttp3/OkHttpClient;", "requestHeaderInterceptor", "Lcom/robinhood/android/api/creditcard/interceptors/AddX1ClientHeaderInterceptor;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "provideCreditCardApi", "Lcom/robinhood/android/api/creditcard/CreditCardApi;", "provideXsellRetrofit", "provideXsellApi", "Lcom/robinhood/android/api/creditcard/XsellApi;", "lib-api-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CreditCardApiModule {
    public static final CreditCardApiModule INSTANCE = new CreditCardApiModule();

    @CreditCardRetrofit
    public final Retrofit provideCreditCardRetrofit(@BrokebackRetrofit Retrofit retrofit, @BrokebackOkHttpClient Lazy<OkHttpClient> okHttpClient, AddX1ClientHeaderInterceptor requestHeaderInterceptor, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(requestHeaderInterceptor, "requestHeaderInterceptor");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.client(okHttpClient.get().newBuilder().addInterceptor(requestHeaderInterceptor).build());
        builderNewBuilder.baseUrl(endpoint.getCreditCardUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(BuildConfig.DEBUG).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @XsellRetrofit
    public final Retrofit provideXsellRetrofit(@BrokebackRetrofit Retrofit retrofit, @BrokebackOkHttpClient Lazy<OkHttpClient> okHttpClient, AddX1ClientHeaderInterceptor requestHeaderInterceptor, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(requestHeaderInterceptor, "requestHeaderInterceptor");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.client(okHttpClient.get().newBuilder().addInterceptor(requestHeaderInterceptor).build());
        builderNewBuilder.baseUrl(endpoint.getXsellUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(BuildConfig.DEBUG).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    private CreditCardApiModule() {
    }

    public final CreditCardApi provideCreditCardApi(@CreditCardRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (CreditCardApi) LazyRetrofit3.create(retrofit, CreditCardApi.class);
    }

    public final XsellApi provideXsellApi(@XsellRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (XsellApi) LazyRetrofit3.create(retrofit, XsellApi.class);
    }
}
