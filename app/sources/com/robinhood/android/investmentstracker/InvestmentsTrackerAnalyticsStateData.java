package com.robinhood.android.investmentstracker;

import kotlin.Metadata;

/* compiled from: InvestmentsTrackerAnalyticsStateData.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/InvestmentsTrackerAnalyticsStateData;", "", "inHomeExperience", "", "inAllocationsView", "inAccountExperience", "<init>", "(ZZZ)V", "getInHomeExperience", "()Z", "getInAllocationsView", "getInAccountExperience", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestmentsTrackerAnalyticsStateData {
    public static final int $stable = 0;
    private final boolean inAccountExperience;
    private final boolean inAllocationsView;
    private final boolean inHomeExperience;

    public static /* synthetic */ InvestmentsTrackerAnalyticsStateData copy$default(InvestmentsTrackerAnalyticsStateData investmentsTrackerAnalyticsStateData, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = investmentsTrackerAnalyticsStateData.inHomeExperience;
        }
        if ((i & 2) != 0) {
            z2 = investmentsTrackerAnalyticsStateData.inAllocationsView;
        }
        if ((i & 4) != 0) {
            z3 = investmentsTrackerAnalyticsStateData.inAccountExperience;
        }
        return investmentsTrackerAnalyticsStateData.copy(z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getInHomeExperience() {
        return this.inHomeExperience;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getInAllocationsView() {
        return this.inAllocationsView;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInAccountExperience() {
        return this.inAccountExperience;
    }

    public final InvestmentsTrackerAnalyticsStateData copy(boolean inHomeExperience, boolean inAllocationsView, boolean inAccountExperience) {
        return new InvestmentsTrackerAnalyticsStateData(inHomeExperience, inAllocationsView, inAccountExperience);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerAnalyticsStateData)) {
            return false;
        }
        InvestmentsTrackerAnalyticsStateData investmentsTrackerAnalyticsStateData = (InvestmentsTrackerAnalyticsStateData) other;
        return this.inHomeExperience == investmentsTrackerAnalyticsStateData.inHomeExperience && this.inAllocationsView == investmentsTrackerAnalyticsStateData.inAllocationsView && this.inAccountExperience == investmentsTrackerAnalyticsStateData.inAccountExperience;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.inHomeExperience) * 31) + Boolean.hashCode(this.inAllocationsView)) * 31) + Boolean.hashCode(this.inAccountExperience);
    }

    public String toString() {
        return "InvestmentsTrackerAnalyticsStateData(inHomeExperience=" + this.inHomeExperience + ", inAllocationsView=" + this.inAllocationsView + ", inAccountExperience=" + this.inAccountExperience + ")";
    }

    public InvestmentsTrackerAnalyticsStateData(boolean z, boolean z2, boolean z3) {
        this.inHomeExperience = z;
        this.inAllocationsView = z2;
        this.inAccountExperience = z3;
    }

    public final boolean getInHomeExperience() {
        return this.inHomeExperience;
    }

    public final boolean getInAllocationsView() {
        return this.inAllocationsView;
    }

    public final boolean getInAccountExperience() {
        return this.inAccountExperience;
    }
}
