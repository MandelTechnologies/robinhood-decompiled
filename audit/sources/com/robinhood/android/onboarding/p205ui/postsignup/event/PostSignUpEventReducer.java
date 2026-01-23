package com.robinhood.android.onboarding.p205ui.postsignup.event;

import com.robinhood.android.onboarding.p205ui.postsignup.PostSignUpContext;
import com.robinhood.android.onboarding.p205ui.postsignup.PostSignUpState;
import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpDestination;
import com.robinhood.android.onboarding.p205ui.postsignup.event.PostSignUpEvent;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostSignUpEventReducer.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ \u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0002J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J$\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEventReducer;", "", "<init>", "()V", "reduce", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpDestination;", "event", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent;", "state", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;", "context", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpContext;", "isRhy", "", "determineSplashCompleteDestination", "createIavRelationUnlessDepositQueued", "determineFinalExitApplication", "determineFundingCompletedDestination", "Lcom/robinhood/android/onboarding/ui/postsignup/event/PostSignUpEvent$FundingComplete;", "determineFundingFinishedDestination", "determineFundingUpsellDestination", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class PostSignUpEventReducer {
    public static final int $stable = 0;
    public static final PostSignUpEventReducer INSTANCE = new PostSignUpEventReducer();

    private PostSignUpEventReducer() {
    }

    public final PostSignUpDestination reduce(PostSignUpEvent event, PostSignUpState state, PostSignUpContext context, boolean isRhy) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(context, "context");
        if (event instanceof PostSignUpEvent.LoadingComplete) {
            return new PostSignUpDestination.PreFundSplash(((PostSignUpEvent.LoadingComplete) event).getShowTransition());
        }
        if (Intrinsics.areEqual(event, PostSignUpEvent.PreFundSplashComplete.INSTANCE)) {
            return determineSplashCompleteDestination(context, isRhy, state);
        }
        if (Intrinsics.areEqual(event, PostSignUpEvent.PreFundDetails.Continue.INSTANCE)) {
            return createIavRelationUnlessDepositQueued(context, state, isRhy);
        }
        if (event instanceof PostSignUpEvent.FundingComplete) {
            return determineFundingCompletedDestination((PostSignUpEvent.FundingComplete) event, state, isRhy);
        }
        if (Intrinsics.areEqual(event, PostSignUpEvent.RecurringAutomaticDeposit.INSTANCE)) {
            return determineFundingFinishedDestination(state, isRhy, context);
        }
        if (Intrinsics.areEqual(event, PostSignUpEvent.PreFundDetails.Exit.INSTANCE) || Intrinsics.areEqual(event, PostSignUpEvent.DepositQueuedMessageShown.INSTANCE) || Intrinsics.areEqual(event, PostSignUpEvent.RecurringAutomaticDepositComplete.INSTANCE)) {
            return determineFundingFinishedDestination(state, isRhy, context);
        }
        if (Intrinsics.areEqual(event, PostSignUpEvent.DocUploadComplete.INSTANCE) || Intrinsics.areEqual(event, PostSignUpEvent.ReferralComplete.INSTANCE)) {
            return determineFundingUpsellDestination(isRhy);
        }
        if (Intrinsics.areEqual(event, PostSignUpEvent.PostFundUpsellCancel.INSTANCE)) {
            return new PostSignUpDestination.Thanks(true);
        }
        if (event instanceof PostSignUpEvent.DisplayThanks) {
            return new PostSignUpDestination.Thanks(((PostSignUpEvent.DisplayThanks) event).getShowTransition());
        }
        if (Intrinsics.areEqual(event, PostSignUpEvent.ThanksExit.INSTANCE) || Intrinsics.areEqual(event, PostSignUpEvent.PostFundUpsellComplete.INSTANCE)) {
            return determineFinalExitApplication(isRhy);
        }
        if (!(event instanceof PostSignUpEvent.UkVerifyIdentityCompleted) && !(event instanceof PostSignUpEvent.UkQueuedDepositCompleted) && !(event instanceof PostSignUpEvent.BankLinkFinished) && !Intrinsics.areEqual(event, PostSignUpEvent.GoldNativeFundingUpsellCompleted.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Helm sub-flow not supported");
    }

    private final PostSignUpDestination determineSplashCompleteDestination(PostSignUpContext context, boolean isRhy, PostSignUpState state) {
        if (isRhy) {
            return createIavRelationUnlessDepositQueued(context, state, true);
        }
        return PostSignUpDestination.PreFundDetails.INSTANCE;
    }

    private final PostSignUpDestination createIavRelationUnlessDepositQueued(PostSignUpContext context, PostSignUpState state, boolean isRhy) {
        if (context.getHasQueuedDeposit()) {
            return PostSignUpDestination.DepositQueuedMessage.INSTANCE;
        }
        if (Intrinsics.areEqual(context.getLocality(), CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            return PostSignUpDestination.CreateUkQueuedDeposit.INSTANCE;
        }
        if (!state.getShouldPromptForFundingAgain() && state.getHasShownCreateIav()) {
            return determineFundingFinishedDestination$default(this, state, isRhy, null, 4, null);
        }
        return PostSignUpDestination.CreateIavRelationship.INSTANCE;
    }

    private final PostSignUpDestination determineFinalExitApplication(boolean isRhy) {
        if (isRhy) {
            return PostSignUpDestination.RhyTab.INSTANCE;
        }
        return PostSignUpDestination.Watchlist.INSTANCE;
    }

    private final PostSignUpDestination determineFundingCompletedDestination(PostSignUpEvent.FundingComplete event, PostSignUpState state, boolean isRhy) {
        if (event.getIsEligibleForRecurringDepositFlow() && !isRhy) {
            Money transferAmount = event.getTransferAmount();
            Intrinsics.checkNotNull(transferAmount);
            return new PostSignUpDestination.RecurringAutomaticDeposit(transferAmount);
        }
        return determineFundingFinishedDestination$default(this, state, isRhy, null, 4, null);
    }

    static /* synthetic */ PostSignUpDestination determineFundingFinishedDestination$default(PostSignUpEventReducer postSignUpEventReducer, PostSignUpState postSignUpState, boolean z, PostSignUpContext postSignUpContext, int i, Object obj) {
        if ((i & 4) != 0) {
            postSignUpContext = null;
        }
        return postSignUpEventReducer.determineFundingFinishedDestination(postSignUpState, z, postSignUpContext);
    }

    private final PostSignUpDestination determineFundingFinishedDestination(PostSignUpState state, boolean isRhy, PostSignUpContext context) {
        if (Intrinsics.areEqual(context != null ? context.getLocality() : null, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            return PostSignUpDestination.VerifyIdentity.INSTANCE;
        }
        if (state.getShouldShowDocUploadFlow()) {
            return new PostSignUpDestination.DocUpload(state.getLatestDocumentRequests());
        }
        if (state.getIsApplicationApproved() && !isRhy) {
            return PostSignUpDestination.Referral.INSTANCE;
        }
        if (!isRhy) {
            return PostSignUpDestination.PostFundingUpsell.INSTANCE;
        }
        return new PostSignUpDestination.Thanks(true);
    }

    private final PostSignUpDestination determineFundingUpsellDestination(boolean isRhy) {
        if (!isRhy) {
            return PostSignUpDestination.PostFundingUpsell.INSTANCE;
        }
        return new PostSignUpDestination.Thanks(true);
    }
}
