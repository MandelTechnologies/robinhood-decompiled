package com.robinhood.lib.equity.order;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OrderService.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.lib.equity.order.OrderServiceImplementation", m3645f = "OrderService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE}, m3647m = "cancelOrder-gIAlu-s")
/* renamed from: com.robinhood.lib.equity.order.OrderServiceImplementation$cancelOrder$1, reason: use source file name */
/* loaded from: classes27.dex */
final class OrderService3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrderService2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderService3(OrderService2 orderService2, Continuation<? super OrderService3> continuation) {
        super(continuation);
        this.this$0 = orderService2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo22535cancelOrdergIAlus = this.this$0.mo22535cancelOrdergIAlus(null, this);
        return objMo22535cancelOrdergIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo22535cancelOrdergIAlus : Result.m28549boximpl(objMo22535cancelOrdergIAlus);
    }
}
