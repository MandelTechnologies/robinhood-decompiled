package com.robinhood.store.questionnaire;

import com.robinhood.android.questionnaire.api.ApiQuestionnaireQuestion;
import com.robinhood.api.questionnaire.QuestionnaireApi;
import com.robinhood.store.questionnaire.QuestionnaireStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: QuestionnaireStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion;", "queryParams", "Lcom/robinhood/store/questionnaire/QuestionnaireStore$GetQuestionnaireSingleQuestionQueryParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.questionnaire.QuestionnaireStore$getQuestionEndpoint$1", m3645f = "QuestionnaireStore.kt", m3646l = {74}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class QuestionnaireStore$getQuestionEndpoint$1 extends ContinuationImpl7 implements Function2<QuestionnaireStore.GetQuestionnaireSingleQuestionQueryParams, Continuation<? super ApiQuestionnaireQuestion>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ QuestionnaireStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuestionnaireStore$getQuestionEndpoint$1(QuestionnaireStore questionnaireStore, Continuation<? super QuestionnaireStore$getQuestionEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = questionnaireStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        QuestionnaireStore$getQuestionEndpoint$1 questionnaireStore$getQuestionEndpoint$1 = new QuestionnaireStore$getQuestionEndpoint$1(this.this$0, continuation);
        questionnaireStore$getQuestionEndpoint$1.L$0 = obj;
        return questionnaireStore$getQuestionEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(QuestionnaireStore.GetQuestionnaireSingleQuestionQueryParams getQuestionnaireSingleQuestionQueryParams, Continuation<? super ApiQuestionnaireQuestion> continuation) {
        return ((QuestionnaireStore$getQuestionEndpoint$1) create(getQuestionnaireSingleQuestionQueryParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        QuestionnaireStore.GetQuestionnaireSingleQuestionQueryParams getQuestionnaireSingleQuestionQueryParams = (QuestionnaireStore.GetQuestionnaireSingleQuestionQueryParams) this.L$0;
        QuestionnaireApi questionnaireApi = this.this$0.questionnaireApi;
        String questionKey = getQuestionnaireSingleQuestionQueryParams.getQuestionKey();
        String context = getQuestionnaireSingleQuestionQueryParams.getContext();
        String accountNumber = getQuestionnaireSingleQuestionQueryParams.getAccountNumber();
        this.label = 1;
        Object singleQuestionnaireQuestion = questionnaireApi.getSingleQuestionnaireQuestion(questionKey, context, accountNumber, this);
        return singleQuestionnaireQuestion == coroutine_suspended ? coroutine_suspended : singleQuestionnaireQuestion;
    }
}
