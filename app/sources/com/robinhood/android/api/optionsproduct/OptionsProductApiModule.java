package com.robinhood.android.api.optionsproduct;

import com.robinhood.android.api.optionsproduct.annotations.OptionsProductRetrofit;
import com.robinhood.api.annotation.BrokebackRetrofit;
import com.robinhood.networking.BuildConfig;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: OptionsProductApiModule.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/api/optionsproduct/OptionsProductApiModule;", "", "<init>", "()V", "provideOptionsProductRetrofit", "Lretrofit2/Retrofit;", "retrofit", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "provideOptionsProduct", "Lcom/robinhood/android/api/optionsproduct/OptionsProduct;", "Ldagger/Lazy;", "lib-api-options-product_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class OptionsProductApiModule {
    public static final OptionsProductApiModule INSTANCE = new OptionsProductApiModule();

    @OptionsProductRetrofit
    public final Retrofit provideOptionsProductRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getOptionsProductUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(BuildConfig.DEBUG).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    private OptionsProductApiModule() {
    }

    public final OptionsProduct provideOptionsProduct(@OptionsProductRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (OptionsProduct) LazyRetrofit3.create(retrofit, OptionsProduct.class);
    }
}
