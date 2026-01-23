package com.robinhood.android.beneficiaries.p067ui.trustflow.taxidentifier;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustTaxIdentifierViewModel;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryTrustTaxIdentifierViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/taxidentifier/BeneficiaryTrustTaxIdentifierViewState;", "", "trustTaxIdentifierViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModel;", "trustTaxIdentifierInputString", "", "bottomButtonText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModel;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;)V", "getTrustTaxIdentifierViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModel;", "getTrustTaxIdentifierInputString", "()Ljava/lang/String;", "getBottomButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "bottomButtonEnabled", "", "getBottomButtonEnabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryTrustTaxIdentifierViewState {
    public static final int $stable = 8;
    private final StringResource bottomButtonText;
    private final String trustTaxIdentifierInputString;
    private final BeneficiaryFlowTrustTaxIdentifierViewModel trustTaxIdentifierViewModel;

    public static /* synthetic */ BeneficiaryTrustTaxIdentifierViewState copy$default(BeneficiaryTrustTaxIdentifierViewState beneficiaryTrustTaxIdentifierViewState, BeneficiaryFlowTrustTaxIdentifierViewModel beneficiaryFlowTrustTaxIdentifierViewModel, String str, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            beneficiaryFlowTrustTaxIdentifierViewModel = beneficiaryTrustTaxIdentifierViewState.trustTaxIdentifierViewModel;
        }
        if ((i & 2) != 0) {
            str = beneficiaryTrustTaxIdentifierViewState.trustTaxIdentifierInputString;
        }
        if ((i & 4) != 0) {
            stringResource = beneficiaryTrustTaxIdentifierViewState.bottomButtonText;
        }
        return beneficiaryTrustTaxIdentifierViewState.copy(beneficiaryFlowTrustTaxIdentifierViewModel, str, stringResource);
    }

    /* renamed from: component1, reason: from getter */
    public final BeneficiaryFlowTrustTaxIdentifierViewModel getTrustTaxIdentifierViewModel() {
        return this.trustTaxIdentifierViewModel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTrustTaxIdentifierInputString() {
        return this.trustTaxIdentifierInputString;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getBottomButtonText() {
        return this.bottomButtonText;
    }

    public final BeneficiaryTrustTaxIdentifierViewState copy(BeneficiaryFlowTrustTaxIdentifierViewModel trustTaxIdentifierViewModel, String trustTaxIdentifierInputString, StringResource bottomButtonText) {
        Intrinsics.checkNotNullParameter(trustTaxIdentifierViewModel, "trustTaxIdentifierViewModel");
        Intrinsics.checkNotNullParameter(trustTaxIdentifierInputString, "trustTaxIdentifierInputString");
        Intrinsics.checkNotNullParameter(bottomButtonText, "bottomButtonText");
        return new BeneficiaryTrustTaxIdentifierViewState(trustTaxIdentifierViewModel, trustTaxIdentifierInputString, bottomButtonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryTrustTaxIdentifierViewState)) {
            return false;
        }
        BeneficiaryTrustTaxIdentifierViewState beneficiaryTrustTaxIdentifierViewState = (BeneficiaryTrustTaxIdentifierViewState) other;
        return Intrinsics.areEqual(this.trustTaxIdentifierViewModel, beneficiaryTrustTaxIdentifierViewState.trustTaxIdentifierViewModel) && Intrinsics.areEqual(this.trustTaxIdentifierInputString, beneficiaryTrustTaxIdentifierViewState.trustTaxIdentifierInputString) && Intrinsics.areEqual(this.bottomButtonText, beneficiaryTrustTaxIdentifierViewState.bottomButtonText);
    }

    public int hashCode() {
        return (((this.trustTaxIdentifierViewModel.hashCode() * 31) + this.trustTaxIdentifierInputString.hashCode()) * 31) + this.bottomButtonText.hashCode();
    }

    public String toString() {
        return "BeneficiaryTrustTaxIdentifierViewState(trustTaxIdentifierViewModel=" + this.trustTaxIdentifierViewModel + ", trustTaxIdentifierInputString=" + this.trustTaxIdentifierInputString + ", bottomButtonText=" + this.bottomButtonText + ")";
    }

    public BeneficiaryTrustTaxIdentifierViewState(BeneficiaryFlowTrustTaxIdentifierViewModel trustTaxIdentifierViewModel, String trustTaxIdentifierInputString, StringResource bottomButtonText) {
        Intrinsics.checkNotNullParameter(trustTaxIdentifierViewModel, "trustTaxIdentifierViewModel");
        Intrinsics.checkNotNullParameter(trustTaxIdentifierInputString, "trustTaxIdentifierInputString");
        Intrinsics.checkNotNullParameter(bottomButtonText, "bottomButtonText");
        this.trustTaxIdentifierViewModel = trustTaxIdentifierViewModel;
        this.trustTaxIdentifierInputString = trustTaxIdentifierInputString;
        this.bottomButtonText = bottomButtonText;
    }

    public final BeneficiaryFlowTrustTaxIdentifierViewModel getTrustTaxIdentifierViewModel() {
        return this.trustTaxIdentifierViewModel;
    }

    public final String getTrustTaxIdentifierInputString() {
        return this.trustTaxIdentifierInputString;
    }

    public final StringResource getBottomButtonText() {
        return this.bottomButtonText;
    }

    public final boolean getBottomButtonEnabled() {
        return this.trustTaxIdentifierInputString.length() == 9;
    }
}
