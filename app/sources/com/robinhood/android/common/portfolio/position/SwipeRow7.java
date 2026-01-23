package com.robinhood.android.common.portfolio.position;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.swipetodismiss.SwipeToDismiss2;
import com.robinhood.android.swipetodismiss.SwipeToDismiss3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SwipeRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.SwipeRowKt$SwipeRow$7$1", m3645f = "SwipeRow.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.portfolio.position.SwipeRowKt$SwipeRow$7$1, reason: use source file name */
/* loaded from: classes2.dex */
final class SwipeRow7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $didVibrate$delegate;
    final /* synthetic */ SwipeToDismiss2 $dismissState;
    final /* synthetic */ SnapshotState<Boolean> $isRowResetting$delegate;
    final /* synthetic */ SnapshotState<Boolean> $showSpinner$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeRow7(SwipeToDismiss2 swipeToDismiss2, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<Boolean> snapshotState3, Continuation<? super SwipeRow7> continuation) {
        super(2, continuation);
        this.$dismissState = swipeToDismiss2;
        this.$isRowResetting$delegate = snapshotState;
        this.$didVibrate$delegate = snapshotState2;
        this.$showSpinner$delegate = snapshotState3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwipeRow7(this.$dismissState, this.$isRowResetting$delegate, this.$didVibrate$delegate, this.$showSpinner$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwipeRow7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (SwipeRow3.SwipeRow$lambda$16(this.$isRowResetting$delegate)) {
                SwipeToDismiss3 currentValue = this.$dismissState.getCurrentValue();
                SwipeToDismiss3 swipeToDismiss3 = SwipeToDismiss3.Default;
                if (currentValue != swipeToDismiss3) {
                    SwipeToDismiss2 swipeToDismiss2 = this.$dismissState;
                    TweenSpec tweenSpec = new TweenSpec(0, 0, null, 6, null);
                    this.label = 1;
                    if (swipeToDismiss2.animateTo(swipeToDismiss3, tweenSpec, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SwipeRow3.SwipeRow$lambda$8(this.$didVibrate$delegate, false);
        SwipeRow3.SwipeRow$lambda$11(this.$showSpinner$delegate, false);
        SwipeRow3.SwipeRow$lambda$17(this.$isRowResetting$delegate, false);
        return Unit.INSTANCE;
    }
}
