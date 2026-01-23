package com.robinhood.android.options.lib.simulatedreturn.chart;

import androidx.compose.runtime.Composer;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedChartLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartLaunchMode;", "", "<init>", "()V", "ProfitAndLoss", "SimulatedReturn", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartLaunchMode$ProfitAndLoss;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartLaunchMode$SimulatedReturn;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class OptionsSimulatedChartLaunchMode {
    public static final int $stable = 0;

    public /* synthetic */ OptionsSimulatedChartLaunchMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionsSimulatedChartLaunchMode() {
    }

    /* compiled from: OptionsSimulatedChartLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u001e\u0010*\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b*\u0010)J\u001c\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b-\u0010,JÂ\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00110\u00102\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00110\u00102\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u00102\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001bJ\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b\n\u0010!R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b\u000b\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010%R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010'R%\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bE\u0010)R%\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\bF\u0010)R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\bH\u0010,R%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0017\u0010G\u001a\u0004\bI\u0010,¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartLaunchMode$ProfitAndLoss;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartLaunchMode;", "", "accountNumber", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "loggingState", "", "sliderPosition", "", "usePreTradeStyle", "isBottomSheetHiddenOrNull", "isFullyExpanded", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;", "profitLossLaunchMode", "Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "chartBundle", "Lkotlin/Function1;", "", "onEstimatedContractPriceUpdated", "Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "onErrorStateUpdated", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;", "headerComponent", "errorComponent", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Ljava/lang/Double;ZZZLcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;Lcom/robinhood/models/ui/OptionSimulatedChartBundle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "component3", "()Ljava/lang/Double;", "component4", "()Z", "component5", "component6", "component7", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;", "component8", "()Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "component9", "()Lkotlin/jvm/functions/Function1;", "component10", "component11", "()Lkotlin/jvm/functions/Function3;", "component12", "copy", "(Ljava/lang/String;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Ljava/lang/Double;ZZZLcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;Lcom/robinhood/models/ui/OptionSimulatedChartBundle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartLaunchMode$ProfitAndLoss;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountNumber", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "getLoggingState", "Ljava/lang/Double;", "getSliderPosition", "Z", "getUsePreTradeStyle", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;", "getProfitLossLaunchMode", "Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "getChartBundle", "Lkotlin/jvm/functions/Function1;", "getOnEstimatedContractPriceUpdated", "getOnErrorStateUpdated", "Lkotlin/jvm/functions/Function3;", "getHeaderComponent", "getErrorComponent", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ProfitAndLoss extends OptionsSimulatedChartLaunchMode {
        public static final int $stable = 8;
        private final String accountNumber;
        private final OptionSimulatedChartBundle chartBundle;
        private final Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> errorComponent;
        private final Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> headerComponent;
        private final boolean isBottomSheetHiddenOrNull;
        private final boolean isFullyExpanded;
        private final OptionsSimulatedReturnLoggingState loggingState;
        private final Function1<OptionsSimulatedReturnErrorState, Unit> onErrorStateUpdated;
        private final Function1<Double, Unit> onEstimatedContractPriceUpdated;
        private final OptionsProfitAndLossChartDataState4 profitLossLaunchMode;
        private final Double sliderPosition;
        private final boolean usePreTradeStyle;

        public static /* synthetic */ ProfitAndLoss copy$default(ProfitAndLoss profitAndLoss, String str, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Double d, boolean z, boolean z2, boolean z3, OptionsProfitAndLossChartDataState4 optionsProfitAndLossChartDataState4, OptionSimulatedChartBundle optionSimulatedChartBundle, Function1 function1, Function1 function12, Function3 function3, Function3 function32, int i, Object obj) {
            if ((i & 1) != 0) {
                str = profitAndLoss.accountNumber;
            }
            if ((i & 2) != 0) {
                optionsSimulatedReturnLoggingState = profitAndLoss.loggingState;
            }
            if ((i & 4) != 0) {
                d = profitAndLoss.sliderPosition;
            }
            if ((i & 8) != 0) {
                z = profitAndLoss.usePreTradeStyle;
            }
            if ((i & 16) != 0) {
                z2 = profitAndLoss.isBottomSheetHiddenOrNull;
            }
            if ((i & 32) != 0) {
                z3 = profitAndLoss.isFullyExpanded;
            }
            if ((i & 64) != 0) {
                optionsProfitAndLossChartDataState4 = profitAndLoss.profitLossLaunchMode;
            }
            if ((i & 128) != 0) {
                optionSimulatedChartBundle = profitAndLoss.chartBundle;
            }
            if ((i & 256) != 0) {
                function1 = profitAndLoss.onEstimatedContractPriceUpdated;
            }
            if ((i & 512) != 0) {
                function12 = profitAndLoss.onErrorStateUpdated;
            }
            if ((i & 1024) != 0) {
                function3 = profitAndLoss.headerComponent;
            }
            if ((i & 2048) != 0) {
                function32 = profitAndLoss.errorComponent;
            }
            Function3 function33 = function3;
            Function3 function34 = function32;
            Function1 function13 = function1;
            Function1 function14 = function12;
            OptionsProfitAndLossChartDataState4 optionsProfitAndLossChartDataState42 = optionsProfitAndLossChartDataState4;
            OptionSimulatedChartBundle optionSimulatedChartBundle2 = optionSimulatedChartBundle;
            boolean z4 = z2;
            boolean z5 = z3;
            return profitAndLoss.copy(str, optionsSimulatedReturnLoggingState, d, z, z4, z5, optionsProfitAndLossChartDataState42, optionSimulatedChartBundle2, function13, function14, function33, function34);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Function1<OptionsSimulatedReturnErrorState, Unit> component10() {
            return this.onErrorStateUpdated;
        }

        public final Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> component11() {
            return this.headerComponent;
        }

        public final Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> component12() {
            return this.errorComponent;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionsSimulatedReturnLoggingState getLoggingState() {
            return this.loggingState;
        }

        /* renamed from: component3, reason: from getter */
        public final Double getSliderPosition() {
            return this.sliderPosition;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getUsePreTradeStyle() {
            return this.usePreTradeStyle;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsBottomSheetHiddenOrNull() {
            return this.isBottomSheetHiddenOrNull;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsFullyExpanded() {
            return this.isFullyExpanded;
        }

        /* renamed from: component7, reason: from getter */
        public final OptionsProfitAndLossChartDataState4 getProfitLossLaunchMode() {
            return this.profitLossLaunchMode;
        }

        /* renamed from: component8, reason: from getter */
        public final OptionSimulatedChartBundle getChartBundle() {
            return this.chartBundle;
        }

        public final Function1<Double, Unit> component9() {
            return this.onEstimatedContractPriceUpdated;
        }

        public final ProfitAndLoss copy(String accountNumber, OptionsSimulatedReturnLoggingState loggingState, Double sliderPosition, boolean usePreTradeStyle, boolean isBottomSheetHiddenOrNull, boolean isFullyExpanded, OptionsProfitAndLossChartDataState4 profitLossLaunchMode, OptionSimulatedChartBundle chartBundle, Function1<? super Double, Unit> onEstimatedContractPriceUpdated, Function1<? super OptionsSimulatedReturnErrorState, Unit> onErrorStateUpdated, Function3<? super OptionsSimulatedChartHeaderState, ? super Composer, ? super Integer, Unit> headerComponent, Function3<? super OptionsSimulatedReturnErrorState, ? super Composer, ? super Integer, Unit> errorComponent) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(profitLossLaunchMode, "profitLossLaunchMode");
            Intrinsics.checkNotNullParameter(chartBundle, "chartBundle");
            Intrinsics.checkNotNullParameter(onEstimatedContractPriceUpdated, "onEstimatedContractPriceUpdated");
            Intrinsics.checkNotNullParameter(onErrorStateUpdated, "onErrorStateUpdated");
            Intrinsics.checkNotNullParameter(headerComponent, "headerComponent");
            return new ProfitAndLoss(accountNumber, loggingState, sliderPosition, usePreTradeStyle, isBottomSheetHiddenOrNull, isFullyExpanded, profitLossLaunchMode, chartBundle, onEstimatedContractPriceUpdated, onErrorStateUpdated, headerComponent, errorComponent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProfitAndLoss)) {
                return false;
            }
            ProfitAndLoss profitAndLoss = (ProfitAndLoss) other;
            return Intrinsics.areEqual(this.accountNumber, profitAndLoss.accountNumber) && Intrinsics.areEqual(this.loggingState, profitAndLoss.loggingState) && Intrinsics.areEqual((Object) this.sliderPosition, (Object) profitAndLoss.sliderPosition) && this.usePreTradeStyle == profitAndLoss.usePreTradeStyle && this.isBottomSheetHiddenOrNull == profitAndLoss.isBottomSheetHiddenOrNull && this.isFullyExpanded == profitAndLoss.isFullyExpanded && Intrinsics.areEqual(this.profitLossLaunchMode, profitAndLoss.profitLossLaunchMode) && Intrinsics.areEqual(this.chartBundle, profitAndLoss.chartBundle) && Intrinsics.areEqual(this.onEstimatedContractPriceUpdated, profitAndLoss.onEstimatedContractPriceUpdated) && Intrinsics.areEqual(this.onErrorStateUpdated, profitAndLoss.onErrorStateUpdated) && Intrinsics.areEqual(this.headerComponent, profitAndLoss.headerComponent) && Intrinsics.areEqual(this.errorComponent, profitAndLoss.errorComponent);
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState = this.loggingState;
            int iHashCode2 = (iHashCode + (optionsSimulatedReturnLoggingState == null ? 0 : optionsSimulatedReturnLoggingState.hashCode())) * 31;
            Double d = this.sliderPosition;
            int iHashCode3 = (((((((((((((((((iHashCode2 + (d == null ? 0 : d.hashCode())) * 31) + Boolean.hashCode(this.usePreTradeStyle)) * 31) + Boolean.hashCode(this.isBottomSheetHiddenOrNull)) * 31) + Boolean.hashCode(this.isFullyExpanded)) * 31) + this.profitLossLaunchMode.hashCode()) * 31) + this.chartBundle.hashCode()) * 31) + this.onEstimatedContractPriceUpdated.hashCode()) * 31) + this.onErrorStateUpdated.hashCode()) * 31) + this.headerComponent.hashCode()) * 31;
            Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> function3 = this.errorComponent;
            return iHashCode3 + (function3 != null ? function3.hashCode() : 0);
        }

        public String toString() {
            return "ProfitAndLoss(accountNumber=" + this.accountNumber + ", loggingState=" + this.loggingState + ", sliderPosition=" + this.sliderPosition + ", usePreTradeStyle=" + this.usePreTradeStyle + ", isBottomSheetHiddenOrNull=" + this.isBottomSheetHiddenOrNull + ", isFullyExpanded=" + this.isFullyExpanded + ", profitLossLaunchMode=" + this.profitLossLaunchMode + ", chartBundle=" + this.chartBundle + ", onEstimatedContractPriceUpdated=" + this.onEstimatedContractPriceUpdated + ", onErrorStateUpdated=" + this.onErrorStateUpdated + ", headerComponent=" + this.headerComponent + ", errorComponent=" + this.errorComponent + ")";
        }

        public /* synthetic */ ProfitAndLoss(String str, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Double d, boolean z, boolean z2, boolean z3, OptionsProfitAndLossChartDataState4 optionsProfitAndLossChartDataState4, OptionSimulatedChartBundle optionSimulatedChartBundle, Function1 function1, Function1 function12, Function3 function3, Function3 function32, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, optionsSimulatedReturnLoggingState, d, z, (i & 16) != 0 ? true : z2, z3, optionsProfitAndLossChartDataState4, optionSimulatedChartBundle, function1, function12, function3, function32);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final OptionsSimulatedReturnLoggingState getLoggingState() {
            return this.loggingState;
        }

        public final Double getSliderPosition() {
            return this.sliderPosition;
        }

        public final boolean getUsePreTradeStyle() {
            return this.usePreTradeStyle;
        }

        public final boolean isBottomSheetHiddenOrNull() {
            return this.isBottomSheetHiddenOrNull;
        }

        public final boolean isFullyExpanded() {
            return this.isFullyExpanded;
        }

        public final OptionsProfitAndLossChartDataState4 getProfitLossLaunchMode() {
            return this.profitLossLaunchMode;
        }

        public final OptionSimulatedChartBundle getChartBundle() {
            return this.chartBundle;
        }

        public final Function1<Double, Unit> getOnEstimatedContractPriceUpdated() {
            return this.onEstimatedContractPriceUpdated;
        }

        public final Function1<OptionsSimulatedReturnErrorState, Unit> getOnErrorStateUpdated() {
            return this.onErrorStateUpdated;
        }

        public final Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> getHeaderComponent() {
            return this.headerComponent;
        }

        public final Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> getErrorComponent() {
            return this.errorComponent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ProfitAndLoss(String accountNumber, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Double d, boolean z, boolean z2, boolean z3, OptionsProfitAndLossChartDataState4 profitLossLaunchMode, OptionSimulatedChartBundle chartBundle, Function1<? super Double, Unit> onEstimatedContractPriceUpdated, Function1<? super OptionsSimulatedReturnErrorState, Unit> onErrorStateUpdated, Function3<? super OptionsSimulatedChartHeaderState, ? super Composer, ? super Integer, Unit> headerComponent, Function3<? super OptionsSimulatedReturnErrorState, ? super Composer, ? super Integer, Unit> function3) {
            super(null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(profitLossLaunchMode, "profitLossLaunchMode");
            Intrinsics.checkNotNullParameter(chartBundle, "chartBundle");
            Intrinsics.checkNotNullParameter(onEstimatedContractPriceUpdated, "onEstimatedContractPriceUpdated");
            Intrinsics.checkNotNullParameter(onErrorStateUpdated, "onErrorStateUpdated");
            Intrinsics.checkNotNullParameter(headerComponent, "headerComponent");
            this.accountNumber = accountNumber;
            this.loggingState = optionsSimulatedReturnLoggingState;
            this.sliderPosition = d;
            this.usePreTradeStyle = z;
            this.isBottomSheetHiddenOrNull = z2;
            this.isFullyExpanded = z3;
            this.profitLossLaunchMode = profitLossLaunchMode;
            this.chartBundle = chartBundle;
            this.onEstimatedContractPriceUpdated = onEstimatedContractPriceUpdated;
            this.onErrorStateUpdated = onErrorStateUpdated;
            this.headerComponent = headerComponent;
            this.errorComponent = function3;
        }
    }

    /* compiled from: OptionsSimulatedChartLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b0\u0010.J\u001e\u00101\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003¢\u0006\u0004\b1\u00102J\u001e\u00103\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003¢\u0006\u0004\b3\u00102J\u001c\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003¢\u0006\u0004\b4\u00105J\u001e\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b6\u00105JÞ\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00160\u00152\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u00152\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u00152\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010 J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020\u00112\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010 R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010C\u001a\u0004\bD\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bJ\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bL\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u0010,R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bP\u0010.R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\b\u0013\u0010.R\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\b\u0014\u0010.R%\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010Q\u001a\u0004\bR\u00102R%\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0019\u0010Q\u001a\u0004\bS\u00102R#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010T\u001a\u0004\bU\u00105R%\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u001c\u0010T\u001a\u0004\bV\u00105¨\u0006W"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartLaunchMode$SimulatedReturn;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartLaunchMode;", "", "accountNumber", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "activityErrorHandler", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;", "type", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "loggingState", "Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "chartBundle", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "simulatedReturnLaunchMode", "", "sliderPosition", "", "usePreTradeStyle", "isBottomSheetHiddenOrNull", "isFullyExpanded", "Lkotlin/Function1;", "", "onEstimatedContractPriceUpdated", "Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "onErrorStateUpdated", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;", "headerComponent", "errorComponent", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Lcom/robinhood/models/ui/OptionSimulatedChartBundle;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;Ljava/lang/Double;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "component3", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;", "component4", "()Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "component5", "()Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "component6", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "component7", "()Ljava/lang/Double;", "component8", "()Z", "component9", "component10", "component11", "()Lkotlin/jvm/functions/Function1;", "component12", "component13", "()Lkotlin/jvm/functions/Function3;", "component14", "copy", "(Ljava/lang/String;Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Lcom/robinhood/models/ui/OptionSimulatedChartBundle;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;Ljava/lang/Double;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartLaunchMode$SimulatedReturn;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountNumber", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "getActivityErrorHandler", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;", "getType", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "getLoggingState", "Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "getChartBundle", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "getSimulatedReturnLaunchMode", "Ljava/lang/Double;", "getSliderPosition", "Z", "getUsePreTradeStyle", "Lkotlin/jvm/functions/Function1;", "getOnEstimatedContractPriceUpdated", "getOnErrorStateUpdated", "Lkotlin/jvm/functions/Function3;", "getHeaderComponent", "getErrorComponent", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SimulatedReturn extends OptionsSimulatedChartLaunchMode {
        public static final int $stable = 8;
        private final String accountNumber;
        private final ActivityErrorHandler activityErrorHandler;
        private final OptionSimulatedChartBundle chartBundle;
        private final Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> errorComponent;
        private final Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> headerComponent;
        private final boolean isBottomSheetHiddenOrNull;
        private final boolean isFullyExpanded;
        private final OptionsSimulatedReturnLoggingState loggingState;
        private final Function1<OptionsSimulatedReturnErrorState, Unit> onErrorStateUpdated;
        private final Function1<Double, Unit> onEstimatedContractPriceUpdated;
        private final OptionsSimulatedReturnChartDataState2 simulatedReturnLaunchMode;
        private final Double sliderPosition;
        private final OptionsSimulatedReturnChartViewState3 type;
        private final boolean usePreTradeStyle;

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsFullyExpanded() {
            return this.isFullyExpanded;
        }

        public final Function1<Double, Unit> component11() {
            return this.onEstimatedContractPriceUpdated;
        }

        public final Function1<OptionsSimulatedReturnErrorState, Unit> component12() {
            return this.onErrorStateUpdated;
        }

        public final Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> component13() {
            return this.headerComponent;
        }

        public final Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> component14() {
            return this.errorComponent;
        }

        /* renamed from: component2, reason: from getter */
        public final ActivityErrorHandler getActivityErrorHandler() {
            return this.activityErrorHandler;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionsSimulatedReturnChartViewState3 getType() {
            return this.type;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionsSimulatedReturnLoggingState getLoggingState() {
            return this.loggingState;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionSimulatedChartBundle getChartBundle() {
            return this.chartBundle;
        }

        /* renamed from: component6, reason: from getter */
        public final OptionsSimulatedReturnChartDataState2 getSimulatedReturnLaunchMode() {
            return this.simulatedReturnLaunchMode;
        }

        /* renamed from: component7, reason: from getter */
        public final Double getSliderPosition() {
            return this.sliderPosition;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getUsePreTradeStyle() {
            return this.usePreTradeStyle;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsBottomSheetHiddenOrNull() {
            return this.isBottomSheetHiddenOrNull;
        }

        public final SimulatedReturn copy(String accountNumber, ActivityErrorHandler activityErrorHandler, OptionsSimulatedReturnChartViewState3 type2, OptionsSimulatedReturnLoggingState loggingState, OptionSimulatedChartBundle chartBundle, OptionsSimulatedReturnChartDataState2 simulatedReturnLaunchMode, Double sliderPosition, boolean usePreTradeStyle, boolean isBottomSheetHiddenOrNull, boolean isFullyExpanded, Function1<? super Double, Unit> onEstimatedContractPriceUpdated, Function1<? super OptionsSimulatedReturnErrorState, Unit> onErrorStateUpdated, Function3<? super OptionsSimulatedChartHeaderState, ? super Composer, ? super Integer, Unit> headerComponent, Function3<? super OptionsSimulatedReturnErrorState, ? super Composer, ? super Integer, Unit> errorComponent) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(chartBundle, "chartBundle");
            Intrinsics.checkNotNullParameter(simulatedReturnLaunchMode, "simulatedReturnLaunchMode");
            Intrinsics.checkNotNullParameter(onEstimatedContractPriceUpdated, "onEstimatedContractPriceUpdated");
            Intrinsics.checkNotNullParameter(onErrorStateUpdated, "onErrorStateUpdated");
            Intrinsics.checkNotNullParameter(headerComponent, "headerComponent");
            return new SimulatedReturn(accountNumber, activityErrorHandler, type2, loggingState, chartBundle, simulatedReturnLaunchMode, sliderPosition, usePreTradeStyle, isBottomSheetHiddenOrNull, isFullyExpanded, onEstimatedContractPriceUpdated, onErrorStateUpdated, headerComponent, errorComponent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SimulatedReturn)) {
                return false;
            }
            SimulatedReturn simulatedReturn = (SimulatedReturn) other;
            return Intrinsics.areEqual(this.accountNumber, simulatedReturn.accountNumber) && Intrinsics.areEqual(this.activityErrorHandler, simulatedReturn.activityErrorHandler) && this.type == simulatedReturn.type && Intrinsics.areEqual(this.loggingState, simulatedReturn.loggingState) && Intrinsics.areEqual(this.chartBundle, simulatedReturn.chartBundle) && Intrinsics.areEqual(this.simulatedReturnLaunchMode, simulatedReturn.simulatedReturnLaunchMode) && Intrinsics.areEqual((Object) this.sliderPosition, (Object) simulatedReturn.sliderPosition) && this.usePreTradeStyle == simulatedReturn.usePreTradeStyle && this.isBottomSheetHiddenOrNull == simulatedReturn.isBottomSheetHiddenOrNull && this.isFullyExpanded == simulatedReturn.isFullyExpanded && Intrinsics.areEqual(this.onEstimatedContractPriceUpdated, simulatedReturn.onEstimatedContractPriceUpdated) && Intrinsics.areEqual(this.onErrorStateUpdated, simulatedReturn.onErrorStateUpdated) && Intrinsics.areEqual(this.headerComponent, simulatedReturn.headerComponent) && Intrinsics.areEqual(this.errorComponent, simulatedReturn.errorComponent);
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            ActivityErrorHandler activityErrorHandler = this.activityErrorHandler;
            int iHashCode2 = (((iHashCode + (activityErrorHandler == null ? 0 : activityErrorHandler.hashCode())) * 31) + this.type.hashCode()) * 31;
            OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState = this.loggingState;
            int iHashCode3 = (((((iHashCode2 + (optionsSimulatedReturnLoggingState == null ? 0 : optionsSimulatedReturnLoggingState.hashCode())) * 31) + this.chartBundle.hashCode()) * 31) + this.simulatedReturnLaunchMode.hashCode()) * 31;
            Double d = this.sliderPosition;
            int iHashCode4 = (((((((((((((iHashCode3 + (d == null ? 0 : d.hashCode())) * 31) + Boolean.hashCode(this.usePreTradeStyle)) * 31) + Boolean.hashCode(this.isBottomSheetHiddenOrNull)) * 31) + Boolean.hashCode(this.isFullyExpanded)) * 31) + this.onEstimatedContractPriceUpdated.hashCode()) * 31) + this.onErrorStateUpdated.hashCode()) * 31) + this.headerComponent.hashCode()) * 31;
            Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> function3 = this.errorComponent;
            return iHashCode4 + (function3 != null ? function3.hashCode() : 0);
        }

        public String toString() {
            return "SimulatedReturn(accountNumber=" + this.accountNumber + ", activityErrorHandler=" + this.activityErrorHandler + ", type=" + this.type + ", loggingState=" + this.loggingState + ", chartBundle=" + this.chartBundle + ", simulatedReturnLaunchMode=" + this.simulatedReturnLaunchMode + ", sliderPosition=" + this.sliderPosition + ", usePreTradeStyle=" + this.usePreTradeStyle + ", isBottomSheetHiddenOrNull=" + this.isBottomSheetHiddenOrNull + ", isFullyExpanded=" + this.isFullyExpanded + ", onEstimatedContractPriceUpdated=" + this.onEstimatedContractPriceUpdated + ", onErrorStateUpdated=" + this.onErrorStateUpdated + ", headerComponent=" + this.headerComponent + ", errorComponent=" + this.errorComponent + ")";
        }

        public /* synthetic */ SimulatedReturn(String str, ActivityErrorHandler activityErrorHandler, OptionsSimulatedReturnChartViewState3 optionsSimulatedReturnChartViewState3, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionSimulatedChartBundle optionSimulatedChartBundle, OptionsSimulatedReturnChartDataState2 optionsSimulatedReturnChartDataState2, Double d, boolean z, boolean z2, boolean z3, Function1 function1, Function1 function12, Function3 function3, Function3 function32, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activityErrorHandler, optionsSimulatedReturnChartViewState3, optionsSimulatedReturnLoggingState, optionSimulatedChartBundle, optionsSimulatedReturnChartDataState2, d, z, (i & 256) != 0 ? true : z2, z3, function1, function12, function3, function32);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ActivityErrorHandler getActivityErrorHandler() {
            return this.activityErrorHandler;
        }

        public final OptionsSimulatedReturnChartViewState3 getType() {
            return this.type;
        }

        public final OptionsSimulatedReturnLoggingState getLoggingState() {
            return this.loggingState;
        }

        public final OptionSimulatedChartBundle getChartBundle() {
            return this.chartBundle;
        }

        public final OptionsSimulatedReturnChartDataState2 getSimulatedReturnLaunchMode() {
            return this.simulatedReturnLaunchMode;
        }

        public final Double getSliderPosition() {
            return this.sliderPosition;
        }

        public final boolean getUsePreTradeStyle() {
            return this.usePreTradeStyle;
        }

        public final boolean isBottomSheetHiddenOrNull() {
            return this.isBottomSheetHiddenOrNull;
        }

        public final boolean isFullyExpanded() {
            return this.isFullyExpanded;
        }

        public final Function1<Double, Unit> getOnEstimatedContractPriceUpdated() {
            return this.onEstimatedContractPriceUpdated;
        }

        public final Function1<OptionsSimulatedReturnErrorState, Unit> getOnErrorStateUpdated() {
            return this.onErrorStateUpdated;
        }

        public final Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> getHeaderComponent() {
            return this.headerComponent;
        }

        public final Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> getErrorComponent() {
            return this.errorComponent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SimulatedReturn(String accountNumber, ActivityErrorHandler activityErrorHandler, OptionsSimulatedReturnChartViewState3 type2, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionSimulatedChartBundle chartBundle, OptionsSimulatedReturnChartDataState2 simulatedReturnLaunchMode, Double d, boolean z, boolean z2, boolean z3, Function1<? super Double, Unit> onEstimatedContractPriceUpdated, Function1<? super OptionsSimulatedReturnErrorState, Unit> onErrorStateUpdated, Function3<? super OptionsSimulatedChartHeaderState, ? super Composer, ? super Integer, Unit> headerComponent, Function3<? super OptionsSimulatedReturnErrorState, ? super Composer, ? super Integer, Unit> function3) {
            super(null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(chartBundle, "chartBundle");
            Intrinsics.checkNotNullParameter(simulatedReturnLaunchMode, "simulatedReturnLaunchMode");
            Intrinsics.checkNotNullParameter(onEstimatedContractPriceUpdated, "onEstimatedContractPriceUpdated");
            Intrinsics.checkNotNullParameter(onErrorStateUpdated, "onErrorStateUpdated");
            Intrinsics.checkNotNullParameter(headerComponent, "headerComponent");
            this.accountNumber = accountNumber;
            this.activityErrorHandler = activityErrorHandler;
            this.type = type2;
            this.loggingState = optionsSimulatedReturnLoggingState;
            this.chartBundle = chartBundle;
            this.simulatedReturnLaunchMode = simulatedReturnLaunchMode;
            this.sliderPosition = d;
            this.usePreTradeStyle = z;
            this.isBottomSheetHiddenOrNull = z2;
            this.isFullyExpanded = z3;
            this.onEstimatedContractPriceUpdated = onEstimatedContractPriceUpdated;
            this.onErrorStateUpdated = onErrorStateUpdated;
            this.headerComponent = headerComponent;
            this.errorComponent = function3;
        }
    }
}
