package com.robinhood.android.options.aggregatequotes;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderSide;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionQuoteAggregator.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u00043456B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J$\u0010\r\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J(\u0010\u0012\u001a\u0004\u0018\u00010\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016J\u001c\u0010\u0017\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J6\u0010\u001c\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u0011J\u001c\u0010\u001e\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0018\u001a\u00020\u0019J&\u0010\u001f\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u0011J&\u0010 \u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u0011J\u0016\u0010!\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0018\u0010%\u001a\n &*\u0004\u0018\u00010\n0\n2\u0006\u0010'\u001a\u00020(H\u0002J\u0018\u0010)\u001a\n &*\u0004\u0018\u00010\n0\n2\u0006\u0010*\u001a\u00020\u0019H\u0002J \u0010+\u001a\n &*\u0004\u0018\u00010\n0\n2\u0006\u0010,\u001a\u00020-2\u0006\u0010'\u001a\u00020(H\u0002J \u0010.\u001a\n &*\u0004\u0018\u00010\n0\n2\u0006\u0010,\u001a\u00020-2\u0006\u0010'\u001a\u00020(H\u0002J\u001e\u0010/\u001a\u0004\u0018\u00010\n2\b\u00100\u001a\u0004\u0018\u00010\n2\b\u00101\u001a\u0004\u0018\u00010\nH\u0002J\u001e\u00102\u001a\u0004\u0018\u00010\n2\b\u00100\u001a\u0004\u0018\u00010\n2\b\u00101\u001a\u0004\u0018\u00010\nH\u0002R\u000e\u0010\"\u001a\u00020#X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082T¢\u0006\u0002\n\u0000¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator;", "", "<init>", "()V", "getInternalBidAsk", "Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$BidAsk;", "legs", "", "Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$LegContext;", "getInternalPreviousClose", "Ljava/math/BigDecimal;", "getInternalMarkPrices", "Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$MarkPrices;", "getInternalDefaultPrice", "defaultPricingType", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "shouldRoundDownForSells", "", "getInternalDefaultPriceNullable", "getInternalMinTickedPrice", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "minTicks", "Lcom/robinhood/models/db/OptionChain$TickRequirements;", "getBidAskForDisplay", "intendedDirection", "Lcom/robinhood/models/db/OrderDirection;", "getGreeksForDisplay", "Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$Greeks;", "getMarkPriceForDisplay", "shouldRoundToTwoDecimalPlaces", "getPreviousClosePriceForDisplay", "getTodaysChangeValueForDisplay", "getTodaysChangePercentageForDisplay", "isSingleLeg", "CENTS_PRECISION", "", "DIVISION_PRECISION", "getSideMultiplier", "kotlin.jvm.PlatformType", "side", "Lcom/robinhood/models/db/OrderSide;", "getDirectionMultiplier", "direction", "getSideAdjustedBid", "quote", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "getSideAdjustedAsk", "addNullable", "first", "second", "multiplyNullable", "LegContext", "BidAsk", "Greeks", "MarkPrices", "lib-options-aggregate-quotes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionQuoteAggregator {
    private static final int CENTS_PRECISION = 2;
    private static final int DIVISION_PRECISION = 4;
    public static final OptionQuoteAggregator INSTANCE = new OptionQuoteAggregator();

    /* compiled from: OptionQuoteAggregator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            int[] iArr2 = new int[OptionSettings.DefaultPricingSetting.values().length];
            try {
                iArr2[OptionSettings.DefaultPricingSetting.NATURAL_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OptionSettings.DefaultPricingSetting.MARK_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OrderDirection.values().length];
            try {
                iArr3[OrderDirection.DEBIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[OrderDirection.CREDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private OptionQuoteAggregator() {
    }

    public final BidAsk getInternalBidAsk(List<LegContext> legs) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        BigDecimal bigDecimalAdd = ZERO;
        for (LegContext legContext : legs) {
            BigDecimal sideAdjustedBid = getSideAdjustedBid(legContext.getOptionQuote(), legContext.getSide());
            Intrinsics.checkNotNullExpressionValue(sideAdjustedBid, "getSideAdjustedBid(...)");
            BigDecimal bigDecimalMultiply = sideAdjustedBid.multiply(legContext.getRatio());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            ZERO = ZERO.add(bigDecimalMultiply);
            Intrinsics.checkNotNullExpressionValue(ZERO, "add(...)");
            BigDecimal sideAdjustedAsk = getSideAdjustedAsk(legContext.getOptionQuote(), legContext.getSide());
            Intrinsics.checkNotNullExpressionValue(sideAdjustedAsk, "getSideAdjustedAsk(...)");
            BigDecimal bigDecimalMultiply2 = sideAdjustedAsk.multiply(legContext.getRatio());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        return new BidAsk(ZERO, bigDecimalAdd);
    }

    public final BigDecimal getInternalPreviousClose(List<LegContext> legs) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        for (LegContext legContext : legs) {
            BigDecimal sideMultiplier = getSideMultiplier(legContext.getSide());
            BigDecimal rawValue = legContext.getOptionQuote().getPreviousClosePrice().getRawValue();
            Intrinsics.checkNotNull(sideMultiplier);
            BigDecimal bigDecimalMultiply = rawValue.multiply(sideMultiplier);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(legContext.getRatio());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            ZERO = ZERO.add(bigDecimalMultiply2);
            Intrinsics.checkNotNullExpressionValue(ZERO, "add(...)");
        }
        return ZERO;
    }

    public final MarkPrices getInternalMarkPrices(List<LegContext> legs) {
        BigDecimal bigDecimalMultiply;
        Intrinsics.checkNotNullParameter(legs, "legs");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        BigDecimal bigDecimalAdd = ZERO;
        BigDecimal bigDecimalAdd2 = bigDecimalAdd;
        for (LegContext legContext : legs) {
            BigDecimal sideMultiplier = getSideMultiplier(legContext.getSide());
            BigDecimal bigDecimalAdd3 = legContext.getOptionQuote().getBidPrice().getRawValue().add(legContext.getOptionQuote().getAskPrice().getRawValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd3, "add(...)");
            Intrinsics.checkNotNull(sideMultiplier);
            BigDecimal bigDecimalMultiply2 = bigDecimalAdd3.multiply(sideMultiplier);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            BigDecimal bigDecimalMultiply3 = bigDecimalMultiply2.multiply(legContext.getRatio());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
            ZERO = ZERO.add(bigDecimalMultiply3);
            Intrinsics.checkNotNullExpressionValue(ZERO, "add(...)");
            BigDecimal bigDecimalMultiply4 = legContext.getOptionQuote().getAdjustedMarkPrice().getRawValue().multiply(sideMultiplier);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply4, "multiply(...)");
            BigDecimal bigDecimalMultiply5 = bigDecimalMultiply4.multiply(legContext.getRatio());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply5, "multiply(...)");
            bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply5);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            int i = WhenMappings.$EnumSwitchMapping$0[legContext.getSide().ordinal()];
            if (i == 1) {
                BigDecimal bigDecimalMultiply6 = legContext.getOptionQuote().getAdjustedMarkPrice().getRawValue().multiply(sideMultiplier);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply6, "multiply(...)");
                bigDecimalMultiply = bigDecimalMultiply6.multiply(legContext.getRatio());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal bigDecimalMultiply7 = legContext.getOptionQuote().getAdjustedMarkPriceRoundDown().getRawValue().multiply(sideMultiplier);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply7, "multiply(...)");
                bigDecimalMultiply = bigDecimalMultiply7.multiply(legContext.getRatio());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            }
            bigDecimalAdd2 = bigDecimalAdd2.add(bigDecimalMultiply);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
        }
        BigDecimal bigDecimalDivide = ZERO.divide(new BigDecimal(2), 4, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return new MarkPrices(bigDecimalDivide, bigDecimalAdd, bigDecimalAdd2);
    }

    public final BigDecimal getInternalDefaultPrice(List<LegContext> legs, OptionSettings.DefaultPricingSetting defaultPricingType, boolean shouldRoundDownForSells) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(defaultPricingType, "defaultPricingType");
        MarkPrices internalMarkPrices = getInternalMarkPrices(legs);
        if (isSingleLeg(legs)) {
            LegContext legContext = (LegContext) CollectionsKt.single((List) legs);
            BidAsk internalBidAsk = getInternalBidAsk(legs);
            int i = WhenMappings.$EnumSwitchMapping$1[defaultPricingType.ordinal()];
            if (i == 1) {
                return internalBidAsk.getAsk();
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[legContext.getSide().ordinal()];
            if (i2 == 1) {
                return internalMarkPrices.getAdjustedMarkPrice();
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (shouldRoundDownForSells) {
                return internalMarkPrices.getAdjustedMarkPriceRoundedDownForSells();
            }
            return internalMarkPrices.getAdjustedMarkPrice();
        }
        return internalMarkPrices.getMarkPrice();
    }

    public final BigDecimal getInternalDefaultPriceNullable(List<LegContext> legs, OptionSettings.DefaultPricingSetting defaultPricingType, boolean shouldRoundDownForSells) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        MarkPrices internalMarkPrices = getInternalMarkPrices(legs);
        if (isSingleLeg(legs)) {
            LegContext legContext = (LegContext) CollectionsKt.single((List) legs);
            BidAsk internalBidAsk = getInternalBidAsk(legs);
            int i = defaultPricingType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[defaultPricingType.ordinal()];
            if (i == -1) {
                return null;
            }
            if (i == 1) {
                return internalBidAsk.getAsk();
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[legContext.getSide().ordinal()];
            if (i2 == 1) {
                return internalMarkPrices.getAdjustedMarkPrice();
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (shouldRoundDownForSells) {
                return internalMarkPrices.getAdjustedMarkPriceRoundedDownForSells();
            }
            return internalMarkPrices.getAdjustedMarkPrice();
        }
        return internalMarkPrices.getMarkPrice();
    }

    public final BigDecimal getInternalMinTickedPrice(BigDecimal price, OptionChain.TickRequirements minTicks) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(minTicks, "minTicks");
        if (price.signum() < 0) {
            BigDecimal bigDecimalNegate = price.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
            BigDecimal bigDecimalNegate2 = minTicks.roundToTick(bigDecimalNegate, RoundingMode.DOWN).negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate2, "negate(...)");
            return bigDecimalNegate2;
        }
        return minTicks.roundToTick(price, RoundingMode.UP);
    }

    public final BidAsk getBidAskForDisplay(List<LegContext> legs, OrderDirection intendedDirection) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(intendedDirection, "intendedDirection");
        BidAsk internalBidAsk = getInternalBidAsk(legs);
        int i = WhenMappings.$EnumSwitchMapping$2[intendedDirection.ordinal()];
        if (i == 1) {
            return internalBidAsk;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        BigDecimal bigDecimalNegate = internalBidAsk.getAsk().negate();
        Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
        BigDecimal bigDecimalNegate2 = internalBidAsk.getBid().negate();
        Intrinsics.checkNotNullExpressionValue(bigDecimalNegate2, "negate(...)");
        return new BidAsk(bigDecimalNegate, bigDecimalNegate2);
    }

    public final Greeks getGreeksForDisplay(List<LegContext> legs) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        BigDecimal bigDecimal = BigDecimal.ZERO;
        BigDecimal bigDecimalAddNullable = bigDecimal;
        BigDecimal bigDecimalAddNullable2 = bigDecimalAddNullable;
        BigDecimal bigDecimalAddNullable3 = bigDecimalAddNullable2;
        BigDecimal bigDecimalAddNullable4 = bigDecimalAddNullable3;
        BigDecimal bigDecimalAddNullable5 = bigDecimalAddNullable4;
        for (LegContext legContext : legs) {
            OptionInstrumentQuote optionQuote = legContext.getOptionQuote();
            BigDecimal ratio = legContext.getRatio();
            BigDecimal sideMultiplier = getSideMultiplier(legContext.getSide());
            Intrinsics.checkNotNull(sideMultiplier);
            BigDecimal bigDecimalMultiply = ratio.multiply(sideMultiplier);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            bigDecimalAddNullable = addNullable(bigDecimalAddNullable, multiplyNullable(optionQuote.getDelta(), bigDecimalMultiply));
            bigDecimalAddNullable2 = addNullable(bigDecimalAddNullable2, multiplyNullable(optionQuote.getGamma(), bigDecimalMultiply));
            bigDecimalAddNullable3 = addNullable(bigDecimalAddNullable3, multiplyNullable(optionQuote.getRho(), bigDecimalMultiply));
            bigDecimalAddNullable4 = addNullable(bigDecimalAddNullable4, multiplyNullable(optionQuote.getVega(), bigDecimalMultiply));
            bigDecimalAddNullable5 = addNullable(bigDecimalAddNullable5, multiplyNullable(optionQuote.getTheta(), bigDecimalMultiply));
        }
        return new Greeks(bigDecimalAddNullable, bigDecimalAddNullable2, bigDecimalAddNullable3, bigDecimalAddNullable4, bigDecimalAddNullable5);
    }

    public static /* synthetic */ BigDecimal getMarkPriceForDisplay$default(OptionQuoteAggregator optionQuoteAggregator, List list, OptionSettings.DefaultPricingSetting defaultPricingSetting, boolean z, OrderDirection orderDirection, boolean z2, int i, Object obj) {
        if ((i & 16) != 0) {
            z2 = false;
        }
        return optionQuoteAggregator.getMarkPriceForDisplay(list, defaultPricingSetting, z, orderDirection, z2);
    }

    public final BigDecimal getMarkPriceForDisplay(List<LegContext> legs, OptionSettings.DefaultPricingSetting defaultPricingType, boolean shouldRoundDownForSells, OrderDirection intendedDirection, boolean shouldRoundToTwoDecimalPlaces) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(defaultPricingType, "defaultPricingType");
        Intrinsics.checkNotNullParameter(intendedDirection, "intendedDirection");
        BigDecimal internalDefaultPrice = getInternalDefaultPrice(legs, defaultPricingType, shouldRoundDownForSells);
        if (shouldRoundToTwoDecimalPlaces) {
            internalDefaultPrice = internalDefaultPrice.setScale(2, RoundingMode.HALF_UP);
        }
        BigDecimal directionMultiplier = getDirectionMultiplier(intendedDirection);
        Intrinsics.checkNotNull(internalDefaultPrice);
        Intrinsics.checkNotNull(directionMultiplier);
        BigDecimal bigDecimalMultiply = internalDefaultPrice.multiply(directionMultiplier);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    public final BigDecimal getPreviousClosePriceForDisplay(List<LegContext> legs, OrderDirection intendedDirection) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(intendedDirection, "intendedDirection");
        BigDecimal internalPreviousClose = getInternalPreviousClose(legs);
        BigDecimal directionMultiplier = getDirectionMultiplier(intendedDirection);
        Intrinsics.checkNotNullExpressionValue(directionMultiplier, "getDirectionMultiplier(...)");
        BigDecimal bigDecimalMultiply = internalPreviousClose.multiply(directionMultiplier);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    public static /* synthetic */ BigDecimal getTodaysChangeValueForDisplay$default(OptionQuoteAggregator optionQuoteAggregator, List list, OrderDirection orderDirection, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return optionQuoteAggregator.getTodaysChangeValueForDisplay(list, orderDirection, z);
    }

    public final BigDecimal getTodaysChangeValueForDisplay(List<LegContext> legs, OrderDirection intendedDirection, boolean shouldRoundToTwoDecimalPlaces) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(intendedDirection, "intendedDirection");
        BigDecimal bigDecimalSubtract = getMarkPriceForDisplay(legs, OptionSettings.DefaultPricingSetting.MARK_PRICE, false, intendedDirection, shouldRoundToTwoDecimalPlaces).subtract(getPreviousClosePriceForDisplay(legs, intendedDirection));
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    public static /* synthetic */ BigDecimal getTodaysChangePercentageForDisplay$default(OptionQuoteAggregator optionQuoteAggregator, List list, OrderDirection orderDirection, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return optionQuoteAggregator.getTodaysChangePercentageForDisplay(list, orderDirection, z);
    }

    public final BigDecimal getTodaysChangePercentageForDisplay(List<LegContext> legs, OrderDirection intendedDirection, boolean shouldRoundToTwoDecimalPlaces) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(intendedDirection, "intendedDirection");
        BigDecimal previousClosePriceForDisplay = getPreviousClosePriceForDisplay(legs, intendedDirection);
        if (previousClosePriceForDisplay.signum() == 0) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        BigDecimal bigDecimalDivide = getTodaysChangeValueForDisplay(legs, intendedDirection, shouldRoundToTwoDecimalPlaces).divide(previousClosePriceForDisplay, 4, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    /* compiled from: OptionQuoteAggregator.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$LegContext;", "", "optionQuote", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "side", "Lcom/robinhood/models/db/OrderSide;", "ratio", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/models/db/OptionInstrumentQuote;Lcom/robinhood/models/db/OrderSide;Ljava/math/BigDecimal;)V", "getOptionQuote", "()Lcom/robinhood/models/db/OptionInstrumentQuote;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getRatio", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-options-aggregate-quotes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LegContext {
        private final OptionInstrumentQuote optionQuote;
        private final BigDecimal ratio;
        private final OrderSide side;

        public static /* synthetic */ LegContext copy$default(LegContext legContext, OptionInstrumentQuote optionInstrumentQuote, OrderSide orderSide, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                optionInstrumentQuote = legContext.optionQuote;
            }
            if ((i & 2) != 0) {
                orderSide = legContext.side;
            }
            if ((i & 4) != 0) {
                bigDecimal = legContext.ratio;
            }
            return legContext.copy(optionInstrumentQuote, orderSide, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionInstrumentQuote getOptionQuote() {
            return this.optionQuote;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderSide getSide() {
            return this.side;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getRatio() {
            return this.ratio;
        }

        public final LegContext copy(OptionInstrumentQuote optionQuote, OrderSide side, BigDecimal ratio) {
            Intrinsics.checkNotNullParameter(optionQuote, "optionQuote");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(ratio, "ratio");
            return new LegContext(optionQuote, side, ratio);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LegContext)) {
                return false;
            }
            LegContext legContext = (LegContext) other;
            return Intrinsics.areEqual(this.optionQuote, legContext.optionQuote) && this.side == legContext.side && Intrinsics.areEqual(this.ratio, legContext.ratio);
        }

        public int hashCode() {
            return (((this.optionQuote.hashCode() * 31) + this.side.hashCode()) * 31) + this.ratio.hashCode();
        }

        public String toString() {
            return "LegContext(optionQuote=" + this.optionQuote + ", side=" + this.side + ", ratio=" + this.ratio + ")";
        }

        public LegContext(OptionInstrumentQuote optionQuote, OrderSide side, BigDecimal ratio) {
            Intrinsics.checkNotNullParameter(optionQuote, "optionQuote");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(ratio, "ratio");
            this.optionQuote = optionQuote;
            this.side = side;
            this.ratio = ratio;
        }

        public final OptionInstrumentQuote getOptionQuote() {
            return this.optionQuote;
        }

        public final OrderSide getSide() {
            return this.side;
        }

        public final BigDecimal getRatio() {
            return this.ratio;
        }
    }

    /* compiled from: OptionQuoteAggregator.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$BidAsk;", "", "bid", "Ljava/math/BigDecimal;", "ask", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getBid", "()Ljava/math/BigDecimal;", "getAsk", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-options-aggregate-quotes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BidAsk {
        private final BigDecimal ask;
        private final BigDecimal bid;

        public static /* synthetic */ BidAsk copy$default(BidAsk bidAsk, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = bidAsk.bid;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = bidAsk.ask;
            }
            return bidAsk.copy(bigDecimal, bigDecimal2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getBid() {
            return this.bid;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getAsk() {
            return this.ask;
        }

        public final BidAsk copy(BigDecimal bid, BigDecimal ask) {
            Intrinsics.checkNotNullParameter(bid, "bid");
            Intrinsics.checkNotNullParameter(ask, "ask");
            return new BidAsk(bid, ask);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BidAsk)) {
                return false;
            }
            BidAsk bidAsk = (BidAsk) other;
            return Intrinsics.areEqual(this.bid, bidAsk.bid) && Intrinsics.areEqual(this.ask, bidAsk.ask);
        }

        public int hashCode() {
            return (this.bid.hashCode() * 31) + this.ask.hashCode();
        }

        public String toString() {
            return "BidAsk(bid=" + this.bid + ", ask=" + this.ask + ")";
        }

        public BidAsk(BigDecimal bid, BigDecimal ask) {
            Intrinsics.checkNotNullParameter(bid, "bid");
            Intrinsics.checkNotNullParameter(ask, "ask");
            this.bid = bid;
            this.ask = ask;
        }

        public final BigDecimal getBid() {
            return this.bid;
        }

        public final BigDecimal getAsk() {
            return this.ask;
        }
    }

    /* compiled from: OptionQuoteAggregator.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$Greeks;", "", "delta", "Ljava/math/BigDecimal;", "gamma", "rho", "vega", "theta", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getDelta", "()Ljava/math/BigDecimal;", "getGamma", "getRho", "getVega", "getTheta", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-options-aggregate-quotes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Greeks {
        private final BigDecimal delta;
        private final BigDecimal gamma;
        private final BigDecimal rho;
        private final BigDecimal theta;
        private final BigDecimal vega;

        public static /* synthetic */ Greeks copy$default(Greeks greeks, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = greeks.delta;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = greeks.gamma;
            }
            if ((i & 4) != 0) {
                bigDecimal3 = greeks.rho;
            }
            if ((i & 8) != 0) {
                bigDecimal4 = greeks.vega;
            }
            if ((i & 16) != 0) {
                bigDecimal5 = greeks.theta;
            }
            BigDecimal bigDecimal6 = bigDecimal5;
            BigDecimal bigDecimal7 = bigDecimal3;
            return greeks.copy(bigDecimal, bigDecimal2, bigDecimal7, bigDecimal4, bigDecimal6);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getDelta() {
            return this.delta;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getGamma() {
            return this.gamma;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getRho() {
            return this.rho;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getVega() {
            return this.vega;
        }

        /* renamed from: component5, reason: from getter */
        public final BigDecimal getTheta() {
            return this.theta;
        }

        public final Greeks copy(BigDecimal delta, BigDecimal gamma, BigDecimal rho, BigDecimal vega, BigDecimal theta) {
            return new Greeks(delta, gamma, rho, vega, theta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Greeks)) {
                return false;
            }
            Greeks greeks = (Greeks) other;
            return Intrinsics.areEqual(this.delta, greeks.delta) && Intrinsics.areEqual(this.gamma, greeks.gamma) && Intrinsics.areEqual(this.rho, greeks.rho) && Intrinsics.areEqual(this.vega, greeks.vega) && Intrinsics.areEqual(this.theta, greeks.theta);
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.delta;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            BigDecimal bigDecimal2 = this.gamma;
            int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.rho;
            int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            BigDecimal bigDecimal4 = this.vega;
            int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
            BigDecimal bigDecimal5 = this.theta;
            return iHashCode4 + (bigDecimal5 != null ? bigDecimal5.hashCode() : 0);
        }

        public String toString() {
            return "Greeks(delta=" + this.delta + ", gamma=" + this.gamma + ", rho=" + this.rho + ", vega=" + this.vega + ", theta=" + this.theta + ")";
        }

        public Greeks(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5) {
            this.delta = bigDecimal;
            this.gamma = bigDecimal2;
            this.rho = bigDecimal3;
            this.vega = bigDecimal4;
            this.theta = bigDecimal5;
        }

        public final BigDecimal getDelta() {
            return this.delta;
        }

        public final BigDecimal getGamma() {
            return this.gamma;
        }

        public final BigDecimal getRho() {
            return this.rho;
        }

        public final BigDecimal getVega() {
            return this.vega;
        }

        public final BigDecimal getTheta() {
            return this.theta;
        }
    }

    /* compiled from: OptionQuoteAggregator.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$MarkPrices;", "", "markPrice", "Ljava/math/BigDecimal;", "adjustedMarkPrice", "adjustedMarkPriceRoundedDownForSells", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getMarkPrice", "()Ljava/math/BigDecimal;", "getAdjustedMarkPrice", "getAdjustedMarkPriceRoundedDownForSells", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-options-aggregate-quotes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarkPrices {
        private final BigDecimal adjustedMarkPrice;
        private final BigDecimal adjustedMarkPriceRoundedDownForSells;
        private final BigDecimal markPrice;

        public static /* synthetic */ MarkPrices copy$default(MarkPrices markPrices, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = markPrices.markPrice;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = markPrices.adjustedMarkPrice;
            }
            if ((i & 4) != 0) {
                bigDecimal3 = markPrices.adjustedMarkPriceRoundedDownForSells;
            }
            return markPrices.copy(bigDecimal, bigDecimal2, bigDecimal3);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getMarkPrice() {
            return this.markPrice;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getAdjustedMarkPrice() {
            return this.adjustedMarkPrice;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getAdjustedMarkPriceRoundedDownForSells() {
            return this.adjustedMarkPriceRoundedDownForSells;
        }

        public final MarkPrices copy(BigDecimal markPrice, BigDecimal adjustedMarkPrice, BigDecimal adjustedMarkPriceRoundedDownForSells) {
            Intrinsics.checkNotNullParameter(markPrice, "markPrice");
            Intrinsics.checkNotNullParameter(adjustedMarkPrice, "adjustedMarkPrice");
            Intrinsics.checkNotNullParameter(adjustedMarkPriceRoundedDownForSells, "adjustedMarkPriceRoundedDownForSells");
            return new MarkPrices(markPrice, adjustedMarkPrice, adjustedMarkPriceRoundedDownForSells);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarkPrices)) {
                return false;
            }
            MarkPrices markPrices = (MarkPrices) other;
            return Intrinsics.areEqual(this.markPrice, markPrices.markPrice) && Intrinsics.areEqual(this.adjustedMarkPrice, markPrices.adjustedMarkPrice) && Intrinsics.areEqual(this.adjustedMarkPriceRoundedDownForSells, markPrices.adjustedMarkPriceRoundedDownForSells);
        }

        public int hashCode() {
            return (((this.markPrice.hashCode() * 31) + this.adjustedMarkPrice.hashCode()) * 31) + this.adjustedMarkPriceRoundedDownForSells.hashCode();
        }

        public String toString() {
            return "MarkPrices(markPrice=" + this.markPrice + ", adjustedMarkPrice=" + this.adjustedMarkPrice + ", adjustedMarkPriceRoundedDownForSells=" + this.adjustedMarkPriceRoundedDownForSells + ")";
        }

        public MarkPrices(BigDecimal markPrice, BigDecimal adjustedMarkPrice, BigDecimal adjustedMarkPriceRoundedDownForSells) {
            Intrinsics.checkNotNullParameter(markPrice, "markPrice");
            Intrinsics.checkNotNullParameter(adjustedMarkPrice, "adjustedMarkPrice");
            Intrinsics.checkNotNullParameter(adjustedMarkPriceRoundedDownForSells, "adjustedMarkPriceRoundedDownForSells");
            this.markPrice = markPrice;
            this.adjustedMarkPrice = adjustedMarkPrice;
            this.adjustedMarkPriceRoundedDownForSells = adjustedMarkPriceRoundedDownForSells;
        }

        public final BigDecimal getMarkPrice() {
            return this.markPrice;
        }

        public final BigDecimal getAdjustedMarkPrice() {
            return this.adjustedMarkPrice;
        }

        public final BigDecimal getAdjustedMarkPriceRoundedDownForSells() {
            return this.adjustedMarkPriceRoundedDownForSells;
        }
    }

    private final boolean isSingleLeg(List<LegContext> legs) {
        return legs.size() == 1 && legs.get(0).getRatio().compareTo(BigDecimal.ONE) == 0;
    }

    private final BigDecimal getSideMultiplier(OrderSide side) {
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1) {
            return BigDecimal.ONE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return BigDecimal.ONE.negate();
    }

    private final BigDecimal getDirectionMultiplier(OrderDirection direction) {
        int i = WhenMappings.$EnumSwitchMapping$2[direction.ordinal()];
        if (i == 1) {
            return BigDecimal.ONE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return BigDecimal.ONE.negate();
    }

    private final BigDecimal getSideAdjustedBid(OptionInstrumentQuote quote, OrderSide side) {
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1) {
            return quote.getBidPrice().getRawValue();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return quote.getAskPrice().getRawValue().negate();
    }

    private final BigDecimal getSideAdjustedAsk(OptionInstrumentQuote quote, OrderSide side) {
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1) {
            return quote.getAskPrice().getRawValue();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return quote.getBidPrice().getRawValue().negate();
    }

    private final BigDecimal addNullable(BigDecimal first, BigDecimal second) {
        if (first == null || second == null) {
            return null;
        }
        BigDecimal bigDecimalAdd = first.add(second);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    private final BigDecimal multiplyNullable(BigDecimal first, BigDecimal second) {
        if (first == null || second == null) {
            return null;
        }
        BigDecimal bigDecimalMultiply = first.multiply(second);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }
}
