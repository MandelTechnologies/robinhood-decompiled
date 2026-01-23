package com.robinhood.android.common.portfolio.position;

import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.models.portfolio.PositionSwipeBehavior;
import com.robinhood.android.swipetodismiss.SwipeToDismiss2;
import com.robinhood.android.swipetodismiss.SwipeToDismiss3;
import java.util.Map;
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
@DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.SwipeRowKt$SwipeRow$6$1", m3645f = "SwipeRow.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.portfolio.position.SwipeRowKt$SwipeRow$6$1, reason: use source file name */
/* loaded from: classes2.dex */
final class SwipeRow6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $didVibrate$delegate;
    final /* synthetic */ SwipeToDismiss2 $dismissState;
    final /* synthetic */ HapticFeedback $haptic;
    final /* synthetic */ Map<SwipeToDismiss3, PositionSwipeBehavior> $values;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeRow6(SwipeToDismiss2 swipeToDismiss2, Map<SwipeToDismiss3, PositionSwipeBehavior> map, HapticFeedback hapticFeedback, SnapshotState<Boolean> snapshotState, Continuation<? super SwipeRow6> continuation) {
        super(2, continuation);
        this.$dismissState = swipeToDismiss2;
        this.$values = map;
        this.$haptic = hapticFeedback;
        this.$didVibrate$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwipeRow6(this.$dismissState, this.$values, this.$haptic, this.$didVibrate$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwipeRow6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PositionSwipeBehavior positionSwipeBehavior = this.$values.get(this.$dismissState.getProgress().getTo());
        if (positionSwipeBehavior == null) {
            return Unit.INSTANCE;
        }
        if (this.$dismissState.getProgress().getFraction() <= positionSwipeBehavior.getActuationPercentage()) {
            SwipeRow3.SwipeRow$lambda$8(this.$didVibrate$delegate, false);
        } else if (!SwipeRow3.SwipeRow$lambda$7(this.$didVibrate$delegate)) {
            SwipeRow3.SwipeRow$lambda$8(this.$didVibrate$delegate, true);
            this.$haptic.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        }
        return Unit.INSTANCE;
    }
}
