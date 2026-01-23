package com.robinhood.referral;

import com.robinhood.models.api.ReferredCampaign;
import com.robinhood.models.api.ReferredCampaign4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttributionResult.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J+\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/referral/AttributionResult;", "", "referredCampaign", "Lcom/robinhood/models/api/ReferredCampaign;", "attributionData", "Lcom/robinhood/referral/BranchLinkAttributionData;", "silence", "", "<init>", "(Lcom/robinhood/models/api/ReferredCampaign;Lcom/robinhood/referral/BranchLinkAttributionData;Z)V", "getReferredCampaign", "()Lcom/robinhood/models/api/ReferredCampaign;", "getAttributionData", "()Lcom/robinhood/referral/BranchLinkAttributionData;", "getSilence", "()Z", "referralType", "Lcom/robinhood/models/api/ReferralType;", "getReferralType", "()Lcom/robinhood/models/api/ReferralType;", "isOrganic", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class AttributionResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BranchLinkAttributionData attributionData;
    private final ReferredCampaign referredCampaign;
    private final boolean silence;

    public static /* synthetic */ AttributionResult copy$default(AttributionResult attributionResult, ReferredCampaign referredCampaign, BranchLinkAttributionData branchLinkAttributionData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            referredCampaign = attributionResult.referredCampaign;
        }
        if ((i & 2) != 0) {
            branchLinkAttributionData = attributionResult.attributionData;
        }
        if ((i & 4) != 0) {
            z = attributionResult.silence;
        }
        return attributionResult.copy(referredCampaign, branchLinkAttributionData, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ReferredCampaign getReferredCampaign() {
        return this.referredCampaign;
    }

    /* renamed from: component2, reason: from getter */
    public final BranchLinkAttributionData getAttributionData() {
        return this.attributionData;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSilence() {
        return this.silence;
    }

    public final AttributionResult copy(ReferredCampaign referredCampaign, BranchLinkAttributionData attributionData, boolean silence) {
        return new AttributionResult(referredCampaign, attributionData, silence);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttributionResult)) {
            return false;
        }
        AttributionResult attributionResult = (AttributionResult) other;
        return Intrinsics.areEqual(this.referredCampaign, attributionResult.referredCampaign) && Intrinsics.areEqual(this.attributionData, attributionResult.attributionData) && this.silence == attributionResult.silence;
    }

    public int hashCode() {
        ReferredCampaign referredCampaign = this.referredCampaign;
        int iHashCode = (referredCampaign == null ? 0 : referredCampaign.hashCode()) * 31;
        BranchLinkAttributionData branchLinkAttributionData = this.attributionData;
        return ((iHashCode + (branchLinkAttributionData != null ? branchLinkAttributionData.hashCode() : 0)) * 31) + Boolean.hashCode(this.silence);
    }

    public String toString() {
        return "AttributionResult(referredCampaign=" + this.referredCampaign + ", attributionData=" + this.attributionData + ", silence=" + this.silence + ")";
    }

    public AttributionResult(ReferredCampaign referredCampaign, BranchLinkAttributionData branchLinkAttributionData, boolean z) {
        this.referredCampaign = referredCampaign;
        this.attributionData = branchLinkAttributionData;
        this.silence = z;
    }

    public final ReferredCampaign getReferredCampaign() {
        return this.referredCampaign;
    }

    public final BranchLinkAttributionData getAttributionData() {
        return this.attributionData;
    }

    public final boolean getSilence() {
        return this.silence;
    }

    public final ReferredCampaign4 getReferralType() {
        ReferredCampaign4 referralType;
        BranchLinkAttributionData branchLinkAttributionData = this.attributionData;
        if (branchLinkAttributionData != null && (referralType = branchLinkAttributionData.getReferralType()) != null) {
            return referralType;
        }
        ReferredCampaign referredCampaign = this.referredCampaign;
        ReferredCampaign4 referral_type = referredCampaign != null ? referredCampaign.getReferral_type() : null;
        return referral_type == null ? ReferredCampaign4.BROKERAGE : referral_type;
    }

    public final boolean isOrganic() {
        BranchLinkAttributionData branchLinkAttributionData = this.attributionData;
        return (branchLinkAttributionData != null ? branchLinkAttributionData.getReferralCode() : null) == null;
    }

    /* compiled from: AttributionResult.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/referral/AttributionResult$Companion;", "", "<init>", "()V", "forReferral", "Lcom/robinhood/referral/AttributionResult;", "referredCampaign", "Lcom/robinhood/models/api/ReferredCampaign;", "attributionData", "Lcom/robinhood/referral/BranchLinkAttributionData;", "forNoResult", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AttributionResult forReferral(ReferredCampaign referredCampaign, BranchLinkAttributionData attributionData) {
            return new AttributionResult(referredCampaign, attributionData, ReferredCampaign.INSTANCE.shouldSilenceLandingPage(referredCampaign));
        }

        public final AttributionResult forNoResult() {
            return new AttributionResult(null, null, true);
        }
    }
}
