package com.robinhood.android.futures.trade.p147ui.orderform;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.futures.trade.order.FuturesOrderManager;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.arsenal.FuturesTradingHoursStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.websocket.p410dx.DxWebsocketSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderFormDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BÙ\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004¢\u0006\u0004\b\"\u0010#J\b\u0010$\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDuxo;", "ceres", "Ljavax/inject/Provider;", "Lcom/robinhood/ceres/v1/Ceres;", "dxWebsocketSource", "Lcom/robinhood/websocket/dx/DxWebsocketSource;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresOrderManager", "Lcom/robinhood/android/futures/trade/order/FuturesOrderManager;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresTradingHoursStore", "Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "context", "Landroid/content/Context;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class FuturesOrderFormDuxo_Factory implements Factory<FuturesOrderFormDuxo> {
    private final Provider<Ceres> ceres;
    private final Provider<Context> context;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<DxWebsocketSource> dxWebsocketSource;
    private final Provider<EventLogger> eventLogger;
    private final Provider<FuturesAccountStore> futuresAccountStore;
    private final Provider<FuturesContractStore> futuresContractStore;
    private final Provider<FuturesOrderManager> futuresOrderManager;
    private final Provider<FuturesQuoteStore> futuresQuoteStore;
    private final Provider<FuturesTradingHoursStore> futuresTradingHoursStore;
    private final Provider<MarginSubscriptionStore> marginSubscriptionStore;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<LazyMoshi> moshi;
    private final Provider<Navigator> navigator;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FuturesOrderFormDuxo_Factory create(Provider<Ceres> provider, Provider<DxWebsocketSource> provider2, Provider<EventLogger> provider3, Provider<FuturesAccountStore> provider4, Provider<FuturesContractStore> provider5, Provider<FuturesOrderManager> provider6, Provider<FuturesQuoteStore> provider7, Provider<FuturesTradingHoursStore> provider8, Provider<MarginSubscriptionStore> provider9, Provider<Context> provider10, Provider<MicrogramManager> provider11, Provider<LazyMoshi> provider12, Provider<Navigator> provider13, Provider<SavedStateHandle> provider14, Provider<DuxoBundle> provider15) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    @JvmStatic
    public static final FuturesOrderFormDuxo newInstance(Ceres ceres, DxWebsocketSource dxWebsocketSource, EventLogger eventLogger, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, FuturesOrderManager futuresOrderManager, FuturesQuoteStore futuresQuoteStore, FuturesTradingHoursStore futuresTradingHoursStore, MarginSubscriptionStore marginSubscriptionStore, Context context, MicrogramManager microgramManager, LazyMoshi lazyMoshi, Navigator navigator, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(ceres, dxWebsocketSource, eventLogger, futuresAccountStore, futuresContractStore, futuresOrderManager, futuresQuoteStore, futuresTradingHoursStore, marginSubscriptionStore, context, microgramManager, lazyMoshi, navigator, savedStateHandle, duxoBundle);
    }

    public FuturesOrderFormDuxo_Factory(Provider<Ceres> ceres, Provider<DxWebsocketSource> dxWebsocketSource, Provider<EventLogger> eventLogger, Provider<FuturesAccountStore> futuresAccountStore, Provider<FuturesContractStore> futuresContractStore, Provider<FuturesOrderManager> futuresOrderManager, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesTradingHoursStore> futuresTradingHoursStore, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<Context> context, Provider<MicrogramManager> microgramManager, Provider<LazyMoshi> moshi, Provider<Navigator> navigator, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(dxWebsocketSource, "dxWebsocketSource");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(futuresOrderManager, "futuresOrderManager");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(futuresTradingHoursStore, "futuresTradingHoursStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.ceres = ceres;
        this.dxWebsocketSource = dxWebsocketSource;
        this.eventLogger = eventLogger;
        this.futuresAccountStore = futuresAccountStore;
        this.futuresContractStore = futuresContractStore;
        this.futuresOrderManager = futuresOrderManager;
        this.futuresQuoteStore = futuresQuoteStore;
        this.futuresTradingHoursStore = futuresTradingHoursStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.context = context;
        this.microgramManager = microgramManager;
        this.moshi = moshi;
        this.navigator = navigator;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public FuturesOrderFormDuxo get() {
        Companion companion = INSTANCE;
        Ceres ceres = this.ceres.get();
        Intrinsics.checkNotNullExpressionValue(ceres, "get(...)");
        DxWebsocketSource dxWebsocketSource = this.dxWebsocketSource.get();
        Intrinsics.checkNotNullExpressionValue(dxWebsocketSource, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresAccountStore, "get(...)");
        FuturesContractStore futuresContractStore = this.futuresContractStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresContractStore, "get(...)");
        FuturesOrderManager futuresOrderManager = this.futuresOrderManager.get();
        Intrinsics.checkNotNullExpressionValue(futuresOrderManager, "get(...)");
        FuturesQuoteStore futuresQuoteStore = this.futuresQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresQuoteStore, "get(...)");
        FuturesTradingHoursStore futuresTradingHoursStore = this.futuresTradingHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(futuresTradingHoursStore, "get(...)");
        MarginSubscriptionStore marginSubscriptionStore = this.marginSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionStore, "get(...)");
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SavedStateHandle savedStateHandle2 = savedStateHandle;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(ceres, dxWebsocketSource, eventLogger, futuresAccountStore, futuresContractStore, futuresOrderManager, futuresQuoteStore, futuresTradingHoursStore, marginSubscriptionStore, context, microgramManager, lazyMoshi, navigator, savedStateHandle2, duxoBundle);
    }

    /* compiled from: FuturesOrderFormDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÚ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0007H\u0007J\u0080\u0001\u0010%\u001a\u00020&2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDuxo_Factory;", "ceres", "Ljavax/inject/Provider;", "Lcom/robinhood/ceres/v1/Ceres;", "dxWebsocketSource", "Lcom/robinhood/websocket/dx/DxWebsocketSource;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresOrderManager", "Lcom/robinhood/android/futures/trade/order/FuturesOrderManager;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresTradingHoursStore", "Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "context", "Landroid/content/Context;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDuxo;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesOrderFormDuxo_Factory create(Provider<Ceres> ceres, Provider<DxWebsocketSource> dxWebsocketSource, Provider<EventLogger> eventLogger, Provider<FuturesAccountStore> futuresAccountStore, Provider<FuturesContractStore> futuresContractStore, Provider<FuturesOrderManager> futuresOrderManager, Provider<FuturesQuoteStore> futuresQuoteStore, Provider<FuturesTradingHoursStore> futuresTradingHoursStore, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<Context> context, Provider<MicrogramManager> microgramManager, Provider<LazyMoshi> moshi, Provider<Navigator> navigator, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(ceres, "ceres");
            Intrinsics.checkNotNullParameter(dxWebsocketSource, "dxWebsocketSource");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            Intrinsics.checkNotNullParameter(futuresOrderManager, "futuresOrderManager");
            Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
            Intrinsics.checkNotNullParameter(futuresTradingHoursStore, "futuresTradingHoursStore");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FuturesOrderFormDuxo_Factory(ceres, dxWebsocketSource, eventLogger, futuresAccountStore, futuresContractStore, futuresOrderManager, futuresQuoteStore, futuresTradingHoursStore, marginSubscriptionStore, context, microgramManager, moshi, navigator, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final FuturesOrderFormDuxo newInstance(Ceres ceres, DxWebsocketSource dxWebsocketSource, EventLogger eventLogger, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, FuturesOrderManager futuresOrderManager, FuturesQuoteStore futuresQuoteStore, FuturesTradingHoursStore futuresTradingHoursStore, MarginSubscriptionStore marginSubscriptionStore, Context context, MicrogramManager microgramManager, LazyMoshi moshi, Navigator navigator, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(ceres, "ceres");
            Intrinsics.checkNotNullParameter(dxWebsocketSource, "dxWebsocketSource");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
            Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
            Intrinsics.checkNotNullParameter(futuresOrderManager, "futuresOrderManager");
            Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
            Intrinsics.checkNotNullParameter(futuresTradingHoursStore, "futuresTradingHoursStore");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new FuturesOrderFormDuxo(ceres, dxWebsocketSource, eventLogger, futuresAccountStore, futuresContractStore, futuresOrderManager, futuresQuoteStore, futuresTradingHoursStore, marginSubscriptionStore, context, microgramManager, moshi, navigator, savedStateHandle, duxoBundle);
        }
    }
}
