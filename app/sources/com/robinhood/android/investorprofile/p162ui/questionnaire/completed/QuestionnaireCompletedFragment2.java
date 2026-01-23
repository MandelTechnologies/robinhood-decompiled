package com.robinhood.android.investorprofile.p162ui.questionnaire.completed;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: QuestionnaireCompletedFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.completed.QuestionnaireCompletedFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class QuestionnaireCompletedFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    QuestionnaireCompletedFragment2(Object obj) {
        super(0, obj, QuestionnaireCompletedCallbacks.class, "onQuestionnaireFlowCompleted", "onQuestionnaireFlowCompleted()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((QuestionnaireCompletedCallbacks) this.receiver).onQuestionnaireFlowCompleted();
    }
}
