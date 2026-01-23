package com.robinhood.librobinhood.data.store.bonfire.investflow;

import com.robinhood.api.investFlow.retrofit.InvestFlowApi;
import com.robinhood.investflow.models.api.sdui.ApiInvestFlowDiscoveryPageResponse;
import com.robinhood.recurring.models.api.ApiAssetType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestFlowStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowDiscoveryPageResponse;", "assetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowStore$investFlowDiscoveryEndpoint$1", m3645f = "InvestFlowStore.kt", m3646l = {36}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class InvestFlowStore$investFlowDiscoveryEndpoint$1 extends ContinuationImpl7 implements Function2<ApiAssetType, Continuation<? super ApiInvestFlowDiscoveryPageResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InvestFlowStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestFlowStore$investFlowDiscoveryEndpoint$1(InvestFlowStore investFlowStore, Continuation<? super InvestFlowStore$investFlowDiscoveryEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = investFlowStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InvestFlowStore$investFlowDiscoveryEndpoint$1 investFlowStore$investFlowDiscoveryEndpoint$1 = new InvestFlowStore$investFlowDiscoveryEndpoint$1(this.this$0, continuation);
        investFlowStore$investFlowDiscoveryEndpoint$1.L$0 = obj;
        return investFlowStore$investFlowDiscoveryEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiAssetType apiAssetType, Continuation<? super ApiInvestFlowDiscoveryPageResponse> continuation) {
        return ((InvestFlowStore$investFlowDiscoveryEndpoint$1) create(apiAssetType, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiAssetType apiAssetType = (ApiAssetType) this.L$0;
        InvestFlowApi investFlowApi = this.this$0.investFlowApi;
        this.label = 1;
        Object investFlowDiscoveryPage = investFlowApi.getInvestFlowDiscoveryPage(apiAssetType, this);
        return investFlowDiscoveryPage == coroutine_suspended ? coroutine_suspended : investFlowDiscoveryPage;
    }
}
