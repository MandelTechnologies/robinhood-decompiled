package com.robinhood.android.options.lib.simulatedreturn.chart;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.OptionPrices;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.lib.simulatedreturn.C23151R;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDataState4;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossSegment;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsGridLine;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChart;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartLeg;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartParams;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartParams2;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossLimit;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossLimitType;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossPoint;
import com.robinhood.android.trade.options.profitloss.local.ProfitAndLossSegment;
import com.robinhood.android.trade.options.profitloss.local.ProfitLossAtExpiration4;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.simulatedreturns.OptionPricingParams;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import com.robinhood.models.p355ui.OptionSimulatedChartLegBundle;
import com.robinhood.models.p355ui.OptionUnderlyings;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.datetime.Instant;

/* compiled from: OptionsProfitAndLossChartUtils.kt */
@Metadata(m3635d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a8\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u001c\u0010\u0016\u001a\u00020\b*\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002\u001a#\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010\u001b\u001a \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0002\u001a\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010!\u001a\u00020\u000bH\u0002\u001a:\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\r2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020(0'H\u0002\u001a6\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00140\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0090\u0001\u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u00142\b\u00100\u001a\u0004\u0018\u0001012\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0006\u0012\u0004\u0018\u000105032\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000207032\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000209032\b\u0010:\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u000105H\u0000\u001a\u001a\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0000\u001a*\u0010D\u001a\u00020(2\u0006\u0010@\u001a\u00020A2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u000e\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0000\u001a\u0010\u0010F\u001a\u00020(2\u0006\u0010G\u001a\u00020HH\u0001\u001a\u0010\u0010I\u001a\u00020(2\u0006\u0010G\u001a\u00020HH\u0002\"\u000e\u0010J\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010K\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010L\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010M\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000¨\u0006N"}, m3636d2 = {"mapToChartData", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartData;", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChart;", "params", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartParams;", "postProcessParams", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartPostProcessParams;", "underlyingValue", "Ljava/math/BigDecimal;", "optionOrderPrice", "showPointsOfInterests", "", "createOptionsProfitAndLossSegments", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossSegment;", "chart", "optionOrderPriceWithTvm", "getNormalizedPoints", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartPoint;", "points", "", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossPoint;", "getNormalizedPosition", "minValue", "maxValue", "getUnderlyingX", "", "(Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChart;Ljava/math/BigDecimal;)Ljava/lang/Float;", "getXAxisData", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getYAxisData", "isFullyExpanded", "getAxisData", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossRawAxis;", "numberOfLabels", "", "getLabel", "Lkotlin/Function1;", "", "getArea", "isPositive", "getPnlChartParams", "equityPositionQuantity", "equityPositionAverageCost", "legBundles", "Lcom/robinhood/models/ui/OptionSimulatedChartLegBundle;", "underlying", "Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;", "expirationTimes", "", "Ljava/util/UUID;", "Lkotlinx/datetime/Instant;", "optionQuotes", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "simulatedReturnsConfigs", "Lcom/robinhood/models/db/simulatedreturns/OptionPricingParams;", "pnlChartLaunchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "evaluationTime", "getMaxProfitOrLossDisplayText", "resources", "Landroid/content/res/Resources;", "limit", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;", "getBreakevenDisplayText", "breakevenPoints", "getShortLabel", "value", "", "getDecimalString", "NUM_OF_X_LABELS", "NUM_OF_Y_LABELS_FULLY_EXPANDED", "NUM_OF_Y_LABELS_EXPANDED", "TIME_SLIDER_ERROR_IN_SECONDS", "lib-options-simulated-return_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartUtilsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsProfitAndLossChartUtils {
    private static final int NUM_OF_X_LABELS = 4;
    private static final int NUM_OF_Y_LABELS_EXPANDED = 3;
    private static final int NUM_OF_Y_LABELS_FULLY_EXPANDED = 5;
    private static final int TIME_SLIDER_ERROR_IN_SECONDS = 1;

    /* compiled from: OptionsProfitAndLossChartUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfitAndLossLimitType.values().length];
            try {
                iArr[ProfitAndLossLimitType.LIMIT_FINITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfitAndLossLimitType.LIMIT_POSITIVE_INFINITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfitAndLossLimitType.LIMIT_NEGATIVE_INFINITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProfitAndLossLimitType.LIMIT_UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final OptionsProfitAndLossChartData mapToChartData(ProfitAndLossChart profitAndLossChart, ProfitAndLossChartParams params, OptionsProfitAndLossChartPostProcessParams postProcessParams, BigDecimal bigDecimal, BigDecimal optionOrderPrice) {
        ImmutableList immutableListPersistentListOf;
        Intrinsics.checkNotNullParameter(profitAndLossChart, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(postProcessParams, "postProcessParams");
        Intrinsics.checkNotNullParameter(optionOrderPrice, "optionOrderPrice");
        BigDecimal bigDecimalMultiply = optionOrderPrice.multiply(postProcessParams.getTradeValueMultiplier());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        ImmutableList<OptionsSimulatedReturnChartPoint> normalizedPoints = getNormalizedPoints(profitAndLossChart, profitAndLossChart.getSampledPoints(), bigDecimalMultiply, postProcessParams);
        if (showPointsOfInterests(params)) {
            immutableListPersistentListOf = getNormalizedPoints(profitAndLossChart, profitAndLossChart.getPricesOfInterest(), bigDecimalMultiply, postProcessParams);
        } else {
            immutableListPersistentListOf = extensions2.persistentListOf();
        }
        return new OptionsProfitAndLossChartData(normalizedPoints, immutableListPersistentListOf, createOptionsProfitAndLossSegments(profitAndLossChart, bigDecimalMultiply, postProcessParams), getXAxisData(profitAndLossChart, postProcessParams.getUnderlyingType()), getYAxisData(profitAndLossChart, postProcessParams.isFullyExpanded()), getArea(profitAndLossChart, true, bigDecimalMultiply, postProcessParams), getArea(profitAndLossChart, false, bigDecimalMultiply, postProcessParams), getUnderlyingX(profitAndLossChart, bigDecimal), profitAndLossChart.getLimitAtZero(), profitAndLossChart.getLimitAtInfinity());
    }

    private static final boolean showPointsOfInterests(ProfitAndLossChartParams profitAndLossChartParams) {
        ImmutableList<ProfitAndLossChartLeg> legs = profitAndLossChartParams.getLegs();
        Instant evaluationTime = profitAndLossChartParams.getEvaluationTime();
        if (!legs.isEmpty() && evaluationTime != null) {
            long epochSeconds = evaluationTime.getEpochSeconds();
            Iterator<ProfitAndLossChartLeg> it = legs.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Instant expirationTime = it.next().getExpirationTime();
            while (it.hasNext()) {
                Instant expirationTime2 = it.next().getExpirationTime();
                if (expirationTime.compareTo(expirationTime2) > 0) {
                    expirationTime = expirationTime2;
                }
            }
            if (Math.abs(epochSeconds - expirationTime.getEpochSeconds()) > 1) {
                return false;
            }
        }
        return true;
    }

    private static final ImmutableList<OptionsProfitAndLossSegment> createOptionsProfitAndLossSegments(ProfitAndLossChart profitAndLossChart, BigDecimal bigDecimal, OptionsProfitAndLossChartPostProcessParams optionsProfitAndLossChartPostProcessParams) {
        OptionsProfitAndLossSegment.Sign sign;
        OptionsProfitAndLossSegment.Sign sign2;
        if (profitAndLossChart == null) {
            return extensions2.persistentListOf();
        }
        List<ProfitAndLossPoint> sampledPoints = profitAndLossChart.getSampledPoints();
        List<ProfitAndLossPoint> breakevenPoints = profitAndLossChart.getBreakevenPoints();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Object obj : breakevenPoints) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ProfitAndLossPoint profitAndLossPoint = (ProfitAndLossPoint) obj;
            ArrayList arrayList2 = new ArrayList();
            while (i < sampledPoints.size() && sampledPoints.get(i).getUnderlyingPrice().compareTo(profitAndLossPoint.getUnderlyingPrice()) <= 0) {
                arrayList2.add(sampledPoints.get(i));
                i++;
            }
            arrayList2.add(profitAndLossPoint);
            ImmutableList<OptionsSimulatedReturnChartPoint> normalizedPoints = getNormalizedPoints(profitAndLossChart, CollectionsKt.plus((Collection) CollectionsKt.listOfNotNull(CollectionsKt.getOrNull(breakevenPoints, i2 - 1)), (Iterable) arrayList2), bigDecimal, optionsProfitAndLossChartPostProcessParams);
            if (((ProfitAndLossPoint) arrayList2.get(arrayList2.size() / 2)).getProfitOrLoss().signum() > 0) {
                sign2 = OptionsProfitAndLossSegment.Sign.POSITIVE;
            } else if (((ProfitAndLossPoint) arrayList2.get(arrayList2.size() / 2)).getProfitOrLoss().signum() < 0) {
                sign2 = OptionsProfitAndLossSegment.Sign.NEGATIVE;
            } else {
                sign2 = OptionsProfitAndLossSegment.Sign.ZERO;
            }
            arrayList.add(new OptionsProfitAndLossSegment(normalizedPoints, sign2));
            i2 = i3;
        }
        if (i < sampledPoints.size()) {
            ImmutableList<OptionsSimulatedReturnChartPoint> normalizedPoints2 = getNormalizedPoints(profitAndLossChart, CollectionsKt.plus((Collection) CollectionsKt.listOfNotNull(CollectionsKt.lastOrNull((List) breakevenPoints)), (Iterable) sampledPoints.subList(i, sampledPoints.size())), bigDecimal, optionsProfitAndLossChartPostProcessParams);
            if (sampledPoints.get(i).getProfitOrLoss().signum() > 0) {
                sign = OptionsProfitAndLossSegment.Sign.POSITIVE;
            } else {
                sign = sampledPoints.get(i).getProfitOrLoss().signum() < 0 ? OptionsProfitAndLossSegment.Sign.NEGATIVE : OptionsProfitAndLossSegment.Sign.ZERO;
            }
            arrayList.add(new OptionsProfitAndLossSegment(normalizedPoints2, sign));
        }
        return extensions2.toImmutableList(arrayList);
    }

    private static final ImmutableList<OptionsSimulatedReturnChartPoint> getNormalizedPoints(ProfitAndLossChart profitAndLossChart, List<ProfitAndLossPoint> list, BigDecimal bigDecimal, OptionsProfitAndLossChartPostProcessParams optionsProfitAndLossChartPostProcessParams) {
        if (profitAndLossChart == null || list == null) {
            return extensions2.persistentListOf();
        }
        List<ProfitAndLossPoint> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ProfitAndLossPoint profitAndLossPoint : list2) {
            float fFloatValue = getNormalizedPosition(profitAndLossPoint.getUnderlyingPrice(), profitAndLossChart.getMinX(), profitAndLossChart.getMaxX()).floatValue();
            float fFloatValue2 = getNormalizedPosition(profitAndLossPoint.getProfitOrLoss(), profitAndLossChart.getMinY(), profitAndLossChart.getMaxY()).floatValue();
            BigDecimal underlyingPrice = profitAndLossPoint.getUnderlyingPrice();
            BigDecimal profitOrLoss = profitAndLossPoint.getProfitOrLoss();
            BigDecimal bigDecimalAdd = profitAndLossPoint.getProfitOrLoss().add(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            BigDecimal bigDecimalAbs = BigDecimals7.safeDivide(bigDecimalAdd, optionsProfitAndLossChartPostProcessParams.getTradeValueMultiplier()).abs();
            Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
            arrayList.add(new OptionsSimulatedReturnChartPoint(fFloatValue, fFloatValue2, underlyingPrice, profitOrLoss, bigDecimalAbs, OptionUnderlyings.getUnderlyingNumberFormatter(optionsProfitAndLossChartPostProcessParams.getUnderlyingType()).format(profitAndLossPoint.getUnderlyingPrice())));
        }
        return extensions2.toImmutableList(arrayList);
    }

    private static final BigDecimal getNormalizedPosition(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        if (bigDecimal2.compareTo(bigDecimal3) > 0) {
            throw new IllegalStateException(("minValue (" + bigDecimal2 + ") must be less than or equal to maxValue (" + bigDecimal3 + ")").toString());
        }
        BigDecimal bigDecimalSubtract = ((BigDecimal) RangesKt.coerceIn(bigDecimal, bigDecimal2, bigDecimal3)).subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalSubtract2 = bigDecimal3.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        return BigDecimals7.safeDivide(bigDecimalSubtract, bigDecimalSubtract2);
    }

    private static final Float getUnderlyingX(ProfitAndLossChart profitAndLossChart, BigDecimal bigDecimal) {
        if (profitAndLossChart == null || bigDecimal == null) {
            return null;
        }
        return Float.valueOf(getNormalizedPosition(bigDecimal, profitAndLossChart.getMinX(), profitAndLossChart.getMaxX()).floatValue());
    }

    private static final ImmutableList<SimulatedReturnsGridLine> getXAxisData(ProfitAndLossChart profitAndLossChart, final OptionChain.UnderlyingType underlyingType) {
        if (profitAndLossChart == null) {
            return extensions2.persistentListOf();
        }
        ImmutableList<OptionsProfitAndLossRawAxis> axisData = getAxisData(4, profitAndLossChart.getMinX(), profitAndLossChart.getMaxX(), new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitAndLossChartUtils.getXAxisData$lambda$4(underlyingType, (BigDecimal) obj);
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(axisData, 10));
        for (OptionsProfitAndLossRawAxis optionsProfitAndLossRawAxis : axisData) {
            arrayList.add(new SimulatedReturnsGridLine(getNormalizedPosition(optionsProfitAndLossRawAxis.getValue(), profitAndLossChart.getMinX(), profitAndLossChart.getMaxX()).doubleValue(), optionsProfitAndLossRawAxis.getLabel(), false, 0.0d, 8, (DefaultConstructorMarker) null));
        }
        return extensions2.toImmutableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getXAxisData$lambda$4(OptionChain.UnderlyingType underlyingType, BigDecimal absolutePosition) {
        Intrinsics.checkNotNullParameter(absolutePosition, "absolutePosition");
        return OptionUnderlyings.getStrikeFormatter(underlyingType).format(absolutePosition);
    }

    static /* synthetic */ ImmutableList getYAxisData$default(ProfitAndLossChart profitAndLossChart, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getYAxisData(profitAndLossChart, z);
    }

    private static final ImmutableList<SimulatedReturnsGridLine> getYAxisData(ProfitAndLossChart profitAndLossChart, boolean z) {
        if (profitAndLossChart == null) {
            return extensions2.persistentListOf();
        }
        ImmutableList<OptionsProfitAndLossRawAxis> axisData = getAxisData(z ? 5 : 3, profitAndLossChart.getMinY(), profitAndLossChart.getMaxY(), new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartUtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitAndLossChartUtils.getYAxisData$lambda$6((BigDecimal) obj);
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(axisData, 10));
        for (OptionsProfitAndLossRawAxis optionsProfitAndLossRawAxis : axisData) {
            arrayList.add(new SimulatedReturnsGridLine(getNormalizedPosition(optionsProfitAndLossRawAxis.getValue(), profitAndLossChart.getMinY(), profitAndLossChart.getMaxY()).doubleValue(), optionsProfitAndLossRawAxis.getLabel(), optionsProfitAndLossRawAxis.getValue().compareTo(BigDecimal.ZERO) == 0, 0.0d, 8, (DefaultConstructorMarker) null));
        }
        return extensions2.toImmutableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getYAxisData$lambda$6(BigDecimal absolutePosition) {
        Intrinsics.checkNotNullParameter(absolutePosition, "absolutePosition");
        return getShortLabel(absolutePosition.doubleValue());
    }

    private static final ImmutableList<OptionsProfitAndLossRawAxis> getAxisData(int i, BigDecimal bigDecimal, BigDecimal bigDecimal2, Function1<? super BigDecimal, String> function1) {
        ArrayList arrayList = new ArrayList();
        BigDecimal bigDecimalSubtract = bigDecimal2.subtract(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i + 1);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalSafeDivide = BigDecimals7.safeDivide(bigDecimalSubtract, bigDecimalValueOf);
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(i2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                BigDecimal bigDecimalMultiply = bigDecimalSafeDivide.multiply(bigDecimalValueOf2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimalMultiply);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                BigDecimal scale = bigDecimalAdd.setScale(0, RoundingMode.HALF_UP);
                Intrinsics.checkNotNull(scale);
                arrayList.add(new OptionsProfitAndLossRawAxis(scale, function1.invoke(scale)));
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return extensions2.toImmutableList(arrayList);
    }

    private static final ImmutableList<List<OptionsProfitAndLossSegment>> getArea(ProfitAndLossChart profitAndLossChart, boolean z, BigDecimal bigDecimal, OptionsProfitAndLossChartPostProcessParams optionsProfitAndLossChartPostProcessParams) {
        if (profitAndLossChart == null) {
            return extensions2.persistentListOf();
        }
        List<List<ProfitAndLossSegment>> positiveAreas = z ? profitAndLossChart.getPositiveAreas() : profitAndLossChart.getNegativeAreas();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(positiveAreas, 10));
        Iterator<T> it = positiveAreas.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new OptionsProfitAndLossSegment(getNormalizedPoints(profitAndLossChart, ((ProfitAndLossSegment) it2.next()).getPoints(), bigDecimal, optionsProfitAndLossChartPostProcessParams), z ? OptionsProfitAndLossSegment.Sign.POSITIVE : OptionsProfitAndLossSegment.Sign.NEGATIVE));
            }
            arrayList.add(arrayList2);
        }
        return extensions2.toImmutableList(arrayList);
    }

    public static final ProfitAndLossChartParams getPnlChartParams(BigDecimal equityPositionQuantity, BigDecimal equityPositionAverageCost, List<OptionSimulatedChartLegBundle> list, OptionSimulatedChartBundle5 optionSimulatedChartBundle5, Map<UUID, Instant> expirationTimes, Map<UUID, OptionInstrumentQuote> optionQuotes, Map<UUID, OptionPricingParams> simulatedReturnsConfigs, OptionsProfitAndLossChartDataState4 optionsProfitAndLossChartDataState4, UnderlyingQuote underlyingQuote, Instant instant) {
        Money money$default;
        ProfitLossAtExpiration4 profitLossAtExpiration4;
        Double nullableImpliedVolatility;
        Intrinsics.checkNotNullParameter(equityPositionQuantity, "equityPositionQuantity");
        Intrinsics.checkNotNullParameter(equityPositionAverageCost, "equityPositionAverageCost");
        Intrinsics.checkNotNullParameter(expirationTimes, "expirationTimes");
        Intrinsics.checkNotNullParameter(optionQuotes, "optionQuotes");
        Intrinsics.checkNotNullParameter(simulatedReturnsConfigs, "simulatedReturnsConfigs");
        if (list == null || underlyingQuote == null || optionSimulatedChartBundle5 == null) {
            return null;
        }
        List<OptionSimulatedChartLegBundle> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (OptionSimulatedChartLegBundle optionSimulatedChartBundle4 : list2) {
            OptionPricingParams optionPricingParams = simulatedReturnsConfigs.get(optionSimulatedChartBundle4.getOptionInstrument().getId());
            if (optionPricingParams == null) {
                return null;
            }
            OptionChain.UnderlyingType type2 = optionSimulatedChartBundle5.getType();
            Instant instant2 = expirationTimes.get(optionSimulatedChartBundle4.getOptionInstrument().getId());
            if (instant2 == null || (nullableImpliedVolatility = optionPricingParams.getNullableImpliedVolatility()) == null) {
                return null;
            }
            arrayList.add(ProfitAndLossChartParams2.toProfitAndLossChartLeg(optionSimulatedChartBundle4, type2, instant2, nullableImpliedVolatility.doubleValue(), optionPricingParams.getInterestRate(), optionPricingParams.getDividendYield()));
        }
        ImmutableList immutableList = extensions2.toImmutableList(arrayList);
        boolean z = optionsProfitAndLossChartDataState4 instanceof OptionsProfitAndLossChartDataState4.PortfolioRiskAnalyzer;
        if (z) {
            money$default = ((OptionsProfitAndLossChartDataState4.PortfolioRiskAnalyzer) optionsProfitAndLossChartDataState4).getOptionOrderPrice();
        } else {
            if (!(optionsProfitAndLossChartDataState4 instanceof OptionsProfitAndLossChartDataState4.PreTrade)) {
                if (optionsProfitAndLossChartDataState4 == null) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal optionStrategyPrice = OptionPrices.getOptionStrategyPrice(list, optionQuotes, ((OptionsProfitAndLossChartDataState4.PreTrade) optionsProfitAndLossChartDataState4).getDefaultPricingSetting());
            if (optionStrategyPrice == null || (money$default = Money3.toMoney$default(optionStrategyPrice, null, 1, null)) == null) {
                return null;
            }
        }
        Money money = money$default;
        Money currentValueInMoney = underlyingQuote.getCurrentValueInMoney();
        if (z) {
            profitLossAtExpiration4 = ProfitLossAtExpiration4.LAST_EXPIRATION;
        } else {
            if (!(optionsProfitAndLossChartDataState4 instanceof OptionsProfitAndLossChartDataState4.PreTrade)) {
                throw new NoWhenBranchMatchedException();
            }
            profitLossAtExpiration4 = ProfitLossAtExpiration4.FIRST_EXPIRATION;
        }
        return new ProfitAndLossChartParams(immutableList, optionSimulatedChartBundle5, 1, money, equityPositionQuantity, equityPositionAverageCost, currentValueInMoney, profitLossAtExpiration4, instant);
    }

    public static final String getMaxProfitOrLossDisplayText(Resources resources, ProfitAndLossLimit profitAndLossLimit) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        ProfitAndLossLimitType type2 = profitAndLossLimit != null ? profitAndLossLimit.getType() : null;
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceDeltaWithHundredthDecimalFormat(), profitAndLossLimit.getProfitOrLoss(), null, 2, null);
            }
            if (i == 2 || i == 3) {
                String string2 = resources.getString(C23151R.string.options_profit_and_loss_unlimited_label);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        String string3 = resources.getString(C11048R.string.general_label_n_a_short);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public static final String getBreakevenDisplayText(Resources resources, final OptionChain.UnderlyingType underlyingType, List<ProfitAndLossPoint> list) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        List<ProfitAndLossPoint> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            String string2 = resources.getString(C11048R.string.general_label_n_a_short);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = resources.getString(C23151R.string.options_profit_and_loss_header_breakeven_separator);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return CollectionsKt.joinToString$default(list, string3, null, null, 0, null, new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartUtilsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitAndLossChartUtils.getBreakevenDisplayText$lambda$11(underlyingType, (ProfitAndLossPoint) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getBreakevenDisplayText$lambda$11(OptionChain.UnderlyingType underlyingType, ProfitAndLossPoint it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return OptionUnderlyings.getUnderlyingNumberFormatter(underlyingType).format(it.getUnderlyingPrice());
    }

    public static final String getShortLabel(double d) {
        double dAbs = Math.abs(d);
        return (d < 0.0d ? "-" : "") + "$" + getDecimalString(dAbs);
    }

    private static final String getDecimalString(double d) {
        String str;
        int i;
        if (d >= 1.0E9d) {
            str = "B";
        } else if (d >= 1000000.0d) {
            str = "M";
        } else if (d >= 1000.0d) {
            str = "K";
        } else {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 66) {
            if (iHashCode != 75) {
                if (iHashCode == 77 && str.equals("M")) {
                    i = InvestFlowConstants.MAX_ONE_TIME_AMOUNT;
                    d /= i;
                }
            } else if (str.equals("K")) {
                i = 1000;
                d /= i;
            }
        } else if (str.equals("B")) {
            i = 1000000000;
            d /= i;
        }
        int i2 = str.length() == 0 ? 2 : 1;
        int i3 = (int) d;
        String strTakeLast = StringsKt.takeLast(String.valueOf((int) (d * Math.pow(10.0d, i2))), i2);
        if (StringsKt.replace$default(strTakeLast, "0", "", false, 4, (Object) null).length() == 0) {
            return i3 + str;
        }
        return i3 + "." + strTakeLast + str;
    }
}
