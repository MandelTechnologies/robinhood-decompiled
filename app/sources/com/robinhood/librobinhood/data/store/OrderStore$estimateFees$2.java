package com.robinhood.librobinhood.data.store;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OrderStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore", m3645f = "OrderStore.kt", m3646l = {574}, m3647m = "estimateFees-gIAlu-s")
/* loaded from: classes13.dex */
final class OrderStore$estimateFees$2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderStore$estimateFees$2(OrderStore orderStore, Continuation<? super OrderStore$estimateFees$2> continuation) {
        super(continuation);
        this.this$0 = orderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM22705estimateFeesgIAlus = this.this$0.m22705estimateFeesgIAlus(null, this);
        return objM22705estimateFeesgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM22705estimateFeesgIAlus : Result.m28549boximpl(objM22705estimateFeesgIAlus);
    }
}
