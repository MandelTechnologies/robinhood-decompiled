package com.robinhood.android.investorprofile.p162ui.questionnaire.integerquestion;

import com.robinhood.android.investorprofile.p162ui.questionnaire.ContextualQuestionInfo;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionFragmentCallbacks;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireIntegerQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class QuestionnaireIntegerQuestionFragment2 extends FunctionReferenceImpl implements Function2<ContextualQuestionInfo, QuestionnaireAnswer, Unit> {
    QuestionnaireIntegerQuestionFragment2(Object obj) {
        super(2, obj, QuestionFragmentCallbacks.class, "onQuestionAnswered", "onQuestionAnswered(Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ContextualQuestionInfo contextualQuestionInfo, QuestionnaireAnswer questionnaireAnswer) {
        invoke2(contextualQuestionInfo, questionnaireAnswer);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ContextualQuestionInfo p0, QuestionnaireAnswer p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((QuestionFragmentCallbacks) this.receiver).onQuestionAnswered(p0, p1);
    }
}
