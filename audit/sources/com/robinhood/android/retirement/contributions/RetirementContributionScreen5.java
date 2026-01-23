package com.robinhood.android.retirement.contributions;

import kotlin.Metadata;

/* compiled from: RetirementContributionScreen.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/retirement/contributions/RetirementContributionScreenState;", "", "isInEditMode", "", "()Z", "progressRingState", "Lcom/robinhood/android/retirement/contributions/ContributionProgressRingState;", "getProgressRingState", "()Lcom/robinhood/android/retirement/contributions/ContributionProgressRingState;", "reviewModeState", "Lcom/robinhood/android/retirement/contributions/ContributionReviewModeState;", "getReviewModeState", "()Lcom/robinhood/android/retirement/contributions/ContributionReviewModeState;", "editModeState", "Lcom/robinhood/android/retirement/contributions/ContributionEditModeState;", "getEditModeState", "()Lcom/robinhood/android/retirement/contributions/ContributionEditModeState;", "reviewFooterState", "Lcom/robinhood/android/retirement/contributions/ContributionFooterState;", "getReviewFooterState", "()Lcom/robinhood/android/retirement/contributions/ContributionFooterState;", "lib-retirement-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.contributions.RetirementContributionScreenState, reason: use source file name */
/* loaded from: classes5.dex */
public interface RetirementContributionScreen5 {
    ContributionEditModeState getEditModeState();

    ContributionProgressRingState getProgressRingState();

    ContributionFooterState getReviewFooterState();

    ContributionReviewModeState getReviewModeState();

    boolean isInEditMode();
}
