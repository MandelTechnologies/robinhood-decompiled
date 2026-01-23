package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.recommendations.models.api.ApiRecommendationsQuestionnaireConfirmationPostBody;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RecommendationsQuestionnaireStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsQuestionnaireConfirmationPostBody;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsQuestionnaireStore$confirmationEndpoint$1", m3645f = "RecommendationsQuestionnaireStore.kt", m3646l = {33}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsQuestionnaireStore$confirmationEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RecommendationsQuestionnaireStore2 extends ContinuationImpl7 implements Function2<ApiRecommendationsQuestionnaireConfirmationPostBody, Continuation<? super Unit>, Object> {
    final /* synthetic */ RecommendationsApi $recommendationsApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecommendationsQuestionnaireStore2(RecommendationsApi recommendationsApi, Continuation<? super RecommendationsQuestionnaireStore2> continuation) {
        super(2, continuation);
        this.$recommendationsApi = recommendationsApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecommendationsQuestionnaireStore2 recommendationsQuestionnaireStore2 = new RecommendationsQuestionnaireStore2(this.$recommendationsApi, continuation);
        recommendationsQuestionnaireStore2.L$0 = obj;
        return recommendationsQuestionnaireStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiRecommendationsQuestionnaireConfirmationPostBody apiRecommendationsQuestionnaireConfirmationPostBody, Continuation<? super Unit> continuation) {
        return ((RecommendationsQuestionnaireStore2) create(apiRecommendationsQuestionnaireConfirmationPostBody, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiRecommendationsQuestionnaireConfirmationPostBody apiRecommendationsQuestionnaireConfirmationPostBody = (ApiRecommendationsQuestionnaireConfirmationPostBody) this.L$0;
            RecommendationsApi recommendationsApi = this.$recommendationsApi;
            this.label = 1;
            if (recommendationsApi.confirmRecommendationsQuestionnaireAnswers(apiRecommendationsQuestionnaireConfirmationPostBody, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
