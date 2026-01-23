package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchViewState;", "", "query", "", "positionRowsViewState", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchPositionRowViewState;", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getQuery", "()Ljava/lang/String;", "getPositionRowsViewState", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsPortfolioRiskAnalyzerSearchViewState {
    public static final int $stable = 8;
    private final ImmutableList<OptionsPortfolioRiskAnalyzerSearchPositionRowViewState> positionRowsViewState;
    private final String query;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionsPortfolioRiskAnalyzerSearchViewState copy$default(OptionsPortfolioRiskAnalyzerSearchViewState optionsPortfolioRiskAnalyzerSearchViewState, String str, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionsPortfolioRiskAnalyzerSearchViewState.query;
        }
        if ((i & 2) != 0) {
            immutableList = optionsPortfolioRiskAnalyzerSearchViewState.positionRowsViewState;
        }
        return optionsPortfolioRiskAnalyzerSearchViewState.copy(str, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final ImmutableList<OptionsPortfolioRiskAnalyzerSearchPositionRowViewState> component2() {
        return this.positionRowsViewState;
    }

    public final OptionsPortfolioRiskAnalyzerSearchViewState copy(String query, ImmutableList<OptionsPortfolioRiskAnalyzerSearchPositionRowViewState> positionRowsViewState) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(positionRowsViewState, "positionRowsViewState");
        return new OptionsPortfolioRiskAnalyzerSearchViewState(query, positionRowsViewState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsPortfolioRiskAnalyzerSearchViewState)) {
            return false;
        }
        OptionsPortfolioRiskAnalyzerSearchViewState optionsPortfolioRiskAnalyzerSearchViewState = (OptionsPortfolioRiskAnalyzerSearchViewState) other;
        return Intrinsics.areEqual(this.query, optionsPortfolioRiskAnalyzerSearchViewState.query) && Intrinsics.areEqual(this.positionRowsViewState, optionsPortfolioRiskAnalyzerSearchViewState.positionRowsViewState);
    }

    public int hashCode() {
        return (this.query.hashCode() * 31) + this.positionRowsViewState.hashCode();
    }

    public String toString() {
        return "OptionsPortfolioRiskAnalyzerSearchViewState(query=" + this.query + ", positionRowsViewState=" + this.positionRowsViewState + ")";
    }

    public OptionsPortfolioRiskAnalyzerSearchViewState(String query, ImmutableList<OptionsPortfolioRiskAnalyzerSearchPositionRowViewState> positionRowsViewState) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(positionRowsViewState, "positionRowsViewState");
        this.query = query;
        this.positionRowsViewState = positionRowsViewState;
    }

    public final String getQuery() {
        return this.query;
    }

    public final ImmutableList<OptionsPortfolioRiskAnalyzerSearchPositionRowViewState> getPositionRowsViewState() {
        return this.positionRowsViewState;
    }
}
