package com.robinhood.android.trade.options.profitloss.local;

import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import com.robinhood.models.util.Money;
import com.robinhood.utils.math.BigDecimals7;
import com.singular.sdk.internal.Constants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.Instant;

/* compiled from: ProfitAndLossChartGenerator.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aZ\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u001aN\u0010\u0019\u001a\u00020\u001a2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016\u001a<\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\nH\u0002\u001a\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002\u001a\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002\u001a:\u0010+\u001a\u00020,2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000200H\u0002\u001a\u001e\u00102\u001a\u0002032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\n2\u0006\u00104\u001a\u00020\u0001H\u0002\u001a*\u00105\u001a\u0002032\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0002\u001a*\u00106\u001a\u0002072\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0002\u001a0\u00108\u001a\b\u0012\u0004\u0012\u00020\"0\n2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, m3636d2 = {"SAMPLED_POINTS_ON_X_AXIS", "Ljava/math/BigDecimal;", "SAMPLED_POINTS_MINIMUM_INCREMENT", "POINTS_ON_X_AXIS", "MINIMUM_INCREMENT", "MINIMUM_UNDERLYING_PRICE", "MINIMUM_PADDING_EQUITY_MULTIPLIER", "generateProfitAndLossChart", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChart;", "legs", "", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartLeg;", "underlying", "Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;", "quantity", "", "optionOrderPrice", "Lcom/robinhood/models/util/Money;", "equityPositionQuantity", "equityPositionAverageCost", "underlyingPrice", "expirationType", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitLossChartExpirationType;", "evaluationTime", "Lkotlinx/datetime/Instant;", "generateProfitAndLossMetrics", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossMetrics;", "getSortedScanRange", "", "leftXBound", "rightXBound", "pointsOnXAxis", "minimumIncrement", "pricesOfInterest", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossPoint;", "getPointsOfInterest", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossPointsOfInterest;", "profitLossAtExp", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitLossAtExpiration;", "generateLimit", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimits;", "pnlFunction", "Lcom/robinhood/android/trade/options/profitloss/local/PiecewiseLinearFunction;", "generateMaxProfitAndLoss", "Lcom/robinhood/android/trade/options/profitloss/local/MaxProfitAndLossLimits;", "Lkotlin/Function1;", "underlyingPrices", "leftLimit", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;", "rightLimit", "generateXBounds", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossBounds;", "underlyingInstrumentQuote", "generateYBounds", "generateSparklinesAndAreas", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossSparklinesAndAreas;", "generateSampledPoints", "feature-options-pl-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartGeneratorKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ProfitAndLossChartGenerator {
    private static final BigDecimal SAMPLED_POINTS_ON_X_AXIS = new BigDecimal("300");
    private static final BigDecimal SAMPLED_POINTS_MINIMUM_INCREMENT = new BigDecimal("0.01");
    private static final BigDecimal POINTS_ON_X_AXIS = new BigDecimal("50");
    private static final BigDecimal MINIMUM_INCREMENT = new BigDecimal("0.1");
    private static final BigDecimal MINIMUM_UNDERLYING_PRICE = new BigDecimal("0.01");
    private static final BigDecimal MINIMUM_PADDING_EQUITY_MULTIPLIER = new BigDecimal("0.02");

    /* compiled from: ProfitAndLossChartGenerator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartGeneratorKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfitAndLossLimitType.values().length];
            try {
                iArr[ProfitAndLossLimitType.LIMIT_POSITIVE_INFINITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfitAndLossLimitType.LIMIT_NEGATIVE_INFINITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ProfitAndLossChart generateProfitAndLossChart(List<ProfitAndLossChartLeg> legs, OptionSimulatedChartBundle5 optionSimulatedChartBundle5, int i, Money optionOrderPrice, BigDecimal equityPositionQuantity, BigDecimal equityPositionAverageCost, Money underlyingPrice, ProfitLossAtExpiration4 expirationType, Instant instant) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(optionOrderPrice, "optionOrderPrice");
        Intrinsics.checkNotNullParameter(equityPositionQuantity, "equityPositionQuantity");
        Intrinsics.checkNotNullParameter(equityPositionAverageCost, "equityPositionAverageCost");
        Intrinsics.checkNotNullParameter(underlyingPrice, "underlyingPrice");
        Intrinsics.checkNotNullParameter(expirationType, "expirationType");
        if (optionSimulatedChartBundle5 == null) {
            throw new IllegalStateException(ProfitAndLossChartError.UNDERLYING_INSTRUMENT.getMessage().toString());
        }
        BigDecimal decimalValue = underlyingPrice.getDecimalValue();
        ProfitLossAtExpiration profitLossAtExpiration = new ProfitLossAtExpiration(legs, i, optionOrderPrice.getDecimalValue(), equityPositionQuantity, equityPositionAverageCost, expirationType, instant);
        PiecewiseLinearFunction piecewiseLinearPnlFunction = profitLossAtExpiration.getPiecewiseLinearPnlFunction();
        ProfitAndLossChartGenerator2 profitAndLossChartGenerator2 = new ProfitAndLossChartGenerator2(profitLossAtExpiration);
        ProfitAndLossPointsOfInterest pointsOfInterest = getPointsOfInterest(profitLossAtExpiration);
        List<ProfitAndLossPoint> listComponent1 = pointsOfInterest.component1();
        List<ProfitAndLossPoint> listComponent2 = pointsOfInterest.component2();
        ProfitAndLossLimits profitAndLossLimitsGenerateLimit = generateLimit(piecewiseLinearPnlFunction);
        ProfitAndLossLimit leftLimit = profitAndLossLimitsGenerateLimit.getLeftLimit();
        ProfitAndLossLimit rightLimit = profitAndLossLimitsGenerateLimit.getRightLimit();
        ProfitAndLossBounds profitAndLossBoundsGenerateXBounds = generateXBounds(getPointsOfInterest(new ProfitLossAtExpiration(legs, i, optionOrderPrice.getDecimalValue(), equityPositionQuantity, equityPositionAverageCost, expirationType, null)).getPricesOfInterest(), decimalValue);
        BigDecimal lowerBound = profitAndLossBoundsGenerateXBounds.getLowerBound();
        BigDecimal upperBound = profitAndLossBoundsGenerateXBounds.getUpperBound();
        List<BigDecimal> sortedScanRange = getSortedScanRange(lowerBound, upperBound, SAMPLED_POINTS_ON_X_AXIS, SAMPLED_POINTS_MINIMUM_INCREMENT, listComponent1);
        if (legs.isEmpty()) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (equityPositionQuantity.compareTo(bigDecimal) == 0) {
                ProfitAndLossLimit profitAndLossLimit = new ProfitAndLossLimit(ProfitAndLossLimitType.LIMIT_FINITE, bigDecimal);
                List<ProfitAndLossPoint> listGenerateSampledPoints = generateSampledPoints(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartGeneratorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProfitAndLossChartGenerator.generateProfitAndLossChart$lambda$0((BigDecimal) obj);
                    }
                }, sortedScanRange);
                List listEmptyList = CollectionsKt.emptyList();
                List listEmptyList2 = CollectionsKt.emptyList();
                List listEmptyList3 = CollectionsKt.emptyList();
                List listEmptyList4 = CollectionsKt.emptyList();
                List listEmptyList5 = CollectionsKt.emptyList();
                List listEmptyList6 = CollectionsKt.emptyList();
                BigDecimal bigDecimalNegate = new BigDecimal("150").negate();
                Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
                return new ProfitAndLossChart(listGenerateSampledPoints, listEmptyList, listEmptyList2, listEmptyList3, listEmptyList4, listEmptyList5, listEmptyList6, lowerBound, upperBound, bigDecimalNegate, new BigDecimal("150"), profitAndLossLimit, profitAndLossLimit, profitAndLossLimit, profitAndLossLimit);
            }
        }
        if (profitLossAtExpiration.getRequiresPricingModel()) {
            List<BigDecimal> sortedScanRange2 = getSortedScanRange(lowerBound, upperBound, POINTS_ON_X_AXIS, MINIMUM_INCREMENT, listComponent1);
            ProfitAndLossLimit profitAndLossLimit2 = new ProfitAndLossLimit(ProfitAndLossLimitType.LIMIT_FINITE, profitAndLossChartGenerator2.invoke((ProfitAndLossChartGenerator2) MINIMUM_UNDERLYING_PRICE));
            MaxProfitAndLossLimits maxProfitAndLossLimitsGenerateMaxProfitAndLoss = generateMaxProfitAndLoss(profitAndLossChartGenerator2, sortedScanRange2, leftLimit, rightLimit);
            ProfitAndLossLimit maxProfit = maxProfitAndLossLimitsGenerateMaxProfitAndLoss.getMaxProfit();
            ProfitAndLossLimit maxLoss = maxProfitAndLossLimitsGenerateMaxProfitAndLoss.getMaxLoss();
            ProfitAndLossBounds profitAndLossBoundsGenerateYBounds = generateYBounds(profitAndLossChartGenerator2, sortedScanRange2);
            BigDecimal lowerBound2 = profitAndLossBoundsGenerateYBounds.getLowerBound();
            BigDecimal upperBound2 = profitAndLossBoundsGenerateYBounds.getUpperBound();
            ProfitAndLossSparklinesAndAreas profitAndLossSparklinesAndAreasGenerateSparklinesAndAreas = generateSparklinesAndAreas(profitAndLossChartGenerator2, sortedScanRange2);
            return new ProfitAndLossChart(generateSampledPoints(profitAndLossChartGenerator2, sortedScanRange), listComponent1, listComponent2, profitAndLossSparklinesAndAreasGenerateSparklinesAndAreas.component1(), profitAndLossSparklinesAndAreasGenerateSparklinesAndAreas.component2(), profitAndLossSparklinesAndAreasGenerateSparklinesAndAreas.component3(), profitAndLossSparklinesAndAreasGenerateSparklinesAndAreas.component4(), lowerBound, upperBound, lowerBound2, upperBound2, profitAndLossLimit2, rightLimit, maxProfit, maxLoss);
        }
        ProfitAndLossBounds profitAndLossBoundsGenerateYBounds2 = generateYBounds(new C298732(piecewiseLinearPnlFunction), CollectionsKt.plus((Collection) piecewiseLinearPnlFunction.getXValues(), (Iterable) CollectionsKt.listOf((Object[]) new BigDecimal[]{lowerBound, upperBound})));
        BigDecimal lowerBound3 = profitAndLossBoundsGenerateYBounds2.getLowerBound();
        BigDecimal upperBound3 = profitAndLossBoundsGenerateYBounds2.getUpperBound();
        MaxProfitAndLossLimits maxProfitAndLossLimitsGenerateMaxProfitAndLoss2 = generateMaxProfitAndLoss(new C298743(piecewiseLinearPnlFunction), CollectionsKt.plus((Collection) piecewiseLinearPnlFunction.getXValues(), (Iterable) CollectionsKt.listOf(BigDecimal.ZERO)), leftLimit, rightLimit);
        ProfitAndLossLimit maxProfit2 = maxProfitAndLossLimitsGenerateMaxProfitAndLoss2.getMaxProfit();
        ProfitAndLossLimit maxLoss2 = maxProfitAndLossLimitsGenerateMaxProfitAndLoss2.getMaxLoss();
        C298754 c298754 = new C298754(piecewiseLinearPnlFunction);
        List listPlus = CollectionsKt.plus((Collection) piecewiseLinearPnlFunction.getXValues(), (Iterable) CollectionsKt.listOf((Object[]) new BigDecimal[]{lowerBound, upperBound}));
        List<ProfitAndLossPoint> list = listComponent2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProfitAndLossPoint) it.next()).getUnderlyingPrice());
        }
        ProfitAndLossSparklinesAndAreas profitAndLossSparklinesAndAreasGenerateSparklinesAndAreas2 = generateSparklinesAndAreas(c298754, CollectionsKt.sorted(ProfitAndLossUtils.bigDecimalDistinct(CollectionsKt.plus((Collection) listPlus, (Iterable) arrayList))));
        return new ProfitAndLossChart(generateSampledPoints(new ProfitAndLossChartGenerator3(piecewiseLinearPnlFunction), sortedScanRange), listComponent1, listComponent2, profitAndLossSparklinesAndAreasGenerateSparklinesAndAreas2.component1(), profitAndLossSparklinesAndAreasGenerateSparklinesAndAreas2.component2(), profitAndLossSparklinesAndAreasGenerateSparklinesAndAreas2.component3(), profitAndLossSparklinesAndAreasGenerateSparklinesAndAreas2.component4(), lowerBound, upperBound, lowerBound3, upperBound3, leftLimit, rightLimit, maxProfit2, maxLoss2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal generateProfitAndLossChart$lambda$0(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<unused var>");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    /* compiled from: ProfitAndLossChartGenerator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartGeneratorKt$generateProfitAndLossChart$2 */
    /* synthetic */ class C298732 extends FunctionReferenceImpl implements Function1<BigDecimal, BigDecimal> {
        C298732(Object obj) {
            super(1, obj, PiecewiseLinearFunction.class, "invoke", "invoke(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final BigDecimal invoke(BigDecimal p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((PiecewiseLinearFunction) this.receiver).invoke(p0);
        }
    }

    /* compiled from: ProfitAndLossChartGenerator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartGeneratorKt$generateProfitAndLossChart$3 */
    /* synthetic */ class C298743 extends FunctionReferenceImpl implements Function1<BigDecimal, BigDecimal> {
        C298743(Object obj) {
            super(1, obj, PiecewiseLinearFunction.class, "invoke", "invoke(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final BigDecimal invoke(BigDecimal p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((PiecewiseLinearFunction) this.receiver).invoke(p0);
        }
    }

    /* compiled from: ProfitAndLossChartGenerator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartGeneratorKt$generateProfitAndLossChart$4 */
    /* synthetic */ class C298754 extends FunctionReferenceImpl implements Function1<BigDecimal, BigDecimal> {
        C298754(Object obj) {
            super(1, obj, PiecewiseLinearFunction.class, "invoke", "invoke(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final BigDecimal invoke(BigDecimal p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((PiecewiseLinearFunction) this.receiver).invoke(p0);
        }
    }

    public static final ProfitAndLossMetrics generateProfitAndLossMetrics(List<ProfitAndLossChartLeg> legs, OptionSimulatedChartBundle5 optionSimulatedChartBundle5, int i, Money optionOrderPrice, BigDecimal equityPositionQuantity, BigDecimal equityPositionAverageCost, Money underlyingPrice, ProfitLossAtExpiration4 expirationType) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(optionOrderPrice, "optionOrderPrice");
        Intrinsics.checkNotNullParameter(equityPositionQuantity, "equityPositionQuantity");
        Intrinsics.checkNotNullParameter(equityPositionAverageCost, "equityPositionAverageCost");
        Intrinsics.checkNotNullParameter(underlyingPrice, "underlyingPrice");
        Intrinsics.checkNotNullParameter(expirationType, "expirationType");
        if (optionSimulatedChartBundle5 == null) {
            throw new IllegalStateException(ProfitAndLossChartError.UNDERLYING_INSTRUMENT.getMessage().toString());
        }
        BigDecimal decimalValue = underlyingPrice.getDecimalValue();
        ProfitLossAtExpiration profitLossAtExpiration = new ProfitLossAtExpiration(legs, i, optionOrderPrice.getDecimalValue(), equityPositionQuantity, equityPositionAverageCost, expirationType, null);
        PiecewiseLinearFunction piecewiseLinearPnlFunction = profitLossAtExpiration.getPiecewiseLinearPnlFunction();
        ProfitAndLossChartGenerator4 profitAndLossChartGenerator4 = new ProfitAndLossChartGenerator4(profitLossAtExpiration);
        ProfitAndLossPointsOfInterest pointsOfInterest = getPointsOfInterest(profitLossAtExpiration);
        List<ProfitAndLossPoint> listComponent1 = pointsOfInterest.component1();
        List<ProfitAndLossPoint> listComponent2 = pointsOfInterest.component2();
        ProfitAndLossLimits profitAndLossLimitsGenerateLimit = generateLimit(piecewiseLinearPnlFunction);
        ProfitAndLossLimit leftLimit = profitAndLossLimitsGenerateLimit.getLeftLimit();
        ProfitAndLossLimit rightLimit = profitAndLossLimitsGenerateLimit.getRightLimit();
        ProfitAndLossBounds profitAndLossBoundsGenerateXBounds = generateXBounds(listComponent1, decimalValue);
        BigDecimal lowerBound = profitAndLossBoundsGenerateXBounds.getLowerBound();
        BigDecimal upperBound = profitAndLossBoundsGenerateXBounds.getUpperBound();
        if (profitLossAtExpiration.getRequiresPricingModel()) {
            MaxProfitAndLossLimits maxProfitAndLossLimitsGenerateMaxProfitAndLoss = generateMaxProfitAndLoss(profitAndLossChartGenerator4, getSortedScanRange(lowerBound, upperBound, POINTS_ON_X_AXIS, MINIMUM_INCREMENT, listComponent1), leftLimit, rightLimit);
            return new ProfitAndLossMetrics(listComponent2, maxProfitAndLossLimitsGenerateMaxProfitAndLoss.getMaxProfit(), maxProfitAndLossLimitsGenerateMaxProfitAndLoss.getMaxLoss());
        }
        MaxProfitAndLossLimits maxProfitAndLossLimitsGenerateMaxProfitAndLoss2 = generateMaxProfitAndLoss(new C298781(piecewiseLinearPnlFunction), CollectionsKt.plus((Collection) piecewiseLinearPnlFunction.getXValues(), (Iterable) CollectionsKt.listOf(BigDecimal.ZERO)), leftLimit, rightLimit);
        return new ProfitAndLossMetrics(listComponent2, maxProfitAndLossLimitsGenerateMaxProfitAndLoss2.getMaxProfit(), maxProfitAndLossLimitsGenerateMaxProfitAndLoss2.getMaxLoss());
    }

    /* compiled from: ProfitAndLossChartGenerator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartGeneratorKt$generateProfitAndLossMetrics$1 */
    /* synthetic */ class C298781 extends FunctionReferenceImpl implements Function1<BigDecimal, BigDecimal> {
        C298781(Object obj) {
            super(1, obj, PiecewiseLinearFunction.class, "invoke", "invoke(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final BigDecimal invoke(BigDecimal p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((PiecewiseLinearFunction) this.receiver).invoke(p0);
        }
    }

    private static final List<BigDecimal> getSortedScanRange(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, List<ProfitAndLossPoint> list) {
        ArrayList arrayList = new ArrayList();
        BigDecimal bigDecimalSubtract = bigDecimal2.subtract(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimal5 = (BigDecimal) ComparisonsKt.maxOf(ProfitAndLossUtils.equityPriceQuantization(BigDecimals7.safeDivide$default(bigDecimalSubtract, bigDecimal3, 8, null, 4, null)), bigDecimal4);
        BigDecimal bigDecimalAdd = bigDecimal;
        while (bigDecimalAdd.compareTo(bigDecimal2) <= 0) {
            arrayList.add(bigDecimalAdd);
            bigDecimalAdd = bigDecimalAdd.add(bigDecimal5);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        List<ProfitAndLossPoint> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ProfitAndLossPoint) it.next()).getUnderlyingPrice());
        }
        arrayList.addAll(arrayList2);
        arrayList.add(bigDecimal);
        arrayList.add(bigDecimal2);
        return CollectionsKt.toMutableList((Collection) CollectionsKt.sorted(ProfitAndLossUtils.bigDecimalDistinct(arrayList)));
    }

    private static final ProfitAndLossPointsOfInterest getPointsOfInterest(ProfitLossAtExpiration profitLossAtExpiration) {
        List<BigDecimal> listPricesOfInterest = profitLossAtExpiration.pricesOfInterest();
        List<BigDecimal> listBreakevenPrices = profitLossAtExpiration.breakevenPrices();
        List<BigDecimal> list = listPricesOfInterest;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (BigDecimal bigDecimal : list) {
            arrayList.add(new ProfitAndLossPoint(bigDecimal, profitLossAtExpiration.pnlFunction(bigDecimal)));
        }
        List<BigDecimal> list2 = listBreakevenPrices;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (BigDecimal bigDecimal2 : list2) {
            arrayList2.add(new ProfitAndLossPoint(bigDecimal2, profitLossAtExpiration.pnlFunction(bigDecimal2)));
        }
        return new ProfitAndLossPointsOfInterest(arrayList, arrayList2);
    }

    private static final ProfitAndLossLimits generateLimit(PiecewiseLinearFunction piecewiseLinearFunction) {
        ProfitAndLossLimit profitAndLossLimit;
        BigDecimal bigDecimal = (BigDecimal) CollectionsKt.last((List) piecewiseLinearFunction.getSlopes());
        BigDecimal ZERO = BigDecimal.ZERO;
        if (bigDecimal.compareTo(ZERO) == 0) {
            profitAndLossLimit = new ProfitAndLossLimit(ProfitAndLossLimitType.LIMIT_FINITE, (BigDecimal) CollectionsKt.last((List) piecewiseLinearFunction.getYValues()));
        } else if (((BigDecimal) CollectionsKt.last((List) piecewiseLinearFunction.getSlopes())).compareTo(ZERO) > 0) {
            profitAndLossLimit = new ProfitAndLossLimit(ProfitAndLossLimitType.LIMIT_POSITIVE_INFINITY, null, 2, null);
        } else {
            profitAndLossLimit = new ProfitAndLossLimit(ProfitAndLossLimitType.LIMIT_NEGATIVE_INFINITY, null, 2, null);
        }
        ProfitAndLossLimitType profitAndLossLimitType = ProfitAndLossLimitType.LIMIT_FINITE;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return new ProfitAndLossLimits(new ProfitAndLossLimit(profitAndLossLimitType, piecewiseLinearFunction.invoke(ZERO)), profitAndLossLimit);
    }

    private static final MaxProfitAndLossLimits generateMaxProfitAndLoss(Function1<? super BigDecimal, ? extends BigDecimal> function1, List<? extends BigDecimal> list, ProfitAndLossLimit profitAndLossLimit, ProfitAndLossLimit profitAndLossLimit2) {
        List<? extends BigDecimal> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke((BigDecimal) it.next()));
        }
        ProfitAndLossLimitType profitAndLossLimitType = ProfitAndLossLimitType.LIMIT_FINITE;
        ProfitAndLossLimit profitAndLossLimit3 = new ProfitAndLossLimit(profitAndLossLimitType, (BigDecimal) CollectionsKt.maxOrNull((Iterable) arrayList));
        ProfitAndLossLimit profitAndLossLimit4 = new ProfitAndLossLimit(profitAndLossLimitType, (BigDecimal) CollectionsKt.minOrNull((Iterable) arrayList));
        for (ProfitAndLossLimit profitAndLossLimit5 : CollectionsKt.listOf((Object[]) new ProfitAndLossLimit[]{profitAndLossLimit, profitAndLossLimit2})) {
            int i = WhenMappings.$EnumSwitchMapping$0[profitAndLossLimit5.getType().ordinal()];
            if (i == 1) {
                profitAndLossLimit3 = new ProfitAndLossLimit(ProfitAndLossLimitType.LIMIT_POSITIVE_INFINITY, null, 2, null);
            } else if (i == 2) {
                profitAndLossLimit4 = new ProfitAndLossLimit(ProfitAndLossLimitType.LIMIT_NEGATIVE_INFINITY, null, 2, null);
            } else {
                if (profitAndLossLimit5.getProfitOrLoss() == null) {
                    throw new IllegalStateException(("left or right limit: " + profitAndLossLimit5 + " profit or loss is null").toString());
                }
                if (profitAndLossLimit3.getProfitOrLoss() == null) {
                    throw new IllegalStateException("max profit is null");
                }
                if (profitAndLossLimit4.getProfitOrLoss() == null) {
                    throw new IllegalStateException("max loss is null");
                }
                if (profitAndLossLimit5.getProfitOrLoss().compareTo(profitAndLossLimit3.getProfitOrLoss()) > 0) {
                    profitAndLossLimit3 = ProfitAndLossLimit.copy$default(profitAndLossLimit3, null, profitAndLossLimit5.getProfitOrLoss(), 1, null);
                }
                if (profitAndLossLimit5.getProfitOrLoss().compareTo(profitAndLossLimit4.getProfitOrLoss()) < 0) {
                    profitAndLossLimit4 = ProfitAndLossLimit.copy$default(profitAndLossLimit4, null, profitAndLossLimit5.getProfitOrLoss(), 1, null);
                }
            }
        }
        ProfitAndLossLimitType type2 = profitAndLossLimit3.getType();
        ProfitAndLossLimitType profitAndLossLimitType2 = ProfitAndLossLimitType.LIMIT_FINITE;
        if (type2 == profitAndLossLimitType2) {
            BigDecimal profitOrLoss = profitAndLossLimit3.getProfitOrLoss();
            if (profitOrLoss == null) {
                throw new IllegalStateException("max profit is null");
            }
            if (profitOrLoss.compareTo(BigDecimal.ZERO) < 0) {
                profitAndLossLimit3 = new ProfitAndLossLimit(ProfitAndLossLimitType.LIMIT_UNAVAILABLE, null, 2, null);
            }
        }
        if (profitAndLossLimit4.getType() == profitAndLossLimitType2) {
            BigDecimal profitOrLoss2 = profitAndLossLimit4.getProfitOrLoss();
            if (profitOrLoss2 == null) {
                throw new IllegalStateException("max loss is null");
            }
            if (profitOrLoss2.compareTo(BigDecimal.ZERO) > 0) {
                profitAndLossLimit4 = new ProfitAndLossLimit(ProfitAndLossLimitType.LIMIT_UNAVAILABLE, null, 2, null);
            }
        }
        return new MaxProfitAndLossLimits(profitAndLossLimit3, profitAndLossLimit4);
    }

    private static final ProfitAndLossBounds generateXBounds(List<ProfitAndLossPoint> list, BigDecimal bigDecimal) {
        List<ProfitAndLossPoint> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProfitAndLossPoint) it.next()).getUnderlyingPrice());
        }
        List listPlus = CollectionsKt.plus((Collection<? extends BigDecimal>) arrayList, bigDecimal);
        BigDecimal bigDecimal2 = (BigDecimal) CollectionsKt.minOrNull((Iterable) listPlus);
        if (bigDecimal2 == null) {
            throw new IllegalStateException("empty underlying prices");
        }
        BigDecimal bigDecimal3 = (BigDecimal) CollectionsKt.maxOrNull((Iterable) listPlus);
        if (bigDecimal3 == null) {
            throw new IllegalStateException("empty underlying prices");
        }
        BigDecimal bigDecimalAdd = BigDecimals7.safeDivide$default(bigDecimal2, new BigDecimal(Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED), 8, null, 4, null).add(BigDecimals7.safeDivide$default(bigDecimal3, new BigDecimal(Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED), 8, null, 4, null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        BigDecimal bigDecimalSubtract = bigDecimalAdd.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(MINIMUM_PADDING_EQUITY_MULTIPLIER);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimal4 = (BigDecimal) ComparisonsKt.maxOf(bigDecimalSubtract, bigDecimalMultiply);
        BigDecimal bigDecimalSubtract2 = bigDecimal2.subtract(bigDecimal4);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        BigDecimal bigDecimal5 = (BigDecimal) ComparisonsKt.maxOf(ProfitAndLossUtils.equityPriceQuantization(bigDecimalSubtract2), MINIMUM_UNDERLYING_PRICE);
        BigDecimal bigDecimalAdd2 = bigDecimal3.add(bigDecimal4);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
        return new ProfitAndLossBounds(bigDecimal5, ProfitAndLossUtils.equityPriceQuantization(bigDecimalAdd2));
    }

    private static final ProfitAndLossBounds generateYBounds(Function1<? super BigDecimal, ? extends BigDecimal> function1, List<? extends BigDecimal> list) {
        List<? extends BigDecimal> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke((BigDecimal) it.next()).abs());
        }
        BigDecimal bigDecimal = (BigDecimal) CollectionsKt.maxOrNull((Iterable) arrayList);
        if (bigDecimal == null) {
            throw new IllegalStateException("empty underlying prices");
        }
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(new BigDecimal("-1.3"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalMultiply2 = bigDecimal.multiply(new BigDecimal("1.3"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        return new ProfitAndLossBounds(bigDecimalMultiply, bigDecimalMultiply2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final ProfitAndLossSparklinesAndAreas generateSparklinesAndAreas(Function1<? super BigDecimal, ? extends BigDecimal> function1, List<? extends BigDecimal> list) {
        BigDecimal ZERO;
        int i;
        ArrayList arrayListMutableListOf;
        ProfitAndLossChartGenerator5 profitAndLossChartGenerator5;
        boolean z;
        List<? extends BigDecimal> list2 = list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ProfitAndLossChartGenerator5 profitAndLossChartGenerator52 = ProfitAndLossChartGenerator5.UNSET;
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            boolean z2 = i2 == 0;
            boolean z3 = i2 == list2.size() - 1;
            BigDecimal bigDecimal = list2.get(i2);
            BigDecimal bigDecimalInvoke = function1.invoke(bigDecimal);
            boolean z4 = bigDecimalInvoke.abs().compareTo(ProfitAndLossUtils.getOPTION_QUANTIZE_UNIT_MULTI_LEG()) < 0;
            if (z4) {
                ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            } else {
                ZERO = bigDecimalInvoke;
            }
            ArrayList arrayList7 = arrayList6;
            ProfitAndLossPoint profitAndLossPoint = new ProfitAndLossPoint(bigDecimal, ZERO);
            if (z2) {
                i = size;
                BigDecimal ZERO2 = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                arrayListMutableListOf = CollectionsKt.mutableListOf(new ProfitAndLossPoint(bigDecimal, ZERO2));
            } else {
                i = size;
                arrayListMutableListOf = arrayList7;
            }
            ProfitAndLossChartGenerator5 profitAndLossChartGenerator53 = z4 ? ProfitAndLossChartGenerator5.UNSET : ZERO.compareTo(BigDecimal.ZERO) > 0 ? ProfitAndLossChartGenerator5.POSITIVE : ProfitAndLossChartGenerator5.NEGATIVE;
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            int i3 = i2;
            ProfitAndLossChartGenerator5 profitAndLossChartGenerator54 = ProfitAndLossChartGenerator5.UNSET;
            if (profitAndLossChartGenerator53 == profitAndLossChartGenerator54) {
                arrayList5.add(profitAndLossPoint);
                arrayList8.add(profitAndLossPoint);
                arrayListMutableListOf.add(profitAndLossPoint);
                arrayList9.add(profitAndLossPoint);
                profitAndLossChartGenerator5 = profitAndLossChartGenerator53;
            } else if (profitAndLossChartGenerator52 == profitAndLossChartGenerator54 || profitAndLossChartGenerator52 == profitAndLossChartGenerator53) {
                profitAndLossChartGenerator5 = profitAndLossChartGenerator53;
                arrayList5.add(profitAndLossPoint);
                arrayListMutableListOf.add(profitAndLossPoint);
                z = z3;
                if (z || arrayList5.isEmpty()) {
                    arrayList6 = arrayListMutableListOf;
                } else {
                    if (z3) {
                        BigDecimal ZERO3 = BigDecimal.ZERO;
                        Intrinsics.checkNotNullExpressionValue(ZERO3, "ZERO");
                        arrayListMutableListOf.add(new ProfitAndLossPoint(bigDecimal, ZERO3));
                        profitAndLossChartGenerator52 = profitAndLossChartGenerator5;
                    }
                    if (profitAndLossChartGenerator52 == ProfitAndLossChartGenerator5.POSITIVE) {
                        arrayList3.add(CollectionsKt.toList(arrayList5));
                        arrayList.add(CollectionsKt.toList(arrayListMutableListOf));
                    } else {
                        arrayList4.add(CollectionsKt.toList(arrayList5));
                        arrayList2.add(CollectionsKt.toList(arrayListMutableListOf));
                    }
                    arrayList5 = arrayList8;
                    arrayList6 = arrayList9;
                }
                i2 = i3 + 1;
                list2 = list;
                size = i;
                profitAndLossChartGenerator52 = profitAndLossChartGenerator5;
            } else {
                arrayList8.add(profitAndLossPoint);
                profitAndLossChartGenerator5 = profitAndLossChartGenerator53;
                BigDecimal ZERO4 = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO4, "ZERO");
                arrayListMutableListOf.add(new ProfitAndLossPoint(bigDecimal, ZERO4));
                Intrinsics.checkNotNullExpressionValue(ZERO4, "ZERO");
                arrayList9.add(new ProfitAndLossPoint(bigDecimal, ZERO4));
                arrayList9.add(profitAndLossPoint);
            }
            z = true;
            if (z) {
                arrayList6 = arrayListMutableListOf;
            }
            i2 = i3 + 1;
            list2 = list;
            size = i;
            profitAndLossChartGenerator52 = profitAndLossChartGenerator5;
        }
        ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList10.add(new ProfitAndLossSegment((List) it.next(), "linear"));
        }
        ArrayList arrayList11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList11.add(new ProfitAndLossSegment((List) it2.next(), "linear"));
        }
        ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList12.add(CollectionsKt.listOf(new ProfitAndLossSegment((List) it3.next(), "linear")));
        }
        ArrayList arrayList13 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList13.add(CollectionsKt.listOf(new ProfitAndLossSegment((List) it4.next(), "linear")));
        }
        return new ProfitAndLossSparklinesAndAreas(arrayList10, arrayList11, arrayList12, arrayList13);
    }

    private static final List<ProfitAndLossPoint> generateSampledPoints(Function1<? super BigDecimal, ? extends BigDecimal> function1, List<? extends BigDecimal> list) {
        List<? extends BigDecimal> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (BigDecimal bigDecimal : list2) {
            arrayList.add(new ProfitAndLossPoint(bigDecimal, function1.invoke(bigDecimal)));
        }
        return arrayList;
    }
}
