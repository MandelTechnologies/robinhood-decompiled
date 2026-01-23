package com.robinhood.android.rhy.referral.referee;

import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.rhy.referral.p345db.RhyReferralIneligibilityData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralsRefereeLandingEvent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent;", "", "PushTokenizeEvent", "VerificationRequired", "ShowFundMyAccount", "ShowCardNumber", "ShowFragment", "ShowIneligibilityDialog", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent$PushTokenizeEvent;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent$ShowCardNumber;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent$ShowFragment;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent$ShowFundMyAccount;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent$ShowIneligibilityDialog;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent$VerificationRequired;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RhyReferralsRefereeLandingEvent {

    /* compiled from: RhyReferralsRefereeLandingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent$PushTokenizeEvent;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent;", "request", "Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "<init>", "(Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;)V", "getRequest", "()Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PushTokenizeEvent implements RhyReferralsRefereeLandingEvent {
        public static final int $stable = 8;
        private final PushTokenizeRequest request;

        public static /* synthetic */ PushTokenizeEvent copy$default(PushTokenizeEvent pushTokenizeEvent, PushTokenizeRequest pushTokenizeRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                pushTokenizeRequest = pushTokenizeEvent.request;
            }
            return pushTokenizeEvent.copy(pushTokenizeRequest);
        }

        /* renamed from: component1, reason: from getter */
        public final PushTokenizeRequest getRequest() {
            return this.request;
        }

        public final PushTokenizeEvent copy(PushTokenizeRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return new PushTokenizeEvent(request);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PushTokenizeEvent) && Intrinsics.areEqual(this.request, ((PushTokenizeEvent) other).request);
        }

        public int hashCode() {
            return this.request.hashCode();
        }

        public String toString() {
            return "PushTokenizeEvent(request=" + this.request + ")";
        }

        public PushTokenizeEvent(PushTokenizeRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
        }

        public final PushTokenizeRequest getRequest() {
            return this.request;
        }
    }

    /* compiled from: RhyReferralsRefereeLandingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent$VerificationRequired;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent;", "error", "Lcom/robinhood/models/api/minerva/VerificationRequiredException;", "<init>", "(Lcom/robinhood/models/api/minerva/VerificationRequiredException;)V", "getError", "()Lcom/robinhood/models/api/minerva/VerificationRequiredException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class VerificationRequired implements RhyReferralsRefereeLandingEvent {
        public static final int $stable = 8;
        private final VerificationRequiredException error;

        public static /* synthetic */ VerificationRequired copy$default(VerificationRequired verificationRequired, VerificationRequiredException verificationRequiredException, int i, Object obj) {
            if ((i & 1) != 0) {
                verificationRequiredException = verificationRequired.error;
            }
            return verificationRequired.copy(verificationRequiredException);
        }

        /* renamed from: component1, reason: from getter */
        public final VerificationRequiredException getError() {
            return this.error;
        }

        public final VerificationRequired copy(VerificationRequiredException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new VerificationRequired(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerificationRequired) && Intrinsics.areEqual(this.error, ((VerificationRequired) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "VerificationRequired(error=" + this.error + ")";
        }

        public VerificationRequired(VerificationRequiredException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final VerificationRequiredException getError() {
            return this.error;
        }
    }

    /* compiled from: RhyReferralsRefereeLandingEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent$ShowFundMyAccount;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent;", "<init>", "()V", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowFundMyAccount implements RhyReferralsRefereeLandingEvent {
        public static final int $stable = 0;
        public static final ShowFundMyAccount INSTANCE = new ShowFundMyAccount();

        private ShowFundMyAccount() {
        }
    }

    /* compiled from: RhyReferralsRefereeLandingEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent$ShowCardNumber;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent;", "<init>", "()V", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ShowCardNumber implements RhyReferralsRefereeLandingEvent {
        public static final int $stable = 0;
        public static final ShowCardNumber INSTANCE = new ShowCardNumber();

        private ShowCardNumber() {
        }
    }

    /* compiled from: RhyReferralsRefereeLandingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent$ShowFragment;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFragment implements RhyReferralsRefereeLandingEvent {
        public static final int $stable = 8;
        private final FragmentKey fragmentKey;

        public static /* synthetic */ ShowFragment copy$default(ShowFragment showFragment, FragmentKey fragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentKey = showFragment.fragmentKey;
            }
            return showFragment.copy(fragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }

        public final ShowFragment copy(FragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new ShowFragment(fragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowFragment) && Intrinsics.areEqual(this.fragmentKey, ((ShowFragment) other).fragmentKey);
        }

        public int hashCode() {
            return this.fragmentKey.hashCode();
        }

        public String toString() {
            return "ShowFragment(fragmentKey=" + this.fragmentKey + ")";
        }

        public ShowFragment(FragmentKey fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
        }

        public final FragmentKey getFragmentKey() {
            return this.fragmentKey;
        }
    }

    /* compiled from: RhyReferralsRefereeLandingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent$ShowIneligibilityDialog;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent;", "ineligibilityData", "Lcom/robinhood/models/rhy/referral/db/RhyReferralIneligibilityData;", "<init>", "(Lcom/robinhood/models/rhy/referral/db/RhyReferralIneligibilityData;)V", "getIneligibilityData", "()Lcom/robinhood/models/rhy/referral/db/RhyReferralIneligibilityData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowIneligibilityDialog implements RhyReferralsRefereeLandingEvent {
        public static final int $stable = 8;
        private final RhyReferralIneligibilityData ineligibilityData;

        public static /* synthetic */ ShowIneligibilityDialog copy$default(ShowIneligibilityDialog showIneligibilityDialog, RhyReferralIneligibilityData rhyReferralIneligibilityData, int i, Object obj) {
            if ((i & 1) != 0) {
                rhyReferralIneligibilityData = showIneligibilityDialog.ineligibilityData;
            }
            return showIneligibilityDialog.copy(rhyReferralIneligibilityData);
        }

        /* renamed from: component1, reason: from getter */
        public final RhyReferralIneligibilityData getIneligibilityData() {
            return this.ineligibilityData;
        }

        public final ShowIneligibilityDialog copy(RhyReferralIneligibilityData ineligibilityData) {
            Intrinsics.checkNotNullParameter(ineligibilityData, "ineligibilityData");
            return new ShowIneligibilityDialog(ineligibilityData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowIneligibilityDialog) && Intrinsics.areEqual(this.ineligibilityData, ((ShowIneligibilityDialog) other).ineligibilityData);
        }

        public int hashCode() {
            return this.ineligibilityData.hashCode();
        }

        public String toString() {
            return "ShowIneligibilityDialog(ineligibilityData=" + this.ineligibilityData + ")";
        }

        public ShowIneligibilityDialog(RhyReferralIneligibilityData ineligibilityData) {
            Intrinsics.checkNotNullParameter(ineligibilityData, "ineligibilityData");
            this.ineligibilityData = ineligibilityData;
        }

        public final RhyReferralIneligibilityData getIneligibilityData() {
            return this.ineligibilityData;
        }
    }
}
