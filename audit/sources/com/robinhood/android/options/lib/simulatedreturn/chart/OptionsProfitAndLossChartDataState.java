package com.robinhood.android.options.lib.simulatedreturn.chart;

import com.robinhood.android.charts.model.Point;
import com.robinhood.android.common.options.strategy.OptionLegCodeInfo;
import com.robinhood.android.common.options.strategy.OptionStrategyCodes2;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossMetrics;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.simulatedreturns.OptionPricingParams;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartLegBundle;
import com.robinhood.models.p355ui.UnderlyingQuote;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.datetime.Instant;

/* compiled from: OptionsProfitAndLossChartDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0015\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u0007HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00100J\t\u0010T\u001a\u00020\u0013HÆ\u0003J\t\u0010U\u001a\u00020\u0015HÂ\u0003J\u0015\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u0007HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010X\u001a\u00020\u001bHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\t\u0010[\u001a\u00020!HÆ\u0003JÚ\u0001\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!HÆ\u0001¢\u0006\u0002\u0010]J\u0013\u0010^\u001a\u00020!2\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010`\u001a\u00020aHÖ\u0001J\t\u0010b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b \u0010=R\u001d\u0010>\u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b?\u0010%R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020D0CX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010E\u001a\u0004\u0018\u00010DX\u0082\u0004¢\u0006\u0004\n\u0002\u0010FR\u0011\u0010G\u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\bH\u0010=R\u0011\u0010I\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010L\u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\bL\u0010=¨\u0006c"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;", "", "accountNumber", "", "errorState", "Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "expirationTimes", "", "Ljava/util/UUID;", "Lkotlinx/datetime/Instant;", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "optionQuotes", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "profitLossLaunchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;", "sliderPosition", "", "scrubState", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;", "scrubPoint", "Lcom/robinhood/android/charts/model/Point;", "simulatedReturnsConfigs", "Lcom/robinhood/models/db/simulatedreturns/OptionPricingParams;", "chartBundle", "Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "chartData", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartData;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "pnlMetrics", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;", "isFullyExpanded", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;Ljava/util/Map;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Ljava/util/Map;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;Ljava/lang/Double;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;Lcom/robinhood/android/charts/model/Point;Ljava/util/Map;Lcom/robinhood/models/ui/OptionSimulatedChartBundle;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartData;Lcom/robinhood/models/ui/UnderlyingQuote;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getErrorState", "()Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "getExpirationTimes", "()Ljava/util/Map;", "getLoggingState", "()Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "getOptionQuotes", "getProfitLossLaunchMode", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;", "getSliderPosition", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getScrubState", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;", "getSimulatedReturnsConfigs", "getChartBundle", "()Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "getChartData", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartData;", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "getPnlMetrics", "()Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;", "()Z", "strategyCode", "getStrategyCode", "strategyCode$delegate", "Lkotlin/Lazy;", "potentialSnappingPointX", "", "", "closestPointX", "Ljava/lang/Float;", "shouldSnap", "getShouldSnap", "snappedScrubPoint", "getSnappedScrubPoint", "()Lcom/robinhood/android/charts/model/Point;", "isSnappedToUnderlyingQuote", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;Ljava/util/Map;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Ljava/util/Map;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;Ljava/lang/Double;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;Lcom/robinhood/android/charts/model/Point;Ljava/util/Map;Lcom/robinhood/models/ui/OptionSimulatedChartBundle;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartData;Lcom/robinhood/models/ui/UnderlyingQuote;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;Z)Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartDataState;", "equals", "other", "hashCode", "", "toString", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionsProfitAndLossChartDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final OptionSimulatedChartBundle chartBundle;
    private final OptionsProfitAndLossChartData chartData;
    private final Float closestPointX;
    private final OptionsSimulatedReturnErrorState errorState;
    private final Map<UUID, Instant> expirationTimes;
    private final boolean isFullyExpanded;
    private final boolean isSnappedToUnderlyingQuote;
    private final OptionsSimulatedReturnLoggingState loggingState;
    private final Map<UUID, OptionInstrumentQuote> optionQuotes;
    private final ProfitAndLossMetrics pnlMetrics;
    private final List<Float> potentialSnappingPointX;
    private final OptionsProfitAndLossChartDataState4 profitLossLaunchMode;
    private final Point scrubPoint;
    private final OptionsSimulatedChartScrubState scrubState;
    private final boolean shouldSnap;
    private final Map<UUID, OptionPricingParams> simulatedReturnsConfigs;
    private final Double sliderPosition;
    private final Point snappedScrubPoint;

    /* renamed from: strategyCode$delegate, reason: from kotlin metadata */
    private final Lazy strategyCode;
    private final UnderlyingQuote underlyingQuote;

    /* compiled from: OptionsProfitAndLossChartDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OptionsProfitAndLossChartDataState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 32767, null);
    }

    /* renamed from: component9, reason: from getter */
    private final Point getScrubPoint() {
        return this.scrubPoint;
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Map<UUID, OptionPricingParams> component10() {
        return this.simulatedReturnsConfigs;
    }

    /* renamed from: component11, reason: from getter */
    public final OptionSimulatedChartBundle getChartBundle() {
        return this.chartBundle;
    }

    /* renamed from: component12, reason: from getter */
    public final OptionsProfitAndLossChartData getChartData() {
        return this.chartData;
    }

    /* renamed from: component13, reason: from getter */
    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    /* renamed from: component14, reason: from getter */
    public final ProfitAndLossMetrics getPnlMetrics() {
        return this.pnlMetrics;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsFullyExpanded() {
        return this.isFullyExpanded;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionsSimulatedReturnErrorState getErrorState() {
        return this.errorState;
    }

    public final Map<UUID, Instant> component3() {
        return this.expirationTimes;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    public final Map<UUID, OptionInstrumentQuote> component5() {
        return this.optionQuotes;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionsProfitAndLossChartDataState4 getProfitLossLaunchMode() {
        return this.profitLossLaunchMode;
    }

    /* renamed from: component7, reason: from getter */
    public final Double getSliderPosition() {
        return this.sliderPosition;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionsSimulatedChartScrubState getScrubState() {
        return this.scrubState;
    }

    public final OptionsProfitAndLossChartDataState copy(String accountNumber, OptionsSimulatedReturnErrorState errorState, Map<UUID, Instant> expirationTimes, OptionsSimulatedReturnLoggingState loggingState, Map<UUID, OptionInstrumentQuote> optionQuotes, OptionsProfitAndLossChartDataState4 profitLossLaunchMode, Double sliderPosition, OptionsSimulatedChartScrubState scrubState, Point scrubPoint, Map<UUID, OptionPricingParams> simulatedReturnsConfigs, OptionSimulatedChartBundle chartBundle, OptionsProfitAndLossChartData chartData, UnderlyingQuote underlyingQuote, ProfitAndLossMetrics pnlMetrics, boolean isFullyExpanded) {
        Intrinsics.checkNotNullParameter(expirationTimes, "expirationTimes");
        Intrinsics.checkNotNullParameter(optionQuotes, "optionQuotes");
        Intrinsics.checkNotNullParameter(scrubState, "scrubState");
        Intrinsics.checkNotNullParameter(scrubPoint, "scrubPoint");
        Intrinsics.checkNotNullParameter(simulatedReturnsConfigs, "simulatedReturnsConfigs");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        return new OptionsProfitAndLossChartDataState(accountNumber, errorState, expirationTimes, loggingState, optionQuotes, profitLossLaunchMode, sliderPosition, scrubState, scrubPoint, simulatedReturnsConfigs, chartBundle, chartData, underlyingQuote, pnlMetrics, isFullyExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsProfitAndLossChartDataState)) {
            return false;
        }
        OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState = (OptionsProfitAndLossChartDataState) other;
        return Intrinsics.areEqual(this.accountNumber, optionsProfitAndLossChartDataState.accountNumber) && this.errorState == optionsProfitAndLossChartDataState.errorState && Intrinsics.areEqual(this.expirationTimes, optionsProfitAndLossChartDataState.expirationTimes) && Intrinsics.areEqual(this.loggingState, optionsProfitAndLossChartDataState.loggingState) && Intrinsics.areEqual(this.optionQuotes, optionsProfitAndLossChartDataState.optionQuotes) && Intrinsics.areEqual(this.profitLossLaunchMode, optionsProfitAndLossChartDataState.profitLossLaunchMode) && Intrinsics.areEqual((Object) this.sliderPosition, (Object) optionsProfitAndLossChartDataState.sliderPosition) && this.scrubState == optionsProfitAndLossChartDataState.scrubState && Intrinsics.areEqual(this.scrubPoint, optionsProfitAndLossChartDataState.scrubPoint) && Intrinsics.areEqual(this.simulatedReturnsConfigs, optionsProfitAndLossChartDataState.simulatedReturnsConfigs) && Intrinsics.areEqual(this.chartBundle, optionsProfitAndLossChartDataState.chartBundle) && Intrinsics.areEqual(this.chartData, optionsProfitAndLossChartDataState.chartData) && Intrinsics.areEqual(this.underlyingQuote, optionsProfitAndLossChartDataState.underlyingQuote) && Intrinsics.areEqual(this.pnlMetrics, optionsProfitAndLossChartDataState.pnlMetrics) && this.isFullyExpanded == optionsProfitAndLossChartDataState.isFullyExpanded;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState = this.errorState;
        int iHashCode2 = (((iHashCode + (optionsSimulatedReturnErrorState == null ? 0 : optionsSimulatedReturnErrorState.hashCode())) * 31) + this.expirationTimes.hashCode()) * 31;
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState = this.loggingState;
        int iHashCode3 = (((iHashCode2 + (optionsSimulatedReturnLoggingState == null ? 0 : optionsSimulatedReturnLoggingState.hashCode())) * 31) + this.optionQuotes.hashCode()) * 31;
        OptionsProfitAndLossChartDataState4 optionsProfitAndLossChartDataState4 = this.profitLossLaunchMode;
        int iHashCode4 = (iHashCode3 + (optionsProfitAndLossChartDataState4 == null ? 0 : optionsProfitAndLossChartDataState4.hashCode())) * 31;
        Double d = this.sliderPosition;
        int iHashCode5 = (((((((iHashCode4 + (d == null ? 0 : d.hashCode())) * 31) + this.scrubState.hashCode()) * 31) + this.scrubPoint.hashCode()) * 31) + this.simulatedReturnsConfigs.hashCode()) * 31;
        OptionSimulatedChartBundle optionSimulatedChartBundle = this.chartBundle;
        int iHashCode6 = (((iHashCode5 + (optionSimulatedChartBundle == null ? 0 : optionSimulatedChartBundle.hashCode())) * 31) + this.chartData.hashCode()) * 31;
        UnderlyingQuote underlyingQuote = this.underlyingQuote;
        int iHashCode7 = (iHashCode6 + (underlyingQuote == null ? 0 : underlyingQuote.hashCode())) * 31;
        ProfitAndLossMetrics profitAndLossMetrics = this.pnlMetrics;
        return ((iHashCode7 + (profitAndLossMetrics != null ? profitAndLossMetrics.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFullyExpanded);
    }

    public String toString() {
        return "OptionsProfitAndLossChartDataState(accountNumber=" + this.accountNumber + ", errorState=" + this.errorState + ", expirationTimes=" + this.expirationTimes + ", loggingState=" + this.loggingState + ", optionQuotes=" + this.optionQuotes + ", profitLossLaunchMode=" + this.profitLossLaunchMode + ", sliderPosition=" + this.sliderPosition + ", scrubState=" + this.scrubState + ", scrubPoint=" + this.scrubPoint + ", simulatedReturnsConfigs=" + this.simulatedReturnsConfigs + ", chartBundle=" + this.chartBundle + ", chartData=" + this.chartData + ", underlyingQuote=" + this.underlyingQuote + ", pnlMetrics=" + this.pnlMetrics + ", isFullyExpanded=" + this.isFullyExpanded + ")";
    }

    public OptionsProfitAndLossChartDataState(String str, OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState, Map<UUID, Instant> expirationTimes, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Map<UUID, OptionInstrumentQuote> optionQuotes, OptionsProfitAndLossChartDataState4 optionsProfitAndLossChartDataState4, Double d, OptionsSimulatedChartScrubState scrubState, Point scrubPoint, Map<UUID, OptionPricingParams> simulatedReturnsConfigs, OptionSimulatedChartBundle optionSimulatedChartBundle, OptionsProfitAndLossChartData chartData, UnderlyingQuote underlyingQuote, ProfitAndLossMetrics profitAndLossMetrics, boolean z) {
        Object obj;
        Intrinsics.checkNotNullParameter(expirationTimes, "expirationTimes");
        Intrinsics.checkNotNullParameter(optionQuotes, "optionQuotes");
        Intrinsics.checkNotNullParameter(scrubState, "scrubState");
        Intrinsics.checkNotNullParameter(scrubPoint, "scrubPoint");
        Intrinsics.checkNotNullParameter(simulatedReturnsConfigs, "simulatedReturnsConfigs");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        this.accountNumber = str;
        this.errorState = optionsSimulatedReturnErrorState;
        this.expirationTimes = expirationTimes;
        this.loggingState = optionsSimulatedReturnLoggingState;
        this.optionQuotes = optionQuotes;
        this.profitLossLaunchMode = optionsProfitAndLossChartDataState4;
        this.sliderPosition = d;
        this.scrubState = scrubState;
        this.scrubPoint = scrubPoint;
        this.simulatedReturnsConfigs = simulatedReturnsConfigs;
        this.chartBundle = optionSimulatedChartBundle;
        this.chartData = chartData;
        this.underlyingQuote = underlyingQuote;
        this.pnlMetrics = profitAndLossMetrics;
        this.isFullyExpanded = z;
        this.strategyCode = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDataState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsProfitAndLossChartDataState.strategyCode_delegate$lambda$1(this.f$0);
            }
        });
        ImmutableList<OptionsSimulatedReturnChartPoint> pointsOfInterest = chartData.getPointsOfInterest();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pointsOfInterest, 10));
        Iterator<OptionsSimulatedReturnChartPoint> it = pointsOfInterest.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(it.next().getX()));
        }
        List<Float> listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt.listOfNotNull(this.chartData.getUnderlyingX()));
        this.potentialSnappingPointX = listPlus;
        Iterator<T> it2 = listPlus.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                float fAbs = Math.abs(((Number) next).floatValue() - this.scrubPoint.getX());
                do {
                    Object next2 = it2.next();
                    float fAbs2 = Math.abs(((Number) next2).floatValue() - this.scrubPoint.getX());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Float f = (Float) obj;
        this.closestPointX = f;
        boolean z2 = f != null && Math.abs(f.floatValue() - this.scrubPoint.getX()) < 0.015f;
        this.shouldSnap = z2;
        Point point = (!z2 || f == null) ? this.scrubPoint : new Point(f.floatValue(), this.scrubPoint.getY());
        this.snappedScrubPoint = point;
        this.isSnappedToUnderlyingQuote = Intrinsics.areEqual(point.getX(), this.chartData.getUnderlyingX());
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final OptionsSimulatedReturnErrorState getErrorState() {
        return this.errorState;
    }

    public /* synthetic */ OptionsProfitAndLossChartDataState(String str, OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState, Map map, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Map map2, OptionsProfitAndLossChartDataState4 optionsProfitAndLossChartDataState4, Double d, OptionsSimulatedChartScrubState optionsSimulatedChartScrubState, Point point, Map map3, OptionSimulatedChartBundle optionSimulatedChartBundle, OptionsProfitAndLossChartData optionsProfitAndLossChartData, UnderlyingQuote underlyingQuote, ProfitAndLossMetrics profitAndLossMetrics, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : optionsSimulatedReturnErrorState, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? null : optionsSimulatedReturnLoggingState, (i & 16) != 0 ? MapsKt.emptyMap() : map2, (i & 32) != 0 ? null : optionsProfitAndLossChartDataState4, (i & 64) != 0 ? null : d, (i & 128) != 0 ? OptionsSimulatedChartScrubState.IDLE : optionsSimulatedChartScrubState, (i & 256) != 0 ? new Point(0.0f, 0.0f) : point, (i & 512) != 0 ? MapsKt.emptyMap() : map3, (i & 1024) != 0 ? null : optionSimulatedChartBundle, (i & 2048) != 0 ? new OptionsProfitAndLossChartData(null, null, null, null, null, null, null, null, null, null, 1023, null) : optionsProfitAndLossChartData, (i & 4096) != 0 ? null : underlyingQuote, (i & 8192) == 0 ? profitAndLossMetrics : null, (i & 16384) != 0 ? false : z);
    }

    public final Map<UUID, Instant> getExpirationTimes() {
        return this.expirationTimes;
    }

    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    public final Map<UUID, OptionInstrumentQuote> getOptionQuotes() {
        return this.optionQuotes;
    }

    public final OptionsProfitAndLossChartDataState4 getProfitLossLaunchMode() {
        return this.profitLossLaunchMode;
    }

    public final Double getSliderPosition() {
        return this.sliderPosition;
    }

    public final OptionsSimulatedChartScrubState getScrubState() {
        return this.scrubState;
    }

    public final Map<UUID, OptionPricingParams> getSimulatedReturnsConfigs() {
        return this.simulatedReturnsConfigs;
    }

    public final OptionSimulatedChartBundle getChartBundle() {
        return this.chartBundle;
    }

    public final OptionsProfitAndLossChartData getChartData() {
        return this.chartData;
    }

    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    public final ProfitAndLossMetrics getPnlMetrics() {
        return this.pnlMetrics;
    }

    public final boolean isFullyExpanded() {
        return this.isFullyExpanded;
    }

    public final String getStrategyCode() {
        return (String) this.strategyCode.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String strategyCode_delegate$lambda$1(OptionsProfitAndLossChartDataState optionsProfitAndLossChartDataState) {
        ImmutableList<OptionSimulatedChartLegBundle> legBundles;
        OptionPositionType optionPositionType;
        OptionSimulatedChartBundle optionSimulatedChartBundle = optionsProfitAndLossChartDataState.chartBundle;
        if (optionSimulatedChartBundle == null || (legBundles = optionSimulatedChartBundle.getLegBundles()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundles, 10));
        for (OptionSimulatedChartLegBundle optionSimulatedChartBundle4 : legBundles) {
            UUID id = optionSimulatedChartBundle4.getOptionInstrument().getId();
            int i = WhenMappings.$EnumSwitchMapping$0[optionSimulatedChartBundle4.getSide().ordinal()];
            if (i == 1) {
                optionPositionType = OptionPositionType.LONG;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                optionPositionType = OptionPositionType.SHORT;
            }
            arrayList.add(new OptionLegCodeInfo(id, optionPositionType, optionSimulatedChartBundle4.getQuantity()));
        }
        return OptionStrategyCodes2.toStrategyCode(arrayList, true);
    }

    public final boolean getShouldSnap() {
        return this.shouldSnap;
    }

    public final Point getSnappedScrubPoint() {
        return this.snappedScrubPoint;
    }

    /* renamed from: isSnappedToUnderlyingQuote, reason: from getter */
    public final boolean getIsSnappedToUnderlyingQuote() {
        return this.isSnappedToUnderlyingQuote;
    }
}
