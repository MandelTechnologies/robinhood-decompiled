package com.robinhood.android.advisory.portfolio.update.results;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: UpdatePortfolioResultsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$UpdatePortfolioResultsScreen$1$2$2$1 */
/* loaded from: classes7.dex */
/* synthetic */ class C9249xea0b9bd1 extends FunctionReferenceImpl implements Function0<Unit> {
    C9249xea0b9bd1(Object obj) {
        super(0, obj, UpdatePortfolioResultsScreenCallbacks.class, "onRetryClicked", "onRetryClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((UpdatePortfolioResultsScreenCallbacks) this.receiver).onRetryClicked();
    }
}
