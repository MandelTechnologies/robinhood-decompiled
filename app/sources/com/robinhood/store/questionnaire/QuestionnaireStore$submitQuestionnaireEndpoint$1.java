package com.robinhood.store.questionnaire;

import com.robinhood.android.questionnaire.api.ApiQuestionnaireSubmitRequest;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireSubmitResponse;
import com.robinhood.api.questionnaire.QuestionnaireApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: QuestionnaireStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireSubmitResponse;", "it", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireSubmitRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.questionnaire.QuestionnaireStore$submitQuestionnaireEndpoint$1", m3645f = "QuestionnaireStore.kt", m3646l = {87}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class QuestionnaireStore$submitQuestionnaireEndpoint$1 extends ContinuationImpl7 implements Function2<ApiQuestionnaireSubmitRequest, Continuation<? super ApiQuestionnaireSubmitResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ QuestionnaireStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuestionnaireStore$submitQuestionnaireEndpoint$1(QuestionnaireStore questionnaireStore, Continuation<? super QuestionnaireStore$submitQuestionnaireEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = questionnaireStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        QuestionnaireStore$submitQuestionnaireEndpoint$1 questionnaireStore$submitQuestionnaireEndpoint$1 = new QuestionnaireStore$submitQuestionnaireEndpoint$1(this.this$0, continuation);
        questionnaireStore$submitQuestionnaireEndpoint$1.L$0 = obj;
        return questionnaireStore$submitQuestionnaireEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiQuestionnaireSubmitRequest apiQuestionnaireSubmitRequest, Continuation<? super ApiQuestionnaireSubmitResponse> continuation) {
        return ((QuestionnaireStore$submitQuestionnaireEndpoint$1) create(apiQuestionnaireSubmitRequest, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiQuestionnaireSubmitRequest apiQuestionnaireSubmitRequest = (ApiQuestionnaireSubmitRequest) this.L$0;
        QuestionnaireApi questionnaireApi = this.this$0.questionnaireApi;
        this.label = 1;
        Object objSubmitQuestionAnswers = questionnaireApi.submitQuestionAnswers(apiQuestionnaireSubmitRequest, this);
        return objSubmitQuestionAnswers == coroutine_suspended ? coroutine_suspended : objSubmitQuestionAnswers;
    }
}
