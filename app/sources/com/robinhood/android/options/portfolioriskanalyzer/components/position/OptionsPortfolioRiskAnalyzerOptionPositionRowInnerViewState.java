package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import com.robinhood.android.options.portfolioriskanalyzer.components.search.PnLUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState;", "", "pnlUiState", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/PnLUiState;", "dataGridState", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState;", "<init>", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/PnLUiState;Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState;)V", "getPnlUiState", "()Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/PnLUiState;", "getDataGridState", "()Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState {
    public static final int $stable = 8;
    private final OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState dataGridState;
    private final PnLUiState pnlUiState;

    public static /* synthetic */ OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState copy$default(OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState, PnLUiState pnLUiState, OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState, int i, Object obj) {
        if ((i & 1) != 0) {
            pnLUiState = optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState.pnlUiState;
        }
        if ((i & 2) != 0) {
            optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState = optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState.dataGridState;
        }
        return optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState.copy(pnLUiState, optionsPortfolioRiskAnalyzerOptionPositionDataGridViewState);
    }

    /* renamed from: component1, reason: from getter */
    public final PnLUiState getPnlUiState() {
        return this.pnlUiState;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState getDataGridState() {
        return this.dataGridState;
    }

    public final OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState copy(PnLUiState pnlUiState, OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState dataGridState) {
        Intrinsics.checkNotNullParameter(pnlUiState, "pnlUiState");
        Intrinsics.checkNotNullParameter(dataGridState, "dataGridState");
        return new OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState(pnlUiState, dataGridState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState)) {
            return false;
        }
        OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState = (OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState) other;
        return Intrinsics.areEqual(this.pnlUiState, optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState.pnlUiState) && Intrinsics.areEqual(this.dataGridState, optionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState.dataGridState);
    }

    public int hashCode() {
        return (this.pnlUiState.hashCode() * 31) + this.dataGridState.hashCode();
    }

    public String toString() {
        return "OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState(pnlUiState=" + this.pnlUiState + ", dataGridState=" + this.dataGridState + ")";
    }

    public OptionsPortfolioRiskAnalyzerOptionPositionRowInnerViewState(PnLUiState pnlUiState, OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState dataGridState) {
        Intrinsics.checkNotNullParameter(pnlUiState, "pnlUiState");
        Intrinsics.checkNotNullParameter(dataGridState, "dataGridState");
        this.pnlUiState = pnlUiState;
        this.dataGridState = dataGridState;
    }

    public final PnLUiState getPnlUiState() {
        return this.pnlUiState;
    }

    public final OptionsPortfolioRiskAnalyzerOptionPositionDataGridViewState getDataGridState() {
        return this.dataGridState;
    }
}
