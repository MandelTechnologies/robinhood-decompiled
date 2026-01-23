package com.robinhood.android.recommendations.p224ui.walkthrough;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RecommendationsWalkthroughFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$animatePortfolioViewWeighted$1$1$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsWalkthroughFragment4 extends FunctionReferenceImpl implements Function0<Unit> {
    RecommendationsWalkthroughFragment4(Object obj) {
        super(0, obj, RecommendationsWalkthroughDuxo.class, "nextPage", "nextPage()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RecommendationsWalkthroughDuxo) this.receiver).nextPage();
    }
}
