package com.robinhood.android.equitytradeladder;

import androidx.compose.foundation.lazy.LazyListState;
import com.robinhood.android.equitytradeladder.EquityTradeLadderEvent;
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

/* compiled from: EquityTradeLadderEventHandler.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$13$1$2$1$1", m3645f = "EquityTradeLadderEventHandler.kt", m3646l = {136}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderEventHandlerKt$EquityTradeLadderEventHandler$13$1$2$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityTradeLadderEventHandler3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EquityTradeLadderEvent.CenterAtIndex $event;
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradeLadderEventHandler3(LazyListState lazyListState, EquityTradeLadderEvent.CenterAtIndex centerAtIndex, Continuation<? super EquityTradeLadderEventHandler3> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$event = centerAtIndex;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityTradeLadderEventHandler3(this.$listState, this.$event, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityTradeLadderEventHandler3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.$listState;
            int index = this.$event.getIndex();
            boolean animate = this.$event.getAnimate();
            this.label = 1;
            if (LazyListStates2.centerAtIndex(lazyListState, index, animate, this) == coroutine_suspended) {
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
