package com.robinhood.android.beneficiaries.p067ui.introflow;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAgreementViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRole;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryIntroFlowResult.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowResult;", "", "beneficiaryType", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;", "beneficiaryRole", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "signedAgreementTypes", "", "", "agreementViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;Ljava/util/List;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;)V", "getBeneficiaryType", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;", "getBeneficiaryRole", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "getSignedAgreementTypes", "()Ljava/util/List;", "getAgreementViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryIntroFlowResult {
    public static final int $stable = 8;
    private final BeneficiaryFlowAgreementViewModel agreementViewModel;
    private final BeneficiaryRole beneficiaryRole;
    private final BeneficiaryType beneficiaryType;
    private final List<String> signedAgreementTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiaryIntroFlowResult copy$default(BeneficiaryIntroFlowResult beneficiaryIntroFlowResult, BeneficiaryType beneficiaryType, BeneficiaryRole beneficiaryRole, List list, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, int i, Object obj) {
        if ((i & 1) != 0) {
            beneficiaryType = beneficiaryIntroFlowResult.beneficiaryType;
        }
        if ((i & 2) != 0) {
            beneficiaryRole = beneficiaryIntroFlowResult.beneficiaryRole;
        }
        if ((i & 4) != 0) {
            list = beneficiaryIntroFlowResult.signedAgreementTypes;
        }
        if ((i & 8) != 0) {
            beneficiaryFlowAgreementViewModel = beneficiaryIntroFlowResult.agreementViewModel;
        }
        return beneficiaryIntroFlowResult.copy(beneficiaryType, beneficiaryRole, list, beneficiaryFlowAgreementViewModel);
    }

    /* renamed from: component1, reason: from getter */
    public final BeneficiaryType getBeneficiaryType() {
        return this.beneficiaryType;
    }

    /* renamed from: component2, reason: from getter */
    public final BeneficiaryRole getBeneficiaryRole() {
        return this.beneficiaryRole;
    }

    public final List<String> component3() {
        return this.signedAgreementTypes;
    }

    /* renamed from: component4, reason: from getter */
    public final BeneficiaryFlowAgreementViewModel getAgreementViewModel() {
        return this.agreementViewModel;
    }

    public final BeneficiaryIntroFlowResult copy(BeneficiaryType beneficiaryType, BeneficiaryRole beneficiaryRole, List<String> signedAgreementTypes, BeneficiaryFlowAgreementViewModel agreementViewModel) {
        Intrinsics.checkNotNullParameter(beneficiaryType, "beneficiaryType");
        Intrinsics.checkNotNullParameter(signedAgreementTypes, "signedAgreementTypes");
        return new BeneficiaryIntroFlowResult(beneficiaryType, beneficiaryRole, signedAgreementTypes, agreementViewModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryIntroFlowResult)) {
            return false;
        }
        BeneficiaryIntroFlowResult beneficiaryIntroFlowResult = (BeneficiaryIntroFlowResult) other;
        return this.beneficiaryType == beneficiaryIntroFlowResult.beneficiaryType && this.beneficiaryRole == beneficiaryIntroFlowResult.beneficiaryRole && Intrinsics.areEqual(this.signedAgreementTypes, beneficiaryIntroFlowResult.signedAgreementTypes) && Intrinsics.areEqual(this.agreementViewModel, beneficiaryIntroFlowResult.agreementViewModel);
    }

    public int hashCode() {
        int iHashCode = this.beneficiaryType.hashCode() * 31;
        BeneficiaryRole beneficiaryRole = this.beneficiaryRole;
        int iHashCode2 = (((iHashCode + (beneficiaryRole == null ? 0 : beneficiaryRole.hashCode())) * 31) + this.signedAgreementTypes.hashCode()) * 31;
        BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel = this.agreementViewModel;
        return iHashCode2 + (beneficiaryFlowAgreementViewModel != null ? beneficiaryFlowAgreementViewModel.hashCode() : 0);
    }

    public String toString() {
        return "BeneficiaryIntroFlowResult(beneficiaryType=" + this.beneficiaryType + ", beneficiaryRole=" + this.beneficiaryRole + ", signedAgreementTypes=" + this.signedAgreementTypes + ", agreementViewModel=" + this.agreementViewModel + ")";
    }

    public BeneficiaryIntroFlowResult(BeneficiaryType beneficiaryType, BeneficiaryRole beneficiaryRole, List<String> signedAgreementTypes, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel) {
        Intrinsics.checkNotNullParameter(beneficiaryType, "beneficiaryType");
        Intrinsics.checkNotNullParameter(signedAgreementTypes, "signedAgreementTypes");
        this.beneficiaryType = beneficiaryType;
        this.beneficiaryRole = beneficiaryRole;
        this.signedAgreementTypes = signedAgreementTypes;
        this.agreementViewModel = beneficiaryFlowAgreementViewModel;
    }

    public final BeneficiaryType getBeneficiaryType() {
        return this.beneficiaryType;
    }

    public final BeneficiaryRole getBeneficiaryRole() {
        return this.beneficiaryRole;
    }

    public /* synthetic */ BeneficiaryIntroFlowResult(BeneficiaryType beneficiaryType, BeneficiaryRole beneficiaryRole, List list, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(beneficiaryType, (i & 2) != 0 ? null : beneficiaryRole, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : beneficiaryFlowAgreementViewModel);
    }

    public final List<String> getSignedAgreementTypes() {
        return this.signedAgreementTypes;
    }

    public final BeneficiaryFlowAgreementViewModel getAgreementViewModel() {
        return this.agreementViewModel;
    }
}
