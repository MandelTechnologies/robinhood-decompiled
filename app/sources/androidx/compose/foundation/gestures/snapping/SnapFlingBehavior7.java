package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationState2;
import androidx.compose.animation.core.AnimationState3;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimation;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.gestures.ScrollableState4;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProvider;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001ag\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0018*\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000f2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012H\u0082@¢\u0006\u0004\b\u0019\u0010\u001a\u001am\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0018*\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00032\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u001c2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012H\u0082@¢\u0006\u0004\b\u001e\u0010\u001f\u001au\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0018*\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0012H\u0082@¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010%\u001a\u00020\u0003*\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0002¢\u0006\u0004\b%\u0010&\u001a*\u0010-\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010,\"\u001a\u0010/\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, m3636d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "snapLayoutInfoProvider", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "snapFlingBehavior", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "rememberSnapFlingBehavior", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialTargetOffset", "initialVelocity", "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "Landroidx/compose/animation/core/AnimationVector1D;", "animation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "delta", "", "onAnimationStep", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "approach", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/foundation/gestures/snapping/ApproachAnimation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetOffset", "Landroidx/compose/animation/core/AnimationState;", "animationState", "animateDecay", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelOffset", "animationSpec", "animateWithTarget", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "target", "coerceToTarget", "(FF)F", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "snappingOffset", "lowerBound", "upperBound", "calculateFinalOffset-Fhqu1e0", "(IFF)F", "calculateFinalOffset", "Landroidx/compose/ui/unit/Dp;", "MinFlingVelocityDp", "F", "getMinFlingVelocityDp", "()F", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class SnapFlingBehavior7 {
    private static final float MinFlingVelocityDp = C2002Dp.m7995constructorimpl(400);

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m3645f = "SnapFlingBehavior.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE}, m3647m = "animateDecay")
    /* renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 */
    static final class C11641 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C11641(Continuation<? super C11641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior7.animateDecay(null, 0.0f, null, null, null, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m3645f = "SnapFlingBehavior.kt", m3646l = {354}, m3647m = "animateWithTarget")
    /* renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 */
    static final class C11661 extends ContinuationImpl {
        float F$0;
        float F$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C11661(Continuation<? super C11661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior7.animateWithTarget(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    private static final boolean calculateFinalOffset_Fhqu1e0$isValidDistance(float f) {
        return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
    }

    public static final TargetedFlingBehavior snapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec) {
        return new SnapFlingBehavior(snapLayoutInfoProvider, decayAnimationSpec, animationSpec);
    }

    public static final TargetedFlingBehavior rememberSnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1921733134, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:231)");
        }
        Object obj = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        DecayAnimationSpec decayAnimationSpecRememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        boolean zChanged = composer.changed(decayAnimationSpecRememberSplineBasedDecay) | ((((i & 14) ^ 6) > 4 && composer.changed(snapLayoutInfoProvider)) || (i & 6) == 4) | composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = snapFlingBehavior(snapLayoutInfoProvider, decayAnimationSpecRememberSplineBasedDecay, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
            composer.updateRememberedValue(objRememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object approach(ScrollableState4 scrollableState4, float f, float f2, SnapFlingBehavior3<Float, AnimationVectors2> snapFlingBehavior3, Function1<? super Float, Unit> function1, Continuation<? super SnapFlingBehavior2<Float, AnimationVectors2>> continuation) {
        return snapFlingBehavior3.approachAnimation(scrollableState4, boxing.boxFloat(f), boxing.boxFloat(f2), function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateDecay(final ScrollableState4 scrollableState4, final float f, AnimationState<Float, AnimationVectors2> animationState, DecayAnimationSpec<Float> decayAnimationSpec, final Function1<? super Float, Unit> function1, Continuation<? super SnapFlingBehavior2<Float, AnimationVectors2>> continuation) {
        C11641 c11641;
        Ref.FloatRef floatRef;
        if (continuation instanceof C11641) {
            c11641 = (C11641) continuation;
            int i = c11641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11641.label = i - Integer.MIN_VALUE;
            } else {
                c11641 = new C11641(continuation);
            }
        }
        Object obj = c11641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11641.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            boolean z = animationState.getVelocity().floatValue() == 0.0f;
            Function1<AnimationState2<Float, AnimationVectors2>, Unit> function12 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationState2<Float, AnimationVectors2> animationState2) {
                    invoke2(animationState2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationState2<Float, AnimationVectors2> animationState2) {
                    if (Math.abs(animationState2.getValue().floatValue()) >= Math.abs(f)) {
                        float fCoerceToTarget = SnapFlingBehavior7.coerceToTarget(animationState2.getValue().floatValue(), f);
                        SnapFlingBehavior7.animateDecay$consumeDelta(animationState2, scrollableState4, function1, fCoerceToTarget - floatRef2.element);
                        animationState2.cancelAnimation();
                        floatRef2.element = fCoerceToTarget;
                        return;
                    }
                    SnapFlingBehavior7.animateDecay$consumeDelta(animationState2, scrollableState4, function1, animationState2.getValue().floatValue() - floatRef2.element);
                    floatRef2.element = animationState2.getValue().floatValue();
                }
            };
            c11641.L$0 = animationState;
            c11641.L$1 = floatRef2;
            c11641.F$0 = f;
            c11641.label = 1;
            if (SuspendAnimation.animateDecay(animationState, decayAnimationSpec, !z, function12, c11641) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = c11641.F$0;
            floatRef = (Ref.FloatRef) c11641.L$1;
            animationState = (AnimationState) c11641.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return new SnapFlingBehavior2(boxing.boxFloat(f - floatRef.element), animationState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDecay$consumeDelta(AnimationState2<Float, AnimationVectors2> animationState2, ScrollableState4 scrollableState4, Function1<? super Float, Unit> function1, float f) {
        float fScrollBy;
        if (ComposeFoundationFlags.NewNestedFlingPropagationEnabled) {
            try {
                fScrollBy = scrollableState4.scrollBy(f);
            } catch (CancellationException unused) {
                animationState2.cancelAnimation();
                fScrollBy = 0.0f;
            }
        } else {
            fScrollBy = scrollableState4.scrollBy(f);
        }
        function1.invoke(Float.valueOf(fScrollBy));
        if (Math.abs(f - fScrollBy) > 0.5f) {
            animationState2.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateWithTarget(final ScrollableState4 scrollableState4, float f, final float f2, AnimationState<Float, AnimationVectors2> animationState, AnimationSpec<Float> animationSpec, final Function1<? super Float, Unit> function1, Continuation<? super SnapFlingBehavior2<Float, AnimationVectors2>> continuation) {
        C11661 c11661;
        float f3;
        AnimationState<Float, AnimationVectors2> animationState2;
        Ref.FloatRef floatRef;
        float f4;
        if (continuation instanceof C11661) {
            c11661 = (C11661) continuation;
            int i = c11661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11661.label = i - Integer.MIN_VALUE;
            } else {
                c11661 = new C11661(continuation);
            }
        }
        C11661 c116612 = c11661;
        Object obj = c116612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c116612.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            float fFloatValue = animationState.getVelocity().floatValue();
            Float fBoxFloat = boxing.boxFloat(f);
            boolean z = animationState.getVelocity().floatValue() == 0.0f;
            Function1<AnimationState2<Float, AnimationVectors2>, Unit> function12 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateWithTarget.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationState2<Float, AnimationVectors2> animationState22) {
                    invoke2(animationState22);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationState2<Float, AnimationVectors2> animationState22) {
                    float fScrollBy;
                    float fCoerceToTarget = SnapFlingBehavior7.coerceToTarget(animationState22.getValue().floatValue(), f2);
                    float f5 = fCoerceToTarget - floatRef2.element;
                    if (ComposeFoundationFlags.NewNestedFlingPropagationEnabled) {
                        try {
                            fScrollBy = scrollableState4.scrollBy(f5);
                        } catch (CancellationException unused) {
                            animationState22.cancelAnimation();
                            fScrollBy = 0.0f;
                        }
                    } else {
                        fScrollBy = scrollableState4.scrollBy(f5);
                    }
                    function1.invoke(Float.valueOf(fScrollBy));
                    if (Math.abs(f5 - fScrollBy) > 0.5f || fCoerceToTarget != animationState22.getValue().floatValue()) {
                        animationState22.cancelAnimation();
                    }
                    floatRef2.element += fScrollBy;
                }
            };
            c116612.L$0 = animationState;
            c116612.L$1 = floatRef2;
            f3 = f;
            c116612.F$0 = f3;
            c116612.F$1 = fFloatValue;
            c116612.label = 1;
            if (SuspendAnimation.animateTo(animationState, fBoxFloat, animationSpec, !z, function12, c116612) == coroutine_suspended) {
                return coroutine_suspended;
            }
            animationState2 = animationState;
            floatRef = floatRef2;
            f4 = fFloatValue;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f4 = c116612.F$1;
            float f5 = c116612.F$0;
            floatRef = (Ref.FloatRef) c116612.L$1;
            AnimationState<Float, AnimationVectors2> animationState3 = (AnimationState) c116612.L$0;
            ResultKt.throwOnFailure(obj);
            f3 = f5;
            animationState2 = animationState3;
        }
        return new SnapFlingBehavior2(boxing.boxFloat(f3 - floatRef.element), AnimationState3.copy$default((AnimationState) animationState2, 0.0f, coerceToTarget(animationState2.getVelocity().floatValue(), f4), 0L, 0L, false, 29, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? RangesKt.coerceAtMost(f, f2) : RangesKt.coerceAtLeast(f, f2);
    }

    public static final float getMinFlingVelocityDp() {
        return MinFlingVelocityDp;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: calculateFinalOffset-Fhqu1e0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float m5061calculateFinalOffsetFhqu1e0(int i, float f, float f2) {
        LazyListSnapLayoutInfoProvider.Companion companion = LazyListSnapLayoutInfoProvider.INSTANCE;
        if (LazyListSnapLayoutInfoProvider.m5057equalsimpl0(i, companion.m5058getClosestItembbeMdSM())) {
            if (Math.abs(f2) <= Math.abs(f)) {
                f = f2;
            }
        } else if (!LazyListSnapLayoutInfoProvider.m5057equalsimpl0(i, companion.m5059getNextItembbeMdSM())) {
            if (!LazyListSnapLayoutInfoProvider.m5057equalsimpl0(i, companion.m5060getPreviousItembbeMdSM())) {
                f = 0.0f;
            }
        }
        if (calculateFinalOffset_Fhqu1e0$isValidDistance(f)) {
            return f;
        }
        return 0.0f;
    }
}
