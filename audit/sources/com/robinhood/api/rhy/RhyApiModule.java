package com.robinhood.api.rhy;

import com.robinhood.api.annotation.BonfireRetrofit;
import com.robinhood.api.annotation.MinervaRetrofit;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: RhyApiModule.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\t\u001a\u00020\n2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/api/rhy/RhyApiModule;", "", "<init>", "()V", "provideRhyBonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "provideRhyCmSunsetApi", "Lcom/robinhood/api/rhy/RhyCmSunsetApi;", "provideRhyCardShipmentEligibilityApi", "Lcom/robinhood/api/rhy/RhyCardShipmentEligibilityApi;", "lib-api-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class RhyApiModule {
    public static final RhyApiModule INSTANCE = new RhyApiModule();

    private RhyApiModule() {
    }

    public final RhyBonfireApi provideRhyBonfireApi(@BonfireRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (RhyBonfireApi) LazyRetrofit3.create(retrofit, RhyBonfireApi.class);
    }

    public final RhyCardShipmentEligibilityApi provideRhyCardShipmentEligibilityApi(@MinervaRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (RhyCardShipmentEligibilityApi) LazyRetrofit3.create(retrofit, RhyCardShipmentEligibilityApi.class);
    }

    public final RhyCmSunsetApi provideRhyCmSunsetApi(@MinervaRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (RhyCmSunsetApi) LazyRetrofit3.create(retrofit, RhyCmSunsetApi.class);
    }
}
