package com.robinhood.android.advisory.onboarding.retirement.recommendation.selection;

import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.models.advisory.api.onboarding.recommendation.ApiAccountTypeRecommendationIntroViewModel;
import kotlin.Metadata;

/* compiled from: AccountRecommendationSelectionScreen.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionCallbacks;", "", "onGetAccountRecommendationClicked", "", "viewModel", "Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationIntroViewModel$IntroViewModel;", "onAccountRecommendationDeclined", "intro", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro$AccountSelection;", "onRetryClicked", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionCallbacks, reason: use source file name */
/* loaded from: classes7.dex */
public interface AccountRecommendationSelectionScreen {
    void onAccountRecommendationDeclined(RetirementOnboardingIntro.AccountSelection intro);

    void onGetAccountRecommendationClicked(ApiAccountTypeRecommendationIntroViewModel.IntroViewModel viewModel);

    void onRetryClicked();
}
