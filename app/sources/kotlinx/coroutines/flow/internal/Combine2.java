package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.internal.Combine;

/* compiled from: Combine.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", m3645f = "Combine.kt", m3646l = {29, 30}, m3647m = "emit")
/* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1, reason: use source file name */
/* loaded from: classes23.dex */
final class Combine2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Combine.C461292.AnonymousClass1.C508311<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Combine2(Combine.C461292.AnonymousClass1.C508311<? super T> c508311, Continuation<? super Combine2> continuation) {
        super(continuation);
        this.this$0 = c508311;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
