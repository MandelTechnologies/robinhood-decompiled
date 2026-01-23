package com.robinhood.equity.ordersummary.contracts;

import com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter;
import com.robinhood.equity.ordersummary.contracts.models.OrderSummaryParams;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityOrderSummaryService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderSummary$Emission;", "it", "Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderSummary$Arguments;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter$Endpoint_getOrderSummary$call$1", m3645f = "EquityOrderSummaryService_Adapter.kt", m3646l = {65}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter$Endpoint_getOrderSummary$call$1 */
/* loaded from: classes15.dex */
final class C33141x687ec0ef extends ContinuationImpl7 implements Function2<EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary.Arguments, Continuation<? super EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary.Emission>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C33141x687ec0ef(EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary endpoint_getOrderSummary, Continuation<? super C33141x687ec0ef> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_getOrderSummary;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C33141x687ec0ef c33141x687ec0ef = new C33141x687ec0ef(this.this$0, continuation);
        c33141x687ec0ef.L$0 = obj;
        return c33141x687ec0ef;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary.Arguments arguments, Continuation<? super EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary.Emission> continuation) {
        return ((C33141x687ec0ef) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary.Arguments arguments = (EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary.Arguments) this.L$0;
            EquityOrderSummaryService equityOrderSummaryService = this.this$0.service;
            OrderSummaryParams params = arguments.getParams();
            this.label = 1;
            obj = equityOrderSummaryService.getOrderSummary(params, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary.Emission.m22303boximpl(EquityOrderSummaryService_Adapter.Endpoint_getOrderSummary.Emission.m22304constructorimpl((String) obj));
    }
}
