package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel3;
import kotlinx.coroutines.channels.Channel5;

/* compiled from: LateMotionLayout.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$2$1", m3645f = "LateMotionLayout.kt", m3646l = {87, 100}, m3647m = "invokeSuspend")
/* renamed from: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$2$1, reason: use source file name */
/* loaded from: classes4.dex */
final class LateMotionLayout3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVectors2> $animatableProgress;
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Channel<ConstraintSet> $channel;
    final /* synthetic */ Ref<CompositionSource> $compositionSource;
    final /* synthetic */ SnapshotIntState2 $direction;
    final /* synthetic */ SnapshotState<ConstraintSet> $end;
    final /* synthetic */ Function0<Unit> $finishedAnimationListener;
    final /* synthetic */ SnapshotState<ConstraintSet> $start;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LateMotionLayout3(Channel<ConstraintSet> channel, SnapshotIntState2 snapshotIntState2, SnapshotState<ConstraintSet> snapshotState, SnapshotState<ConstraintSet> snapshotState2, Ref<CompositionSource> ref, Animatable<Float, AnimationVectors2> animatable, AnimationSpec<Float> animationSpec, Function0<Unit> function0, Continuation<? super LateMotionLayout3> continuation) {
        super(2, continuation);
        this.$channel = channel;
        this.$direction = snapshotIntState2;
        this.$start = snapshotState;
        this.$end = snapshotState2;
        this.$compositionSource = ref;
        this.$animatableProgress = animatable;
        this.$animationSpec = animationSpec;
        this.$finishedAnimationListener = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LateMotionLayout3(this.$channel, this.$direction, this.$start, this.$end, this.$compositionSource, this.$animatableProgress, this.$animationSpec, this.$finishedAnimationListener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LateMotionLayout3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, null, null, r10, 12, null) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b1 -> B:7:0x0016). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00cb -> B:12:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Channel3<ConstraintSet> it;
        Channel3<ConstraintSet> channel3;
        Object objHasNext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            it = this.$channel.iterator();
            this.L$0 = it;
            this.label = 1;
            objHasNext = it.hasNext(this);
            if (objHasNext == coroutine_suspended) {
            }
        } else if (i == 1) {
            channel3 = (Channel3) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (!((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel3 = (Channel3) this.L$0;
            ResultKt.throwOnFailure(obj);
            LateMotionLayout3 lateMotionLayout3 = this;
            it = channel3;
            SnapshotIntState2 snapshotIntState2 = lateMotionLayout3.$direction;
            snapshotIntState2.setIntValue(snapshotIntState2.getIntValue() == 1 ? 0 : 1);
            Function0<Unit> function0 = lateMotionLayout3.$finishedAnimationListener;
            if (function0 != null) {
                function0.invoke();
            }
            this.L$0 = it;
            this.label = 1;
            objHasNext = it.hasNext(this);
            if (objHasNext == coroutine_suspended) {
                return coroutine_suspended;
            }
            channel3 = it;
            obj = objHasNext;
            if (!((Boolean) obj).booleanValue()) {
                ConstraintSet next = channel3.next();
                ConstraintSet constraintSet = (ConstraintSet) Channel5.m28806getOrNullimpl(this.$channel.mo28799tryReceivePtdJZtk());
                if (constraintSet != null) {
                    next = constraintSet;
                }
                if (Intrinsics.areEqual(next, (this.$direction.getIntValue() == 1 ? this.$start : this.$end).getValue())) {
                    it = channel3;
                    this.L$0 = it;
                    this.label = 1;
                    objHasNext = it.hasNext(this);
                    if (objHasNext == coroutine_suspended) {
                    }
                } else {
                    if (this.$direction.getIntValue() == 1) {
                        this.$end.setValue(next);
                    } else {
                        this.$start.setValue(next);
                    }
                    this.$compositionSource.setValue(CompositionSource.Content);
                    Animatable<Float, AnimationVectors2> animatable = this.$animatableProgress;
                    Float fBoxFloat = boxing.boxFloat(this.$direction.getIntValue());
                    AnimationSpec<Float> animationSpec = this.$animationSpec;
                    this.L$0 = channel3;
                    this.label = 2;
                    lateMotionLayout3 = this;
                }
            } else {
                return Unit.INSTANCE;
            }
        }
    }
}
