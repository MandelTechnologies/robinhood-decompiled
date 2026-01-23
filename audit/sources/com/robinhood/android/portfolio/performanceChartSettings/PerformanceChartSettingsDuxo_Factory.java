package com.robinhood.android.portfolio.performanceChartSettings;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartFeatureStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2Store;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: PerformanceChartSettingsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u007f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0017\u0010\f\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f0\u0004\u0012\u0017\u0010\u0010\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f0\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\f\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0010\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "chartFeatureStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartFeatureStore;", "settingsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2Store;", "benchmarkIntroShownPrefState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "chartHoursEnabledPrefState", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PerformanceChartSettingsDuxo_Factory implements Factory<PerformanceChartSettingsDuxo> {
    private final Provider<StateFlow2<Boolean>> benchmarkIntroShownPrefState;
    private final Provider<PerformanceChartFeatureStore> chartFeatureStore;
    private final Provider<StateFlow2<Boolean>> chartHoursEnabledPrefState;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<PerformanceChartSettingsV2Store> settingsStore;
    private final Provider<PerformanceChartSettingsStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PerformanceChartSettingsDuxo_Factory create(Provider<PerformanceChartSettingsStateProvider> provider, Provider<SavedStateHandle> provider2, Provider<PerformanceChartFeatureStore> provider3, Provider<PerformanceChartSettingsV2Store> provider4, Provider<StateFlow2<Boolean>> provider5, Provider<StateFlow2<Boolean>> provider6, Provider<DuxoBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final PerformanceChartSettingsDuxo newInstance(PerformanceChartSettingsStateProvider performanceChartSettingsStateProvider, SavedStateHandle savedStateHandle, PerformanceChartFeatureStore performanceChartFeatureStore, PerformanceChartSettingsV2Store performanceChartSettingsV2Store, StateFlow2<Boolean> stateFlow2, StateFlow2<Boolean> stateFlow22, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(performanceChartSettingsStateProvider, savedStateHandle, performanceChartFeatureStore, performanceChartSettingsV2Store, stateFlow2, stateFlow22, duxoBundle);
    }

    public PerformanceChartSettingsDuxo_Factory(Provider<PerformanceChartSettingsStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<PerformanceChartFeatureStore> chartFeatureStore, Provider<PerformanceChartSettingsV2Store> settingsStore, Provider<StateFlow2<Boolean>> benchmarkIntroShownPrefState, Provider<StateFlow2<Boolean>> chartHoursEnabledPrefState, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(chartFeatureStore, "chartFeatureStore");
        Intrinsics.checkNotNullParameter(settingsStore, "settingsStore");
        Intrinsics.checkNotNullParameter(benchmarkIntroShownPrefState, "benchmarkIntroShownPrefState");
        Intrinsics.checkNotNullParameter(chartHoursEnabledPrefState, "chartHoursEnabledPrefState");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
        this.chartFeatureStore = chartFeatureStore;
        this.settingsStore = settingsStore;
        this.benchmarkIntroShownPrefState = benchmarkIntroShownPrefState;
        this.chartHoursEnabledPrefState = chartHoursEnabledPrefState;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public PerformanceChartSettingsDuxo get() {
        Companion companion = INSTANCE;
        PerformanceChartSettingsStateProvider performanceChartSettingsStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(performanceChartSettingsStateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        PerformanceChartFeatureStore performanceChartFeatureStore = this.chartFeatureStore.get();
        Intrinsics.checkNotNullExpressionValue(performanceChartFeatureStore, "get(...)");
        PerformanceChartSettingsV2Store performanceChartSettingsV2Store = this.settingsStore.get();
        Intrinsics.checkNotNullExpressionValue(performanceChartSettingsV2Store, "get(...)");
        StateFlow2<Boolean> stateFlow2 = this.benchmarkIntroShownPrefState.get();
        Intrinsics.checkNotNullExpressionValue(stateFlow2, "get(...)");
        StateFlow2<Boolean> stateFlow22 = this.chartHoursEnabledPrefState.get();
        Intrinsics.checkNotNullExpressionValue(stateFlow22, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(performanceChartSettingsStateProvider, savedStateHandle, performanceChartFeatureStore, performanceChartSettingsV2Store, stateFlow2, stateFlow22, duxoBundle);
    }

    /* compiled from: PerformanceChartSettingsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0080\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0017\u0010\u000f\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u00120\u00072\u0017\u0010\u0013\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u00120\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007H\u0007JV\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "chartFeatureStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartFeatureStore;", "settingsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2Store;", "benchmarkIntroShownPrefState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "chartHoursEnabledPrefState", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDuxo;", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PerformanceChartSettingsDuxo_Factory create(Provider<PerformanceChartSettingsStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<PerformanceChartFeatureStore> chartFeatureStore, Provider<PerformanceChartSettingsV2Store> settingsStore, Provider<StateFlow2<Boolean>> benchmarkIntroShownPrefState, Provider<StateFlow2<Boolean>> chartHoursEnabledPrefState, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(chartFeatureStore, "chartFeatureStore");
            Intrinsics.checkNotNullParameter(settingsStore, "settingsStore");
            Intrinsics.checkNotNullParameter(benchmarkIntroShownPrefState, "benchmarkIntroShownPrefState");
            Intrinsics.checkNotNullParameter(chartHoursEnabledPrefState, "chartHoursEnabledPrefState");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PerformanceChartSettingsDuxo_Factory(stateProvider, savedStateHandle, chartFeatureStore, settingsStore, benchmarkIntroShownPrefState, chartHoursEnabledPrefState, duxoBundle);
        }

        @JvmStatic
        public final PerformanceChartSettingsDuxo newInstance(PerformanceChartSettingsStateProvider stateProvider, SavedStateHandle savedStateHandle, PerformanceChartFeatureStore chartFeatureStore, PerformanceChartSettingsV2Store settingsStore, StateFlow2<Boolean> benchmarkIntroShownPrefState, StateFlow2<Boolean> chartHoursEnabledPrefState, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(chartFeatureStore, "chartFeatureStore");
            Intrinsics.checkNotNullParameter(settingsStore, "settingsStore");
            Intrinsics.checkNotNullParameter(benchmarkIntroShownPrefState, "benchmarkIntroShownPrefState");
            Intrinsics.checkNotNullParameter(chartHoursEnabledPrefState, "chartHoursEnabledPrefState");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PerformanceChartSettingsDuxo(stateProvider, savedStateHandle, chartFeatureStore, settingsStore, benchmarkIntroShownPrefState, chartHoursEnabledPrefState, duxoBundle);
        }
    }
}
