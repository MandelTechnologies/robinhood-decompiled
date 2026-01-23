package com.robinhood.android.onboarding.p205ui.postsignup.event;

import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PostSignUpEvent.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0012\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0011\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "", "analyticsString", "", "<init>", "(Ljava/lang/String;)V", "getAnalyticsString", "()Ljava/lang/String;", "toString", "Receiver", "LoadingComplete", "PreFundDetails", "BankLinkFinished", "DepositQueuedMessageShown", "PreFundSplashComplete", "FundingComplete", "ReferralComplete", "DocUploadComplete", "DisplayThanks", "RecurringAutomaticDeposit", "PostFundUpsellCancel", "PostFundUpsellComplete", "RecurringAutomaticDepositComplete", "GoldNativeFundingUpsellCompleted", "UkQueuedDepositCompleted", "UkVerifyIdentityCompleted", "ThanksExit", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$BankLinkFinished;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$DepositQueuedMessageShown;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$DisplayThanks;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$DocUploadComplete;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$FundingComplete;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$GoldNativeFundingUpsellCompleted;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$LoadingComplete;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$PostFundUpsellCancel;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$PostFundUpsellComplete;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$PreFundDetails;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$PreFundSplashComplete;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$RecurringAutomaticDeposit;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$RecurringAutomaticDepositComplete;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$ReferralComplete;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$ThanksExit;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$UkQueuedDepositCompleted;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$UkVerifyIdentityCompleted;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class PostSignUpEvent {
    public static final int $stable = 0;
    private final String analyticsString;

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$Receiver;", "", "onEvent", "", "event", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Receiver {
        void onEvent(PostSignUpEvent event);
    }

    public /* synthetic */ PostSignUpEvent(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private PostSignUpEvent(String str) {
        this.analyticsString = str;
    }

    public final String getAnalyticsString() {
        return this.analyticsString;
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$LoadingComplete;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "showTransition", "", "<init>", "(Z)V", "getShowTransition", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoadingComplete extends PostSignUpEvent {
        public static final int $stable = 0;
        private final boolean showTransition;

        public static /* synthetic */ LoadingComplete copy$default(LoadingComplete loadingComplete, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loadingComplete.showTransition;
            }
            return loadingComplete.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowTransition() {
            return this.showTransition;
        }

        public final LoadingComplete copy(boolean showTransition) {
            return new LoadingComplete(showTransition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadingComplete) && this.showTransition == ((LoadingComplete) other).showTransition;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showTransition);
        }

        @Override // com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpEvent
        public String toString() {
            return "LoadingComplete(showTransition=" + this.showTransition + ")";
        }

        public LoadingComplete(boolean z) {
            super("loading_complete", null);
            this.showTransition = z;
        }

        public final boolean getShowTransition() {
            return this.showTransition;
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$PreFundDetails;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "analyticsString", "", "<init>", "(Ljava/lang/String;)V", "Exit", "Continue", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$PreFundDetails$Continue;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$PreFundDetails$Exit;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class PreFundDetails extends PostSignUpEvent {
        public static final int $stable = 0;

        public /* synthetic */ PreFundDetails(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* compiled from: PostSignUpEvent.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$PreFundDetails$Exit;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$PreFundDetails;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Exit extends PreFundDetails {
            public static final int $stable = 0;
            public static final Exit INSTANCE = new Exit();

            private Exit() {
                super("fund_upsell_exit", null);
            }
        }

        private PreFundDetails(String str) {
            super(str, null);
        }

        /* compiled from: PostSignUpEvent.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$PreFundDetails$Continue;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$PreFundDetails;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Continue extends PreFundDetails {
            public static final int $stable = 0;
            public static final Continue INSTANCE = new Continue();

            private Continue() {
                super("fund_upsell_continue", null);
            }
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$BankLinkFinished;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "isCompleted", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BankLinkFinished extends PostSignUpEvent {
        public static final int $stable = 0;
        private final boolean isCompleted;

        public static /* synthetic */ BankLinkFinished copy$default(BankLinkFinished bankLinkFinished, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bankLinkFinished.isCompleted;
            }
            return bankLinkFinished.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsCompleted() {
            return this.isCompleted;
        }

        public final BankLinkFinished copy(boolean isCompleted) {
            return new BankLinkFinished(isCompleted);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BankLinkFinished) && this.isCompleted == ((BankLinkFinished) other).isCompleted;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isCompleted);
        }

        @Override // com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpEvent
        public String toString() {
            return "BankLinkFinished(isCompleted=" + this.isCompleted + ")";
        }

        public final boolean isCompleted() {
            return this.isCompleted;
        }

        public BankLinkFinished(boolean z) {
            super("bank_link_finished", null);
            this.isCompleted = z;
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$DepositQueuedMessageShown;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DepositQueuedMessageShown extends PostSignUpEvent {
        public static final int $stable = 0;
        public static final DepositQueuedMessageShown INSTANCE = new DepositQueuedMessageShown();

        private DepositQueuedMessageShown() {
            super("deposit_queued_message_shown", null);
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$PreFundSplashComplete;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PreFundSplashComplete extends PostSignUpEvent {
        public static final int $stable = 0;
        public static final PreFundSplashComplete INSTANCE = new PreFundSplashComplete();

        private PreFundSplashComplete() {
            super("splash_complete", null);
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$FundingComplete;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "hasApprovedAchRelationship", "", "transferAmount", "Lcom/robinhood/models/util/Money;", "<init>", "(ZLcom/robinhood/models/util/Money;)V", "getHasApprovedAchRelationship", "()Z", "getTransferAmount", "()Lcom/robinhood/models/util/Money;", "isEligibleForRecurringDepositFlow", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class FundingComplete extends PostSignUpEvent {
        public static final int $stable = 8;
        private final boolean hasApprovedAchRelationship;
        private final boolean isEligibleForRecurringDepositFlow;
        private final Money transferAmount;

        public final boolean getHasApprovedAchRelationship() {
            return this.hasApprovedAchRelationship;
        }

        public final Money getTransferAmount() {
            return this.transferAmount;
        }

        public FundingComplete(boolean z, Money money) {
            super("funding_complete_" + (money != null ? "funded" : "linked_not_funded"), null);
            this.hasApprovedAchRelationship = z;
            this.transferAmount = money;
            this.isEligibleForRecurringDepositFlow = z && money != null;
        }

        /* renamed from: isEligibleForRecurringDepositFlow, reason: from getter */
        public final boolean getIsEligibleForRecurringDepositFlow() {
            return this.isEligibleForRecurringDepositFlow;
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$ReferralComplete;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ReferralComplete extends PostSignUpEvent {
        public static final int $stable = 0;
        public static final ReferralComplete INSTANCE = new ReferralComplete();

        private ReferralComplete() {
            super("referral_complete", null);
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$DocUploadComplete;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DocUploadComplete extends PostSignUpEvent {
        public static final int $stable = 0;
        public static final DocUploadComplete INSTANCE = new DocUploadComplete();

        private DocUploadComplete() {
            super("doc_upload_complete", null);
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$DisplayThanks;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "showTransition", "", "<init>", "(Z)V", "getShowTransition", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DisplayThanks extends PostSignUpEvent {
        public static final int $stable = 0;
        private final boolean showTransition;

        public static /* synthetic */ DisplayThanks copy$default(DisplayThanks displayThanks, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = displayThanks.showTransition;
            }
            return displayThanks.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowTransition() {
            return this.showTransition;
        }

        public final DisplayThanks copy(boolean showTransition) {
            return new DisplayThanks(showTransition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayThanks) && this.showTransition == ((DisplayThanks) other).showTransition;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showTransition);
        }

        @Override // com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpEvent
        public String toString() {
            return "DisplayThanks(showTransition=" + this.showTransition + ")";
        }

        public DisplayThanks(boolean z) {
            super("display_thanks", null);
            this.showTransition = z;
        }

        public final boolean getShowTransition() {
            return this.showTransition;
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$RecurringAutomaticDeposit;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RecurringAutomaticDeposit extends PostSignUpEvent {
        public static final int $stable = 0;
        public static final RecurringAutomaticDeposit INSTANCE = new RecurringAutomaticDeposit();

        private RecurringAutomaticDeposit() {
            super("recurring_automatic_deposit", null);
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$PostFundUpsellCancel;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PostFundUpsellCancel extends PostSignUpEvent {
        public static final int $stable = 0;
        public static final PostFundUpsellCancel INSTANCE = new PostFundUpsellCancel();

        private PostFundUpsellCancel() {
            super("post_fund_upsell_cancel", null);
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$PostFundUpsellComplete;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PostFundUpsellComplete extends PostSignUpEvent {
        public static final int $stable = 0;
        public static final PostFundUpsellComplete INSTANCE = new PostFundUpsellComplete();

        private PostFundUpsellComplete() {
            super("post_fund_upsell_complete", null);
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$RecurringAutomaticDepositComplete;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RecurringAutomaticDepositComplete extends PostSignUpEvent {
        public static final int $stable = 0;
        public static final RecurringAutomaticDepositComplete INSTANCE = new RecurringAutomaticDepositComplete();

        private RecurringAutomaticDepositComplete() {
            super("recurring_automatic_deposit_complete", null);
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$GoldNativeFundingUpsellCompleted;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GoldNativeFundingUpsellCompleted extends PostSignUpEvent {
        public static final int $stable = 0;
        public static final GoldNativeFundingUpsellCompleted INSTANCE = new GoldNativeFundingUpsellCompleted();

        private GoldNativeFundingUpsellCompleted() {
            super("gold_native_funding_upsell_complete", null);
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$UkQueuedDepositCompleted;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "depositSucceeded", "", "<init>", "(Z)V", "getDepositSucceeded", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UkQueuedDepositCompleted extends PostSignUpEvent {
        public static final int $stable = 0;
        private final boolean depositSucceeded;

        public static /* synthetic */ UkQueuedDepositCompleted copy$default(UkQueuedDepositCompleted ukQueuedDepositCompleted, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = ukQueuedDepositCompleted.depositSucceeded;
            }
            return ukQueuedDepositCompleted.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getDepositSucceeded() {
            return this.depositSucceeded;
        }

        public final UkQueuedDepositCompleted copy(boolean depositSucceeded) {
            return new UkQueuedDepositCompleted(depositSucceeded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UkQueuedDepositCompleted) && this.depositSucceeded == ((UkQueuedDepositCompleted) other).depositSucceeded;
        }

        public int hashCode() {
            return Boolean.hashCode(this.depositSucceeded);
        }

        @Override // com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpEvent
        public String toString() {
            return "UkQueuedDepositCompleted(depositSucceeded=" + this.depositSucceeded + ")";
        }

        public UkQueuedDepositCompleted(boolean z) {
            super("uk_queued_deposit_complete", null);
            this.depositSucceeded = z;
        }

        public final boolean getDepositSucceeded() {
            return this.depositSucceeded;
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$UkVerifyIdentityCompleted;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UkVerifyIdentityCompleted extends PostSignUpEvent {
        public static final int $stable = 0;
        public static final UkVerifyIdentityCompleted INSTANCE = new UkVerifyIdentityCompleted();

        private UkVerifyIdentityCompleted() {
            super("uk_verify_identity_complete", null);
        }
    }

    /* compiled from: PostSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$ThanksExit;", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ThanksExit extends PostSignUpEvent {
        public static final int $stable = 0;
        public static final ThanksExit INSTANCE = new ThanksExit();

        private ThanksExit() {
            super("thanks_exit", null);
        }
    }

    public String toString() {
        return this.analyticsString;
    }
}
