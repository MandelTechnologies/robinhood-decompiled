package com.robinhood.android.beneficiaries.p067ui;

import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BeneficiaryParentViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowAdditionalAccountsViewState;", "", "userAdditionalAccountNumbersInput", "Lkotlinx/collections/immutable/ImmutableList;", "", "signedAgreements", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "unsignedAgreements", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "getUserAdditionalAccountNumbersInput", "()Lkotlinx/collections/immutable/ImmutableList;", "getSignedAgreements", "getUnsignedAgreements", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryFlowAdditionalAccountsViewState {
    public static final int $stable = 8;
    private final ImmutableList<ApiBeneficiaryAgreementViewModel> signedAgreements;
    private final ImmutableList<ApiBeneficiaryAgreementViewModel> unsignedAgreements;
    private final ImmutableList<String> userAdditionalAccountNumbersInput;

    public BeneficiaryFlowAdditionalAccountsViewState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiaryFlowAdditionalAccountsViewState copy$default(BeneficiaryFlowAdditionalAccountsViewState beneficiaryFlowAdditionalAccountsViewState, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = beneficiaryFlowAdditionalAccountsViewState.userAdditionalAccountNumbersInput;
        }
        if ((i & 2) != 0) {
            immutableList2 = beneficiaryFlowAdditionalAccountsViewState.signedAgreements;
        }
        if ((i & 4) != 0) {
            immutableList3 = beneficiaryFlowAdditionalAccountsViewState.unsignedAgreements;
        }
        return beneficiaryFlowAdditionalAccountsViewState.copy(immutableList, immutableList2, immutableList3);
    }

    public final ImmutableList<String> component1() {
        return this.userAdditionalAccountNumbersInput;
    }

    public final ImmutableList<ApiBeneficiaryAgreementViewModel> component2() {
        return this.signedAgreements;
    }

    public final ImmutableList<ApiBeneficiaryAgreementViewModel> component3() {
        return this.unsignedAgreements;
    }

    public final BeneficiaryFlowAdditionalAccountsViewState copy(ImmutableList<String> userAdditionalAccountNumbersInput, ImmutableList<ApiBeneficiaryAgreementViewModel> signedAgreements, ImmutableList<ApiBeneficiaryAgreementViewModel> unsignedAgreements) {
        Intrinsics.checkNotNullParameter(userAdditionalAccountNumbersInput, "userAdditionalAccountNumbersInput");
        Intrinsics.checkNotNullParameter(signedAgreements, "signedAgreements");
        Intrinsics.checkNotNullParameter(unsignedAgreements, "unsignedAgreements");
        return new BeneficiaryFlowAdditionalAccountsViewState(userAdditionalAccountNumbersInput, signedAgreements, unsignedAgreements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryFlowAdditionalAccountsViewState)) {
            return false;
        }
        BeneficiaryFlowAdditionalAccountsViewState beneficiaryFlowAdditionalAccountsViewState = (BeneficiaryFlowAdditionalAccountsViewState) other;
        return Intrinsics.areEqual(this.userAdditionalAccountNumbersInput, beneficiaryFlowAdditionalAccountsViewState.userAdditionalAccountNumbersInput) && Intrinsics.areEqual(this.signedAgreements, beneficiaryFlowAdditionalAccountsViewState.signedAgreements) && Intrinsics.areEqual(this.unsignedAgreements, beneficiaryFlowAdditionalAccountsViewState.unsignedAgreements);
    }

    public int hashCode() {
        return (((this.userAdditionalAccountNumbersInput.hashCode() * 31) + this.signedAgreements.hashCode()) * 31) + this.unsignedAgreements.hashCode();
    }

    public String toString() {
        return "BeneficiaryFlowAdditionalAccountsViewState(userAdditionalAccountNumbersInput=" + this.userAdditionalAccountNumbersInput + ", signedAgreements=" + this.signedAgreements + ", unsignedAgreements=" + this.unsignedAgreements + ")";
    }

    public BeneficiaryFlowAdditionalAccountsViewState(ImmutableList<String> userAdditionalAccountNumbersInput, ImmutableList<ApiBeneficiaryAgreementViewModel> signedAgreements, ImmutableList<ApiBeneficiaryAgreementViewModel> unsignedAgreements) {
        Intrinsics.checkNotNullParameter(userAdditionalAccountNumbersInput, "userAdditionalAccountNumbersInput");
        Intrinsics.checkNotNullParameter(signedAgreements, "signedAgreements");
        Intrinsics.checkNotNullParameter(unsignedAgreements, "unsignedAgreements");
        this.userAdditionalAccountNumbersInput = userAdditionalAccountNumbersInput;
        this.signedAgreements = signedAgreements;
        this.unsignedAgreements = unsignedAgreements;
    }

    public /* synthetic */ BeneficiaryFlowAdditionalAccountsViewState(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? extensions2.persistentListOf() : immutableList, (i & 2) != 0 ? extensions2.persistentListOf() : immutableList2, (i & 4) != 0 ? extensions2.persistentListOf() : immutableList3);
    }

    public final ImmutableList<String> getUserAdditionalAccountNumbersInput() {
        return this.userAdditionalAccountNumbersInput;
    }

    public final ImmutableList<ApiBeneficiaryAgreementViewModel> getSignedAgreements() {
        return this.signedAgreements;
    }

    public final ImmutableList<ApiBeneficiaryAgreementViewModel> getUnsignedAgreements() {
        return this.unsignedAgreements;
    }
}
