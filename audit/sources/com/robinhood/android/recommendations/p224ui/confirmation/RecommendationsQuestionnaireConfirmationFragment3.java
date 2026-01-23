package com.robinhood.android.recommendations.p224ui.confirmation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RecommendationsQuestionnaireConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.confirmation.RecommendationsQuestionnaireConfirmationFragment$onViewCreated$1$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsQuestionnaireConfirmationFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    RecommendationsQuestionnaireConfirmationFragment3(Object obj) {
        super(0, obj, RecommendationsQuestionnaireConfirmationDuxo.class, "confirmAnswers", "confirmAnswers()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RecommendationsQuestionnaireConfirmationDuxo) this.receiver).confirmAnswers();
    }
}
