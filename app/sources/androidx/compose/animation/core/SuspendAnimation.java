package androidx.compose.animation.core;

import androidx.compose.p011ui.MotionDurationScale;
import androidx.compose.runtime.MonotonicFrameClock2;
import com.plaid.internal.EnumC7081g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SuspendAnimation.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ar\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u0098\u0001\u0010\r\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000426\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u0014\u001ay\u0010\u001b\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00162%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0004\u0012\u00020\u000b0\u0018¢\u0006\u0002\b\u001aH\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001ao\u0010\u001e\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\b\u0002\u0010\u0017\u001a\u00020\u00162%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0004\u0012\u00020\u000b0\u0018¢\u0006\u0002\b\u001aH\u0086@¢\u0006\u0004\b\u001e\u0010\u001f\u001au\u0010\r\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2%\b\u0002\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0004\u0012\u00020\u000b0\u0018¢\u0006\u0002\b\u001aH\u0080@¢\u0006\u0004\b\r\u0010$\u001aY\u0010(\u001a\u00028\u0000\"\u0004\b\u0000\u0010%\"\u0004\b\u0001\u0010\u000f\"\b\b\u0002\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020 2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(&\u0012\u0004\u0012\u00028\u00000\u0018H\u0082@¢\u0006\u0004\b(\u0010)\u001aC\u0010+\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015H\u0000¢\u0006\u0004\b+\u0010,\u001a\u008c\u0001\u0010/\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010&\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u00002\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0004\u0012\u00020\u000b0\u0018¢\u0006\u0002\b\u001aH\u0002¢\u0006\u0004\b/\u00100\u001a\u008c\u0001\u00102\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010&\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152#\u0010\f\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0004\u0012\u00020\u000b0\u0018¢\u0006\u0002\b\u001aH\u0002¢\u0006\u0004\b2\u00103\"\u0018\u0010-\u001a\u00020\u0000*\u0002048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00067"}, m3636d2 = {"", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "velocity", "", "block", "animate", "(FFFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "", "sequentialAnimation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/AnimationScope;", "Lkotlin/ExtensionFunctionType;", "animateTo", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "animateDecay", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Animation;", "animation", "", "startTimeNanos", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "frameTimeNanos", "onFrame", "callWithFrameNanos", "(Landroidx/compose/animation/core/Animation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "updateState", "(Landroidx/compose/animation/core/AnimationScope;Landroidx/compose/animation/core/AnimationState;)V", "durationScale", "anim", "doAnimationFrameWithScale", "(Landroidx/compose/animation/core/AnimationScope;JFLandroidx/compose/animation/core/Animation;Landroidx/compose/animation/core/AnimationState;Lkotlin/jvm/functions/Function1;)V", "playTimeNanos", "doAnimationFrame", "(Landroidx/compose/animation/core/AnimationScope;JJLandroidx/compose/animation/core/Animation;Landroidx/compose/animation/core/AnimationState;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/coroutines/CoroutineContext;", "getDurationScale", "(Lkotlin/coroutines/CoroutineContext;)F", "animation-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.animation.core.SuspendAnimationKt, reason: use source file name */
/* loaded from: classes.dex */
public final class SuspendAnimation {

    /* compiled from: SuspendAnimation.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.animation.core.SuspendAnimationKt", m3645f = "SuspendAnimation.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, 280}, m3647m = "animate")
    /* renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$4 */
    static final class C10024<T, V extends AnimationVectors> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C10024(Continuation<? super C10024> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SuspendAnimation.animate(null, null, 0L, null, this);
        }
    }

    public static /* synthetic */ Object animate$default(float f, float f2, float f3, AnimationSpec animationSpec, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f, f2, f3, animationSpec, function2, continuation);
    }

    public static final Object animate(float f, float f2, float f3, AnimationSpec<Float> animationSpec, Function2<? super Float, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object objAnimate = animate(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), boxing.boxFloat(f), boxing.boxFloat(f2), boxing.boxFloat(f3), animationSpec, function2, continuation);
        return objAnimate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate : Unit.INSTANCE;
    }

    public static final <T, V extends AnimationVectors> Object animate(final TwoWayConverter<T, V> twoWayConverter, T t, T t2, T t3, AnimationSpec<T> animationSpec, final Function2<? super T, ? super T, Unit> function2, Continuation<? super Unit> continuation) {
        V vNewInstance;
        if (t3 == null || (vNewInstance = twoWayConverter.getConvertToVector().invoke(t3)) == null) {
            vNewInstance = AnimationVectors6.newInstance(twoWayConverter.getConvertToVector().invoke(t));
        }
        AnimationVectors animationVectors = vNewInstance;
        Object objAnimate$default = animate$default(new AnimationState(twoWayConverter, t, animationVectors, 0L, 0L, false, 56, null), new Animation4(animationSpec, twoWayConverter, t, t2, animationVectors), 0L, new Function1<AnimationState2<T, V>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((AnimationState2) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(AnimationState2<T, V> animationState2) {
                function2.invoke(animationState2.getValue(), twoWayConverter.getConvertFromVector().invoke(animationState2.getVelocityVector()));
            }
        }, continuation, 2, null);
        return objAnimate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z, Function1 function1, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateTo.2
                public final void invoke(AnimationState2 animationState2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((AnimationState2) obj3);
                    return Unit.INSTANCE;
                }
            };
        }
        return animateTo(animationState, obj, animationSpec2, z2, function1, continuation);
    }

    public static final <T, V extends AnimationVectors> Object animateTo(AnimationState<T, V> animationState, T t, AnimationSpec<T> animationSpec, boolean z, Function1<? super AnimationState2<T, V>, Unit> function1, Continuation<? super Unit> continuation) {
        Object objAnimate = animate(animationState, new Animation4(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t, animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        return objAnimate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateDecay.4
                public final void invoke(AnimationState2 animationState2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationState2) obj2);
                    return Unit.INSTANCE;
                }
            };
        }
        return animateDecay(animationState, decayAnimationSpec, z, function1, continuation);
    }

    public static final <T, V extends AnimationVectors> Object animateDecay(AnimationState<T, V> animationState, DecayAnimationSpec<T> decayAnimationSpec, boolean z, Function1<? super AnimationState2<T, V>, Unit> function1, Continuation<? super Unit> continuation) {
        Object objAnimate = animate(animationState, new Animation3(decayAnimationSpec, animationState.getTypeConverter(), animationState.getValue(), animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        return objAnimate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, androidx.compose.animation.core.AnimationScope] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, V extends AnimationVectors> Object animate(final AnimationState<T, V> animationState, Animation<T, V> animation, long j, final Function1<? super AnimationState2<T, V>, Unit> function1, Continuation<? super Unit> continuation) {
        C10024 c10024;
        final Ref.ObjectRef objectRef;
        final AnimationState<T, V> animationState2;
        AnimationState<T, V> animationState3;
        final float durationScale;
        Ref.ObjectRef objectRef2;
        Function1<? super AnimationState2<T, V>, Unit> function12;
        AnimationState2 animationState22;
        AnimationState2 animationState23;
        Function1<Long, Unit> function13;
        final Animation<T, V> animation2 = animation;
        if (continuation instanceof C10024) {
            c10024 = (C10024) continuation;
            int i = c10024.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c10024.label = i - Integer.MIN_VALUE;
            } else {
                c10024 = new C10024(continuation);
            }
        }
        C10024 c100242 = c10024;
        Object obj = c100242.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c100242.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final T valueFromNanos = animation2.getValueFromNanos(0L);
            final AnimationVectors velocityVectorFromNanos = animation2.getVelocityVectorFromNanos(0L);
            objectRef = new Ref.ObjectRef();
            if (j == Long.MIN_VALUE) {
                try {
                    durationScale = getDurationScale(c100242.getContext());
                    animationState2 = animationState;
                } catch (CancellationException e) {
                    e = e;
                    animationState2 = animationState;
                }
                try {
                    Function1<Long, Unit> function14 = new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/Ref$ObjectRef<Landroidx/compose/animation/core/AnimationScope<TT;TV;>;>;TT;Landroidx/compose/animation/core/Animation<TT;TV;>;TV;Landroidx/compose/animation/core/AnimationState<TT;TV;>;FLkotlin/jvm/functions/Function1<-Landroidx/compose/animation/core/AnimationScope<TT;TV;>;Lkotlin/Unit;>;)V */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                            invoke(l.longValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.animation.core.AnimationScope] */
                        public final void invoke(long j2) {
                            Ref.ObjectRef<AnimationState2<T, V>> objectRef3 = objectRef;
                            T t = valueFromNanos;
                            TwoWayConverter typeConverter = animation2.getTypeConverter();
                            AnimationVectors animationVectors = velocityVectorFromNanos;
                            Object targetValue = animation2.getTargetValue();
                            final AnimationState<T, V> animationState4 = animationState2;
                            ?? animationState24 = new AnimationState2(t, typeConverter, animationVectors, j2, targetValue, j2, true, new Function0<Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.6.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    animationState4.setRunning$animation_core_release(false);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }
                            });
                            SuspendAnimation.doAnimationFrameWithScale(animationState24, j2, durationScale, animation2, animationState2, function1);
                            objectRef3.element = animationState24;
                        }
                    };
                    objectRef2 = objectRef;
                    try {
                        c100242.L$0 = animationState2;
                        c100242.L$1 = animation2;
                        c100242.L$2 = function1;
                        c100242.L$3 = objectRef2;
                        c100242.label = 1;
                        if (callWithFrameNanos(animation2, function14, c100242) != coroutine_suspended) {
                            animationState3 = animationState2;
                            function12 = function1;
                            objectRef = objectRef2;
                        }
                        return coroutine_suspended;
                    } catch (CancellationException e2) {
                        e = e2;
                        animationState3 = animationState2;
                        objectRef = objectRef2;
                        animationState22 = (AnimationState2) objectRef.element;
                        if (animationState22 != null) {
                            animationState22.setRunning$animation_core_release(false);
                        }
                        animationState23 = (AnimationState2) objectRef.element;
                        if (animationState23 != null && animationState23.getLastFrameTimeNanos() == animationState3.getLastFrameTimeNanos()) {
                            animationState3.setRunning$animation_core_release(false);
                        }
                        throw e;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    animationState3 = animationState2;
                    animationState22 = (AnimationState2) objectRef.element;
                    if (animationState22 != null) {
                    }
                    animationState23 = (AnimationState2) objectRef.element;
                    if (animationState23 != null) {
                        animationState3.setRunning$animation_core_release(false);
                    }
                    throw e;
                }
            }
            objectRef2 = objectRef;
            try {
                ?? r12 = (T) new AnimationState2(valueFromNanos, animation2.getTypeConverter(), velocityVectorFromNanos, j, animation2.getTargetValue(), j, true, new Function0<Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        animationState.setRunning$animation_core_release(false);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                });
                doAnimationFrameWithScale(r12, j, getDurationScale(c100242.getContext()), animation2, animationState, function1);
                objectRef2.element = r12;
                animationState3 = animationState;
                animation2 = animation;
                function12 = function1;
                objectRef = objectRef2;
            } catch (CancellationException e4) {
                e = e4;
                animationState3 = animationState;
                objectRef = objectRef2;
                animationState22 = (AnimationState2) objectRef.element;
                if (animationState22 != null) {
                }
                animationState23 = (AnimationState2) objectRef.element;
                if (animationState23 != null) {
                }
                throw e;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) c100242.L$3;
            function12 = (Function1) c100242.L$2;
            animation2 = (Animation) c100242.L$1;
            animationState3 = (AnimationState) c100242.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (CancellationException e5) {
                e = e5;
                animationState22 = (AnimationState2) objectRef.element;
                if (animationState22 != null) {
                }
                animationState23 = (AnimationState2) objectRef.element;
                if (animationState23 != null) {
                }
                throw e;
            }
        }
        do {
            T t = objectRef.element;
            Intrinsics.checkNotNull(t);
            if (((AnimationState2) t).isRunning()) {
                final float durationScale2 = getDurationScale(c100242.getContext());
                final Ref.ObjectRef objectRef3 = objectRef;
                final Function1<? super AnimationState2<T, V>, Unit> function15 = function12;
                final Animation<T, V> animation3 = animation2;
                final AnimationState<T, V> animationState4 = animationState3;
                try {
                    function13 = new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                            invoke(l.longValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(long j2) {
                            T t2 = objectRef3.element;
                            Intrinsics.checkNotNull(t2);
                            SuspendAnimation.doAnimationFrameWithScale((AnimationState2) t2, j2, durationScale2, animation3, animationState4, function15);
                        }
                    };
                    objectRef = objectRef3;
                    animation2 = animation3;
                    animationState3 = animationState4;
                    function12 = function15;
                    c100242.L$0 = animationState3;
                    c100242.L$1 = animation2;
                    c100242.L$2 = function12;
                    c100242.L$3 = objectRef;
                    c100242.label = 2;
                } catch (CancellationException e6) {
                    e = e6;
                    objectRef = objectRef3;
                    animationState3 = animationState4;
                    animationState22 = (AnimationState2) objectRef.element;
                    if (animationState22 != null) {
                    }
                    animationState23 = (AnimationState2) objectRef.element;
                    if (animationState23 != null) {
                    }
                    throw e;
                }
            } else {
                return Unit.INSTANCE;
            }
        } while (callWithFrameNanos(animation2, function13, c100242) != coroutine_suspended);
        return coroutine_suspended;
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.5
                public final void invoke(AnimationState2 animationState2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationState2) obj2);
                    return Unit.INSTANCE;
                }
            };
        }
        return animate(animationState, animation, j2, function1, continuation);
    }

    private static final <R, T, V extends AnimationVectors> Object callWithFrameNanos(Animation<T, V> animation, final Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        if (animation.getIsInfinite()) {
            return InfiniteAnimationPolicy2.withInfiniteAnimationFrameNanos(function1, continuation);
        }
        return MonotonicFrameClock2.withFrameNanos(new Function1<Long, R>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.callWithFrameNanos.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final R invoke(long j) {
                return function1.invoke(Long.valueOf(j));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Long l) {
                return invoke(l.longValue());
            }
        }, continuation);
    }

    public static final float getDurationScale(CoroutineContext coroutineContext) {
        MotionDurationScale motionDurationScale = (MotionDurationScale) coroutineContext.get(MotionDurationScale.INSTANCE);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (!(scaleFactor >= 0.0f)) {
            Preconditions2.throwIllegalStateException("negative scale factor");
        }
        return scaleFactor;
    }

    public static final <T, V extends AnimationVectors> void updateState(AnimationState2<T, V> animationState2, AnimationState<T, V> animationState) {
        animationState.setValue$animation_core_release(animationState2.getValue());
        AnimationVectors6.copyFrom(animationState.getVelocityVector(), animationState2.getVelocityVector());
        animationState.setFinishedTimeNanos$animation_core_release(animationState2.getFinishedTimeNanos());
        animationState.setLastFrameTimeNanos$animation_core_release(animationState2.getLastFrameTimeNanos());
        animationState.setRunning$animation_core_release(animationState2.isRunning());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVectors> void doAnimationFrameWithScale(AnimationState2<T, V> animationState2, long j, float f, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationState2<T, V>, Unit> function1) {
        long startTimeNanos;
        if (f == 0.0f) {
            startTimeNanos = animation.getDurationNanos();
        } else {
            startTimeNanos = (long) ((j - animationState2.getStartTimeNanos()) / f);
        }
        doAnimationFrame(animationState2, j, startTimeNanos, animation, animationState, function1);
    }

    private static final <T, V extends AnimationVectors> void doAnimationFrame(AnimationState2<T, V> animationState2, long j, long j2, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationState2<T, V>, Unit> function1) {
        animationState2.setLastFrameTimeNanos$animation_core_release(j);
        animationState2.setValue$animation_core_release(animation.getValueFromNanos(j2));
        animationState2.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(j2));
        if (animation.isFinishedFromNanos(j2)) {
            animationState2.setFinishedTimeNanos$animation_core_release(animationState2.getLastFrameTimeNanos());
            animationState2.setRunning$animation_core_release(false);
        }
        updateState(animationState2, animationState);
        function1.invoke(animationState2);
    }
}
