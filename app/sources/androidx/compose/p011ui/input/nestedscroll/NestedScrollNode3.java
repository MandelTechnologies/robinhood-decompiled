package androidx.compose.p011ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NestedScrollNode.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", m3645f = "NestedScrollNode.kt", m3646l = {96, 97}, m3647m = "onPreFling-QWom1Mo")
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1, reason: use source file name */
/* loaded from: classes4.dex */
final class NestedScrollNode3 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollNode3(NestedScrollNode nestedScrollNode, Continuation<? super NestedScrollNode3> continuation) {
        super(continuation);
        this.this$0 = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo5609onPreFlingQWom1Mo(0L, this);
    }
}
