package com.robinhood.android.beneficiaries.p067ui;

import com.robinhood.android.beneficiaries.p067ui.introflow.BeneficiaryIntroFlowResult;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryParentViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentViewState;", "", "isTrustBeneficiaryExperiment", "", "isContingentBeneficiaryExperiment", "accountNumber", "", "beneficiaryId", "Ljava/util/UUID;", "introFlowResult", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowResult;", "flowViewState", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowViewState;", "<init>", "(ZZLjava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowResult;Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowViewState;)V", "()Z", "getAccountNumber", "()Ljava/lang/String;", "getBeneficiaryId", "()Ljava/util/UUID;", "getIntroFlowResult", "()Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowResult;", "getFlowViewState", "()Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowViewState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryParentViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final UUID beneficiaryId;
    private final BeneficiaryParentViewState3 flowViewState;
    private final BeneficiaryIntroFlowResult introFlowResult;
    private final boolean isContingentBeneficiaryExperiment;
    private final boolean isTrustBeneficiaryExperiment;

    public BeneficiaryParentViewState() {
        this(false, false, null, null, null, null, 63, null);
    }

    public static /* synthetic */ BeneficiaryParentViewState copy$default(BeneficiaryParentViewState beneficiaryParentViewState, boolean z, boolean z2, String str, UUID uuid, BeneficiaryIntroFlowResult beneficiaryIntroFlowResult, BeneficiaryParentViewState3 beneficiaryParentViewState3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = beneficiaryParentViewState.isTrustBeneficiaryExperiment;
        }
        if ((i & 2) != 0) {
            z2 = beneficiaryParentViewState.isContingentBeneficiaryExperiment;
        }
        if ((i & 4) != 0) {
            str = beneficiaryParentViewState.accountNumber;
        }
        if ((i & 8) != 0) {
            uuid = beneficiaryParentViewState.beneficiaryId;
        }
        if ((i & 16) != 0) {
            beneficiaryIntroFlowResult = beneficiaryParentViewState.introFlowResult;
        }
        if ((i & 32) != 0) {
            beneficiaryParentViewState3 = beneficiaryParentViewState.flowViewState;
        }
        BeneficiaryIntroFlowResult beneficiaryIntroFlowResult2 = beneficiaryIntroFlowResult;
        BeneficiaryParentViewState3 beneficiaryParentViewState32 = beneficiaryParentViewState3;
        return beneficiaryParentViewState.copy(z, z2, str, uuid, beneficiaryIntroFlowResult2, beneficiaryParentViewState32);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsTrustBeneficiaryExperiment() {
        return this.isTrustBeneficiaryExperiment;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsContingentBeneficiaryExperiment() {
        return this.isContingentBeneficiaryExperiment;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getBeneficiaryId() {
        return this.beneficiaryId;
    }

    /* renamed from: component5, reason: from getter */
    public final BeneficiaryIntroFlowResult getIntroFlowResult() {
        return this.introFlowResult;
    }

    /* renamed from: component6, reason: from getter */
    public final BeneficiaryParentViewState3 getFlowViewState() {
        return this.flowViewState;
    }

    public final BeneficiaryParentViewState copy(boolean isTrustBeneficiaryExperiment, boolean isContingentBeneficiaryExperiment, String accountNumber, UUID beneficiaryId, BeneficiaryIntroFlowResult introFlowResult, BeneficiaryParentViewState3 flowViewState) {
        return new BeneficiaryParentViewState(isTrustBeneficiaryExperiment, isContingentBeneficiaryExperiment, accountNumber, beneficiaryId, introFlowResult, flowViewState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryParentViewState)) {
            return false;
        }
        BeneficiaryParentViewState beneficiaryParentViewState = (BeneficiaryParentViewState) other;
        return this.isTrustBeneficiaryExperiment == beneficiaryParentViewState.isTrustBeneficiaryExperiment && this.isContingentBeneficiaryExperiment == beneficiaryParentViewState.isContingentBeneficiaryExperiment && Intrinsics.areEqual(this.accountNumber, beneficiaryParentViewState.accountNumber) && Intrinsics.areEqual(this.beneficiaryId, beneficiaryParentViewState.beneficiaryId) && Intrinsics.areEqual(this.introFlowResult, beneficiaryParentViewState.introFlowResult) && Intrinsics.areEqual(this.flowViewState, beneficiaryParentViewState.flowViewState);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isTrustBeneficiaryExperiment) * 31) + Boolean.hashCode(this.isContingentBeneficiaryExperiment)) * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UUID uuid = this.beneficiaryId;
        int iHashCode3 = (iHashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        BeneficiaryIntroFlowResult beneficiaryIntroFlowResult = this.introFlowResult;
        int iHashCode4 = (iHashCode3 + (beneficiaryIntroFlowResult == null ? 0 : beneficiaryIntroFlowResult.hashCode())) * 31;
        BeneficiaryParentViewState3 beneficiaryParentViewState3 = this.flowViewState;
        return iHashCode4 + (beneficiaryParentViewState3 != null ? beneficiaryParentViewState3.hashCode() : 0);
    }

    public String toString() {
        return "BeneficiaryParentViewState(isTrustBeneficiaryExperiment=" + this.isTrustBeneficiaryExperiment + ", isContingentBeneficiaryExperiment=" + this.isContingentBeneficiaryExperiment + ", accountNumber=" + this.accountNumber + ", beneficiaryId=" + this.beneficiaryId + ", introFlowResult=" + this.introFlowResult + ", flowViewState=" + this.flowViewState + ")";
    }

    public BeneficiaryParentViewState(boolean z, boolean z2, String str, UUID uuid, BeneficiaryIntroFlowResult beneficiaryIntroFlowResult, BeneficiaryParentViewState3 beneficiaryParentViewState3) {
        this.isTrustBeneficiaryExperiment = z;
        this.isContingentBeneficiaryExperiment = z2;
        this.accountNumber = str;
        this.beneficiaryId = uuid;
        this.introFlowResult = beneficiaryIntroFlowResult;
        this.flowViewState = beneficiaryParentViewState3;
    }

    public /* synthetic */ BeneficiaryParentViewState(boolean z, boolean z2, String str, UUID uuid, BeneficiaryIntroFlowResult beneficiaryIntroFlowResult, BeneficiaryParentViewState3 beneficiaryParentViewState3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : uuid, (i & 16) != 0 ? null : beneficiaryIntroFlowResult, (i & 32) != 0 ? null : beneficiaryParentViewState3);
    }

    public final boolean isTrustBeneficiaryExperiment() {
        return this.isTrustBeneficiaryExperiment;
    }

    public final boolean isContingentBeneficiaryExperiment() {
        return this.isContingentBeneficiaryExperiment;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UUID getBeneficiaryId() {
        return this.beneficiaryId;
    }

    public final BeneficiaryIntroFlowResult getIntroFlowResult() {
        return this.introFlowResult;
    }

    public final BeneficiaryParentViewState3 getFlowViewState() {
        return this.flowViewState;
    }
}
