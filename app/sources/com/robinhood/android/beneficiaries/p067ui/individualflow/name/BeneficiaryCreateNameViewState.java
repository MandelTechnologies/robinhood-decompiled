package com.robinhood.android.beneficiaries.p067ui.individualflow.name;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryCreateNameViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameViewState;", "", "fullName", "Lcom/robinhood/android/beneficiaries/ui/individualflow/name/FullName;", "<init>", "(Lcom/robinhood/android/beneficiaries/ui/individualflow/name/FullName;)V", "getFullName", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/name/FullName;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryCreateNameViewState {
    public static final int $stable = 0;
    private final FullName fullName;

    public static /* synthetic */ BeneficiaryCreateNameViewState copy$default(BeneficiaryCreateNameViewState beneficiaryCreateNameViewState, FullName fullName, int i, Object obj) {
        if ((i & 1) != 0) {
            fullName = beneficiaryCreateNameViewState.fullName;
        }
        return beneficiaryCreateNameViewState.copy(fullName);
    }

    /* renamed from: component1, reason: from getter */
    public final FullName getFullName() {
        return this.fullName;
    }

    public final BeneficiaryCreateNameViewState copy(FullName fullName) {
        return new BeneficiaryCreateNameViewState(fullName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeneficiaryCreateNameViewState) && Intrinsics.areEqual(this.fullName, ((BeneficiaryCreateNameViewState) other).fullName);
    }

    public int hashCode() {
        FullName fullName = this.fullName;
        if (fullName == null) {
            return 0;
        }
        return fullName.hashCode();
    }

    public String toString() {
        return "BeneficiaryCreateNameViewState(fullName=" + this.fullName + ")";
    }

    public BeneficiaryCreateNameViewState(FullName fullName) {
        this.fullName = fullName;
    }

    public final FullName getFullName() {
        return this.fullName;
    }
}
