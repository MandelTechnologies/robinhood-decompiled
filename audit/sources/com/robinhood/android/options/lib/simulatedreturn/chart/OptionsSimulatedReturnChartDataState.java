package com.robinhood.android.options.lib.simulatedreturn.chart;

import com.robinhood.android.charts.model.Point;
import com.robinhood.android.common.options.strategy.OptionLegCodeInfo;
import com.robinhood.android.common.options.strategy.OptionStrategyCodes2;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDataState2;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsChart;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossMetrics;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.simulatedreturns.OptionPricingParams;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartLegBundle;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UnderlyingQuote;
import java.util.ArrayList;
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
import kotlinx.collections.immutable.extensions2;
import kotlinx.datetime.Instant;

/* compiled from: OptionsSimulatedReturnChartDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010(\u001a\u00020)\u0012\b\b\u0002\u0010*\u001a\u00020+\u0012\b\b\u0002\u0010,\u001a\u00020\u000f\u0012\b\b\u0002\u0010-\u001a\u00020\u000f¢\u0006\u0004\b.\u0010/J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010_\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bHÆ\u0003J\t\u0010`\u001a\u00020\u000fHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0015\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u000bHÆ\u0003J\t\u0010d\u001a\u00020\u0017HÆ\u0003J\t\u0010e\u001a\u00020\u0019HÆ\u0003J\u0015\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0\u000bHÆ\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010FJ\u000b\u0010h\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010#HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010'HÆ\u0003J\t\u0010m\u001a\u00020)HÆ\u0003J\t\u0010n\u001a\u00020+HÆ\u0003J\t\u0010o\u001a\u00020\u000fHÆ\u0003J\t\u0010p\u001a\u00020\u000fHÆ\u0003J¨\u0002\u0010q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010rJ\u0013\u0010s\u001a\u00020\u000f2\b\u0010t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010u\u001a\u00020vHÖ\u0001J\t\u0010w\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010:R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u000b¢\u0006\b\n\u0000\u001a\u0004\b?\u00109R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0\u000b¢\u0006\b\n\u0000\u001a\u0004\bD\u00109R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010G\u001a\u0004\bE\u0010FR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010,\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bV\u0010:R\u0011\u0010-\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010:R\u001d\u0010W\u001a\u0004\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bX\u00101¨\u0006x"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDataState;", "", "accountNumber", "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "curatedListItem", "Lcom/robinhood/models/db/CuratedListItem;", "errorState", "Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "expirationTimes", "", "Ljava/util/UUID;", "Lkotlinx/datetime/Instant;", "isInProfitAndLossAverageCostRetirement", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "chartBundle", "Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "optionQuotes", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "scrubState", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;", "scrubPoint", "Lcom/robinhood/android/charts/model/Point;", "simulatedReturnsConfigs", "Lcom/robinhood/models/db/simulatedreturns/OptionPricingParams;", "sliderPosition", "", "uiAggregatePositionIncludingZeroQuantity", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "uiOptionInstrumentPositionIncludingZeroQuantity", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "pnlMetrics", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;", "chart", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChart;", "type", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;", "launchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "usePreTradeStyle", "isFullyExpanded", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/db/CuratedListItem;Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;Ljava/util/Map;ZLcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Lcom/robinhood/models/ui/OptionSimulatedChartBundle;Ljava/util/Map;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;Lcom/robinhood/android/charts/model/Point;Ljava/util/Map;Ljava/lang/Double;Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;Lcom/robinhood/models/ui/UiOptionInstrumentPosition;Lcom/robinhood/models/ui/UnderlyingQuote;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChart;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;ZZ)V", "getAccountNumber", "()Ljava/lang/String;", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getCuratedListItem", "()Lcom/robinhood/models/db/CuratedListItem;", "getErrorState", "()Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "getExpirationTimes", "()Ljava/util/Map;", "()Z", "getLoggingState", "()Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "getChartBundle", "()Lcom/robinhood/models/ui/OptionSimulatedChartBundle;", "getOptionQuotes", "getScrubState", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;", "getScrubPoint", "()Lcom/robinhood/android/charts/model/Point;", "getSimulatedReturnsConfigs", "getSliderPosition", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getUiAggregatePositionIncludingZeroQuantity", "()Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "getUiOptionInstrumentPositionIncludingZeroQuantity", "()Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "getPnlMetrics", "()Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;", "getChart", "()Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChart;", "getType", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;", "getLaunchMode", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "getUsePreTradeStyle", "strategyCode", "getStrategyCode", "strategyCode$delegate", "Lkotlin/Lazy;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/db/CuratedListItem;Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;Ljava/util/Map;ZLcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Lcom/robinhood/models/ui/OptionSimulatedChartBundle;Ljava/util/Map;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;Lcom/robinhood/android/charts/model/Point;Ljava/util/Map;Ljava/lang/Double;Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;Lcom/robinhood/models/ui/UiOptionInstrumentPosition;Lcom/robinhood/models/ui/UnderlyingQuote;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsChart;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;ZZ)Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDataState;", "equals", "other", "hashCode", "", "toString", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionsSimulatedReturnChartDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final BrokerageAccountType accountType;
    private final SimulatedReturnsChart chart;
    private final OptionSimulatedChartBundle chartBundle;
    private final CuratedListItem curatedListItem;
    private final OptionsSimulatedReturnErrorState errorState;
    private final Map<UUID, Instant> expirationTimes;
    private final boolean isFullyExpanded;
    private final boolean isInProfitAndLossAverageCostRetirement;
    private final OptionsSimulatedReturnChartDataState2 launchMode;
    private final OptionsSimulatedReturnLoggingState loggingState;
    private final Map<UUID, OptionInstrumentQuote> optionQuotes;
    private final ProfitAndLossMetrics pnlMetrics;
    private final Point scrubPoint;
    private final OptionsSimulatedChartScrubState scrubState;
    private final Map<UUID, OptionPricingParams> simulatedReturnsConfigs;
    private final Double sliderPosition;

    /* renamed from: strategyCode$delegate, reason: from kotlin metadata */
    private final Lazy strategyCode;
    private final OptionsSimulatedReturnChartViewState3 type;
    private final UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity;
    private final UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity;
    private final UnderlyingQuote underlyingQuote;
    private final boolean usePreTradeStyle;

    /* compiled from: OptionsSimulatedReturnChartDataState.kt */
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

    public OptionsSimulatedReturnChartDataState() {
        this(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 4194303, null);
    }

    public static /* synthetic */ OptionsSimulatedReturnChartDataState copy$default(OptionsSimulatedReturnChartDataState optionsSimulatedReturnChartDataState, String str, BrokerageAccountType brokerageAccountType, CuratedListItem curatedListItem, OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState, Map map, boolean z, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionSimulatedChartBundle optionSimulatedChartBundle, Map map2, OptionsSimulatedChartScrubState optionsSimulatedChartScrubState, Point point, Map map3, Double d, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, UiOptionInstrumentPosition uiOptionInstrumentPosition, UnderlyingQuote underlyingQuote, ProfitAndLossMetrics profitAndLossMetrics, SimulatedReturnsChart simulatedReturnsChart, OptionsSimulatedReturnChartViewState3 optionsSimulatedReturnChartViewState3, OptionsSimulatedReturnChartDataState2 optionsSimulatedReturnChartDataState2, boolean z2, boolean z3, int i, Object obj) {
        boolean z4;
        boolean z5;
        String str2 = (i & 1) != 0 ? optionsSimulatedReturnChartDataState.accountNumber : str;
        BrokerageAccountType brokerageAccountType2 = (i & 2) != 0 ? optionsSimulatedReturnChartDataState.accountType : brokerageAccountType;
        CuratedListItem curatedListItem2 = (i & 4) != 0 ? optionsSimulatedReturnChartDataState.curatedListItem : curatedListItem;
        OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState2 = (i & 8) != 0 ? optionsSimulatedReturnChartDataState.errorState : optionsSimulatedReturnErrorState;
        Map map4 = (i & 16) != 0 ? optionsSimulatedReturnChartDataState.expirationTimes : map;
        boolean z6 = (i & 32) != 0 ? optionsSimulatedReturnChartDataState.isInProfitAndLossAverageCostRetirement : z;
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState2 = (i & 64) != 0 ? optionsSimulatedReturnChartDataState.loggingState : optionsSimulatedReturnLoggingState;
        OptionSimulatedChartBundle optionSimulatedChartBundle2 = (i & 128) != 0 ? optionsSimulatedReturnChartDataState.chartBundle : optionSimulatedChartBundle;
        Map map5 = (i & 256) != 0 ? optionsSimulatedReturnChartDataState.optionQuotes : map2;
        OptionsSimulatedChartScrubState optionsSimulatedChartScrubState2 = (i & 512) != 0 ? optionsSimulatedReturnChartDataState.scrubState : optionsSimulatedChartScrubState;
        Point point2 = (i & 1024) != 0 ? optionsSimulatedReturnChartDataState.scrubPoint : point;
        Map map6 = (i & 2048) != 0 ? optionsSimulatedReturnChartDataState.simulatedReturnsConfigs : map3;
        Double d2 = (i & 4096) != 0 ? optionsSimulatedReturnChartDataState.sliderPosition : d;
        UiAggregateOptionPositionFull uiAggregateOptionPositionFull2 = (i & 8192) != 0 ? optionsSimulatedReturnChartDataState.uiAggregatePositionIncludingZeroQuantity : uiAggregateOptionPositionFull;
        String str3 = str2;
        UiOptionInstrumentPosition uiOptionInstrumentPosition2 = (i & 16384) != 0 ? optionsSimulatedReturnChartDataState.uiOptionInstrumentPositionIncludingZeroQuantity : uiOptionInstrumentPosition;
        UnderlyingQuote underlyingQuote2 = (i & 32768) != 0 ? optionsSimulatedReturnChartDataState.underlyingQuote : underlyingQuote;
        ProfitAndLossMetrics profitAndLossMetrics2 = (i & 65536) != 0 ? optionsSimulatedReturnChartDataState.pnlMetrics : profitAndLossMetrics;
        SimulatedReturnsChart simulatedReturnsChart2 = (i & 131072) != 0 ? optionsSimulatedReturnChartDataState.chart : simulatedReturnsChart;
        OptionsSimulatedReturnChartViewState3 optionsSimulatedReturnChartViewState32 = (i & 262144) != 0 ? optionsSimulatedReturnChartDataState.type : optionsSimulatedReturnChartViewState3;
        OptionsSimulatedReturnChartDataState2 optionsSimulatedReturnChartDataState22 = (i & 524288) != 0 ? optionsSimulatedReturnChartDataState.launchMode : optionsSimulatedReturnChartDataState2;
        boolean z7 = (i & 1048576) != 0 ? optionsSimulatedReturnChartDataState.usePreTradeStyle : z2;
        if ((i & 2097152) != 0) {
            z5 = z7;
            z4 = optionsSimulatedReturnChartDataState.isFullyExpanded;
        } else {
            z4 = z3;
            z5 = z7;
        }
        return optionsSimulatedReturnChartDataState.copy(str3, brokerageAccountType2, curatedListItem2, optionsSimulatedReturnErrorState2, map4, z6, optionsSimulatedReturnLoggingState2, optionSimulatedChartBundle2, map5, optionsSimulatedChartScrubState2, point2, map6, d2, uiAggregateOptionPositionFull2, uiOptionInstrumentPosition2, underlyingQuote2, profitAndLossMetrics2, simulatedReturnsChart2, optionsSimulatedReturnChartViewState32, optionsSimulatedReturnChartDataState22, z5, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final OptionsSimulatedChartScrubState getScrubState() {
        return this.scrubState;
    }

    /* renamed from: component11, reason: from getter */
    public final Point getScrubPoint() {
        return this.scrubPoint;
    }

    public final Map<UUID, OptionPricingParams> component12() {
        return this.simulatedReturnsConfigs;
    }

    /* renamed from: component13, reason: from getter */
    public final Double getSliderPosition() {
        return this.sliderPosition;
    }

    /* renamed from: component14, reason: from getter */
    public final UiAggregateOptionPositionFull getUiAggregatePositionIncludingZeroQuantity() {
        return this.uiAggregatePositionIncludingZeroQuantity;
    }

    /* renamed from: component15, reason: from getter */
    public final UiOptionInstrumentPosition getUiOptionInstrumentPositionIncludingZeroQuantity() {
        return this.uiOptionInstrumentPositionIncludingZeroQuantity;
    }

    /* renamed from: component16, reason: from getter */
    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    /* renamed from: component17, reason: from getter */
    public final ProfitAndLossMetrics getPnlMetrics() {
        return this.pnlMetrics;
    }

    /* renamed from: component18, reason: from getter */
    public final SimulatedReturnsChart getChart() {
        return this.chart;
    }

    /* renamed from: component19, reason: from getter */
    public final OptionsSimulatedReturnChartViewState3 getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    /* renamed from: component20, reason: from getter */
    public final OptionsSimulatedReturnChartDataState2 getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getUsePreTradeStyle() {
        return this.usePreTradeStyle;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsFullyExpanded() {
        return this.isFullyExpanded;
    }

    /* renamed from: component3, reason: from getter */
    public final CuratedListItem getCuratedListItem() {
        return this.curatedListItem;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionsSimulatedReturnErrorState getErrorState() {
        return this.errorState;
    }

    public final Map<UUID, Instant> component5() {
        return this.expirationTimes;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsInProfitAndLossAverageCostRetirement() {
        return this.isInProfitAndLossAverageCostRetirement;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionSimulatedChartBundle getChartBundle() {
        return this.chartBundle;
    }

    public final Map<UUID, OptionInstrumentQuote> component9() {
        return this.optionQuotes;
    }

    public final OptionsSimulatedReturnChartDataState copy(String accountNumber, BrokerageAccountType accountType, CuratedListItem curatedListItem, OptionsSimulatedReturnErrorState errorState, Map<UUID, Instant> expirationTimes, boolean isInProfitAndLossAverageCostRetirement, OptionsSimulatedReturnLoggingState loggingState, OptionSimulatedChartBundle chartBundle, Map<UUID, OptionInstrumentQuote> optionQuotes, OptionsSimulatedChartScrubState scrubState, Point scrubPoint, Map<UUID, OptionPricingParams> simulatedReturnsConfigs, Double sliderPosition, UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity, UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity, UnderlyingQuote underlyingQuote, ProfitAndLossMetrics pnlMetrics, SimulatedReturnsChart chart, OptionsSimulatedReturnChartViewState3 type2, OptionsSimulatedReturnChartDataState2 launchMode, boolean usePreTradeStyle, boolean isFullyExpanded) {
        Intrinsics.checkNotNullParameter(expirationTimes, "expirationTimes");
        Intrinsics.checkNotNullParameter(optionQuotes, "optionQuotes");
        Intrinsics.checkNotNullParameter(scrubState, "scrubState");
        Intrinsics.checkNotNullParameter(scrubPoint, "scrubPoint");
        Intrinsics.checkNotNullParameter(simulatedReturnsConfigs, "simulatedReturnsConfigs");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        return new OptionsSimulatedReturnChartDataState(accountNumber, accountType, curatedListItem, errorState, expirationTimes, isInProfitAndLossAverageCostRetirement, loggingState, chartBundle, optionQuotes, scrubState, scrubPoint, simulatedReturnsConfigs, sliderPosition, uiAggregatePositionIncludingZeroQuantity, uiOptionInstrumentPositionIncludingZeroQuantity, underlyingQuote, pnlMetrics, chart, type2, launchMode, usePreTradeStyle, isFullyExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSimulatedReturnChartDataState)) {
            return false;
        }
        OptionsSimulatedReturnChartDataState optionsSimulatedReturnChartDataState = (OptionsSimulatedReturnChartDataState) other;
        return Intrinsics.areEqual(this.accountNumber, optionsSimulatedReturnChartDataState.accountNumber) && this.accountType == optionsSimulatedReturnChartDataState.accountType && Intrinsics.areEqual(this.curatedListItem, optionsSimulatedReturnChartDataState.curatedListItem) && this.errorState == optionsSimulatedReturnChartDataState.errorState && Intrinsics.areEqual(this.expirationTimes, optionsSimulatedReturnChartDataState.expirationTimes) && this.isInProfitAndLossAverageCostRetirement == optionsSimulatedReturnChartDataState.isInProfitAndLossAverageCostRetirement && Intrinsics.areEqual(this.loggingState, optionsSimulatedReturnChartDataState.loggingState) && Intrinsics.areEqual(this.chartBundle, optionsSimulatedReturnChartDataState.chartBundle) && Intrinsics.areEqual(this.optionQuotes, optionsSimulatedReturnChartDataState.optionQuotes) && this.scrubState == optionsSimulatedReturnChartDataState.scrubState && Intrinsics.areEqual(this.scrubPoint, optionsSimulatedReturnChartDataState.scrubPoint) && Intrinsics.areEqual(this.simulatedReturnsConfigs, optionsSimulatedReturnChartDataState.simulatedReturnsConfigs) && Intrinsics.areEqual((Object) this.sliderPosition, (Object) optionsSimulatedReturnChartDataState.sliderPosition) && Intrinsics.areEqual(this.uiAggregatePositionIncludingZeroQuantity, optionsSimulatedReturnChartDataState.uiAggregatePositionIncludingZeroQuantity) && Intrinsics.areEqual(this.uiOptionInstrumentPositionIncludingZeroQuantity, optionsSimulatedReturnChartDataState.uiOptionInstrumentPositionIncludingZeroQuantity) && Intrinsics.areEqual(this.underlyingQuote, optionsSimulatedReturnChartDataState.underlyingQuote) && Intrinsics.areEqual(this.pnlMetrics, optionsSimulatedReturnChartDataState.pnlMetrics) && Intrinsics.areEqual(this.chart, optionsSimulatedReturnChartDataState.chart) && this.type == optionsSimulatedReturnChartDataState.type && Intrinsics.areEqual(this.launchMode, optionsSimulatedReturnChartDataState.launchMode) && this.usePreTradeStyle == optionsSimulatedReturnChartDataState.usePreTradeStyle && this.isFullyExpanded == optionsSimulatedReturnChartDataState.isFullyExpanded;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BrokerageAccountType brokerageAccountType = this.accountType;
        int iHashCode2 = (iHashCode + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31;
        CuratedListItem curatedListItem = this.curatedListItem;
        int iHashCode3 = (iHashCode2 + (curatedListItem == null ? 0 : curatedListItem.hashCode())) * 31;
        OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState = this.errorState;
        int iHashCode4 = (((((iHashCode3 + (optionsSimulatedReturnErrorState == null ? 0 : optionsSimulatedReturnErrorState.hashCode())) * 31) + this.expirationTimes.hashCode()) * 31) + Boolean.hashCode(this.isInProfitAndLossAverageCostRetirement)) * 31;
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState = this.loggingState;
        int iHashCode5 = (iHashCode4 + (optionsSimulatedReturnLoggingState == null ? 0 : optionsSimulatedReturnLoggingState.hashCode())) * 31;
        OptionSimulatedChartBundle optionSimulatedChartBundle = this.chartBundle;
        int iHashCode6 = (((((((((iHashCode5 + (optionSimulatedChartBundle == null ? 0 : optionSimulatedChartBundle.hashCode())) * 31) + this.optionQuotes.hashCode()) * 31) + this.scrubState.hashCode()) * 31) + this.scrubPoint.hashCode()) * 31) + this.simulatedReturnsConfigs.hashCode()) * 31;
        Double d = this.sliderPosition;
        int iHashCode7 = (iHashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        UiAggregateOptionPositionFull uiAggregateOptionPositionFull = this.uiAggregatePositionIncludingZeroQuantity;
        int iHashCode8 = (iHashCode7 + (uiAggregateOptionPositionFull == null ? 0 : uiAggregateOptionPositionFull.hashCode())) * 31;
        UiOptionInstrumentPosition uiOptionInstrumentPosition = this.uiOptionInstrumentPositionIncludingZeroQuantity;
        int iHashCode9 = (iHashCode8 + (uiOptionInstrumentPosition == null ? 0 : uiOptionInstrumentPosition.hashCode())) * 31;
        UnderlyingQuote underlyingQuote = this.underlyingQuote;
        int iHashCode10 = (iHashCode9 + (underlyingQuote == null ? 0 : underlyingQuote.hashCode())) * 31;
        ProfitAndLossMetrics profitAndLossMetrics = this.pnlMetrics;
        int iHashCode11 = (iHashCode10 + (profitAndLossMetrics == null ? 0 : profitAndLossMetrics.hashCode())) * 31;
        SimulatedReturnsChart simulatedReturnsChart = this.chart;
        return ((((((((iHashCode11 + (simulatedReturnsChart != null ? simulatedReturnsChart.hashCode() : 0)) * 31) + this.type.hashCode()) * 31) + this.launchMode.hashCode()) * 31) + Boolean.hashCode(this.usePreTradeStyle)) * 31) + Boolean.hashCode(this.isFullyExpanded);
    }

    public String toString() {
        return "OptionsSimulatedReturnChartDataState(accountNumber=" + this.accountNumber + ", accountType=" + this.accountType + ", curatedListItem=" + this.curatedListItem + ", errorState=" + this.errorState + ", expirationTimes=" + this.expirationTimes + ", isInProfitAndLossAverageCostRetirement=" + this.isInProfitAndLossAverageCostRetirement + ", loggingState=" + this.loggingState + ", chartBundle=" + this.chartBundle + ", optionQuotes=" + this.optionQuotes + ", scrubState=" + this.scrubState + ", scrubPoint=" + this.scrubPoint + ", simulatedReturnsConfigs=" + this.simulatedReturnsConfigs + ", sliderPosition=" + this.sliderPosition + ", uiAggregatePositionIncludingZeroQuantity=" + this.uiAggregatePositionIncludingZeroQuantity + ", uiOptionInstrumentPositionIncludingZeroQuantity=" + this.uiOptionInstrumentPositionIncludingZeroQuantity + ", underlyingQuote=" + this.underlyingQuote + ", pnlMetrics=" + this.pnlMetrics + ", chart=" + this.chart + ", type=" + this.type + ", launchMode=" + this.launchMode + ", usePreTradeStyle=" + this.usePreTradeStyle + ", isFullyExpanded=" + this.isFullyExpanded + ")";
    }

    public OptionsSimulatedReturnChartDataState(String str, BrokerageAccountType brokerageAccountType, CuratedListItem curatedListItem, OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState, Map<UUID, Instant> expirationTimes, boolean z, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionSimulatedChartBundle optionSimulatedChartBundle, Map<UUID, OptionInstrumentQuote> optionQuotes, OptionsSimulatedChartScrubState scrubState, Point scrubPoint, Map<UUID, OptionPricingParams> simulatedReturnsConfigs, Double d, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, UiOptionInstrumentPosition uiOptionInstrumentPosition, UnderlyingQuote underlyingQuote, ProfitAndLossMetrics profitAndLossMetrics, SimulatedReturnsChart simulatedReturnsChart, OptionsSimulatedReturnChartViewState3 type2, OptionsSimulatedReturnChartDataState2 launchMode, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(expirationTimes, "expirationTimes");
        Intrinsics.checkNotNullParameter(optionQuotes, "optionQuotes");
        Intrinsics.checkNotNullParameter(scrubState, "scrubState");
        Intrinsics.checkNotNullParameter(scrubPoint, "scrubPoint");
        Intrinsics.checkNotNullParameter(simulatedReturnsConfigs, "simulatedReturnsConfigs");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.accountNumber = str;
        this.accountType = brokerageAccountType;
        this.curatedListItem = curatedListItem;
        this.errorState = optionsSimulatedReturnErrorState;
        this.expirationTimes = expirationTimes;
        this.isInProfitAndLossAverageCostRetirement = z;
        this.loggingState = optionsSimulatedReturnLoggingState;
        this.chartBundle = optionSimulatedChartBundle;
        this.optionQuotes = optionQuotes;
        this.scrubState = scrubState;
        this.scrubPoint = scrubPoint;
        this.simulatedReturnsConfigs = simulatedReturnsConfigs;
        this.sliderPosition = d;
        this.uiAggregatePositionIncludingZeroQuantity = uiAggregateOptionPositionFull;
        this.uiOptionInstrumentPositionIncludingZeroQuantity = uiOptionInstrumentPosition;
        this.underlyingQuote = underlyingQuote;
        this.pnlMetrics = profitAndLossMetrics;
        this.chart = simulatedReturnsChart;
        this.type = type2;
        this.launchMode = launchMode;
        this.usePreTradeStyle = z2;
        this.isFullyExpanded = z3;
        this.strategyCode = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDataState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsSimulatedReturnChartDataState.strategyCode_delegate$lambda$1(this.f$0);
            }
        });
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    public final CuratedListItem getCuratedListItem() {
        return this.curatedListItem;
    }

    public final OptionsSimulatedReturnErrorState getErrorState() {
        return this.errorState;
    }

    public /* synthetic */ OptionsSimulatedReturnChartDataState(String str, BrokerageAccountType brokerageAccountType, CuratedListItem curatedListItem, OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState, Map map, boolean z, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionSimulatedChartBundle optionSimulatedChartBundle, Map map2, OptionsSimulatedChartScrubState optionsSimulatedChartScrubState, Point point, Map map3, Double d, UiAggregateOptionPositionFull uiAggregateOptionPositionFull, UiOptionInstrumentPosition uiOptionInstrumentPosition, UnderlyingQuote underlyingQuote, ProfitAndLossMetrics profitAndLossMetrics, SimulatedReturnsChart simulatedReturnsChart, OptionsSimulatedReturnChartViewState3 optionsSimulatedReturnChartViewState3, OptionsSimulatedReturnChartDataState2 optionsSimulatedReturnChartDataState2, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str2;
        UiAggregateOptionPositionFull uiAggregateOptionPositionFull2;
        OptionsSimulatedReturnChartDataState2 preTrade;
        String str3 = (i & 1) != 0 ? null : str;
        BrokerageAccountType brokerageAccountType2 = (i & 2) != 0 ? null : brokerageAccountType;
        CuratedListItem curatedListItem2 = (i & 4) != 0 ? null : curatedListItem;
        OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState2 = (i & 8) != 0 ? null : optionsSimulatedReturnErrorState;
        Map mapEmptyMap = (i & 16) != 0 ? MapsKt.emptyMap() : map;
        boolean z4 = (i & 32) != 0 ? false : z;
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState2 = (i & 64) != 0 ? null : optionsSimulatedReturnLoggingState;
        OptionSimulatedChartBundle optionSimulatedChartBundle2 = (i & 128) != 0 ? null : optionSimulatedChartBundle;
        Map mapEmptyMap2 = (i & 256) != 0 ? MapsKt.emptyMap() : map2;
        OptionsSimulatedChartScrubState optionsSimulatedChartScrubState2 = (i & 512) != 0 ? OptionsSimulatedChartScrubState.IDLE : optionsSimulatedChartScrubState;
        Point point2 = (i & 1024) != 0 ? new Point(0.0f, 0.0f) : point;
        Map mapEmptyMap3 = (i & 2048) != 0 ? MapsKt.emptyMap() : map3;
        Double d2 = (i & 4096) != 0 ? null : d;
        UiAggregateOptionPositionFull uiAggregateOptionPositionFull3 = (i & 8192) != 0 ? null : uiAggregateOptionPositionFull;
        UiOptionInstrumentPosition uiOptionInstrumentPosition2 = (i & 16384) != 0 ? null : uiOptionInstrumentPosition;
        UnderlyingQuote underlyingQuote2 = (i & 32768) != 0 ? null : underlyingQuote;
        ProfitAndLossMetrics profitAndLossMetrics2 = (i & 65536) != 0 ? null : profitAndLossMetrics;
        SimulatedReturnsChart simulatedReturnsChart2 = (i & 131072) != 0 ? null : simulatedReturnsChart;
        OptionsSimulatedReturnChartViewState3 optionsSimulatedReturnChartViewState32 = (i & 262144) != 0 ? OptionsSimulatedReturnChartViewState3.DOLLAR : optionsSimulatedReturnChartViewState3;
        if ((i & 524288) != 0) {
            str2 = str3;
            uiAggregateOptionPositionFull2 = uiAggregateOptionPositionFull3;
            preTrade = new OptionsSimulatedReturnChartDataState2.PreTrade(OptionSettings.DefaultPricingSetting.MARK_PRICE, extensions2.persistentListOf());
        } else {
            str2 = str3;
            uiAggregateOptionPositionFull2 = uiAggregateOptionPositionFull3;
            preTrade = optionsSimulatedReturnChartDataState2;
        }
        this(str2, brokerageAccountType2, curatedListItem2, optionsSimulatedReturnErrorState2, mapEmptyMap, z4, optionsSimulatedReturnLoggingState2, optionSimulatedChartBundle2, mapEmptyMap2, optionsSimulatedChartScrubState2, point2, mapEmptyMap3, d2, uiAggregateOptionPositionFull2, uiOptionInstrumentPosition2, underlyingQuote2, profitAndLossMetrics2, simulatedReturnsChart2, optionsSimulatedReturnChartViewState32, preTrade, (i & 1048576) != 0 ? false : z2, (i & 2097152) != 0 ? false : z3);
    }

    public final Map<UUID, Instant> getExpirationTimes() {
        return this.expirationTimes;
    }

    public final boolean isInProfitAndLossAverageCostRetirement() {
        return this.isInProfitAndLossAverageCostRetirement;
    }

    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    public final OptionSimulatedChartBundle getChartBundle() {
        return this.chartBundle;
    }

    public final Map<UUID, OptionInstrumentQuote> getOptionQuotes() {
        return this.optionQuotes;
    }

    public final OptionsSimulatedChartScrubState getScrubState() {
        return this.scrubState;
    }

    public final Point getScrubPoint() {
        return this.scrubPoint;
    }

    public final Map<UUID, OptionPricingParams> getSimulatedReturnsConfigs() {
        return this.simulatedReturnsConfigs;
    }

    public final Double getSliderPosition() {
        return this.sliderPosition;
    }

    public final UiAggregateOptionPositionFull getUiAggregatePositionIncludingZeroQuantity() {
        return this.uiAggregatePositionIncludingZeroQuantity;
    }

    public final UiOptionInstrumentPosition getUiOptionInstrumentPositionIncludingZeroQuantity() {
        return this.uiOptionInstrumentPositionIncludingZeroQuantity;
    }

    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    public final ProfitAndLossMetrics getPnlMetrics() {
        return this.pnlMetrics;
    }

    public final SimulatedReturnsChart getChart() {
        return this.chart;
    }

    public final OptionsSimulatedReturnChartViewState3 getType() {
        return this.type;
    }

    public final OptionsSimulatedReturnChartDataState2 getLaunchMode() {
        return this.launchMode;
    }

    public final boolean getUsePreTradeStyle() {
        return this.usePreTradeStyle;
    }

    public final boolean isFullyExpanded() {
        return this.isFullyExpanded;
    }

    public final String getStrategyCode() {
        return (String) this.strategyCode.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String strategyCode_delegate$lambda$1(OptionsSimulatedReturnChartDataState optionsSimulatedReturnChartDataState) {
        ImmutableList<OptionSimulatedChartLegBundle> legBundles;
        OptionPositionType optionPositionType;
        OptionSimulatedChartBundle optionSimulatedChartBundle = optionsSimulatedReturnChartDataState.chartBundle;
        if (optionSimulatedChartBundle == null || (legBundles = optionSimulatedChartBundle.getLegBundles()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundles, 10));
        for (OptionSimulatedChartLegBundle optionSimulatedChartLegBundle : legBundles) {
            UUID id = optionSimulatedChartLegBundle.getOptionInstrument().getId();
            int i = WhenMappings.$EnumSwitchMapping$0[optionSimulatedChartLegBundle.getSide().ordinal()];
            if (i == 1) {
                optionPositionType = OptionPositionType.LONG;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                optionPositionType = OptionPositionType.SHORT;
            }
            arrayList.add(new OptionLegCodeInfo(id, optionPositionType, optionSimulatedChartLegBundle.getQuantity()));
        }
        return OptionStrategyCodes2.toStrategyCode(arrayList, true);
    }
}
