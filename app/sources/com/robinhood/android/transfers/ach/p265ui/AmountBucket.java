package com.robinhood.android.transfers.ach.p265ui;

import kotlin.Metadata;

/* compiled from: SuggestedAmount.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/AmountBucket;", "", "lowAmount", "", "mediumAmount", "highAmount", "<init>", "(III)V", "getLowAmount", "()I", "getMediumAmount", "getHighAmount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AmountBucket {
    public static final int $stable = 0;
    private final int highAmount;
    private final int lowAmount;
    private final int mediumAmount;

    public static /* synthetic */ AmountBucket copy$default(AmountBucket amountBucket, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = amountBucket.lowAmount;
        }
        if ((i4 & 2) != 0) {
            i2 = amountBucket.mediumAmount;
        }
        if ((i4 & 4) != 0) {
            i3 = amountBucket.highAmount;
        }
        return amountBucket.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLowAmount() {
        return this.lowAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMediumAmount() {
        return this.mediumAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHighAmount() {
        return this.highAmount;
    }

    public final AmountBucket copy(int lowAmount, int mediumAmount, int highAmount) {
        return new AmountBucket(lowAmount, mediumAmount, highAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmountBucket)) {
            return false;
        }
        AmountBucket amountBucket = (AmountBucket) other;
        return this.lowAmount == amountBucket.lowAmount && this.mediumAmount == amountBucket.mediumAmount && this.highAmount == amountBucket.highAmount;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.lowAmount) * 31) + Integer.hashCode(this.mediumAmount)) * 31) + Integer.hashCode(this.highAmount);
    }

    public String toString() {
        return "AmountBucket(lowAmount=" + this.lowAmount + ", mediumAmount=" + this.mediumAmount + ", highAmount=" + this.highAmount + ")";
    }

    public AmountBucket(int i, int i2, int i3) {
        this.lowAmount = i;
        this.mediumAmount = i2;
        this.highAmount = i3;
    }

    public final int getLowAmount() {
        return this.lowAmount;
    }

    public final int getMediumAmount() {
        return this.mediumAmount;
    }

    public final int getHighAmount() {
        return this.highAmount;
    }
}
