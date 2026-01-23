package com.robinhood.shared.crypto.transfer.verification.beneficiary;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BeneficiaryDobDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/beneficiary/BeneficiaryDobViewState;", "", "loading", "", "<init>", "(Z)V", "getLoading", "()Z", "interfaceEnabled", "getInterfaceEnabled", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BeneficiaryDobViewState {
    public static final int $stable = 0;
    private final boolean loading;

    public BeneficiaryDobViewState() {
        this(false, 1, null);
    }

    public static /* synthetic */ BeneficiaryDobViewState copy$default(BeneficiaryDobViewState beneficiaryDobViewState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = beneficiaryDobViewState.loading;
        }
        return beneficiaryDobViewState.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final BeneficiaryDobViewState copy(boolean loading) {
        return new BeneficiaryDobViewState(loading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeneficiaryDobViewState) && this.loading == ((BeneficiaryDobViewState) other).loading;
    }

    public int hashCode() {
        return Boolean.hashCode(this.loading);
    }

    public String toString() {
        return "BeneficiaryDobViewState(loading=" + this.loading + ")";
    }

    public BeneficiaryDobViewState(boolean z) {
        this.loading = z;
    }

    public /* synthetic */ BeneficiaryDobViewState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getInterfaceEnabled() {
        return !this.loading;
    }
}
