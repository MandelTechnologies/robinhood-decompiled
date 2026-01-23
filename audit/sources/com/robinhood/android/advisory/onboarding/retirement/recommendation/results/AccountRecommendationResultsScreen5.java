package com.robinhood.android.advisory.onboarding.retirement.recommendation.results;

import com.robinhood.android.advisory.onboarding.retirement.recommendation.AccountRecommendationDecision;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountRecommendationResultsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsScreenKt$AccountRecommendationResultsScreen$2$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class AccountRecommendationResultsScreen5 extends FunctionReferenceImpl implements Function1<AccountRecommendationDecision, Unit> {
    AccountRecommendationResultsScreen5(Object obj) {
        super(1, obj, AccountRecommendationResultsScreen.class, "onAccountTypeDecided", "onAccountTypeDecided(Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationDecision;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AccountRecommendationDecision accountRecommendationDecision) {
        invoke2(accountRecommendationDecision);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AccountRecommendationDecision p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AccountRecommendationResultsScreen) this.receiver).onAccountTypeDecided(p0);
    }
}
