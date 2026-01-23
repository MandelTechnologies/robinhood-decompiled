package com.robinhood.android.beneficiaries.p067ui.introflow;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAgreementViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowBeneficiaryRoleViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowBeneficiaryTypeViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRole;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryIntroFlowViewState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowViewState;", "", "accountNumber", "", "infoViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;", "agreementViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "beneficiaryRoleViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModel;", "selectedBeneficiaryRole", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "beneficiaryTypeViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModel;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModel;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModel;)V", "getAccountNumber", "()Ljava/lang/String;", "getInfoViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;", "getAgreementViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "getBeneficiaryRoleViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModel;", "getSelectedBeneficiaryRole", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "getBeneficiaryTypeViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModel;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryIntroFlowViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final BeneficiaryFlowAgreementViewModel agreementViewModel;
    private final BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryRoleViewModel;
    private final BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryTypeViewModel;
    private final BeneficiaryInfoViewModel infoViewModel;
    private final BeneficiaryRole selectedBeneficiaryRole;

    public static /* synthetic */ BeneficiaryIntroFlowViewState copy$default(BeneficiaryIntroFlowViewState beneficiaryIntroFlowViewState, String str, BeneficiaryInfoViewModel beneficiaryInfoViewModel, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModel, BeneficiaryRole beneficiaryRole, BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryFlowBeneficiaryTypeViewModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryIntroFlowViewState.accountNumber;
        }
        if ((i & 2) != 0) {
            beneficiaryInfoViewModel = beneficiaryIntroFlowViewState.infoViewModel;
        }
        if ((i & 4) != 0) {
            beneficiaryFlowAgreementViewModel = beneficiaryIntroFlowViewState.agreementViewModel;
        }
        if ((i & 8) != 0) {
            beneficiaryFlowBeneficiaryRoleViewModel = beneficiaryIntroFlowViewState.beneficiaryRoleViewModel;
        }
        if ((i & 16) != 0) {
            beneficiaryRole = beneficiaryIntroFlowViewState.selectedBeneficiaryRole;
        }
        if ((i & 32) != 0) {
            beneficiaryFlowBeneficiaryTypeViewModel = beneficiaryIntroFlowViewState.beneficiaryTypeViewModel;
        }
        BeneficiaryRole beneficiaryRole2 = beneficiaryRole;
        BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryFlowBeneficiaryTypeViewModel2 = beneficiaryFlowBeneficiaryTypeViewModel;
        return beneficiaryIntroFlowViewState.copy(str, beneficiaryInfoViewModel, beneficiaryFlowAgreementViewModel, beneficiaryFlowBeneficiaryRoleViewModel, beneficiaryRole2, beneficiaryFlowBeneficiaryTypeViewModel2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final BeneficiaryInfoViewModel getInfoViewModel() {
        return this.infoViewModel;
    }

    /* renamed from: component3, reason: from getter */
    public final BeneficiaryFlowAgreementViewModel getAgreementViewModel() {
        return this.agreementViewModel;
    }

    /* renamed from: component4, reason: from getter */
    public final BeneficiaryFlowBeneficiaryRoleViewModel getBeneficiaryRoleViewModel() {
        return this.beneficiaryRoleViewModel;
    }

    /* renamed from: component5, reason: from getter */
    public final BeneficiaryRole getSelectedBeneficiaryRole() {
        return this.selectedBeneficiaryRole;
    }

    /* renamed from: component6, reason: from getter */
    public final BeneficiaryFlowBeneficiaryTypeViewModel getBeneficiaryTypeViewModel() {
        return this.beneficiaryTypeViewModel;
    }

    public final BeneficiaryIntroFlowViewState copy(String accountNumber, BeneficiaryInfoViewModel infoViewModel, BeneficiaryFlowAgreementViewModel agreementViewModel, BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryRoleViewModel, BeneficiaryRole selectedBeneficiaryRole, BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryTypeViewModel) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new BeneficiaryIntroFlowViewState(accountNumber, infoViewModel, agreementViewModel, beneficiaryRoleViewModel, selectedBeneficiaryRole, beneficiaryTypeViewModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryIntroFlowViewState)) {
            return false;
        }
        BeneficiaryIntroFlowViewState beneficiaryIntroFlowViewState = (BeneficiaryIntroFlowViewState) other;
        return Intrinsics.areEqual(this.accountNumber, beneficiaryIntroFlowViewState.accountNumber) && Intrinsics.areEqual(this.infoViewModel, beneficiaryIntroFlowViewState.infoViewModel) && Intrinsics.areEqual(this.agreementViewModel, beneficiaryIntroFlowViewState.agreementViewModel) && Intrinsics.areEqual(this.beneficiaryRoleViewModel, beneficiaryIntroFlowViewState.beneficiaryRoleViewModel) && this.selectedBeneficiaryRole == beneficiaryIntroFlowViewState.selectedBeneficiaryRole && Intrinsics.areEqual(this.beneficiaryTypeViewModel, beneficiaryIntroFlowViewState.beneficiaryTypeViewModel);
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        BeneficiaryInfoViewModel beneficiaryInfoViewModel = this.infoViewModel;
        int iHashCode2 = (iHashCode + (beneficiaryInfoViewModel == null ? 0 : beneficiaryInfoViewModel.hashCode())) * 31;
        BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel = this.agreementViewModel;
        int iHashCode3 = (iHashCode2 + (beneficiaryFlowAgreementViewModel == null ? 0 : beneficiaryFlowAgreementViewModel.hashCode())) * 31;
        BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModel = this.beneficiaryRoleViewModel;
        int iHashCode4 = (iHashCode3 + (beneficiaryFlowBeneficiaryRoleViewModel == null ? 0 : beneficiaryFlowBeneficiaryRoleViewModel.hashCode())) * 31;
        BeneficiaryRole beneficiaryRole = this.selectedBeneficiaryRole;
        int iHashCode5 = (iHashCode4 + (beneficiaryRole == null ? 0 : beneficiaryRole.hashCode())) * 31;
        BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryFlowBeneficiaryTypeViewModel = this.beneficiaryTypeViewModel;
        return iHashCode5 + (beneficiaryFlowBeneficiaryTypeViewModel != null ? beneficiaryFlowBeneficiaryTypeViewModel.hashCode() : 0);
    }

    public String toString() {
        return "BeneficiaryIntroFlowViewState(accountNumber=" + this.accountNumber + ", infoViewModel=" + this.infoViewModel + ", agreementViewModel=" + this.agreementViewModel + ", beneficiaryRoleViewModel=" + this.beneficiaryRoleViewModel + ", selectedBeneficiaryRole=" + this.selectedBeneficiaryRole + ", beneficiaryTypeViewModel=" + this.beneficiaryTypeViewModel + ")";
    }

    public BeneficiaryIntroFlowViewState(String accountNumber, BeneficiaryInfoViewModel beneficiaryInfoViewModel, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModel, BeneficiaryRole beneficiaryRole, BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryFlowBeneficiaryTypeViewModel) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        this.infoViewModel = beneficiaryInfoViewModel;
        this.agreementViewModel = beneficiaryFlowAgreementViewModel;
        this.beneficiaryRoleViewModel = beneficiaryFlowBeneficiaryRoleViewModel;
        this.selectedBeneficiaryRole = beneficiaryRole;
        this.beneficiaryTypeViewModel = beneficiaryFlowBeneficiaryTypeViewModel;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final BeneficiaryInfoViewModel getInfoViewModel() {
        return this.infoViewModel;
    }

    public final BeneficiaryFlowAgreementViewModel getAgreementViewModel() {
        return this.agreementViewModel;
    }

    public final BeneficiaryFlowBeneficiaryRoleViewModel getBeneficiaryRoleViewModel() {
        return this.beneficiaryRoleViewModel;
    }

    public /* synthetic */ BeneficiaryIntroFlowViewState(String str, BeneficiaryInfoViewModel beneficiaryInfoViewModel, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModel, BeneficiaryRole beneficiaryRole, BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryFlowBeneficiaryTypeViewModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : beneficiaryInfoViewModel, (i & 4) != 0 ? null : beneficiaryFlowAgreementViewModel, (i & 8) != 0 ? null : beneficiaryFlowBeneficiaryRoleViewModel, (i & 16) != 0 ? BeneficiaryRole.BENEFICIARY_ROLE_PRIMARY : beneficiaryRole, (i & 32) != 0 ? null : beneficiaryFlowBeneficiaryTypeViewModel);
    }

    public final BeneficiaryRole getSelectedBeneficiaryRole() {
        return this.selectedBeneficiaryRole;
    }

    public final BeneficiaryFlowBeneficiaryTypeViewModel getBeneficiaryTypeViewModel() {
        return this.beneficiaryTypeViewModel;
    }
}
