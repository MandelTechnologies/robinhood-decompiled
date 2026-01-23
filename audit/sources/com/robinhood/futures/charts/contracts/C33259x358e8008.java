package com.robinhood.futures.charts.contracts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter;
import com.robinhood.futures.charts.contracts.models.FuturesContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesChartsClientService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesContract$Emission;", "it", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesContract$Arguments;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesContract$call$1", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesContract$call$1 */
/* loaded from: classes15.dex */
final class C33259x358e8008 extends ContinuationImpl7 implements Function2<FuturesChartsClientService_Adapter.Endpoint_getFuturesContract.Arguments, Continuation<? super FuturesChartsClientService_Adapter.Endpoint_getFuturesContract.Emission>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesChartsClientService_Adapter.Endpoint_getFuturesContract this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C33259x358e8008(FuturesChartsClientService_Adapter.Endpoint_getFuturesContract endpoint_getFuturesContract, Continuation<? super C33259x358e8008> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_getFuturesContract;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C33259x358e8008 c33259x358e8008 = new C33259x358e8008(this.this$0, continuation);
        c33259x358e8008.L$0 = obj;
        return c33259x358e8008;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FuturesChartsClientService_Adapter.Endpoint_getFuturesContract.Arguments arguments, Continuation<? super FuturesChartsClientService_Adapter.Endpoint_getFuturesContract.Emission> continuation) {
        return ((C33259x358e8008) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FuturesChartsClientService_Adapter.Endpoint_getFuturesContract.Arguments arguments = (FuturesChartsClientService_Adapter.Endpoint_getFuturesContract.Arguments) this.L$0;
            FuturesChartsClientService futuresChartsClientService = this.this$0.service;
            String contractId = arguments.getContractId();
            this.label = 1;
            obj = futuresChartsClientService.getFuturesContract(contractId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return FuturesChartsClientService_Adapter.Endpoint_getFuturesContract.Emission.m22391boximpl(FuturesChartsClientService_Adapter.Endpoint_getFuturesContract.Emission.m22392constructorimpl((FuturesContract) obj));
    }
}
