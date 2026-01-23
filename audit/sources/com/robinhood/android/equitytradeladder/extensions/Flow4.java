package com.robinhood.android.equitytradeladder.extensions;

import com.robinhood.android.equitytradeladder.extensions.Flow3;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Flow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.extensions.FlowKt$withFallbackAfter$1$upstream$1$1", m3645f = "Flow.kt", m3646l = {29}, m3647m = "emit")
/* renamed from: com.robinhood.android.equitytradeladder.extensions.FlowKt$withFallbackAfter$1$upstream$1$1$emit$1, reason: use source file name */
/* loaded from: classes3.dex */
final class Flow4 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Flow3.C159261<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Flow4(Flow3.C159261<? super T> c159261, Continuation<? super Flow4> continuation) {
        super(continuation);
        this.this$0 = c159261;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
