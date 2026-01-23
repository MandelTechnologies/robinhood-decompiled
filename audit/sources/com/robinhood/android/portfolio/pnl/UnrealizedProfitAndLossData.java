package com.robinhood.android.portfolio.pnl;

import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnrealizedProfitAndLossData.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossData;", "", "todaysReturn", "Lcom/robinhood/models/util/Money;", "todaysReturnPercentage", "Ljava/math/BigDecimal;", "totalReturn", "totalReturnPercentage", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/math/BigDecimal;Lcom/robinhood/models/util/Money;Ljava/math/BigDecimal;)V", "getTodaysReturn", "()Lcom/robinhood/models/util/Money;", "getTodaysReturnPercentage", "()Ljava/math/BigDecimal;", "getTotalReturn", "getTotalReturnPercentage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-profit-and-loss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UnrealizedProfitAndLossData {
    public static final int $stable = 8;
    private final Money todaysReturn;
    private final BigDecimal todaysReturnPercentage;
    private final Money totalReturn;
    private final BigDecimal totalReturnPercentage;

    public static /* synthetic */ UnrealizedProfitAndLossData copy$default(UnrealizedProfitAndLossData unrealizedProfitAndLossData, Money money, BigDecimal bigDecimal, Money money2, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            money = unrealizedProfitAndLossData.todaysReturn;
        }
        if ((i & 2) != 0) {
            bigDecimal = unrealizedProfitAndLossData.todaysReturnPercentage;
        }
        if ((i & 4) != 0) {
            money2 = unrealizedProfitAndLossData.totalReturn;
        }
        if ((i & 8) != 0) {
            bigDecimal2 = unrealizedProfitAndLossData.totalReturnPercentage;
        }
        return unrealizedProfitAndLossData.copy(money, bigDecimal, money2, bigDecimal2);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getTodaysReturn() {
        return this.todaysReturn;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getTodaysReturnPercentage() {
        return this.todaysReturnPercentage;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getTotalReturn() {
        return this.totalReturn;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getTotalReturnPercentage() {
        return this.totalReturnPercentage;
    }

    public final UnrealizedProfitAndLossData copy(Money todaysReturn, BigDecimal todaysReturnPercentage, Money totalReturn, BigDecimal totalReturnPercentage) {
        return new UnrealizedProfitAndLossData(todaysReturn, todaysReturnPercentage, totalReturn, totalReturnPercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnrealizedProfitAndLossData)) {
            return false;
        }
        UnrealizedProfitAndLossData unrealizedProfitAndLossData = (UnrealizedProfitAndLossData) other;
        return Intrinsics.areEqual(this.todaysReturn, unrealizedProfitAndLossData.todaysReturn) && Intrinsics.areEqual(this.todaysReturnPercentage, unrealizedProfitAndLossData.todaysReturnPercentage) && Intrinsics.areEqual(this.totalReturn, unrealizedProfitAndLossData.totalReturn) && Intrinsics.areEqual(this.totalReturnPercentage, unrealizedProfitAndLossData.totalReturnPercentage);
    }

    public int hashCode() {
        Money money = this.todaysReturn;
        int iHashCode = (money == null ? 0 : money.hashCode()) * 31;
        BigDecimal bigDecimal = this.todaysReturnPercentage;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Money money2 = this.totalReturn;
        int iHashCode3 = (iHashCode2 + (money2 == null ? 0 : money2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.totalReturnPercentage;
        return iHashCode3 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    public String toString() {
        return "UnrealizedProfitAndLossData(todaysReturn=" + this.todaysReturn + ", todaysReturnPercentage=" + this.todaysReturnPercentage + ", totalReturn=" + this.totalReturn + ", totalReturnPercentage=" + this.totalReturnPercentage + ")";
    }

    public UnrealizedProfitAndLossData(Money money, BigDecimal bigDecimal, Money money2, BigDecimal bigDecimal2) {
        this.todaysReturn = money;
        this.todaysReturnPercentage = bigDecimal;
        this.totalReturn = money2;
        this.totalReturnPercentage = bigDecimal2;
    }

    public final Money getTodaysReturn() {
        return this.todaysReturn;
    }

    public final BigDecimal getTodaysReturnPercentage() {
        return this.todaysReturnPercentage;
    }

    public final Money getTotalReturn() {
        return this.totalReturn;
    }

    public final BigDecimal getTotalReturnPercentage() {
        return this.totalReturnPercentage;
    }
}
