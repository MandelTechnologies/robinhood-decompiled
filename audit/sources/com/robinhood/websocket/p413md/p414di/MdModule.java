package com.robinhood.websocket.p413md.p414di;

import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.websocket.p413md.models.MdFeedData;
import com.robinhood.websocket.p413md.models.MdMessage;
import com.robinhood.websocket.p413md.models.MdResponse;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MdModule.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/websocket/md/di/MdModule;", "", "<init>", "()V", "provideMdMoshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "lib-websocket-md_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class MdModule {
    public static final MdModule INSTANCE = new MdModule();

    private MdModule() {
    }

    @MdMoshi
    public final LazyMoshi provideMdMoshi(final LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        final PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(MdMessage.class, "type").withSubtype(MdMessage.Setup.class, "SETUP").withSubtype(MdMessage.Auth.class, "AUTH").withSubtype(MdMessage.SetupLogging.class, "MD_SETUP").withSubtype(MdMessage.ChannelRequest.class, "CHANNEL_REQUEST").withSubtype(MdMessage.FeedSetup.class, "FEED_SETUP").withSubtype(MdMessage.FeedSubscription.class, "FEED_SUBSCRIPTION").withSubtype(MdMessage.KeepAlive.class, "KEEPALIVE");
        final PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype2 = PolymorphicJsonAdapterFactory.m3154of(MdResponse.class, "type").withSubtype(MdResponse.Setup.class, "SETUP").withSubtype(MdResponse.AuthState.class, "AUTH_STATE").withSubtype(MdResponse.StatusResponse.class, "STATUS_RESPONSE").withSubtype(MdResponse.ChannelOpened.class, "CHANNEL_OPENED").withSubtype(MdResponse.IgnoredResponse.class, "CHANNEL_CLOSED").withSubtype(MdResponse.FeedDataResponse.class, "FEED_DATA").withSubtype(MdResponse.Error.class, "ERROR").withSubtype(MdResponse.IgnoredResponse.class, "FEED_CONFIG").withSubtype(MdResponse.KeepAlive.class, "KEEPALIVE");
        final PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype3 = PolymorphicJsonAdapterFactory.m3154of(MdFeedData.class, "eventType").withSubtype(MdFeedData.L2Data.class, "MD_EQUITY_L2_FULL").withSubtype(MdFeedData.Quote.class, "MD_EQUITY_QUOTE_QBBO");
        return new LazyMoshi(new Lazy() { // from class: com.robinhood.websocket.md.di.MdModule.provideMdMoshi.1
            @Override // dagger.Lazy
            public final Moshi get() {
                return moshi.get().newBuilder().add((JsonAdapter.Factory) polymorphicJsonAdapterFactoryWithSubtype).add((JsonAdapter.Factory) polymorphicJsonAdapterFactoryWithSubtype2).add((JsonAdapter.Factory) polymorphicJsonAdapterFactoryWithSubtype3).build();
            }
        });
    }
}
