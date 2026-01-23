package com.robinhood.librobinhood.data.store.bonfire.investflow;

import com.robinhood.api.investFlow.retrofit.InvestFlowApi;
import com.robinhood.investflow.models.api.allocation.ApiInvestFlowPercentAllocationRequest;
import com.robinhood.investflow.models.api.allocation.ApiInvestFlowPercentAllocationResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: InvestFlowPercentAllocationStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowPercentAllocationStore$percentSplitAllocation$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class InvestFlowPercentAllocationStore2 extends FunctionReferenceImpl implements Function2<ApiInvestFlowPercentAllocationRequest, Continuation<? super ApiInvestFlowPercentAllocationResponse>, Object>, ContinuationImpl6 {
    InvestFlowPercentAllocationStore2(Object obj) {
        super(2, obj, InvestFlowApi.class, "getInvestFlowAllocationSplitPercent", "getInvestFlowAllocationSplitPercent(Lcom/robinhood/investflow/models/api/allocation/ApiInvestFlowPercentAllocationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiInvestFlowPercentAllocationRequest apiInvestFlowPercentAllocationRequest, Continuation<? super ApiInvestFlowPercentAllocationResponse> continuation) {
        return ((InvestFlowApi) this.receiver).getInvestFlowAllocationSplitPercent(apiInvestFlowPercentAllocationRequest, continuation);
    }
}
