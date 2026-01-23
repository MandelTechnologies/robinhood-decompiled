package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState3;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.foundation.gestures.ScrollableState4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0002\u0010\u0006JU\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000eH\u0096@¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Landroidx/compose/foundation/gestures/snapping/TargetApproachAnimation;", "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/animation/core/AnimationSpec;)V", "approachAnimation", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "scope", "Landroidx/compose/foundation/gestures/ScrollScope;", "offset", "velocity", "onAnimationStep", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "delta", "", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.gestures.snapping.TargetApproachAnimation, reason: use source file name */
/* loaded from: classes4.dex */
final class SnapFlingBehavior8 implements SnapFlingBehavior3<Float, AnimationVectors2> {
    private final AnimationSpec<Float> animationSpec;

    public SnapFlingBehavior8(AnimationSpec<Float> animationSpec) {
        this.animationSpec = animationSpec;
    }

    @Override // androidx.compose.foundation.gestures.snapping.SnapFlingBehavior3
    public /* bridge */ /* synthetic */ Object approachAnimation(ScrollableState4 scrollableState4, Float f, Float f2, Function1<? super Float, Unit> function1, Continuation continuation) {
        return approachAnimation(scrollableState4, f.floatValue(), f2.floatValue(), function1, (Continuation<? super SnapFlingBehavior2<Float, AnimationVectors2>>) continuation);
    }

    public Object approachAnimation(ScrollableState4 scrollableState4, float f, float f2, Function1<? super Float, Unit> function1, Continuation<? super SnapFlingBehavior2<Float, AnimationVectors2>> continuation) {
        Object objAnimateWithTarget = SnapFlingBehavior7.animateWithTarget(scrollableState4, Math.abs(f) * Math.signum(f2), f, AnimationState3.AnimationState$default(0.0f, f2, 0L, 0L, false, 28, null), this.animationSpec, function1, continuation);
        return objAnimateWithTarget == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateWithTarget : (SnapFlingBehavior2) objAnimateWithTarget;
    }
}
