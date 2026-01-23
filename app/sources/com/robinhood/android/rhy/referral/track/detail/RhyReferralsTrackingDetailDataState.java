package com.robinhood.android.rhy.referral.track.detail;

import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import com.robinhood.models.rhy.referral.p345db.RhyReferralEligibility;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralsTrackingDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/track/detail/RhyReferralsTrackingDetailDataState;", "", "attribution", "Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;", "eligibility", "Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;", "<init>", "(Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;)V", "getAttribution", "()Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;", "getEligibility", "()Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyReferralsTrackingDetailDataState {
    public static final int $stable = 8;
    private final RhyReferralAttribution attribution;
    private final RhyReferralEligibility eligibility;

    public static /* synthetic */ RhyReferralsTrackingDetailDataState copy$default(RhyReferralsTrackingDetailDataState rhyReferralsTrackingDetailDataState, RhyReferralAttribution rhyReferralAttribution, RhyReferralEligibility rhyReferralEligibility, int i, Object obj) {
        if ((i & 1) != 0) {
            rhyReferralAttribution = rhyReferralsTrackingDetailDataState.attribution;
        }
        if ((i & 2) != 0) {
            rhyReferralEligibility = rhyReferralsTrackingDetailDataState.eligibility;
        }
        return rhyReferralsTrackingDetailDataState.copy(rhyReferralAttribution, rhyReferralEligibility);
    }

    /* renamed from: component1, reason: from getter */
    public final RhyReferralAttribution getAttribution() {
        return this.attribution;
    }

    /* renamed from: component2, reason: from getter */
    public final RhyReferralEligibility getEligibility() {
        return this.eligibility;
    }

    public final RhyReferralsTrackingDetailDataState copy(RhyReferralAttribution attribution, RhyReferralEligibility eligibility) {
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        return new RhyReferralsTrackingDetailDataState(attribution, eligibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyReferralsTrackingDetailDataState)) {
            return false;
        }
        RhyReferralsTrackingDetailDataState rhyReferralsTrackingDetailDataState = (RhyReferralsTrackingDetailDataState) other;
        return Intrinsics.areEqual(this.attribution, rhyReferralsTrackingDetailDataState.attribution) && Intrinsics.areEqual(this.eligibility, rhyReferralsTrackingDetailDataState.eligibility);
    }

    public int hashCode() {
        int iHashCode = this.attribution.hashCode() * 31;
        RhyReferralEligibility rhyReferralEligibility = this.eligibility;
        return iHashCode + (rhyReferralEligibility == null ? 0 : rhyReferralEligibility.hashCode());
    }

    public String toString() {
        return "RhyReferralsTrackingDetailDataState(attribution=" + this.attribution + ", eligibility=" + this.eligibility + ")";
    }

    public RhyReferralsTrackingDetailDataState(RhyReferralAttribution attribution, RhyReferralEligibility rhyReferralEligibility) {
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        this.attribution = attribution;
        this.eligibility = rhyReferralEligibility;
    }

    public /* synthetic */ RhyReferralsTrackingDetailDataState(RhyReferralAttribution rhyReferralAttribution, RhyReferralEligibility rhyReferralEligibility, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rhyReferralAttribution, (i & 2) != 0 ? null : rhyReferralEligibility);
    }

    public final RhyReferralAttribution getAttribution() {
        return this.attribution;
    }

    public final RhyReferralEligibility getEligibility() {
        return this.eligibility;
    }
}
