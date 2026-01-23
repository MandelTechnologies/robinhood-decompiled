package com.robinhood.android.trade.options.profitloss.local;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossChart.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;", "", "type", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimitType;", "profitOrLoss", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimitType;Ljava/math/BigDecimal;)V", "getType", "()Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimitType;", "getProfitOrLoss", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ProfitAndLossLimit {
    public static final int $stable = 8;
    private final BigDecimal profitOrLoss;
    private final ProfitAndLossLimitType type;

    public static /* synthetic */ ProfitAndLossLimit copy$default(ProfitAndLossLimit profitAndLossLimit, ProfitAndLossLimitType profitAndLossLimitType, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            profitAndLossLimitType = profitAndLossLimit.type;
        }
        if ((i & 2) != 0) {
            bigDecimal = profitAndLossLimit.profitOrLoss;
        }
        return profitAndLossLimit.copy(profitAndLossLimitType, bigDecimal);
    }

    /* renamed from: component1, reason: from getter */
    public final ProfitAndLossLimitType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getProfitOrLoss() {
        return this.profitOrLoss;
    }

    public final ProfitAndLossLimit copy(ProfitAndLossLimitType type2, BigDecimal profitOrLoss) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return new ProfitAndLossLimit(type2, profitOrLoss);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitAndLossLimit)) {
            return false;
        }
        ProfitAndLossLimit profitAndLossLimit = (ProfitAndLossLimit) other;
        return this.type == profitAndLossLimit.type && Intrinsics.areEqual(this.profitOrLoss, profitAndLossLimit.profitOrLoss);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        BigDecimal bigDecimal = this.profitOrLoss;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public String toString() {
        return "ProfitAndLossLimit(type=" + this.type + ", profitOrLoss=" + this.profitOrLoss + ")";
    }

    public ProfitAndLossLimit(ProfitAndLossLimitType type2, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.type = type2;
        this.profitOrLoss = bigDecimal;
    }

    public /* synthetic */ ProfitAndLossLimit(ProfitAndLossLimitType profitAndLossLimitType, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(profitAndLossLimitType, (i & 2) != 0 ? null : bigDecimal);
    }

    public final ProfitAndLossLimitType getType() {
        return this.type;
    }

    public final BigDecimal getProfitOrLoss() {
        return this.profitOrLoss;
    }
}
