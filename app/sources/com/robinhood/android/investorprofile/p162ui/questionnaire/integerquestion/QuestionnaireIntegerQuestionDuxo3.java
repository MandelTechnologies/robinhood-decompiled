package com.robinhood.android.investorprofile.p162ui.questionnaire.integerquestion;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: QuestionnaireIntegerQuestionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionDuxo$onContinue$1$2", m3645f = "QuestionnaireIntegerQuestionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionDuxo$onContinue$1$2, reason: use source file name */
/* loaded from: classes10.dex */
final class QuestionnaireIntegerQuestionDuxo3 extends ContinuationImpl7 implements Function2<QuestionnaireIntegerQuestionDataState, Continuation<? super QuestionnaireIntegerQuestionDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    QuestionnaireIntegerQuestionDuxo3(Continuation<? super QuestionnaireIntegerQuestionDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        QuestionnaireIntegerQuestionDuxo3 questionnaireIntegerQuestionDuxo3 = new QuestionnaireIntegerQuestionDuxo3(continuation);
        questionnaireIntegerQuestionDuxo3.L$0 = obj;
        return questionnaireIntegerQuestionDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(QuestionnaireIntegerQuestionDataState questionnaireIntegerQuestionDataState, Continuation<? super QuestionnaireIntegerQuestionDataState> continuation) {
        return ((QuestionnaireIntegerQuestionDuxo3) create(questionnaireIntegerQuestionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        QuestionnaireIntegerQuestionDataState questionnaireIntegerQuestionDataState = (QuestionnaireIntegerQuestionDataState) this.L$0;
        return QuestionnaireIntegerQuestionDataState.copy$default(questionnaireIntegerQuestionDataState, null, null, null, questionnaireIntegerQuestionDataState.getIntegerQuestion().getContent().getAboveMaxValueAlert(), 7, null);
    }
}
