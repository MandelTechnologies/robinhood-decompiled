package com.robinhood.android.trade.options.profitloss.local;

import com.robinhood.android.options.simulatedreturnschart.BjerksundStensland;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.datetime.Instant;

/* compiled from: ProfitAndLossChartLeg.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\rJ\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0-2\u0006\u0010+\u001a\u00020\rJ\"\u0010.\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0-2\u0006\u0010+\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u0003J\"\u00100\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0-2\u0006\u0010+\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u0003J\u0010\u00101\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u0003H\u0002J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\t\u00107\u001a\u00020\rHÆ\u0003J\t\u00108\u001a\u00020\u000fHÆ\u0003J\t\u00109\u001a\u00020\u000fHÆ\u0003J\t\u0010:\u001a\u00020\u000fHÆ\u0003Jc\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fHÆ\u0001J\u0013\u0010<\u001a\u00020%2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\rHÖ\u0001J\t\u0010?\u001a\u00020@HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010&¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartLeg;", "", "expirationTime", "Lkotlinx/datetime/Instant;", "optionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "optionChain", "Lcom/robinhood/models/db/OptionChain;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "side", "Lcom/robinhood/models/db/OrderSide;", "ratioQuantity", "", "impliedVolatility", "", "interestRate", "dividendYield", "<init>", "(Lkotlinx/datetime/Instant;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OptionChain;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Lcom/robinhood/models/db/OrderSide;IDDD)V", "getExpirationTime", "()Lkotlinx/datetime/Instant;", "getOptionInstrument", "()Lcom/robinhood/models/db/OptionInstrument;", "getOptionChain", "()Lcom/robinhood/models/db/OptionChain;", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getRatioQuantity", "()I", "getImpliedVolatility", "()D", "getInterestRate", "getDividendYield", "isEuropean", "", "()Z", "toPiecewiseLinearFunction", "Lcom/robinhood/android/trade/options/profitloss/local/PiecewiseLinearFunction;", "quote", "Ljava/math/BigDecimal;", "quantity", "toPiecewiseLinearDerivativeFunction", "Lkotlin/Function1;", "toTheoreticalPriceFunction", "evaluationTime", "toTheoreticalPriceDerivativeFunction", "getYearsToExpiration", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ProfitAndLossChartLeg {
    public static final int $stable = 8;
    private final double dividendYield;
    private final Instant expirationTime;
    private final double impliedVolatility;
    private final double interestRate;
    private final OptionChain optionChain;
    private final OptionInstrument optionInstrument;
    private final int ratioQuantity;
    private final OrderSide side;
    private final OptionChain.UnderlyingType underlyingType;

    public static /* synthetic */ ProfitAndLossChartLeg copy$default(ProfitAndLossChartLeg profitAndLossChartLeg, Instant instant, OptionInstrument optionInstrument, OptionChain optionChain, OptionChain.UnderlyingType underlyingType, OrderSide orderSide, int i, double d, double d2, double d3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            instant = profitAndLossChartLeg.expirationTime;
        }
        if ((i2 & 2) != 0) {
            optionInstrument = profitAndLossChartLeg.optionInstrument;
        }
        if ((i2 & 4) != 0) {
            optionChain = profitAndLossChartLeg.optionChain;
        }
        if ((i2 & 8) != 0) {
            underlyingType = profitAndLossChartLeg.underlyingType;
        }
        if ((i2 & 16) != 0) {
            orderSide = profitAndLossChartLeg.side;
        }
        if ((i2 & 32) != 0) {
            i = profitAndLossChartLeg.ratioQuantity;
        }
        if ((i2 & 64) != 0) {
            d = profitAndLossChartLeg.impliedVolatility;
        }
        if ((i2 & 128) != 0) {
            d2 = profitAndLossChartLeg.interestRate;
        }
        if ((i2 & 256) != 0) {
            d3 = profitAndLossChartLeg.dividendYield;
        }
        double d4 = d3;
        double d5 = d2;
        double d6 = d;
        OrderSide orderSide2 = orderSide;
        int i3 = i;
        return profitAndLossChartLeg.copy(instant, optionInstrument, optionChain, underlyingType, orderSide2, i3, d6, d5, d4);
    }

    /* renamed from: component1, reason: from getter */
    public final Instant getExpirationTime() {
        return this.expirationTime;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionInstrument getOptionInstrument() {
        return this.optionInstrument;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionChain getOptionChain() {
        return this.optionChain;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }

    /* renamed from: component5, reason: from getter */
    public final OrderSide getSide() {
        return this.side;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRatioQuantity() {
        return this.ratioQuantity;
    }

    /* renamed from: component7, reason: from getter */
    public final double getImpliedVolatility() {
        return this.impliedVolatility;
    }

    /* renamed from: component8, reason: from getter */
    public final double getInterestRate() {
        return this.interestRate;
    }

    /* renamed from: component9, reason: from getter */
    public final double getDividendYield() {
        return this.dividendYield;
    }

    public final ProfitAndLossChartLeg copy(Instant expirationTime, OptionInstrument optionInstrument, OptionChain optionChain, OptionChain.UnderlyingType underlyingType, OrderSide side, int ratioQuantity, double impliedVolatility, double interestRate, double dividendYield) {
        Intrinsics.checkNotNullParameter(expirationTime, "expirationTime");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(optionChain, "optionChain");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        Intrinsics.checkNotNullParameter(side, "side");
        return new ProfitAndLossChartLeg(expirationTime, optionInstrument, optionChain, underlyingType, side, ratioQuantity, impliedVolatility, interestRate, dividendYield);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitAndLossChartLeg)) {
            return false;
        }
        ProfitAndLossChartLeg profitAndLossChartLeg = (ProfitAndLossChartLeg) other;
        return Intrinsics.areEqual(this.expirationTime, profitAndLossChartLeg.expirationTime) && Intrinsics.areEqual(this.optionInstrument, profitAndLossChartLeg.optionInstrument) && Intrinsics.areEqual(this.optionChain, profitAndLossChartLeg.optionChain) && this.underlyingType == profitAndLossChartLeg.underlyingType && this.side == profitAndLossChartLeg.side && this.ratioQuantity == profitAndLossChartLeg.ratioQuantity && Double.compare(this.impliedVolatility, profitAndLossChartLeg.impliedVolatility) == 0 && Double.compare(this.interestRate, profitAndLossChartLeg.interestRate) == 0 && Double.compare(this.dividendYield, profitAndLossChartLeg.dividendYield) == 0;
    }

    public int hashCode() {
        return (((((((((((((((this.expirationTime.hashCode() * 31) + this.optionInstrument.hashCode()) * 31) + this.optionChain.hashCode()) * 31) + this.underlyingType.hashCode()) * 31) + this.side.hashCode()) * 31) + Integer.hashCode(this.ratioQuantity)) * 31) + Double.hashCode(this.impliedVolatility)) * 31) + Double.hashCode(this.interestRate)) * 31) + Double.hashCode(this.dividendYield);
    }

    public String toString() {
        return "ProfitAndLossChartLeg(expirationTime=" + this.expirationTime + ", optionInstrument=" + this.optionInstrument + ", optionChain=" + this.optionChain + ", underlyingType=" + this.underlyingType + ", side=" + this.side + ", ratioQuantity=" + this.ratioQuantity + ", impliedVolatility=" + this.impliedVolatility + ", interestRate=" + this.interestRate + ", dividendYield=" + this.dividendYield + ")";
    }

    public ProfitAndLossChartLeg(Instant expirationTime, OptionInstrument optionInstrument, OptionChain optionChain, OptionChain.UnderlyingType underlyingType, OrderSide side, int i, double d, double d2, double d3) {
        Intrinsics.checkNotNullParameter(expirationTime, "expirationTime");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(optionChain, "optionChain");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        Intrinsics.checkNotNullParameter(side, "side");
        this.expirationTime = expirationTime;
        this.optionInstrument = optionInstrument;
        this.optionChain = optionChain;
        this.underlyingType = underlyingType;
        this.side = side;
        this.ratioQuantity = i;
        this.impliedVolatility = d;
        this.interestRate = d2;
        this.dividendYield = d3;
    }

    public final Instant getExpirationTime() {
        return this.expirationTime;
    }

    public final OptionInstrument getOptionInstrument() {
        return this.optionInstrument;
    }

    public final OptionChain getOptionChain() {
        return this.optionChain;
    }

    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }

    public final OrderSide getSide() {
        return this.side;
    }

    public final int getRatioQuantity() {
        return this.ratioQuantity;
    }

    public final double getImpliedVolatility() {
        return this.impliedVolatility;
    }

    public final double getInterestRate() {
        return this.interestRate;
    }

    public final double getDividendYield() {
        return this.dividendYield;
    }

    private final boolean isEuropean() {
        return this.underlyingType == OptionChain.UnderlyingType.INDEX;
    }

    public final PiecewiseLinearFunction toPiecewiseLinearFunction(BigDecimal quote, int quantity) {
        List listListOf;
        Intrinsics.checkNotNullParameter(quote, "quote");
        BigDecimal strikePrice = this.optionInstrument.getStrikePrice();
        BigDecimal bigDecimalMultiply = this.optionChain.getTradeValueMultiplier().multiply(BigDecimals7.toBigDecimal(Integer.valueOf(this.ratioQuantity)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(this.side.getDirection().getMultiplier());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        BigDecimal bigDecimalMultiply3 = bigDecimalMultiply2.multiply(BigDecimals7.toBigDecimal(Integer.valueOf(quantity)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
        OptionContractType contractType = this.optionInstrument.getContractType();
        List listListOf2 = CollectionsKt.listOf(strikePrice);
        List listListOf3 = CollectionsKt.listOf(quote.multiply(bigDecimalMultiply3).negate());
        if (contractType == OptionContractType.CALL) {
            listListOf = CollectionsKt.listOf((Object[]) new BigDecimal[]{BigDecimal.ZERO, bigDecimalMultiply3});
        } else {
            listListOf = CollectionsKt.listOf((Object[]) new BigDecimal[]{bigDecimalMultiply3.negate(), BigDecimal.ZERO});
        }
        return new PiecewiseLinearFunction(listListOf2, listListOf3, listListOf);
    }

    public final Function1<BigDecimal, BigDecimal> toPiecewiseLinearDerivativeFunction(int quantity) {
        final BigDecimal strikePrice = this.optionInstrument.getStrikePrice();
        BigDecimal bigDecimalMultiply = this.optionChain.getTradeValueMultiplier().multiply(BigDecimals7.toBigDecimal(Integer.valueOf(this.ratioQuantity)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(this.side.getDirection().getMultiplier());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        final BigDecimal bigDecimalMultiply3 = bigDecimalMultiply2.multiply(BigDecimals7.toBigDecimal(Integer.valueOf(quantity)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
        final OptionContractType contractType = this.optionInstrument.getContractType();
        return new Function1() { // from class: com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartLeg$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossChartLeg.toPiecewiseLinearDerivativeFunction$lambda$0(contractType, strikePrice, bigDecimalMultiply3, (BigDecimal) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal toPiecewiseLinearDerivativeFunction$lambda$0(OptionContractType optionContractType, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal x) {
        Intrinsics.checkNotNullParameter(x, "x");
        if (optionContractType == OptionContractType.CALL) {
            if (x.compareTo(bigDecimal) > 0) {
                return bigDecimal2;
            }
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        BigDecimal bigDecimalNegate = x.compareTo(bigDecimal) >= 0 ? BigDecimal.ZERO : bigDecimal2.negate();
        Intrinsics.checkNotNull(bigDecimalNegate);
        return bigDecimalNegate;
    }

    public final Function1<BigDecimal, BigDecimal> toTheoreticalPriceFunction(int quantity, Instant evaluationTime) {
        Intrinsics.checkNotNullParameter(evaluationTime, "evaluationTime");
        final double yearsToExpiration = getYearsToExpiration(evaluationTime);
        BigDecimal bigDecimalMultiply = this.optionChain.getTradeValueMultiplier().multiply(BigDecimals7.toBigDecimal(Integer.valueOf(this.ratioQuantity)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(this.side.getDirection().getMultiplier());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        final BigDecimal bigDecimalMultiply3 = bigDecimalMultiply2.multiply(BigDecimals7.toBigDecimal(Integer.valueOf(quantity)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
        return new Function1() { // from class: com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartLeg$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossChartLeg.toTheoreticalPriceFunction$lambda$1(this.f$0, yearsToExpiration, bigDecimalMultiply3, (BigDecimal) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal toTheoreticalPriceFunction$lambda$1(ProfitAndLossChartLeg profitAndLossChartLeg, double d, BigDecimal bigDecimal, BigDecimal x) {
        Intrinsics.checkNotNullParameter(x, "x");
        if (profitAndLossChartLeg.isEuropean()) {
            BigDecimal bigDecimalMultiply = BigDecimals7.toBigDecimal(Double.valueOf(BjerksundStensland.blackScholes(x.doubleValue(), profitAndLossChartLeg.optionInstrument.getStrikePrice().doubleValue(), d, profitAndLossChartLeg.impliedVolatility, profitAndLossChartLeg.interestRate, profitAndLossChartLeg.dividendYield, profitAndLossChartLeg.optionInstrument.getContractType() == OptionContractType.PUT))).multiply(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            return bigDecimalMultiply;
        }
        BigDecimal bigDecimalMultiply2 = BigDecimals7.toBigDecimal(Double.valueOf(BjerksundStensland.bjerksundStensland(x.doubleValue(), profitAndLossChartLeg.optionInstrument.getStrikePrice().doubleValue(), d, profitAndLossChartLeg.impliedVolatility, profitAndLossChartLeg.interestRate, profitAndLossChartLeg.dividendYield, profitAndLossChartLeg.optionInstrument.getContractType() == OptionContractType.PUT))).multiply(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        return bigDecimalMultiply2;
    }

    public final Function1<BigDecimal, BigDecimal> toTheoreticalPriceDerivativeFunction(int quantity, Instant evaluationTime) {
        Intrinsics.checkNotNullParameter(evaluationTime, "evaluationTime");
        final double yearsToExpiration = getYearsToExpiration(evaluationTime);
        BigDecimal bigDecimalMultiply = this.optionChain.getTradeValueMultiplier().multiply(BigDecimals7.toBigDecimal(Integer.valueOf(this.ratioQuantity)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(this.side.getDirection().getMultiplier());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        final BigDecimal bigDecimalMultiply3 = bigDecimalMultiply2.multiply(BigDecimals7.toBigDecimal(Integer.valueOf(quantity)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
        return new Function1() { // from class: com.robinhood.android.trade.options.profitloss.local.ProfitAndLossChartLeg$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitAndLossChartLeg.toTheoreticalPriceDerivativeFunction$lambda$2(this.f$0, yearsToExpiration, bigDecimalMultiply3, (BigDecimal) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal toTheoreticalPriceDerivativeFunction$lambda$2(ProfitAndLossChartLeg profitAndLossChartLeg, double d, BigDecimal bigDecimal, BigDecimal x) {
        Intrinsics.checkNotNullParameter(x, "x");
        if (profitAndLossChartLeg.isEuropean()) {
            BigDecimal bigDecimalMultiply = BigDecimals7.toBigDecimal(Double.valueOf(BjerksundStensland.blackScholesModelDelta(x.doubleValue(), profitAndLossChartLeg.optionInstrument.getStrikePrice().doubleValue(), d, profitAndLossChartLeg.impliedVolatility, profitAndLossChartLeg.interestRate, profitAndLossChartLeg.dividendYield, profitAndLossChartLeg.optionInstrument.getContractType() == OptionContractType.PUT))).multiply(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            return bigDecimalMultiply;
        }
        BigDecimal bigDecimalMultiply2 = BigDecimals7.toBigDecimal(Double.valueOf(BjerksundStensland.bjerksundStenslandDelta(x.doubleValue(), profitAndLossChartLeg.optionInstrument.getStrikePrice().doubleValue(), d, profitAndLossChartLeg.impliedVolatility, profitAndLossChartLeg.interestRate, profitAndLossChartLeg.dividendYield, profitAndLossChartLeg.optionInstrument.getContractType() == OptionContractType.PUT, (128 & 128) != 0 ? 1.0E-4d : 0.0d))).multiply(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        return bigDecimalMultiply2;
    }

    private final double getYearsToExpiration(Instant evaluationTime) {
        if (evaluationTime.compareTo(this.expirationTime) < 0) {
            return Duration.m28741getInWholeSecondsimpl(this.expirationTime.m28850minus5sfh64U(evaluationTime)) / 3.1536E7d;
        }
        return 0.0d;
    }
}
