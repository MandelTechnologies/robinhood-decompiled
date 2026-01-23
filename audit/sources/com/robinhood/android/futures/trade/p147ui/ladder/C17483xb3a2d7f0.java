package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.animation.core.SuspendAnimation;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.LadderCustomGestureDetector;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AnimatedPendingOrderPillStack.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$rememberPillStackTransitionDataState$1$1", m3645f = "AnimatedPendingOrderPillStack.kt", m3646l = {587}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$rememberPillStackTransitionDataState$1$1 */
/* loaded from: classes10.dex */
final class C17483xb3a2d7f0 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LadderCustomGestureDetector $dragDirection;
    final /* synthetic */ FuturesLadderViewState.LadderData.PendingOrderRow.Group $orderGroup;
    final /* synthetic */ Integer $selectedIndex;
    final /* synthetic */ SnapshotState<StackStateTracker> $stackStateTracker$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C17483xb3a2d7f0(FuturesLadderViewState.LadderData.PendingOrderRow.Group group, Integer num, LadderCustomGestureDetector ladderCustomGestureDetector, SnapshotState<StackStateTracker> snapshotState, Continuation<? super C17483xb3a2d7f0> continuation) {
        super(2, continuation);
        this.$orderGroup = group;
        this.$selectedIndex = num;
        this.$dragDirection = ladderCustomGestureDetector;
        this.$stackStateTracker$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C17483xb3a2d7f0(this.$orderGroup, this.$selectedIndex, this.$dragDirection, this.$stackStateTracker$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C17483xb3a2d7f0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        C17483xb3a2d7f0 c17483xb3a2d7f0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SnapshotState<StackStateTracker> snapshotState = this.$stackStateTracker$delegate;
            snapshotState.setValue(AnimatedPendingOrderPillStackKt.rememberPillStackTransitionDataState$lambda$2(snapshotState).next(PillStackState.INSTANCE.from(this.$orderGroup, this.$selectedIndex, this.$dragDirection)));
            AnimationType animationType = AnimatedPendingOrderPillStackKt.rememberPillStackTransitionDataState$lambda$2(this.$stackStateTracker$delegate).getAnimationType();
            if ((animationType != null ? animationType.getTweenSpec() : null) == null) {
                SnapshotState<StackStateTracker> snapshotState2 = this.$stackStateTracker$delegate;
                snapshotState2.setValue(StackStateTracker.copy$default(AnimatedPendingOrderPillStackKt.rememberPillStackTransitionDataState$lambda$2(snapshotState2), null, null, false, 0.0f, 3, null));
                return Unit.INSTANCE;
            }
            TweenSpec<Float> tweenSpec = animationType.getTweenSpec();
            final SnapshotState<StackStateTracker> snapshotState3 = this.$stackStateTracker$delegate;
            Function2 function2 = new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.AnimatedPendingOrderPillStackKt$rememberPillStackTransitionDataState$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return C17483xb3a2d7f0.invokeSuspend$lambda$0(snapshotState3, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                }
            };
            this.label = 1;
            c17483xb3a2d7f0 = this;
            if (SuspendAnimation.animate$default(0.0f, 1.0f, 0.0f, tweenSpec, function2, c17483xb3a2d7f0, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            c17483xb3a2d7f0 = this;
        }
        SnapshotState<StackStateTracker> snapshotState4 = c17483xb3a2d7f0.$stackStateTracker$delegate;
        snapshotState4.setValue(StackStateTracker.copy$default(AnimatedPendingOrderPillStackKt.rememberPillStackTransitionDataState$lambda$2(snapshotState4), null, null, false, 0.0f, 3, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(SnapshotState snapshotState, float f, float f2) {
        snapshotState.setValue(StackStateTracker.copy$default(AnimatedPendingOrderPillStackKt.rememberPillStackTransitionDataState$lambda$2(snapshotState), null, null, true, f, 3, null));
        return Unit.INSTANCE;
    }
}
