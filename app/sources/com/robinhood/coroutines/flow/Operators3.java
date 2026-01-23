package com.robinhood.coroutines.flow;

import com.robinhood.coroutines.flow.Operators;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Operators.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.coroutines.flow.OperatorsKt$chunked$4$1", m3645f = "Operators.kt", m3646l = {67}, m3647m = "emit")
/* renamed from: com.robinhood.coroutines.flow.OperatorsKt$chunked$4$1$emit$1, reason: use source file name */
/* loaded from: classes15.dex */
final class Operators3 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Operators.C329734.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Operators3(Operators.C329734.AnonymousClass1<? super T> anonymousClass1, Continuation<? super Operators3> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
