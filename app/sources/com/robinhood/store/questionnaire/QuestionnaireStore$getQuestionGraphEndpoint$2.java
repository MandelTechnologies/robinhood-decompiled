package com.robinhood.store.questionnaire;

import com.robinhood.android.questionnaire.p219db.QuestionGraphResponse;
import com.robinhood.store.questionnaire.QuestionnaireStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: QuestionnaireStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "params", "Lcom/robinhood/store/questionnaire/QuestionnaireStore$GetQuestionGraphQueryParams;", "response", "Lcom/robinhood/android/questionnaire/db/QuestionGraphResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.questionnaire.QuestionnaireStore$getQuestionGraphEndpoint$2", m3645f = "QuestionnaireStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class QuestionnaireStore$getQuestionGraphEndpoint$2 extends ContinuationImpl7 implements Function3<QuestionnaireStore.GetQuestionGraphQueryParams, QuestionGraphResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ QuestionnaireStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuestionnaireStore$getQuestionGraphEndpoint$2(QuestionnaireStore questionnaireStore, Continuation<? super QuestionnaireStore$getQuestionGraphEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = questionnaireStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(QuestionnaireStore.GetQuestionGraphQueryParams getQuestionGraphQueryParams, QuestionGraphResponse questionGraphResponse, Continuation<? super Unit> continuation) {
        QuestionnaireStore$getQuestionGraphEndpoint$2 questionnaireStore$getQuestionGraphEndpoint$2 = new QuestionnaireStore$getQuestionGraphEndpoint$2(this.this$0, continuation);
        questionnaireStore$getQuestionGraphEndpoint$2.L$0 = getQuestionGraphQueryParams;
        questionnaireStore$getQuestionGraphEndpoint$2.L$1 = questionGraphResponse;
        return questionnaireStore$getQuestionGraphEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.questionGraphDao.put((QuestionnaireStore.GetQuestionGraphQueryParams) this.L$0, (QuestionGraphResponse) this.L$1);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
