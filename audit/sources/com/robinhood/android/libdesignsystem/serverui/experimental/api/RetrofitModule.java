package com.robinhood.android.libdesignsystem.serverui.experimental.api;

import com.robinhood.api.annotation.BrokebackRetrofit;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: RetrofitModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0012\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/api/RetrofitModule;", "", "<init>", "()V", "providePaginatedListPageApi", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/api/PaginatedListPageApi;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "providePaginatedListPageRetrofit", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class RetrofitModule {
    public static final int $stable = 0;
    public static final RetrofitModule INSTANCE = new RetrofitModule();

    private RetrofitModule() {
    }

    @PaginatedListPageRetrofit
    public final Retrofit providePaginatedListPageRetrofit(@BrokebackRetrofit Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl("https://127.0.0.1/");
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    public final PaginatedListPageApi providePaginatedListPageApi(@PaginatedListPageRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (PaginatedListPageApi) LazyRetrofit3.create(retrofit, PaginatedListPageApi.class);
    }
}
