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
@DebugMetadata(m3644c = "com.robinhood.lib.equity.order.OrderServiceImplementation", m3645f = "OrderService.kt", m3646l = {112, EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, m3647m = "maintenanceCallSellPosition-bMdYcbs")
/* renamed from: com.robinhood.lib.equity.order.OrderServiceImplementation$maintenanceCallSellPosition$1, reason: use source file name */
/* loaded from: classes27.dex */
final class OrderService5 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrderService2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderService5(OrderService2 orderService2, Continuation<? super OrderService5> continuation) {
        super(continuation);
        this.this$0 = orderService2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo22537maintenanceCallSellPositionbMdYcbs = this.this$0.mo22537maintenanceCallSellPositionbMdYcbs(null, null, null, null, null, false, this);
        return objMo22537maintenanceCallSellPositionbMdYcbs == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo22537maintenanceCallSellPositionbMdYcbs : Result.m28549boximpl(objMo22537maintenanceCallSellPositionbMdYcbs);
    }
}
