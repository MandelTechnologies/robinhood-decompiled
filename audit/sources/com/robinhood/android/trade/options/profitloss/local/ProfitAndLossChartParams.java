package com.robinhood.android.trade.options.profitloss.local;

import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.datetime.Instant;

/* compiled from: ProfitAndLossChartParams.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jm\u0010.\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\bHÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartParams;", "", "legs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossChartLeg;", "underlying", "Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;", "quantity", "", "optionOrderPrice", "Lcom/robinhood/models/util/Money;", "equityPositionQuantity", "Ljava/math/BigDecimal;", "equityPositionAverageCost", "underlyingPrice", "expirationType", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitLossChartExpirationType;", "evaluationTime", "Lkotlinx/datetime/Instant;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;ILcom/robinhood/models/util/Money;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/util/Money;Lcom/robinhood/android/trade/options/profitloss/local/ProfitLossChartExpirationType;Lkotlinx/datetime/Instant;)V", "getLegs", "()Lkotlinx/collections/immutable/ImmutableList;", "getUnderlying", "()Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;", "getQuantity", "()I", "getOptionOrderPrice", "()Lcom/robinhood/models/util/Money;", "getEquityPositionQuantity", "()Ljava/math/BigDecimal;", "getEquityPositionAverageCost", "getUnderlyingPrice", "getExpirationType", "()Lcom/robinhood/android/trade/options/profitloss/local/ProfitLossChartExpirationType;", "getEvaluationTime", "()Lkotlinx/datetime/Instant;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ProfitAndLossChartParams {
    public static final int $stable = 8;
    private final BigDecimal equityPositionAverageCost;
    private final BigDecimal equityPositionQuantity;
    private final Instant evaluationTime;
    private final ProfitLossAtExpiration4 expirationType;
    private final ImmutableList<ProfitAndLossChartLeg> legs;
    private final Money optionOrderPrice;
    private final int quantity;
    private final OptionSimulatedChartBundle5 underlying;
    private final Money underlyingPrice;

    public static /* synthetic */ ProfitAndLossChartParams copy$default(ProfitAndLossChartParams profitAndLossChartParams, ImmutableList immutableList, OptionSimulatedChartBundle5 optionSimulatedChartBundle5, int i, Money money, BigDecimal bigDecimal, BigDecimal bigDecimal2, Money money2, ProfitLossAtExpiration4 profitLossAtExpiration4, Instant instant, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            immutableList = profitAndLossChartParams.legs;
        }
        if ((i2 & 2) != 0) {
            optionSimulatedChartBundle5 = profitAndLossChartParams.underlying;
        }
        if ((i2 & 4) != 0) {
            i = profitAndLossChartParams.quantity;
        }
        if ((i2 & 8) != 0) {
            money = profitAndLossChartParams.optionOrderPrice;
        }
        if ((i2 & 16) != 0) {
            bigDecimal = profitAndLossChartParams.equityPositionQuantity;
        }
        if ((i2 & 32) != 0) {
            bigDecimal2 = profitAndLossChartParams.equityPositionAverageCost;
        }
        if ((i2 & 64) != 0) {
            money2 = profitAndLossChartParams.underlyingPrice;
        }
        if ((i2 & 128) != 0) {
            profitLossAtExpiration4 = profitAndLossChartParams.expirationType;
        }
        if ((i2 & 256) != 0) {
            instant = profitAndLossChartParams.evaluationTime;
        }
        ProfitLossAtExpiration4 profitLossAtExpiration42 = profitLossAtExpiration4;
        Instant instant2 = instant;
        BigDecimal bigDecimal3 = bigDecimal2;
        Money money3 = money2;
        BigDecimal bigDecimal4 = bigDecimal;
        int i3 = i;
        return profitAndLossChartParams.copy(immutableList, optionSimulatedChartBundle5, i3, money, bigDecimal4, bigDecimal3, money3, profitLossAtExpiration42, instant2);
    }

    public final ImmutableList<ProfitAndLossChartLeg> component1() {
        return this.legs;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionSimulatedChartBundle5 getUnderlying() {
        return this.underlying;
    }

    /* renamed from: component3, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getOptionOrderPrice() {
        return this.optionOrderPrice;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getEquityPositionQuantity() {
        return this.equityPositionQuantity;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getEquityPositionAverageCost() {
        return this.equityPositionAverageCost;
    }

    /* renamed from: component7, reason: from getter */
    public final Money getUnderlyingPrice() {
        return this.underlyingPrice;
    }

    /* renamed from: component8, reason: from getter */
    public final ProfitLossAtExpiration4 getExpirationType() {
        return this.expirationType;
    }

    /* renamed from: component9, reason: from getter */
    public final Instant getEvaluationTime() {
        return this.evaluationTime;
    }

    public final ProfitAndLossChartParams copy(ImmutableList<ProfitAndLossChartLeg> legs, OptionSimulatedChartBundle5 underlying, int quantity, Money optionOrderPrice, BigDecimal equityPositionQuantity, BigDecimal equityPositionAverageCost, Money underlyingPrice, ProfitLossAtExpiration4 expirationType, Instant evaluationTime) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(optionOrderPrice, "optionOrderPrice");
        Intrinsics.checkNotNullParameter(equityPositionQuantity, "equityPositionQuantity");
        Intrinsics.checkNotNullParameter(equityPositionAverageCost, "equityPositionAverageCost");
        Intrinsics.checkNotNullParameter(underlyingPrice, "underlyingPrice");
        Intrinsics.checkNotNullParameter(expirationType, "expirationType");
        return new ProfitAndLossChartParams(legs, underlying, quantity, optionOrderPrice, equityPositionQuantity, equityPositionAverageCost, underlyingPrice, expirationType, evaluationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitAndLossChartParams)) {
            return false;
        }
        ProfitAndLossChartParams profitAndLossChartParams = (ProfitAndLossChartParams) other;
        return Intrinsics.areEqual(this.legs, profitAndLossChartParams.legs) && Intrinsics.areEqual(this.underlying, profitAndLossChartParams.underlying) && this.quantity == profitAndLossChartParams.quantity && Intrinsics.areEqual(this.optionOrderPrice, profitAndLossChartParams.optionOrderPrice) && Intrinsics.areEqual(this.equityPositionQuantity, profitAndLossChartParams.equityPositionQuantity) && Intrinsics.areEqual(this.equityPositionAverageCost, profitAndLossChartParams.equityPositionAverageCost) && Intrinsics.areEqual(this.underlyingPrice, profitAndLossChartParams.underlyingPrice) && this.expirationType == profitAndLossChartParams.expirationType && Intrinsics.areEqual(this.evaluationTime, profitAndLossChartParams.evaluationTime);
    }

    public int hashCode() {
        int iHashCode = this.legs.hashCode() * 31;
        OptionSimulatedChartBundle5 optionSimulatedChartBundle5 = this.underlying;
        int iHashCode2 = (((((((((((((iHashCode + (optionSimulatedChartBundle5 == null ? 0 : optionSimulatedChartBundle5.hashCode())) * 31) + Integer.hashCode(this.quantity)) * 31) + this.optionOrderPrice.hashCode()) * 31) + this.equityPositionQuantity.hashCode()) * 31) + this.equityPositionAverageCost.hashCode()) * 31) + this.underlyingPrice.hashCode()) * 31) + this.expirationType.hashCode()) * 31;
        Instant instant = this.evaluationTime;
        return iHashCode2 + (instant != null ? instant.hashCode() : 0);
    }

    public String toString() {
        return "ProfitAndLossChartParams(legs=" + this.legs + ", underlying=" + this.underlying + ", quantity=" + this.quantity + ", optionOrderPrice=" + this.optionOrderPrice + ", equityPositionQuantity=" + this.equityPositionQuantity + ", equityPositionAverageCost=" + this.equityPositionAverageCost + ", underlyingPrice=" + this.underlyingPrice + ", expirationType=" + this.expirationType + ", evaluationTime=" + this.evaluationTime + ")";
    }

    public ProfitAndLossChartParams(ImmutableList<ProfitAndLossChartLeg> legs, OptionSimulatedChartBundle5 optionSimulatedChartBundle5, int i, Money optionOrderPrice, BigDecimal equityPositionQuantity, BigDecimal equityPositionAverageCost, Money underlyingPrice, ProfitLossAtExpiration4 expirationType, Instant instant) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(optionOrderPrice, "optionOrderPrice");
        Intrinsics.checkNotNullParameter(equityPositionQuantity, "equityPositionQuantity");
        Intrinsics.checkNotNullParameter(equityPositionAverageCost, "equityPositionAverageCost");
        Intrinsics.checkNotNullParameter(underlyingPrice, "underlyingPrice");
        Intrinsics.checkNotNullParameter(expirationType, "expirationType");
        this.legs = legs;
        this.underlying = optionSimulatedChartBundle5;
        this.quantity = i;
        this.optionOrderPrice = optionOrderPrice;
        this.equityPositionQuantity = equityPositionQuantity;
        this.equityPositionAverageCost = equityPositionAverageCost;
        this.underlyingPrice = underlyingPrice;
        this.expirationType = expirationType;
        this.evaluationTime = instant;
    }

    public final ImmutableList<ProfitAndLossChartLeg> getLegs() {
        return this.legs;
    }

    public final OptionSimulatedChartBundle5 getUnderlying() {
        return this.underlying;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final Money getOptionOrderPrice() {
        return this.optionOrderPrice;
    }

    public final BigDecimal getEquityPositionQuantity() {
        return this.equityPositionQuantity;
    }

    public final BigDecimal getEquityPositionAverageCost() {
        return this.equityPositionAverageCost;
    }

    public final Money getUnderlyingPrice() {
        return this.underlyingPrice;
    }

    public final ProfitLossAtExpiration4 getExpirationType() {
        return this.expirationType;
    }

    public final Instant getEvaluationTime() {
        return this.evaluationTime;
    }
}
