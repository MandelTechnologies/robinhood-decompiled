package com.robinhood.android.options.lib.simulatedreturn.header;

import android.content.res.Resources;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewState3;
import com.robinhood.compose.bento.theme.BentoTheme4;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedChartHeaderState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;", "", "OptionsProfitAndLossMetricsHeader", "OptionsSimulatedReturnHeader", "PortfolioRiskAnalyzerHeader", "EmptyHeader", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState$EmptyHeader;", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState$OptionsProfitAndLossMetricsHeader;", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState$OptionsSimulatedReturnHeader;", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState$PortfolioRiskAnalyzerHeader;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface OptionsSimulatedChartHeaderState {

    /* compiled from: OptionsSimulatedChartHeaderState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003JK\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState$OptionsProfitAndLossMetricsHeader;", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;", "maxProfit", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "maxLoss", "breakeven", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getMaxProfit", "()Lkotlin/jvm/functions/Function1;", "getMaxLoss", "getBreakeven", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionsProfitAndLossMetricsHeader implements OptionsSimulatedChartHeaderState {
        public static final int $stable = 0;
        private final Function1<Resources, String> breakeven;
        private final Function1<Resources, String> maxLoss;
        private final Function1<Resources, String> maxProfit;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OptionsProfitAndLossMetricsHeader copy$default(OptionsProfitAndLossMetricsHeader optionsProfitAndLossMetricsHeader, Function1 function1, Function1 function12, Function1 function13, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = optionsProfitAndLossMetricsHeader.maxProfit;
            }
            if ((i & 2) != 0) {
                function12 = optionsProfitAndLossMetricsHeader.maxLoss;
            }
            if ((i & 4) != 0) {
                function13 = optionsProfitAndLossMetricsHeader.breakeven;
            }
            return optionsProfitAndLossMetricsHeader.copy(function1, function12, function13);
        }

        public final Function1<Resources, String> component1() {
            return this.maxProfit;
        }

        public final Function1<Resources, String> component2() {
            return this.maxLoss;
        }

        public final Function1<Resources, String> component3() {
            return this.breakeven;
        }

        public final OptionsProfitAndLossMetricsHeader copy(Function1<? super Resources, String> maxProfit, Function1<? super Resources, String> maxLoss, Function1<? super Resources, String> breakeven) {
            Intrinsics.checkNotNullParameter(maxProfit, "maxProfit");
            Intrinsics.checkNotNullParameter(maxLoss, "maxLoss");
            Intrinsics.checkNotNullParameter(breakeven, "breakeven");
            return new OptionsProfitAndLossMetricsHeader(maxProfit, maxLoss, breakeven);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionsProfitAndLossMetricsHeader)) {
                return false;
            }
            OptionsProfitAndLossMetricsHeader optionsProfitAndLossMetricsHeader = (OptionsProfitAndLossMetricsHeader) other;
            return Intrinsics.areEqual(this.maxProfit, optionsProfitAndLossMetricsHeader.maxProfit) && Intrinsics.areEqual(this.maxLoss, optionsProfitAndLossMetricsHeader.maxLoss) && Intrinsics.areEqual(this.breakeven, optionsProfitAndLossMetricsHeader.breakeven);
        }

        public int hashCode() {
            return (((this.maxProfit.hashCode() * 31) + this.maxLoss.hashCode()) * 31) + this.breakeven.hashCode();
        }

        public String toString() {
            return "OptionsProfitAndLossMetricsHeader(maxProfit=" + this.maxProfit + ", maxLoss=" + this.maxLoss + ", breakeven=" + this.breakeven + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OptionsProfitAndLossMetricsHeader(Function1<? super Resources, String> maxProfit, Function1<? super Resources, String> maxLoss, Function1<? super Resources, String> breakeven) {
            Intrinsics.checkNotNullParameter(maxProfit, "maxProfit");
            Intrinsics.checkNotNullParameter(maxLoss, "maxLoss");
            Intrinsics.checkNotNullParameter(breakeven, "breakeven");
            this.maxProfit = maxProfit;
            this.maxLoss = maxLoss;
            this.breakeven = breakeven;
        }

        public final Function1<Resources, String> getMaxProfit() {
            return this.maxProfit;
        }

        public final Function1<Resources, String> getMaxLoss() {
            return this.maxLoss;
        }

        public final Function1<Resources, String> getBreakeven() {
            return this.breakeven;
        }
    }

    /* compiled from: OptionsSimulatedChartHeaderState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0003\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\tHÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState$OptionsSimulatedReturnHeader;", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;", "tickerDirection", "Lcom/robinhood/android/options/lib/simulatedreturn/header/TickerDirection;", "tickerText", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "estimatedContractPriceLabelRes", "", "estimatedContractPriceValue", "type", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;", "<init>", "(Lcom/robinhood/android/options/lib/simulatedreturn/header/TickerDirection;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;)V", "getTickerDirection", "()Lcom/robinhood/android/options/lib/simulatedreturn/header/TickerDirection;", "getTickerText", "()Lkotlin/jvm/functions/Function1;", "getEstimatedContractPriceLabelRes", "()I", "getEstimatedContractPriceValue", "getType", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionsSimulatedReturnHeader implements OptionsSimulatedChartHeaderState {
        public static final int $stable = 0;
        private final int estimatedContractPriceLabelRes;
        private final Function1<Resources, String> estimatedContractPriceValue;
        private final OptionsSimulatedChartHeaderState2 tickerDirection;
        private final Function1<Resources, String> tickerText;
        private final OptionsSimulatedReturnChartViewState3 type;

        public static /* synthetic */ OptionsSimulatedReturnHeader copy$default(OptionsSimulatedReturnHeader optionsSimulatedReturnHeader, OptionsSimulatedChartHeaderState2 optionsSimulatedChartHeaderState2, Function1 function1, int i, Function1 function12, OptionsSimulatedReturnChartViewState3 optionsSimulatedReturnChartViewState3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                optionsSimulatedChartHeaderState2 = optionsSimulatedReturnHeader.tickerDirection;
            }
            if ((i2 & 2) != 0) {
                function1 = optionsSimulatedReturnHeader.tickerText;
            }
            if ((i2 & 4) != 0) {
                i = optionsSimulatedReturnHeader.estimatedContractPriceLabelRes;
            }
            if ((i2 & 8) != 0) {
                function12 = optionsSimulatedReturnHeader.estimatedContractPriceValue;
            }
            if ((i2 & 16) != 0) {
                optionsSimulatedReturnChartViewState3 = optionsSimulatedReturnHeader.type;
            }
            OptionsSimulatedReturnChartViewState3 optionsSimulatedReturnChartViewState32 = optionsSimulatedReturnChartViewState3;
            int i3 = i;
            return optionsSimulatedReturnHeader.copy(optionsSimulatedChartHeaderState2, function1, i3, function12, optionsSimulatedReturnChartViewState32);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionsSimulatedChartHeaderState2 getTickerDirection() {
            return this.tickerDirection;
        }

        public final Function1<Resources, String> component2() {
            return this.tickerText;
        }

        /* renamed from: component3, reason: from getter */
        public final int getEstimatedContractPriceLabelRes() {
            return this.estimatedContractPriceLabelRes;
        }

        public final Function1<Resources, String> component4() {
            return this.estimatedContractPriceValue;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionsSimulatedReturnChartViewState3 getType() {
            return this.type;
        }

        public final OptionsSimulatedReturnHeader copy(OptionsSimulatedChartHeaderState2 tickerDirection, Function1<? super Resources, String> tickerText, int estimatedContractPriceLabelRes, Function1<? super Resources, String> estimatedContractPriceValue, OptionsSimulatedReturnChartViewState3 type2) {
            Intrinsics.checkNotNullParameter(tickerDirection, "tickerDirection");
            Intrinsics.checkNotNullParameter(tickerText, "tickerText");
            Intrinsics.checkNotNullParameter(estimatedContractPriceValue, "estimatedContractPriceValue");
            Intrinsics.checkNotNullParameter(type2, "type");
            return new OptionsSimulatedReturnHeader(tickerDirection, tickerText, estimatedContractPriceLabelRes, estimatedContractPriceValue, type2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionsSimulatedReturnHeader)) {
                return false;
            }
            OptionsSimulatedReturnHeader optionsSimulatedReturnHeader = (OptionsSimulatedReturnHeader) other;
            return this.tickerDirection == optionsSimulatedReturnHeader.tickerDirection && Intrinsics.areEqual(this.tickerText, optionsSimulatedReturnHeader.tickerText) && this.estimatedContractPriceLabelRes == optionsSimulatedReturnHeader.estimatedContractPriceLabelRes && Intrinsics.areEqual(this.estimatedContractPriceValue, optionsSimulatedReturnHeader.estimatedContractPriceValue) && this.type == optionsSimulatedReturnHeader.type;
        }

        public int hashCode() {
            return (((((((this.tickerDirection.hashCode() * 31) + this.tickerText.hashCode()) * 31) + Integer.hashCode(this.estimatedContractPriceLabelRes)) * 31) + this.estimatedContractPriceValue.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "OptionsSimulatedReturnHeader(tickerDirection=" + this.tickerDirection + ", tickerText=" + this.tickerText + ", estimatedContractPriceLabelRes=" + this.estimatedContractPriceLabelRes + ", estimatedContractPriceValue=" + this.estimatedContractPriceValue + ", type=" + this.type + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OptionsSimulatedReturnHeader(OptionsSimulatedChartHeaderState2 tickerDirection, Function1<? super Resources, String> tickerText, int i, Function1<? super Resources, String> estimatedContractPriceValue, OptionsSimulatedReturnChartViewState3 type2) {
            Intrinsics.checkNotNullParameter(tickerDirection, "tickerDirection");
            Intrinsics.checkNotNullParameter(tickerText, "tickerText");
            Intrinsics.checkNotNullParameter(estimatedContractPriceValue, "estimatedContractPriceValue");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.tickerDirection = tickerDirection;
            this.tickerText = tickerText;
            this.estimatedContractPriceLabelRes = i;
            this.estimatedContractPriceValue = estimatedContractPriceValue;
            this.type = type2;
        }

        public final OptionsSimulatedChartHeaderState2 getTickerDirection() {
            return this.tickerDirection;
        }

        public final Function1<Resources, String> getTickerText() {
            return this.tickerText;
        }

        public final int getEstimatedContractPriceLabelRes() {
            return this.estimatedContractPriceLabelRes;
        }

        public final Function1<Resources, String> getEstimatedContractPriceValue() {
            return this.estimatedContractPriceValue;
        }

        public final OptionsSimulatedReturnChartViewState3 getType() {
            return this.type;
        }
    }

    /* compiled from: OptionsSimulatedChartHeaderState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003Ja\u0010\u001b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState$PortfolioRiskAnalyzerHeader;", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;", "maxProfit", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "maxLoss", "totalReturn", "totalReturnPercentage", "Ljava/math/BigDecimal;", "totalReturnDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/math/BigDecimal;Lcom/robinhood/compose/bento/theme/Direction;)V", "getMaxProfit", "()Lkotlin/jvm/functions/Function1;", "getMaxLoss", "getTotalReturn", "getTotalReturnPercentage", "()Ljava/math/BigDecimal;", "getTotalReturnDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PortfolioRiskAnalyzerHeader implements OptionsSimulatedChartHeaderState {
        public static final int $stable = 8;
        private final Function1<Resources, String> maxLoss;
        private final Function1<Resources, String> maxProfit;
        private final Function1<Resources, String> totalReturn;
        private final BentoTheme4 totalReturnDirection;
        private final BigDecimal totalReturnPercentage;

        public static /* synthetic */ PortfolioRiskAnalyzerHeader copy$default(PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader, Function1 function1, Function1 function12, Function1 function13, BigDecimal bigDecimal, BentoTheme4 bentoTheme4, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = portfolioRiskAnalyzerHeader.maxProfit;
            }
            if ((i & 2) != 0) {
                function12 = portfolioRiskAnalyzerHeader.maxLoss;
            }
            if ((i & 4) != 0) {
                function13 = portfolioRiskAnalyzerHeader.totalReturn;
            }
            if ((i & 8) != 0) {
                bigDecimal = portfolioRiskAnalyzerHeader.totalReturnPercentage;
            }
            if ((i & 16) != 0) {
                bentoTheme4 = portfolioRiskAnalyzerHeader.totalReturnDirection;
            }
            BentoTheme4 bentoTheme42 = bentoTheme4;
            Function1 function14 = function13;
            return portfolioRiskAnalyzerHeader.copy(function1, function12, function14, bigDecimal, bentoTheme42);
        }

        public final Function1<Resources, String> component1() {
            return this.maxProfit;
        }

        public final Function1<Resources, String> component2() {
            return this.maxLoss;
        }

        public final Function1<Resources, String> component3() {
            return this.totalReturn;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getTotalReturnPercentage() {
            return this.totalReturnPercentage;
        }

        /* renamed from: component5, reason: from getter */
        public final BentoTheme4 getTotalReturnDirection() {
            return this.totalReturnDirection;
        }

        public final PortfolioRiskAnalyzerHeader copy(Function1<? super Resources, String> maxProfit, Function1<? super Resources, String> maxLoss, Function1<? super Resources, String> totalReturn, BigDecimal totalReturnPercentage, BentoTheme4 totalReturnDirection) {
            Intrinsics.checkNotNullParameter(maxProfit, "maxProfit");
            Intrinsics.checkNotNullParameter(maxLoss, "maxLoss");
            Intrinsics.checkNotNullParameter(totalReturn, "totalReturn");
            Intrinsics.checkNotNullParameter(totalReturnDirection, "totalReturnDirection");
            return new PortfolioRiskAnalyzerHeader(maxProfit, maxLoss, totalReturn, totalReturnPercentage, totalReturnDirection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PortfolioRiskAnalyzerHeader)) {
                return false;
            }
            PortfolioRiskAnalyzerHeader portfolioRiskAnalyzerHeader = (PortfolioRiskAnalyzerHeader) other;
            return Intrinsics.areEqual(this.maxProfit, portfolioRiskAnalyzerHeader.maxProfit) && Intrinsics.areEqual(this.maxLoss, portfolioRiskAnalyzerHeader.maxLoss) && Intrinsics.areEqual(this.totalReturn, portfolioRiskAnalyzerHeader.totalReturn) && Intrinsics.areEqual(this.totalReturnPercentage, portfolioRiskAnalyzerHeader.totalReturnPercentage) && this.totalReturnDirection == portfolioRiskAnalyzerHeader.totalReturnDirection;
        }

        public int hashCode() {
            int iHashCode = ((((this.maxProfit.hashCode() * 31) + this.maxLoss.hashCode()) * 31) + this.totalReturn.hashCode()) * 31;
            BigDecimal bigDecimal = this.totalReturnPercentage;
            return ((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.totalReturnDirection.hashCode();
        }

        public String toString() {
            return "PortfolioRiskAnalyzerHeader(maxProfit=" + this.maxProfit + ", maxLoss=" + this.maxLoss + ", totalReturn=" + this.totalReturn + ", totalReturnPercentage=" + this.totalReturnPercentage + ", totalReturnDirection=" + this.totalReturnDirection + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PortfolioRiskAnalyzerHeader(Function1<? super Resources, String> maxProfit, Function1<? super Resources, String> maxLoss, Function1<? super Resources, String> totalReturn, BigDecimal bigDecimal, BentoTheme4 totalReturnDirection) {
            Intrinsics.checkNotNullParameter(maxProfit, "maxProfit");
            Intrinsics.checkNotNullParameter(maxLoss, "maxLoss");
            Intrinsics.checkNotNullParameter(totalReturn, "totalReturn");
            Intrinsics.checkNotNullParameter(totalReturnDirection, "totalReturnDirection");
            this.maxProfit = maxProfit;
            this.maxLoss = maxLoss;
            this.totalReturn = totalReturn;
            this.totalReturnPercentage = bigDecimal;
            this.totalReturnDirection = totalReturnDirection;
        }

        public final Function1<Resources, String> getMaxProfit() {
            return this.maxProfit;
        }

        public final Function1<Resources, String> getMaxLoss() {
            return this.maxLoss;
        }

        public final Function1<Resources, String> getTotalReturn() {
            return this.totalReturn;
        }

        public final BigDecimal getTotalReturnPercentage() {
            return this.totalReturnPercentage;
        }

        public final BentoTheme4 getTotalReturnDirection() {
            return this.totalReturnDirection;
        }
    }

    /* compiled from: OptionsSimulatedChartHeaderState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState$EmptyHeader;", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EmptyHeader implements OptionsSimulatedChartHeaderState {
        public static final int $stable = 0;
        public static final EmptyHeader INSTANCE = new EmptyHeader();

        public boolean equals(Object other) {
            return this == other || (other instanceof EmptyHeader);
        }

        public int hashCode() {
            return -169297878;
        }

        public String toString() {
            return "EmptyHeader";
        }

        private EmptyHeader() {
        }
    }
}
