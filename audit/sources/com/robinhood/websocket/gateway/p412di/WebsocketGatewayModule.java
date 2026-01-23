package com.robinhood.websocket.gateway.p412di;

import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.moshi.jsonadapter.IntLabelsPolymorphicJsonAdapterFactory;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.robinhood.websocket.gateway.models.WebsocketGatewayMessage;
import com.robinhood.websocket.gateway.utils.WebsocketGatewayResponseJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* compiled from: WebsocketGatewayModule.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/websocket/gateway/di/WebsocketGatewayModule;", "", "<init>", "()V", "provideWebsocketGatewayOkHttp", "Lokhttp3/OkHttpClient;", "okHttpClient", "provideWebsocketGatewayMoshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "lib-websocket-gateway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class WebsocketGatewayModule {
    public static final WebsocketGatewayModule INSTANCE = new WebsocketGatewayModule();

    private WebsocketGatewayModule() {
    }

    @WebsocketGatewayOkHttpClient
    public final OkHttpClient provideWebsocketGatewayOkHttp(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        return okHttpClient.newBuilder().protocols(CollectionsKt.listOf(Protocol.HTTP_1_1)).build();
    }

    @WebsocketGatewayMoshi
    public final LazyMoshi provideWebsocketGatewayMoshi(final LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        final IntLabelsPolymorphicJsonAdapterFactory intLabelsPolymorphicJsonAdapterFactoryWithSubtype = IntLabelsPolymorphicJsonAdapterFactory.INSTANCE.m2983of(WebsocketGatewayMessage.class, WebsocketGatewayConstants.OPCODE_KEY).withSubtype(WebsocketGatewayMessage.Ping.class, 9);
        return new LazyMoshi(new Lazy() { // from class: com.robinhood.websocket.gateway.di.WebsocketGatewayModule.provideWebsocketGatewayMoshi.1
            @Override // dagger.Lazy
            public final Moshi get() {
                return moshi.get().newBuilder().add((JsonAdapter.Factory) intLabelsPolymorphicJsonAdapterFactoryWithSubtype).add(new WebsocketGatewayResponseJsonAdapter(moshi.get())).build();
            }
        });
    }
}
