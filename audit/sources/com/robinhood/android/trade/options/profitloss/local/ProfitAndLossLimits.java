package com.robinhood.android.trade.options.profitloss.local;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossChart.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimits;", "", "leftLimit", "Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;", "rightLimit", "<init>", "(Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;)V", "getLeftLimit", "()Lcom/robinhood/android/trade/options/profitloss/local/ProfitAndLossLimit;", "getRightLimit", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ProfitAndLossLimits {
    public static final int $stable = 8;
    private final ProfitAndLossLimit leftLimit;
    private final ProfitAndLossLimit rightLimit;

    public static /* synthetic */ ProfitAndLossLimits copy$default(ProfitAndLossLimits profitAndLossLimits, ProfitAndLossLimit profitAndLossLimit, ProfitAndLossLimit profitAndLossLimit2, int i, Object obj) {
        if ((i & 1) != 0) {
            profitAndLossLimit = profitAndLossLimits.leftLimit;
        }
        if ((i & 2) != 0) {
            profitAndLossLimit2 = profitAndLossLimits.rightLimit;
        }
        return profitAndLossLimits.copy(profitAndLossLimit, profitAndLossLimit2);
    }

    /* renamed from: component1, reason: from getter */
    public final ProfitAndLossLimit getLeftLimit() {
        return this.leftLimit;
    }

    /* renamed from: component2, reason: from getter */
    public final ProfitAndLossLimit getRightLimit() {
        return this.rightLimit;
    }

    public final ProfitAndLossLimits copy(ProfitAndLossLimit leftLimit, ProfitAndLossLimit rightLimit) {
        Intrinsics.checkNotNullParameter(leftLimit, "leftLimit");
        Intrinsics.checkNotNullParameter(rightLimit, "rightLimit");
        return new ProfitAndLossLimits(leftLimit, rightLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitAndLossLimits)) {
            return false;
        }
        ProfitAndLossLimits profitAndLossLimits = (ProfitAndLossLimits) other;
        return Intrinsics.areEqual(this.leftLimit, profitAndLossLimits.leftLimit) && Intrinsics.areEqual(this.rightLimit, profitAndLossLimits.rightLimit);
    }

    public int hashCode() {
        return (this.leftLimit.hashCode() * 31) + this.rightLimit.hashCode();
    }

    public String toString() {
        return "ProfitAndLossLimits(leftLimit=" + this.leftLimit + ", rightLimit=" + this.rightLimit + ")";
    }

    public ProfitAndLossLimits(ProfitAndLossLimit leftLimit, ProfitAndLossLimit rightLimit) {
        Intrinsics.checkNotNullParameter(leftLimit, "leftLimit");
        Intrinsics.checkNotNullParameter(rightLimit, "rightLimit");
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit;
    }

    public final ProfitAndLossLimit getLeftLimit() {
        return this.leftLimit;
    }

    public final ProfitAndLossLimit getRightLimit() {
        return this.rightLimit;
    }
}
