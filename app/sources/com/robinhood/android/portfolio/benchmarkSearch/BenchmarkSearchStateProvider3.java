package com.robinhood.android.portfolio.benchmarkSearch;

import com.robinhood.android.models.portfolio.BenchmarkSelection;
import com.robinhood.android.models.portfolio.BenchmarkingSearchResults;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import com.robinhood.android.models.portfolio.api.PerformanceChartStyle;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BenchmarkSearchStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchViewState;", "", "Loading", "Ready", "Companion", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchViewState, reason: use source file name */
/* loaded from: classes11.dex */
public interface BenchmarkSearchStateProvider3 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: BenchmarkSearchStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchViewState$Loading;", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchViewState;", "<init>", "()V", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchViewState$Loading */
    public static final class Loading implements BenchmarkSearchStateProvider3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: BenchmarkSearchStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchViewState$Ready;", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchViewState;", "settings", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "selectedBenchmarks", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/portfolio/BenchmarkSelection;", "searchResults", "Lcom/robinhood/android/models/portfolio/BenchmarkingSearchResults;", "isSaving", "", "inEtfRegionGate", "inCryptoRegionGate", "<init>", "(Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/models/portfolio/BenchmarkingSearchResults;ZZZ)V", "getSettings", "()Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "getSelectedBenchmarks", "()Lkotlinx/collections/immutable/ImmutableList;", "getSearchResults", "()Lcom/robinhood/android/models/portfolio/BenchmarkingSearchResults;", "()Z", "getInEtfRegionGate", "getInCryptoRegionGate", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchViewState$Ready, reason: from toString */
    public static final /* data */ class Ready implements BenchmarkSearchStateProvider3 {
        public static final int $stable = 8;
        private final boolean inCryptoRegionGate;
        private final boolean inEtfRegionGate;
        private final boolean isSaving;
        private final BenchmarkingSearchResults searchResults;
        private final ImmutableList<BenchmarkSelection> selectedBenchmarks;
        private final PerformanceChartSettingsV2 settings;

        public static /* synthetic */ Ready copy$default(Ready ready, PerformanceChartSettingsV2 performanceChartSettingsV2, ImmutableList immutableList, BenchmarkingSearchResults benchmarkingSearchResults, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                performanceChartSettingsV2 = ready.settings;
            }
            if ((i & 2) != 0) {
                immutableList = ready.selectedBenchmarks;
            }
            if ((i & 4) != 0) {
                benchmarkingSearchResults = ready.searchResults;
            }
            if ((i & 8) != 0) {
                z = ready.isSaving;
            }
            if ((i & 16) != 0) {
                z2 = ready.inEtfRegionGate;
            }
            if ((i & 32) != 0) {
                z3 = ready.inCryptoRegionGate;
            }
            boolean z4 = z2;
            boolean z5 = z3;
            return ready.copy(performanceChartSettingsV2, immutableList, benchmarkingSearchResults, z, z4, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final PerformanceChartSettingsV2 getSettings() {
            return this.settings;
        }

        public final ImmutableList<BenchmarkSelection> component2() {
            return this.selectedBenchmarks;
        }

        /* renamed from: component3, reason: from getter */
        public final BenchmarkingSearchResults getSearchResults() {
            return this.searchResults;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSaving() {
            return this.isSaving;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getInEtfRegionGate() {
            return this.inEtfRegionGate;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getInCryptoRegionGate() {
            return this.inCryptoRegionGate;
        }

        public final Ready copy(PerformanceChartSettingsV2 settings, ImmutableList<BenchmarkSelection> selectedBenchmarks, BenchmarkingSearchResults searchResults, boolean isSaving, boolean inEtfRegionGate, boolean inCryptoRegionGate) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(selectedBenchmarks, "selectedBenchmarks");
            Intrinsics.checkNotNullParameter(searchResults, "searchResults");
            return new Ready(settings, selectedBenchmarks, searchResults, isSaving, inEtfRegionGate, inCryptoRegionGate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.settings, ready.settings) && Intrinsics.areEqual(this.selectedBenchmarks, ready.selectedBenchmarks) && Intrinsics.areEqual(this.searchResults, ready.searchResults) && this.isSaving == ready.isSaving && this.inEtfRegionGate == ready.inEtfRegionGate && this.inCryptoRegionGate == ready.inCryptoRegionGate;
        }

        public int hashCode() {
            return (((((((((this.settings.hashCode() * 31) + this.selectedBenchmarks.hashCode()) * 31) + this.searchResults.hashCode()) * 31) + Boolean.hashCode(this.isSaving)) * 31) + Boolean.hashCode(this.inEtfRegionGate)) * 31) + Boolean.hashCode(this.inCryptoRegionGate);
        }

        public String toString() {
            return "Ready(settings=" + this.settings + ", selectedBenchmarks=" + this.selectedBenchmarks + ", searchResults=" + this.searchResults + ", isSaving=" + this.isSaving + ", inEtfRegionGate=" + this.inEtfRegionGate + ", inCryptoRegionGate=" + this.inCryptoRegionGate + ")";
        }

        public Ready(PerformanceChartSettingsV2 settings, ImmutableList<BenchmarkSelection> selectedBenchmarks, BenchmarkingSearchResults searchResults, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(selectedBenchmarks, "selectedBenchmarks");
            Intrinsics.checkNotNullParameter(searchResults, "searchResults");
            this.settings = settings;
            this.selectedBenchmarks = selectedBenchmarks;
            this.searchResults = searchResults;
            this.isSaving = z;
            this.inEtfRegionGate = z2;
            this.inCryptoRegionGate = z3;
        }

        public final PerformanceChartSettingsV2 getSettings() {
            return this.settings;
        }

        public final ImmutableList<BenchmarkSelection> getSelectedBenchmarks() {
            return this.selectedBenchmarks;
        }

        public final BenchmarkingSearchResults getSearchResults() {
            return this.searchResults;
        }

        public final boolean isSaving() {
            return this.isSaving;
        }

        public final boolean getInEtfRegionGate() {
            return this.inEtfRegionGate;
        }

        public final boolean getInCryptoRegionGate() {
            return this.inCryptoRegionGate;
        }
    }

    /* compiled from: BenchmarkSearchStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchViewState$Ready;", "getLoadingMock", "()Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchViewState$Ready;", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchViewState$Companion, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Ready loadingMock = new Ready(new PerformanceChartSettingsV2("", PerformanceChartType.UNKNOWN, CollectionsKt.emptyList(), PerformanceChartStyle.PERFORMANCE), extensions2.persistentListOf(), new BenchmarkingSearchResults("", "", extensions2.persistentListOf()), false, false, false);

        private Companion() {
        }

        public final Ready getLoadingMock() {
            return loadingMock;
        }
    }
}
