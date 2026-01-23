package com.robinhood.android.portfolio.benchmarkSearch;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.BenchmarkSearchActivityScopedStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2Store;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BenchmarkSearchDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "benchmarkSearchActivityScopedStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/BenchmarkSearchActivityScopedStore;", "settingsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2Store;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class BenchmarkSearchDuxo_Factory implements Factory<BenchmarkSearchDuxo> {
    private final Provider<BenchmarkSearchActivityScopedStore> benchmarkSearchActivityScopedStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<PerformanceChartSettingsV2Store> settingsStore;
    private final Provider<BenchmarkSearchStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final BenchmarkSearchDuxo_Factory create(Provider<BenchmarkSearchStateProvider> provider, Provider<SavedStateHandle> provider2, Provider<BenchmarkSearchActivityScopedStore> provider3, Provider<PerformanceChartSettingsV2Store> provider4, Provider<RegionGateProvider> provider5, Provider<DuxoBundle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final BenchmarkSearchDuxo newInstance(BenchmarkSearchStateProvider benchmarkSearchStateProvider, SavedStateHandle savedStateHandle, BenchmarkSearchActivityScopedStore benchmarkSearchActivityScopedStore, PerformanceChartSettingsV2Store performanceChartSettingsV2Store, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(benchmarkSearchStateProvider, savedStateHandle, benchmarkSearchActivityScopedStore, performanceChartSettingsV2Store, regionGateProvider, duxoBundle);
    }

    public BenchmarkSearchDuxo_Factory(Provider<BenchmarkSearchStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<BenchmarkSearchActivityScopedStore> benchmarkSearchActivityScopedStore, Provider<PerformanceChartSettingsV2Store> settingsStore, Provider<RegionGateProvider> regionGateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(benchmarkSearchActivityScopedStore, "benchmarkSearchActivityScopedStore");
        Intrinsics.checkNotNullParameter(settingsStore, "settingsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
        this.benchmarkSearchActivityScopedStore = benchmarkSearchActivityScopedStore;
        this.settingsStore = settingsStore;
        this.regionGateProvider = regionGateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public BenchmarkSearchDuxo get() {
        Companion companion = INSTANCE;
        BenchmarkSearchStateProvider benchmarkSearchStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(benchmarkSearchStateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        BenchmarkSearchActivityScopedStore benchmarkSearchActivityScopedStore = this.benchmarkSearchActivityScopedStore.get();
        Intrinsics.checkNotNullExpressionValue(benchmarkSearchActivityScopedStore, "get(...)");
        PerformanceChartSettingsV2Store performanceChartSettingsV2Store = this.settingsStore.get();
        Intrinsics.checkNotNullExpressionValue(performanceChartSettingsV2Store, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(benchmarkSearchStateProvider, savedStateHandle, benchmarkSearchActivityScopedStore, performanceChartSettingsV2Store, regionGateProvider, duxoBundle);
    }

    /* compiled from: BenchmarkSearchDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "benchmarkSearchActivityScopedStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/BenchmarkSearchActivityScopedStore;", "settingsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2Store;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDuxo;", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BenchmarkSearchDuxo_Factory create(Provider<BenchmarkSearchStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<BenchmarkSearchActivityScopedStore> benchmarkSearchActivityScopedStore, Provider<PerformanceChartSettingsV2Store> settingsStore, Provider<RegionGateProvider> regionGateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(benchmarkSearchActivityScopedStore, "benchmarkSearchActivityScopedStore");
            Intrinsics.checkNotNullParameter(settingsStore, "settingsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new BenchmarkSearchDuxo_Factory(stateProvider, savedStateHandle, benchmarkSearchActivityScopedStore, settingsStore, regionGateProvider, duxoBundle);
        }

        @JvmStatic
        public final BenchmarkSearchDuxo newInstance(BenchmarkSearchStateProvider stateProvider, SavedStateHandle savedStateHandle, BenchmarkSearchActivityScopedStore benchmarkSearchActivityScopedStore, PerformanceChartSettingsV2Store settingsStore, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(benchmarkSearchActivityScopedStore, "benchmarkSearchActivityScopedStore");
            Intrinsics.checkNotNullParameter(settingsStore, "settingsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new BenchmarkSearchDuxo(stateProvider, savedStateHandle, benchmarkSearchActivityScopedStore, settingsStore, regionGateProvider, duxoBundle);
        }
    }
}
