package com.robinhood.android.advisory.onboarding.retirement.contribution;

import com.robinhood.android.retirement.contributions.ContributionEditModeState;
import com.robinhood.android.retirement.contributions.ContributionFooterState;
import com.robinhood.android.retirement.contributions.ContributionProgressRingState;
import com.robinhood.android.retirement.contributions.ContributionReviewModeState;
import com.robinhood.android.retirement.contributions.RetirementContributionScreen5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementOnboardingContributionViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001a¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionViewState;", "Lcom/robinhood/android/retirement/contributions/RetirementContributionScreenState;", "title", "", "reviewFooterState", "Lcom/robinhood/android/retirement/contributions/ContributionFooterState;", "progressRingState", "Lcom/robinhood/android/retirement/contributions/ContributionProgressRingState;", "reviewModeState", "Lcom/robinhood/android/retirement/contributions/ContributionReviewModeState;", "editModeState", "Lcom/robinhood/android/retirement/contributions/ContributionEditModeState;", "isInEditMode", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/retirement/contributions/ContributionFooterState;Lcom/robinhood/android/retirement/contributions/ContributionProgressRingState;Lcom/robinhood/android/retirement/contributions/ContributionReviewModeState;Lcom/robinhood/android/retirement/contributions/ContributionEditModeState;Z)V", "getTitle", "()Ljava/lang/String;", "getReviewFooterState", "()Lcom/robinhood/android/retirement/contributions/ContributionFooterState;", "getProgressRingState", "()Lcom/robinhood/android/retirement/contributions/ContributionProgressRingState;", "getReviewModeState", "()Lcom/robinhood/android/retirement/contributions/ContributionReviewModeState;", "getEditModeState", "()Lcom/robinhood/android/retirement/contributions/ContributionEditModeState;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RetirementOnboardingContributionViewState implements RetirementContributionScreen5 {
    public static final int $stable = ((ContributionEditModeState.$stable | ContributionReviewModeState.$stable) | ContributionProgressRingState.$stable) | ContributionFooterState.$stable;
    private final ContributionEditModeState editModeState;
    private final boolean isInEditMode;
    private final ContributionProgressRingState progressRingState;
    private final ContributionFooterState reviewFooterState;
    private final ContributionReviewModeState reviewModeState;
    private final String title;

    public static /* synthetic */ RetirementOnboardingContributionViewState copy$default(RetirementOnboardingContributionViewState retirementOnboardingContributionViewState, String str, ContributionFooterState contributionFooterState, ContributionProgressRingState contributionProgressRingState, ContributionReviewModeState contributionReviewModeState, ContributionEditModeState contributionEditModeState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = retirementOnboardingContributionViewState.title;
        }
        if ((i & 2) != 0) {
            contributionFooterState = retirementOnboardingContributionViewState.reviewFooterState;
        }
        if ((i & 4) != 0) {
            contributionProgressRingState = retirementOnboardingContributionViewState.progressRingState;
        }
        if ((i & 8) != 0) {
            contributionReviewModeState = retirementOnboardingContributionViewState.reviewModeState;
        }
        if ((i & 16) != 0) {
            contributionEditModeState = retirementOnboardingContributionViewState.editModeState;
        }
        if ((i & 32) != 0) {
            z = retirementOnboardingContributionViewState.isInEditMode;
        }
        ContributionEditModeState contributionEditModeState2 = contributionEditModeState;
        boolean z2 = z;
        return retirementOnboardingContributionViewState.copy(str, contributionFooterState, contributionProgressRingState, contributionReviewModeState, contributionEditModeState2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ContributionFooterState getReviewFooterState() {
        return this.reviewFooterState;
    }

    /* renamed from: component3, reason: from getter */
    public final ContributionProgressRingState getProgressRingState() {
        return this.progressRingState;
    }

    /* renamed from: component4, reason: from getter */
    public final ContributionReviewModeState getReviewModeState() {
        return this.reviewModeState;
    }

    /* renamed from: component5, reason: from getter */
    public final ContributionEditModeState getEditModeState() {
        return this.editModeState;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsInEditMode() {
        return this.isInEditMode;
    }

    public final RetirementOnboardingContributionViewState copy(String title, ContributionFooterState reviewFooterState, ContributionProgressRingState progressRingState, ContributionReviewModeState reviewModeState, ContributionEditModeState editModeState, boolean isInEditMode) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(reviewFooterState, "reviewFooterState");
        Intrinsics.checkNotNullParameter(progressRingState, "progressRingState");
        Intrinsics.checkNotNullParameter(reviewModeState, "reviewModeState");
        Intrinsics.checkNotNullParameter(editModeState, "editModeState");
        return new RetirementOnboardingContributionViewState(title, reviewFooterState, progressRingState, reviewModeState, editModeState, isInEditMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementOnboardingContributionViewState)) {
            return false;
        }
        RetirementOnboardingContributionViewState retirementOnboardingContributionViewState = (RetirementOnboardingContributionViewState) other;
        return Intrinsics.areEqual(this.title, retirementOnboardingContributionViewState.title) && Intrinsics.areEqual(this.reviewFooterState, retirementOnboardingContributionViewState.reviewFooterState) && Intrinsics.areEqual(this.progressRingState, retirementOnboardingContributionViewState.progressRingState) && Intrinsics.areEqual(this.reviewModeState, retirementOnboardingContributionViewState.reviewModeState) && Intrinsics.areEqual(this.editModeState, retirementOnboardingContributionViewState.editModeState) && this.isInEditMode == retirementOnboardingContributionViewState.isInEditMode;
    }

    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.reviewFooterState.hashCode()) * 31) + this.progressRingState.hashCode()) * 31) + this.reviewModeState.hashCode()) * 31) + this.editModeState.hashCode()) * 31) + Boolean.hashCode(this.isInEditMode);
    }

    public String toString() {
        return "RetirementOnboardingContributionViewState(title=" + this.title + ", reviewFooterState=" + this.reviewFooterState + ", progressRingState=" + this.progressRingState + ", reviewModeState=" + this.reviewModeState + ", editModeState=" + this.editModeState + ", isInEditMode=" + this.isInEditMode + ")";
    }

    public RetirementOnboardingContributionViewState(String title, ContributionFooterState reviewFooterState, ContributionProgressRingState progressRingState, ContributionReviewModeState reviewModeState, ContributionEditModeState editModeState, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(reviewFooterState, "reviewFooterState");
        Intrinsics.checkNotNullParameter(progressRingState, "progressRingState");
        Intrinsics.checkNotNullParameter(reviewModeState, "reviewModeState");
        Intrinsics.checkNotNullParameter(editModeState, "editModeState");
        this.title = title;
        this.reviewFooterState = reviewFooterState;
        this.progressRingState = progressRingState;
        this.reviewModeState = reviewModeState;
        this.editModeState = editModeState;
        this.isInEditMode = z;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.robinhood.android.retirement.contributions.RetirementContributionScreen5
    public ContributionFooterState getReviewFooterState() {
        return this.reviewFooterState;
    }

    @Override // com.robinhood.android.retirement.contributions.RetirementContributionScreen5
    public ContributionProgressRingState getProgressRingState() {
        return this.progressRingState;
    }

    @Override // com.robinhood.android.retirement.contributions.RetirementContributionScreen5
    public ContributionReviewModeState getReviewModeState() {
        return this.reviewModeState;
    }

    @Override // com.robinhood.android.retirement.contributions.RetirementContributionScreen5
    public ContributionEditModeState getEditModeState() {
        return this.editModeState;
    }

    @Override // com.robinhood.android.retirement.contributions.RetirementContributionScreen5
    public boolean isInEditMode() {
        return this.isInEditMode;
    }
}
