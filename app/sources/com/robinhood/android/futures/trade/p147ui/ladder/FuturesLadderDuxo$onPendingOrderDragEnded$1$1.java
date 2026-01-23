package com.robinhood.android.futures.trade.p147ui.ladder;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDuxo$onPendingOrderDragEnded$1$1", m3645f = "FuturesLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FuturesLadderDuxo$onPendingOrderDragEnded$1$1 extends ContinuationImpl7 implements Function2<FuturesLadderDataState, Continuation<? super FuturesLadderDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    FuturesLadderDuxo$onPendingOrderDragEnded$1$1(Continuation<? super FuturesLadderDuxo$onPendingOrderDragEnded$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesLadderDuxo$onPendingOrderDragEnded$1$1 futuresLadderDuxo$onPendingOrderDragEnded$1$1 = new FuturesLadderDuxo$onPendingOrderDragEnded$1$1(continuation);
        futuresLadderDuxo$onPendingOrderDragEnded$1$1.L$0 = obj;
        return futuresLadderDuxo$onPendingOrderDragEnded$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FuturesLadderDataState futuresLadderDataState, Continuation<? super FuturesLadderDataState> continuation) {
        return ((FuturesLadderDuxo$onPendingOrderDragEnded$1$1) create(futuresLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((FuturesLadderDataState) this.L$0).copyToClearSelectionState();
    }
}
