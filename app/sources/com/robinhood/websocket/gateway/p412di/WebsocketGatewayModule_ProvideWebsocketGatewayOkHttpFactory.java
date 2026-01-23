package com.robinhood.websocket.gateway.p412di;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* compiled from: WebsocketGatewayModule_ProvideWebsocketGatewayOkHttpFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/websocket/gateway/di/WebsocketGatewayModule_ProvideWebsocketGatewayOkHttpFactory;", "Ldagger/internal/Factory;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Ljavax/inject/Provider;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-websocket-gateway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class WebsocketGatewayModule_ProvideWebsocketGatewayOkHttpFactory implements Factory<OkHttpClient> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<OkHttpClient> okHttpClient;

    @JvmStatic
    public static final WebsocketGatewayModule_ProvideWebsocketGatewayOkHttpFactory create(Provider<OkHttpClient> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final OkHttpClient provideWebsocketGatewayOkHttp(OkHttpClient okHttpClient) {
        return INSTANCE.provideWebsocketGatewayOkHttp(okHttpClient);
    }

    public WebsocketGatewayModule_ProvideWebsocketGatewayOkHttpFactory(Provider<OkHttpClient> okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        Companion companion = INSTANCE;
        OkHttpClient okHttpClient = this.okHttpClient.get();
        Intrinsics.checkNotNullExpressionValue(okHttpClient, "get(...)");
        return companion.provideWebsocketGatewayOkHttp(okHttpClient);
    }

    /* compiled from: WebsocketGatewayModule_ProvideWebsocketGatewayOkHttpFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/websocket/gateway/di/WebsocketGatewayModule_ProvideWebsocketGatewayOkHttpFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/websocket/gateway/di/WebsocketGatewayModule_ProvideWebsocketGatewayOkHttpFactory;", "okHttpClient", "Ljavax/inject/Provider;", "Lokhttp3/OkHttpClient;", "provideWebsocketGatewayOkHttp", "lib-websocket-gateway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WebsocketGatewayModule_ProvideWebsocketGatewayOkHttpFactory create(Provider<OkHttpClient> okHttpClient) {
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            return new WebsocketGatewayModule_ProvideWebsocketGatewayOkHttpFactory(okHttpClient);
        }

        @JvmStatic
        public final OkHttpClient provideWebsocketGatewayOkHttp(OkHttpClient okHttpClient) {
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Object objCheckNotNull = Preconditions.checkNotNull(WebsocketGatewayModule.INSTANCE.provideWebsocketGatewayOkHttp(okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (OkHttpClient) objCheckNotNull;
        }
    }
}
