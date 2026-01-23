package com.robinhood.trader.api;

import com.robinhood.api.annotation.BrokebackOkHttpClient;
import com.robinhood.api.annotation.BrokebackRetrofit;
import com.robinhood.idl.IdlContractProtectedInterceptor;
import com.robinhood.idl.annotation.IdlOkHttpClient;
import com.robinhood.idl.annotation.IdlRetrofit;
import com.robinhood.networking.BuildConfig;
import com.robinhood.networking.util.Retrofits;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* compiled from: IdlModule.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/trader/api/IdlModule;", "", "<init>", "()V", "provideIdlOkHttpClient", "Lokhttp3/OkHttpClient;", "okHttpClient", "idlContractProtectedInterceptor", "Lcom/robinhood/idl/IdlContractProtectedInterceptor;", "Companion", "lib-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class IdlModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: IdlModule.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/trader/api/IdlModule$Companion;", "", "<init>", "()V", "provideIdlRetrofit", "Lretrofit2/Retrofit;", "retrofit", "okHttpClient", "Ldagger/Lazy;", "Lokhttp3/OkHttpClient;", "lib-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @IdlRetrofit
        public final Retrofit provideIdlRetrofit(@BrokebackRetrofit Retrofit retrofit, @IdlOkHttpClient Lazy<OkHttpClient> okHttpClient) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
            Retrofits.client(builderNewBuilder, okHttpClient);
            Retrofit retrofitBuild = builderNewBuilder.validateEagerly(BuildConfig.DEBUG).build();
            Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
            return retrofitBuild;
        }

        private Companion() {
        }
    }

    @IdlOkHttpClient
    public final OkHttpClient provideIdlOkHttpClient(@BrokebackOkHttpClient OkHttpClient okHttpClient, IdlContractProtectedInterceptor idlContractProtectedInterceptor) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(idlContractProtectedInterceptor, "idlContractProtectedInterceptor");
        OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
        builderNewBuilder.addInterceptor(idlContractProtectedInterceptor);
        return builderNewBuilder.build();
    }
}
