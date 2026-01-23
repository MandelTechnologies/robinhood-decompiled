package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Transform.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", m3645f = "Transform.kt", m3646l = {105, 106}, m3647m = "emit")
/* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1, reason: use source file name */
/* loaded from: classes14.dex */
final class Transform4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Transform3<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Transform4(Transform3<? super T> transform3, Continuation<? super Transform4> continuation) {
        super(continuation);
        this.this$0 = transform3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
