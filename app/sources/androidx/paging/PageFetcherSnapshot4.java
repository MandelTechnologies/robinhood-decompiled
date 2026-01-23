package androidx.paging;

import androidx.paging.PageFetcherSnapshot3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PageFetcherSnapshot.kt */
@Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1", m3645f = "PageFetcherSnapshot.kt", m3646l = {95}, m3647m = "emit")
/* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1, reason: use source file name */
/* loaded from: classes4.dex */
final class PageFetcherSnapshot4 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageFetcherSnapshot3.C27572.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PageFetcherSnapshot4(PageFetcherSnapshot3.C27572.AnonymousClass1<? super T> anonymousClass1, Continuation<? super PageFetcherSnapshot4> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((PageEvent) null, (Continuation<? super Unit>) this);
    }
}
