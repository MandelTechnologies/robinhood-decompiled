package com.robinhood.futures.charts.contracts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter;
import com.robinhood.futures.charts.contracts.models.FuturesProduct;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesChartsClientService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesProduct$Emission;", "it", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesProduct$Arguments;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesProduct$call$1", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesProduct$call$1 */
/* loaded from: classes15.dex */
final class C33260xff4a3295 extends ContinuationImpl7 implements Function2<FuturesChartsClientService_Adapter.Endpoint_getFuturesProduct.Arguments, Continuation<? super FuturesChartsClientService_Adapter.Endpoint_getFuturesProduct.Emission>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesChartsClientService_Adapter.Endpoint_getFuturesProduct this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C33260xff4a3295(FuturesChartsClientService_Adapter.Endpoint_getFuturesProduct endpoint_getFuturesProduct, Continuation<? super C33260xff4a3295> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_getFuturesProduct;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C33260xff4a3295 c33260xff4a3295 = new C33260xff4a3295(this.this$0, continuation);
        c33260xff4a3295.L$0 = obj;
        return c33260xff4a3295;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FuturesChartsClientService_Adapter.Endpoint_getFuturesProduct.Arguments arguments, Continuation<? super FuturesChartsClientService_Adapter.Endpoint_getFuturesProduct.Emission> continuation) {
        return ((C33260xff4a3295) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FuturesChartsClientService_Adapter.Endpoint_getFuturesProduct.Arguments arguments = (FuturesChartsClientService_Adapter.Endpoint_getFuturesProduct.Arguments) this.L$0;
            FuturesChartsClientService futuresChartsClientService = this.this$0.service;
            String productId = arguments.getProductId();
            this.label = 1;
            obj = futuresChartsClientService.getFuturesProduct(productId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return FuturesChartsClientService_Adapter.Endpoint_getFuturesProduct.Emission.m22420boximpl(FuturesChartsClientService_Adapter.Endpoint_getFuturesProduct.Emission.m22421constructorimpl((FuturesProduct) obj));
    }
}
