package com.robinhood.android.options.lib.simulatedreturn.chart;

import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.segmented.UtilKt;
import com.robinhood.android.common.options.OptionPrices;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDataState4;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDataState2;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnPriceSliderStateProvider2;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsChart;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsChartInsets;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsGridLine;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsLeg;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsLine;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsParams;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsPoint;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsSegment;
import com.robinhood.android.portfolio.pnl.PnlAverageCostExperimentUtil;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartParams;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.AggregateOptionPosition;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.simulatedreturns.OptionPricingParams;
import com.robinhood.models.p355ui.EquityPositionBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle3;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import com.robinhood.models.p355ui.OptionSimulatedChartLegBundle;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.datetime.Converters4;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: OptionsSimulatedReturnChartStateProvider.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDataState;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartViewState;", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lj$/time/Clock;)V", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLine;", "line", "", "usePercentageReturns", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartPoint;", "createOptionsSimulatedReturnChartPoints", "(Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLine;Z)Lkotlinx/collections/immutable/PersistentList;", "ds", "Lkotlinx/datetime/Instant;", "now", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsParams;", "getChartParams", "(Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDataState;Lkotlinx/datetime/Instant;)Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsParams;", "getIsPositionClosed", "(Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDataState;)Ljava/lang/Boolean;", "getEarliestExpirationTime", "(Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDataState;)Lkotlinx/datetime/Instant;", "dataState", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartParams;", "getPnlMetricParams", "(Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDataState;)Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartParams;", "reduce", "(Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDataState;)Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartViewState;", "Lj$/time/Clock;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnChartStateProvider implements StateProvider<OptionsSimulatedReturnChartDataState, OptionsSimulatedReturnChartViewState> {
    public static final int $stable = 8;
    private final Clock clock;

    public OptionsSimulatedReturnChartStateProvider(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OptionsSimulatedReturnChartViewState reduce(OptionsSimulatedReturnChartDataState dataState) {
        ArrayList arrayList;
        SimulatedReturnsLine simulatedReturnsLine;
        SimulatedReturnsLine simulatedReturnsLine2;
        ImmutableList immutableListPersistentListOf;
        ImmutableList immutableListPersistentListOf2;
        List<SimulatedReturnsGridLine> yAxis;
        List<SimulatedReturnsGridLine> xAxis;
        List<SimulatedReturnsLeg> legs;
        SimulatedReturnsPoint simulatedReturnsPoint;
        SimulatedReturnsLine line;
        List<SimulatedReturnsSegment> segments;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        SimulatedReturnsChart chart = dataState.getChart();
        Instant instantNow = Instant.now(this.clock);
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        SimulatedReturnsParams chartParams = getChartParams(dataState, Converters4.toKotlinInstant(instantNow));
        if (chart == null || (line = chart.getLine()) == null || (segments = line.getSegments()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator<T> it = segments.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((SimulatedReturnsSegment) it.next()).getPoints());
            }
        }
        Double dValueOf = (arrayList == null || (simulatedReturnsPoint = (SimulatedReturnsPoint) UtilKt.getClosestItemByValue(arrayList, dataState.getScrubPoint().getX(), new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartStateProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(OptionsSimulatedReturnChartStateProvider.reduce$lambda$3$lambda$2$lambda$1((SimulatedReturnsPoint) obj));
            }
        })) == null) ? null : Double.valueOf(simulatedReturnsPoint.getTheoreticalPrice());
        String accountNumber = dataState.getAccountNumber();
        if (chart == null || (simulatedReturnsLine = chart.getLine()) == null) {
            simulatedReturnsLine = new SimulatedReturnsLine(extensions2.persistentListOf());
        }
        boolean z = false;
        ImmutableList3<OptionsSimulatedReturnChartPoint> immutableList3CreateOptionsSimulatedReturnChartPoints = createOptionsSimulatedReturnChartPoints(simulatedReturnsLine, chartParams != null ? chartParams.getUsePercentageReturns() : false);
        kotlinx.datetime.Instant earliestExpirationTime = getEarliestExpirationTime(dataState);
        OptionsSimulatedReturnErrorState errorState = dataState.getErrorState();
        boolean z2 = chartParams == null || Math.abs(chartParams.getTradeValueMultiplier() - ((double) 100)) < 0.001d;
        Boolean isPositionClosed = getIsPositionClosed(dataState);
        if (chartParams != null && (legs = chartParams.getLegs()) != null && legs.size() == 1) {
            z = true;
        }
        OptionsSimulatedReturnChartDataState2 launchMode = dataState.getLaunchMode();
        OptionSimulatedChartBundle chartBundle = dataState.getChartBundle();
        OptionsSimulatedChartScrubState scrubState = dataState.getScrubState();
        Point scrubPoint = dataState.getScrubPoint();
        if (chart == null || (simulatedReturnsLine2 = chart.getLine()) == null) {
            simulatedReturnsLine2 = new SimulatedReturnsLine(extensions2.persistentListOf());
        }
        OptionsSimulatedReturnChartViewState3 type2 = dataState.getType();
        if (chart == null || (xAxis = chart.getXAxis()) == null || (immutableListPersistentListOf = extensions2.toImmutableList(xAxis)) == null) {
            immutableListPersistentListOf = extensions2.persistentListOf();
        }
        ImmutableList immutableList = immutableListPersistentListOf;
        if (chart == null || (yAxis = chart.getYAxis()) == null || (immutableListPersistentListOf2 = extensions2.toImmutableList(yAxis)) == null) {
            immutableListPersistentListOf2 = extensions2.persistentListOf();
        }
        return new OptionsSimulatedReturnChartViewState(accountNumber, chart, immutableList3CreateOptionsSimulatedReturnChartPoints, earliestExpirationTime, errorState, dValueOf, z2, z, isPositionClosed, launchMode, chartBundle, chartParams, scrubState, scrubPoint, simulatedReturnsLine2, type2, immutableList, immutableListPersistentListOf2, chart != null ? chart.getMaxProfit() : null, chart != null ? chart.getMaxLoss() : null, dataState.getLoggingState(), dataState.getStrategyCode(), getPnlMetricParams(dataState), dataState.getPnlMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float reduce$lambda$3$lambda$2$lambda$1(SimulatedReturnsPoint it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (float) it.getX();
    }

    private final ImmutableList3<OptionsSimulatedReturnChartPoint> createOptionsSimulatedReturnChartPoints(SimulatedReturnsLine line, boolean usePercentageReturns) {
        List<SimulatedReturnsSegment> segments = line.getSegments();
        ArrayList<SimulatedReturnsPoint> arrayList = new ArrayList();
        Iterator<T> it = segments.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((SimulatedReturnsSegment) it.next()).getPoints());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (SimulatedReturnsPoint simulatedReturnsPoint : arrayList) {
            double theoreticalReturnPercent = usePercentageReturns ? simulatedReturnsPoint.getTheoreticalReturnPercent() : simulatedReturnsPoint.getTheoreticalReturn();
            float x = (float) simulatedReturnsPoint.getX();
            float y = (float) simulatedReturnsPoint.getY();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(simulatedReturnsPoint.getTimestamp().getEpochSeconds());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            arrayList2.add(new OptionsSimulatedReturnChartPoint(x, y, bigDecimalValueOf, new BigDecimal(String.valueOf(theoreticalReturnPercent)), new BigDecimal(String.valueOf(simulatedReturnsPoint.getTheoreticalPrice())), simulatedReturnsPoint.getTimestampLabel()));
        }
        return extensions2.toPersistentList(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[PHI: r4
      0x0047: PHI (r4v32 double) = (r4v4 double), (r4v35 double) binds: [B:77:0x0134, B:21:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049 A[PHI: r4
      0x0049: PHI (r4v16 double) = (r4v4 double), (r4v35 double) binds: [B:77:0x0134, B:21:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[PHI: r0 r8
      0x0083: PHI (r0v16 int) = (r0v11 int), (r0v13 int), (r0v18 int), (r0v20 int) binds: [B:68:0x00f2, B:64:0x00d4, B:48:0x00a3, B:42:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r8v5 double) = (r8v1 double), (r8v2 double), (r8v6 double), (r8v7 double) binds: [B:68:0x00f2, B:64:0x00d4, B:48:0x00a3, B:42:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085 A[PHI: r0 r8
      0x0085: PHI (r0v14 int) = (r0v11 int), (r0v13 int), (r0v18 int), (r0v20 int) binds: [B:68:0x00f2, B:64:0x00d4, B:48:0x00a3, B:42:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r8v3 double) = (r8v1 double), (r8v2 double), (r8v6 double), (r8v7 double) binds: [B:68:0x00f2, B:64:0x00d4, B:48:0x00a3, B:42:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final SimulatedReturnsParams getChartParams(OptionsSimulatedReturnChartDataState ds, kotlinx.datetime.Instant now) {
        BigDecimal tradeValueMultiplier;
        double dDoubleValue;
        OptionInstrumentPosition optionInstrumentPosition;
        int iIntValue;
        double dDoubleValue2;
        boolean z;
        int i;
        boolean z2;
        double d;
        AggregateOptionPosition aggregateOptionPosition;
        Double sliderPosition;
        BigDecimal sliderDisplayPrice;
        Double nullableImpliedVolatility;
        boolean z3;
        Money optionOpenPrice;
        BigDecimal decimalValue;
        boolean zShouldUseClearingCostBasis = PnlAverageCostExperimentUtil.shouldUseClearingCostBasis(ds.getAccountType(), ds.isInProfitAndLossAverageCostRetirement());
        OptionSimulatedChartBundle chartBundle = ds.getChartBundle();
        if (chartBundle == null || (tradeValueMultiplier = chartBundle.getTradeValueMultiplier()) == null) {
            return null;
        }
        OptionsSimulatedReturnChartDataState2 launchMode = ds.getLaunchMode();
        if (launchMode instanceof OptionsSimulatedReturnChartDataState2.Watchlist) {
            CuratedListItem curatedListItem = ds.getCuratedListItem();
            if (curatedListItem == null || (optionOpenPrice = curatedListItem.getOptionOpenPrice()) == null || (decimalValue = optionOpenPrice.getDecimalValue()) == null) {
                return null;
            }
            dDoubleValue = decimalValue.doubleValue();
            OrderDirection optionOpenPriceDirection = curatedListItem.getOptionOpenPriceDirection();
            if (optionOpenPriceDirection == null) {
                return null;
            }
            z3 = optionOpenPriceDirection == OrderDirection.CREDIT;
        } else {
            if (launchMode instanceof OptionsSimulatedReturnChartDataState2.AggregatePosition) {
                UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity = ds.getUiAggregatePositionIncludingZeroQuantity();
                if (uiAggregatePositionIncludingZeroQuantity == null || (aggregateOptionPosition = uiAggregatePositionIncludingZeroQuantity.getAggregateOptionPosition()) == null) {
                    return null;
                }
                if (zShouldUseClearingCostBasis) {
                    BigDecimal clearingRunningQuantity = aggregateOptionPosition.getClearingRunningQuantity();
                    if (clearingRunningQuantity != null) {
                        iIntValue = clearingRunningQuantity.intValue();
                        BigDecimal clearingAverageCostBasis = aggregateOptionPosition.getClearingAverageCostBasis();
                        if (clearingAverageCostBasis != null) {
                            dDoubleValue2 = clearingAverageCostBasis.doubleValue();
                            OrderDirection clearingDirection = aggregateOptionPosition.getClearingDirection();
                            if (clearingDirection == null) {
                                return null;
                            }
                            z = clearingDirection == OrderDirection.CREDIT;
                        }
                    }
                    return null;
                }
                iIntValue = aggregateOptionPosition.getQuantity().intValue();
                dDoubleValue2 = aggregateOptionPosition.getAverageOpenPrice().doubleValue();
                if (aggregateOptionPosition.getDirection() == OrderDirection.CREDIT) {
                }
            } else if (launchMode instanceof OptionsSimulatedReturnChartDataState2.InstrumentPosition) {
                UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity = ds.getUiOptionInstrumentPositionIncludingZeroQuantity();
                if (uiOptionInstrumentPositionIncludingZeroQuantity == null || (optionInstrumentPosition = uiOptionInstrumentPositionIncludingZeroQuantity.getOptionInstrumentPosition()) == null) {
                    return null;
                }
                if (zShouldUseClearingCostBasis) {
                    BigDecimal clearingRunningQuantity2 = optionInstrumentPosition.getClearingRunningQuantity();
                    if (clearingRunningQuantity2 != null) {
                        iIntValue = clearingRunningQuantity2.intValue();
                        BigDecimal clearingAverageCostBasis2 = optionInstrumentPosition.getClearingAverageCostBasis();
                        if (clearingAverageCostBasis2 != null) {
                            dDoubleValue2 = clearingAverageCostBasis2.doubleValue();
                            if (optionInstrumentPosition.getDirection() == OrderDirection.CREDIT) {
                            }
                        }
                    }
                    return null;
                }
                iIntValue = optionInstrumentPosition.getQuantity().intValue();
                dDoubleValue2 = optionInstrumentPosition.getAverageOpenPrice().abs().doubleValue();
                if (optionInstrumentPosition.getDirection() == OrderDirection.CREDIT) {
                }
            } else {
                if (!(launchMode instanceof OptionsSimulatedReturnChartDataState2.PreTrade)) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal optionStrategyPrice = OptionPrices.getOptionStrategyPrice(OptionSimulatedChartBundle3.toOptionSimulatedChartLegBundles(((OptionsSimulatedReturnChartDataState2.PreTrade) ds.getLaunchMode()).getLegs()), ds.getOptionQuotes(), ((OptionsSimulatedReturnChartDataState2.PreTrade) ds.getLaunchMode()).getDefaultPricingSetting());
                if (optionStrategyPrice == null) {
                    return null;
                }
                BigDecimal bigDecimalMultiply = optionStrategyPrice.multiply(tradeValueMultiplier);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                dDoubleValue = bigDecimalMultiply.abs().doubleValue();
                if (optionStrategyPrice.compareTo(BigDecimal.ZERO) < 0) {
                }
            }
            i = iIntValue;
            z2 = z;
            d = dDoubleValue2;
            sliderPosition = ds.getSliderPosition();
            if (sliderPosition != null || (sliderDisplayPrice = OptionsSimulatedReturnPriceSliderStateProvider2.getSliderDisplayPrice(sliderPosition.doubleValue())) == null) {
                return null;
            }
            double dDoubleValue3 = sliderDisplayPrice.doubleValue();
            boolean z4 = ds.getType() == OptionsSimulatedReturnChartViewState3.PERCENT;
            SimulatedReturnsChartInsets simulatedReturnsChartInsets = new SimulatedReturnsChartInsets(0.0d, 0.0d, 0.1d, 0.1d);
            int i2 = (!ds.getUsePreTradeStyle() || ds.isFullyExpanded()) ? 6 : 3;
            ImmutableList<OptionSimulatedChartLegBundle> legBundles = chartBundle.getLegBundles();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundles, 10));
            for (OptionSimulatedChartLegBundle optionSimulatedChartLegBundle : legBundles) {
                OptionPricingParams optionPricingParams = ds.getSimulatedReturnsConfigs().get(optionSimulatedChartLegBundle.getOptionInstrument().getId());
                if (optionPricingParams == null) {
                    return null;
                }
                double dDoubleValue4 = optionSimulatedChartLegBundle.getOptionInstrument().getStrikePrice().doubleValue();
                kotlinx.datetime.Instant instant = ds.getExpirationTimes().get(optionSimulatedChartLegBundle.getOptionInstrument().getId());
                if (instant == null || (nullableImpliedVolatility = optionPricingParams.getNullableImpliedVolatility()) == null) {
                    return null;
                }
                double dDoubleValue5 = nullableImpliedVolatility.doubleValue();
                double interestRate = optionPricingParams.getInterestRate();
                double dividendYield = optionPricingParams.getDividendYield();
                int quantity = optionSimulatedChartLegBundle.getQuantity();
                boolean z5 = optionSimulatedChartLegBundle.getSide() == OrderSide.BUY;
                boolean z6 = optionSimulatedChartLegBundle.getOptionInstrument().getContractType() == OptionContractType.PUT;
                OptionSimulatedChartBundle5 underlying = chartBundle.getUnderlying();
                arrayList.add(new SimulatedReturnsLeg(dDoubleValue4, instant, dDoubleValue5, interestRate, dividendYield, quantity, z5, z6, (underlying != null ? underlying.getType() : null) == OptionChain.UnderlyingType.INDEX));
            }
            return new SimulatedReturnsParams(now, dDoubleValue3, d, z2, (List) arrayList, z4, simulatedReturnsChartInsets, i, false, false, 4, i2, tradeValueMultiplier.doubleValue(), 512, (DefaultConstructorMarker) null);
        }
        z2 = z3;
        d = dDoubleValue;
        i = 1;
        sliderPosition = ds.getSliderPosition();
        if (sliderPosition != null) {
        }
        return null;
    }

    private final Boolean getIsPositionClosed(OptionsSimulatedReturnChartDataState ds) {
        OptionInstrumentPosition optionInstrumentPosition;
        BigDecimal quantity;
        BigDecimal quantity2;
        OptionsSimulatedReturnChartDataState2 launchMode = ds.getLaunchMode();
        if (Intrinsics.areEqual(launchMode, OptionsSimulatedReturnChartDataState2.AggregatePosition.INSTANCE)) {
            UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity = ds.getUiAggregatePositionIncludingZeroQuantity();
            if (uiAggregatePositionIncludingZeroQuantity == null || (quantity2 = uiAggregatePositionIncludingZeroQuantity.getQuantity()) == null) {
                return null;
            }
            return Boolean.valueOf(quantity2.compareTo(BigDecimal.ZERO) == 0);
        }
        if (Intrinsics.areEqual(launchMode, OptionsSimulatedReturnChartDataState2.InstrumentPosition.INSTANCE)) {
            UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity = ds.getUiOptionInstrumentPositionIncludingZeroQuantity();
            if (uiOptionInstrumentPositionIncludingZeroQuantity == null || (optionInstrumentPosition = uiOptionInstrumentPositionIncludingZeroQuantity.getOptionInstrumentPosition()) == null || (quantity = optionInstrumentPosition.getQuantity()) == null) {
                return null;
            }
            return Boolean.valueOf(quantity.compareTo(BigDecimal.ZERO) == 0);
        }
        if (!(launchMode instanceof OptionsSimulatedReturnChartDataState2.PreTrade) && !Intrinsics.areEqual(launchMode, OptionsSimulatedReturnChartDataState2.Watchlist.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return Boolean.FALSE;
    }

    private final kotlinx.datetime.Instant getEarliestExpirationTime(OptionsSimulatedReturnChartDataState ds) {
        return (kotlinx.datetime.Instant) CollectionsKt.minOrNull((Iterable) CollectionsKt.filterNotNull(ds.getExpirationTimes().values()));
    }

    private final ProfitAndLossChartParams getPnlMetricParams(OptionsSimulatedReturnChartDataState dataState) {
        BigDecimal quantity;
        BigDecimal averageCost;
        EquityPositionBundle equityPositionBundle;
        EquityPositionBundle equityPositionBundle2;
        if (!(dataState.getLaunchMode() instanceof OptionsSimulatedReturnChartDataState2.PreTrade)) {
            return null;
        }
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
        List<OptionSimulatedChartLegBundle> optionSimulatedChartLegBundles = OptionSimulatedChartBundle3.toOptionSimulatedChartLegBundles(((OptionsSimulatedReturnChartDataState2.PreTrade) dataState.getLaunchMode()).getLegs());
        OptionSimulatedChartBundle chartBundle3 = dataState.getChartBundle();
        return OptionsProfitAndLossChartUtils.getPnlChartParams(bigDecimal, bigDecimal2, optionSimulatedChartLegBundles, chartBundle3 != null ? chartBundle3.getUnderlying() : null, dataState.getExpirationTimes(), dataState.getOptionQuotes(), dataState.getSimulatedReturnsConfigs(), new OptionsProfitAndLossChartDataState4.PreTrade(((OptionsSimulatedReturnChartDataState2.PreTrade) dataState.getLaunchMode()).getDefaultPricingSetting()), dataState.getUnderlyingQuote(), null);
    }
}
