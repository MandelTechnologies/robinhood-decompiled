package com.robinhood.android.slip.onboarding.agreements;

import com.robinhood.models.p355ui.UiSlipAgreements;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipOnboardingAgreementsViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/ExpandableAgreement;", "", "pogNumber", "", "agreement", "Lcom/robinhood/models/ui/UiSlipAgreements$Agreement;", "<init>", "(ILcom/robinhood/models/ui/UiSlipAgreements$Agreement;)V", "getPogNumber", "()I", "getAgreement", "()Lcom/robinhood/models/ui/UiSlipAgreements$Agreement;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ExpandableAgreement {
    public static final int $stable = 8;
    private final UiSlipAgreements.Agreement agreement;
    private final int pogNumber;

    public static /* synthetic */ ExpandableAgreement copy$default(ExpandableAgreement expandableAgreement, int i, UiSlipAgreements.Agreement agreement, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = expandableAgreement.pogNumber;
        }
        if ((i2 & 2) != 0) {
            agreement = expandableAgreement.agreement;
        }
        return expandableAgreement.copy(i, agreement);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPogNumber() {
        return this.pogNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final UiSlipAgreements.Agreement getAgreement() {
        return this.agreement;
    }

    public final ExpandableAgreement copy(int pogNumber, UiSlipAgreements.Agreement agreement) {
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        return new ExpandableAgreement(pogNumber, agreement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableAgreement)) {
            return false;
        }
        ExpandableAgreement expandableAgreement = (ExpandableAgreement) other;
        return this.pogNumber == expandableAgreement.pogNumber && Intrinsics.areEqual(this.agreement, expandableAgreement.agreement);
    }

    public int hashCode() {
        return (Integer.hashCode(this.pogNumber) * 31) + this.agreement.hashCode();
    }

    public String toString() {
        return "ExpandableAgreement(pogNumber=" + this.pogNumber + ", agreement=" + this.agreement + ")";
    }

    public ExpandableAgreement(int i, UiSlipAgreements.Agreement agreement) {
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        this.pogNumber = i;
        this.agreement = agreement;
    }

    public final int getPogNumber() {
        return this.pogNumber;
    }

    public final UiSlipAgreements.Agreement getAgreement() {
        return this.agreement;
    }
}
