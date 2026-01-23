package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PullRefresh.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", m3645f = "PullRefresh.kt", m3646l = {98}, m3647m = "onPreFling-QWom1Mo")
/* renamed from: androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1, reason: use source file name */
/* loaded from: classes4.dex */
final class PullRefresh3 extends ContinuationImpl {
    float F$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PullRefresh2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullRefresh3(PullRefresh2 pullRefresh2, Continuation<? super PullRefresh3> continuation) {
        super(continuation);
        this.this$0 = pullRefresh2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo5609onPreFlingQWom1Mo(0L, this);
    }
}
