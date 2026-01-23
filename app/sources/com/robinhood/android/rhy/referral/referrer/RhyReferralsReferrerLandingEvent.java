package com.robinhood.android.rhy.referral.referrer;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.rhy.referral.p345db.RhyReferralIneligibilityData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralsReferrerLandingEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingEvent;", "", "ShareLink", "ShowFragment", "ShowIneligibilityDialog", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingEvent$ShareLink;", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingEvent$ShowFragment;", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingEvent$ShowIneligibilityDialog;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RhyReferralsReferrerLandingEvent {

    /* compiled from: RhyReferralsReferrerLandingEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingEvent$ShareLink;", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingEvent;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShareLink implements RhyReferralsReferrerLandingEvent {
        public static final int $stable = 0;
        private final String text;

        public static /* synthetic */ ShareLink copy$default(ShareLink shareLink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shareLink.text;
            }
            return shareLink.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final ShareLink copy(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ShareLink(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShareLink) && Intrinsics.areEqual(this.text, ((ShareLink) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "ShareLink(text=" + this.text + ")";
        }

        public ShareLink(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: RhyReferralsReferrerLandingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingEvent$ShowFragment;", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingEvent;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFragment implements RhyReferralsReferrerLandingEvent {
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

    /* compiled from: RhyReferralsReferrerLandingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingEvent$ShowIneligibilityDialog;", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingEvent;", "ineligibilityData", "Lcom/robinhood/models/rhy/referral/db/RhyReferralIneligibilityData;", "<init>", "(Lcom/robinhood/models/rhy/referral/db/RhyReferralIneligibilityData;)V", "getIneligibilityData", "()Lcom/robinhood/models/rhy/referral/db/RhyReferralIneligibilityData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowIneligibilityDialog implements RhyReferralsReferrerLandingEvent {
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
