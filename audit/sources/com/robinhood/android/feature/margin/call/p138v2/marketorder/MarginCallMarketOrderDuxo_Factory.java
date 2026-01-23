package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.equitytrade.EquityTradeService;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.OrderStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginCallMarketOrderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDuxo;", "equityTradeService", "Ljavax/inject/Provider;", "Lcom/robinhood/android/equities/equitytrade/EquityTradeService;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class MarginCallMarketOrderDuxo_Factory implements Factory<MarginCallMarketOrderDuxo> {
    private final Provider<BuySellStore> buySellStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EquityTradeService> equityTradeService;
    private final Provider<EventLogger> eventLogger;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<OrderStore> orderStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<MarginCallMarketOrderStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MarginCallMarketOrderDuxo_Factory create(Provider<EquityTradeService> provider, Provider<BuySellStore> provider2, Provider<OrderStore> provider3, Provider<EventLogger> provider4, Provider<MicrogramManager> provider5, Provider<DuxoBundle> provider6, Provider<MarginCallMarketOrderStateProvider> provider7, Provider<SavedStateHandle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final MarginCallMarketOrderDuxo newInstance(EquityTradeService equityTradeService, BuySellStore buySellStore, OrderStore orderStore, EventLogger eventLogger, MicrogramManager microgramManager, DuxoBundle duxoBundle, MarginCallMarketOrderStateProvider marginCallMarketOrderStateProvider, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(equityTradeService, buySellStore, orderStore, eventLogger, microgramManager, duxoBundle, marginCallMarketOrderStateProvider, savedStateHandle);
    }

    public MarginCallMarketOrderDuxo_Factory(Provider<EquityTradeService> equityTradeService, Provider<BuySellStore> buySellStore, Provider<OrderStore> orderStore, Provider<EventLogger> eventLogger, Provider<MicrogramManager> microgramManager, Provider<DuxoBundle> duxoBundle, Provider<MarginCallMarketOrderStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(equityTradeService, "equityTradeService");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.equityTradeService = equityTradeService;
        this.buySellStore = buySellStore;
        this.orderStore = orderStore;
        this.eventLogger = eventLogger;
        this.microgramManager = microgramManager;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public MarginCallMarketOrderDuxo get() {
        Companion companion = INSTANCE;
        EquityTradeService equityTradeService = this.equityTradeService.get();
        Intrinsics.checkNotNullExpressionValue(equityTradeService, "get(...)");
        BuySellStore buySellStore = this.buySellStore.get();
        Intrinsics.checkNotNullExpressionValue(buySellStore, "get(...)");
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        MarginCallMarketOrderStateProvider marginCallMarketOrderStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(marginCallMarketOrderStateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(equityTradeService, buySellStore, orderStore, eventLogger, microgramManager, duxoBundle, marginCallMarketOrderStateProvider, savedStateHandle);
    }

    /* compiled from: MarginCallMarketOrderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDuxo_Factory;", "equityTradeService", "Ljavax/inject/Provider;", "Lcom/robinhood/android/equities/equitytrade/EquityTradeService;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/feature/margin/call/v2/marketorder/MarginCallMarketOrderDuxo;", "feature-margin-call-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MarginCallMarketOrderDuxo_Factory create(Provider<EquityTradeService> equityTradeService, Provider<BuySellStore> buySellStore, Provider<OrderStore> orderStore, Provider<EventLogger> eventLogger, Provider<MicrogramManager> microgramManager, Provider<DuxoBundle> duxoBundle, Provider<MarginCallMarketOrderStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(equityTradeService, "equityTradeService");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MarginCallMarketOrderDuxo_Factory(equityTradeService, buySellStore, orderStore, eventLogger, microgramManager, duxoBundle, stateProvider, savedStateHandle);
        }

        @JvmStatic
        public final MarginCallMarketOrderDuxo newInstance(EquityTradeService equityTradeService, BuySellStore buySellStore, OrderStore orderStore, EventLogger eventLogger, MicrogramManager microgramManager, DuxoBundle duxoBundle, MarginCallMarketOrderStateProvider stateProvider, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(equityTradeService, "equityTradeService");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new MarginCallMarketOrderDuxo(equityTradeService, buySellStore, orderStore, eventLogger, microgramManager, duxoBundle, stateProvider, savedStateHandle);
        }
    }
}
