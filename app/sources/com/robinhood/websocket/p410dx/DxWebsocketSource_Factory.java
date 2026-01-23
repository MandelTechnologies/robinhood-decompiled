package com.robinhood.websocket.p410dx;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.websocket.p410dx.p411di.DxMarketdataApi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DxWebsocketSource_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/websocket/dx/DxWebsocketSource_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/websocket/dx/DxWebsocketSource;", "dxMarketdataApi", "Ljavax/inject/Provider;", "Lcom/robinhood/websocket/dx/di/DxMarketdataApi;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageHandler", "Lcom/robinhood/websocket/dx/DxMessageHandler;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "connectionManager", "Lcom/robinhood/websocket/dx/DxWebsocketConnectionManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-websocket-dx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class DxWebsocketSource_Factory implements Factory<DxWebsocketSource> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DxWebsocketConnectionManager> connectionManager;
    private final Provider<DxMarketdataApi> dxMarketdataApi;
    private final Provider<DxMessageHandler> messageHandler;
    private final Provider<LazyMoshi> moshi;
    private final Provider<ReleaseVersion> releaseVersion;
    private final Provider<CoroutineScope> rootCoroutineScope;

    @JvmStatic
    public static final DxWebsocketSource_Factory create(Provider<DxMarketdataApi> provider, Provider<ReleaseVersion> provider2, Provider<CoroutineScope> provider3, Provider<DxMessageHandler> provider4, Provider<LazyMoshi> provider5, Provider<DxWebsocketConnectionManager> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final DxWebsocketSource newInstance(DxMarketdataApi dxMarketdataApi, ReleaseVersion releaseVersion, CoroutineScope coroutineScope, DxMessageHandler dxMessageHandler, LazyMoshi lazyMoshi, DxWebsocketConnectionManager dxWebsocketConnectionManager) {
        return INSTANCE.newInstance(dxMarketdataApi, releaseVersion, coroutineScope, dxMessageHandler, lazyMoshi, dxWebsocketConnectionManager);
    }

    public DxWebsocketSource_Factory(Provider<DxMarketdataApi> dxMarketdataApi, Provider<ReleaseVersion> releaseVersion, Provider<CoroutineScope> rootCoroutineScope, Provider<DxMessageHandler> messageHandler, Provider<LazyMoshi> moshi, Provider<DxWebsocketConnectionManager> connectionManager) {
        Intrinsics.checkNotNullParameter(dxMarketdataApi, "dxMarketdataApi");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(connectionManager, "connectionManager");
        this.dxMarketdataApi = dxMarketdataApi;
        this.releaseVersion = releaseVersion;
        this.rootCoroutineScope = rootCoroutineScope;
        this.messageHandler = messageHandler;
        this.moshi = moshi;
        this.connectionManager = connectionManager;
    }

    @Override // javax.inject.Provider
    public DxWebsocketSource get() {
        Companion companion = INSTANCE;
        DxMarketdataApi dxMarketdataApi = this.dxMarketdataApi.get();
        Intrinsics.checkNotNullExpressionValue(dxMarketdataApi, "get(...)");
        ReleaseVersion releaseVersion = this.releaseVersion.get();
        Intrinsics.checkNotNullExpressionValue(releaseVersion, "get(...)");
        CoroutineScope coroutineScope = this.rootCoroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        DxMessageHandler dxMessageHandler = this.messageHandler.get();
        Intrinsics.checkNotNullExpressionValue(dxMessageHandler, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        DxWebsocketConnectionManager dxWebsocketConnectionManager = this.connectionManager.get();
        Intrinsics.checkNotNullExpressionValue(dxWebsocketConnectionManager, "get(...)");
        return companion.newInstance(dxMarketdataApi, releaseVersion, coroutineScope, dxMessageHandler, lazyMoshi, dxWebsocketConnectionManager);
    }

    /* compiled from: DxWebsocketSource_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/websocket/dx/DxWebsocketSource_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/websocket/dx/DxWebsocketSource_Factory;", "dxMarketdataApi", "Ljavax/inject/Provider;", "Lcom/robinhood/websocket/dx/di/DxMarketdataApi;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageHandler", "Lcom/robinhood/websocket/dx/DxMessageHandler;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "connectionManager", "Lcom/robinhood/websocket/dx/DxWebsocketConnectionManager;", "newInstance", "Lcom/robinhood/websocket/dx/DxWebsocketSource;", "lib-websocket-dx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DxWebsocketSource_Factory create(Provider<DxMarketdataApi> dxMarketdataApi, Provider<ReleaseVersion> releaseVersion, Provider<CoroutineScope> rootCoroutineScope, Provider<DxMessageHandler> messageHandler, Provider<LazyMoshi> moshi, Provider<DxWebsocketConnectionManager> connectionManager) {
            Intrinsics.checkNotNullParameter(dxMarketdataApi, "dxMarketdataApi");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(connectionManager, "connectionManager");
            return new DxWebsocketSource_Factory(dxMarketdataApi, releaseVersion, rootCoroutineScope, messageHandler, moshi, connectionManager);
        }

        @JvmStatic
        public final DxWebsocketSource newInstance(DxMarketdataApi dxMarketdataApi, ReleaseVersion releaseVersion, CoroutineScope rootCoroutineScope, DxMessageHandler messageHandler, LazyMoshi moshi, DxWebsocketConnectionManager connectionManager) {
            Intrinsics.checkNotNullParameter(dxMarketdataApi, "dxMarketdataApi");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(connectionManager, "connectionManager");
            return new DxWebsocketSource(dxMarketdataApi, releaseVersion, rootCoroutineScope, messageHandler, moshi, connectionManager);
        }
    }
}
