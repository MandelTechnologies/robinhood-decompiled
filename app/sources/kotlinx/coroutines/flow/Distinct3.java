package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Distinct2;

/* compiled from: Distinct.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m3645f = "Distinct.kt", m3646l = {73}, m3647m = "emit")
/* renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1, reason: use source file name */
/* loaded from: classes23.dex */
final class Distinct3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Distinct2.C460752<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Distinct3(Distinct2.C460752<? super T> c460752, Continuation<? super Distinct3> continuation) {
        super(continuation);
        this.this$0 = c460752;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
