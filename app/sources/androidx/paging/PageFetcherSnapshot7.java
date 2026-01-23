package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: PageFetcherSnapshot.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u008a@"}, m3636d2 = {"<anonymous>", "", "Key", "", "Value", "hint", "Landroidx/paging/ViewportHint;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1", m3645f = "PageFetcherSnapshot.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1, reason: use source file name */
/* loaded from: classes4.dex */
final class PageFetcherSnapshot7 extends ContinuationImpl7 implements Function2<ViewportHint, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot7(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Continuation<? super PageFetcherSnapshot7> continuation) {
        super(2, continuation);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PageFetcherSnapshot7 pageFetcherSnapshot7 = new PageFetcherSnapshot7(this.this$0, continuation);
        pageFetcherSnapshot7.L$0 = obj;
        return pageFetcherSnapshot7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ViewportHint viewportHint, Continuation<? super Boolean> continuation) {
        return ((PageFetcherSnapshot7) create(viewportHint, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ViewportHint viewportHint = (ViewportHint) this.L$0;
        return boxing.boxBoolean(viewportHint.getPresentedItemsBefore() * (-1) > ((PageFetcherSnapshot) this.this$0).config.jumpThreshold || viewportHint.getPresentedItemsAfter() * (-1) > ((PageFetcherSnapshot) this.this$0).config.jumpThreshold);
    }
}
