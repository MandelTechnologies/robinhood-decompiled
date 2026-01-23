package com.truelayer.payments.core.domain.payments;

import com.truelayer.payments.core.domain.payments.PeriodicLimits;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;

/* compiled from: MandateConstraints.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u001c\u001a\u00020\u001aJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0006\u0010\u001f\u001a\u00020\u001eJ\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006#"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/MandateConstraints;", "", "validFrom", "Lkotlinx/datetime/Instant;", "validTo", "maximumIndividualAmount", "", "periodicLimits", "Lcom/truelayer/payments/core/domain/payments/PeriodicLimits;", "(Lkotlinx/datetime/Instant;Lkotlinx/datetime/Instant;JLcom/truelayer/payments/core/domain/payments/PeriodicLimits;)V", "getMaximumIndividualAmount", "()J", "getPeriodicLimits", "()Lcom/truelayer/payments/core/domain/payments/PeriodicLimits;", "getValidFrom", "()Lkotlinx/datetime/Instant;", "getValidTo", "asList", "", "Lcom/truelayer/payments/core/domain/payments/PeriodicLimits$Limit;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hasPeriodicLimits", "hashCode", "", "numberOfPeriodicLimits", "toString", "", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MandateConstraints {
    private final long maximumIndividualAmount;
    private final PeriodicLimits periodicLimits;
    private final Instant validFrom;
    private final Instant validTo;

    public static /* synthetic */ MandateConstraints copy$default(MandateConstraints mandateConstraints, Instant instant, Instant instant2, long j, PeriodicLimits periodicLimits, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = mandateConstraints.validFrom;
        }
        if ((i & 2) != 0) {
            instant2 = mandateConstraints.validTo;
        }
        if ((i & 4) != 0) {
            j = mandateConstraints.maximumIndividualAmount;
        }
        if ((i & 8) != 0) {
            periodicLimits = mandateConstraints.periodicLimits;
        }
        PeriodicLimits periodicLimits2 = periodicLimits;
        return mandateConstraints.copy(instant, instant2, j, periodicLimits2);
    }

    /* renamed from: component1, reason: from getter */
    public final Instant getValidFrom() {
        return this.validFrom;
    }

    /* renamed from: component2, reason: from getter */
    public final Instant getValidTo() {
        return this.validTo;
    }

    /* renamed from: component3, reason: from getter */
    public final long getMaximumIndividualAmount() {
        return this.maximumIndividualAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final PeriodicLimits getPeriodicLimits() {
        return this.periodicLimits;
    }

    public final MandateConstraints copy(Instant validFrom, Instant validTo, long maximumIndividualAmount, PeriodicLimits periodicLimits) {
        return new MandateConstraints(validFrom, validTo, maximumIndividualAmount, periodicLimits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MandateConstraints)) {
            return false;
        }
        MandateConstraints mandateConstraints = (MandateConstraints) other;
        return Intrinsics.areEqual(this.validFrom, mandateConstraints.validFrom) && Intrinsics.areEqual(this.validTo, mandateConstraints.validTo) && this.maximumIndividualAmount == mandateConstraints.maximumIndividualAmount && Intrinsics.areEqual(this.periodicLimits, mandateConstraints.periodicLimits);
    }

    public int hashCode() {
        Instant instant = this.validFrom;
        int iHashCode = (instant == null ? 0 : instant.hashCode()) * 31;
        Instant instant2 = this.validTo;
        int iHashCode2 = (((iHashCode + (instant2 == null ? 0 : instant2.hashCode())) * 31) + Long.hashCode(this.maximumIndividualAmount)) * 31;
        PeriodicLimits periodicLimits = this.periodicLimits;
        return iHashCode2 + (periodicLimits != null ? periodicLimits.hashCode() : 0);
    }

    public String toString() {
        return "MandateConstraints(validFrom=" + this.validFrom + ", validTo=" + this.validTo + ", maximumIndividualAmount=" + this.maximumIndividualAmount + ", periodicLimits=" + this.periodicLimits + ")";
    }

    public MandateConstraints(Instant instant, Instant instant2, long j, PeriodicLimits periodicLimits) {
        this.validFrom = instant;
        this.validTo = instant2;
        this.maximumIndividualAmount = j;
        this.periodicLimits = periodicLimits;
    }

    public final Instant getValidFrom() {
        return this.validFrom;
    }

    public final Instant getValidTo() {
        return this.validTo;
    }

    public final long getMaximumIndividualAmount() {
        return this.maximumIndividualAmount;
    }

    public final PeriodicLimits getPeriodicLimits() {
        return this.periodicLimits;
    }

    public final int numberOfPeriodicLimits() {
        return asList().size();
    }

    public final List<PeriodicLimits.Limit> asList() {
        PeriodicLimits periodicLimits = this.periodicLimits;
        return CollectionsKt.listOfNotNull((Object[]) new PeriodicLimits.Limit[]{periodicLimits != null ? periodicLimits.getDay() : null, periodicLimits != null ? periodicLimits.getWeek() : null, periodicLimits != null ? periodicLimits.getFortnight() : null, periodicLimits != null ? periodicLimits.getMonth() : null, periodicLimits != null ? periodicLimits.getHalfYear() : null, periodicLimits != null ? periodicLimits.getYear() : null});
    }

    public final boolean hasPeriodicLimits() {
        return numberOfPeriodicLimits() > 0;
    }
}
