package com.robinhood.android.trade.options.profitloss.local;

import com.robinhood.models.p320db.OptionChain;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.Instant;

/* compiled from: ProfitLossAtExpiration.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bJ\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0003J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0003J\u0016\u0010&\u001a\u00020\u00172\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002JD\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001f2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001fH\u0002J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010!\u001a\u00020\u001bH\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001f0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001f0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/ProfitLossAtExpiration;", "", "legs", "", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartLeg;", "quantity", "", "optionOrderCost", "Ljava/math/BigDecimal;", "equityPositionQuantity", "equityPositionAverageCost", "expirationType", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitLossChartExpirationType;", "passedInEvaluationTime", "Lkotlinx/datetime/Instant;", "<init>", "(Ljava/util/List;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/android/trade/options/profitloss/local/ProfitLossChartExpirationType;Lkotlinx/datetime/Instant;)V", "getLegs", "()Ljava/util/List;", "getEquityPositionQuantity", "()Ljava/math/BigDecimal;", "getEquityPositionAverageCost", "requiresPricingModel", "", "getRequiresPricingModel", "()Z", "piecewiseLinearPnlFunction", "Lcom/robinhood/android/trade/options/profitloss/local/PiecewiseLinearFunction;", "getPiecewiseLinearPnlFunction", "()Lcom/robinhood/android/trade/options/profitloss/local/PiecewiseLinearFunction;", "pnlFunctionsForLeg", "Lkotlin/Function1;", "pnlDerivativeFunctionsForLeg", "pnlFunction", "x", "pnlDerivativeFunction", "breakevenPrices", "pricesOfInterest", "doesRequirePricingModel", "getBreakevensFromNonLinearFunction", "nonLinearFunction", "nonLinearDerivativeFunction", "getBreakevensFromPiecewiseLinearFunction", "Companion", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ProfitLossAtExpiration {
    private static final int DAYS_IN_YEAR = 365;
    private static final int NEWTONS_METHOD_ITERATION_COUNT = 20;
    private final BigDecimal equityPositionAverageCost;
    private final BigDecimal equityPositionQuantity;
    private final List<ProfitAndLossChartLeg> legs;
    private final Instant passedInEvaluationTime;
    private final PiecewiseLinearFunction piecewiseLinearPnlFunction;
    private final List<Function1<BigDecimal, BigDecimal>> pnlDerivativeFunctionsForLeg;
    private final List<Function1<BigDecimal, BigDecimal>> pnlFunctionsForLeg;
    private final boolean requiresPricingModel;
    public static final int $stable = 8;
    private static final BigDecimal NEWTONS_METHOD_MINIMUM_INCREMENT = new BigDecimal("0.1");

    /* compiled from: ProfitLossAtExpiration.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfitLossAtExpiration4.values().length];
            try {
                iArr[ProfitLossAtExpiration4.FIRST_EXPIRATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfitLossAtExpiration4.LAST_EXPIRATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProfitLossAtExpiration(List<ProfitAndLossChartLeg> legs, int i, BigDecimal optionOrderCost, BigDecimal equityPositionQuantity, BigDecimal equityPositionAverageCost, ProfitLossAtExpiration4 expirationType, Instant instant) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(optionOrderCost, "optionOrderCost");
        Intrinsics.checkNotNullParameter(equityPositionQuantity, "equityPositionQuantity");
        Intrinsics.checkNotNullParameter(equityPositionAverageCost, "equityPositionAverageCost");
        Intrinsics.checkNotNullParameter(expirationType, "expirationType");
        this.legs = legs;
        this.equityPositionQuantity = equityPositionQuantity;
        this.equityPositionAverageCost = equityPositionAverageCost;
        this.passedInEvaluationTime = instant;
        this.requiresPricingModel = doesRequirePricingModel(legs);
        List<ProfitAndLossChartLeg> list = legs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ProfitAndLossChartLeg profitAndLossChartLeg : list) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            arrayList.add(profitAndLossChartLeg.toPiecewiseLinearFunction(ZERO, i));
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (this.requiresPricingModel) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[expirationType.ordinal()];
            Instant expirationTime = null;
            if (i2 == 1) {
                Iterator<T> it = this.legs.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        Instant expirationTime2 = ((ProfitAndLossChartLeg) next).getExpirationTime();
                        do {
                            Object next3 = it.next();
                            Instant expirationTime3 = ((ProfitAndLossChartLeg) next3).getExpirationTime();
                            if (expirationTime2.compareTo(expirationTime3) > 0) {
                                next = next3;
                                expirationTime2 = expirationTime3;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                if (next != null) {
                    expirationTime = ((ProfitAndLossChartLeg) next).getExpirationTime();
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator<T> it2 = this.legs.iterator();
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (it2.hasNext()) {
                        Instant expirationTime4 = ((ProfitAndLossChartLeg) next2).getExpirationTime();
                        do {
                            Object next4 = it2.next();
                            Instant expirationTime5 = ((ProfitAndLossChartLeg) next4).getExpirationTime();
                            if (expirationTime4.compareTo(expirationTime5) < 0) {
                                next2 = next4;
                                expirationTime4 = expirationTime5;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next2 = null;
                }
                if (next2 != null) {
                    expirationTime = ((ProfitAndLossChartLeg) next2).getExpirationTime();
                }
            }
            Instant instant2 = this.passedInEvaluationTime;
            if (instant2 != null) {
                expirationTime = instant2;
            } else if (expirationTime == null) {
                expirationTime = Instant.INSTANCE.getDISTANT_FUTURE();
            }
            for (ProfitAndLossChartLeg profitAndLossChartLeg2 : this.legs) {
                if (profitAndLossChartLeg2.getExpirationTime().compareTo(expirationTime) <= 0) {
                    BigDecimal ZERO2 = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                    arrayList2.add(new ProfitLossAtExpiration2(profitAndLossChartLeg2.toPiecewiseLinearFunction(ZERO2, i)));
                    arrayList3.add(profitAndLossChartLeg2.toPiecewiseLinearDerivativeFunction(i));
                } else {
                    arrayList2.add(profitAndLossChartLeg2.toTheoreticalPriceFunction(i, expirationTime));
                    arrayList3.add(profitAndLossChartLeg2.toTheoreticalPriceDerivativeFunction(i, expirationTime));
                }
            }
        } else {
            List<ProfitAndLossChartLeg> list2 = this.legs;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (ProfitAndLossChartLeg profitAndLossChartLeg3 : list2) {
                BigDecimal ZERO3 = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO3, "ZERO");
                arrayList4.add(new ProfitLossAtExpiration3(profitAndLossChartLeg3.toPiecewiseLinearFunction(ZERO3, i)));
            }
            arrayList2.addAll(arrayList4);
            List<ProfitAndLossChartLeg> list3 = this.legs;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((ProfitAndLossChartLeg) it3.next()).toPiecewiseLinearDerivativeFunction(i));
            }
            arrayList3.addAll(arrayList5);
        }
        ProfitAndLossChartLeg profitAndLossChartLeg4 = (ProfitAndLossChartLeg) CollectionsKt.firstOrNull((List) this.legs);
        if (profitAndLossChartLeg4 != null) {
            BigDecimal tradeValueMultiplier = profitAndLossChartLeg4.getOptionChain().getTradeValueMultiplier();
            OptionChain.TickRequirements minTicks = profitAndLossChartLeg4.getOptionChain().getMinTicks();
            BigDecimal bigDecimal = BigDecimal.ZERO;
            PiecewiseLinearFunction piecewiseLinearFunction = new PiecewiseLinearFunction(CollectionsKt.listOf(bigDecimal), CollectionsKt.listOf(ProfitAndLossUtils.optionPriceQuantization(optionOrderCost, minTicks, this.legs.size() == 1).negate().multiply(new BigDecimal(i)).multiply(tradeValueMultiplier)), CollectionsKt.listOf((Object[]) new BigDecimal[]{bigDecimal, bigDecimal}));
            arrayList2.add(new C298804(piecewiseLinearFunction));
            mutableList.add(piecewiseLinearFunction);
        }
        List listListOf = CollectionsKt.listOf(this.equityPositionAverageCost.abs());
        List listListOf2 = CollectionsKt.listOf(BigDecimal.ZERO);
        BigDecimal bigDecimal2 = this.equityPositionQuantity;
        PiecewiseLinearFunction piecewiseLinearFunction2 = new PiecewiseLinearFunction(listListOf, listListOf2, CollectionsKt.listOf((Object[]) new BigDecimal[]{bigDecimal2, bigDecimal2}));
        arrayList2.add(new C298815(piecewiseLinearFunction2));
        mutableList.add(piecewiseLinearFunction2);
        arrayList3.add(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.local.ProfitLossAtExpiration$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitLossAtExpiration._init_$lambda$6(this.f$0, (BigDecimal) obj);
            }
        });
        Iterator it4 = mutableList.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next5 = it4.next();
        while (it4.hasNext()) {
            next5 = ((PiecewiseLinearFunction) next5).plus((PiecewiseLinearFunction) it4.next());
        }
        this.piecewiseLinearPnlFunction = (PiecewiseLinearFunction) next5;
        this.pnlFunctionsForLeg = arrayList2;
        this.pnlDerivativeFunctionsForLeg = arrayList3;
    }

    public final List<ProfitAndLossChartLeg> getLegs() {
        return this.legs;
    }

    public final BigDecimal getEquityPositionQuantity() {
        return this.equityPositionQuantity;
    }

    public final BigDecimal getEquityPositionAverageCost() {
        return this.equityPositionAverageCost;
    }

    public final boolean getRequiresPricingModel() {
        return this.requiresPricingModel;
    }

    public final PiecewiseLinearFunction getPiecewiseLinearPnlFunction() {
        return this.piecewiseLinearPnlFunction;
    }

    /* compiled from: ProfitLossAtExpiration.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.profitloss.local.ProfitLossAtExpiration$4 */
    /* synthetic */ class C298804 extends FunctionReferenceImpl implements Function1<BigDecimal, BigDecimal> {
        C298804(Object obj) {
            super(1, obj, PiecewiseLinearFunction.class, "invoke", "invoke(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final BigDecimal invoke(BigDecimal p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((PiecewiseLinearFunction) this.receiver).invoke(p0);
        }
    }

    /* compiled from: ProfitLossAtExpiration.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.profitloss.local.ProfitLossAtExpiration$5 */
    /* synthetic */ class C298815 extends FunctionReferenceImpl implements Function1<BigDecimal, BigDecimal> {
        C298815(Object obj) {
            super(1, obj, PiecewiseLinearFunction.class, "invoke", "invoke(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final BigDecimal invoke(BigDecimal p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((PiecewiseLinearFunction) this.receiver).invoke(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal _init_$lambda$6(ProfitLossAtExpiration profitLossAtExpiration, BigDecimal x) {
        Intrinsics.checkNotNullParameter(x, "x");
        return profitLossAtExpiration.equityPositionQuantity;
    }

    public final BigDecimal pnlFunction(BigDecimal x) {
        Intrinsics.checkNotNullParameter(x, "x");
        if (this.requiresPricingModel) {
            List<Function1<BigDecimal, BigDecimal>> list = this.pnlFunctionsForLeg;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                bigDecimalValueOf = bigDecimalValueOf.add((BigDecimal) ((Function1) it.next()).invoke(x));
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
            }
            return bigDecimalValueOf;
        }
        return this.piecewiseLinearPnlFunction.invoke(x);
    }

    public final BigDecimal pnlDerivativeFunction(BigDecimal x) {
        Intrinsics.checkNotNullParameter(x, "x");
        List<Function1<BigDecimal, BigDecimal>> list = this.pnlDerivativeFunctionsForLeg;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add((BigDecimal) ((Function1) it.next()).invoke(x));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    public final List<BigDecimal> breakevenPrices() {
        if (this.requiresPricingModel) {
            return getBreakevensFromNonLinearFunction(this.legs, new C298821(this), new C298832(this));
        }
        return getBreakevensFromPiecewiseLinearFunction(this.piecewiseLinearPnlFunction);
    }

    /* compiled from: ProfitLossAtExpiration.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.profitloss.local.ProfitLossAtExpiration$breakevenPrices$1 */
    /* synthetic */ class C298821 extends FunctionReferenceImpl implements Function1<BigDecimal, BigDecimal> {
        C298821(Object obj) {
            super(1, obj, ProfitLossAtExpiration.class, "pnlFunction", "pnlFunction(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final BigDecimal invoke(BigDecimal p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((ProfitLossAtExpiration) this.receiver).pnlFunction(p0);
        }
    }

    /* compiled from: ProfitLossAtExpiration.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.profitloss.local.ProfitLossAtExpiration$breakevenPrices$2 */
    /* synthetic */ class C298832 extends FunctionReferenceImpl implements Function1<BigDecimal, BigDecimal> {
        C298832(Object obj) {
            super(1, obj, ProfitLossAtExpiration.class, "pnlDerivativeFunction", "pnlDerivativeFunction(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final BigDecimal invoke(BigDecimal p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((ProfitLossAtExpiration) this.receiver).pnlDerivativeFunction(p0);
        }
    }

    public final List<BigDecimal> pricesOfInterest() {
        List<BigDecimal> xValues;
        List<BigDecimal> listBreakevenPrices = breakevenPrices();
        if (this.requiresPricingModel) {
            List<ProfitAndLossChartLeg> list = this.legs;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProfitAndLossChartLeg) it.next()).getOptionInstrument().getStrikePrice());
            }
            xValues = ProfitAndLossUtils.bigDecimalDistinct(arrayList);
        } else {
            xValues = this.piecewiseLinearPnlFunction.getXValues();
        }
        return CollectionsKt.sorted(ProfitAndLossUtils.bigDecimalDistinct(CollectionsKt.plus((Collection) xValues, (Iterable) listBreakevenPrices)));
    }

    private final boolean doesRequirePricingModel(List<ProfitAndLossChartLeg> legs) {
        Instant expirationTime;
        if (legs.isEmpty() && this.equityPositionQuantity.compareTo(BigDecimal.ZERO) != 0) {
            return false;
        }
        if (this.passedInEvaluationTime != null) {
            return true;
        }
        List<ProfitAndLossChartLeg> list = legs;
        Iterator<T> it = list.iterator();
        Instant instant = null;
        if (it.hasNext()) {
            expirationTime = ((ProfitAndLossChartLeg) it.next()).getExpirationTime();
            while (it.hasNext()) {
                Instant expirationTime2 = ((ProfitAndLossChartLeg) it.next()).getExpirationTime();
                if (expirationTime.compareTo(expirationTime2) > 0) {
                    expirationTime = expirationTime2;
                }
            }
        } else {
            expirationTime = null;
        }
        Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            Instant expirationTime3 = ((ProfitAndLossChartLeg) it2.next()).getExpirationTime();
            loop0: while (true) {
                instant = expirationTime3;
                while (it2.hasNext()) {
                    expirationTime3 = ((ProfitAndLossChartLeg) it2.next()).getExpirationTime();
                    if (instant.compareTo(expirationTime3) < 0) {
                        break;
                    }
                }
            }
        }
        return !Intrinsics.areEqual(expirationTime, instant);
    }

    private final List<BigDecimal> getBreakevensFromNonLinearFunction(List<ProfitAndLossChartLeg> legs, Function1<? super BigDecimal, ? extends BigDecimal> nonLinearFunction, Function1<? super BigDecimal, ? extends BigDecimal> nonLinearDerivativeFunction) {
        List listEmptyList;
        List<ProfitAndLossChartLeg> list = legs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProfitAndLossChartLeg) it.next()).getOptionInstrument().getStrikePrice());
        }
        if (this.equityPositionQuantity.compareTo(BigDecimal.ZERO) != 0) {
            listEmptyList = CollectionsKt.listOf(this.equityPositionAverageCost);
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<BigDecimal> listBigDecimalDistinct = ProfitAndLossUtils.bigDecimalDistinct(CollectionsKt.plus((Collection) arrayList, (Iterable) listEmptyList));
        ArrayList arrayList2 = new ArrayList();
        for (BigDecimal bigDecimal : listBigDecimalDistinct) {
            BigDecimal bigDecimal2 = NEWTONS_METHOD_MINIMUM_INCREMENT;
            BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            BigDecimal bigDecimalNewtonsMethod = ProfitAndLossUtils.newtonsMethod(nonLinearFunction, nonLinearDerivativeFunction, bigDecimalSubtract, bigDecimal2, 20);
            if (bigDecimalNewtonsMethod != null && bigDecimalNewtonsMethod.compareTo(BigDecimal.ZERO) > 0) {
                arrayList2.add(ProfitAndLossUtils.equityPriceQuantization(bigDecimalNewtonsMethod));
            }
            BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimal2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            BigDecimal bigDecimalNewtonsMethod2 = ProfitAndLossUtils.newtonsMethod(nonLinearFunction, nonLinearDerivativeFunction, bigDecimalAdd, bigDecimal2, 20);
            if (bigDecimalNewtonsMethod2 != null && bigDecimalNewtonsMethod2.compareTo(BigDecimal.ZERO) > 0) {
                arrayList2.add(ProfitAndLossUtils.equityPriceQuantization(bigDecimalNewtonsMethod2));
            }
        }
        return CollectionsKt.sorted(ProfitAndLossUtils.bigDecimalDistinct(arrayList2));
    }

    private final List<BigDecimal> getBreakevensFromPiecewiseLinearFunction(PiecewiseLinearFunction pnlFunction) {
        return CollectionsKt.sorted(pnlFunction.yIntersects());
    }
}
