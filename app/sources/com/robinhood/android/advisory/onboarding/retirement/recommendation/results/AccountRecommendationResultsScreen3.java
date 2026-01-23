package com.robinhood.android.advisory.onboarding.retirement.recommendation.results;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AccountRecommendationResultsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsScreenKt$AccountRecommendationIneligibleScreen$2$1$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class AccountRecommendationResultsScreen3 extends FunctionReferenceImpl implements Function0<Unit> {
    AccountRecommendationResultsScreen3(Object obj) {
        super(0, obj, AccountRecommendationResultsScreen.class, "onIneligibleDoneClicked", "onIneligibleDoneClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AccountRecommendationResultsScreen) this.receiver).onIneligibleDoneClicked();
    }
}
