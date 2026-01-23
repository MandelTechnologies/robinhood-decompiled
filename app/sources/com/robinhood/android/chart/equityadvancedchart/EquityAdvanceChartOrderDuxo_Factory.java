package com.robinhood.android.chart.equityadvancedchart;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager;
import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.equitytrade.EquityTradeService;
import com.robinhood.android.equities.equityupsell.EquityUpsellService;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountStore;
import com.robinhood.librobinhood.data.store.EquityOrderExpireDateStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore;
import com.robinhood.shared.equities.store.subzero.ShortingInfoStore;
import com.robinhood.shared.equities.store.subzero.SubzeroOnboardingHandler;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityAdvanceChartOrderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B×\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004¢\u0006\u0004\b4\u00105J\b\u00106\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDuxo;", "accountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "orderExpireDateStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "equityOrderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "optionUpgradePromotionStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;", "equityTradeService", "Lcom/robinhood/android/equities/equitytrade/EquityTradeService;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "tradeSettingsStore", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "shortingInfoStore", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "subzeroOnboardingHandler", "Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler;", "equityUpsellService", "Lcom/robinhood/android/equities/equityupsell/EquityUpsellService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-equity-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class EquityAdvanceChartOrderDuxo_Factory implements Factory<EquityAdvanceChartOrderDuxo> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AccountStore> accountStore;
    private final Provider<BuySellStore> buySellStore;
    private final Provider<BwWebViewManager> bwWebViewManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EquityOrderManager> equityOrderManager;
    private final Provider<EquityTradeService> equityTradeService;
    private final Provider<EquityUpsellService> equityUpsellService;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<NbboSummaryStore> nbboSummaryStore;
    private final Provider<OptionUpgradePromotionStore> optionUpgradePromotionStore;
    private final Provider<EquityOrderExpireDateStore> orderExpireDateStore;
    private final Provider<OrderStore> orderStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ShortingInfoStore> shortingInfoStore;
    private final Provider<EquityAdvanceChartOrderStateProvider> stateProvider;
    private final Provider<SubzeroOnboardingHandler> subzeroOnboardingHandler;
    private final Provider<TradeSettingsStore> tradeSettingsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EquityAdvanceChartOrderDuxo_Factory create(Provider<AccountStore> provider, Provider<TraderMarketHoursManager> provider2, Provider<EquityOrderExpireDateStore> provider3, Provider<PositionStore> provider4, Provider<InstrumentBuyingPowerStore> provider5, Provider<InstrumentStore> provider6, Provider<BwWebViewManager> provider7, Provider<AccountAccessStore> provider8, Provider<EquityOrderManager> provider9, Provider<SavedStateHandle> provider10, Provider<OrderStore> provider11, Provider<ExperimentsStore> provider12, Provider<NbboSummaryStore> provider13, Provider<OptionUpgradePromotionStore> provider14, Provider<EquityTradeService> provider15, Provider<EventLogger> provider16, Provider<TradeSettingsStore> provider17, Provider<RegionGateProvider> provider18, Provider<BuySellStore> provider19, Provider<ShortingInfoStore> provider20, Provider<SubzeroOnboardingHandler> provider21, Provider<EquityUpsellService> provider22, Provider<DuxoBundle> provider23, Provider<EquityAdvanceChartOrderStateProvider> provider24) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24);
    }

    @JvmStatic
    public static final EquityAdvanceChartOrderDuxo newInstance(AccountStore accountStore, TraderMarketHoursManager traderMarketHoursManager, EquityOrderExpireDateStore equityOrderExpireDateStore, PositionStore positionStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, InstrumentStore instrumentStore, BwWebViewManager bwWebViewManager, AccountAccessStore accountAccessStore, EquityOrderManager equityOrderManager, SavedStateHandle savedStateHandle, OrderStore orderStore, ExperimentsStore experimentsStore, NbboSummaryStore nbboSummaryStore, OptionUpgradePromotionStore optionUpgradePromotionStore, EquityTradeService equityTradeService, EventLogger eventLogger, TradeSettingsStore tradeSettingsStore, RegionGateProvider regionGateProvider, BuySellStore buySellStore, ShortingInfoStore shortingInfoStore, SubzeroOnboardingHandler subzeroOnboardingHandler, EquityUpsellService equityUpsellService, DuxoBundle duxoBundle, EquityAdvanceChartOrderStateProvider equityAdvanceChartOrderStateProvider) {
        return INSTANCE.newInstance(accountStore, traderMarketHoursManager, equityOrderExpireDateStore, positionStore, instrumentBuyingPowerStore, instrumentStore, bwWebViewManager, accountAccessStore, equityOrderManager, savedStateHandle, orderStore, experimentsStore, nbboSummaryStore, optionUpgradePromotionStore, equityTradeService, eventLogger, tradeSettingsStore, regionGateProvider, buySellStore, shortingInfoStore, subzeroOnboardingHandler, equityUpsellService, duxoBundle, equityAdvanceChartOrderStateProvider);
    }

    public EquityAdvanceChartOrderDuxo_Factory(Provider<AccountStore> accountStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<EquityOrderExpireDateStore> orderExpireDateStore, Provider<PositionStore> positionStore, Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore, Provider<InstrumentStore> instrumentStore, Provider<BwWebViewManager> bwWebViewManager, Provider<AccountAccessStore> accountAccessStore, Provider<EquityOrderManager> equityOrderManager, Provider<SavedStateHandle> savedStateHandle, Provider<OrderStore> orderStore, Provider<ExperimentsStore> experimentsStore, Provider<NbboSummaryStore> nbboSummaryStore, Provider<OptionUpgradePromotionStore> optionUpgradePromotionStore, Provider<EquityTradeService> equityTradeService, Provider<EventLogger> eventLogger, Provider<TradeSettingsStore> tradeSettingsStore, Provider<RegionGateProvider> regionGateProvider, Provider<BuySellStore> buySellStore, Provider<ShortingInfoStore> shortingInfoStore, Provider<SubzeroOnboardingHandler> subzeroOnboardingHandler, Provider<EquityUpsellService> equityUpsellService, Provider<DuxoBundle> duxoBundle, Provider<EquityAdvanceChartOrderStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(equityOrderManager, "equityOrderManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
        Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
        Intrinsics.checkNotNullParameter(equityTradeService, "equityTradeService");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
        Intrinsics.checkNotNullParameter(subzeroOnboardingHandler, "subzeroOnboardingHandler");
        Intrinsics.checkNotNullParameter(equityUpsellService, "equityUpsellService");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.accountStore = accountStore;
        this.marketHoursManager = marketHoursManager;
        this.orderExpireDateStore = orderExpireDateStore;
        this.positionStore = positionStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.instrumentStore = instrumentStore;
        this.bwWebViewManager = bwWebViewManager;
        this.accountAccessStore = accountAccessStore;
        this.equityOrderManager = equityOrderManager;
        this.savedStateHandle = savedStateHandle;
        this.orderStore = orderStore;
        this.experimentsStore = experimentsStore;
        this.nbboSummaryStore = nbboSummaryStore;
        this.optionUpgradePromotionStore = optionUpgradePromotionStore;
        this.equityTradeService = equityTradeService;
        this.eventLogger = eventLogger;
        this.tradeSettingsStore = tradeSettingsStore;
        this.regionGateProvider = regionGateProvider;
        this.buySellStore = buySellStore;
        this.shortingInfoStore = shortingInfoStore;
        this.subzeroOnboardingHandler = subzeroOnboardingHandler;
        this.equityUpsellService = equityUpsellService;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public EquityAdvanceChartOrderDuxo get() {
        Companion companion = INSTANCE;
        AccountStore accountStore = this.accountStore.get();
        Intrinsics.checkNotNullExpressionValue(accountStore, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        EquityOrderExpireDateStore equityOrderExpireDateStore = this.orderExpireDateStore.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderExpireDateStore, "get(...)");
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        InstrumentBuyingPowerStore instrumentBuyingPowerStore = this.instrumentBuyingPowerStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentBuyingPowerStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        BwWebViewManager bwWebViewManager = this.bwWebViewManager.get();
        Intrinsics.checkNotNullExpressionValue(bwWebViewManager, "get(...)");
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        EquityOrderManager equityOrderManager = this.equityOrderManager.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderManager, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        NbboSummaryStore nbboSummaryStore = this.nbboSummaryStore.get();
        Intrinsics.checkNotNullExpressionValue(nbboSummaryStore, "get(...)");
        OptionUpgradePromotionStore optionUpgradePromotionStore = this.optionUpgradePromotionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionUpgradePromotionStore, "get(...)");
        OptionUpgradePromotionStore optionUpgradePromotionStore2 = optionUpgradePromotionStore;
        EquityTradeService equityTradeService = this.equityTradeService.get();
        Intrinsics.checkNotNullExpressionValue(equityTradeService, "get(...)");
        EquityTradeService equityTradeService2 = equityTradeService;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        EventLogger eventLogger2 = eventLogger;
        TradeSettingsStore tradeSettingsStore = this.tradeSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(tradeSettingsStore, "get(...)");
        TradeSettingsStore tradeSettingsStore2 = tradeSettingsStore;
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        RegionGateProvider regionGateProvider2 = regionGateProvider;
        BuySellStore buySellStore = this.buySellStore.get();
        Intrinsics.checkNotNullExpressionValue(buySellStore, "get(...)");
        BuySellStore buySellStore2 = buySellStore;
        ShortingInfoStore shortingInfoStore = this.shortingInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(shortingInfoStore, "get(...)");
        ShortingInfoStore shortingInfoStore2 = shortingInfoStore;
        SubzeroOnboardingHandler subzeroOnboardingHandler = this.subzeroOnboardingHandler.get();
        Intrinsics.checkNotNullExpressionValue(subzeroOnboardingHandler, "get(...)");
        SubzeroOnboardingHandler subzeroOnboardingHandler2 = subzeroOnboardingHandler;
        EquityUpsellService equityUpsellService = this.equityUpsellService.get();
        Intrinsics.checkNotNullExpressionValue(equityUpsellService, "get(...)");
        EquityUpsellService equityUpsellService2 = equityUpsellService;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        EquityAdvanceChartOrderStateProvider equityAdvanceChartOrderStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(equityAdvanceChartOrderStateProvider, "get(...)");
        return companion.newInstance(accountStore, traderMarketHoursManager, equityOrderExpireDateStore, positionStore, instrumentBuyingPowerStore, instrumentStore, bwWebViewManager, accountAccessStore, equityOrderManager, savedStateHandle, orderStore, experimentsStore, nbboSummaryStore, optionUpgradePromotionStore2, equityTradeService2, eventLogger2, tradeSettingsStore2, regionGateProvider2, buySellStore2, shortingInfoStore2, subzeroOnboardingHandler2, equityUpsellService2, duxoBundle2, equityAdvanceChartOrderStateProvider);
    }

    /* compiled from: EquityAdvanceChartOrderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JØ\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00072\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00072\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0007H\u0007JÈ\u0001\u00107\u001a\u0002082\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0007¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDuxo_Factory;", "accountStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "orderExpireDateStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "equityOrderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "optionUpgradePromotionStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;", "equityTradeService", "Lcom/robinhood/android/equities/equitytrade/EquityTradeService;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "tradeSettingsStore", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "shortingInfoStore", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "subzeroOnboardingHandler", "Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler;", "equityUpsellService", "Lcom/robinhood/android/equities/equityupsell/EquityUpsellService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderStateProvider;", "newInstance", "Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDuxo;", "lib-equity-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityAdvanceChartOrderDuxo_Factory create(Provider<AccountStore> accountStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<EquityOrderExpireDateStore> orderExpireDateStore, Provider<PositionStore> positionStore, Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore, Provider<InstrumentStore> instrumentStore, Provider<BwWebViewManager> bwWebViewManager, Provider<AccountAccessStore> accountAccessStore, Provider<EquityOrderManager> equityOrderManager, Provider<SavedStateHandle> savedStateHandle, Provider<OrderStore> orderStore, Provider<ExperimentsStore> experimentsStore, Provider<NbboSummaryStore> nbboSummaryStore, Provider<OptionUpgradePromotionStore> optionUpgradePromotionStore, Provider<EquityTradeService> equityTradeService, Provider<EventLogger> eventLogger, Provider<TradeSettingsStore> tradeSettingsStore, Provider<RegionGateProvider> regionGateProvider, Provider<BuySellStore> buySellStore, Provider<ShortingInfoStore> shortingInfoStore, Provider<SubzeroOnboardingHandler> subzeroOnboardingHandler, Provider<EquityUpsellService> equityUpsellService, Provider<DuxoBundle> duxoBundle, Provider<EquityAdvanceChartOrderStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(accountStore, "accountStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(equityOrderManager, "equityOrderManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
            Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
            Intrinsics.checkNotNullParameter(equityTradeService, "equityTradeService");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
            Intrinsics.checkNotNullParameter(subzeroOnboardingHandler, "subzeroOnboardingHandler");
            Intrinsics.checkNotNullParameter(equityUpsellService, "equityUpsellService");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new EquityAdvanceChartOrderDuxo_Factory(accountStore, marketHoursManager, orderExpireDateStore, positionStore, instrumentBuyingPowerStore, instrumentStore, bwWebViewManager, accountAccessStore, equityOrderManager, savedStateHandle, orderStore, experimentsStore, nbboSummaryStore, optionUpgradePromotionStore, equityTradeService, eventLogger, tradeSettingsStore, regionGateProvider, buySellStore, shortingInfoStore, subzeroOnboardingHandler, equityUpsellService, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final EquityAdvanceChartOrderDuxo newInstance(AccountStore accountStore, TraderMarketHoursManager marketHoursManager, EquityOrderExpireDateStore orderExpireDateStore, PositionStore positionStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, InstrumentStore instrumentStore, BwWebViewManager bwWebViewManager, AccountAccessStore accountAccessStore, EquityOrderManager equityOrderManager, SavedStateHandle savedStateHandle, OrderStore orderStore, ExperimentsStore experimentsStore, NbboSummaryStore nbboSummaryStore, OptionUpgradePromotionStore optionUpgradePromotionStore, EquityTradeService equityTradeService, EventLogger eventLogger, TradeSettingsStore tradeSettingsStore, RegionGateProvider regionGateProvider, BuySellStore buySellStore, ShortingInfoStore shortingInfoStore, SubzeroOnboardingHandler subzeroOnboardingHandler, EquityUpsellService equityUpsellService, DuxoBundle duxoBundle, EquityAdvanceChartOrderStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(accountStore, "accountStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(equityOrderManager, "equityOrderManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
            Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
            Intrinsics.checkNotNullParameter(equityTradeService, "equityTradeService");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
            Intrinsics.checkNotNullParameter(subzeroOnboardingHandler, "subzeroOnboardingHandler");
            Intrinsics.checkNotNullParameter(equityUpsellService, "equityUpsellService");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new EquityAdvanceChartOrderDuxo(accountStore, marketHoursManager, orderExpireDateStore, positionStore, instrumentBuyingPowerStore, instrumentStore, bwWebViewManager, accountAccessStore, equityOrderManager, savedStateHandle, orderStore, experimentsStore, nbboSummaryStore, optionUpgradePromotionStore, equityTradeService, eventLogger, tradeSettingsStore, regionGateProvider, buySellStore, shortingInfoStore, subzeroOnboardingHandler, equityUpsellService, duxoBundle, stateProvider);
        }
    }
}
