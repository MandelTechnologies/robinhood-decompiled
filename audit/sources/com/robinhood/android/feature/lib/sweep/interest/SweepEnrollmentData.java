package com.robinhood.android.feature.lib.sweep.interest;

import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.models.p320db.mcduckling.SweepsTimelineSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepEnrollmentData.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "", "sweepInterest", "Lcom/robinhood/models/db/mcduckling/SweepsInterest;", "isSweepEnrolled", "", "sweepTimelineSummary", "Lcom/robinhood/models/db/mcduckling/SweepsTimelineSummary;", "<init>", "(Lcom/robinhood/models/db/mcduckling/SweepsInterest;ZLcom/robinhood/models/db/mcduckling/SweepsTimelineSummary;)V", "getSweepInterest", "()Lcom/robinhood/models/db/mcduckling/SweepsInterest;", "()Z", "getSweepTimelineSummary", "()Lcom/robinhood/models/db/mcduckling/SweepsTimelineSummary;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SweepEnrollmentData {
    private final boolean isSweepEnrolled;
    private final SweepsInterest sweepInterest;
    private final SweepsTimelineSummary sweepTimelineSummary;

    public static /* synthetic */ SweepEnrollmentData copy$default(SweepEnrollmentData sweepEnrollmentData, SweepsInterest sweepsInterest, boolean z, SweepsTimelineSummary sweepsTimelineSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            sweepsInterest = sweepEnrollmentData.sweepInterest;
        }
        if ((i & 2) != 0) {
            z = sweepEnrollmentData.isSweepEnrolled;
        }
        if ((i & 4) != 0) {
            sweepsTimelineSummary = sweepEnrollmentData.sweepTimelineSummary;
        }
        return sweepEnrollmentData.copy(sweepsInterest, z, sweepsTimelineSummary);
    }

    /* renamed from: component1, reason: from getter */
    public final SweepsInterest getSweepInterest() {
        return this.sweepInterest;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSweepEnrolled() {
        return this.isSweepEnrolled;
    }

    /* renamed from: component3, reason: from getter */
    public final SweepsTimelineSummary getSweepTimelineSummary() {
        return this.sweepTimelineSummary;
    }

    public final SweepEnrollmentData copy(SweepsInterest sweepInterest, boolean isSweepEnrolled, SweepsTimelineSummary sweepTimelineSummary) {
        Intrinsics.checkNotNullParameter(sweepInterest, "sweepInterest");
        Intrinsics.checkNotNullParameter(sweepTimelineSummary, "sweepTimelineSummary");
        return new SweepEnrollmentData(sweepInterest, isSweepEnrolled, sweepTimelineSummary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SweepEnrollmentData)) {
            return false;
        }
        SweepEnrollmentData sweepEnrollmentData = (SweepEnrollmentData) other;
        return Intrinsics.areEqual(this.sweepInterest, sweepEnrollmentData.sweepInterest) && this.isSweepEnrolled == sweepEnrollmentData.isSweepEnrolled && Intrinsics.areEqual(this.sweepTimelineSummary, sweepEnrollmentData.sweepTimelineSummary);
    }

    public int hashCode() {
        return (((this.sweepInterest.hashCode() * 31) + Boolean.hashCode(this.isSweepEnrolled)) * 31) + this.sweepTimelineSummary.hashCode();
    }

    public String toString() {
        return "SweepEnrollmentData(sweepInterest=" + this.sweepInterest + ", isSweepEnrolled=" + this.isSweepEnrolled + ", sweepTimelineSummary=" + this.sweepTimelineSummary + ")";
    }

    public SweepEnrollmentData(SweepsInterest sweepInterest, boolean z, SweepsTimelineSummary sweepTimelineSummary) {
        Intrinsics.checkNotNullParameter(sweepInterest, "sweepInterest");
        Intrinsics.checkNotNullParameter(sweepTimelineSummary, "sweepTimelineSummary");
        this.sweepInterest = sweepInterest;
        this.isSweepEnrolled = z;
        this.sweepTimelineSummary = sweepTimelineSummary;
    }

    public final SweepsInterest getSweepInterest() {
        return this.sweepInterest;
    }

    public final boolean isSweepEnrolled() {
        return this.isSweepEnrolled;
    }

    public final SweepsTimelineSummary getSweepTimelineSummary() {
        return this.sweepTimelineSummary;
    }
}
