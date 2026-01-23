package com.robinhood.android.data.store.recommendations.retirement;

import com.robinhood.api.retrofit.RecsRetirementApi;
import com.robinhood.recommendations.retirement.models.api.ApiQuestionnaireResults;
import com.robinhood.recommendations.retirement.models.api.ApiQuestionnaireResultsRequestBody;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RecsRetirementQuestionnaireResultsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recommendations/retirement/models/api/ApiQuestionnaireResults;", "it", "Lcom/robinhood/recommendations/retirement/models/api/ApiQuestionnaireResultsRequestBody;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.data.store.recommendations.retirement.RecsRetirementQuestionnaireResultsStore$endpoint$1", m3645f = "RecsRetirementQuestionnaireResultsStore.kt", m3646l = {22}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.data.store.recommendations.retirement.RecsRetirementQuestionnaireResultsStore$endpoint$1, reason: use source file name */
/* loaded from: classes2.dex */
final class RecsRetirementQuestionnaireResultsStore2 extends ContinuationImpl7 implements Function2<ApiQuestionnaireResultsRequestBody, Continuation<? super ApiQuestionnaireResults>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecsRetirementQuestionnaireResultsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecsRetirementQuestionnaireResultsStore2(RecsRetirementQuestionnaireResultsStore recsRetirementQuestionnaireResultsStore, Continuation<? super RecsRetirementQuestionnaireResultsStore2> continuation) {
        super(2, continuation);
        this.this$0 = recsRetirementQuestionnaireResultsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecsRetirementQuestionnaireResultsStore2 recsRetirementQuestionnaireResultsStore2 = new RecsRetirementQuestionnaireResultsStore2(this.this$0, continuation);
        recsRetirementQuestionnaireResultsStore2.L$0 = obj;
        return recsRetirementQuestionnaireResultsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiQuestionnaireResultsRequestBody apiQuestionnaireResultsRequestBody, Continuation<? super ApiQuestionnaireResults> continuation) {
        return ((RecsRetirementQuestionnaireResultsStore2) create(apiQuestionnaireResultsRequestBody, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiQuestionnaireResultsRequestBody apiQuestionnaireResultsRequestBody = (ApiQuestionnaireResultsRequestBody) this.L$0;
        RecsRetirementApi recsRetirementApi = this.this$0.recsRetirementApi;
        this.label = 1;
        Object objCreateQuestionnaireResults = recsRetirementApi.createQuestionnaireResults(apiQuestionnaireResultsRequestBody, this);
        return objCreateQuestionnaireResults == coroutine_suspended ? coroutine_suspended : objCreateQuestionnaireResults;
    }
}
