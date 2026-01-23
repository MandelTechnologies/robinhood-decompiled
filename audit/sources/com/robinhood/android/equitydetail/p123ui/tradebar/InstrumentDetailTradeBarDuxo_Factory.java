package com.robinhood.android.equitydetail.p123ui.tradebar;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equitydetail.p123ui.tradebar.InstrumentDetailTradeBarDuxo_MembersInjector;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.tradingtrends.p264ui.details.TradingTrendsDetailsLogging;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.PriceBookExistenceStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.StockDetailStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.equities.models.instrumentdetails.store.FundamentalStore;
import dagger.internal.Factory;
import hippo.service.p470v1.UXFlagsService;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentDetailTradeBarDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u00ad\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004¢\u0006\u0004\b.\u0010/J\b\u00100\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "fundamentalsStore", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;", "instrumentAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionUpgradePromotionStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "priceBookExistenceStore", "Lcom/robinhood/librobinhood/data/store/PriceBookExistenceStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "stockDetailStore", "Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "subzeroFtuxSeenCountPref", "Lcom/robinhood/prefs/IntPreference;", "uxFlagsService", "Lhippo/service/v1/UXFlagsService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "hasVisitedEquityTradeFlowPref", "Lcom/robinhood/prefs/BooleanPreference;", "tradingTrendsDetailsLogging", "Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class InstrumentDetailTradeBarDuxo_Factory implements Factory<InstrumentDetailTradeBarDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<BuySellStore> buySellStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<FundamentalStore> fundamentalsStore;
    private final Provider<BooleanPreference> hasVisitedEquityTradeFlowPref;
    private final Provider<InstrumentAccountSwitcherStore> instrumentAccountSwitcherStore;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionPositionStore> optionPositionStore;
    private final Provider<OptionUpgradePromotionStore> optionUpgradePromotionStore;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<PositionStore> positionStore;
    private final Provider<PriceBookExistenceStore> priceBookExistenceStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<StockDetailStore> stockDetailStore;
    private final Provider<IntPreference> subzeroFtuxSeenCountPref;
    private final Provider<TradingTrendsDetailsLogging> tradingTrendsDetailsLogging;
    private final Provider<UXFlagsService> uxFlagsService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InstrumentDetailTradeBarDuxo_Factory create(Provider<AccountProvider> provider, Provider<AnalyticsLogger> provider2, Provider<EventLogger> provider3, Provider<ExperimentsStore> provider4, Provider<FundamentalStore> provider5, Provider<InstrumentAccountSwitcherStore> provider6, Provider<OptionChainStore> provider7, Provider<OptionPositionStore> provider8, Provider<OptionUpgradePromotionStore> provider9, Provider<PerformanceLogger> provider10, Provider<PriceBookExistenceStore> provider11, Provider<PositionStore> provider12, Provider<StockDetailStore> provider13, Provider<QuoteStore> provider14, Provider<BuySellStore> provider15, Provider<RegionGateProvider> provider16, Provider<IntPreference> provider17, Provider<UXFlagsService> provider18, Provider<DuxoBundle> provider19, Provider<BooleanPreference> provider20, Provider<TradingTrendsDetailsLogging> provider21) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21);
    }

    @JvmStatic
    public static final InstrumentDetailTradeBarDuxo newInstance(AccountProvider accountProvider, AnalyticsLogger analyticsLogger, EventLogger eventLogger, ExperimentsStore experimentsStore, FundamentalStore fundamentalStore, InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, OptionChainStore optionChainStore, OptionPositionStore optionPositionStore, OptionUpgradePromotionStore optionUpgradePromotionStore, PerformanceLogger performanceLogger, PriceBookExistenceStore priceBookExistenceStore, PositionStore positionStore, StockDetailStore stockDetailStore, QuoteStore quoteStore, BuySellStore buySellStore, RegionGateProvider regionGateProvider, IntPreference intPreference, UXFlagsService uXFlagsService, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountProvider, analyticsLogger, eventLogger, experimentsStore, fundamentalStore, instrumentAccountSwitcherStore, optionChainStore, optionPositionStore, optionUpgradePromotionStore, performanceLogger, priceBookExistenceStore, positionStore, stockDetailStore, quoteStore, buySellStore, regionGateProvider, intPreference, uXFlagsService, duxoBundle);
    }

    public InstrumentDetailTradeBarDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<FundamentalStore> fundamentalsStore, Provider<InstrumentAccountSwitcherStore> instrumentAccountSwitcherStore, Provider<OptionChainStore> optionChainStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionUpgradePromotionStore> optionUpgradePromotionStore, Provider<PerformanceLogger> performanceLogger, Provider<PriceBookExistenceStore> priceBookExistenceStore, Provider<PositionStore> positionStore, Provider<StockDetailStore> stockDetailStore, Provider<QuoteStore> quoteStore, Provider<BuySellStore> buySellStore, Provider<RegionGateProvider> regionGateProvider, Provider<IntPreference> subzeroFtuxSeenCountPref, Provider<UXFlagsService> uxFlagsService, Provider<DuxoBundle> duxoBundle, Provider<BooleanPreference> hasVisitedEquityTradeFlowPref, Provider<TradingTrendsDetailsLogging> tradingTrendsDetailsLogging) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(fundamentalsStore, "fundamentalsStore");
        Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(priceBookExistenceStore, "priceBookExistenceStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(stockDetailStore, "stockDetailStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(subzeroFtuxSeenCountPref, "subzeroFtuxSeenCountPref");
        Intrinsics.checkNotNullParameter(uxFlagsService, "uxFlagsService");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(hasVisitedEquityTradeFlowPref, "hasVisitedEquityTradeFlowPref");
        Intrinsics.checkNotNullParameter(tradingTrendsDetailsLogging, "tradingTrendsDetailsLogging");
        this.accountProvider = accountProvider;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.fundamentalsStore = fundamentalsStore;
        this.instrumentAccountSwitcherStore = instrumentAccountSwitcherStore;
        this.optionChainStore = optionChainStore;
        this.optionPositionStore = optionPositionStore;
        this.optionUpgradePromotionStore = optionUpgradePromotionStore;
        this.performanceLogger = performanceLogger;
        this.priceBookExistenceStore = priceBookExistenceStore;
        this.positionStore = positionStore;
        this.stockDetailStore = stockDetailStore;
        this.quoteStore = quoteStore;
        this.buySellStore = buySellStore;
        this.regionGateProvider = regionGateProvider;
        this.subzeroFtuxSeenCountPref = subzeroFtuxSeenCountPref;
        this.uxFlagsService = uxFlagsService;
        this.duxoBundle = duxoBundle;
        this.hasVisitedEquityTradeFlowPref = hasVisitedEquityTradeFlowPref;
        this.tradingTrendsDetailsLogging = tradingTrendsDetailsLogging;
    }

    @Override // javax.inject.Provider
    public InstrumentDetailTradeBarDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        FundamentalStore fundamentalStore = this.fundamentalsStore.get();
        Intrinsics.checkNotNullExpressionValue(fundamentalStore, "get(...)");
        InstrumentAccountSwitcherStore instrumentAccountSwitcherStore = this.instrumentAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentAccountSwitcherStore, "get(...)");
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        OptionPositionStore optionPositionStore = this.optionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionPositionStore, "get(...)");
        OptionUpgradePromotionStore optionUpgradePromotionStore = this.optionUpgradePromotionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionUpgradePromotionStore, "get(...)");
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        PriceBookExistenceStore priceBookExistenceStore = this.priceBookExistenceStore.get();
        Intrinsics.checkNotNullExpressionValue(priceBookExistenceStore, "get(...)");
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        StockDetailStore stockDetailStore = this.stockDetailStore.get();
        Intrinsics.checkNotNullExpressionValue(stockDetailStore, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        QuoteStore quoteStore2 = quoteStore;
        BuySellStore buySellStore = this.buySellStore.get();
        Intrinsics.checkNotNullExpressionValue(buySellStore, "get(...)");
        BuySellStore buySellStore2 = buySellStore;
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        RegionGateProvider regionGateProvider2 = regionGateProvider;
        IntPreference intPreference = this.subzeroFtuxSeenCountPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        IntPreference intPreference2 = intPreference;
        UXFlagsService uXFlagsService = this.uxFlagsService.get();
        Intrinsics.checkNotNullExpressionValue(uXFlagsService, "get(...)");
        UXFlagsService uXFlagsService2 = uXFlagsService;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxoNewInstance = companion.newInstance(accountProvider, analyticsLogger, eventLogger, experimentsStore, fundamentalStore, instrumentAccountSwitcherStore, optionChainStore, optionPositionStore, optionUpgradePromotionStore, performanceLogger, priceBookExistenceStore, positionStore, stockDetailStore, quoteStore2, buySellStore2, regionGateProvider2, intPreference2, uXFlagsService2, duxoBundle);
        InstrumentDetailTradeBarDuxo_MembersInjector.Companion companion2 = InstrumentDetailTradeBarDuxo_MembersInjector.INSTANCE;
        BooleanPreference booleanPreference = this.hasVisitedEquityTradeFlowPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectHasVisitedEquityTradeFlowPref(instrumentDetailTradeBarDuxoNewInstance, booleanPreference);
        TradingTrendsDetailsLogging tradingTrendsDetailsLogging = this.tradingTrendsDetailsLogging.get();
        Intrinsics.checkNotNullExpressionValue(tradingTrendsDetailsLogging, "get(...)");
        companion2.injectTradingTrendsDetailsLogging(instrumentDetailTradeBarDuxoNewInstance, tradingTrendsDetailsLogging);
        return instrumentDetailTradeBarDuxoNewInstance;
    }

    /* compiled from: InstrumentDetailTradeBarDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J®\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00072\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0007H\u0007J \u0001\u00101\u001a\u0002022\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0007¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "fundamentalsStore", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;", "instrumentAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionUpgradePromotionStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "priceBookExistenceStore", "Lcom/robinhood/librobinhood/data/store/PriceBookExistenceStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "stockDetailStore", "Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "subzeroFtuxSeenCountPref", "Lcom/robinhood/prefs/IntPreference;", "uxFlagsService", "Lhippo/service/v1/UXFlagsService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "hasVisitedEquityTradeFlowPref", "Lcom/robinhood/prefs/BooleanPreference;", "tradingTrendsDetailsLogging", "Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;", "newInstance", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarDuxo;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InstrumentDetailTradeBarDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AnalyticsLogger> analytics, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<FundamentalStore> fundamentalsStore, Provider<InstrumentAccountSwitcherStore> instrumentAccountSwitcherStore, Provider<OptionChainStore> optionChainStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionUpgradePromotionStore> optionUpgradePromotionStore, Provider<PerformanceLogger> performanceLogger, Provider<PriceBookExistenceStore> priceBookExistenceStore, Provider<PositionStore> positionStore, Provider<StockDetailStore> stockDetailStore, Provider<QuoteStore> quoteStore, Provider<BuySellStore> buySellStore, Provider<RegionGateProvider> regionGateProvider, Provider<IntPreference> subzeroFtuxSeenCountPref, Provider<UXFlagsService> uxFlagsService, Provider<DuxoBundle> duxoBundle, Provider<BooleanPreference> hasVisitedEquityTradeFlowPref, Provider<TradingTrendsDetailsLogging> tradingTrendsDetailsLogging) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(fundamentalsStore, "fundamentalsStore");
            Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(priceBookExistenceStore, "priceBookExistenceStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(stockDetailStore, "stockDetailStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(subzeroFtuxSeenCountPref, "subzeroFtuxSeenCountPref");
            Intrinsics.checkNotNullParameter(uxFlagsService, "uxFlagsService");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(hasVisitedEquityTradeFlowPref, "hasVisitedEquityTradeFlowPref");
            Intrinsics.checkNotNullParameter(tradingTrendsDetailsLogging, "tradingTrendsDetailsLogging");
            return new InstrumentDetailTradeBarDuxo_Factory(accountProvider, analytics, eventLogger, experimentsStore, fundamentalsStore, instrumentAccountSwitcherStore, optionChainStore, optionPositionStore, optionUpgradePromotionStore, performanceLogger, priceBookExistenceStore, positionStore, stockDetailStore, quoteStore, buySellStore, regionGateProvider, subzeroFtuxSeenCountPref, uxFlagsService, duxoBundle, hasVisitedEquityTradeFlowPref, tradingTrendsDetailsLogging);
        }

        @JvmStatic
        public final InstrumentDetailTradeBarDuxo newInstance(AccountProvider accountProvider, AnalyticsLogger analytics, EventLogger eventLogger, ExperimentsStore experimentsStore, FundamentalStore fundamentalsStore, InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, OptionChainStore optionChainStore, OptionPositionStore optionPositionStore, OptionUpgradePromotionStore optionUpgradePromotionStore, PerformanceLogger performanceLogger, PriceBookExistenceStore priceBookExistenceStore, PositionStore positionStore, StockDetailStore stockDetailStore, QuoteStore quoteStore, BuySellStore buySellStore, RegionGateProvider regionGateProvider, IntPreference subzeroFtuxSeenCountPref, UXFlagsService uxFlagsService, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(fundamentalsStore, "fundamentalsStore");
            Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(priceBookExistenceStore, "priceBookExistenceStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(stockDetailStore, "stockDetailStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(subzeroFtuxSeenCountPref, "subzeroFtuxSeenCountPref");
            Intrinsics.checkNotNullParameter(uxFlagsService, "uxFlagsService");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new InstrumentDetailTradeBarDuxo(accountProvider, analytics, eventLogger, experimentsStore, fundamentalsStore, instrumentAccountSwitcherStore, optionChainStore, optionPositionStore, optionUpgradePromotionStore, performanceLogger, priceBookExistenceStore, positionStore, stockDetailStore, quoteStore, buySellStore, regionGateProvider, subzeroFtuxSeenCountPref, uxFlagsService, duxoBundle);
        }
    }
}
