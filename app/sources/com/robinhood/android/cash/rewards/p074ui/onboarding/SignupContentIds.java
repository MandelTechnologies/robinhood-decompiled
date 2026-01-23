package com.robinhood.android.cash.rewards.p074ui.onboarding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOnboardingActivityViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/SignupContentIds;", "", "reviewContent", "Lcom/robinhood/android/cash/rewards/ui/onboarding/OnboardingContentEnum;", "bonusContent", "<init>", "(Lcom/robinhood/android/cash/rewards/ui/onboarding/OnboardingContentEnum;Lcom/robinhood/android/cash/rewards/ui/onboarding/OnboardingContentEnum;)V", "getReviewContent", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/OnboardingContentEnum;", "getBonusContent", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SignupContentIds {
    public static final int $stable = 0;
    private final RewardsOnboardingActivityViewState3 bonusContent;
    private final RewardsOnboardingActivityViewState3 reviewContent;

    public static /* synthetic */ SignupContentIds copy$default(SignupContentIds signupContentIds, RewardsOnboardingActivityViewState3 rewardsOnboardingActivityViewState3, RewardsOnboardingActivityViewState3 rewardsOnboardingActivityViewState32, int i, Object obj) {
        if ((i & 1) != 0) {
            rewardsOnboardingActivityViewState3 = signupContentIds.reviewContent;
        }
        if ((i & 2) != 0) {
            rewardsOnboardingActivityViewState32 = signupContentIds.bonusContent;
        }
        return signupContentIds.copy(rewardsOnboardingActivityViewState3, rewardsOnboardingActivityViewState32);
    }

    /* renamed from: component1, reason: from getter */
    public final RewardsOnboardingActivityViewState3 getReviewContent() {
        return this.reviewContent;
    }

    /* renamed from: component2, reason: from getter */
    public final RewardsOnboardingActivityViewState3 getBonusContent() {
        return this.bonusContent;
    }

    public final SignupContentIds copy(RewardsOnboardingActivityViewState3 reviewContent, RewardsOnboardingActivityViewState3 bonusContent) {
        Intrinsics.checkNotNullParameter(reviewContent, "reviewContent");
        Intrinsics.checkNotNullParameter(bonusContent, "bonusContent");
        return new SignupContentIds(reviewContent, bonusContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignupContentIds)) {
            return false;
        }
        SignupContentIds signupContentIds = (SignupContentIds) other;
        return this.reviewContent == signupContentIds.reviewContent && this.bonusContent == signupContentIds.bonusContent;
    }

    public int hashCode() {
        return (this.reviewContent.hashCode() * 31) + this.bonusContent.hashCode();
    }

    public String toString() {
        return "SignupContentIds(reviewContent=" + this.reviewContent + ", bonusContent=" + this.bonusContent + ")";
    }

    public SignupContentIds(RewardsOnboardingActivityViewState3 reviewContent, RewardsOnboardingActivityViewState3 bonusContent) {
        Intrinsics.checkNotNullParameter(reviewContent, "reviewContent");
        Intrinsics.checkNotNullParameter(bonusContent, "bonusContent");
        this.reviewContent = reviewContent;
        this.bonusContent = bonusContent;
    }

    public final RewardsOnboardingActivityViewState3 getReviewContent() {
        return this.reviewContent;
    }

    public final RewardsOnboardingActivityViewState3 getBonusContent() {
        return this.bonusContent;
    }
}
