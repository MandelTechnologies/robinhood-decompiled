package com.robinhood.lib.equity.order;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OrderService.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/lib/equity/order/OrderState;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.lib.equity.order.OrderServiceImplementation$waitForOrdersToReachState$2$orderStates$1$1", m3645f = "OrderService.kt", m3646l = {81}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.lib.equity.order.OrderServiceImplementation$waitForOrdersToReachState$2$orderStates$1$1, reason: use source file name */
/* loaded from: classes27.dex */
final class OrderService8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super OrderState>, Object> {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ OrderService2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderService8(OrderService2 orderService2, String str, Continuation<? super OrderService8> continuation) {
        super(2, continuation);
        this.this$0 = orderService2;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderService8(this.this$0, this.$id, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OrderState> continuation) {
        return ((OrderService8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objMo22536getOrdergIAlus;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OrderService2 orderService2 = this.this$0;
            String str = this.$id;
            this.label = 1;
            objMo22536getOrdergIAlus = orderService2.mo22536getOrdergIAlus(str, this);
            if (objMo22536getOrdergIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo22536getOrdergIAlus = ((Result) obj).getValue();
        }
        if (Result.m28555isFailureimpl(objMo22536getOrdergIAlus)) {
            objMo22536getOrdergIAlus = null;
        }
        Order order = (Order) objMo22536getOrdergIAlus;
        if (order != null) {
            return order.getState();
        }
        return null;
    }
}
