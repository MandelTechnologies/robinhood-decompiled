package com.robinhood.android.rhy.referral.track.detail;

import com.robinhood.utils.resource.StringResource;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralsTrackingDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/track/detail/RhyReferralsTrackingDetailViewState;", "", "title", "", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "status", InquiryField.DateField.TYPE, "referralDetails", "offerDetails", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getStatus", "getDate", "getReferralDetails", "getOfferDetails", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyReferralsTrackingDetailViewState {
    public static final int $stable = StringResource.$stable;
    private final StringResource date;
    private final StringResource offerDetails;
    private final StringResource referralDetails;
    private final StringResource status;
    private final StringResource subtitle;
    private final String title;

    public static /* synthetic */ RhyReferralsTrackingDetailViewState copy$default(RhyReferralsTrackingDetailViewState rhyReferralsTrackingDetailViewState, String str, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rhyReferralsTrackingDetailViewState.title;
        }
        if ((i & 2) != 0) {
            stringResource = rhyReferralsTrackingDetailViewState.subtitle;
        }
        if ((i & 4) != 0) {
            stringResource2 = rhyReferralsTrackingDetailViewState.status;
        }
        if ((i & 8) != 0) {
            stringResource3 = rhyReferralsTrackingDetailViewState.date;
        }
        if ((i & 16) != 0) {
            stringResource4 = rhyReferralsTrackingDetailViewState.referralDetails;
        }
        if ((i & 32) != 0) {
            stringResource5 = rhyReferralsTrackingDetailViewState.offerDetails;
        }
        StringResource stringResource6 = stringResource4;
        StringResource stringResource7 = stringResource5;
        return rhyReferralsTrackingDetailViewState.copy(str, stringResource, stringResource2, stringResource3, stringResource6, stringResource7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getDate() {
        return this.date;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getReferralDetails() {
        return this.referralDetails;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getOfferDetails() {
        return this.offerDetails;
    }

    public final RhyReferralsTrackingDetailViewState copy(String title, StringResource subtitle, StringResource status, StringResource date, StringResource referralDetails, StringResource offerDetails) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(referralDetails, "referralDetails");
        return new RhyReferralsTrackingDetailViewState(title, subtitle, status, date, referralDetails, offerDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyReferralsTrackingDetailViewState)) {
            return false;
        }
        RhyReferralsTrackingDetailViewState rhyReferralsTrackingDetailViewState = (RhyReferralsTrackingDetailViewState) other;
        return Intrinsics.areEqual(this.title, rhyReferralsTrackingDetailViewState.title) && Intrinsics.areEqual(this.subtitle, rhyReferralsTrackingDetailViewState.subtitle) && Intrinsics.areEqual(this.status, rhyReferralsTrackingDetailViewState.status) && Intrinsics.areEqual(this.date, rhyReferralsTrackingDetailViewState.date) && Intrinsics.areEqual(this.referralDetails, rhyReferralsTrackingDetailViewState.referralDetails) && Intrinsics.areEqual(this.offerDetails, rhyReferralsTrackingDetailViewState.offerDetails);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        StringResource stringResource = this.subtitle;
        int iHashCode2 = (((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.status.hashCode()) * 31;
        StringResource stringResource2 = this.date;
        int iHashCode3 = (((iHashCode2 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31) + this.referralDetails.hashCode()) * 31;
        StringResource stringResource3 = this.offerDetails;
        return iHashCode3 + (stringResource3 != null ? stringResource3.hashCode() : 0);
    }

    public String toString() {
        return "RhyReferralsTrackingDetailViewState(title=" + this.title + ", subtitle=" + this.subtitle + ", status=" + this.status + ", date=" + this.date + ", referralDetails=" + this.referralDetails + ", offerDetails=" + this.offerDetails + ")";
    }

    public RhyReferralsTrackingDetailViewState(String title, StringResource stringResource, StringResource status, StringResource stringResource2, StringResource referralDetails, StringResource stringResource3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(referralDetails, "referralDetails");
        this.title = title;
        this.subtitle = stringResource;
        this.status = status;
        this.date = stringResource2;
        this.referralDetails = referralDetails;
        this.offerDetails = stringResource3;
    }

    public final String getTitle() {
        return this.title;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final StringResource getStatus() {
        return this.status;
    }

    public final StringResource getDate() {
        return this.date;
    }

    public final StringResource getReferralDetails() {
        return this.referralDetails;
    }

    public final StringResource getOfferDetails() {
        return this.offerDetails;
    }
}
