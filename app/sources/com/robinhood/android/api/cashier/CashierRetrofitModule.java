package com.robinhood.android.api.cashier;

import com.robinhood.api.annotation.BrokebackRetrofit;
import com.robinhood.api.annotation.CashierRetrofit;
import com.robinhood.networking.BuildConfig;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: CashierRetrofitModule.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0006\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/api/cashier/CashierRetrofitModule;", "", "<init>", "()V", "provideCashier", "Lcom/robinhood/android/api/cashier/Cashier;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "provideCashierRetrofit", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "lib-api-cashier_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class CashierRetrofitModule {
    @CashierRetrofit
    public final Retrofit provideCashierRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getCashierUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(BuildConfig.DEBUG).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    public final Cashier provideCashier(@CashierRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (Cashier) LazyRetrofit3.create(retrofit, Cashier.class);
    }
}
