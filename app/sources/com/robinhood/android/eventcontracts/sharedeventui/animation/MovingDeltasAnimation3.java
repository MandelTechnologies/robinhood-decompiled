package com.robinhood.android.eventcontracts.sharedeventui.animation;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.PathMeasure;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.sharedfuturesui.animations.PathMeasures;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import p479j$.time.Instant;

/* compiled from: MovingDeltasAnimation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$FadeUpText$1$1", m3645f = "MovingDeltasAnimation.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$FadeUpText$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class MovingDeltasAnimation3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $animationStarted$delegate;
    final /* synthetic */ Delta $delta;
    final /* synthetic */ SnapshotState<Offset> $offset$delegate;
    final /* synthetic */ PathMeasure $pathMeasure;
    final /* synthetic */ SnapshotFloatState2 $progress$delegate;
    final /* synthetic */ SharedFlow<Instant> $timeFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MovingDeltasAnimation3(SharedFlow<Instant> sharedFlow, Delta delta, PathMeasure pathMeasure, SnapshotState<Boolean> snapshotState, SnapshotFloatState2 snapshotFloatState2, SnapshotState<Offset> snapshotState2, Continuation<? super MovingDeltasAnimation3> continuation) {
        super(2, continuation);
        this.$timeFlow = sharedFlow;
        this.$delta = delta;
        this.$pathMeasure = pathMeasure;
        this.$animationStarted$delegate = snapshotState;
        this.$progress$delegate = snapshotFloatState2;
        this.$offset$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MovingDeltasAnimation3(this.$timeFlow, this.$delta, this.$pathMeasure, this.$animationStarted$delegate, this.$progress$delegate, this.$offset$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MovingDeltasAnimation3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: MovingDeltasAnimation.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"j$/time/Instant", "now", "", "<anonymous>", "(Lj$/time/Instant;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
    @DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$FadeUpText$1$1$1", m3645f = "MovingDeltasAnimation.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$FadeUpText$1$1$1 */
    static final class C165961 extends ContinuationImpl7 implements Function2<Instant, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<Boolean> $animationStarted$delegate;
        final /* synthetic */ Delta $delta;
        final /* synthetic */ SnapshotState<Offset> $offset$delegate;
        final /* synthetic */ PathMeasure $pathMeasure;
        final /* synthetic */ SnapshotFloatState2 $progress$delegate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C165961(Delta delta, PathMeasure pathMeasure, SnapshotState<Boolean> snapshotState, SnapshotFloatState2 snapshotFloatState2, SnapshotState<Offset> snapshotState2, Continuation<? super C165961> continuation) {
            super(2, continuation);
            this.$delta = delta;
            this.$pathMeasure = pathMeasure;
            this.$animationStarted$delegate = snapshotState;
            this.$progress$delegate = snapshotFloatState2;
            this.$offset$delegate = snapshotState2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C165961 c165961 = new C165961(this.$delta, this.$pathMeasure, this.$animationStarted$delegate, this.$progress$delegate, this.$offset$delegate, continuation);
            c165961.L$0 = obj;
            return c165961;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Instant instant, Continuation<? super Unit> continuation) {
            return ((C165961) create(instant, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Instant instant = (Instant) this.L$0;
                MovingDeltasAnimation2.FadeUpText_FU0evQE$lambda$3(this.$animationStarted$delegate, instant.compareTo(this.$delta.getTimeCalculated()) >= 0);
                this.$progress$delegate.setFloatValue(MovingDeltasAnimation2.LinearOutFastInRampUpEasing.transform(this.$delta.progress(instant)));
                SnapshotState<Offset> snapshotState = this.$offset$delegate;
                long offsetAtCurrentProgress = PathMeasures.getOffsetAtCurrentProgress(this.$pathMeasure, this.$progress$delegate.getFloatValue());
                if ((9223372034707292159L & offsetAtCurrentProgress) == 9205357640488583168L) {
                    offsetAtCurrentProgress = Offset.INSTANCE.m6553getZeroF1C5BW0();
                }
                MovingDeltasAnimation2.FadeUpText_FU0evQE$lambda$9(snapshotState, offsetAtCurrentProgress);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<Instant> sharedFlow = this.$timeFlow;
            C165961 c165961 = new C165961(this.$delta, this.$pathMeasure, this.$animationStarted$delegate, this.$progress$delegate, this.$offset$delegate, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlow, c165961, this) == coroutine_suspended) {
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
