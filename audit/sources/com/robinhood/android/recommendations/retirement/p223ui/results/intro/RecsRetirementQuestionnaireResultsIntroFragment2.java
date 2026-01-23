package com.robinhood.android.recommendations.retirement.p223ui.results.intro;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RecsRetirementQuestionnaireResultsIntroFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.retirement.ui.results.intro.RecsRetirementQuestionnaireResultsIntroFragment$ComposeContent$3$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecsRetirementQuestionnaireResultsIntroFragment2 extends FunctionReferenceImpl implements Function1<Float, Unit> {
    RecsRetirementQuestionnaireResultsIntroFragment2(Object obj) {
        super(1, obj, RecsRetirementQuestionnaireResultsIntroDuxo.class, "updateLottieProgress", "updateLottieProgress(F)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        ((RecsRetirementQuestionnaireResultsIntroDuxo) this.receiver).updateLottieProgress(f);
    }
}
