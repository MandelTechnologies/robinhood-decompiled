package com.robinhood.android.earlypay.enrollment.p110ui;

import com.robinhood.android.earlypay.enrollment.p110ui.EarlyPayEnrollmentViewState;
import com.robinhood.models.p320db.EarlyPayEnrollment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarlyPayEnrollmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentDataBundle;", "", "hasRhyDirectDepositRelationships", "", "earlPayEnrollment", "Lcom/robinhood/models/db/EarlyPayEnrollment;", "earlyPayEnrollmentContent", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent;", "<init>", "(ZLcom/robinhood/models/db/EarlyPayEnrollment;Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent;)V", "getHasRhyDirectDepositRelationships", "()Z", "getEarlPayEnrollment", "()Lcom/robinhood/models/db/EarlyPayEnrollment;", "getEarlyPayEnrollmentContent", "()Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
final /* data */ class EarlyPayEnrollmentDataBundle {
    private final EarlyPayEnrollment earlPayEnrollment;
    private final EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent earlyPayEnrollmentContent;
    private final boolean hasRhyDirectDepositRelationships;

    public static /* synthetic */ EarlyPayEnrollmentDataBundle copy$default(EarlyPayEnrollmentDataBundle earlyPayEnrollmentDataBundle, boolean z, EarlyPayEnrollment earlyPayEnrollment, EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent earlyPayEnrollmentContent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = earlyPayEnrollmentDataBundle.hasRhyDirectDepositRelationships;
        }
        if ((i & 2) != 0) {
            earlyPayEnrollment = earlyPayEnrollmentDataBundle.earlPayEnrollment;
        }
        if ((i & 4) != 0) {
            earlyPayEnrollmentContent = earlyPayEnrollmentDataBundle.earlyPayEnrollmentContent;
        }
        return earlyPayEnrollmentDataBundle.copy(z, earlyPayEnrollment, earlyPayEnrollmentContent);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasRhyDirectDepositRelationships() {
        return this.hasRhyDirectDepositRelationships;
    }

    /* renamed from: component2, reason: from getter */
    public final EarlyPayEnrollment getEarlPayEnrollment() {
        return this.earlPayEnrollment;
    }

    /* renamed from: component3, reason: from getter */
    public final EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent getEarlyPayEnrollmentContent() {
        return this.earlyPayEnrollmentContent;
    }

    public final EarlyPayEnrollmentDataBundle copy(boolean hasRhyDirectDepositRelationships, EarlyPayEnrollment earlPayEnrollment, EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent earlyPayEnrollmentContent) {
        Intrinsics.checkNotNullParameter(earlPayEnrollment, "earlPayEnrollment");
        Intrinsics.checkNotNullParameter(earlyPayEnrollmentContent, "earlyPayEnrollmentContent");
        return new EarlyPayEnrollmentDataBundle(hasRhyDirectDepositRelationships, earlPayEnrollment, earlyPayEnrollmentContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarlyPayEnrollmentDataBundle)) {
            return false;
        }
        EarlyPayEnrollmentDataBundle earlyPayEnrollmentDataBundle = (EarlyPayEnrollmentDataBundle) other;
        return this.hasRhyDirectDepositRelationships == earlyPayEnrollmentDataBundle.hasRhyDirectDepositRelationships && Intrinsics.areEqual(this.earlPayEnrollment, earlyPayEnrollmentDataBundle.earlPayEnrollment) && Intrinsics.areEqual(this.earlyPayEnrollmentContent, earlyPayEnrollmentDataBundle.earlyPayEnrollmentContent);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.hasRhyDirectDepositRelationships) * 31) + this.earlPayEnrollment.hashCode()) * 31) + this.earlyPayEnrollmentContent.hashCode();
    }

    public String toString() {
        return "EarlyPayEnrollmentDataBundle(hasRhyDirectDepositRelationships=" + this.hasRhyDirectDepositRelationships + ", earlPayEnrollment=" + this.earlPayEnrollment + ", earlyPayEnrollmentContent=" + this.earlyPayEnrollmentContent + ")";
    }

    public EarlyPayEnrollmentDataBundle(boolean z, EarlyPayEnrollment earlPayEnrollment, EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent earlyPayEnrollmentContent) {
        Intrinsics.checkNotNullParameter(earlPayEnrollment, "earlPayEnrollment");
        Intrinsics.checkNotNullParameter(earlyPayEnrollmentContent, "earlyPayEnrollmentContent");
        this.hasRhyDirectDepositRelationships = z;
        this.earlPayEnrollment = earlPayEnrollment;
        this.earlyPayEnrollmentContent = earlyPayEnrollmentContent;
    }

    public final boolean getHasRhyDirectDepositRelationships() {
        return this.hasRhyDirectDepositRelationships;
    }

    public final EarlyPayEnrollment getEarlPayEnrollment() {
        return this.earlPayEnrollment;
    }

    public final EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent getEarlyPayEnrollmentContent() {
        return this.earlyPayEnrollmentContent;
    }
}
