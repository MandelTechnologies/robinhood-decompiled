package com.google.accompanist.pager;

import androidx.compose.foundation.gestures.ScrollableState4;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PagerState.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.google.accompanist.pager.PagerState$scrollToPage$2$1", m3645f = "PagerState.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes16.dex */
final class PagerState$scrollToPage$2$1 extends ContinuationImpl7 implements Function2<ScrollableState4, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListItemInfo $it;
    final /* synthetic */ float $pageOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerState$scrollToPage$2$1(LazyListItemInfo lazyListItemInfo, PagerState pagerState, float f, Continuation<? super PagerState$scrollToPage$2$1> continuation) {
        super(2, continuation);
        this.$it = lazyListItemInfo;
        this.this$0 = pagerState;
        this.$pageOffset = f;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PagerState$scrollToPage$2$1 pagerState$scrollToPage$2$1 = new PagerState$scrollToPage$2$1(this.$it, this.this$0, this.$pageOffset, continuation);
        pagerState$scrollToPage$2$1.L$0 = obj;
        return pagerState$scrollToPage$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScrollableState4 scrollableState4, Continuation<? super Unit> continuation) {
        return ((PagerState$scrollToPage$2$1) create(scrollableState4, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ((ScrollableState4) this.L$0).scrollBy((this.$it.getSize() + this.this$0.getItemSpacing$pager_release()) * this.$pageOffset);
        return Unit.INSTANCE;
    }
}
