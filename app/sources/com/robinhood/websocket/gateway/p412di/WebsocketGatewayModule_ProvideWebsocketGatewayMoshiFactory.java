package com.robinhood.websocket.gateway.p412di;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebsocketGatewayModule_ProvideWebsocketGatewayMoshiFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/websocket/gateway/di/WebsocketGatewayModule_ProvideWebsocketGatewayMoshiFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Ljavax/inject/Provider;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-websocket-gateway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class WebsocketGatewayModule_ProvideWebsocketGatewayMoshiFactory implements Factory<LazyMoshi> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<LazyMoshi> moshi;

    @JvmStatic
    public static final WebsocketGatewayModule_ProvideWebsocketGatewayMoshiFactory create(Provider<LazyMoshi> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final LazyMoshi provideWebsocketGatewayMoshi(LazyMoshi lazyMoshi) {
        return INSTANCE.provideWebsocketGatewayMoshi(lazyMoshi);
    }

    public WebsocketGatewayModule_ProvideWebsocketGatewayMoshiFactory(Provider<LazyMoshi> moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
    }

    @Override // javax.inject.Provider
    public LazyMoshi get() {
        Companion companion = INSTANCE;
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        return companion.provideWebsocketGatewayMoshi(lazyMoshi);
    }

    /* compiled from: WebsocketGatewayModule_ProvideWebsocketGatewayMoshiFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/websocket/gateway/di/WebsocketGatewayModule_ProvideWebsocketGatewayMoshiFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/websocket/gateway/di/WebsocketGatewayModule_ProvideWebsocketGatewayMoshiFactory;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideWebsocketGatewayMoshi", "lib-websocket-gateway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WebsocketGatewayModule_ProvideWebsocketGatewayMoshiFactory create(Provider<LazyMoshi> moshi) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new WebsocketGatewayModule_ProvideWebsocketGatewayMoshiFactory(moshi);
        }

        @JvmStatic
        public final LazyMoshi provideWebsocketGatewayMoshi(LazyMoshi moshi) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Object objCheckNotNull = Preconditions.checkNotNull(WebsocketGatewayModule.INSTANCE.provideWebsocketGatewayMoshi(moshi), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (LazyMoshi) objCheckNotNull;
        }
    }
}
