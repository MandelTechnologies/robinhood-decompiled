package com.robinhood.websocket.p410dx.p411di;

import com.robinhood.api.annotation.MarketdataRetrofit;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import com.robinhood.websocket.p410dx.models.DxFeedData;
import com.robinhood.websocket.p410dx.models.DxMessage;
import com.robinhood.websocket.p410dx.models.DxResponse;
import com.robinhood.websocket.p410dx.utils.BigDecimalWithNaNJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: DxModule.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/websocket/dx/di/DxModule;", "", "<init>", "()V", "provideDxMoshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "provideFuturesMarketdataApi", "Lcom/robinhood/websocket/dx/di/DxMarketdataApi;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "lib-websocket-dx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class DxModule {
    public static final DxModule INSTANCE = new DxModule();

    private DxModule() {
    }

    @DxMoshi
    public final LazyMoshi provideDxMoshi(final LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        final PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(DxMessage.class, "type").withSubtype(DxMessage.KeepAlive.class, "KEEPALIVE").withSubtype(DxMessage.Setup.class, "SETUP").withSubtype(DxMessage.Auth.class, "AUTH").withSubtype(DxMessage.ChannelRequest.class, "CHANNEL_REQUEST").withSubtype(DxMessage.ChannelCancel.class, DxMessage.TYPE_CHANNEL_CANCEL).withSubtype(DxMessage.FeedSubscription.class, "FEED_SUBSCRIPTION").withSubtype(DxMessage.FeedSetup.class, "FEED_SETUP").withSubtype(DxMessage.DomSetup.class, DxMessage.TYPE_DOM_SETUP);
        final PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype2 = PolymorphicJsonAdapterFactory.m3154of(DxResponse.class, "type").withSubtype(DxResponse.Setup.class, "SETUP").withSubtype(DxResponse.AuthState.class, "AUTH_STATE").withSubtype(DxResponse.ChannelOpened.class, "CHANNEL_OPENED").withSubtype(DxResponse.IgnoredResponse.class, "CHANNEL_CLOSED").withSubtype(DxResponse.FeedDataResponse.class, "FEED_DATA").withSubtype(DxResponse.DomSnapshot.class, "DOM_SNAPSHOT").withSubtype(DxResponse.Error.class, "ERROR").withSubtype(DxResponse.KeepAlive.class, "KEEPALIVE").withSubtype(DxResponse.IgnoredResponse.class, "FEED_CONFIG").withSubtype(DxResponse.IgnoredResponse.class, "DOM_CONFIG");
        final PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype3 = PolymorphicJsonAdapterFactory.m3154of(DxFeedData.class, "eventType").withSubtype(DxFeedData.Quote.class, DxFeedData.TYPE_QUOTE).withSubtype(DxFeedData.Trade.class, DxFeedData.TYPE_TRADE);
        return new LazyMoshi(new Lazy() { // from class: com.robinhood.websocket.dx.di.DxModule.provideDxMoshi.1
            @Override // dagger.Lazy
            public final Moshi get() {
                return moshi.get().newBuilder().add((JsonAdapter.Factory) polymorphicJsonAdapterFactoryWithSubtype).add((JsonAdapter.Factory) polymorphicJsonAdapterFactoryWithSubtype2).add((JsonAdapter.Factory) polymorphicJsonAdapterFactoryWithSubtype3).add(BigDecimalWithNaNJsonAdapter.INSTANCE).build();
            }
        });
    }

    public final DxMarketdataApi provideFuturesMarketdataApi(@MarketdataRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (DxMarketdataApi) LazyRetrofit3.create(retrofit, DxMarketdataApi.class);
    }
}
