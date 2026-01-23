package com.robinhood.android.equitydetail.p123ui.chart;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager;
import com.robinhood.android.chart.sharedchartspan.SharedSpanService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.engagement.l2improvements.GoldL2ImprovementsStore;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartSpansStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentChartDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BÙ\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartDuxo;", "stockDetailHistoricalChartDataStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;", "instrumentChartSpansStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartSpansStore;", "goldL2ImprovementsStore", "Lcom/robinhood/android/engagement/l2improvements/GoldL2ImprovementsStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "isShowingExtendedHoursPref", "Lcom/robinhood/prefs/BooleanPreference;", "showCandlestickChartPrefState", "bwHasVisitedChartSharedPref", "sharedSpanService", "Lcom/robinhood/android/chart/sharedchartspan/SharedSpanService;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "stateProvider", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class InstrumentChartDuxo_Factory implements Factory<InstrumentChartDuxo> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<BooleanPreference> bwHasVisitedChartSharedPref;
    private final Provider<BwWebViewManager> bwWebViewManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<GoldL2ImprovementsStore> goldL2ImprovementsStore;
    private final Provider<InstrumentChartSpansStore> instrumentChartSpansStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<BooleanPreference> isShowingExtendedHoursPref;
    private final Provider<MarginSubscriptionStore> marginSubscriptionStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SharedSpanService> sharedSpanService;
    private final Provider<BooleanPreference> showCandlestickChartPrefState;
    private final Provider<InstrumentChartDuxo5> stateProvider;
    private final Provider<StockDetailHistoricalChartDataStore> stockDetailHistoricalChartDataStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InstrumentChartDuxo_Factory create(Provider<StockDetailHistoricalChartDataStore> provider, Provider<InstrumentChartSpansStore> provider2, Provider<GoldL2ImprovementsStore> provider3, Provider<MarginSubscriptionStore> provider4, Provider<BooleanPreference> provider5, Provider<BooleanPreference> provider6, Provider<BooleanPreference> provider7, Provider<SharedSpanService> provider8, Provider<InstrumentStore> provider9, Provider<AnalyticsLogger> provider10, Provider<ExperimentsStore> provider11, Provider<BwWebViewManager> provider12, Provider<RegionGateProvider> provider13, Provider<InstrumentChartDuxo5> provider14, Provider<DuxoBundle> provider15) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    @JvmStatic
    public static final InstrumentChartDuxo newInstance(StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore, InstrumentChartSpansStore instrumentChartSpansStore, GoldL2ImprovementsStore goldL2ImprovementsStore, MarginSubscriptionStore marginSubscriptionStore, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, BooleanPreference booleanPreference3, SharedSpanService sharedSpanService, InstrumentStore instrumentStore, AnalyticsLogger analyticsLogger, ExperimentsStore experimentsStore, BwWebViewManager bwWebViewManager, RegionGateProvider regionGateProvider, InstrumentChartDuxo5 instrumentChartDuxo5, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(stockDetailHistoricalChartDataStore, instrumentChartSpansStore, goldL2ImprovementsStore, marginSubscriptionStore, booleanPreference, booleanPreference2, booleanPreference3, sharedSpanService, instrumentStore, analyticsLogger, experimentsStore, bwWebViewManager, regionGateProvider, instrumentChartDuxo5, duxoBundle);
    }

    public InstrumentChartDuxo_Factory(Provider<StockDetailHistoricalChartDataStore> stockDetailHistoricalChartDataStore, Provider<InstrumentChartSpansStore> instrumentChartSpansStore, Provider<GoldL2ImprovementsStore> goldL2ImprovementsStore, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<BooleanPreference> isShowingExtendedHoursPref, Provider<BooleanPreference> showCandlestickChartPrefState, Provider<BooleanPreference> bwHasVisitedChartSharedPref, Provider<SharedSpanService> sharedSpanService, Provider<InstrumentStore> instrumentStore, Provider<AnalyticsLogger> analytics, Provider<ExperimentsStore> experimentsStore, Provider<BwWebViewManager> bwWebViewManager, Provider<RegionGateProvider> regionGateProvider, Provider<InstrumentChartDuxo5> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(stockDetailHistoricalChartDataStore, "stockDetailHistoricalChartDataStore");
        Intrinsics.checkNotNullParameter(instrumentChartSpansStore, "instrumentChartSpansStore");
        Intrinsics.checkNotNullParameter(goldL2ImprovementsStore, "goldL2ImprovementsStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(isShowingExtendedHoursPref, "isShowingExtendedHoursPref");
        Intrinsics.checkNotNullParameter(showCandlestickChartPrefState, "showCandlestickChartPrefState");
        Intrinsics.checkNotNullParameter(bwHasVisitedChartSharedPref, "bwHasVisitedChartSharedPref");
        Intrinsics.checkNotNullParameter(sharedSpanService, "sharedSpanService");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.stockDetailHistoricalChartDataStore = stockDetailHistoricalChartDataStore;
        this.instrumentChartSpansStore = instrumentChartSpansStore;
        this.goldL2ImprovementsStore = goldL2ImprovementsStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.isShowingExtendedHoursPref = isShowingExtendedHoursPref;
        this.showCandlestickChartPrefState = showCandlestickChartPrefState;
        this.bwHasVisitedChartSharedPref = bwHasVisitedChartSharedPref;
        this.sharedSpanService = sharedSpanService;
        this.instrumentStore = instrumentStore;
        this.analytics = analytics;
        this.experimentsStore = experimentsStore;
        this.bwWebViewManager = bwWebViewManager;
        this.regionGateProvider = regionGateProvider;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public InstrumentChartDuxo get() {
        Companion companion = INSTANCE;
        StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore = this.stockDetailHistoricalChartDataStore.get();
        Intrinsics.checkNotNullExpressionValue(stockDetailHistoricalChartDataStore, "get(...)");
        InstrumentChartSpansStore instrumentChartSpansStore = this.instrumentChartSpansStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentChartSpansStore, "get(...)");
        GoldL2ImprovementsStore goldL2ImprovementsStore = this.goldL2ImprovementsStore.get();
        Intrinsics.checkNotNullExpressionValue(goldL2ImprovementsStore, "get(...)");
        MarginSubscriptionStore marginSubscriptionStore = this.marginSubscriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(marginSubscriptionStore, "get(...)");
        BooleanPreference booleanPreference = this.isShowingExtendedHoursPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.showCandlestickChartPrefState.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        BooleanPreference booleanPreference3 = this.bwHasVisitedChartSharedPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        SharedSpanService sharedSpanService = this.sharedSpanService.get();
        Intrinsics.checkNotNullExpressionValue(sharedSpanService, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        BwWebViewManager bwWebViewManager = this.bwWebViewManager.get();
        Intrinsics.checkNotNullExpressionValue(bwWebViewManager, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        InstrumentChartDuxo5 instrumentChartDuxo5 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(instrumentChartDuxo5, "get(...)");
        InstrumentChartDuxo5 instrumentChartDuxo52 = instrumentChartDuxo5;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(stockDetailHistoricalChartDataStore, instrumentChartSpansStore, goldL2ImprovementsStore, marginSubscriptionStore, booleanPreference, booleanPreference2, booleanPreference3, sharedSpanService, instrumentStore, analyticsLogger, experimentsStore, bwWebViewManager, regionGateProvider, instrumentChartDuxo52, duxoBundle);
    }

    /* compiled from: InstrumentChartDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÚ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H\u0007J\u0080\u0001\u0010#\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartDuxo_Factory;", "stockDetailHistoricalChartDataStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore;", "instrumentChartSpansStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartSpansStore;", "goldL2ImprovementsStore", "Lcom/robinhood/android/engagement/l2improvements/GoldL2ImprovementsStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "isShowingExtendedHoursPref", "Lcom/robinhood/prefs/BooleanPreference;", "showCandlestickChartPrefState", "bwHasVisitedChartSharedPref", "sharedSpanService", "Lcom/robinhood/android/chart/sharedchartspan/SharedSpanService;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "stateProvider", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartDuxo;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InstrumentChartDuxo_Factory create(Provider<StockDetailHistoricalChartDataStore> stockDetailHistoricalChartDataStore, Provider<InstrumentChartSpansStore> instrumentChartSpansStore, Provider<GoldL2ImprovementsStore> goldL2ImprovementsStore, Provider<MarginSubscriptionStore> marginSubscriptionStore, Provider<BooleanPreference> isShowingExtendedHoursPref, Provider<BooleanPreference> showCandlestickChartPrefState, Provider<BooleanPreference> bwHasVisitedChartSharedPref, Provider<SharedSpanService> sharedSpanService, Provider<InstrumentStore> instrumentStore, Provider<AnalyticsLogger> analytics, Provider<ExperimentsStore> experimentsStore, Provider<BwWebViewManager> bwWebViewManager, Provider<RegionGateProvider> regionGateProvider, Provider<InstrumentChartDuxo5> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(stockDetailHistoricalChartDataStore, "stockDetailHistoricalChartDataStore");
            Intrinsics.checkNotNullParameter(instrumentChartSpansStore, "instrumentChartSpansStore");
            Intrinsics.checkNotNullParameter(goldL2ImprovementsStore, "goldL2ImprovementsStore");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(isShowingExtendedHoursPref, "isShowingExtendedHoursPref");
            Intrinsics.checkNotNullParameter(showCandlestickChartPrefState, "showCandlestickChartPrefState");
            Intrinsics.checkNotNullParameter(bwHasVisitedChartSharedPref, "bwHasVisitedChartSharedPref");
            Intrinsics.checkNotNullParameter(sharedSpanService, "sharedSpanService");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new InstrumentChartDuxo_Factory(stockDetailHistoricalChartDataStore, instrumentChartSpansStore, goldL2ImprovementsStore, marginSubscriptionStore, isShowingExtendedHoursPref, showCandlestickChartPrefState, bwHasVisitedChartSharedPref, sharedSpanService, instrumentStore, analytics, experimentsStore, bwWebViewManager, regionGateProvider, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final InstrumentChartDuxo newInstance(StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore, InstrumentChartSpansStore instrumentChartSpansStore, GoldL2ImprovementsStore goldL2ImprovementsStore, MarginSubscriptionStore marginSubscriptionStore, BooleanPreference isShowingExtendedHoursPref, BooleanPreference showCandlestickChartPrefState, BooleanPreference bwHasVisitedChartSharedPref, SharedSpanService sharedSpanService, InstrumentStore instrumentStore, AnalyticsLogger analytics, ExperimentsStore experimentsStore, BwWebViewManager bwWebViewManager, RegionGateProvider regionGateProvider, InstrumentChartDuxo5 stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(stockDetailHistoricalChartDataStore, "stockDetailHistoricalChartDataStore");
            Intrinsics.checkNotNullParameter(instrumentChartSpansStore, "instrumentChartSpansStore");
            Intrinsics.checkNotNullParameter(goldL2ImprovementsStore, "goldL2ImprovementsStore");
            Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
            Intrinsics.checkNotNullParameter(isShowingExtendedHoursPref, "isShowingExtendedHoursPref");
            Intrinsics.checkNotNullParameter(showCandlestickChartPrefState, "showCandlestickChartPrefState");
            Intrinsics.checkNotNullParameter(bwHasVisitedChartSharedPref, "bwHasVisitedChartSharedPref");
            Intrinsics.checkNotNullParameter(sharedSpanService, "sharedSpanService");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new InstrumentChartDuxo(stockDetailHistoricalChartDataStore, instrumentChartSpansStore, goldL2ImprovementsStore, marginSubscriptionStore, isShowingExtendedHoursPref, showCandlestickChartPrefState, bwHasVisitedChartSharedPref, sharedSpanService, instrumentStore, analytics, experimentsStore, bwWebViewManager, regionGateProvider, stateProvider, duxoBundle);
        }
    }
}
