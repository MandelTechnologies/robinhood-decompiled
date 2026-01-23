package com.robinhood.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.utils.RhCallAdapterFactory;
import com.squareup.moshi.Moshi;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* compiled from: RetrofitModule_ProvideContentfulRetrofitFactory.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010BH\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0011\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0006\u0012\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\b0\u0006\u0012\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/api/RetrofitModule_ProvideContentfulRetrofitFactory;", "Ldagger/internal/Factory;", "Lretrofit2/Retrofit;", "module", "Lcom/robinhood/api/RetrofitModule;", "moshi", "Ljavax/inject/Provider;", "Lcom/squareup/moshi/Moshi;", "Lkotlin/jvm/JvmSuppressWildcards;", "okHttpClient", "Lokhttp3/OkHttpClient;", "callAdapterFactory", "Lcom/robinhood/api/utils/RhCallAdapterFactory;", "<init>", "(Lcom/robinhood/api/RetrofitModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RetrofitModule_ProvideContentfulRetrofitFactory implements Factory<Retrofit> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RhCallAdapterFactory> callAdapterFactory;
    private final RetrofitModule module;
    private final Provider<Moshi> moshi;
    private final Provider<OkHttpClient> okHttpClient;

    @JvmStatic
    public static final RetrofitModule_ProvideContentfulRetrofitFactory create(RetrofitModule retrofitModule, Provider<Moshi> provider, Provider<OkHttpClient> provider2, Provider<RhCallAdapterFactory> provider3) {
        return INSTANCE.create(retrofitModule, provider, provider2, provider3);
    }

    @JvmStatic
    public static final Retrofit provideContentfulRetrofit(RetrofitModule retrofitModule, Lazy<Moshi> lazy, Lazy<OkHttpClient> lazy2, Lazy<RhCallAdapterFactory> lazy3) {
        return INSTANCE.provideContentfulRetrofit(retrofitModule, lazy, lazy2, lazy3);
    }

    public RetrofitModule_ProvideContentfulRetrofitFactory(RetrofitModule module, Provider<Moshi> moshi, Provider<OkHttpClient> okHttpClient, Provider<RhCallAdapterFactory> callAdapterFactory) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
        this.module = module;
        this.moshi = moshi;
        this.okHttpClient = okHttpClient;
        this.callAdapterFactory = callAdapterFactory;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        Companion companion = INSTANCE;
        RetrofitModule retrofitModule = this.module;
        Lazy<Moshi> lazy = DoubleCheck.lazy(this.moshi);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        Lazy<OkHttpClient> lazy2 = DoubleCheck.lazy(this.okHttpClient);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        Lazy<RhCallAdapterFactory> lazy3 = DoubleCheck.lazy(this.callAdapterFactory);
        Intrinsics.checkNotNullExpressionValue(lazy3, "lazy(...)");
        return companion.provideContentfulRetrofit(retrofitModule, lazy, lazy2, lazy3);
    }

    /* compiled from: RetrofitModule_ProvideContentfulRetrofitFactory.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\t2\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000b0\t2\u0011\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u000b0\tH\u0007JI\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u00122\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000b0\u00122\u0011\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u000b0\u0012H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/api/RetrofitModule_ProvideContentfulRetrofitFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/RetrofitModule_ProvideContentfulRetrofitFactory;", "module", "Lcom/robinhood/api/RetrofitModule;", "moshi", "Ljavax/inject/Provider;", "Lcom/squareup/moshi/Moshi;", "Lkotlin/jvm/JvmSuppressWildcards;", "okHttpClient", "Lokhttp3/OkHttpClient;", "callAdapterFactory", "Lcom/robinhood/api/utils/RhCallAdapterFactory;", "provideContentfulRetrofit", "Lretrofit2/Retrofit;", "Ldagger/Lazy;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RetrofitModule_ProvideContentfulRetrofitFactory create(RetrofitModule module, Provider<Moshi> moshi, Provider<OkHttpClient> okHttpClient, Provider<RhCallAdapterFactory> callAdapterFactory) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
            return new RetrofitModule_ProvideContentfulRetrofitFactory(module, moshi, okHttpClient, callAdapterFactory);
        }

        @JvmStatic
        public final Retrofit provideContentfulRetrofit(RetrofitModule module, Lazy<Moshi> moshi, Lazy<OkHttpClient> okHttpClient, Lazy<RhCallAdapterFactory> callAdapterFactory) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideContentfulRetrofit(moshi, okHttpClient, callAdapterFactory), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Retrofit) objCheckNotNull;
        }
    }
}
