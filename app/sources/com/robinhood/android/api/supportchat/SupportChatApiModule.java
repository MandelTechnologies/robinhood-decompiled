package com.robinhood.android.api.supportchat;

import com.robinhood.api.annotation.BrokebackOkHttpClient;
import com.robinhood.api.annotation.BrokebackRetrofit;
import com.robinhood.api.annotation.SupportChatApiRetrofit;
import com.robinhood.networking.BuildConfig;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* compiled from: SupportChatApiModule.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/api/supportchat/SupportChatApiModule;", "", "<init>", "()V", "providePathfinderRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "Ldagger/Lazy;", "Lokhttp3/OkHttpClient;", "retrofit", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "provideSupportChatApi", "Lcom/robinhood/android/api/supportchat/SupportChatApi;", "lib-api-supportchat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SupportChatApiModule {
    public static final SupportChatApiModule INSTANCE = new SupportChatApiModule();

    @SupportChatApiRetrofit
    public final Retrofit providePathfinderRetrofit(@BrokebackOkHttpClient Lazy<OkHttpClient> okHttpClient, @BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.client(okHttpClient.get().newBuilder().build());
        builderNewBuilder.baseUrl(endpoint.getPathfinderUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(BuildConfig.DEBUG).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    private SupportChatApiModule() {
    }

    public final SupportChatApi provideSupportChatApi(@SupportChatApiRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (SupportChatApi) LazyRetrofit3.create(retrofit, SupportChatApi.class);
    }
}
