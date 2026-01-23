package com.robinhood.android.beneficiaries.p067ui.introflow.type;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowBeneficiaryTypeViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryTypeViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/type/BeneficiaryTypeViewState;", "", "beneficiaryTypeViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModel;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModel;)V", "getBeneficiaryTypeViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModel;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryTypeViewState {
    public static final int $stable = 8;
    private final BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryTypeViewModel;

    public static /* synthetic */ BeneficiaryTypeViewState copy$default(BeneficiaryTypeViewState beneficiaryTypeViewState, BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryFlowBeneficiaryTypeViewModel, int i, Object obj) {
        if ((i & 1) != 0) {
            beneficiaryFlowBeneficiaryTypeViewModel = beneficiaryTypeViewState.beneficiaryTypeViewModel;
        }
        return beneficiaryTypeViewState.copy(beneficiaryFlowBeneficiaryTypeViewModel);
    }

    /* renamed from: component1, reason: from getter */
    public final BeneficiaryFlowBeneficiaryTypeViewModel getBeneficiaryTypeViewModel() {
        return this.beneficiaryTypeViewModel;
    }

    public final BeneficiaryTypeViewState copy(BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryTypeViewModel) {
        Intrinsics.checkNotNullParameter(beneficiaryTypeViewModel, "beneficiaryTypeViewModel");
        return new BeneficiaryTypeViewState(beneficiaryTypeViewModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeneficiaryTypeViewState) && Intrinsics.areEqual(this.beneficiaryTypeViewModel, ((BeneficiaryTypeViewState) other).beneficiaryTypeViewModel);
    }

    public int hashCode() {
        return this.beneficiaryTypeViewModel.hashCode();
    }

    public String toString() {
        return "BeneficiaryTypeViewState(beneficiaryTypeViewModel=" + this.beneficiaryTypeViewModel + ")";
    }

    public BeneficiaryTypeViewState(BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryTypeViewModel) {
        Intrinsics.checkNotNullParameter(beneficiaryTypeViewModel, "beneficiaryTypeViewModel");
        this.beneficiaryTypeViewModel = beneficiaryTypeViewModel;
    }

    public final BeneficiaryFlowBeneficiaryTypeViewModel getBeneficiaryTypeViewModel() {
        return this.beneficiaryTypeViewModel;
    }
}
