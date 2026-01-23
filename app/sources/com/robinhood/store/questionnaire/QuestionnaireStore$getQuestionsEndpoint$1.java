package com.robinhood.store.questionnaire;

import com.robinhood.android.questionnaire.api.ApiQuestionnaireQuestion;
import com.robinhood.api.questionnaire.QuestionnaireApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.store.questionnaire.QuestionnaireStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: QuestionnaireStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion;", "queryParams", "Lcom/robinhood/store/questionnaire/QuestionnaireStore$GetQuestionnaireQuestionsQueryParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.questionnaire.QuestionnaireStore$getQuestionsEndpoint$1", m3645f = "QuestionnaireStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class QuestionnaireStore$getQuestionsEndpoint$1 extends ContinuationImpl7 implements Function2<QuestionnaireStore.GetQuestionnaireQuestionsQueryParams, Continuation<? super PaginatedResult<? extends ApiQuestionnaireQuestion>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ QuestionnaireStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuestionnaireStore$getQuestionsEndpoint$1(QuestionnaireStore questionnaireStore, Continuation<? super QuestionnaireStore$getQuestionsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = questionnaireStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        QuestionnaireStore$getQuestionsEndpoint$1 questionnaireStore$getQuestionsEndpoint$1 = new QuestionnaireStore$getQuestionsEndpoint$1(this.this$0, continuation);
        questionnaireStore$getQuestionsEndpoint$1.L$0 = obj;
        return questionnaireStore$getQuestionsEndpoint$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(QuestionnaireStore.GetQuestionnaireQuestionsQueryParams getQuestionnaireQuestionsQueryParams, Continuation<? super PaginatedResult<ApiQuestionnaireQuestion>> continuation) {
        return ((QuestionnaireStore$getQuestionsEndpoint$1) create(getQuestionnaireQuestionsQueryParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(QuestionnaireStore.GetQuestionnaireQuestionsQueryParams getQuestionnaireQuestionsQueryParams, Continuation<? super PaginatedResult<? extends ApiQuestionnaireQuestion>> continuation) {
        return invoke2(getQuestionnaireQuestionsQueryParams, (Continuation<? super PaginatedResult<ApiQuestionnaireQuestion>>) continuation);
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
        QuestionnaireStore.GetQuestionnaireQuestionsQueryParams getQuestionnaireQuestionsQueryParams = (QuestionnaireStore.GetQuestionnaireQuestionsQueryParams) this.L$0;
        QuestionnaireApi questionnaireApi = this.this$0.questionnaireApi;
        String context = getQuestionnaireQuestionsQueryParams.getContext();
        String accountNumber = getQuestionnaireQuestionsQueryParams.getAccountNumber();
        List<String> questionKeys = getQuestionnaireQuestionsQueryParams.getQuestionKeys();
        boolean includeQuestionsAlreadyAnswered = getQuestionnaireQuestionsQueryParams.getIncludeQuestionsAlreadyAnswered();
        this.label = 1;
        Object questionnaireQuestions = questionnaireApi.getQuestionnaireQuestions(context, accountNumber, questionKeys, includeQuestionsAlreadyAnswered, this);
        return questionnaireQuestions == coroutine_suspended ? coroutine_suspended : questionnaireQuestions;
    }
}
