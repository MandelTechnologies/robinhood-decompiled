package com.robinhood.android.rhy.referral.track.detail;

import com.robinhood.android.rhy.referral.C27406R;
import com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingViewState2;
import com.robinhood.models.rhy.referral.api.RhyReferralVariant;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import com.robinhood.models.rhy.referral.p345db.RhyReferralEligibility;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: RhyReferralsTrackingDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\u00020\b*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b\"\u001e\u0010\f\u001a\u00020\b*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u000b\"\u001e\u0010\u000f\u001a\u00020\b*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u000b\" \u0010\u0012\u001a\u0004\u0018\u00010\b*\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"title", "", "Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;", "getTitle$annotations", "(Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;)V", "getTitle", "(Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;)Ljava/lang/String;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "getSubtitle$annotations", "getSubtitle", "(Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;)Lcom/robinhood/utils/resource/StringResource;", "status", "getStatus$annotations", "getStatus", ErrorBundle.DETAIL_ENTRY, "getDetails$annotations", "getDetails", "offerDetails", "Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;", "getOfferDetails$annotations", "(Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;)V", "getOfferDetails", "(Lcom/robinhood/models/rhy/referral/db/RhyReferralEligibility;)Lcom/robinhood/utils/resource/StringResource;", "feature-rhy-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.referral.track.detail.RhyReferralsTrackingDetailStateProviderKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyReferralsTrackingDetailStateProvider2 {

    /* compiled from: RhyReferralsTrackingDetailStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhy.referral.track.detail.RhyReferralsTrackingDetailStateProviderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RhyReferralVariant.values().length];
            try {
                iArr[RhyReferralVariant.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RhyReferralVariant.FIVE_DOLLARS_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RhyReferralVariant.TEN_DOLLARS_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RhyReferralVariant.TWENTY_FIVE_PERCENT_BACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getDetails$annotations(RhyReferralAttribution rhyReferralAttribution) {
    }

    public static /* synthetic */ void getOfferDetails$annotations(RhyReferralEligibility rhyReferralEligibility) {
    }

    public static /* synthetic */ void getStatus$annotations(RhyReferralAttribution rhyReferralAttribution) {
    }

    public static /* synthetic */ void getSubtitle$annotations(RhyReferralAttribution rhyReferralAttribution) {
    }

    public static /* synthetic */ void getTitle$annotations(RhyReferralAttribution rhyReferralAttribution) {
    }

    public static final String getTitle(RhyReferralAttribution rhyReferralAttribution) {
        Intrinsics.checkNotNullParameter(rhyReferralAttribution, "<this>");
        return RhyReferralsStatusTrackingViewState2.getInviteName(rhyReferralAttribution.getReferee());
    }

    public static final StringResource getSubtitle(RhyReferralAttribution rhyReferralAttribution) {
        int i;
        Intrinsics.checkNotNullParameter(rhyReferralAttribution, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        if (rhyReferralAttribution.isCompleted()) {
            i = C27406R.string.rhy_referral_track_detail_subtitle_complete;
        } else {
            i = C27406R.string.rhy_referral_track_detail_subtitle_pending;
        }
        return companion.invoke(i, new Object[0]);
    }

    public static final StringResource getStatus(RhyReferralAttribution rhyReferralAttribution) {
        int i;
        Intrinsics.checkNotNullParameter(rhyReferralAttribution, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        if (rhyReferralAttribution.isCompleted()) {
            i = C27406R.string.rhy_referral_track_detail_status_complete;
        } else {
            i = C27406R.string.rhy_referral_track_detail_status_pending;
        }
        return companion.invoke(i, new Object[0]);
    }

    public static final StringResource getDetails(RhyReferralAttribution rhyReferralAttribution) {
        Intrinsics.checkNotNullParameter(rhyReferralAttribution, "<this>");
        if (rhyReferralAttribution.isReferralOfCurrentUser()) {
            return StringResource.INSTANCE.invoke(C27406R.string.rhy_referral_track_detail_referee, RhyReferralsStatusTrackingViewState2.getInviteName(rhyReferralAttribution.getReferrer()));
        }
        return StringResource.INSTANCE.invoke(C27406R.string.rhy_referral_track_detail_referrer, RhyReferralsStatusTrackingViewState2.getInviteName(rhyReferralAttribution.getReferee()));
    }

    public static final StringResource getOfferDetails(RhyReferralEligibility rhyReferralEligibility) {
        Intrinsics.checkNotNullParameter(rhyReferralEligibility, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[rhyReferralEligibility.getRhyReferralVariant().ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C27406R.string.rhy_referral_track_detail_offer_five_dollars_back, new Object[0]);
        }
        if (i == 3) {
            return StringResource.INSTANCE.invoke(C27406R.string.rhy_referral_track_detail_offer_ten_dollars_back, new Object[0]);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C27406R.string.rhy_referral_track_detail_offer_twenty_five_percent_back, new Object[0]);
    }
}
