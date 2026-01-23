package com.robinhood.librobinhood.data.store;

import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollment;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.utils.Optional;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepsStatusStore.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\b\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SweepsStatus;", "", "sweepEligible", "", "sweepEnrollment", "Lcom/robinhood/lib/sweep/enrollment/api/ApiSweepEnrollment;", "sweepInterest", "Lcom/robinhood/models/db/mcduckling/SweepsInterest;", "<init>", "(ZLcom/robinhood/lib/sweep/enrollment/api/ApiSweepEnrollment;Lcom/robinhood/models/db/mcduckling/SweepsInterest;)V", "Lcom/robinhood/utils/Optional;", "(ZLcom/robinhood/lib/sweep/enrollment/api/ApiSweepEnrollment;Lcom/robinhood/utils/Optional;)V", "getSweepEligible", "()Z", "getSweepEnrollment", "()Lcom/robinhood/lib/sweep/enrollment/api/ApiSweepEnrollment;", "getSweepInterest", "()Lcom/robinhood/models/db/mcduckling/SweepsInterest;", "sweepInterestRate", "Ljava/math/BigDecimal;", "getSweepInterestRate", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SweepsStatus {
    private final boolean sweepEligible;
    private final ApiSweepEnrollment sweepEnrollment;
    private final SweepsInterest sweepInterest;

    public static /* synthetic */ SweepsStatus copy$default(SweepsStatus sweepsStatus, boolean z, ApiSweepEnrollment apiSweepEnrollment, SweepsInterest sweepsInterest, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sweepsStatus.sweepEligible;
        }
        if ((i & 2) != 0) {
            apiSweepEnrollment = sweepsStatus.sweepEnrollment;
        }
        if ((i & 4) != 0) {
            sweepsInterest = sweepsStatus.sweepInterest;
        }
        return sweepsStatus.copy(z, apiSweepEnrollment, sweepsInterest);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSweepEligible() {
        return this.sweepEligible;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiSweepEnrollment getSweepEnrollment() {
        return this.sweepEnrollment;
    }

    /* renamed from: component3, reason: from getter */
    public final SweepsInterest getSweepInterest() {
        return this.sweepInterest;
    }

    public final SweepsStatus copy(boolean sweepEligible, ApiSweepEnrollment sweepEnrollment, SweepsInterest sweepInterest) {
        Intrinsics.checkNotNullParameter(sweepEnrollment, "sweepEnrollment");
        return new SweepsStatus(sweepEligible, sweepEnrollment, sweepInterest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SweepsStatus)) {
            return false;
        }
        SweepsStatus sweepsStatus = (SweepsStatus) other;
        return this.sweepEligible == sweepsStatus.sweepEligible && Intrinsics.areEqual(this.sweepEnrollment, sweepsStatus.sweepEnrollment) && Intrinsics.areEqual(this.sweepInterest, sweepsStatus.sweepInterest);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.sweepEligible) * 31) + this.sweepEnrollment.hashCode()) * 31;
        SweepsInterest sweepsInterest = this.sweepInterest;
        return iHashCode + (sweepsInterest == null ? 0 : sweepsInterest.hashCode());
    }

    public String toString() {
        return "SweepsStatus(sweepEligible=" + this.sweepEligible + ", sweepEnrollment=" + this.sweepEnrollment + ", sweepInterest=" + this.sweepInterest + ")";
    }

    public SweepsStatus(boolean z, ApiSweepEnrollment sweepEnrollment, SweepsInterest sweepsInterest) {
        Intrinsics.checkNotNullParameter(sweepEnrollment, "sweepEnrollment");
        this.sweepEligible = z;
        this.sweepEnrollment = sweepEnrollment;
        this.sweepInterest = sweepsInterest;
    }

    public final boolean getSweepEligible() {
        return this.sweepEligible;
    }

    public final ApiSweepEnrollment getSweepEnrollment() {
        return this.sweepEnrollment;
    }

    public final SweepsInterest getSweepInterest() {
        return this.sweepInterest;
    }

    public final BigDecimal getSweepInterestRate() {
        SweepsInterest sweepsInterest = this.sweepInterest;
        if (sweepsInterest != null) {
            return sweepsInterest.getInterestRate();
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SweepsStatus(boolean z, ApiSweepEnrollment sweepEnrollment, Optional<SweepsInterest> sweepInterest) {
        this(z, sweepEnrollment, sweepInterest.getOrNull());
        Intrinsics.checkNotNullParameter(sweepEnrollment, "sweepEnrollment");
        Intrinsics.checkNotNullParameter(sweepInterest, "sweepInterest");
    }
}
