package com.robinhood.websocket.p413md;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MdWebsocketSource_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/websocket/md/MdWebsocketSource_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/websocket/md/MdWebsocketSource;", "releaseVersion", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/ReleaseVersion;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageHandler", "Lcom/robinhood/websocket/md/MdMessageHandler;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "connectionManager", "Lcom/robinhood/websocket/md/MdWebsocketConnectionManager;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-websocket-md_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class MdWebsocketSource_Factory implements Factory<MdWebsocketSource> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<MdWebsocketConnectionManager> connectionManager;
    private final Provider<MdMessageHandler> messageHandler;
    private final Provider<LazyMoshi> moshi;
    private final Provider<ReleaseVersion> releaseVersion;
    private final Provider<CoroutineScope> rootCoroutineScope;
    private final Provider<TargetBackend> targetBackend;

    @JvmStatic
    public static final MdWebsocketSource_Factory create(Provider<ReleaseVersion> provider, Provider<CoroutineScope> provider2, Provider<MdMessageHandler> provider3, Provider<LazyMoshi> provider4, Provider<MdWebsocketConnectionManager> provider5, Provider<TargetBackend> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final MdWebsocketSource newInstance(ReleaseVersion releaseVersion, CoroutineScope coroutineScope, MdMessageHandler mdMessageHandler, LazyMoshi lazyMoshi, MdWebsocketConnectionManager mdWebsocketConnectionManager, TargetBackend targetBackend) {
        return INSTANCE.newInstance(releaseVersion, coroutineScope, mdMessageHandler, lazyMoshi, mdWebsocketConnectionManager, targetBackend);
    }

    public MdWebsocketSource_Factory(Provider<ReleaseVersion> releaseVersion, Provider<CoroutineScope> rootCoroutineScope, Provider<MdMessageHandler> messageHandler, Provider<LazyMoshi> moshi, Provider<MdWebsocketConnectionManager> connectionManager, Provider<TargetBackend> targetBackend) {
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(connectionManager, "connectionManager");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        this.releaseVersion = releaseVersion;
        this.rootCoroutineScope = rootCoroutineScope;
        this.messageHandler = messageHandler;
        this.moshi = moshi;
        this.connectionManager = connectionManager;
        this.targetBackend = targetBackend;
    }

    @Override // javax.inject.Provider
    public MdWebsocketSource get() {
        Companion companion = INSTANCE;
        ReleaseVersion releaseVersion = this.releaseVersion.get();
        Intrinsics.checkNotNullExpressionValue(releaseVersion, "get(...)");
        CoroutineScope coroutineScope = this.rootCoroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        MdMessageHandler mdMessageHandler = this.messageHandler.get();
        Intrinsics.checkNotNullExpressionValue(mdMessageHandler, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        MdWebsocketConnectionManager mdWebsocketConnectionManager = this.connectionManager.get();
        Intrinsics.checkNotNullExpressionValue(mdWebsocketConnectionManager, "get(...)");
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        return companion.newInstance(releaseVersion, coroutineScope, mdMessageHandler, lazyMoshi, mdWebsocketConnectionManager, targetBackend);
    }

    /* compiled from: MdWebsocketSource_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/websocket/md/MdWebsocketSource_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/websocket/md/MdWebsocketSource_Factory;", "releaseVersion", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/ReleaseVersion;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "messageHandler", "Lcom/robinhood/websocket/md/MdMessageHandler;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "connectionManager", "Lcom/robinhood/websocket/md/MdWebsocketConnectionManager;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "newInstance", "Lcom/robinhood/websocket/md/MdWebsocketSource;", "lib-websocket-md_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MdWebsocketSource_Factory create(Provider<ReleaseVersion> releaseVersion, Provider<CoroutineScope> rootCoroutineScope, Provider<MdMessageHandler> messageHandler, Provider<LazyMoshi> moshi, Provider<MdWebsocketConnectionManager> connectionManager, Provider<TargetBackend> targetBackend) {
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(connectionManager, "connectionManager");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            return new MdWebsocketSource_Factory(releaseVersion, rootCoroutineScope, messageHandler, moshi, connectionManager, targetBackend);
        }

        @JvmStatic
        public final MdWebsocketSource newInstance(ReleaseVersion releaseVersion, CoroutineScope rootCoroutineScope, MdMessageHandler messageHandler, LazyMoshi moshi, MdWebsocketConnectionManager connectionManager, TargetBackend targetBackend) {
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(connectionManager, "connectionManager");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            return new MdWebsocketSource(releaseVersion, rootCoroutineScope, messageHandler, moshi, connectionManager, targetBackend);
        }
    }
}
