package com.robinhood.android.advisory.onboarding.retirement.recommendation;

import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.models.advisory.api.onboarding.recommendation.ApiAccountTypeRecommendationIntroViewModel;
import kotlin.Metadata;

/* compiled from: AccountRecommendationCallbacks.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationCallbacks;", "", "onGetAccountRecommendationClicked", "", "viewModel", "Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationIntroViewModel$IntroViewModel;", "onAccountRecommendationDeclined", "intro", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro$AccountSelection;", "onMultiYearContinueClicked", "Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationIntroViewModel$MultiYearViewModel;", "onTaxYearSelected", "context", "", "onAccountTypeDecided", "decision", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationDecision;", "onIneligibleDoneClicked", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AccountRecommendationCallbacks {
    void onAccountRecommendationDeclined(RetirementOnboardingIntro.AccountSelection intro);

    void onAccountTypeDecided(AccountRecommendationDecision decision);

    void onGetAccountRecommendationClicked(ApiAccountTypeRecommendationIntroViewModel.IntroViewModel viewModel);

    void onIneligibleDoneClicked();

    void onMultiYearContinueClicked(ApiAccountTypeRecommendationIntroViewModel.MultiYearViewModel viewModel);

    void onTaxYearSelected(String context);
}
