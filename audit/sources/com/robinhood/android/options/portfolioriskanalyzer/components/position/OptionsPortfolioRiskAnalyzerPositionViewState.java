package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import com.robinhood.android.options.calculation.greeks.OptionsGreeks;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDataState4;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerOptionPositionRowViewState;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionsPortfolioRiskAnalyzerPositionViewState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003JY\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionViewState;", "", "aggregatedGreeks", "Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;", "chartBundle", "Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "headerCtaString", "", "profitLossLaunchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;", "sliderLaunchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;", "equityPositionRow", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerEquityPositionRowViewState;", "optionPositionRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerOptionPositionRowViewState$Aggregate;", "<init>", "(Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;Lcom/robinhood/models/ui/OptionSimulatedChartBundle;Ljava/lang/String;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerEquityPositionRowViewState;Lkotlinx/collections/immutable/ImmutableList;)V", "getAggregatedGreeks", "()Lcom/robinhood/android/options/calculation/greeks/OptionsGreeks;", "getChartBundle", "()Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "getHeaderCtaString", "()Ljava/lang/String;", "getProfitLossLaunchMode", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;", "getSliderLaunchMode", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;", "getEquityPositionRow", "()Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerEquityPositionRowViewState;", "getOptionPositionRows", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsPortfolioRiskAnalyzerPositionViewState {
    public static final int $stable = 8;
    private final OptionsGreeks aggregatedGreeks;
    private final OptionSimulatedChartBundle chartBundle;
    private final OptionsPortfolioRiskAnalyzerEquityPositionRowViewState equityPositionRow;
    private final String headerCtaString;
    private final ImmutableList<OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate> optionPositionRows;
    private final OptionsProfitAndLossChartDataState4 profitLossLaunchMode;
    private final OptionsSimulatedReturnSliderLaunchMode.Time sliderLaunchMode;

    public static /* synthetic */ OptionsPortfolioRiskAnalyzerPositionViewState copy$default(OptionsPortfolioRiskAnalyzerPositionViewState optionsPortfolioRiskAnalyzerPositionViewState, OptionsGreeks optionsGreeks, OptionSimulatedChartBundle optionSimulatedChartBundle, String str, OptionsProfitAndLossChartDataState4 optionsProfitAndLossChartDataState4, OptionsSimulatedReturnSliderLaunchMode.Time time, OptionsPortfolioRiskAnalyzerEquityPositionRowViewState optionsPortfolioRiskAnalyzerEquityPositionRowViewState, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            optionsGreeks = optionsPortfolioRiskAnalyzerPositionViewState.aggregatedGreeks;
        }
        if ((i & 2) != 0) {
            optionSimulatedChartBundle = optionsPortfolioRiskAnalyzerPositionViewState.chartBundle;
        }
        if ((i & 4) != 0) {
            str = optionsPortfolioRiskAnalyzerPositionViewState.headerCtaString;
        }
        if ((i & 8) != 0) {
            optionsProfitAndLossChartDataState4 = optionsPortfolioRiskAnalyzerPositionViewState.profitLossLaunchMode;
        }
        if ((i & 16) != 0) {
            time = optionsPortfolioRiskAnalyzerPositionViewState.sliderLaunchMode;
        }
        if ((i & 32) != 0) {
            optionsPortfolioRiskAnalyzerEquityPositionRowViewState = optionsPortfolioRiskAnalyzerPositionViewState.equityPositionRow;
        }
        if ((i & 64) != 0) {
            immutableList = optionsPortfolioRiskAnalyzerPositionViewState.optionPositionRows;
        }
        OptionsPortfolioRiskAnalyzerEquityPositionRowViewState optionsPortfolioRiskAnalyzerEquityPositionRowViewState2 = optionsPortfolioRiskAnalyzerEquityPositionRowViewState;
        ImmutableList immutableList2 = immutableList;
        OptionsSimulatedReturnSliderLaunchMode.Time time2 = time;
        String str2 = str;
        return optionsPortfolioRiskAnalyzerPositionViewState.copy(optionsGreeks, optionSimulatedChartBundle, str2, optionsProfitAndLossChartDataState4, time2, optionsPortfolioRiskAnalyzerEquityPositionRowViewState2, immutableList2);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionsGreeks getAggregatedGreeks() {
        return this.aggregatedGreeks;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionSimulatedChartBundle getChartBundle() {
        return this.chartBundle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHeaderCtaString() {
        return this.headerCtaString;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionsProfitAndLossChartDataState4 getProfitLossLaunchMode() {
        return this.profitLossLaunchMode;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionsSimulatedReturnSliderLaunchMode.Time getSliderLaunchMode() {
        return this.sliderLaunchMode;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionsPortfolioRiskAnalyzerEquityPositionRowViewState getEquityPositionRow() {
        return this.equityPositionRow;
    }

    public final ImmutableList<OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate> component7() {
        return this.optionPositionRows;
    }

    public final OptionsPortfolioRiskAnalyzerPositionViewState copy(OptionsGreeks aggregatedGreeks, OptionSimulatedChartBundle chartBundle, String headerCtaString, OptionsProfitAndLossChartDataState4 profitLossLaunchMode, OptionsSimulatedReturnSliderLaunchMode.Time sliderLaunchMode, OptionsPortfolioRiskAnalyzerEquityPositionRowViewState equityPositionRow, ImmutableList<OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate> optionPositionRows) {
        Intrinsics.checkNotNullParameter(aggregatedGreeks, "aggregatedGreeks");
        Intrinsics.checkNotNullParameter(chartBundle, "chartBundle");
        Intrinsics.checkNotNullParameter(headerCtaString, "headerCtaString");
        Intrinsics.checkNotNullParameter(sliderLaunchMode, "sliderLaunchMode");
        Intrinsics.checkNotNullParameter(optionPositionRows, "optionPositionRows");
        return new OptionsPortfolioRiskAnalyzerPositionViewState(aggregatedGreeks, chartBundle, headerCtaString, profitLossLaunchMode, sliderLaunchMode, equityPositionRow, optionPositionRows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsPortfolioRiskAnalyzerPositionViewState)) {
            return false;
        }
        OptionsPortfolioRiskAnalyzerPositionViewState optionsPortfolioRiskAnalyzerPositionViewState = (OptionsPortfolioRiskAnalyzerPositionViewState) other;
        return Intrinsics.areEqual(this.aggregatedGreeks, optionsPortfolioRiskAnalyzerPositionViewState.aggregatedGreeks) && Intrinsics.areEqual(this.chartBundle, optionsPortfolioRiskAnalyzerPositionViewState.chartBundle) && Intrinsics.areEqual(this.headerCtaString, optionsPortfolioRiskAnalyzerPositionViewState.headerCtaString) && Intrinsics.areEqual(this.profitLossLaunchMode, optionsPortfolioRiskAnalyzerPositionViewState.profitLossLaunchMode) && Intrinsics.areEqual(this.sliderLaunchMode, optionsPortfolioRiskAnalyzerPositionViewState.sliderLaunchMode) && Intrinsics.areEqual(this.equityPositionRow, optionsPortfolioRiskAnalyzerPositionViewState.equityPositionRow) && Intrinsics.areEqual(this.optionPositionRows, optionsPortfolioRiskAnalyzerPositionViewState.optionPositionRows);
    }

    public int hashCode() {
        int iHashCode = ((((this.aggregatedGreeks.hashCode() * 31) + this.chartBundle.hashCode()) * 31) + this.headerCtaString.hashCode()) * 31;
        OptionsProfitAndLossChartDataState4 optionsProfitAndLossChartDataState4 = this.profitLossLaunchMode;
        int iHashCode2 = (((iHashCode + (optionsProfitAndLossChartDataState4 == null ? 0 : optionsProfitAndLossChartDataState4.hashCode())) * 31) + this.sliderLaunchMode.hashCode()) * 31;
        OptionsPortfolioRiskAnalyzerEquityPositionRowViewState optionsPortfolioRiskAnalyzerEquityPositionRowViewState = this.equityPositionRow;
        return ((iHashCode2 + (optionsPortfolioRiskAnalyzerEquityPositionRowViewState != null ? optionsPortfolioRiskAnalyzerEquityPositionRowViewState.hashCode() : 0)) * 31) + this.optionPositionRows.hashCode();
    }

    public String toString() {
        return "OptionsPortfolioRiskAnalyzerPositionViewState(aggregatedGreeks=" + this.aggregatedGreeks + ", chartBundle=" + this.chartBundle + ", headerCtaString=" + this.headerCtaString + ", profitLossLaunchMode=" + this.profitLossLaunchMode + ", sliderLaunchMode=" + this.sliderLaunchMode + ", equityPositionRow=" + this.equityPositionRow + ", optionPositionRows=" + this.optionPositionRows + ")";
    }

    public OptionsPortfolioRiskAnalyzerPositionViewState(OptionsGreeks aggregatedGreeks, OptionSimulatedChartBundle chartBundle, String headerCtaString, OptionsProfitAndLossChartDataState4 optionsProfitAndLossChartDataState4, OptionsSimulatedReturnSliderLaunchMode.Time sliderLaunchMode, OptionsPortfolioRiskAnalyzerEquityPositionRowViewState optionsPortfolioRiskAnalyzerEquityPositionRowViewState, ImmutableList<OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate> optionPositionRows) {
        Intrinsics.checkNotNullParameter(aggregatedGreeks, "aggregatedGreeks");
        Intrinsics.checkNotNullParameter(chartBundle, "chartBundle");
        Intrinsics.checkNotNullParameter(headerCtaString, "headerCtaString");
        Intrinsics.checkNotNullParameter(sliderLaunchMode, "sliderLaunchMode");
        Intrinsics.checkNotNullParameter(optionPositionRows, "optionPositionRows");
        this.aggregatedGreeks = aggregatedGreeks;
        this.chartBundle = chartBundle;
        this.headerCtaString = headerCtaString;
        this.profitLossLaunchMode = optionsProfitAndLossChartDataState4;
        this.sliderLaunchMode = sliderLaunchMode;
        this.equityPositionRow = optionsPortfolioRiskAnalyzerEquityPositionRowViewState;
        this.optionPositionRows = optionPositionRows;
    }

    public final OptionsGreeks getAggregatedGreeks() {
        return this.aggregatedGreeks;
    }

    public final OptionSimulatedChartBundle getChartBundle() {
        return this.chartBundle;
    }

    public final String getHeaderCtaString() {
        return this.headerCtaString;
    }

    public final OptionsProfitAndLossChartDataState4 getProfitLossLaunchMode() {
        return this.profitLossLaunchMode;
    }

    public final OptionsSimulatedReturnSliderLaunchMode.Time getSliderLaunchMode() {
        return this.sliderLaunchMode;
    }

    public final OptionsPortfolioRiskAnalyzerEquityPositionRowViewState getEquityPositionRow() {
        return this.equityPositionRow;
    }

    public final ImmutableList<OptionsPortfolioRiskAnalyzerOptionPositionRowViewState.Aggregate> getOptionPositionRows() {
        return this.optionPositionRows;
    }
}
