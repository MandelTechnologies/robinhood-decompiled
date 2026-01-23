package com.robinhood.android.portfolio.benchmarkSearch;

import com.robinhood.android.models.portfolio.BenchmarkingSearchResults;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BenchmarkSearchStateProvider.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/benchmarkSearch/BenchmarkSearchDataState;", "", "settings", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "searchResults", "Lcom/robinhood/android/models/portfolio/BenchmarkingSearchResults;", "isSaving", "", "inEtfRegionGate", "inCryptoRegionGate", "<init>", "(Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;Lcom/robinhood/android/models/portfolio/BenchmarkingSearchResults;ZZZ)V", "getSettings", "()Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "getSearchResults", "()Lcom/robinhood/android/models/portfolio/BenchmarkingSearchResults;", "()Z", "getInEtfRegionGate", "getInCryptoRegionGate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BenchmarkSearchDataState {
    public static final int $stable = 8;
    private final boolean inCryptoRegionGate;
    private final boolean inEtfRegionGate;
    private final boolean isSaving;
    private final BenchmarkingSearchResults searchResults;
    private final PerformanceChartSettingsV2 settings;

    public BenchmarkSearchDataState() {
        this(null, null, false, false, false, 31, null);
    }

    public static /* synthetic */ BenchmarkSearchDataState copy$default(BenchmarkSearchDataState benchmarkSearchDataState, PerformanceChartSettingsV2 performanceChartSettingsV2, BenchmarkingSearchResults benchmarkingSearchResults, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            performanceChartSettingsV2 = benchmarkSearchDataState.settings;
        }
        if ((i & 2) != 0) {
            benchmarkingSearchResults = benchmarkSearchDataState.searchResults;
        }
        if ((i & 4) != 0) {
            z = benchmarkSearchDataState.isSaving;
        }
        if ((i & 8) != 0) {
            z2 = benchmarkSearchDataState.inEtfRegionGate;
        }
        if ((i & 16) != 0) {
            z3 = benchmarkSearchDataState.inCryptoRegionGate;
        }
        boolean z4 = z3;
        boolean z5 = z;
        return benchmarkSearchDataState.copy(performanceChartSettingsV2, benchmarkingSearchResults, z5, z2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final PerformanceChartSettingsV2 getSettings() {
        return this.settings;
    }

    /* renamed from: component2, reason: from getter */
    public final BenchmarkingSearchResults getSearchResults() {
        return this.searchResults;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSaving() {
        return this.isSaving;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getInEtfRegionGate() {
        return this.inEtfRegionGate;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getInCryptoRegionGate() {
        return this.inCryptoRegionGate;
    }

    public final BenchmarkSearchDataState copy(PerformanceChartSettingsV2 settings, BenchmarkingSearchResults searchResults, boolean isSaving, boolean inEtfRegionGate, boolean inCryptoRegionGate) {
        return new BenchmarkSearchDataState(settings, searchResults, isSaving, inEtfRegionGate, inCryptoRegionGate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BenchmarkSearchDataState)) {
            return false;
        }
        BenchmarkSearchDataState benchmarkSearchDataState = (BenchmarkSearchDataState) other;
        return Intrinsics.areEqual(this.settings, benchmarkSearchDataState.settings) && Intrinsics.areEqual(this.searchResults, benchmarkSearchDataState.searchResults) && this.isSaving == benchmarkSearchDataState.isSaving && this.inEtfRegionGate == benchmarkSearchDataState.inEtfRegionGate && this.inCryptoRegionGate == benchmarkSearchDataState.inCryptoRegionGate;
    }

    public int hashCode() {
        PerformanceChartSettingsV2 performanceChartSettingsV2 = this.settings;
        int iHashCode = (performanceChartSettingsV2 == null ? 0 : performanceChartSettingsV2.hashCode()) * 31;
        BenchmarkingSearchResults benchmarkingSearchResults = this.searchResults;
        return ((((((iHashCode + (benchmarkingSearchResults != null ? benchmarkingSearchResults.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSaving)) * 31) + Boolean.hashCode(this.inEtfRegionGate)) * 31) + Boolean.hashCode(this.inCryptoRegionGate);
    }

    public String toString() {
        return "BenchmarkSearchDataState(settings=" + this.settings + ", searchResults=" + this.searchResults + ", isSaving=" + this.isSaving + ", inEtfRegionGate=" + this.inEtfRegionGate + ", inCryptoRegionGate=" + this.inCryptoRegionGate + ")";
    }

    public BenchmarkSearchDataState(PerformanceChartSettingsV2 performanceChartSettingsV2, BenchmarkingSearchResults benchmarkingSearchResults, boolean z, boolean z2, boolean z3) {
        this.settings = performanceChartSettingsV2;
        this.searchResults = benchmarkingSearchResults;
        this.isSaving = z;
        this.inEtfRegionGate = z2;
        this.inCryptoRegionGate = z3;
    }

    public /* synthetic */ BenchmarkSearchDataState(PerformanceChartSettingsV2 performanceChartSettingsV2, BenchmarkingSearchResults benchmarkingSearchResults, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : performanceChartSettingsV2, (i & 2) != 0 ? null : benchmarkingSearchResults, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }

    public final PerformanceChartSettingsV2 getSettings() {
        return this.settings;
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
