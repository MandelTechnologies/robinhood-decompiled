package com.robinhood.websocket.gateway;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WebsocketGatewaySource_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/websocket/gateway/WebsocketGatewaySource_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/websocket/gateway/WebsocketGatewaySource;", "targetBackend", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/TargetBackend;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageHandler", "Lcom/robinhood/websocket/gateway/WebsocketGatewayMessageHandler;", "connectionManager", "Lcom/robinhood/websocket/gateway/WebsocketGatewayConnectionManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-websocket-gateway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class WebsocketGatewaySource_Factory implements Factory<WebsocketGatewaySource> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<WebsocketGatewayConnectionManager> connectionManager;
    private final Provider<WebsocketGatewayMessageHandler> messageHandler;
    private final Provider<LazyMoshi> moshi;
    private final Provider<CoroutineScope> rootCoroutineScope;
    private final Provider<TargetBackend> targetBackend;

    @JvmStatic
    public static final WebsocketGatewaySource_Factory create(Provider<TargetBackend> provider, Provider<CoroutineScope> provider2, Provider<WebsocketGatewayMessageHandler> provider3, Provider<WebsocketGatewayConnectionManager> provider4, Provider<LazyMoshi> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final WebsocketGatewaySource newInstance(TargetBackend targetBackend, CoroutineScope coroutineScope, WebsocketGatewayMessageHandler websocketGatewayMessageHandler, WebsocketGatewayConnectionManager websocketGatewayConnectionManager, LazyMoshi lazyMoshi) {
        return INSTANCE.newInstance(targetBackend, coroutineScope, websocketGatewayMessageHandler, websocketGatewayConnectionManager, lazyMoshi);
    }

    public WebsocketGatewaySource_Factory(Provider<TargetBackend> targetBackend, Provider<CoroutineScope> rootCoroutineScope, Provider<WebsocketGatewayMessageHandler> messageHandler, Provider<WebsocketGatewayConnectionManager> connectionManager, Provider<LazyMoshi> moshi) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        Intrinsics.checkNotNullParameter(connectionManager, "connectionManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.targetBackend = targetBackend;
        this.rootCoroutineScope = rootCoroutineScope;
        this.messageHandler = messageHandler;
        this.connectionManager = connectionManager;
        this.moshi = moshi;
    }

    @Override // javax.inject.Provider
    public WebsocketGatewaySource get() {
        Companion companion = INSTANCE;
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        CoroutineScope coroutineScope = this.rootCoroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        WebsocketGatewayMessageHandler websocketGatewayMessageHandler = this.messageHandler.get();
        Intrinsics.checkNotNullExpressionValue(websocketGatewayMessageHandler, "get(...)");
        WebsocketGatewayConnectionManager websocketGatewayConnectionManager = this.connectionManager.get();
        Intrinsics.checkNotNullExpressionValue(websocketGatewayConnectionManager, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        return companion.newInstance(targetBackend, coroutineScope, websocketGatewayMessageHandler, websocketGatewayConnectionManager, lazyMoshi);
    }

    /* compiled from: WebsocketGatewaySource_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/websocket/gateway/WebsocketGatewaySource_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/websocket/gateway/WebsocketGatewaySource_Factory;", "targetBackend", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/TargetBackend;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageHandler", "Lcom/robinhood/websocket/gateway/WebsocketGatewayMessageHandler;", "connectionManager", "Lcom/robinhood/websocket/gateway/WebsocketGatewayConnectionManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "newInstance", "Lcom/robinhood/websocket/gateway/WebsocketGatewaySource;", "lib-websocket-gateway_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WebsocketGatewaySource_Factory create(Provider<TargetBackend> targetBackend, Provider<CoroutineScope> rootCoroutineScope, Provider<WebsocketGatewayMessageHandler> messageHandler, Provider<WebsocketGatewayConnectionManager> connectionManager, Provider<LazyMoshi> moshi) {
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
            Intrinsics.checkNotNullParameter(connectionManager, "connectionManager");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new WebsocketGatewaySource_Factory(targetBackend, rootCoroutineScope, messageHandler, connectionManager, moshi);
        }

        @JvmStatic
        public final WebsocketGatewaySource newInstance(TargetBackend targetBackend, CoroutineScope rootCoroutineScope, WebsocketGatewayMessageHandler messageHandler, WebsocketGatewayConnectionManager connectionManager, LazyMoshi moshi) {
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
            Intrinsics.checkNotNullParameter(connectionManager, "connectionManager");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new WebsocketGatewaySource(targetBackend, rootCoroutineScope, messageHandler, connectionManager, moshi);
        }
    }
}
