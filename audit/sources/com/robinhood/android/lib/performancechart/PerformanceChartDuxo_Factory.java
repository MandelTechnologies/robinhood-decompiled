package com.robinhood.android.lib.performancechart;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartFeatureStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2Store;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: PerformanceChartDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BÅ\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\u0017\u0010\u0012\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u00150\u0004\u0012\u0017\u0010\u0016\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u00150\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0012\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0016\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/lib/performancechart/PerformanceChartDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/performancechart/PerformanceChartDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/performancechart/PerformanceChartStateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "settingsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2Store;", "chartFeatureStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartFeatureStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "chartHoursEnabledPrefState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "benchmarkIntroShownPrefState", "portfolioPrivacyPref", "Lcom/robinhood/prefs/BooleanPreference;", "displayCurrencySelectionPref", "Lcom/robinhood/prefs/IntPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-performance-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PerformanceChartDuxo_Factory implements Factory<PerformanceChartDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AppType> appType;
    private final Provider<StateFlow2<Boolean>> benchmarkIntroShownPrefState;
    private final Provider<PerformanceChartFeatureStore> chartFeatureStore;
    private final Provider<StateFlow2<Boolean>> chartHoursEnabledPrefState;
    private final Provider<IntPreference> displayCurrencySelectionPref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<PerformanceChartStore> performanceChartStore;
    private final Provider<BooleanPreference> portfolioPrivacyPref;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<PerformanceChartSettingsV2Store> settingsStore;
    private final Provider<PerformanceChartStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PerformanceChartDuxo_Factory create(Provider<PerformanceChartStateProvider> provider, Provider<AccountProvider> provider2, Provider<PerformanceChartStore> provider3, Provider<PerformanceChartSettingsV2Store> provider4, Provider<PerformanceChartFeatureStore> provider5, Provider<RegionGateProvider> provider6, Provider<AppType> provider7, Provider<StateFlow2<Boolean>> provider8, Provider<StateFlow2<Boolean>> provider9, Provider<BooleanPreference> provider10, Provider<IntPreference> provider11, Provider<DuxoBundle> provider12) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @JvmStatic
    public static final PerformanceChartDuxo newInstance(PerformanceChartStateProvider performanceChartStateProvider, AccountProvider accountProvider, PerformanceChartStore performanceChartStore, PerformanceChartSettingsV2Store performanceChartSettingsV2Store, PerformanceChartFeatureStore performanceChartFeatureStore, RegionGateProvider regionGateProvider, AppType appType, StateFlow2<Boolean> stateFlow2, StateFlow2<Boolean> stateFlow22, BooleanPreference booleanPreference, IntPreference intPreference, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(performanceChartStateProvider, accountProvider, performanceChartStore, performanceChartSettingsV2Store, performanceChartFeatureStore, regionGateProvider, appType, stateFlow2, stateFlow22, booleanPreference, intPreference, duxoBundle);
    }

    public PerformanceChartDuxo_Factory(Provider<PerformanceChartStateProvider> stateProvider, Provider<AccountProvider> accountProvider, Provider<PerformanceChartStore> performanceChartStore, Provider<PerformanceChartSettingsV2Store> settingsStore, Provider<PerformanceChartFeatureStore> chartFeatureStore, Provider<RegionGateProvider> regionGateProvider, Provider<AppType> appType, Provider<StateFlow2<Boolean>> chartHoursEnabledPrefState, Provider<StateFlow2<Boolean>> benchmarkIntroShownPrefState, Provider<BooleanPreference> portfolioPrivacyPref, Provider<IntPreference> displayCurrencySelectionPref, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(settingsStore, "settingsStore");
        Intrinsics.checkNotNullParameter(chartFeatureStore, "chartFeatureStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(chartHoursEnabledPrefState, "chartHoursEnabledPrefState");
        Intrinsics.checkNotNullParameter(benchmarkIntroShownPrefState, "benchmarkIntroShownPrefState");
        Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
        Intrinsics.checkNotNullParameter(displayCurrencySelectionPref, "displayCurrencySelectionPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.stateProvider = stateProvider;
        this.accountProvider = accountProvider;
        this.performanceChartStore = performanceChartStore;
        this.settingsStore = settingsStore;
        this.chartFeatureStore = chartFeatureStore;
        this.regionGateProvider = regionGateProvider;
        this.appType = appType;
        this.chartHoursEnabledPrefState = chartHoursEnabledPrefState;
        this.benchmarkIntroShownPrefState = benchmarkIntroShownPrefState;
        this.portfolioPrivacyPref = portfolioPrivacyPref;
        this.displayCurrencySelectionPref = displayCurrencySelectionPref;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public PerformanceChartDuxo get() {
        Companion companion = INSTANCE;
        PerformanceChartStateProvider performanceChartStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(performanceChartStateProvider, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        PerformanceChartStore performanceChartStore = this.performanceChartStore.get();
        Intrinsics.checkNotNullExpressionValue(performanceChartStore, "get(...)");
        PerformanceChartSettingsV2Store performanceChartSettingsV2Store = this.settingsStore.get();
        Intrinsics.checkNotNullExpressionValue(performanceChartSettingsV2Store, "get(...)");
        PerformanceChartFeatureStore performanceChartFeatureStore = this.chartFeatureStore.get();
        Intrinsics.checkNotNullExpressionValue(performanceChartFeatureStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        StateFlow2<Boolean> stateFlow2 = this.chartHoursEnabledPrefState.get();
        Intrinsics.checkNotNullExpressionValue(stateFlow2, "get(...)");
        StateFlow2<Boolean> stateFlow22 = this.benchmarkIntroShownPrefState.get();
        Intrinsics.checkNotNullExpressionValue(stateFlow22, "get(...)");
        BooleanPreference booleanPreference = this.portfolioPrivacyPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        IntPreference intPreference = this.displayCurrencySelectionPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(performanceChartStateProvider, accountProvider, performanceChartStore, performanceChartSettingsV2Store, performanceChartFeatureStore, regionGateProvider, appType, stateFlow2, stateFlow22, booleanPreference, intPreference, duxoBundle);
    }

    /* compiled from: PerformanceChartDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÆ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0017\u0010\u0015\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\b\u00180\u00072\u0017\u0010\u0019\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\b\u00180\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0007J~\u0010 \u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\b\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\b\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/lib/performancechart/PerformanceChartDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/performancechart/PerformanceChartDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/performancechart/PerformanceChartStateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "settingsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2Store;", "chartFeatureStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartFeatureStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "chartHoursEnabledPrefState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "benchmarkIntroShownPrefState", "portfolioPrivacyPref", "Lcom/robinhood/prefs/BooleanPreference;", "displayCurrencySelectionPref", "Lcom/robinhood/prefs/IntPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/lib/performancechart/PerformanceChartDuxo;", "lib-performance-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PerformanceChartDuxo_Factory create(Provider<PerformanceChartStateProvider> stateProvider, Provider<AccountProvider> accountProvider, Provider<PerformanceChartStore> performanceChartStore, Provider<PerformanceChartSettingsV2Store> settingsStore, Provider<PerformanceChartFeatureStore> chartFeatureStore, Provider<RegionGateProvider> regionGateProvider, Provider<AppType> appType, Provider<StateFlow2<Boolean>> chartHoursEnabledPrefState, Provider<StateFlow2<Boolean>> benchmarkIntroShownPrefState, Provider<BooleanPreference> portfolioPrivacyPref, Provider<IntPreference> displayCurrencySelectionPref, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(settingsStore, "settingsStore");
            Intrinsics.checkNotNullParameter(chartFeatureStore, "chartFeatureStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(chartHoursEnabledPrefState, "chartHoursEnabledPrefState");
            Intrinsics.checkNotNullParameter(benchmarkIntroShownPrefState, "benchmarkIntroShownPrefState");
            Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
            Intrinsics.checkNotNullParameter(displayCurrencySelectionPref, "displayCurrencySelectionPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PerformanceChartDuxo_Factory(stateProvider, accountProvider, performanceChartStore, settingsStore, chartFeatureStore, regionGateProvider, appType, chartHoursEnabledPrefState, benchmarkIntroShownPrefState, portfolioPrivacyPref, displayCurrencySelectionPref, duxoBundle);
        }

        @JvmStatic
        public final PerformanceChartDuxo newInstance(PerformanceChartStateProvider stateProvider, AccountProvider accountProvider, PerformanceChartStore performanceChartStore, PerformanceChartSettingsV2Store settingsStore, PerformanceChartFeatureStore chartFeatureStore, RegionGateProvider regionGateProvider, AppType appType, StateFlow2<Boolean> chartHoursEnabledPrefState, StateFlow2<Boolean> benchmarkIntroShownPrefState, BooleanPreference portfolioPrivacyPref, IntPreference displayCurrencySelectionPref, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
            Intrinsics.checkNotNullParameter(settingsStore, "settingsStore");
            Intrinsics.checkNotNullParameter(chartFeatureStore, "chartFeatureStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(chartHoursEnabledPrefState, "chartHoursEnabledPrefState");
            Intrinsics.checkNotNullParameter(benchmarkIntroShownPrefState, "benchmarkIntroShownPrefState");
            Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
            Intrinsics.checkNotNullParameter(displayCurrencySelectionPref, "displayCurrencySelectionPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PerformanceChartDuxo(stateProvider, accountProvider, performanceChartStore, settingsStore, chartFeatureStore, regionGateProvider, appType, chartHoursEnabledPrefState, benchmarkIntroShownPrefState, portfolioPrivacyPref, displayCurrencySelectionPref, duxoBundle);
        }
    }
}
