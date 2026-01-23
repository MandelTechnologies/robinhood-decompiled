package com.robinhood.android.advisory.onboarding.retirement.recommendation.results;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AccountRecommendationResultsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsScreenKt$AccountRecommendationResultsScreen$1$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class AccountRecommendationResultsScreen4 extends FunctionReferenceImpl implements Function0<Unit> {
    AccountRecommendationResultsScreen4(Object obj) {
        super(0, obj, AccountRecommendationResultsScreen.class, "onRetryClicked", "onRetryClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AccountRecommendationResultsScreen) this.receiver).onRetryClicked();
    }
}
