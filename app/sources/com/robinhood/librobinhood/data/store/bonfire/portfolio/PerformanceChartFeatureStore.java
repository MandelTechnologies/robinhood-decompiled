package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartExperiments;
import com.robinhood.shared.app.type.AppType;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceChartFeatureStore.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartFeatureStore;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "isChartViewEnabled", "Lio/reactivex/Observable;", "", "chartType", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "isAdtToggleEnabled", "isBenchmarksEnabled", "isConfigurable", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class PerformanceChartFeatureStore {
    private final AppType appType;
    private final ExperimentsStore experimentStore;

    public PerformanceChartFeatureStore(AppType appType, ExperimentsStore experimentStore) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
        this.appType = appType;
        this.experimentStore = experimentStore;
    }

    public final Observable<Boolean> isChartViewEnabled(PerformanceChartType chartType) {
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        if (chartType != PerformanceChartType.OPTIONS) {
            return ExperimentsProvider.DefaultImpls.streamState$default(this.experimentStore, new Experiment[]{Experiment.PORTFOLIO_PERFORMANCE_CHART_VIEW.INSTANCE}, false, null, 6, null);
        }
        Observable<Boolean> observableJust = Observable.just(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    public final Observable<Boolean> isAdtToggleEnabled(PerformanceChartType chartType) {
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Observable<Boolean> observableJust = Observable.just(Boolean.valueOf(chartType != PerformanceChartType.OPTIONS));
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    public final Observable<Boolean> isBenchmarksEnabled(PerformanceChartType chartType) {
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        if (chartType == PerformanceChartType.OPTIONS) {
            Observable<Boolean> observableJust = Observable.just(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        Observable<Boolean> map = ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentStore, PerformanceChartExperiments.Benchmarking.INSTANCE, PerformanceChartExperiments.Benchmarking.Variants.INSTANCE.getDefault(), false, 4, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartFeatureStore.isBenchmarksEnabled.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(PerformanceChartExperiments.Benchmarking.Variants it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.isEnabled());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<Boolean> isConfigurable(PerformanceChartType chartType) {
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        if (this.appType == AppType.RHC || chartType == PerformanceChartType.CRYPTO) {
            Observable<Boolean> observableJust = Observable.just(Boolean.FALSE);
            Intrinsics.checkNotNull(observableJust);
            return observableJust;
        }
        Observable<Boolean> observableCombineLatest = Observable.combineLatest(isChartViewEnabled(chartType), isAdtToggleEnabled(chartType), isBenchmarksEnabled(chartType), new Function3() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartFeatureStore.isConfigurable.1
            @Override // io.reactivex.functions.Function3
            public final Boolean apply(Boolean isChartViewEnabled, Boolean isAdtToggleEnabled, Boolean isBenchmarkingEnabled) {
                Intrinsics.checkNotNullParameter(isChartViewEnabled, "isChartViewEnabled");
                Intrinsics.checkNotNullParameter(isAdtToggleEnabled, "isAdtToggleEnabled");
                Intrinsics.checkNotNullParameter(isBenchmarkingEnabled, "isBenchmarkingEnabled");
                return Boolean.valueOf(isChartViewEnabled.booleanValue() || isAdtToggleEnabled.booleanValue() || isBenchmarkingEnabled.booleanValue());
            }
        });
        Intrinsics.checkNotNull(observableCombineLatest);
        return observableCombineLatest;
    }
}
