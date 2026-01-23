package com.robinhood.android.lib.api.futures;

import com.robinhood.api.annotation.BrokebackRetrofit;
import com.robinhood.api.annotation.ManagedMarketdataRetrofit;
import com.robinhood.api.annotation.MarketdataRetrofit;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: FuturesApiModule.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\t\u001a\u00020\n2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/lib/api/futures/FuturesApiModule;", "", "<init>", "()V", "provideFuturesBrokebackApi", "Lcom/robinhood/android/lib/api/futures/FuturesBrokebackApi;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "provideFuturesMarketdataApi", "Lcom/robinhood/android/lib/api/futures/FuturesMarketdataApi;", "provideFuturesManagedMarketdataApi", "Lcom/robinhood/android/lib/api/futures/FuturesManagedMarketdataApi;", "lib-api-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class FuturesApiModule {
    public static final FuturesApiModule INSTANCE = new FuturesApiModule();

    private FuturesApiModule() {
    }

    public final FuturesBrokebackApi provideFuturesBrokebackApi(@BrokebackRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (FuturesBrokebackApi) LazyRetrofit3.create(retrofit, FuturesBrokebackApi.class);
    }

    public final FuturesManagedMarketdataApi provideFuturesManagedMarketdataApi(@ManagedMarketdataRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (FuturesManagedMarketdataApi) LazyRetrofit3.create(retrofit, FuturesManagedMarketdataApi.class);
    }

    public final FuturesMarketdataApi provideFuturesMarketdataApi(@MarketdataRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (FuturesMarketdataApi) LazyRetrofit3.create(retrofit, FuturesMarketdataApi.class);
    }
}
