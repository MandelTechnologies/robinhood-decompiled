package com.robinhood.android.apitestdata;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.utils.RhCallAdapterFactory;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.moshi.LazyMoshi;
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

/* compiled from: ApiTestDataModule_ProvideTestDataRetrofitFactory.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B]\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004\u0012\u0017\u0010\t\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\t\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/apitestdata/ApiTestDataModule_ProvideTestDataRetrofitFactory;", "Ldagger/internal/Factory;", "Lretrofit2/Retrofit;", "endpoint", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/Endpoint;", "client", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "converterFactories", "", "Lretrofit2/Converter$Factory;", "callAdapterFactory", "Lcom/robinhood/api/utils/RhCallAdapterFactory;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-api-fixtures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ApiTestDataModule_ProvideTestDataRetrofitFactory implements Factory<Retrofit> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RhCallAdapterFactory> callAdapterFactory;
    private final Provider<OkHttpClient> client;
    private final Provider<List<Converter.Factory>> converterFactories;
    private final Provider<Endpoint> endpoint;
    private final Provider<LazyMoshi> moshi;

    @JvmStatic
    public static final ApiTestDataModule_ProvideTestDataRetrofitFactory create(Provider<Endpoint> provider, Provider<OkHttpClient> provider2, Provider<List<Converter.Factory>> provider3, Provider<RhCallAdapterFactory> provider4, Provider<LazyMoshi> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final Retrofit provideTestDataRetrofit(Endpoint endpoint, Lazy<OkHttpClient> lazy, List<Converter.Factory> list, RhCallAdapterFactory rhCallAdapterFactory, LazyMoshi lazyMoshi) {
        return INSTANCE.provideTestDataRetrofit(endpoint, lazy, list, rhCallAdapterFactory, lazyMoshi);
    }

    public ApiTestDataModule_ProvideTestDataRetrofitFactory(Provider<Endpoint> endpoint, Provider<OkHttpClient> client, Provider<List<Converter.Factory>> converterFactories, Provider<RhCallAdapterFactory> callAdapterFactory, Provider<LazyMoshi> moshi) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(converterFactories, "converterFactories");
        Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.endpoint = endpoint;
        this.client = client;
        this.converterFactories = converterFactories;
        this.callAdapterFactory = callAdapterFactory;
        this.moshi = moshi;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        Companion companion = INSTANCE;
        Endpoint endpoint = this.endpoint.get();
        Intrinsics.checkNotNullExpressionValue(endpoint, "get(...)");
        Lazy<OkHttpClient> lazy = DoubleCheck.lazy(this.client);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        List<Converter.Factory> list = this.converterFactories.get();
        Intrinsics.checkNotNullExpressionValue(list, "get(...)");
        RhCallAdapterFactory rhCallAdapterFactory = this.callAdapterFactory.get();
        Intrinsics.checkNotNullExpressionValue(rhCallAdapterFactory, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        return companion.provideTestDataRetrofit(endpoint, lazy, list, rhCallAdapterFactory, lazyMoshi);
    }

    /* compiled from: ApiTestDataModule_ProvideTestDataRetrofitFactory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J^\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u00072\u0017\u0010\f\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000b0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007JF\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u00152\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/apitestdata/ApiTestDataModule_ProvideTestDataRetrofitFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/apitestdata/ApiTestDataModule_ProvideTestDataRetrofitFactory;", "endpoint", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/Endpoint;", "client", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "converterFactories", "", "Lretrofit2/Converter$Factory;", "callAdapterFactory", "Lcom/robinhood/api/utils/RhCallAdapterFactory;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideTestDataRetrofit", "Lretrofit2/Retrofit;", "Ldagger/Lazy;", "lib-api-fixtures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ApiTestDataModule_ProvideTestDataRetrofitFactory create(Provider<Endpoint> endpoint, Provider<OkHttpClient> client, Provider<List<Converter.Factory>> converterFactories, Provider<RhCallAdapterFactory> callAdapterFactory, Provider<LazyMoshi> moshi) {
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(converterFactories, "converterFactories");
            Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new ApiTestDataModule_ProvideTestDataRetrofitFactory(endpoint, client, converterFactories, callAdapterFactory, moshi);
        }

        @JvmStatic
        public final Retrofit provideTestDataRetrofit(Endpoint endpoint, Lazy<OkHttpClient> client, List<Converter.Factory> converterFactories, RhCallAdapterFactory callAdapterFactory, LazyMoshi moshi) {
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(converterFactories, "converterFactories");
            Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Object objCheckNotNull = Preconditions.checkNotNull(ApiTestDataModule.INSTANCE.provideTestDataRetrofit(endpoint, client, converterFactories, callAdapterFactory, moshi), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Retrofit) objCheckNotNull;
        }
    }
}
