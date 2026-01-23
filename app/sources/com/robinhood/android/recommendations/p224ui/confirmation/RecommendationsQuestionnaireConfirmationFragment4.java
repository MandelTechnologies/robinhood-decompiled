package com.robinhood.android.recommendations.p224ui.confirmation;

import com.robinhood.android.recommendations.p224ui.confirmation.RecommendationsQuestionnaireConfirmationFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RecommendationsQuestionnaireConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.confirmation.RecommendationsQuestionnaireConfirmationFragment$onViewCreated$1$3, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsQuestionnaireConfirmationFragment4 extends FunctionReferenceImpl implements Function0<Unit> {
    RecommendationsQuestionnaireConfirmationFragment4(Object obj) {
        super(0, obj, RecommendationsQuestionnaireConfirmationFragment.Callbacks.class, "onAnswersNotConfirmed", "onAnswersNotConfirmed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RecommendationsQuestionnaireConfirmationFragment.Callbacks) this.receiver).onAnswersNotConfirmed();
    }
}
