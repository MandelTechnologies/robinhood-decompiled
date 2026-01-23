package com.robinhood.android.apitestdata;

import com.robinhood.android.apitestdata.annotation.TestDataMoshi;
import com.robinhood.android.apitestdata.annotation.TestDataRetrofit;
import com.robinhood.android.apitestdata.api.TestDataApi;
import com.robinhood.api.annotation.BrokebackOkHttpClient;
import com.robinhood.api.utils.RhCallAdapterFactory;
import com.robinhood.networking.BuildConfig;
import com.robinhood.networking.util.Retrofits;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* compiled from: ApiTestDataModule.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/apitestdata/ApiTestDataModule;", "", "<init>", "()V", "provideTestDataRetrofit", "Lretrofit2/Retrofit;", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "client", "Ldagger/Lazy;", "Lokhttp3/OkHttpClient;", "converterFactories", "", "Lretrofit2/Converter$Factory;", "Lkotlin/jvm/JvmSuppressWildcards;", "callAdapterFactory", "Lcom/robinhood/api/utils/RhCallAdapterFactory;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideTestDataApi", "Lcom/robinhood/android/apitestdata/api/TestDataApi;", "retrofit", "lib-api-fixtures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ApiTestDataModule {
    public static final ApiTestDataModule INSTANCE = new ApiTestDataModule();

    @TestDataRetrofit
    public final Retrofit provideTestDataRetrofit(Endpoint endpoint, @BrokebackOkHttpClient Lazy<OkHttpClient> client, List<Converter.Factory> converterFactories, RhCallAdapterFactory callAdapterFactory, @TestDataMoshi LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(converterFactories, "converterFactories");
        Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Retrofit.Builder builder = new Retrofit.Builder();
        Retrofits.client(builder, client);
        HttpUrl testDataUrl = endpoint.getTestDataUrl();
        Intrinsics.checkNotNull(testDataUrl);
        builder.baseUrl(testDataUrl);
        builder.addCallAdapterFactory(callAdapterFactory);
        builder.addConverterFactory(MoshiConverterFactory.create(moshi.get()));
        Retrofits.addConverterFactories(builder, converterFactories);
        Retrofit retrofitBuild = builder.validateEagerly(BuildConfig.DEBUG).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    private ApiTestDataModule() {
    }

    public final TestDataApi provideTestDataApi(@TestDataRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (TestDataApi) LazyRetrofit3.create(retrofit, TestDataApi.class);
    }
}
