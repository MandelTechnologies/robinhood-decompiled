package com.robinhood.api;

import com.robinhood.api.annotation.AtlasRetrofit;
import com.robinhood.api.annotation.BonfireRetrofit;
import com.robinhood.api.annotation.BrokebackOkHttpClient;
import com.robinhood.api.annotation.BrokebackRetrofit;
import com.robinhood.api.annotation.BrokerageStaticRetrofit;
import com.robinhood.api.annotation.ContentfulRetrofit;
import com.robinhood.api.annotation.CryptoTransfersRetrofit;
import com.robinhood.api.annotation.DiscoveryRetrofit;
import com.robinhood.api.annotation.DoraRetrofit;
import com.robinhood.api.annotation.ExperimentsRetrofit;
import com.robinhood.api.annotation.FuturesRetrofit;
import com.robinhood.api.annotation.GalileoOkHttpClient;
import com.robinhood.api.annotation.GalileoRetrofit;
import com.robinhood.api.annotation.GenericRetrofit;
import com.robinhood.api.annotation.IavRetrofit;
import com.robinhood.api.annotation.IdentiRetrofit;
import com.robinhood.api.annotation.InboxRendererRetrofit;
import com.robinhood.api.annotation.ManagedMarketdataRetrofit;
import com.robinhood.api.annotation.MarketdataRetrofit;
import com.robinhood.api.annotation.MediaRetrofit;
import com.robinhood.api.annotation.MidlandsRetrofit;
import com.robinhood.api.annotation.MinervaRetrofit;
import com.robinhood.api.annotation.NummusRetrofit;
import com.robinhood.api.annotation.PathfinderRetrofit;
import com.robinhood.api.annotation.PimsRetrofit;
import com.robinhood.api.utils.RhCallAdapterFactory;
import com.robinhood.contentful.json.ContentfulMoshi;
import com.robinhood.contentful.json.ContentfulOkHttpClient;
import com.robinhood.enums.retrofit.RhEnumConverterFactory;
import com.robinhood.g11n.converterfactory.CountryCodeConverterFactory;
import com.robinhood.g11n.converterfactory.LocaleStringConverterFactory;
import com.robinhood.networking.util.BigDecimalStringConverterFactory;
import com.robinhood.networking.util.Retrofits;
import com.robinhood.networking.util.UuidStringConverterFactory;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.dagger.LazyKt;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.retrofit.converterfactory.OptionalBitmapConverterFactory;
import com.squareup.moshi.Moshi;
import dagger.Lazy;
import dagger.internal.Provider;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/* compiled from: RetrofitModule.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J;\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00160\u0005H\u0007J\u001a\u0010\u0017\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u0018\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u001a\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J;\u0010\u001b\u001a\u00020\n2\u000e\b\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\f\u001a\u00020\r2\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00160\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u001a\u0010\u001d\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J*\u0010\u001e\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u000e\b\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007J\u001a\u0010\u001f\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010 \u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010!\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\"\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010#\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010$\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010%\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010&\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010'\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J1\u0010(\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00160\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J6\u0010)\u001a\u00020\n2\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020*0\u00112\u000e\b\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0007J \u0010+\u001a\u00020\n2\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0016\u0010,\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¨\u0006-"}, m3636d2 = {"Lcom/robinhood/api/RetrofitModule;", "", "<init>", "()V", "provideConverterFactories", "", "Lretrofit2/Converter$Factory;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideAtlasRetrofit", "Lretrofit2/Retrofit;", "retrofit", "endpoint", "Lcom/robinhood/targetbackend/Endpoint;", "provideBonfireRetrofit", "provideBrokebackRetrofit", "client", "Ldagger/Lazy;", "Lokhttp3/OkHttpClient;", "callAdapterFactory", "Lcom/robinhood/api/utils/RhCallAdapterFactory;", "converterFactories", "Lkotlin/jvm/JvmSuppressWildcards;", "provideCryptoTransfersRetrofit", "provideDoraRetrofit", "provideExperimentsRetrofit", "provideFuturesRetrofit", "provideIavRetrofit", "okHttpClient", "provideInboxRendererRetrofit", "provideIdentiRetrofit", "provideManagedMarketdataRetrofit", "provideMarketdataRetrofit", "provideMediaRetrofit", "provideMidlandsRetrofit", "provideDiscoveryRetrofit", "provideMinervaRetrofit", "provideNummusRetrofit", "providePathfinderRetrofit", "providePimsRetrofit", "provideBrokerageStaticRetrofit", "provideContentfulRetrofit", "Lcom/squareup/moshi/Moshi;", "provideGalileoRetrofit", "provideGenericRetrofit", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class RetrofitModule {
    @BrokebackRetrofit
    public final Retrofit provideBrokebackRetrofit(Endpoint endpoint, @BrokebackOkHttpClient Lazy<OkHttpClient> client, RhCallAdapterFactory callAdapterFactory, List<Converter.Factory> converterFactories) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
        Intrinsics.checkNotNullParameter(converterFactories, "converterFactories");
        Retrofit.Builder builder = new Retrofit.Builder();
        Retrofits.client(builder, client);
        builder.baseUrl(endpoint.getBrokebackUrl());
        builder.addCallAdapterFactory(callAdapterFactory);
        Retrofits.addConverterFactories(builder, converterFactories);
        Retrofit retrofitBuild = builder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @BrokerageStaticRetrofit
    public final Retrofit provideBrokerageStaticRetrofit(Lazy<OkHttpClient> client, List<Converter.Factory> converterFactories, RhCallAdapterFactory callAdapterFactory) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(converterFactories, "converterFactories");
        Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
        Retrofit.Builder builder = new Retrofit.Builder();
        Retrofits.client(builder, client);
        builder.baseUrl(Endpoint.BrokerageStatic.INSTANCE.getURL_CDN());
        builder.addCallAdapterFactory(callAdapterFactory);
        Retrofits.addConverterFactories(builder, converterFactories);
        Retrofit retrofitBuild = builder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @ContentfulRetrofit
    public final Retrofit provideContentfulRetrofit(@ContentfulMoshi Lazy<Moshi> moshi, @ContentfulOkHttpClient Lazy<OkHttpClient> okHttpClient, Lazy<RhCallAdapterFactory> callAdapterFactory) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
        Retrofit.Builder builder = new Retrofit.Builder();
        Retrofits.client(builder, okHttpClient);
        builder.baseUrl(Endpoint.BrokerageStatic.INSTANCE.getURL_STATIC_CONTENT());
        builder.addCallAdapterFactory(callAdapterFactory.get());
        builder.addConverterFactory(BigDecimalStringConverterFactory.INSTANCE);
        builder.addConverterFactory(LocaleStringConverterFactory.INSTANCE);
        builder.addConverterFactory(RhEnumConverterFactory.INSTANCE);
        builder.addConverterFactory(MoshiConverterFactory.create(moshi.get()));
        Retrofit retrofitBuild = builder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @GalileoRetrofit
    public final Retrofit provideGalileoRetrofit(@GalileoOkHttpClient Lazy<OkHttpClient> client, RhCallAdapterFactory callAdapterFactory) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
        Retrofit.Builder builder = new Retrofit.Builder();
        Retrofits.client(builder, client);
        builder.baseUrl("https://127.0.0.1/");
        builder.addCallAdapterFactory(callAdapterFactory);
        builder.addConverterFactory(OptionalBitmapConverterFactory.INSTANCE);
        Retrofit retrofitBuild = builder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @GenericRetrofit
    public final Retrofit provideGenericRetrofit(Lazy<OkHttpClient> okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Retrofit.Builder builder = new Retrofit.Builder();
        Retrofits.client(builder, okHttpClient);
        builder.baseUrl("https://127.0.0.1/");
        builder.addConverterFactory(ScalarsConverterFactory.create());
        Retrofit retrofitBuild = builder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @AtlasRetrofit
    public final Retrofit provideAtlasRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getAtlasUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @BonfireRetrofit
    public final Retrofit provideBonfireRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getBonfireUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @CryptoTransfersRetrofit
    public final Retrofit provideCryptoTransfersRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getCryptoTransfersUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @DiscoveryRetrofit
    public final Retrofit provideDiscoveryRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getDiscoveryUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @DoraRetrofit
    public final Retrofit provideDoraRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getDoraUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @ExperimentsRetrofit
    public final Retrofit provideExperimentsRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getExperimentsUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @FuturesRetrofit
    public final Retrofit provideFuturesRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getCeresUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @IdentiRetrofit
    public final Retrofit provideIdentiRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint, @BrokebackOkHttpClient final Lazy<OkHttpClient> okHttpClient) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        Retrofits.client(builderNewBuilder, LazyKt.daggerLazy(new Provider() { // from class: com.robinhood.api.RetrofitModule$provideIdentiRetrofit$lambda$13$$inlined$daggerLazy$1
            @Override // javax.inject.Provider
            public final T get() {
                Object obj = okHttpClient.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                OkHttpClient.Builder builderNewBuilder2 = ((OkHttpClient) obj).newBuilder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                builderNewBuilder2.readTimeout(30L, timeUnit);
                builderNewBuilder2.writeTimeout(30L, timeUnit);
                return (T) builderNewBuilder2.build();
            }
        }));
        builderNewBuilder.baseUrl(endpoint.getIdentiUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @InboxRendererRetrofit
    public final Retrofit provideInboxRendererRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getInboxRendererUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @ManagedMarketdataRetrofit
    public final Retrofit provideManagedMarketdataRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getManagedMarketdataUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @MarketdataRetrofit
    public final Retrofit provideMarketdataRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getMarketdataUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @MediaRetrofit
    public final Retrofit provideMediaRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getMediaUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @MidlandsRetrofit
    public final Retrofit provideMidlandsRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getMidlandsUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @MinervaRetrofit
    public final Retrofit provideMinervaRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getMinervaUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @NummusRetrofit
    public final Retrofit provideNummusRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getNummusUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @PathfinderRetrofit
    public final Retrofit providePathfinderRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getPathfinderUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @PimsRetrofit
    public final Retrofit providePimsRetrofit(@BrokebackRetrofit Retrofit retrofit, Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.baseUrl(endpoint.getPimsUrl());
        Retrofit retrofitBuild = builderNewBuilder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @IavRetrofit
    public final Retrofit provideIavRetrofit(@BrokebackOkHttpClient final Lazy<OkHttpClient> okHttpClient, Endpoint endpoint, List<Converter.Factory> converterFactories, RhCallAdapterFactory callAdapterFactory) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(converterFactories, "converterFactories");
        Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
        Lazy lazyDaggerLazy = LazyKt.daggerLazy(new Provider() { // from class: com.robinhood.api.RetrofitModule$provideIavRetrofit$$inlined$daggerLazy$1
            @Override // javax.inject.Provider
            public final T get() {
                Object obj = okHttpClient.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                OkHttpClient.Builder builderNewBuilder = ((OkHttpClient) obj).newBuilder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                builderNewBuilder.readTimeout(90L, timeUnit);
                builderNewBuilder.writeTimeout(90L, timeUnit);
                return (T) builderNewBuilder.build();
            }
        });
        Retrofit.Builder builder = new Retrofit.Builder();
        Retrofits.client(builder, lazyDaggerLazy);
        builder.baseUrl(endpoint.getBrokebackUrl());
        builder.addCallAdapterFactory(callAdapterFactory);
        Retrofits.addConverterFactories(builder, converterFactories);
        Retrofit retrofitBuild = builder.validateEagerly(false).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    public final List<Converter.Factory> provideConverterFactories(LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return CollectionsKt.listOf((Object[]) new Converter.Factory[]{UuidStringConverterFactory.INSTANCE, BigDecimalStringConverterFactory.INSTANCE, LocaleStringConverterFactory.INSTANCE, RhEnumConverterFactory.INSTANCE, CountryCodeConverterFactory.INSTANCE, MoshiConverterFactory.create(moshi.get())});
    }
}
