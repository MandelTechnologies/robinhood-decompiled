package com.robinhood.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.utils.RhCallAdapterFactory;
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

/* compiled from: RetrofitModule_ProvideGalileoRetrofitFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB0\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0011\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/api/RetrofitModule_ProvideGalileoRetrofitFactory;", "Ldagger/internal/Factory;", "Lretrofit2/Retrofit;", "module", "Lcom/robinhood/api/RetrofitModule;", "client", "Ljavax/inject/Provider;", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "callAdapterFactory", "Lcom/robinhood/api/utils/RhCallAdapterFactory;", "<init>", "(Lcom/robinhood/api/RetrofitModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RetrofitModule_ProvideGalileoRetrofitFactory implements Factory<Retrofit> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RhCallAdapterFactory> callAdapterFactory;
    private final Provider<OkHttpClient> client;
    private final RetrofitModule module;

    @JvmStatic
    public static final RetrofitModule_ProvideGalileoRetrofitFactory create(RetrofitModule retrofitModule, Provider<OkHttpClient> provider, Provider<RhCallAdapterFactory> provider2) {
        return INSTANCE.create(retrofitModule, provider, provider2);
    }

    @JvmStatic
    public static final Retrofit provideGalileoRetrofit(RetrofitModule retrofitModule, Lazy<OkHttpClient> lazy, RhCallAdapterFactory rhCallAdapterFactory) {
        return INSTANCE.provideGalileoRetrofit(retrofitModule, lazy, rhCallAdapterFactory);
    }

    public RetrofitModule_ProvideGalileoRetrofitFactory(RetrofitModule module, Provider<OkHttpClient> client, Provider<RhCallAdapterFactory> callAdapterFactory) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
        this.module = module;
        this.client = client;
        this.callAdapterFactory = callAdapterFactory;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        Companion companion = INSTANCE;
        RetrofitModule retrofitModule = this.module;
        Lazy<OkHttpClient> lazy = DoubleCheck.lazy(this.client);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        RhCallAdapterFactory rhCallAdapterFactory = this.callAdapterFactory.get();
        Intrinsics.checkNotNullExpressionValue(rhCallAdapterFactory, "get(...)");
        return companion.provideGalileoRetrofit(retrofitModule, lazy, rhCallAdapterFactory);
    }

    /* compiled from: RetrofitModule_ProvideGalileoRetrofitFactory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0007J+\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u00102\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/api/RetrofitModule_ProvideGalileoRetrofitFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/RetrofitModule_ProvideGalileoRetrofitFactory;", "module", "Lcom/robinhood/api/RetrofitModule;", "client", "Ljavax/inject/Provider;", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "callAdapterFactory", "Lcom/robinhood/api/utils/RhCallAdapterFactory;", "provideGalileoRetrofit", "Lretrofit2/Retrofit;", "Ldagger/Lazy;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RetrofitModule_ProvideGalileoRetrofitFactory create(RetrofitModule module, Provider<OkHttpClient> client, Provider<RhCallAdapterFactory> callAdapterFactory) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
            return new RetrofitModule_ProvideGalileoRetrofitFactory(module, client, callAdapterFactory);
        }

        @JvmStatic
        public final Retrofit provideGalileoRetrofit(RetrofitModule module, Lazy<OkHttpClient> client, RhCallAdapterFactory callAdapterFactory) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideGalileoRetrofit(client, callAdapterFactory), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Retrofit) objCheckNotNull;
        }
    }
}
