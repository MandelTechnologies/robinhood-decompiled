package com.robinhood.android.investorprofile.p162ui.questionnaire.multipleresponsequestion;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireMultipleResponseQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class QuestionnaireMultipleResponseQuestionFragment2 extends FunctionReferenceImpl implements Function1<List<? extends UUID>, Unit> {
    QuestionnaireMultipleResponseQuestionFragment2(Object obj) {
        super(1, obj, QuestionnaireMultipleResponseQuestionFragment.class, "onAnswerQuestions", "onAnswerQuestions(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends UUID> list) {
        invoke2((List<UUID>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<UUID> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((QuestionnaireMultipleResponseQuestionFragment) this.receiver).onAnswerQuestions(p0);
    }
}
