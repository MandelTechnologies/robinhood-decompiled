package com.robinhood.android.portfolio.benchmarkSearch;

import com.robinhood.android.models.portfolio.BenchmarkSelection2;
import com.robinhood.android.models.portfolio.PerformanceChartBenchmarkV2;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchStateProvider3;
import com.robinhood.android.udf.StateProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BenchmarkSearchStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDataState;", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchViewState;", "<init>", "()V", "reduce", "dataState", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BenchmarkSearchStateProvider implements StateProvider<BenchmarkSearchDataState, BenchmarkSearchStateProvider3> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public BenchmarkSearchStateProvider3 reduce(BenchmarkSearchDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getSettings() == null || dataState.getSearchResults() == null) {
            return BenchmarkSearchStateProvider3.Loading.INSTANCE;
        }
        PerformanceChartSettingsV2 settings = dataState.getSettings();
        List<PerformanceChartBenchmarkV2> benchmarks = dataState.getSettings().getBenchmarks();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(benchmarks, 10));
        Iterator<T> it = benchmarks.iterator();
        while (it.hasNext()) {
            arrayList.add(BenchmarkSelection2.toSelectionModel((PerformanceChartBenchmarkV2) it.next()));
        }
        return new BenchmarkSearchStateProvider3.Ready(settings, extensions2.toImmutableList(arrayList), dataState.getSearchResults(), dataState.isSaving(), dataState.getInEtfRegionGate(), dataState.getInCryptoRegionGate());
    }
}
