package com.robinhood.librobinhood.data.store.bonfire.investflow;

import com.robinhood.api.investFlow.retrofit.InvestFlowApi;
import com.robinhood.investflow.models.api.ApiInvestFlowPostBody;
import com.robinhood.investflow.models.api.ApiInvestFlowPostResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestFlowStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/investflow/models/api/ApiInvestFlowPostResponse;", "request", "Lcom/robinhood/investflow/models/api/ApiInvestFlowPostBody;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$investFlowCreateEndpoint$1", m3645f = "InvestFlowStore.kt", m3646l = {75}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class InvestFlowStore$investFlowCreateEndpoint$1 extends ContinuationImpl7 implements Function2<ApiInvestFlowPostBody, Continuation<? super ApiInvestFlowPostResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InvestFlowStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestFlowStore$investFlowCreateEndpoint$1(InvestFlowStore investFlowStore, Continuation<? super InvestFlowStore$investFlowCreateEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = investFlowStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InvestFlowStore$investFlowCreateEndpoint$1 investFlowStore$investFlowCreateEndpoint$1 = new InvestFlowStore$investFlowCreateEndpoint$1(this.this$0, continuation);
        investFlowStore$investFlowCreateEndpoint$1.L$0 = obj;
        return investFlowStore$investFlowCreateEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiInvestFlowPostBody apiInvestFlowPostBody, Continuation<? super ApiInvestFlowPostResponse> continuation) {
        return ((InvestFlowStore$investFlowCreateEndpoint$1) create(apiInvestFlowPostBody, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiInvestFlowPostBody apiInvestFlowPostBody = (ApiInvestFlowPostBody) this.L$0;
        InvestFlowApi investFlowApi = this.this$0.investFlowApi;
        this.label = 1;
        Object objCreateInvestFlow = investFlowApi.createInvestFlow(apiInvestFlowPostBody, this);
        return objCreateInvestFlow == coroutine_suspended ? coroutine_suspended : objCreateInvestFlow;
    }
}
