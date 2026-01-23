package androidx.constraintlayout.compose;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.unit.Velocity;
import androidx.compose.runtime.MonotonicFrameClock2;
import androidx.compose.runtime.SnapshotFloatState2;
import com.robinhood.android.navigation.compose.NavTransition2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* compiled from: TransitionHandler.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\fJ\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m3636d2 = {"Landroidx/constraintlayout/compose/TransitionHandler;", "", "motionMeasurer", "Landroidx/constraintlayout/compose/MotionMeasurer;", "motionProgress", "Landroidx/compose/runtime/MutableFloatState;", "(Landroidx/constraintlayout/compose/MotionMeasurer;Landroidx/compose/runtime/MutableFloatState;)V", NavTransition2.KEY_TRANSITION, "Landroidx/constraintlayout/core/state/Transition;", "getTransition", "()Landroidx/constraintlayout/core/state/Transition;", "onAcceptFirstDownForOnSwipe", "", "offset", "Landroidx/compose/ui/geometry/Offset;", "onAcceptFirstDownForOnSwipe-k-4lQ0M", "(J)Z", "onTouchUp", "", "velocity", "Landroidx/compose/ui/unit/Velocity;", "onTouchUp-sF-c-tU", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pendingProgressWhileTouchUp", "updateProgressOnDrag", "dragAmount", "updateProgressOnDrag-k-4lQ0M", "(J)V", "updateProgressWhileTouchUp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class TransitionHandler {
    private final MotionMeasurer motionMeasurer;
    private final SnapshotFloatState2 motionProgress;

    /* compiled from: TransitionHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.constraintlayout.compose.TransitionHandler", m3645f = "TransitionHandler.kt", m3646l = {74}, m3647m = "updateProgressWhileTouchUp")
    /* renamed from: androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1 */
    static final class C20541 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C20541(Continuation<? super C20541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransitionHandler.this.updateProgressWhileTouchUp(this);
        }
    }

    public TransitionHandler(MotionMeasurer motionMeasurer, SnapshotFloatState2 snapshotFloatState2) {
        this.motionMeasurer = motionMeasurer;
        this.motionProgress = snapshotFloatState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.constraintlayout.core.state.Transition getTransition() {
        return this.motionMeasurer.getTransition();
    }

    /* renamed from: onAcceptFirstDownForOnSwipe-k-4lQ0M, reason: not valid java name */
    public final boolean m8182onAcceptFirstDownForOnSwipek4lQ0M(long offset) {
        return getTransition().isFirstDownAccepted(Offset.m6543getXimpl(offset), Offset.m6544getYimpl(offset));
    }

    /* renamed from: updateProgressOnDrag-k-4lQ0M, reason: not valid java name */
    public final void m8184updateProgressOnDragk4lQ0M(long dragAmount) {
        this.motionProgress.setFloatValue(RangesKt.coerceIn(this.motionProgress.getFloatValue() + getTransition().dragToProgress(this.motionProgress.getFloatValue(), this.motionMeasurer.getLayoutCurrentWidth(), this.motionMeasurer.getLayoutCurrentHeight(), Offset.m6543getXimpl(dragAmount), Offset.m6544getYimpl(dragAmount)), 0.0f, 1.0f));
    }

    /* renamed from: onTouchUp-sF-c-tU, reason: not valid java name */
    public final Object m8183onTouchUpsFctU(final long j, Continuation<? super Unit> continuation) {
        Object objWithFrameNanos = MonotonicFrameClock2.withFrameNanos(new Function1<Long, Unit>() { // from class: androidx.constraintlayout.compose.TransitionHandler$onTouchUp$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j2) {
                this.this$0.getTransition().setTouchUp(this.this$0.motionProgress.getFloatValue(), j2, Velocity.m8101getXimpl(j), Velocity.m8102getYimpl(j));
            }
        }, continuation);
        return objWithFrameNanos == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithFrameNanos : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateProgressWhileTouchUp(Continuation<? super Unit> continuation) {
        C20541 c20541;
        TransitionHandler transitionHandler;
        if (continuation instanceof C20541) {
            c20541 = (C20541) continuation;
            int i = c20541.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c20541.label = i - Integer.MIN_VALUE;
            } else {
                c20541 = new C20541(continuation);
            }
        }
        Object objWithFrameNanos = c20541.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c20541.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithFrameNanos);
            Function1<Long, Float> function1 = new Function1<Long, Float>() { // from class: androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$newProgress$1
                {
                    super(1);
                }

                public final Float invoke(long j) {
                    return Float.valueOf(this.this$0.getTransition().getTouchUpProgress(j));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Float invoke(Long l) {
                    return invoke(l.longValue());
                }
            };
            c20541.L$0 = this;
            c20541.label = 1;
            objWithFrameNanos = MonotonicFrameClock2.withFrameNanos(function1, c20541);
            if (objWithFrameNanos == coroutine_suspended) {
                return coroutine_suspended;
            }
            transitionHandler = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transitionHandler = (TransitionHandler) c20541.L$0;
            ResultKt.throwOnFailure(objWithFrameNanos);
        }
        transitionHandler.motionProgress.setFloatValue(((Number) objWithFrameNanos).floatValue());
        return Unit.INSTANCE;
    }

    public final boolean pendingProgressWhileTouchUp() {
        return getTransition().isTouchNotDone(this.motionProgress.getFloatValue());
    }
}
