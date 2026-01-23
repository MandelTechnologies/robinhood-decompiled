package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.internal.Combine5;

/* compiled from: Combine.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", m3645f = "Combine.kt", m3646l = {87}, m3647m = "emit")
/* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1$emit$1, reason: use source file name */
/* loaded from: classes14.dex */
final class Combine6 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Combine5.C461321<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Combine6(Combine5.C461321<? super T> c461321, Continuation<? super Combine6> continuation) {
        super(continuation);
        this.this$0 = c461321;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
