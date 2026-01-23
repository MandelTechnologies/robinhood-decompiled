package com.robinhood.android.investorprofile.p162ui.questionnaire.multiplechoicequestion;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireMultipleChoiceQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class QuestionnaireMultipleChoiceQuestionFragment2 extends FunctionReferenceImpl implements Function1<UUID, Unit> {
    QuestionnaireMultipleChoiceQuestionFragment2(Object obj) {
        super(1, obj, QuestionnaireMultipleChoiceQuestionFragment.class, "onQuestionAnswered", "onQuestionAnswered(Ljava/util/UUID;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid) {
        invoke2(uuid);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((QuestionnaireMultipleChoiceQuestionFragment) this.receiver).onQuestionAnswered(p0);
    }
}
