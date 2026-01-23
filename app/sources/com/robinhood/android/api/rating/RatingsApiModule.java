package com.robinhood.android.api.rating;

import com.robinhood.api.annotation.DiscoveryRetrofit;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: RatingsApiModule.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/api/rating/RatingsApiModule;", "", "<init>", "()V", "provideRatingsApi", "Lcom/robinhood/android/api/rating/RatingsApi;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "lib-api-ratings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RatingsApiModule {
    public static final RatingsApiModule INSTANCE = new RatingsApiModule();

    private RatingsApiModule() {
    }

    public final RatingsApi provideRatingsApi(@DiscoveryRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (RatingsApi) LazyRetrofit3.create(retrofit, RatingsApi.class);
    }
}
