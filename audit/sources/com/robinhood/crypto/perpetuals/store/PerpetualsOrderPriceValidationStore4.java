package com.robinhood.crypto.perpetuals.store;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PerpetualsOrderPriceValidationStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualsOrderPriceValidationStore", m3645f = "PerpetualsOrderPriceValidationStore.kt", m3646l = {45}, m3647m = "validateOrderPrice-yxL6bBk")
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsOrderPriceValidationStore$validateOrderPrice$1, reason: use source file name */
/* loaded from: classes15.dex */
final class PerpetualsOrderPriceValidationStore4 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PerpetualsOrderPriceValidationStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerpetualsOrderPriceValidationStore4(PerpetualsOrderPriceValidationStore perpetualsOrderPriceValidationStore, Continuation<? super PerpetualsOrderPriceValidationStore4> continuation) {
        super(continuation);
        this.this$0 = perpetualsOrderPriceValidationStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM22243validateOrderPriceyxL6bBk = this.this$0.m22243validateOrderPriceyxL6bBk(null, null, null, null, this);
        return objM22243validateOrderPriceyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM22243validateOrderPriceyxL6bBk : Result.m28549boximpl(objM22243validateOrderPriceyxL6bBk);
    }
}
