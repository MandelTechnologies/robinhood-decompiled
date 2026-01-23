package com.robinhood.android.equity.ordercheck;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EquityOrderCheckValidator.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator", m3645f = "EquityOrderCheckValidator.kt", m3646l = {83}, m3647m = "validateOrder-BWLJW6A")
/* renamed from: com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator$validateOrder$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityOrderCheckValidator3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EquityOrderCheckValidator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityOrderCheckValidator3(EquityOrderCheckValidator equityOrderCheckValidator, Continuation<? super EquityOrderCheckValidator3> continuation) {
        super(continuation);
        this.this$0 = equityOrderCheckValidator;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM13720validateOrderBWLJW6A = this.this$0.m13720validateOrderBWLJW6A(null, null, null, this);
        return objM13720validateOrderBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM13720validateOrderBWLJW6A : Result.m28549boximpl(objM13720validateOrderBWLJW6A);
    }
}
