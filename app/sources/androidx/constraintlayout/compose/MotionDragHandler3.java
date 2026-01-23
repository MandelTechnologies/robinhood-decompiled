package androidx.constraintlayout.compose;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.util.VelocityTracker;
import androidx.compose.p011ui.input.pointer.util.VelocityTracker4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Channel;

/* compiled from: MotionDragHandler.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1", m3645f = "MotionDragHandler.kt", m3646l = {110}, m3647m = "invokeSuspend")
/* renamed from: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1, reason: use source file name */
/* loaded from: classes4.dex */
final class MotionDragHandler3 extends ContinuationImpl7 implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Channel<MotionDragState> $dragChannel;
    final /* synthetic */ TransitionHandler $swipeHandler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MotionDragHandler3(TransitionHandler transitionHandler, Channel<MotionDragState> channel, Continuation<? super MotionDragHandler3> continuation) {
        super(2, continuation);
        this.$swipeHandler = transitionHandler;
        this.$dragChannel = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MotionDragHandler3 motionDragHandler3 = new MotionDragHandler3(this.$swipeHandler, this.$dragChannel, continuation);
        motionDragHandler3.L$0 = obj;
        return motionDragHandler3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((MotionDragHandler3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final VelocityTracker velocityTracker = new VelocityTracker();
            final TransitionHandler transitionHandler = this.$swipeHandler;
            Function1<Offset, Boolean> function1 = new Function1<Offset, Boolean>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Offset offset) {
                    return m8168invokek4lQ0M(offset.getPackedValue());
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final Boolean m8168invokek4lQ0M(long j) {
                    return Boolean.valueOf(transitionHandler.m8182onAcceptFirstDownForOnSwipek4lQ0M(j));
                }
            };
            Function1<Offset, Unit> function12 = new Function1<Offset, Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m8169invokek4lQ0M(offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m8169invokek4lQ0M(long j) {
                    velocityTracker.resetTracking();
                }
            };
            final Channel<MotionDragState> channel = this.$dragChannel;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    channel.mo8337trySendJP2dKIU(MotionDragState.INSTANCE.m8174onDragEndTH1AsA0(velocityTracker.m7217calculateVelocity9UxMQ8M()));
                }
            };
            final Channel<MotionDragState> channel2 = this.$dragChannel;
            Function0<Unit> function02 = new Function0<Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    channel2.mo8337trySendJP2dKIU(MotionDragState.INSTANCE.m8174onDragEndTH1AsA0(velocityTracker.m7217calculateVelocity9UxMQ8M()));
                }
            };
            final Channel<MotionDragState> channel3 = this.$dragChannel;
            Function2<PointerInputChange, Offset, Unit> function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                    m8170invokeUv8p0NA(pointerInputChange, offset.getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m8170invokeUv8p0NA(PointerInputChange pointerInputChange, long j) {
                    VelocityTracker4.addPointerInputChange(velocityTracker, pointerInputChange);
                    channel3.mo8337trySendJP2dKIU(MotionDragState.INSTANCE.m8173onDragk4lQ0M(j));
                }
            };
            this.label = 1;
            if (MotionDragHandler.detectDragGesturesWhenNeeded(pointerInputScope, function1, function12, function0, function02, function2, this) == coroutine_suspended) {
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
