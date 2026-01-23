package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Ladder.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.LadderKt$LadderUi$4$7$1$1$7$1", m3645f = "Ladder.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class LadderKt$LadderUi$4$7$1$1$7$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LadderCallbacks $callbacks;
    final /* synthetic */ int $index;
    final /* synthetic */ SnapshotState<Integer> $previousScrollIndex$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LadderKt$LadderUi$4$7$1$1$7$1(int i, LadderCallbacks ladderCallbacks, SnapshotState<Integer> snapshotState, Continuation<? super LadderKt$LadderUi$4$7$1$1$7$1> continuation) {
        super(2, continuation);
        this.$index = i;
        this.$callbacks = ladderCallbacks;
        this.$previousScrollIndex$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LadderKt$LadderUi$4$7$1$1$7$1(this.$index, this.$callbacks, this.$previousScrollIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LadderKt$LadderUi$4$7$1$1$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$index == 0) {
            this.$previousScrollIndex$delegate.setValue(boxing.boxInt(200));
        }
        this.$callbacks.onExpandLadder(this.$index == 0);
        return Unit.INSTANCE;
    }
}
