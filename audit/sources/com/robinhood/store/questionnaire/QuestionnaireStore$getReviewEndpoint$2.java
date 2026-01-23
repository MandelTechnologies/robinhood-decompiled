package com.robinhood.store.questionnaire;

import com.robinhood.android.questionnaire.api.ApiQuestionnaireReview;
import com.robinhood.android.questionnaire.api.ReviewQueryParams;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: QuestionnaireStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/android/questionnaire/api/ReviewQueryParams;", "review", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireReview;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.questionnaire.QuestionnaireStore$getReviewEndpoint$2", m3645f = "QuestionnaireStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class QuestionnaireStore$getReviewEndpoint$2 extends ContinuationImpl7 implements Function3<ReviewQueryParams, ApiQuestionnaireReview, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ QuestionnaireStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuestionnaireStore$getReviewEndpoint$2(QuestionnaireStore questionnaireStore, Continuation<? super QuestionnaireStore$getReviewEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = questionnaireStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(ReviewQueryParams reviewQueryParams, ApiQuestionnaireReview apiQuestionnaireReview, Continuation<? super Unit> continuation) {
        QuestionnaireStore$getReviewEndpoint$2 questionnaireStore$getReviewEndpoint$2 = new QuestionnaireStore$getReviewEndpoint$2(this.this$0, continuation);
        questionnaireStore$getReviewEndpoint$2.L$0 = reviewQueryParams;
        questionnaireStore$getReviewEndpoint$2.L$1 = apiQuestionnaireReview;
        return questionnaireStore$getReviewEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ReviewQueryParams reviewQueryParams = (ReviewQueryParams) this.L$0;
        ApiQuestionnaireReview apiQuestionnaireReview = (ApiQuestionnaireReview) this.L$1;
        this.this$0.getQuestionnaireReviewRelay(reviewQueryParams.getContext()).accept(apiQuestionnaireReview.toUiModel());
        return Unit.INSTANCE;
    }
}
