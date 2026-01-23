package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.store.options.combo.ComboOrderStore;
import com.robinhood.android.tradingtrends.p264ui.details.TradingTrendsDetailsLogging;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.DividendStore;
import com.robinhood.librobinhood.data.store.EquityDetailNuxStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuickTradeAmountsStore;
import com.robinhood.librobinhood.data.store.bonfire.StockDetailStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureStore;
import com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore;
import com.robinhood.store.base.InvestmentScheduleEventStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentDetailListParentFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;Bå\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailListParentFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailListParentFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "listItemIdToUserListIdsStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "stockDetailStore", "Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "instrumentAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "investmentScheduleEventStore", "Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "comboOrderStore", "Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "quickTradeAmountsStore", "Lcom/robinhood/librobinhood/data/store/QuickTradeAmountsStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "dividendStore", "Lcom/robinhood/librobinhood/data/store/DividendStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "breadcrumbTracker", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbTracker;", "infoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "equityDetailNuxStore", "Lcom/robinhood/librobinhood/data/store/EquityDetailNuxStore;", "tradingTrendsDetailsLogging", "Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;", "pipSupportStore", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class InstrumentDetailListParentFragment_MembersInjector implements MembersInjector<InstrumentDetailListParentFragment> {
    private final Provider<AggregateOptionPositionStore> aggregateOptionPositionStore;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<BalancesStore> balancesStore;
    private final Provider<SupportBreadcrumbTracker> breadcrumbTracker;
    private final Provider<BwWebViewManager> bwWebViewManager;
    private final Provider<ComboOrderStore> comboOrderStore;
    private final Provider<DividendStore> dividendStore;
    private final Provider<EquityDetailNuxStore> equityDetailNuxStore;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentStore;
    private final Provider<IacInfoBannerStore> infoBannerStore;
    private final Provider<InstrumentAccountSwitcherStore> instrumentAccountSwitcherStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<InvestmentScheduleEventStore> investmentScheduleEventStore;
    private final Provider<ListItemIdToUserListIdsStore> listItemIdToUserListIdsStore;
    private final Provider<OptionOrderStore> optionOrderStore;
    private final Provider<OptionPositionStore> optionPositionStore;
    private final Provider<OrderStore> orderStore;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<PictureInPictureStore> pipSupportStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<QuickTradeAmountsStore> quickTradeAmountsStore;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<StockDetailStore> stockDetailStore;
    private final Provider<TradingTrendsDetailsLogging> tradingTrendsDetailsLogging;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<InstrumentDetailListParentFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AggregateOptionPositionStore> provider2, Provider<ListItemIdToUserListIdsStore> provider3, Provider<InstrumentStore> provider4, Provider<StockDetailStore> provider5, Provider<InstrumentAccountSwitcherStore> provider6, Provider<InvestmentScheduleEventStore> provider7, Provider<BalancesStore> provider8, Provider<OrderStore> provider9, Provider<OptionOrderStore> provider10, Provider<ComboOrderStore> provider11, Provider<OptionPositionStore> provider12, Provider<QuickTradeAmountsStore> provider13, Provider<PositionStore> provider14, Provider<DividendStore> provider15, Provider<AnalyticsLogger> provider16, Provider<SupportBreadcrumbTracker> provider17, Provider<IacInfoBannerStore> provider18, Provider<PerformanceLogger> provider19, Provider<EventLogger> provider20, Provider<EquityDetailNuxStore> provider21, Provider<TradingTrendsDetailsLogging> provider22, Provider<PictureInPictureStore> provider23, Provider<ExperimentsStore> provider24, Provider<BwWebViewManager> provider25) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25);
    }

    @JvmStatic
    public static final void injectAggregateOptionPositionStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, AggregateOptionPositionStore aggregateOptionPositionStore) {
        INSTANCE.injectAggregateOptionPositionStore(instrumentDetailListParentFragment, aggregateOptionPositionStore);
    }

    @JvmStatic
    public static final void injectAnalytics(InstrumentDetailListParentFragment instrumentDetailListParentFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(instrumentDetailListParentFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectBalancesStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, BalancesStore balancesStore) {
        INSTANCE.injectBalancesStore(instrumentDetailListParentFragment, balancesStore);
    }

    @JvmStatic
    public static final void injectBreadcrumbTracker(InstrumentDetailListParentFragment instrumentDetailListParentFragment, SupportBreadcrumbTracker supportBreadcrumbTracker) {
        INSTANCE.injectBreadcrumbTracker(instrumentDetailListParentFragment, supportBreadcrumbTracker);
    }

    @JvmStatic
    public static final void injectBwWebViewManager(InstrumentDetailListParentFragment instrumentDetailListParentFragment, BwWebViewManager bwWebViewManager) {
        INSTANCE.injectBwWebViewManager(instrumentDetailListParentFragment, bwWebViewManager);
    }

    @JvmStatic
    public static final void injectComboOrderStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, ComboOrderStore comboOrderStore) {
        INSTANCE.injectComboOrderStore(instrumentDetailListParentFragment, comboOrderStore);
    }

    @JvmStatic
    public static final void injectDividendStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, DividendStore dividendStore) {
        INSTANCE.injectDividendStore(instrumentDetailListParentFragment, dividendStore);
    }

    @JvmStatic
    public static final void injectEquityDetailNuxStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, EquityDetailNuxStore equityDetailNuxStore) {
        INSTANCE.injectEquityDetailNuxStore(instrumentDetailListParentFragment, equityDetailNuxStore);
    }

    @JvmStatic
    public static final void injectEventLogger(InstrumentDetailListParentFragment instrumentDetailListParentFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(instrumentDetailListParentFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectExperimentStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentStore(instrumentDetailListParentFragment, experimentsStore);
    }

    @JvmStatic
    public static final void injectInfoBannerStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, IacInfoBannerStore iacInfoBannerStore) {
        INSTANCE.injectInfoBannerStore(instrumentDetailListParentFragment, iacInfoBannerStore);
    }

    @JvmStatic
    public static final void injectInstrumentAccountSwitcherStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, InstrumentAccountSwitcherStore instrumentAccountSwitcherStore) {
        INSTANCE.injectInstrumentAccountSwitcherStore(instrumentDetailListParentFragment, instrumentAccountSwitcherStore);
    }

    @JvmStatic
    public static final void injectInstrumentStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, InstrumentStore instrumentStore) {
        INSTANCE.injectInstrumentStore(instrumentDetailListParentFragment, instrumentStore);
    }

    @JvmStatic
    public static final void injectInvestmentScheduleEventStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, InvestmentScheduleEventStore investmentScheduleEventStore) {
        INSTANCE.injectInvestmentScheduleEventStore(instrumentDetailListParentFragment, investmentScheduleEventStore);
    }

    @JvmStatic
    public static final void injectListItemIdToUserListIdsStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, ListItemIdToUserListIdsStore listItemIdToUserListIdsStore) {
        INSTANCE.injectListItemIdToUserListIdsStore(instrumentDetailListParentFragment, listItemIdToUserListIdsStore);
    }

    @JvmStatic
    public static final void injectOptionOrderStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, OptionOrderStore optionOrderStore) {
        INSTANCE.injectOptionOrderStore(instrumentDetailListParentFragment, optionOrderStore);
    }

    @JvmStatic
    public static final void injectOptionPositionStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, OptionPositionStore optionPositionStore) {
        INSTANCE.injectOptionPositionStore(instrumentDetailListParentFragment, optionPositionStore);
    }

    @JvmStatic
    public static final void injectOrderStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, OrderStore orderStore) {
        INSTANCE.injectOrderStore(instrumentDetailListParentFragment, orderStore);
    }

    @JvmStatic
    public static final void injectPerformanceLogger(InstrumentDetailListParentFragment instrumentDetailListParentFragment, PerformanceLogger performanceLogger) {
        INSTANCE.injectPerformanceLogger(instrumentDetailListParentFragment, performanceLogger);
    }

    @JvmStatic
    public static final void injectPipSupportStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, PictureInPictureStore pictureInPictureStore) {
        INSTANCE.injectPipSupportStore(instrumentDetailListParentFragment, pictureInPictureStore);
    }

    @JvmStatic
    public static final void injectPositionStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, PositionStore positionStore) {
        INSTANCE.injectPositionStore(instrumentDetailListParentFragment, positionStore);
    }

    @JvmStatic
    public static final void injectQuickTradeAmountsStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, QuickTradeAmountsStore quickTradeAmountsStore) {
        INSTANCE.injectQuickTradeAmountsStore(instrumentDetailListParentFragment, quickTradeAmountsStore);
    }

    @JvmStatic
    public static final void injectStockDetailStore(InstrumentDetailListParentFragment instrumentDetailListParentFragment, StockDetailStore stockDetailStore) {
        INSTANCE.injectStockDetailStore(instrumentDetailListParentFragment, stockDetailStore);
    }

    @JvmStatic
    public static final void injectTradingTrendsDetailsLogging(InstrumentDetailListParentFragment instrumentDetailListParentFragment, TradingTrendsDetailsLogging tradingTrendsDetailsLogging) {
        INSTANCE.injectTradingTrendsDetailsLogging(instrumentDetailListParentFragment, tradingTrendsDetailsLogging);
    }

    public InstrumentDetailListParentFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<ListItemIdToUserListIdsStore> listItemIdToUserListIdsStore, Provider<InstrumentStore> instrumentStore, Provider<StockDetailStore> stockDetailStore, Provider<InstrumentAccountSwitcherStore> instrumentAccountSwitcherStore, Provider<InvestmentScheduleEventStore> investmentScheduleEventStore, Provider<BalancesStore> balancesStore, Provider<OrderStore> orderStore, Provider<OptionOrderStore> optionOrderStore, Provider<ComboOrderStore> comboOrderStore, Provider<OptionPositionStore> optionPositionStore, Provider<QuickTradeAmountsStore> quickTradeAmountsStore, Provider<PositionStore> positionStore, Provider<DividendStore> dividendStore, Provider<AnalyticsLogger> analytics, Provider<SupportBreadcrumbTracker> breadcrumbTracker, Provider<IacInfoBannerStore> infoBannerStore, Provider<PerformanceLogger> performanceLogger, Provider<EventLogger> eventLogger, Provider<EquityDetailNuxStore> equityDetailNuxStore, Provider<TradingTrendsDetailsLogging> tradingTrendsDetailsLogging, Provider<PictureInPictureStore> pipSupportStore, Provider<ExperimentsStore> experimentStore, Provider<BwWebViewManager> bwWebViewManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(listItemIdToUserListIdsStore, "listItemIdToUserListIdsStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(stockDetailStore, "stockDetailStore");
        Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(quickTradeAmountsStore, "quickTradeAmountsStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(dividendStore, "dividendStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(breadcrumbTracker, "breadcrumbTracker");
        Intrinsics.checkNotNullParameter(infoBannerStore, "infoBannerStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(equityDetailNuxStore, "equityDetailNuxStore");
        Intrinsics.checkNotNullParameter(tradingTrendsDetailsLogging, "tradingTrendsDetailsLogging");
        Intrinsics.checkNotNullParameter(pipSupportStore, "pipSupportStore");
        Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
        Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
        this.singletons = singletons;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.listItemIdToUserListIdsStore = listItemIdToUserListIdsStore;
        this.instrumentStore = instrumentStore;
        this.stockDetailStore = stockDetailStore;
        this.instrumentAccountSwitcherStore = instrumentAccountSwitcherStore;
        this.investmentScheduleEventStore = investmentScheduleEventStore;
        this.balancesStore = balancesStore;
        this.orderStore = orderStore;
        this.optionOrderStore = optionOrderStore;
        this.comboOrderStore = comboOrderStore;
        this.optionPositionStore = optionPositionStore;
        this.quickTradeAmountsStore = quickTradeAmountsStore;
        this.positionStore = positionStore;
        this.dividendStore = dividendStore;
        this.analytics = analytics;
        this.breadcrumbTracker = breadcrumbTracker;
        this.infoBannerStore = infoBannerStore;
        this.performanceLogger = performanceLogger;
        this.eventLogger = eventLogger;
        this.equityDetailNuxStore = equityDetailNuxStore;
        this.tradingTrendsDetailsLogging = tradingTrendsDetailsLogging;
        this.pipSupportStore = pipSupportStore;
        this.experimentStore = experimentStore;
        this.bwWebViewManager = bwWebViewManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InstrumentDetailListParentFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionPositionStore, "get(...)");
        companion2.injectAggregateOptionPositionStore(instance, aggregateOptionPositionStore);
        ListItemIdToUserListIdsStore listItemIdToUserListIdsStore = this.listItemIdToUserListIdsStore.get();
        Intrinsics.checkNotNullExpressionValue(listItemIdToUserListIdsStore, "get(...)");
        companion2.injectListItemIdToUserListIdsStore(instance, listItemIdToUserListIdsStore);
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        companion2.injectInstrumentStore(instance, instrumentStore);
        StockDetailStore stockDetailStore = this.stockDetailStore.get();
        Intrinsics.checkNotNullExpressionValue(stockDetailStore, "get(...)");
        companion2.injectStockDetailStore(instance, stockDetailStore);
        InstrumentAccountSwitcherStore instrumentAccountSwitcherStore = this.instrumentAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentAccountSwitcherStore, "get(...)");
        companion2.injectInstrumentAccountSwitcherStore(instance, instrumentAccountSwitcherStore);
        InvestmentScheduleEventStore investmentScheduleEventStore = this.investmentScheduleEventStore.get();
        Intrinsics.checkNotNullExpressionValue(investmentScheduleEventStore, "get(...)");
        companion2.injectInvestmentScheduleEventStore(instance, investmentScheduleEventStore);
        BalancesStore balancesStore = this.balancesStore.get();
        Intrinsics.checkNotNullExpressionValue(balancesStore, "get(...)");
        companion2.injectBalancesStore(instance, balancesStore);
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        companion2.injectOrderStore(instance, orderStore);
        OptionOrderStore optionOrderStore = this.optionOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderStore, "get(...)");
        companion2.injectOptionOrderStore(instance, optionOrderStore);
        ComboOrderStore comboOrderStore = this.comboOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(comboOrderStore, "get(...)");
        companion2.injectComboOrderStore(instance, comboOrderStore);
        OptionPositionStore optionPositionStore = this.optionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionPositionStore, "get(...)");
        companion2.injectOptionPositionStore(instance, optionPositionStore);
        QuickTradeAmountsStore quickTradeAmountsStore = this.quickTradeAmountsStore.get();
        Intrinsics.checkNotNullExpressionValue(quickTradeAmountsStore, "get(...)");
        companion2.injectQuickTradeAmountsStore(instance, quickTradeAmountsStore);
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        companion2.injectPositionStore(instance, positionStore);
        DividendStore dividendStore = this.dividendStore.get();
        Intrinsics.checkNotNullExpressionValue(dividendStore, "get(...)");
        companion2.injectDividendStore(instance, dividendStore);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(instance, analyticsLogger);
        SupportBreadcrumbTracker supportBreadcrumbTracker = this.breadcrumbTracker.get();
        Intrinsics.checkNotNullExpressionValue(supportBreadcrumbTracker, "get(...)");
        companion2.injectBreadcrumbTracker(instance, supportBreadcrumbTracker);
        IacInfoBannerStore iacInfoBannerStore = this.infoBannerStore.get();
        Intrinsics.checkNotNullExpressionValue(iacInfoBannerStore, "get(...)");
        companion2.injectInfoBannerStore(instance, iacInfoBannerStore);
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        companion2.injectPerformanceLogger(instance, performanceLogger);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        EquityDetailNuxStore equityDetailNuxStore = this.equityDetailNuxStore.get();
        Intrinsics.checkNotNullExpressionValue(equityDetailNuxStore, "get(...)");
        companion2.injectEquityDetailNuxStore(instance, equityDetailNuxStore);
        TradingTrendsDetailsLogging tradingTrendsDetailsLogging = this.tradingTrendsDetailsLogging.get();
        Intrinsics.checkNotNullExpressionValue(tradingTrendsDetailsLogging, "get(...)");
        companion2.injectTradingTrendsDetailsLogging(instance, tradingTrendsDetailsLogging);
        PictureInPictureStore pictureInPictureStore = this.pipSupportStore.get();
        Intrinsics.checkNotNullExpressionValue(pictureInPictureStore, "get(...)");
        companion2.injectPipSupportStore(instance, pictureInPictureStore);
        ExperimentsStore experimentsStore = this.experimentStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentStore(instance, experimentsStore);
        BwWebViewManager bwWebViewManager = this.bwWebViewManager.get();
        Intrinsics.checkNotNullExpressionValue(bwWebViewManager, "get(...)");
        companion2.injectBwWebViewManager(instance, bwWebViewManager);
    }

    /* compiled from: InstrumentDetailListParentFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jì\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\b2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\b2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\b2\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\b2\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\b2\f\u00106\u001a\b\u0012\u0004\u0012\u0002070\b2\f\u00108\u001a\b\u0012\u0004\u0012\u0002090\bH\u0007J\u0018\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010=\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010>\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010?\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010@\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010A\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010B\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010C\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010D\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010E\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0018\u0010F\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0018\u0010G\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H\u0007J\u0018\u0010H\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#H\u0007J\u0018\u0010I\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%H\u0007J\u0018\u0010J\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'H\u0007J\u0018\u0010K\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)H\u0007J\u0018\u0010L\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010*\u001a\u00020+H\u0007J\u0018\u0010M\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0007J\u0018\u0010N\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/H\u0007J\u0018\u0010O\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u00100\u001a\u000201H\u0007J\u0018\u0010P\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u00102\u001a\u000203H\u0007J\u0018\u0010Q\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u00104\u001a\u000205H\u0007J\u0018\u0010R\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u00106\u001a\u000207H\u0007J\u0018\u0010S\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00062\u0006\u00108\u001a\u000209H\u0007¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailListParentFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailListParentFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "listItemIdToUserListIdsStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "stockDetailStore", "Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "instrumentAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "investmentScheduleEventStore", "Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "comboOrderStore", "Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "quickTradeAmountsStore", "Lcom/robinhood/librobinhood/data/store/QuickTradeAmountsStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "dividendStore", "Lcom/robinhood/librobinhood/data/store/DividendStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "breadcrumbTracker", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbTracker;", "infoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "equityDetailNuxStore", "Lcom/robinhood/librobinhood/data/store/EquityDetailNuxStore;", "tradingTrendsDetailsLogging", "Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;", "pipSupportStore", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "injectAggregateOptionPositionStore", "", "instance", "injectListItemIdToUserListIdsStore", "injectInstrumentStore", "injectStockDetailStore", "injectInstrumentAccountSwitcherStore", "injectInvestmentScheduleEventStore", "injectBalancesStore", "injectOrderStore", "injectOptionOrderStore", "injectComboOrderStore", "injectOptionPositionStore", "injectQuickTradeAmountsStore", "injectPositionStore", "injectDividendStore", "injectAnalytics", "injectBreadcrumbTracker", "injectInfoBannerStore", "injectPerformanceLogger", "injectEventLogger", "injectEquityDetailNuxStore", "injectTradingTrendsDetailsLogging", "injectPipSupportStore", "injectExperimentStore", "injectBwWebViewManager", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<InstrumentDetailListParentFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<ListItemIdToUserListIdsStore> listItemIdToUserListIdsStore, Provider<InstrumentStore> instrumentStore, Provider<StockDetailStore> stockDetailStore, Provider<InstrumentAccountSwitcherStore> instrumentAccountSwitcherStore, Provider<InvestmentScheduleEventStore> investmentScheduleEventStore, Provider<BalancesStore> balancesStore, Provider<OrderStore> orderStore, Provider<OptionOrderStore> optionOrderStore, Provider<ComboOrderStore> comboOrderStore, Provider<OptionPositionStore> optionPositionStore, Provider<QuickTradeAmountsStore> quickTradeAmountsStore, Provider<PositionStore> positionStore, Provider<DividendStore> dividendStore, Provider<AnalyticsLogger> analytics, Provider<SupportBreadcrumbTracker> breadcrumbTracker, Provider<IacInfoBannerStore> infoBannerStore, Provider<PerformanceLogger> performanceLogger, Provider<EventLogger> eventLogger, Provider<EquityDetailNuxStore> equityDetailNuxStore, Provider<TradingTrendsDetailsLogging> tradingTrendsDetailsLogging, Provider<PictureInPictureStore> pipSupportStore, Provider<ExperimentsStore> experimentStore, Provider<BwWebViewManager> bwWebViewManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(listItemIdToUserListIdsStore, "listItemIdToUserListIdsStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(stockDetailStore, "stockDetailStore");
            Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(quickTradeAmountsStore, "quickTradeAmountsStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(dividendStore, "dividendStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(breadcrumbTracker, "breadcrumbTracker");
            Intrinsics.checkNotNullParameter(infoBannerStore, "infoBannerStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(equityDetailNuxStore, "equityDetailNuxStore");
            Intrinsics.checkNotNullParameter(tradingTrendsDetailsLogging, "tradingTrendsDetailsLogging");
            Intrinsics.checkNotNullParameter(pipSupportStore, "pipSupportStore");
            Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
            Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
            return new InstrumentDetailListParentFragment_MembersInjector(singletons, aggregateOptionPositionStore, listItemIdToUserListIdsStore, instrumentStore, stockDetailStore, instrumentAccountSwitcherStore, investmentScheduleEventStore, balancesStore, orderStore, optionOrderStore, comboOrderStore, optionPositionStore, quickTradeAmountsStore, positionStore, dividendStore, analytics, breadcrumbTracker, infoBannerStore, performanceLogger, eventLogger, equityDetailNuxStore, tradingTrendsDetailsLogging, pipSupportStore, experimentStore, bwWebViewManager);
        }

        @JvmStatic
        public final void injectAggregateOptionPositionStore(InstrumentDetailListParentFragment instance, AggregateOptionPositionStore aggregateOptionPositionStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            instance.setAggregateOptionPositionStore(aggregateOptionPositionStore);
        }

        @JvmStatic
        public final void injectListItemIdToUserListIdsStore(InstrumentDetailListParentFragment instance, ListItemIdToUserListIdsStore listItemIdToUserListIdsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(listItemIdToUserListIdsStore, "listItemIdToUserListIdsStore");
            instance.setListItemIdToUserListIdsStore(listItemIdToUserListIdsStore);
        }

        @JvmStatic
        public final void injectInstrumentStore(InstrumentDetailListParentFragment instance, InstrumentStore instrumentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            instance.setInstrumentStore(instrumentStore);
        }

        @JvmStatic
        public final void injectStockDetailStore(InstrumentDetailListParentFragment instance, StockDetailStore stockDetailStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(stockDetailStore, "stockDetailStore");
            instance.setStockDetailStore(stockDetailStore);
        }

        @JvmStatic
        public final void injectInstrumentAccountSwitcherStore(InstrumentDetailListParentFragment instance, InstrumentAccountSwitcherStore instrumentAccountSwitcherStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
            instance.setInstrumentAccountSwitcherStore(instrumentAccountSwitcherStore);
        }

        @JvmStatic
        public final void injectInvestmentScheduleEventStore(InstrumentDetailListParentFragment instance, InvestmentScheduleEventStore investmentScheduleEventStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
            instance.setInvestmentScheduleEventStore(investmentScheduleEventStore);
        }

        @JvmStatic
        public final void injectBalancesStore(InstrumentDetailListParentFragment instance, BalancesStore balancesStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            instance.setBalancesStore(balancesStore);
        }

        @JvmStatic
        public final void injectOrderStore(InstrumentDetailListParentFragment instance, OrderStore orderStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            instance.setOrderStore(orderStore);
        }

        @JvmStatic
        public final void injectOptionOrderStore(InstrumentDetailListParentFragment instance, OptionOrderStore optionOrderStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
            instance.setOptionOrderStore(optionOrderStore);
        }

        @JvmStatic
        public final void injectComboOrderStore(InstrumentDetailListParentFragment instance, ComboOrderStore comboOrderStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
            instance.setComboOrderStore(comboOrderStore);
        }

        @JvmStatic
        public final void injectOptionPositionStore(InstrumentDetailListParentFragment instance, OptionPositionStore optionPositionStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            instance.setOptionPositionStore(optionPositionStore);
        }

        @JvmStatic
        public final void injectQuickTradeAmountsStore(InstrumentDetailListParentFragment instance, QuickTradeAmountsStore quickTradeAmountsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(quickTradeAmountsStore, "quickTradeAmountsStore");
            instance.setQuickTradeAmountsStore(quickTradeAmountsStore);
        }

        @JvmStatic
        public final void injectPositionStore(InstrumentDetailListParentFragment instance, PositionStore positionStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            instance.setPositionStore(positionStore);
        }

        @JvmStatic
        public final void injectDividendStore(InstrumentDetailListParentFragment instance, DividendStore dividendStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(dividendStore, "dividendStore");
            instance.setDividendStore(dividendStore);
        }

        @JvmStatic
        public final void injectAnalytics(InstrumentDetailListParentFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectBreadcrumbTracker(InstrumentDetailListParentFragment instance, SupportBreadcrumbTracker breadcrumbTracker) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(breadcrumbTracker, "breadcrumbTracker");
            instance.setBreadcrumbTracker(breadcrumbTracker);
        }

        @JvmStatic
        public final void injectInfoBannerStore(InstrumentDetailListParentFragment instance, IacInfoBannerStore infoBannerStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(infoBannerStore, "infoBannerStore");
            instance.setInfoBannerStore(infoBannerStore);
        }

        @JvmStatic
        public final void injectPerformanceLogger(InstrumentDetailListParentFragment instance, PerformanceLogger performanceLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            instance.setPerformanceLogger(performanceLogger);
        }

        @JvmStatic
        public final void injectEventLogger(InstrumentDetailListParentFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectEquityDetailNuxStore(InstrumentDetailListParentFragment instance, EquityDetailNuxStore equityDetailNuxStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(equityDetailNuxStore, "equityDetailNuxStore");
            instance.setEquityDetailNuxStore(equityDetailNuxStore);
        }

        @JvmStatic
        public final void injectTradingTrendsDetailsLogging(InstrumentDetailListParentFragment instance, TradingTrendsDetailsLogging tradingTrendsDetailsLogging) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(tradingTrendsDetailsLogging, "tradingTrendsDetailsLogging");
            instance.setTradingTrendsDetailsLogging(tradingTrendsDetailsLogging);
        }

        @JvmStatic
        public final void injectPipSupportStore(InstrumentDetailListParentFragment instance, PictureInPictureStore pipSupportStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(pipSupportStore, "pipSupportStore");
            instance.setPipSupportStore(pipSupportStore);
        }

        @JvmStatic
        public final void injectExperimentStore(InstrumentDetailListParentFragment instance, ExperimentsStore experimentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
            instance.setExperimentStore(experimentStore);
        }

        @JvmStatic
        public final void injectBwWebViewManager(InstrumentDetailListParentFragment instance, BwWebViewManager bwWebViewManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
            instance.setBwWebViewManager(bwWebViewManager);
        }
    }
}
