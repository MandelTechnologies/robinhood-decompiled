package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.foundation.lazy.LazyListState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Ladder.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.LadderKt$FloatingLadderItems$3$1$1$1", m3645f = "Ladder.kt", m3646l = {EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 283}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class LadderKt$FloatingLadderItems$3$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $ladderLazyListState;
    final /* synthetic */ OrderPillData $orderPillData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LadderKt$FloatingLadderItems$3$1$1$1(OrderPillData orderPillData, LazyListState lazyListState, Continuation<? super LadderKt$FloatingLadderItems$3$1$1$1> continuation) {
        super(2, continuation);
        this.$orderPillData = orderPillData;
        this.$ladderLazyListState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LadderKt$FloatingLadderItems$3$1$1$1(this.$orderPillData, this.$ladderLazyListState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LadderKt$FloatingLadderItems$3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (androidx.compose.foundation.lazy.LazyListState.animateScrollToItem$default(r4, r5, 0, r10, 2, null) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (androidx.compose.foundation.lazy.LazyListState.animateScrollToItem$default(r1, r3, 0, r10, 2, null) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$orderPillData.getClosestOrderIndex() <= this.$ladderLazyListState.getFirstVisibleItemIndex()) {
                LazyListState lazyListState = this.$ladderLazyListState;
                int iCoerceAtLeast = RangesKt.coerceAtLeast(this.$orderPillData.getClosestOrderIndex() - 3, 0);
                this.label = 1;
            } else {
                int size = this.$ladderLazyListState.getLayoutInfo().getVisibleItemsInfo().size();
                LazyListState lazyListState2 = this.$ladderLazyListState;
                int closestOrderIndex = (this.$orderPillData.getClosestOrderIndex() - size) + 4;
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
