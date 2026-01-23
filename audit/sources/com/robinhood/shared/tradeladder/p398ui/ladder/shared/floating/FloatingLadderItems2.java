package com.robinhood.shared.tradeladder.p398ui.ladder.shared.floating;

import androidx.compose.foundation.lazy.LazyListState;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.LazyListStates2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FloatingLadderItems.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItemsKt$FloatingLadderItems$1$1$1$1", m3645f = "FloatingLadderItems.kt", m3646l = {51}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.floating.FloatingLadderItemsKt$FloatingLadderItems$1$1$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class FloatingLadderItems2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $ladderLazyListState;
    final /* synthetic */ int $lastPriceIndex;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatingLadderItems2(LazyListState lazyListState, int i, Continuation<? super FloatingLadderItems2> continuation) {
        super(2, continuation);
        this.$ladderLazyListState = lazyListState;
        this.$lastPriceIndex = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FloatingLadderItems2(this.$ladderLazyListState, this.$lastPriceIndex, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FloatingLadderItems2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.$ladderLazyListState;
            int i2 = this.$lastPriceIndex;
            this.label = 1;
            if (LazyListStates2.centerAtIndex(lazyListState, i2, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
