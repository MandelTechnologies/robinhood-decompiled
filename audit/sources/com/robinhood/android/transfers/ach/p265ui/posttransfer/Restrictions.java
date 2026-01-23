package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import kotlin.Metadata;

/* compiled from: AchTransferInstantDepositViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/Restrictions;", "", "textRes", "", "learnMoreLink", "<init>", "(II)V", "getTextRes", "()I", "getLearnMoreLink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Restrictions {
    public static final int $stable = 0;
    private final int learnMoreLink;
    private final int textRes;

    public static /* synthetic */ Restrictions copy$default(Restrictions restrictions, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = restrictions.textRes;
        }
        if ((i3 & 2) != 0) {
            i2 = restrictions.learnMoreLink;
        }
        return restrictions.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTextRes() {
        return this.textRes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLearnMoreLink() {
        return this.learnMoreLink;
    }

    public final Restrictions copy(int textRes, int learnMoreLink) {
        return new Restrictions(textRes, learnMoreLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Restrictions)) {
            return false;
        }
        Restrictions restrictions = (Restrictions) other;
        return this.textRes == restrictions.textRes && this.learnMoreLink == restrictions.learnMoreLink;
    }

    public int hashCode() {
        return (Integer.hashCode(this.textRes) * 31) + Integer.hashCode(this.learnMoreLink);
    }

    public String toString() {
        return "Restrictions(textRes=" + this.textRes + ", learnMoreLink=" + this.learnMoreLink + ")";
    }

    public Restrictions(int i, int i2) {
        this.textRes = i;
        this.learnMoreLink = i2;
    }

    public final int getTextRes() {
        return this.textRes;
    }

    public final int getLearnMoreLink() {
        return this.learnMoreLink;
    }
}
