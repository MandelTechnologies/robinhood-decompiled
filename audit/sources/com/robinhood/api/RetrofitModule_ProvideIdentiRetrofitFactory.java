package com.robinhood.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.targetbackend.Endpoint;
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

/* compiled from: RetrofitModule_ProvideIdentiRetrofitFactory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB>\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/api/RetrofitModule_ProvideIdentiRetrofitFactory;", "Ldagger/internal/Factory;", "Lretrofit2/Retrofit;", "module", "Lcom/robinhood/api/RetrofitModule;", "retrofit", "Ljavax/inject/Provider;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "okHttpClient", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Lcom/robinhood/api/RetrofitModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RetrofitModule_ProvideIdentiRetrofitFactory implements Factory<Retrofit> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Endpoint> endpoint;
    private final RetrofitModule module;
    private final Provider<OkHttpClient> okHttpClient;
    private final Provider<Retrofit> retrofit;

    @JvmStatic
    public static final RetrofitModule_ProvideIdentiRetrofitFactory create(RetrofitModule retrofitModule, Provider<Retrofit> provider, Provider<Endpoint> provider2, Provider<OkHttpClient> provider3) {
        return INSTANCE.create(retrofitModule, provider, provider2, provider3);
    }

    @JvmStatic
    public static final Retrofit provideIdentiRetrofit(RetrofitModule retrofitModule, Retrofit retrofit, Endpoint endpoint, Lazy<OkHttpClient> lazy) {
        return INSTANCE.provideIdentiRetrofit(retrofitModule, retrofit, endpoint, lazy);
    }

    public RetrofitModule_ProvideIdentiRetrofitFactory(RetrofitModule module, Provider<Retrofit> retrofit, Provider<Endpoint> endpoint, Provider<OkHttpClient> okHttpClient) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.module = module;
        this.retrofit = retrofit;
        this.endpoint = endpoint;
        this.okHttpClient = okHttpClient;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        Companion companion = INSTANCE;
        RetrofitModule retrofitModule = this.module;
        Retrofit retrofit = this.retrofit.get();
        Intrinsics.checkNotNullExpressionValue(retrofit, "get(...)");
        Endpoint endpoint = this.endpoint.get();
        Intrinsics.checkNotNullExpressionValue(endpoint, "get(...)");
        Lazy<OkHttpClient> lazy = DoubleCheck.lazy(this.okHttpClient);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return companion.provideIdentiRetrofit(retrofitModule, retrofit, endpoint, lazy);
    }

    /* compiled from: RetrofitModule_ProvideIdentiRetrofitFactory.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0011\u0010\r\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\tH\u0007J3\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\u0011H\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/api/RetrofitModule_ProvideIdentiRetrofitFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/RetrofitModule_ProvideIdentiRetrofitFactory;", "module", "Lcom/robinhood/api/RetrofitModule;", "retrofit", "Ljavax/inject/Provider;", "Lretrofit2/Retrofit;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "okHttpClient", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideIdentiRetrofit", "Ldagger/Lazy;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RetrofitModule_ProvideIdentiRetrofitFactory create(RetrofitModule module, Provider<Retrofit> retrofit, Provider<Endpoint> endpoint, Provider<OkHttpClient> okHttpClient) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            return new RetrofitModule_ProvideIdentiRetrofitFactory(module, retrofit, endpoint, okHttpClient);
        }

        @JvmStatic
        public final Retrofit provideIdentiRetrofit(RetrofitModule module, Retrofit retrofit, Endpoint endpoint, Lazy<OkHttpClient> okHttpClient) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideIdentiRetrofit(retrofit, endpoint, okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Retrofit) objCheckNotNull;
        }
    }
}
