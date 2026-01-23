package com.robinhood.android.rhy.referral.track;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.rhy.referral.C27406R;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import com.robinhood.models.rhy.referral.p345db.RhyReferralUser;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p479j$.time.Instant;

/* compiled from: RhyReferralsStatusTrackingViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"inviteName", "", "Lcom/robinhood/models/rhy/referral/db/RhyReferralUser;", "getInviteName", "(Lcom/robinhood/models/rhy/referral/db/RhyReferralUser;)Ljava/lang/String;", "firstName", "lastInitial", "invitedDateString", "Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;", "getInvitedDateString", "(Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;)Ljava/lang/String;", "invitedDateWithExpirationString", "Lcom/robinhood/utils/resource/StringResource;", "getInvitedDateWithExpirationString", "(Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;)Lcom/robinhood/utils/resource/StringResource;", "feature-rhy-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingViewStateKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyReferralsStatusTrackingViewState2 {
    public static final String getInviteName(RhyReferralUser rhyReferralUser) {
        Intrinsics.checkNotNullParameter(rhyReferralUser, "<this>");
        return inviteName(rhyReferralUser.getFirstName(), rhyReferralUser.getLastInitial());
    }

    private static final String inviteName(String str, String str2) {
        Character chFirstOrNull = StringsKt.firstOrNull(str2);
        String string2 = chFirstOrNull != null ? chFirstOrNull.toString() : null;
        if (!StringsKt.isBlank(str) && string2 != null && !StringsKt.isBlank(string2)) {
            return str + PlaceholderUtils.XXShortPlaceholderText + string2 + ".";
        }
        if (!StringsKt.isBlank(str)) {
            return str;
        }
        if (string2 == null || StringsKt.isBlank(string2)) {
            throw new IllegalStateException("Referral attribution has no name");
        }
        return string2;
    }

    public static final String getInvitedDateString(RhyReferralAttribution rhyReferralAttribution) {
        Intrinsics.checkNotNullParameter(rhyReferralAttribution, "<this>");
        Instant createdAt = rhyReferralAttribution.getCreatedAt();
        if (createdAt != null) {
            return InstantFormatter.DATE_IN_UTC.format((InstantFormatter) createdAt);
        }
        return null;
    }

    public static final StringResource getInvitedDateWithExpirationString(RhyReferralAttribution rhyReferralAttribution) {
        Intrinsics.checkNotNullParameter(rhyReferralAttribution, "<this>");
        String invitedDateString = getInvitedDateString(rhyReferralAttribution);
        if (invitedDateString != null) {
            return StringResource.INSTANCE.invoke(C27406R.string.rhy_referral_track_detail_date_expire, invitedDateString);
        }
        return null;
    }
}
