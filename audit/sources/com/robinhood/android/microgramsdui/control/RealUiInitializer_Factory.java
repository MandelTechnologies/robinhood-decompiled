package com.robinhood.android.microgramsdui.control;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.serialization.json.Json;
import microgram.android.HostMessageDispatcher;
import microgram.android.internal.InboundMessageRouter;

/* compiled from: RealUiInitializer_Factory.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B~\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00070\u0004\u0012\u0011\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00070\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u001f\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/RealUiInitializer_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/microgramsdui/control/RealUiInitializer;", "uiControllerCompletableDeferred", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/robinhood/android/microgramsdui/control/UiController;", "Lkotlin/jvm/JvmSuppressWildcards;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "inboundMessageRouter", "Lmicrogram/android/internal/InboundMessageRouter;", "json", "Lkotlinx/serialization/json/Json;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "legacyUiControllerProvider", "Lcom/robinhood/android/microgramsdui/control/LegacyUiController;", "idlUiControllerProvider", "Lcom/robinhood/android/microgramsdui/control/IdlUiController;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class RealUiInitializer_Factory implements Factory<UiInitializer2> {
    private final Provider<IdlUiController> idlUiControllerProvider;
    private final Provider<InboundMessageRouter> inboundMessageRouter;
    private final Provider<Json> json;
    private final Provider<LegacyUiController> legacyUiControllerProvider;
    private final Provider<HostMessageDispatcher> messageDispatcher;
    private final Provider<LazyMoshi> moshi;
    private final Provider<CompletableDeferred<UiController>> uiControllerCompletableDeferred;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RealUiInitializer_Factory create(Provider<CompletableDeferred<UiController>> provider, Provider<HostMessageDispatcher> provider2, Provider<InboundMessageRouter> provider3, Provider<Json> provider4, Provider<LazyMoshi> provider5, Provider<LegacyUiController> provider6, Provider<IdlUiController> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final UiInitializer2 newInstance(CompletableDeferred<UiController> completableDeferred, HostMessageDispatcher hostMessageDispatcher, InboundMessageRouter inboundMessageRouter, Json json, LazyMoshi lazyMoshi, Provider<LegacyUiController> provider, Provider<IdlUiController> provider2) {
        return INSTANCE.newInstance(completableDeferred, hostMessageDispatcher, inboundMessageRouter, json, lazyMoshi, provider, provider2);
    }

    public RealUiInitializer_Factory(Provider<CompletableDeferred<UiController>> uiControllerCompletableDeferred, Provider<HostMessageDispatcher> messageDispatcher, Provider<InboundMessageRouter> inboundMessageRouter, Provider<Json> json, Provider<LazyMoshi> moshi, Provider<LegacyUiController> legacyUiControllerProvider, Provider<IdlUiController> idlUiControllerProvider) {
        Intrinsics.checkNotNullParameter(uiControllerCompletableDeferred, "uiControllerCompletableDeferred");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(inboundMessageRouter, "inboundMessageRouter");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(legacyUiControllerProvider, "legacyUiControllerProvider");
        Intrinsics.checkNotNullParameter(idlUiControllerProvider, "idlUiControllerProvider");
        this.uiControllerCompletableDeferred = uiControllerCompletableDeferred;
        this.messageDispatcher = messageDispatcher;
        this.inboundMessageRouter = inboundMessageRouter;
        this.json = json;
        this.moshi = moshi;
        this.legacyUiControllerProvider = legacyUiControllerProvider;
        this.idlUiControllerProvider = idlUiControllerProvider;
    }

    @Override // javax.inject.Provider
    public UiInitializer2 get() {
        Companion companion = INSTANCE;
        CompletableDeferred<UiController> completableDeferred = this.uiControllerCompletableDeferred.get();
        Intrinsics.checkNotNullExpressionValue(completableDeferred, "get(...)");
        HostMessageDispatcher hostMessageDispatcher = this.messageDispatcher.get();
        Intrinsics.checkNotNullExpressionValue(hostMessageDispatcher, "get(...)");
        InboundMessageRouter inboundMessageRouter = this.inboundMessageRouter.get();
        Intrinsics.checkNotNullExpressionValue(inboundMessageRouter, "get(...)");
        Json json = this.json.get();
        Intrinsics.checkNotNullExpressionValue(json, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        return companion.newInstance(completableDeferred, hostMessageDispatcher, inboundMessageRouter, json, lazyMoshi, this.legacyUiControllerProvider, this.idlUiControllerProvider);
    }

    /* compiled from: RealUiInitializer_Factory.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u007f\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0011\u0010\u0013\u001a\r\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\n0\u00072\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0016¢\u0006\u0002\b\n0\u0007H\u0007Ja\u0010\u0017\u001a\u00020\u00182\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u0010\u0013\u001a\r\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\n0\u00072\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0016¢\u0006\u0002\b\n0\u0007H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/RealUiInitializer_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/microgramsdui/control/RealUiInitializer_Factory;", "uiControllerCompletableDeferred", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/robinhood/android/microgramsdui/control/UiController;", "Lkotlin/jvm/JvmSuppressWildcards;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "inboundMessageRouter", "Lmicrogram/android/internal/InboundMessageRouter;", "json", "Lkotlinx/serialization/json/Json;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "legacyUiControllerProvider", "Lcom/robinhood/android/microgramsdui/control/LegacyUiController;", "idlUiControllerProvider", "Lcom/robinhood/android/microgramsdui/control/IdlUiController;", "newInstance", "Lcom/robinhood/android/microgramsdui/control/RealUiInitializer;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealUiInitializer_Factory create(Provider<CompletableDeferred<UiController>> uiControllerCompletableDeferred, Provider<HostMessageDispatcher> messageDispatcher, Provider<InboundMessageRouter> inboundMessageRouter, Provider<Json> json, Provider<LazyMoshi> moshi, Provider<LegacyUiController> legacyUiControllerProvider, Provider<IdlUiController> idlUiControllerProvider) {
            Intrinsics.checkNotNullParameter(uiControllerCompletableDeferred, "uiControllerCompletableDeferred");
            Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
            Intrinsics.checkNotNullParameter(inboundMessageRouter, "inboundMessageRouter");
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(legacyUiControllerProvider, "legacyUiControllerProvider");
            Intrinsics.checkNotNullParameter(idlUiControllerProvider, "idlUiControllerProvider");
            return new RealUiInitializer_Factory(uiControllerCompletableDeferred, messageDispatcher, inboundMessageRouter, json, moshi, legacyUiControllerProvider, idlUiControllerProvider);
        }

        @JvmStatic
        public final UiInitializer2 newInstance(CompletableDeferred<UiController> uiControllerCompletableDeferred, HostMessageDispatcher messageDispatcher, InboundMessageRouter inboundMessageRouter, Json json, LazyMoshi moshi, Provider<LegacyUiController> legacyUiControllerProvider, Provider<IdlUiController> idlUiControllerProvider) {
            Intrinsics.checkNotNullParameter(uiControllerCompletableDeferred, "uiControllerCompletableDeferred");
            Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
            Intrinsics.checkNotNullParameter(inboundMessageRouter, "inboundMessageRouter");
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(legacyUiControllerProvider, "legacyUiControllerProvider");
            Intrinsics.checkNotNullParameter(idlUiControllerProvider, "idlUiControllerProvider");
            return new UiInitializer2(uiControllerCompletableDeferred, messageDispatcher, inboundMessageRouter, json, moshi, legacyUiControllerProvider, idlUiControllerProvider);
        }
    }
}
