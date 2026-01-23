package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.foundation.lazy.LazyListState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.trade.extensions.LazyListStates;
import com.robinhood.android.futures.trade.p147ui.ladder.LadderEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesLadderScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderScreenKt$LadderScaffold$10$1$1$1", m3645f = "FuturesLadderScreen.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FuturesLadderScreenKt$LadderScaffold$10$1$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LadderEvent.CenterAtIndex $event;
    final /* synthetic */ LazyListState $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesLadderScreenKt$LadderScaffold$10$1$1$1(LazyListState lazyListState, LadderEvent.CenterAtIndex centerAtIndex, Continuation<? super FuturesLadderScreenKt$LadderScaffold$10$1$1$1> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$event = centerAtIndex;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesLadderScreenKt$LadderScaffold$10$1$1$1(this.$lazyListState, this.$event, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesLadderScreenKt$LadderScaffold$10$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.$lazyListState;
            int index = this.$event.getIndex();
            boolean animate = this.$event.getAnimate();
            this.label = 1;
            if (LazyListStates.centerAtIndex(lazyListState, index, animate, this) == coroutine_suspended) {
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
