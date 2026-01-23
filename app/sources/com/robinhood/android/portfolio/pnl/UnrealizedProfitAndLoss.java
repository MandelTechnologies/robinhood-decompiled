package com.robinhood.android.portfolio.pnl;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnrealizedProfitAndLoss.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLoss;", "", "marketValue", "Ljava/math/BigDecimal;", "todaysReturn", "totalReturn", "costForTodaysReturn", "costForTotalReturn", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getMarketValue", "()Ljava/math/BigDecimal;", "getTodaysReturn", "getTotalReturn", "getCostForTodaysReturn", "getCostForTotalReturn", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-profit-and-loss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UnrealizedProfitAndLoss {
    public static final int $stable = 8;
    private final BigDecimal costForTodaysReturn;
    private final BigDecimal costForTotalReturn;
    private final BigDecimal marketValue;
    private final BigDecimal todaysReturn;
    private final BigDecimal totalReturn;

    public static /* synthetic */ UnrealizedProfitAndLoss copy$default(UnrealizedProfitAndLoss unrealizedProfitAndLoss, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = unrealizedProfitAndLoss.marketValue;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = unrealizedProfitAndLoss.todaysReturn;
        }
        if ((i & 4) != 0) {
            bigDecimal3 = unrealizedProfitAndLoss.totalReturn;
        }
        if ((i & 8) != 0) {
            bigDecimal4 = unrealizedProfitAndLoss.costForTodaysReturn;
        }
        if ((i & 16) != 0) {
            bigDecimal5 = unrealizedProfitAndLoss.costForTotalReturn;
        }
        BigDecimal bigDecimal6 = bigDecimal5;
        BigDecimal bigDecimal7 = bigDecimal3;
        return unrealizedProfitAndLoss.copy(bigDecimal, bigDecimal2, bigDecimal7, bigDecimal4, bigDecimal6);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getMarketValue() {
        return this.marketValue;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getTodaysReturn() {
        return this.todaysReturn;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getTotalReturn() {
        return this.totalReturn;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getCostForTodaysReturn() {
        return this.costForTodaysReturn;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getCostForTotalReturn() {
        return this.costForTotalReturn;
    }

    public final UnrealizedProfitAndLoss copy(BigDecimal marketValue, BigDecimal todaysReturn, BigDecimal totalReturn, BigDecimal costForTodaysReturn, BigDecimal costForTotalReturn) {
        Intrinsics.checkNotNullParameter(marketValue, "marketValue");
        Intrinsics.checkNotNullParameter(todaysReturn, "todaysReturn");
        Intrinsics.checkNotNullParameter(totalReturn, "totalReturn");
        Intrinsics.checkNotNullParameter(costForTodaysReturn, "costForTodaysReturn");
        Intrinsics.checkNotNullParameter(costForTotalReturn, "costForTotalReturn");
        return new UnrealizedProfitAndLoss(marketValue, todaysReturn, totalReturn, costForTodaysReturn, costForTotalReturn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnrealizedProfitAndLoss)) {
            return false;
        }
        UnrealizedProfitAndLoss unrealizedProfitAndLoss = (UnrealizedProfitAndLoss) other;
        return Intrinsics.areEqual(this.marketValue, unrealizedProfitAndLoss.marketValue) && Intrinsics.areEqual(this.todaysReturn, unrealizedProfitAndLoss.todaysReturn) && Intrinsics.areEqual(this.totalReturn, unrealizedProfitAndLoss.totalReturn) && Intrinsics.areEqual(this.costForTodaysReturn, unrealizedProfitAndLoss.costForTodaysReturn) && Intrinsics.areEqual(this.costForTotalReturn, unrealizedProfitAndLoss.costForTotalReturn);
    }

    public int hashCode() {
        return (((((((this.marketValue.hashCode() * 31) + this.todaysReturn.hashCode()) * 31) + this.totalReturn.hashCode()) * 31) + this.costForTodaysReturn.hashCode()) * 31) + this.costForTotalReturn.hashCode();
    }

    public String toString() {
        return "UnrealizedProfitAndLoss(marketValue=" + this.marketValue + ", todaysReturn=" + this.todaysReturn + ", totalReturn=" + this.totalReturn + ", costForTodaysReturn=" + this.costForTodaysReturn + ", costForTotalReturn=" + this.costForTotalReturn + ")";
    }

    public UnrealizedProfitAndLoss(BigDecimal marketValue, BigDecimal todaysReturn, BigDecimal totalReturn, BigDecimal costForTodaysReturn, BigDecimal costForTotalReturn) {
        Intrinsics.checkNotNullParameter(marketValue, "marketValue");
        Intrinsics.checkNotNullParameter(todaysReturn, "todaysReturn");
        Intrinsics.checkNotNullParameter(totalReturn, "totalReturn");
        Intrinsics.checkNotNullParameter(costForTodaysReturn, "costForTodaysReturn");
        Intrinsics.checkNotNullParameter(costForTotalReturn, "costForTotalReturn");
        this.marketValue = marketValue;
        this.todaysReturn = todaysReturn;
        this.totalReturn = totalReturn;
        this.costForTodaysReturn = costForTodaysReturn;
        this.costForTotalReturn = costForTotalReturn;
    }

    public final BigDecimal getMarketValue() {
        return this.marketValue;
    }

    public final BigDecimal getTodaysReturn() {
        return this.todaysReturn;
    }

    public final BigDecimal getTotalReturn() {
        return this.totalReturn;
    }

    public final BigDecimal getCostForTodaysReturn() {
        return this.costForTodaysReturn;
    }

    public final BigDecimal getCostForTotalReturn() {
        return this.costForTotalReturn;
    }
}
