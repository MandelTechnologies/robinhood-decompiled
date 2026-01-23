package com.robinhood.android.retirement.contributions;

import kotlin.Metadata;

/* compiled from: ContributionReviewMode.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/retirement/contributions/ContributionTypeRowState;", "", "locked", "", "textRes", "", "<init>", "(ZI)V", "getLocked", "()Z", "getTextRes", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "lib-retirement-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ContributionTypeRowState {
    public static final int $stable = 0;
    private final boolean locked;
    private final int textRes;

    public static /* synthetic */ ContributionTypeRowState copy$default(ContributionTypeRowState contributionTypeRowState, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = contributionTypeRowState.locked;
        }
        if ((i2 & 2) != 0) {
            i = contributionTypeRowState.textRes;
        }
        return contributionTypeRowState.copy(z, i);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLocked() {
        return this.locked;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTextRes() {
        return this.textRes;
    }

    public final ContributionTypeRowState copy(boolean locked, int textRes) {
        return new ContributionTypeRowState(locked, textRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributionTypeRowState)) {
            return false;
        }
        ContributionTypeRowState contributionTypeRowState = (ContributionTypeRowState) other;
        return this.locked == contributionTypeRowState.locked && this.textRes == contributionTypeRowState.textRes;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.locked) * 31) + Integer.hashCode(this.textRes);
    }

    public String toString() {
        return "ContributionTypeRowState(locked=" + this.locked + ", textRes=" + this.textRes + ")";
    }

    public ContributionTypeRowState(boolean z, int i) {
        this.locked = z;
        this.textRes = i;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final int getTextRes() {
        return this.textRes;
    }
}
