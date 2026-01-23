package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderGestureAwareLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$1$1", m3645f = "LadderGestureAwareLazyColumn.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$1$1 */
/* loaded from: classes10.dex */
final class C17553x670a1043 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $currentScaleIsFromTheDuxo$delegate;
    final /* synthetic */ Function1<Integer, Unit> $onZoomScaleChanged;
    final /* synthetic */ SnapshotState4<Integer> $zoomScale$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C17553x670a1043(Function1<? super Integer, Unit> function1, SnapshotState<Boolean> snapshotState, SnapshotState4<Integer> snapshotState4, Continuation<? super C17553x670a1043> continuation) {
        super(2, continuation);
        this.$onZoomScaleChanged = function1;
        this.$currentScaleIsFromTheDuxo$delegate = snapshotState;
        this.$zoomScale$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C17553x670a1043(this.$onZoomScaleChanged, this.$currentScaleIsFromTheDuxo$delegate, this.$zoomScale$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C17553x670a1043) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$55$lambda$38(this.$currentScaleIsFromTheDuxo$delegate)) {
                LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$55$lambda$39(this.$currentScaleIsFromTheDuxo$delegate, false);
            } else {
                this.$onZoomScaleChanged.invoke(boxing.boxInt(LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$55$lambda$36(this.$zoomScale$delegate)));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
