package com.robinhood.android.newsfeed.api.breakingnews;

import com.robinhood.api.annotation.DoraRetrofit;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: BreakingNewsApiModule.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/api/breakingnews/BreakingNewsApiModule;", "", "<init>", "()V", "provideBreakingNewsApi", "Lcom/robinhood/android/newsfeed/api/breakingnews/BreakingNewsApi;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "lib-api-breakingnews_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class BreakingNewsApiModule {
    public static final BreakingNewsApiModule INSTANCE = new BreakingNewsApiModule();

    private BreakingNewsApiModule() {
    }

    public final BreakingNewsApi provideBreakingNewsApi(@DoraRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (BreakingNewsApi) LazyRetrofit3.create(retrofit, BreakingNewsApi.class);
    }
}
