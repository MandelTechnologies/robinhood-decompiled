package com.robinhood.api.pluto;

import com.robinhood.api.annotation.BrokebackRetrofit;
import com.robinhood.api.pluto.annotations.PlutoRetrofit;
import com.robinhood.networking.BuildConfig;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: PlutoApiModule.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0006\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/api/pluto/PlutoApiModule;", "", "<init>", "()V", "providePluto", "Lcom/robinhood/api/pluto/PlutoApi;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "providePlutoRetrofit", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "lib-api-pluto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class PlutoApiModule {
    public static final PlutoApiModule INSTANCE = new PlutoApiModule();

    @PlutoRetrofit
    public final Retrofit providePlutoRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getPlutoUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(BuildConfig.DEBUG).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    private PlutoApiModule() {
    }

    public final PlutoApi providePluto(@PlutoRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (PlutoApi) LazyRetrofit3.create(retrofit, PlutoApi.class);
    }
}
