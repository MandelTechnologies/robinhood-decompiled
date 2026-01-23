package com.robinhood.android.advisory.onboarding.retirement.recommendation.results;

import com.robinhood.android.advisory.onboarding.retirement.recommendation.AccountRecommendationDecision;
import kotlin.Metadata;

/* compiled from: AccountRecommendationResultsScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsCallbacks;", "", "onAccountTypeDecided", "", "decision", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationDecision;", "onIneligibleDoneClicked", "onRetryClicked", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsCallbacks, reason: use source file name */
/* loaded from: classes7.dex */
public interface AccountRecommendationResultsScreen {
    void onAccountTypeDecided(AccountRecommendationDecision decision);

    void onIneligibleDoneClicked();

    void onRetryClicked();
}
