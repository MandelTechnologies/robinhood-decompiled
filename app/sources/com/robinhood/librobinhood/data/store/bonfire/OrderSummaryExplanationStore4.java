package com.robinhood.librobinhood.data.store.bonfire;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;

/* compiled from: OrderSummaryExplanationStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "", "Lcom/robinhood/librobinhood/data/store/bonfire/OrderSummaryExplanationArgs;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.OrderSummaryExplanationStore$endpoint$3", m3645f = "OrderSummaryExplanationStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.OrderSummaryExplanationStore$endpoint$3, reason: use source file name */
/* loaded from: classes13.dex */
final class OrderSummaryExplanationStore4 extends ContinuationImpl7 implements Function3<Long, OrderSummaryExplanationArgs, Continuation<? super Boolean>, Object> {
    int label;

    OrderSummaryExplanationStore4(Continuation<? super OrderSummaryExplanationStore4> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Long l, OrderSummaryExplanationArgs orderSummaryExplanationArgs, Continuation<? super Boolean> continuation) {
        return new OrderSummaryExplanationStore4(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return boxing.boxBoolean(true);
    }
}
