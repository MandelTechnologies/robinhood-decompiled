package com.robinhood.android.gold.lib.rejoin.store;

import com.robinhood.android.gold.lib.rejoin.api.ApiGoldRejoinFlow;
import com.robinhood.android.gold.lib.rejoin.api.ApiGoldRejoinFlowQueryParams;
import com.robinhood.android.gold.lib.rejoin.api.GoldRejoinApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldRejoinStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/lib/rejoin/api/ApiGoldRejoinFlow;", "<destruct>", "Lcom/robinhood/android/gold/lib/rejoin/api/ApiGoldRejoinFlowQueryParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.lib.rejoin.store.GoldRejoinStore$goldRejoinFlowEndpoint$2", m3645f = "GoldRejoinStore.kt", m3646l = {32}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.lib.rejoin.store.GoldRejoinStore$goldRejoinFlowEndpoint$2, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldRejoinStore3 extends ContinuationImpl7 implements Function2<ApiGoldRejoinFlowQueryParams, Continuation<? super ApiGoldRejoinFlow>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GoldRejoinStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldRejoinStore3(GoldRejoinStore goldRejoinStore, Continuation<? super GoldRejoinStore3> continuation) {
        super(2, continuation);
        this.this$0 = goldRejoinStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldRejoinStore3 goldRejoinStore3 = new GoldRejoinStore3(this.this$0, continuation);
        goldRejoinStore3.L$0 = obj;
        return goldRejoinStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiGoldRejoinFlowQueryParams apiGoldRejoinFlowQueryParams, Continuation<? super ApiGoldRejoinFlow> continuation) {
        return ((GoldRejoinStore3) create(apiGoldRejoinFlowQueryParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiGoldRejoinFlowQueryParams apiGoldRejoinFlowQueryParams = (ApiGoldRejoinFlowQueryParams) this.L$0;
        String source = apiGoldRejoinFlowQueryParams.getSource();
        String feature = apiGoldRejoinFlowQueryParams.getFeature();
        GoldRejoinApi goldRejoinApi = this.this$0.goldRejoinApi;
        this.label = 1;
        Object goldRejoinFlow = goldRejoinApi.getGoldRejoinFlow(source, feature, this);
        return goldRejoinFlow == coroutine_suspended ? coroutine_suspended : goldRejoinFlow;
    }
}
