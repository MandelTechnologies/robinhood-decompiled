package com.robinhood.android.beneficiaries.p067ui.trustflow.email;

import androidx.core.util.PatternsCompat;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowEmailViewModel;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryTrustEmailViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/email/BeneficiaryTrustEmailViewState;", "", "trustEmailViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;", "trustEmailInputString", "", "bottomButtonText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;)V", "getTrustEmailViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;", "getTrustEmailInputString", "()Ljava/lang/String;", "getBottomButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "bottomButtonEnabled", "", "getBottomButtonEnabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryTrustEmailViewState {
    public static final int $stable = 8;
    private final StringResource bottomButtonText;
    private final String trustEmailInputString;
    private final BeneficiaryFlowEmailViewModel trustEmailViewModel;

    public static /* synthetic */ BeneficiaryTrustEmailViewState copy$default(BeneficiaryTrustEmailViewState beneficiaryTrustEmailViewState, BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel, String str, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            beneficiaryFlowEmailViewModel = beneficiaryTrustEmailViewState.trustEmailViewModel;
        }
        if ((i & 2) != 0) {
            str = beneficiaryTrustEmailViewState.trustEmailInputString;
        }
        if ((i & 4) != 0) {
            stringResource = beneficiaryTrustEmailViewState.bottomButtonText;
        }
        return beneficiaryTrustEmailViewState.copy(beneficiaryFlowEmailViewModel, str, stringResource);
    }

    /* renamed from: component1, reason: from getter */
    public final BeneficiaryFlowEmailViewModel getTrustEmailViewModel() {
        return this.trustEmailViewModel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTrustEmailInputString() {
        return this.trustEmailInputString;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getBottomButtonText() {
        return this.bottomButtonText;
    }

    public final BeneficiaryTrustEmailViewState copy(BeneficiaryFlowEmailViewModel trustEmailViewModel, String trustEmailInputString, StringResource bottomButtonText) {
        Intrinsics.checkNotNullParameter(trustEmailViewModel, "trustEmailViewModel");
        Intrinsics.checkNotNullParameter(trustEmailInputString, "trustEmailInputString");
        Intrinsics.checkNotNullParameter(bottomButtonText, "bottomButtonText");
        return new BeneficiaryTrustEmailViewState(trustEmailViewModel, trustEmailInputString, bottomButtonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryTrustEmailViewState)) {
            return false;
        }
        BeneficiaryTrustEmailViewState beneficiaryTrustEmailViewState = (BeneficiaryTrustEmailViewState) other;
        return Intrinsics.areEqual(this.trustEmailViewModel, beneficiaryTrustEmailViewState.trustEmailViewModel) && Intrinsics.areEqual(this.trustEmailInputString, beneficiaryTrustEmailViewState.trustEmailInputString) && Intrinsics.areEqual(this.bottomButtonText, beneficiaryTrustEmailViewState.bottomButtonText);
    }

    public int hashCode() {
        return (((this.trustEmailViewModel.hashCode() * 31) + this.trustEmailInputString.hashCode()) * 31) + this.bottomButtonText.hashCode();
    }

    public String toString() {
        return "BeneficiaryTrustEmailViewState(trustEmailViewModel=" + this.trustEmailViewModel + ", trustEmailInputString=" + this.trustEmailInputString + ", bottomButtonText=" + this.bottomButtonText + ")";
    }

    public BeneficiaryTrustEmailViewState(BeneficiaryFlowEmailViewModel trustEmailViewModel, String trustEmailInputString, StringResource bottomButtonText) {
        Intrinsics.checkNotNullParameter(trustEmailViewModel, "trustEmailViewModel");
        Intrinsics.checkNotNullParameter(trustEmailInputString, "trustEmailInputString");
        Intrinsics.checkNotNullParameter(bottomButtonText, "bottomButtonText");
        this.trustEmailViewModel = trustEmailViewModel;
        this.trustEmailInputString = trustEmailInputString;
        this.bottomButtonText = bottomButtonText;
    }

    public final BeneficiaryFlowEmailViewModel getTrustEmailViewModel() {
        return this.trustEmailViewModel;
    }

    public final String getTrustEmailInputString() {
        return this.trustEmailInputString;
    }

    public final StringResource getBottomButtonText() {
        return this.bottomButtonText;
    }

    public final boolean getBottomButtonEnabled() {
        return PatternsCompat.EMAIL_ADDRESS.matcher(this.trustEmailInputString).matches();
    }
}
