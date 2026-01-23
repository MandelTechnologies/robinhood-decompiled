package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationState2;
import androidx.compose.animation.core.AnimationState3;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec3;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimation;
import androidx.compose.foundation.Overscroll;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior7;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AnchoredDraggable.kt */
@Metadata(m3635d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ac\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a[\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0011\u001a<\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\b\b\u0000\u0010\u0000*\u00020\u00122\u001d\u0010\u0017\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u0019\u0010\u001a\u001aT\u0010#\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010 \u001a\u00028\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0!H\u0082@¢\u0006\u0004\b#\u0010$\u001aP\u0010(\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010%\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0!2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0&H\u0086@¢\u0006\u0004\b(\u0010)\u001a`\u00101\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u001b0\u00132\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001b0/H\u0002¢\u0006\u0004\b1\u00102\u001a\u001b\u00104\u001a\u00020\u001b*\u00020\u001b2\u0006\u00103\u001a\u00020\u001bH\u0002¢\u0006\u0004\b4\u00105\u001aH\u0010;\u001a\u00020\u0015\"\u0004\b\u0000\u001062\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000/2\"\u0010:\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001509\u0012\u0006\u0012\u0004\u0018\u00010\u001208H\u0082@¢\u0006\u0004\b;\u0010<\u001a\u001b\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\b>\u0010?\u001a\\\u0010C\u001a\u00020B\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010A\u001a\u00020@2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u001b0\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0!H\u0000¢\u0006\u0004\bC\u0010D\u001aT\u0010F\u001a\u00020E\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u001b0\u00132\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001b0/H\u0002¢\u0006\u0004\bF\u0010G\" \u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J\" \u0010L\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u001b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010J\"\u001a\u0010N\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006T"}, m3636d2 = {"T", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "state", "", "reverseDirection", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "anchoredDraggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/AnchoredDraggableState;ZLandroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;)Landroidx/compose/ui/Modifier;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DraggableAnchorsConfig;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "DraggableAnchors", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/DraggableAnchors;", "", "velocity", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchoredDragScope", "anchors", "latestTarget", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "animateTo", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;FLandroidx/compose/foundation/gestures/AnchoredDragScope;Landroidx/compose/foundation/gestures/DraggableAnchors;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "animateToWithDecay", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;FLandroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentOffset", "Lkotlin/ParameterName;", "name", "totalDistance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "computeTarget", "(Landroidx/compose/foundation/gestures/DraggableAnchors;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "target", "coerceToTarget", "(FF)F", "I", "inputs", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "restartable", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DefaultDraggableAnchors;", "emptyDraggableAnchors", "()Landroidx/compose/foundation/gestures/DefaultDraggableAnchors;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "anchoredDraggableFlingBehavior", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "AnchoredDraggableLayoutInfoProvider", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "AlwaysDrag", "Lkotlin/jvm/functions/Function1;", "", "GetOrNan", "Landroidx/compose/ui/unit/Dp;", "AnchoredDraggableMinFlingVelocity", "F", "getAnchoredDraggableMinFlingVelocity", "()F", "NoOpDecayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AnchoredDraggableKt {
    private static final Function1<PointerInputChange, Boolean> AlwaysDrag = new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AlwaysDrag$1
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.TRUE;
        }
    };
    private static final Function1<Integer, Float> GetOrNan = new Function1<Integer, Float>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$GetOrNan$1
        public final Float invoke(int i) {
            return Float.valueOf(Float.NaN);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Integer num) {
            return invoke(num.intValue());
        }
    };
    private static final float AnchoredDraggableMinFlingVelocity = C2002Dp.m7995constructorimpl(125);
    private static final DecayAnimationSpec<Float> NoOpDecayAnimationSpec = DecayAnimationSpec3.generateDecayAnimationSpec(new FloatDecayAnimationSpec() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$NoOpDecayAnimationSpec$1
        private final float absVelocityThreshold;

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public long getDurationNanos(float initialValue, float initialVelocity) {
            return 0L;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getTargetValue(float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getValueFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getVelocityFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getAbsVelocityThreshold() {
            return this.absVelocityThreshold;
        }
    });

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", m3645f = "AnchoredDraggable.kt", m3646l = {1380}, m3647m = "animateToWithDecay")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 */
    static final class C10731<T> extends ContinuationImpl {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10731(Continuation<? super C10731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.animateToWithDecay(null, null, 0.0f, null, null, this);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", m3645f = "AnchoredDraggable.kt", m3646l = {1543}, m3647m = "restartable")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 */
    static final class C10751<I> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C10751(Continuation<? super C10751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.restartable(null, null, this);
        }
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, boolean z, Orientation orientation, boolean z2, InteractionSource3 interactionSource3, Overscroll overscroll, FlingBehavior flingBehavior, int i, Object obj) {
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        AnchoredDraggableState anchoredDraggableState2;
        boolean z3;
        Orientation orientation2;
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        InteractionSource3 interactionSource32 = (i & 16) != 0 ? null : interactionSource3;
        Overscroll overscroll2 = (i & 32) != 0 ? null : overscroll;
        if ((i & 64) != 0) {
            flingBehavior2 = null;
            anchoredDraggableState2 = anchoredDraggableState;
            z3 = z;
            orientation2 = orientation;
            modifier2 = modifier;
        } else {
            flingBehavior2 = flingBehavior;
            modifier2 = modifier;
            anchoredDraggableState2 = anchoredDraggableState;
            z3 = z;
            orientation2 = orientation;
        }
        return anchoredDraggable(modifier2, anchoredDraggableState2, z3, orientation2, z4, interactionSource32, overscroll2, flingBehavior2);
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, boolean z, Orientation orientation, boolean z2, InteractionSource3 interactionSource3, Overscroll overscroll, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z2, Boolean.valueOf(z), interactionSource3, null, overscroll, flingBehavior, 32, null));
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, InteractionSource3 interactionSource3, Overscroll overscroll, FlingBehavior flingBehavior, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z, (i & 8) != 0 ? null : interactionSource3, (i & 16) != 0 ? null : overscroll, (i & 32) != 0 ? null : flingBehavior);
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, InteractionSource3 interactionSource3, Overscroll overscroll, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z, null, interactionSource3, null, overscroll, flingBehavior, 32, null));
    }

    public static final <T> DraggableAnchors<T> DraggableAnchors(Function1<? super DraggableAnchorsConfig<T>, Unit> function1) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        function1.invoke(draggableAnchorsConfig);
        return new DefaultDraggableAnchors(draggableAnchorsConfig.buildKeys$foundation_release(), draggableAnchorsConfig.buildPositions$foundation_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, float f, final AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object objAnimate;
        float fPositionOf = draggableAnchors.positionOf(t);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = Float.isNaN(anchoredDraggableState.getOffset()) ? 0.0f : anchoredDraggableState.getOffset();
        if (!Float.isNaN(fPositionOf)) {
            float f2 = floatRef.element;
            if (f2 != fPositionOf && (objAnimate = SuspendAnimation.animate(f2, fPositionOf, f, animationSpec, new Function2<Float, Float, Unit>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Float f3, Float f4) {
                    invoke(f3.floatValue(), f4.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f3, float f4) {
                    anchoredDragScope.dragTo(f3, f4);
                    floatRef.element = f3;
                }
            }, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objAnimate;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object animateToWithDecay(AnchoredDraggableState<T> anchoredDraggableState, T t, float f, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Continuation<? super Float> continuation) {
        C10731 c10731;
        float f2;
        Ref.FloatRef floatRef;
        if (continuation instanceof C10731) {
            c10731 = (C10731) continuation;
            int i = c10731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c10731.label = i - Integer.MIN_VALUE;
            } else {
                c10731 = new C10731(continuation);
            }
        }
        C10731 c107312 = c10731;
        Object obj = c107312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c107312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            floatRef2.element = f;
            C10742 c10742 = new C10742(anchoredDraggableState, f, animationSpec, floatRef2, decayAnimationSpec, null);
            c107312.L$0 = floatRef2;
            c107312.F$0 = f;
            c107312.label = 1;
            if (AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, c10742, c107312, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            f2 = f;
            floatRef = floatRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f2 = c107312.F$0;
            floatRef = (Ref.FloatRef) c107312.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return boxing.boxFloat(f2 - floatRef.element);
    }

    public static /* synthetic */ Object animateToWithDecay$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Continuation continuation, int i, Object obj2) {
        DecayAnimationSpec<Float> decayAnimationSpec2;
        if ((i & 4) != 0) {
            if (anchoredDraggableState.getUsePreModifierChangeBehavior$foundation_release()) {
                animationSpec = anchoredDraggableState.getSnapAnimationSpec();
            } else {
                animationSpec = AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
            }
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i & 8) != 0) {
            if (anchoredDraggableState.getUsePreModifierChangeBehavior$foundation_release()) {
                decayAnimationSpec2 = anchoredDraggableState.getDecayAnimationSpec();
            } else {
                decayAnimationSpec2 = AnchoredDraggableDefaults.INSTANCE.getDecayAnimationSpec();
            }
            decayAnimationSpec = decayAnimationSpec2;
        }
        return animateToWithDecay(anchoredDraggableState, obj, f, animationSpec2, decayAnimationSpec, continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestTarget"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", m3645f = "AnchoredDraggable.kt", m3646l = {1391, 1409, 1433}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 */
    static final class C10742<T> extends ContinuationImpl7 implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ DecayAnimationSpec<Float> $decayAnimationSpec;
        final /* synthetic */ Ref.FloatRef $remainingVelocity;
        final /* synthetic */ AnimationSpec<Float> $snapAnimationSpec;
        final /* synthetic */ AnchoredDraggableState<T> $this_animateToWithDecay;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10742(AnchoredDraggableState<T> anchoredDraggableState, float f, AnimationSpec<Float> animationSpec, Ref.FloatRef floatRef, DecayAnimationSpec<Float> decayAnimationSpec, Continuation<? super C10742> continuation) {
            super(4, continuation);
            this.$this_animateToWithDecay = anchoredDraggableState;
            this.$velocity = f;
            this.$snapAnimationSpec = animationSpec;
            this.$remainingVelocity = floatRef;
            this.$decayAnimationSpec = decayAnimationSpec;
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, Continuation<? super Unit> continuation) {
            C10742 c10742 = new C10742(this.$this_animateToWithDecay, this.$velocity, this.$snapAnimationSpec, this.$remainingVelocity, this.$decayAnimationSpec, continuation);
            c10742.L$0 = anchoredDragScope;
            c10742.L$1 = draggableAnchors;
            c10742.L$2 = t;
            return c10742.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Object obj2, Continuation<? super Unit> continuation) {
            return invoke(anchoredDragScope, (DraggableAnchors<DraggableAnchors<T>>) obj, (DraggableAnchors<T>) obj2, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
        
            if (androidx.compose.animation.core.SuspendAnimation.animateDecay$default(r1, r1, false, r3, r24, 2, null) != r7) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
        
            if (androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo(r0, r16, r2, r4, r5, r5, r24) != r7) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
        
            if (androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo(r0, r12, r0, r4, r5, r5, r24) == r7) goto L44;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            float f;
            AnchoredDragScope anchoredDragScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final AnchoredDragScope anchoredDragScope2 = (AnchoredDragScope) this.L$0;
                DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$1;
                Object obj2 = this.L$2;
                final float fPositionOf = draggableAnchors.positionOf(obj2);
                if (!Float.isNaN(fPositionOf)) {
                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                    float offset = Float.isNaN(this.$this_animateToWithDecay.getOffset()) ? 0.0f : this.$this_animateToWithDecay.getOffset();
                    floatRef.element = offset;
                    if (offset != fPositionOf) {
                        float f2 = this.$velocity;
                        if ((fPositionOf - offset) * f2 < 0.0f || f2 == 0.0f) {
                            AnchoredDraggableState<T> anchoredDraggableState = this.$this_animateToWithDecay;
                            AnimationSpec<Float> animationSpec = this.$snapAnimationSpec;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 1;
                        } else {
                            float fCalculateTargetValue = DecayAnimationSpec3.calculateTargetValue(this.$decayAnimationSpec, offset, f2);
                            float f3 = this.$velocity;
                            if (f3 > 0.0f) {
                                if (fCalculateTargetValue < fPositionOf) {
                                    anchoredDragScope = anchoredDragScope2;
                                    f = f3;
                                    AnchoredDraggableState<T> anchoredDraggableState2 = this.$this_animateToWithDecay;
                                    AnimationSpec<Float> animationSpec2 = this.$snapAnimationSpec;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.label = 3;
                                }
                                AnimationState animationStateAnimationState$default = AnimationState3.AnimationState$default(floatRef.element, f3, 0L, 0L, false, 28, null);
                                DecayAnimationSpec<Float> decayAnimationSpec = this.$decayAnimationSpec;
                                final Ref.FloatRef floatRef2 = this.$remainingVelocity;
                                Function1<AnimationState2<Float, AnimationVectors2>, Unit> function1 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.animateToWithDecay.2.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                        float fFloatValue = animationState2.getValue().floatValue();
                                        float f4 = fPositionOf;
                                        if (fFloatValue >= f4 || floatRef.element <= f4) {
                                            float fFloatValue2 = animationState2.getValue().floatValue();
                                            float f5 = fPositionOf;
                                            if (fFloatValue2 <= f5 || floatRef.element >= f5) {
                                                anchoredDragScope2.dragTo(animationState2.getValue().floatValue(), animationState2.getVelocity().floatValue());
                                                floatRef2.element = animationState2.getVelocity().floatValue();
                                                floatRef.element = animationState2.getValue().floatValue();
                                                return;
                                            }
                                        }
                                        float fCoerceToTarget = AnchoredDraggableKt.coerceToTarget(animationState2.getValue().floatValue(), fPositionOf);
                                        anchoredDragScope2.dragTo(fCoerceToTarget, animationState2.getVelocity().floatValue());
                                        floatRef2.element = Float.isNaN(animationState2.getVelocity().floatValue()) ? 0.0f : animationState2.getVelocity().floatValue();
                                        floatRef.element = fCoerceToTarget;
                                        animationState2.cancelAnimation();
                                    }
                                };
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 2;
                            } else {
                                if (fCalculateTargetValue > fPositionOf) {
                                    f = f3;
                                    anchoredDragScope = anchoredDragScope2;
                                    AnchoredDraggableState<T> anchoredDraggableState22 = this.$this_animateToWithDecay;
                                    AnimationSpec<Float> animationSpec22 = this.$snapAnimationSpec;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.label = 3;
                                }
                                AnimationState animationStateAnimationState$default2 = AnimationState3.AnimationState$default(floatRef.element, f3, 0L, 0L, false, 28, null);
                                DecayAnimationSpec<Float> decayAnimationSpec2 = this.$decayAnimationSpec;
                                final Ref.FloatRef floatRef22 = this.$remainingVelocity;
                                Function1<AnimationState2<Float, AnimationVectors2>, Unit> function12 = new Function1<AnimationState2<Float, AnimationVectors2>, Unit>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.animateToWithDecay.2.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                        float fFloatValue = animationState2.getValue().floatValue();
                                        float f4 = fPositionOf;
                                        if (fFloatValue >= f4 || floatRef.element <= f4) {
                                            float fFloatValue2 = animationState2.getValue().floatValue();
                                            float f5 = fPositionOf;
                                            if (fFloatValue2 <= f5 || floatRef.element >= f5) {
                                                anchoredDragScope2.dragTo(animationState2.getValue().floatValue(), animationState2.getVelocity().floatValue());
                                                floatRef22.element = animationState2.getVelocity().floatValue();
                                                floatRef.element = animationState2.getValue().floatValue();
                                                return;
                                            }
                                        }
                                        float fCoerceToTarget = AnchoredDraggableKt.coerceToTarget(animationState2.getValue().floatValue(), fPositionOf);
                                        anchoredDragScope2.dragTo(fCoerceToTarget, animationState2.getVelocity().floatValue());
                                        floatRef22.element = Float.isNaN(animationState2.getVelocity().floatValue()) ? 0.0f : animationState2.getVelocity().floatValue();
                                        floatRef.element = fCoerceToTarget;
                                        animationState2.cancelAnimation();
                                    }
                                };
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 2;
                            }
                        }
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                this.$remainingVelocity.element = 0.0f;
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$remainingVelocity.element = 0.0f;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> T computeTarget(DraggableAnchors<T> draggableAnchors, float f, float f2, Function1<? super Float, Float> function1, Function0<Float> function0) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("The offset provided to computeTarget must not be NaN.");
        }
        boolean z = Math.abs(f2) > 0.0f;
        boolean z2 = z && f2 > 0.0f;
        if (!z) {
            T tClosestAnchor = draggableAnchors.closestAnchor(f);
            Intrinsics.checkNotNull(tClosestAnchor);
            return tClosestAnchor;
        }
        if (Math.abs(f2) >= Math.abs(function0.invoke().floatValue())) {
            T tClosestAnchor2 = draggableAnchors.closestAnchor(f, z2);
            Intrinsics.checkNotNull(tClosestAnchor2);
            return tClosestAnchor2;
        }
        T tClosestAnchor3 = draggableAnchors.closestAnchor(f, false);
        Intrinsics.checkNotNull(tClosestAnchor3);
        float fPositionOf = draggableAnchors.positionOf(tClosestAnchor3);
        T tClosestAnchor4 = draggableAnchors.closestAnchor(f, true);
        Intrinsics.checkNotNull(tClosestAnchor4);
        float fPositionOf2 = draggableAnchors.positionOf(tClosestAnchor4);
        float fAbs = Math.abs(function1.invoke(Float.valueOf(Math.abs(fPositionOf - fPositionOf2))).floatValue());
        if (!z2) {
            fPositionOf = fPositionOf2;
        }
        boolean z3 = Math.abs(fPositionOf - f) >= fAbs;
        if (z3) {
            return z2 ? tClosestAnchor4 : tClosestAnchor3;
        }
        if (z3) {
            throw new NoWhenBranchMatchedException();
        }
        if (z2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? RangesKt.coerceAtMost(f, f2) : RangesKt.coerceAtLeast(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <I> Object restartable(Function0<? extends I> function0, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        C10751 c10751;
        if (continuation instanceof C10751) {
            c10751 = (C10751) continuation;
            int i = c10751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c10751.label = i - Integer.MIN_VALUE;
            } else {
                c10751 = new C10751(continuation);
            }
        }
        Object obj = c10751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c10751.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                C10762 c10762 = new C10762(function0, function2, null);
                c10751.label = 1;
                if (CoroutineScope2.coroutineScope(c10762, c10751) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "I", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", m3645f = "AnchoredDraggable.kt", m3646l = {1545}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 */
    static final class C10762 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Function0<I> $inputs;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C10762(Function0<? extends I> function0, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C10762> continuation) {
            super(2, continuation);
            this.$inputs = function0;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10762 c10762 = new C10762(this.$inputs, this.$block, continuation);
            c10762.L$0 = obj;
            return c10762;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10762) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(this.$inputs);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, coroutineScope, this.$block);
                this.label = 1;
                if (flowSnapshotFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"<anonymous>", "", "I", "latestInputs", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
            final /* synthetic */ Ref.ObjectRef<Job> $previousDrag;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Ref.ObjectRef<Job> objectRef, CoroutineScope coroutineScope, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2) {
                this.$previousDrag = objectRef;
                this.$$this$coroutineScope = coroutineScope;
                this.$block = function2;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(I i, Continuation<? super Unit> continuation) {
                AnchoredDraggableKt$restartable$2$1$emit$1 anchoredDraggableKt$restartable$2$1$emit$1;
                AnonymousClass1<T> anonymousClass1;
                Object obj;
                if (continuation instanceof AnchoredDraggableKt$restartable$2$1$emit$1) {
                    anchoredDraggableKt$restartable$2$1$emit$1 = (AnchoredDraggableKt$restartable$2$1$emit$1) continuation;
                    int i2 = anchoredDraggableKt$restartable$2$1$emit$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        anchoredDraggableKt$restartable$2$1$emit$1.label = i2 - Integer.MIN_VALUE;
                    } else {
                        anchoredDraggableKt$restartable$2$1$emit$1 = new AnchoredDraggableKt$restartable$2$1$emit$1(this, continuation);
                    }
                }
                Object obj2 = anchoredDraggableKt$restartable$2$1$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = anchoredDraggableKt$restartable$2$1$emit$1.label;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    Job job = this.$previousDrag.element;
                    if (job != null) {
                        job.cancel((CancellationException) new AnchoredDragFinishedSignal());
                        anchoredDraggableKt$restartable$2$1$emit$1.L$0 = this;
                        anchoredDraggableKt$restartable$2$1$emit$1.L$1 = i;
                        anchoredDraggableKt$restartable$2$1$emit$1.L$2 = job;
                        anchoredDraggableKt$restartable$2$1$emit$1.label = 1;
                        if (job.join(anchoredDraggableKt$restartable$2$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    anonymousClass1 = this;
                    obj = i;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = anchoredDraggableKt$restartable$2$1$emit$1.L$1;
                    anonymousClass1 = (AnonymousClass1) anchoredDraggableKt$restartable$2$1$emit$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    obj = obj3;
                }
                Ref.ObjectRef<Job> objectRef = anonymousClass1.$previousDrag;
                CoroutineScope coroutineScope = anonymousClass1.$$this$coroutineScope;
                objectRef.element = (T) BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(anonymousClass1.$block, obj, coroutineScope, null), 1, null);
                return Unit.INSTANCE;
            }

            /* compiled from: AnchoredDraggable.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "I", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", m3645f = "AnchoredDraggable.kt", m3646l = {1552}, m3647m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
                final /* synthetic */ I $latestInputs;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, I i, CoroutineScope coroutineScope, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$block = function2;
                    this.$latestInputs = i;
                    this.$$this$coroutineScope = coroutineScope;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function2<I, Continuation<? super Unit>, Object> function2 = this.$block;
                        I i2 = this.$latestInputs;
                        this.label = 1;
                        if (function2.invoke(i2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    CoroutineScope2.cancel(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> DefaultDraggableAnchors<T> emptyDraggableAnchors() {
        return new DefaultDraggableAnchors<>(CollectionsKt.emptyList(), new float[0]);
    }

    public static final <T> TargetedFlingBehavior anchoredDraggableFlingBehavior(AnchoredDraggableState<T> anchoredDraggableState, final Density density, Function1<? super Float, Float> function1, AnimationSpec<Float> animationSpec) {
        return SnapFlingBehavior7.snapFlingBehavior(AnchoredDraggableLayoutInfoProvider(anchoredDraggableState, function1, new Function0<Float>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.anchoredDraggableFlingBehavior.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                return Float.valueOf(density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(125)));
            }
        }), NoOpDecayAnimationSpec, animationSpec);
    }

    private static final <T> SnapLayoutInfoProvider AnchoredDraggableLayoutInfoProvider(final AnchoredDraggableState<T> anchoredDraggableState, final Function1<? super Float, Float> function1, final Function0<Float> function0) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.AnchoredDraggableLayoutInfoProvider.1
            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float velocity, float decayOffset) {
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float velocity) {
                float fRequireOffset = anchoredDraggableState.requireOffset();
                return anchoredDraggableState.getAnchors().positionOf(AnchoredDraggableKt.computeTarget(anchoredDraggableState.getAnchors(), fRequireOffset, velocity, function1, function0)) - fRequireOffset;
            }
        };
    }
}
