package com.robinhood.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.utils.RhCallAdapterFactory;
import com.robinhood.targetbackend.Endpoint;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* compiled from: RetrofitModule_ProvideBrokebackRetrofitFactory.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BW\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\u0017\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\n0\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/api/RetrofitModule_ProvideBrokebackRetrofitFactory;", "Ldagger/internal/Factory;", "Lretrofit2/Retrofit;", "module", "Lcom/robinhood/api/RetrofitModule;", "endpoint", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/Endpoint;", "client", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "callAdapterFactory", "Lcom/robinhood/api/utils/RhCallAdapterFactory;", "converterFactories", "", "Lretrofit2/Converter$Factory;", "<init>", "(Lcom/robinhood/api/RetrofitModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RetrofitModule_ProvideBrokebackRetrofitFactory implements Factory<Retrofit> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RhCallAdapterFactory> callAdapterFactory;
    private final Provider<OkHttpClient> client;
    private final Provider<List<Converter.Factory>> converterFactories;
    private final Provider<Endpoint> endpoint;
    private final RetrofitModule module;

    @JvmStatic
    public static final RetrofitModule_ProvideBrokebackRetrofitFactory create(RetrofitModule retrofitModule, Provider<Endpoint> provider, Provider<OkHttpClient> provider2, Provider<RhCallAdapterFactory> provider3, Provider<List<Converter.Factory>> provider4) {
        return INSTANCE.create(retrofitModule, provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final Retrofit provideBrokebackRetrofit(RetrofitModule retrofitModule, Endpoint endpoint, Lazy<OkHttpClient> lazy, RhCallAdapterFactory rhCallAdapterFactory, List<Converter.Factory> list) {
        return INSTANCE.provideBrokebackRetrofit(retrofitModule, endpoint, lazy, rhCallAdapterFactory, list);
    }

    public RetrofitModule_ProvideBrokebackRetrofitFactory(RetrofitModule module, Provider<Endpoint> endpoint, Provider<OkHttpClient> client, Provider<RhCallAdapterFactory> callAdapterFactory, Provider<List<Converter.Factory>> converterFactories) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
        Intrinsics.checkNotNullParameter(converterFactories, "converterFactories");
        this.module = module;
        this.endpoint = endpoint;
        this.client = client;
        this.callAdapterFactory = callAdapterFactory;
        this.converterFactories = converterFactories;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        Companion companion = INSTANCE;
        RetrofitModule retrofitModule = this.module;
        Endpoint endpoint = this.endpoint.get();
        Intrinsics.checkNotNullExpressionValue(endpoint, "get(...)");
        Lazy<OkHttpClient> lazy = DoubleCheck.lazy(this.client);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        RhCallAdapterFactory rhCallAdapterFactory = this.callAdapterFactory.get();
        Intrinsics.checkNotNullExpressionValue(rhCallAdapterFactory, "get(...)");
        List<Converter.Factory> list = this.converterFactories.get();
        Intrinsics.checkNotNullExpressionValue(list, "get(...)");
        return companion.provideBrokebackRetrofit(retrofitModule, endpoint, lazy, rhCallAdapterFactory, list);
    }

    /* compiled from: RetrofitModule_ProvideBrokebackRetrofitFactory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0017\u0010\u0010\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\r0\tH\u0007JF\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\n2\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\rH\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/api/RetrofitModule_ProvideBrokebackRetrofitFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/RetrofitModule_ProvideBrokebackRetrofitFactory;", "module", "Lcom/robinhood/api/RetrofitModule;", "endpoint", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/Endpoint;", "client", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "callAdapterFactory", "Lcom/robinhood/api/utils/RhCallAdapterFactory;", "converterFactories", "", "Lretrofit2/Converter$Factory;", "provideBrokebackRetrofit", "Lretrofit2/Retrofit;", "Ldagger/Lazy;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RetrofitModule_ProvideBrokebackRetrofitFactory create(RetrofitModule module, Provider<Endpoint> endpoint, Provider<OkHttpClient> client, Provider<RhCallAdapterFactory> callAdapterFactory, Provider<List<Converter.Factory>> converterFactories) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
            Intrinsics.checkNotNullParameter(converterFactories, "converterFactories");
            return new RetrofitModule_ProvideBrokebackRetrofitFactory(module, endpoint, client, callAdapterFactory, converterFactories);
        }

        @JvmStatic
        public final Retrofit provideBrokebackRetrofit(RetrofitModule module, Endpoint endpoint, Lazy<OkHttpClient> client, RhCallAdapterFactory callAdapterFactory, List<Converter.Factory> converterFactories) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
            Intrinsics.checkNotNullParameter(converterFactories, "converterFactories");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideBrokebackRetrofit(endpoint, client, callAdapterFactory, converterFactories), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Retrofit) objCheckNotNull;
        }
    }
}
