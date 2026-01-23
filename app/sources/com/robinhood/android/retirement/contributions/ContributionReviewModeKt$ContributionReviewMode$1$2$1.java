package com.robinhood.android.retirement.contributions;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ContributionReviewMode.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class ContributionReviewModeKt$ContributionReviewMode$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    ContributionReviewModeKt$ContributionReviewMode$1$2$1(Object obj) {
        super(0, obj, ContributionReviewCallbacks.class, "onAmountClicked", "onAmountClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ContributionReviewCallbacks) this.receiver).onAmountClicked();
    }
}
