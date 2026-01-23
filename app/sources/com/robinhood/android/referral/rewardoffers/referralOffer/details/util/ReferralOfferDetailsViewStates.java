package com.robinhood.android.referral.rewardoffers.referralOffer.details.util;

import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ContactsAccessDeniedViewState;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ContactsAccessGrantedViewState;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReferralOfferDetailsViewStates.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0007"}, m3636d2 = {"ifGranted", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ContactsAccessGrantedViewState;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;", "ifDenied", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ContactsAccessDeniedViewState;", "asDenied", "asGranted", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.util.ReferralOfferDetailsViewStatesKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ReferralOfferDetailsViewStates {
    public static final ContactsAccessGrantedViewState ifGranted(ReferralOfferDetailsViewState referralOfferDetailsViewState) {
        Intrinsics.checkNotNullParameter(referralOfferDetailsViewState, "<this>");
        if (referralOfferDetailsViewState instanceof ContactsAccessGrantedViewState) {
            return (ContactsAccessGrantedViewState) referralOfferDetailsViewState;
        }
        return null;
    }

    public static final ContactsAccessDeniedViewState ifDenied(ReferralOfferDetailsViewState referralOfferDetailsViewState) {
        Intrinsics.checkNotNullParameter(referralOfferDetailsViewState, "<this>");
        if (referralOfferDetailsViewState instanceof ContactsAccessDeniedViewState) {
            return (ContactsAccessDeniedViewState) referralOfferDetailsViewState;
        }
        return null;
    }

    public static final ContactsAccessDeniedViewState asDenied(ReferralOfferDetailsViewState referralOfferDetailsViewState) {
        Intrinsics.checkNotNullParameter(referralOfferDetailsViewState, "<this>");
        return (ContactsAccessDeniedViewState) referralOfferDetailsViewState;
    }

    public static final ContactsAccessGrantedViewState asGranted(ReferralOfferDetailsViewState referralOfferDetailsViewState) {
        Intrinsics.checkNotNullParameter(referralOfferDetailsViewState, "<this>");
        return (ContactsAccessGrantedViewState) referralOfferDetailsViewState;
    }
}
