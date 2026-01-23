package com.robinhood.librobinhood.data.store;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OrderStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore", m3645f = "OrderStore.kt", m3646l = {563}, m3647m = "estimateFees-hUnOzRk")
/* loaded from: classes13.dex */
final class OrderStore$estimateFees$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderStore$estimateFees$1(OrderStore orderStore, Continuation<? super OrderStore$estimateFees$1> continuation) {
        super(continuation);
        this.this$0 = orderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM22706estimateFeeshUnOzRk = this.this$0.m22706estimateFeeshUnOzRk(null, false, null, null, null, this);
        return objM22706estimateFeeshUnOzRk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM22706estimateFeeshUnOzRk : Result.m28549boximpl(objM22706estimateFeeshUnOzRk);
    }
}
