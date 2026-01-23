package com.robinhood.coroutines.flow;

import com.robinhood.coroutines.flow.Race3;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Race.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.coroutines.flow.RaceKt$race$2$1$channels$1$1$1", m3645f = "Race.kt", m3646l = {49, 50}, m3647m = "emit")
/* renamed from: com.robinhood.coroutines.flow.RaceKt$race$2$1$channels$1$1$1$emit$1, reason: use source file name */
/* loaded from: classes15.dex */
final class Race4 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Race3.C329771<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Race4(Race3.C329771<? super T> c329771, Continuation<? super Race4> continuation) {
        super(continuation);
        this.this$0 = c329771;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
