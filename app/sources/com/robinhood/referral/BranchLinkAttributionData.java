package com.robinhood.referral;

import com.robinhood.models.api.ReferredCampaign4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BranchLinkAttributionData.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/referral/BranchLinkAttributionData;", "", "referralCode", "", "referralType", "Lcom/robinhood/models/api/ReferralType;", "experiment", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/ReferralType;Ljava/lang/String;)V", "getReferralCode", "()Ljava/lang/String;", "getReferralType", "()Lcom/robinhood/models/api/ReferralType;", "getExperiment", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class BranchLinkAttributionData {
    private final String experiment;
    private final String referralCode;
    private final ReferredCampaign4 referralType;

    public static /* synthetic */ BranchLinkAttributionData copy$default(BranchLinkAttributionData branchLinkAttributionData, String str, ReferredCampaign4 referredCampaign4, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = branchLinkAttributionData.referralCode;
        }
        if ((i & 2) != 0) {
            referredCampaign4 = branchLinkAttributionData.referralType;
        }
        if ((i & 4) != 0) {
            str2 = branchLinkAttributionData.experiment;
        }
        return branchLinkAttributionData.copy(str, referredCampaign4, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* renamed from: component2, reason: from getter */
    public final ReferredCampaign4 getReferralType() {
        return this.referralType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExperiment() {
        return this.experiment;
    }

    public final BranchLinkAttributionData copy(String referralCode, ReferredCampaign4 referralType, String experiment) {
        return new BranchLinkAttributionData(referralCode, referralType, experiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BranchLinkAttributionData)) {
            return false;
        }
        BranchLinkAttributionData branchLinkAttributionData = (BranchLinkAttributionData) other;
        return Intrinsics.areEqual(this.referralCode, branchLinkAttributionData.referralCode) && this.referralType == branchLinkAttributionData.referralType && Intrinsics.areEqual(this.experiment, branchLinkAttributionData.experiment);
    }

    public int hashCode() {
        String str = this.referralCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ReferredCampaign4 referredCampaign4 = this.referralType;
        int iHashCode2 = (iHashCode + (referredCampaign4 == null ? 0 : referredCampaign4.hashCode())) * 31;
        String str2 = this.experiment;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BranchLinkAttributionData(referralCode=" + this.referralCode + ", referralType=" + this.referralType + ", experiment=" + this.experiment + ")";
    }

    public BranchLinkAttributionData(String str, ReferredCampaign4 referredCampaign4, String str2) {
        this.referralCode = str;
        this.referralType = referredCampaign4;
        this.experiment = str2;
    }

    public /* synthetic */ BranchLinkAttributionData(String str, ReferredCampaign4 referredCampaign4, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, referredCampaign4, (i & 4) != 0 ? null : str2);
    }

    public final String getReferralCode() {
        return this.referralCode;
    }

    public final ReferredCampaign4 getReferralType() {
        return this.referralType;
    }

    public final String getExperiment() {
        return this.experiment;
    }
}
