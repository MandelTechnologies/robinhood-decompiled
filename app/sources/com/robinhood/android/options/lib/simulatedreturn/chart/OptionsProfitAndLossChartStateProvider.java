package com.robinhood.android.options.lib.simulatedreturn.chart;

import com.robinhood.android.charts.model.Point;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartParams;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossMetrics;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p355ui.EquityPositionBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import com.robinhood.models.p355ui.OptionSimulatedChartLegBundle;
import com.robinhood.models.p355ui.UnderlyingQuote;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.datetime.Instant;

/* compiled from: OptionsProfitAndLossChartStateProvider.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0019\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartViewState;", "<init>", "()V", "reduce", "dataState", "getSliderEvaluationTime", "Lkotlinx/datetime/Instant;", "sliderPosition", "", "(Ljava/lang/Double;)Lkotlinx/datetime/Instant;", "getPostProcessParams", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartPostProcessParams;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsProfitAndLossChartStateProvider implements StateProvider<OptionsProfitAndLossChartDataState, OptionsProfitAndLossChartViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public OptionsProfitAndLossChartViewState reduce(OptionsProfitAndLossChartDataState dataState) {
        BigDecimal quantity;
        BigDecimal averageCost;
        Boolean boolValueOf;
        OptionSimulatedChartBundle5 underlying;
        EquityPositionBundle equityPositionBundle;
        EquityPositionBundle equityPositionBundle2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        OptionSimulatedChartBundle chartBundle = dataState.getChartBundle();
        if (chartBundle == null || (equityPositionBundle2 = chartBundle.getEquityPositionBundle()) == null || (quantity = equityPositionBundle2.getQuantity()) == null) {
            quantity = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = quantity;
        Intrinsics.checkNotNull(bigDecimal);
        OptionSimulatedChartBundle chartBundle2 = dataState.getChartBundle();
        if (chartBundle2 == null || (equityPositionBundle = chartBundle2.getEquityPositionBundle()) == null || (averageCost = equityPositionBundle.getAverageCost()) == null) {
            averageCost = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = averageCost;
        Intrinsics.checkNotNull(bigDecimal2);
        OptionSimulatedChartBundle chartBundle3 = dataState.getChartBundle();
        ImmutableList<OptionSimulatedChartLegBundle> legBundles = chartBundle3 != null ? chartBundle3.getLegBundles() : null;
        OptionSimulatedChartBundle chartBundle4 = dataState.getChartBundle();
        ProfitAndLossChartParams pnlChartParams = OptionsProfitAndLossChartUtils.getPnlChartParams(bigDecimal, bigDecimal2, legBundles, chartBundle4 != null ? chartBundle4.getUnderlying() : null, dataState.getExpirationTimes(), dataState.getOptionQuotes(), dataState.getSimulatedReturnsConfigs(), dataState.getProfitLossLaunchMode(), dataState.getUnderlyingQuote(), getSliderEvaluationTime(dataState.getSliderPosition()));
        OptionsProfitAndLossChartPostProcessParams postProcessParams = getPostProcessParams(dataState);
        OptionsSimulatedReturnLoggingState loggingState = dataState.getLoggingState();
        OptionSimulatedChartBundle chartBundle5 = dataState.getChartBundle();
        OptionsSimulatedChartScrubState scrubState = dataState.getScrubState();
        Point snappedScrubPoint = dataState.getSnappedScrubPoint();
        String strategyCode = dataState.getStrategyCode();
        OptionsProfitAndLossChartData chartData = dataState.getChartData();
        OptionSimulatedChartBundle chartBundle6 = dataState.getChartBundle();
        if (chartBundle6 != null) {
            boolValueOf = Boolean.valueOf(chartBundle6.getLegBundles().size() == 1);
        } else {
            boolValueOf = null;
        }
        OptionsSimulatedReturnErrorState errorState = dataState.getErrorState();
        ProfitAndLossMetrics pnlMetrics = dataState.getPnlMetrics();
        OptionSimulatedChartBundle chartBundle7 = dataState.getChartBundle();
        OptionChain.UnderlyingType type2 = (chartBundle7 == null || (underlying = chartBundle7.getUnderlying()) == null) ? null : underlying.getType();
        UnderlyingQuote underlyingQuote = dataState.getUnderlyingQuote();
        return new OptionsProfitAndLossChartViewState(pnlChartParams, dataState.getProfitLossLaunchMode(), postProcessParams, chartData, loggingState, chartBundle5, scrubState, snappedScrubPoint, boolValueOf, strategyCode, null, errorState, pnlMetrics, type2, underlyingQuote != null ? underlyingQuote.getCurrentValue() : null, dataState.getIsSnappedToUnderlyingQuote());
    }

    private final Instant getSliderEvaluationTime(Double sliderPosition) {
        if (sliderPosition == null) {
            return null;
        }
        return Instant.Companion.fromEpochSeconds$default(Instant.INSTANCE, (long) sliderPosition.doubleValue(), 0L, 2, null);
    }

    private final OptionsProfitAndLossChartPostProcessParams getPostProcessParams(OptionsProfitAndLossChartDataState dataState) {
        OptionSimulatedChartBundle5 underlying;
        OptionChain.UnderlyingType type2;
        BigDecimal tradeValueMultiplier;
        OptionSimulatedChartBundle chartBundle = dataState.getChartBundle();
        if (chartBundle == null || (underlying = chartBundle.getUnderlying()) == null || (type2 = underlying.getType()) == null) {
            return null;
        }
        if (chartBundle.getTradeValueMultiplier() != null) {
            tradeValueMultiplier = chartBundle.getTradeValueMultiplier();
            if (tradeValueMultiplier == null) {
                return null;
            }
        } else {
            if (!chartBundle.getLegBundles().isEmpty()) {
                return null;
            }
            tradeValueMultiplier = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(tradeValueMultiplier);
        return new OptionsProfitAndLossChartPostProcessParams(tradeValueMultiplier, dataState.isFullyExpanded(), type2);
    }
}
