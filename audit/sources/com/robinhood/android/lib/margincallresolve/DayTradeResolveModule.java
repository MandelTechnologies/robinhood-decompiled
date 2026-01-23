package com.robinhood.android.lib.margincallresolve;

import com.robinhood.android.lib.margincallresolve.api.DayTradeResolveApi;
import com.robinhood.api.annotation.BonfireRetrofit;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: DayTradeResolveModule.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/lib/margincallresolve/DayTradeResolveModule;", "", "<init>", "()V", "provideDayTradeResolveApi", "Lcom/robinhood/android/lib/margincallresolve/api/DayTradeResolveApi;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "lib-margin-call-resolve_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DayTradeResolveModule {
    public static final DayTradeResolveModule INSTANCE = new DayTradeResolveModule();

    private DayTradeResolveModule() {
    }

    public final DayTradeResolveApi provideDayTradeResolveApi(@BonfireRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (DayTradeResolveApi) LazyRetrofit3.create(retrofit, DayTradeResolveApi.class);
    }
}
