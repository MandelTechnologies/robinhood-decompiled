package com.robinhood.android.rhy.referral.welcome;

import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.rhy.referral.RhyReferralOnboardingStore4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeRhyEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyEvent;", "", "Navigate", "ShowDialog", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyEvent$Navigate;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyEvent$ShowDialog;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface WelcomeRhyEvent {

    /* compiled from: WelcomeRhyEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyEvent$Navigate;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyEvent;", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Navigate implements WelcomeRhyEvent {
        public static final int $stable = 8;
        private final IntentKey intentKey;

        public static /* synthetic */ Navigate copy$default(Navigate navigate, IntentKey intentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                intentKey = navigate.intentKey;
            }
            return navigate.copy(intentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final IntentKey getIntentKey() {
            return this.intentKey;
        }

        public final Navigate copy(IntentKey intentKey) {
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            return new Navigate(intentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Navigate) && Intrinsics.areEqual(this.intentKey, ((Navigate) other).intentKey);
        }

        public int hashCode() {
            return this.intentKey.hashCode();
        }

        public String toString() {
            return "Navigate(intentKey=" + this.intentKey + ")";
        }

        public Navigate(IntentKey intentKey) {
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            this.intentKey = intentKey;
        }

        public final IntentKey getIntentKey() {
            return this.intentKey;
        }
    }

    /* compiled from: WelcomeRhyEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyEvent$ShowDialog;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyEvent;", "dialog", "Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;", "<init>", "(Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;)V", "getDialog", "()Lcom/robinhood/rhy/referral/RhyReferralOutAction$Dialog$DialogContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowDialog implements WelcomeRhyEvent {
        public static final int $stable = 8;
        private final RhyReferralOnboardingStore4.Dialog.DialogContent dialog;

        public static /* synthetic */ ShowDialog copy$default(ShowDialog showDialog, RhyReferralOnboardingStore4.Dialog.DialogContent dialogContent, int i, Object obj) {
            if ((i & 1) != 0) {
                dialogContent = showDialog.dialog;
            }
            return showDialog.copy(dialogContent);
        }

        /* renamed from: component1, reason: from getter */
        public final RhyReferralOnboardingStore4.Dialog.DialogContent getDialog() {
            return this.dialog;
        }

        public final ShowDialog copy(RhyReferralOnboardingStore4.Dialog.DialogContent dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            return new ShowDialog(dialog);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowDialog) && Intrinsics.areEqual(this.dialog, ((ShowDialog) other).dialog);
        }

        public int hashCode() {
            return this.dialog.hashCode();
        }

        public String toString() {
            return "ShowDialog(dialog=" + this.dialog + ")";
        }

        public ShowDialog(RhyReferralOnboardingStore4.Dialog.DialogContent dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.dialog = dialog;
        }

        public final RhyReferralOnboardingStore4.Dialog.DialogContent getDialog() {
            return this.dialog;
        }
    }
}
