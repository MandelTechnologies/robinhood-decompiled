package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: Elevation.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0005\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m3636d2 = {"DefaultIncomingSpec", "Landroidx/compose/animation/core/TweenSpec;", "Landroidx/compose/ui/unit/Dp;", "DefaultOutgoingSpec", "HoveredOutgoingSpec", "animateElevation", "", "Landroidx/compose/animation/core/Animatable;", "target", "from", "Landroidx/compose/foundation/interaction/Interaction;", "to", "animateElevation-rAjV9yQ", "(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.material.ElevationKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class Elevation2 {
    private static final TweenSpec<C2002Dp> DefaultIncomingSpec = new TweenSpec<>(120, 0, Easing3.getFastOutSlowInEasing(), 2, null);
    private static final TweenSpec<C2002Dp> DefaultOutgoingSpec = new TweenSpec<>(150, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);
    private static final TweenSpec<C2002Dp> HoveredOutgoingSpec = new TweenSpec<>(120, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m5588animateElevationrAjV9yQ(Animatable<C2002Dp, ?> animatable, float f, Interaction interaction, Interaction interaction2, Continuation<? super Unit> continuation) {
        AnimationSpec<C2002Dp> animationSpecOutgoingAnimationSpecForInteraction;
        if (interaction2 != null) {
            animationSpecOutgoingAnimationSpecForInteraction = Elevation.INSTANCE.incomingAnimationSpecForInteraction(interaction2);
        } else {
            animationSpecOutgoingAnimationSpecForInteraction = interaction != null ? Elevation.INSTANCE.outgoingAnimationSpecForInteraction(interaction) : null;
        }
        AnimationSpec<C2002Dp> animationSpec = animationSpecOutgoingAnimationSpecForInteraction;
        if (animationSpec != null) {
            Object objAnimateTo$default = Animatable.animateTo$default(animatable, C2002Dp.m7993boximpl(f), animationSpec, null, null, continuation, 12, null);
            return objAnimateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
        }
        Object objSnapTo = animatable.snapTo(C2002Dp.m7993boximpl(f), continuation);
        return objSnapTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }
}
