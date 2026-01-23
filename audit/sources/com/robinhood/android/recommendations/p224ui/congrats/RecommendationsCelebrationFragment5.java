package com.robinhood.android.recommendations.p224ui.congrats;

import com.robinhood.android.recommendations.p224ui.congrats.RecommendationsCelebrationFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RecommendationsCelebrationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.congrats.RecommendationsCelebrationFragment$fadeInViews$2$onAnimationEnd$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsCelebrationFragment5 extends FunctionReferenceImpl implements Function0<Unit> {
    RecommendationsCelebrationFragment5(Object obj) {
        super(0, obj, RecommendationsCelebrationFragment.Callbacks.class, "onExitCelebration", "onExitCelebration()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RecommendationsCelebrationFragment.Callbacks) this.receiver).onExitCelebration();
    }
}
