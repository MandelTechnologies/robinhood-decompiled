package com.robinhood.futures.charts.contracts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter;
import com.robinhood.futures.charts.contracts.models.EventContractEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesChartsClientService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$Emission;", "it", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$Arguments;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$call$1", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$call$1 extends ContinuationImpl7 implements Function2<FuturesChartsClientService_Adapter.Endpoint_getEagleEvent.Arguments, Continuation<? super FuturesChartsClientService_Adapter.Endpoint_getEagleEvent.Emission>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesChartsClientService_Adapter.Endpoint_getEagleEvent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$call$1(FuturesChartsClientService_Adapter.Endpoint_getEagleEvent endpoint_getEagleEvent, Continuation<? super FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$call$1> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_getEagleEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$call$1 futuresChartsClientService_Adapter$Endpoint_getEagleEvent$call$1 = new FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$call$1(this.this$0, continuation);
        futuresChartsClientService_Adapter$Endpoint_getEagleEvent$call$1.L$0 = obj;
        return futuresChartsClientService_Adapter$Endpoint_getEagleEvent$call$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FuturesChartsClientService_Adapter.Endpoint_getEagleEvent.Arguments arguments, Continuation<? super FuturesChartsClientService_Adapter.Endpoint_getEagleEvent.Emission> continuation) {
        return ((FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$call$1) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FuturesChartsClientService_Adapter.Endpoint_getEagleEvent.Arguments arguments = (FuturesChartsClientService_Adapter.Endpoint_getEagleEvent.Arguments) this.L$0;
            FuturesChartsClientService futuresChartsClientService = this.this$0.service;
            List<String> eventContractIds = arguments.getEventContractIds();
            this.label = 1;
            obj = futuresChartsClientService.getEventContractEvent(eventContractIds, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return FuturesChartsClientService_Adapter.Endpoint_getEagleEvent.Emission.m22369boximpl(FuturesChartsClientService_Adapter.Endpoint_getEagleEvent.Emission.m22370constructorimpl((EventContractEvent) obj));
    }
}
