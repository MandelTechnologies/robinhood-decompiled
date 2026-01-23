package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.foundation.lazy.LazyListState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.trade.extensions.LazyListStates;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Ladder.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.LadderKt$FloatingLadderItems$1$1$1$1", m3645f = "Ladder.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class LadderKt$FloatingLadderItems$1$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FuturesLadderViewState.LadderData $ladderData;
    final /* synthetic */ LazyListState $ladderLazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LadderKt$FloatingLadderItems$1$1$1$1(LazyListState lazyListState, FuturesLadderViewState.LadderData ladderData, Continuation<? super LadderKt$FloatingLadderItems$1$1$1$1> continuation) {
        super(2, continuation);
        this.$ladderLazyListState = lazyListState;
        this.$ladderData = ladderData;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LadderKt$FloatingLadderItems$1$1$1$1(this.$ladderLazyListState, this.$ladderData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LadderKt$FloatingLadderItems$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.$ladderLazyListState;
            int lastPriceIndex = this.$ladderData.getLastPriceIndex();
            this.label = 1;
            if (LazyListStates.centerAtIndex(lazyListState, lastPriceIndex, true, this) == coroutine_suspended) {
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
