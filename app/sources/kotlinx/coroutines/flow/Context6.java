package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Context5;

/* compiled from: Context.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", m3645f = "Context.kt", m3646l = {271}, m3647m = "emit")
/* renamed from: kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1, reason: use source file name */
/* loaded from: classes14.dex */
final class Context6 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Context5.C460742<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Context6(Context5.C460742<? super T> c460742, Continuation<? super Context6> continuation) {
        super(continuation);
        this.this$0 = c460742;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
