package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVectors;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: Animatable.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ_\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000f\u001a\u00028\u00002%\u0010\u0013\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJg\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u001c\u001a\u00028\u00002\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\b\u0002\u0010\u000f\u001a\u00028\u00002'\b\u0002\u0010\u0013\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\b\u0012H\u0086@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0004\b&\u0010'R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R&\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R+\u00108\u001a\u0002042\u0006\u00105\u001a\u0002048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R+\u0010\u001c\u001a\u00028\u00002\u0006\u00105\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u00107\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR \u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010I\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\bI\u0010J\u0012\u0004\bK\u0010\u001bR\u001a\u0010L\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\bL\u0010J\u0012\u0004\bM\u0010\u001bR\u0016\u0010N\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010JR\u0016\u0010O\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010JR\u0011\u0010\u0017\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bP\u0010>R\u0011\u0010S\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010U\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bT\u0010>¨\u0006V"}, m3636d2 = {"Landroidx/compose/animation/core/Animatable;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "initialValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "visibilityThreshold", "", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;)V", "Landroidx/compose/animation/core/Animation;", "animation", "initialVelocity", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "Landroidx/compose/animation/core/AnimationResult;", "runAnimation", "(Landroidx/compose/animation/core/Animation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "clampToBounds", "(Ljava/lang/Object;)Ljava/lang/Object;", "endAnimation", "()V", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "asState", "()Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "Ljava/lang/Object;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/AnimationState;", "internalState", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core_release", "()Landroidx/compose/animation/core/AnimationState;", "", "<set-?>", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "isRunning", "()Z", "setRunning", "(Z)V", "targetValue$delegate", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/MutatorMutex;", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "Landroidx/compose/animation/core/SpringSpec;", "defaultSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core_release", "()Landroidx/compose/animation/core/SpringSpec;", "negativeInfinityBounds", "Landroidx/compose/animation/core/AnimationVector;", "getNegativeInfinityBounds$annotations", "positiveInfinityBounds", "getPositiveInfinityBounds$annotations", "lowerBoundVector", "upperBoundVector", "getValue", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "getVelocity", "velocity", "animation-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Animatable<T, V extends AnimationVectors> {
    public static final int $stable = 8;
    private final SpringSpec<T> defaultSpringSpec;
    private final AnimationState<T, V> internalState;

    /* renamed from: isRunning$delegate, reason: from kotlin metadata */
    private final SnapshotState isRunning;
    private final String label;
    private V lowerBoundVector;
    private final InternalMutatorMutex3 mutatorMutex;
    private final V negativeInfinityBounds;
    private final V positiveInfinityBounds;

    /* renamed from: targetValue$delegate, reason: from kotlin metadata */
    private final SnapshotState targetValue;
    private final TwoWayConverter<T, V> typeConverter;
    private V upperBoundVector;
    private final T visibilityThreshold;

    public Animatable(T t, TwoWayConverter<T, V> twoWayConverter, T t2, String str) {
        V v;
        V v2;
        this.typeConverter = twoWayConverter;
        this.visibilityThreshold = t2;
        this.label = str;
        this.internalState = new AnimationState<>(twoWayConverter, t, null, 0L, 0L, false, 60, null);
        this.isRunning = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.targetValue = SnapshotState3.mutableStateOf$default(t, null, 2, null);
        this.mutatorMutex = new InternalMutatorMutex3();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t2, 3, null);
        AnimationVectors velocityVector = getVelocityVector();
        if (velocityVector instanceof AnimationVectors2) {
            v = Animatable2.negativeInfinityBounds1D;
        } else {
            v = velocityVector instanceof AnimationVectors3 ? Animatable2.negativeInfinityBounds2D : velocityVector instanceof AnimationVectors4 ? Animatable2.negativeInfinityBounds3D : Animatable2.negativeInfinityBounds4D;
        }
        Intrinsics.checkNotNull(v, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = v;
        AnimationVectors velocityVector2 = getVelocityVector();
        if (velocityVector2 instanceof AnimationVectors2) {
            v2 = Animatable2.positiveInfinityBounds1D;
        } else {
            v2 = velocityVector2 instanceof AnimationVectors3 ? Animatable2.positiveInfinityBounds2D : velocityVector2 instanceof AnimationVectors4 ? Animatable2.positiveInfinityBounds3D : Animatable2.positiveInfinityBounds4D;
        }
        Intrinsics.checkNotNull(v2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = v2;
        this.lowerBoundVector = v;
        this.upperBoundVector = v2;
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "Animatable" : str);
    }

    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.internalState;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final V getVelocityVector() {
        return (V) this.internalState.getVelocityVector();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z) {
        this.isRunning.setValue(Boolean.valueOf(z));
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t) {
        this.targetValue.setValue(t);
    }

    public final T getTargetValue() {
        return this.targetValue.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, Continuation continuation, int i, Object obj3) {
        if ((i & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        T velocity = obj2;
        if ((i & 4) != 0) {
            velocity = animatable.getVelocity();
        }
        T t = velocity;
        if ((i & 8) != 0) {
            function1 = null;
        }
        return animatable.animateTo(obj, animationSpec2, t, function1, continuation);
    }

    public final Object animateTo(T t, AnimationSpec<T> animationSpec, T t2, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super AnimationResult<T, V>> continuation) {
        return runAnimation(Animation2.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t, t2), t2, function1, continuation);
    }

    /* compiled from: Animatable.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.animation.core.Animatable$runAnimation$2", m3645f = "Animatable.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.Animatable$runAnimation$2 */
    static final class C09912 extends ContinuationImpl7 implements Function1<Continuation<? super AnimationResult<T, V>>, Object> {
        final /* synthetic */ Animation<T, V> $animation;
        final /* synthetic */ Function1<Animatable<T, V>, Unit> $block;
        final /* synthetic */ T $initialVelocity;
        final /* synthetic */ long $startTime;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C09912(Animatable<T, V> animatable, T t, Animation<T, V> animation, long j, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super C09912> continuation) {
            super(1, continuation);
            this.this$0 = animatable;
            this.$initialVelocity = t;
            this.$animation = animation;
            this.$startTime = j;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C09912(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super AnimationResult<T, V>> continuation) {
            return ((C09912) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            AnimationState animationState;
            Ref.BooleanRef booleanRef;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release(this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                    this.this$0.setTargetValue(this.$animation.getTargetValue());
                    this.this$0.setRunning(true);
                    final AnimationState animationStateCopy$default = AnimationState3.copy$default((AnimationState) this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVectors) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                    final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    Animation<T, V> animation = this.$animation;
                    long j = this.$startTime;
                    final Animatable<T, V> animatable = this.this$0;
                    final Function1<Animatable<T, V>, Unit> function1 = this.$block;
                    Function1<AnimationState2<T, V>, Unit> function12 = new Function1<AnimationState2<T, V>, Unit>() { // from class: androidx.compose.animation.core.Animatable.runAnimation.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                            invoke((AnimationState2) obj2);
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(AnimationState2<T, V> animationState2) {
                            SuspendAnimation.updateState(animationState2, animatable.getInternalState$animation_core_release());
                            Object objClampToBounds = animatable.clampToBounds(animationState2.getValue());
                            if (!Intrinsics.areEqual(objClampToBounds, animationState2.getValue())) {
                                animatable.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
                                animationStateCopy$default.setValue$animation_core_release(objClampToBounds);
                                Function1<Animatable<T, V>, Unit> function13 = function1;
                                if (function13 != null) {
                                    function13.invoke(animatable);
                                }
                                animationState2.cancelAnimation();
                                booleanRef2.element = true;
                                return;
                            }
                            Function1<Animatable<T, V>, Unit> function14 = function1;
                            if (function14 != null) {
                                function14.invoke(animatable);
                            }
                        }
                    };
                    this.L$0 = animationStateCopy$default;
                    this.L$1 = booleanRef2;
                    this.label = 1;
                    if (SuspendAnimation.animate(animationStateCopy$default, animation, j, function12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    animationState = animationStateCopy$default;
                    booleanRef = booleanRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) this.L$1;
                    animationState = (AnimationState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                AnimationEndReason animationEndReason = booleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
                this.this$0.endAnimation();
                return new AnimationResult(animationState, animationEndReason);
            } catch (CancellationException e) {
                this.this$0.endAnimation();
                throw e;
            }
        }
    }

    private final Object runAnimation(Animation<T, V> animation, T t, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super AnimationResult<T, V>> continuation) {
        return InternalMutatorMutex3.mutate$default(this.mutatorMutex, null, new C09912(this, t, animation, this.internalState.getLastFrameTimeNanos(), function1, null), continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T value) {
        if (Intrinsics.areEqual(this.lowerBoundVector, this.negativeInfinityBounds) && Intrinsics.areEqual(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        V vInvoke = this.typeConverter.getConvertToVector().invoke(value);
        int size = vInvoke.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (vInvoke.get$animation_core_release(i) < this.lowerBoundVector.get$animation_core_release(i) || vInvoke.get$animation_core_release(i) > this.upperBoundVector.get$animation_core_release(i)) {
                vInvoke.set$animation_core_release(i, RangesKt.coerceIn(vInvoke.get$animation_core_release(i), this.lowerBoundVector.get$animation_core_release(i), this.upperBoundVector.get$animation_core_release(i)));
                z = true;
            }
        }
        return z ? this.typeConverter.getConvertFromVector().invoke(vInvoke) : value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    /* compiled from: Animatable.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.animation.core.Animatable$snapTo$2", m3645f = "Animatable.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.Animatable$snapTo$2 */
    static final class C09922 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09922(Animatable<T, V> animatable, T t, Continuation<? super C09922> continuation) {
            super(1, continuation);
            this.this$0 = animatable;
            this.$targetValue = t;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C09922(this.this$0, this.$targetValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C09922) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.endAnimation();
                Object objClampToBounds = this.this$0.clampToBounds(this.$targetValue);
                this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
                this.this$0.setTargetValue(objClampToBounds);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object snapTo(T t, Continuation<? super Unit> continuation) {
        Object objMutate$default = InternalMutatorMutex3.mutate$default(this.mutatorMutex, null, new C09922(this, t, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    /* compiled from: Animatable.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.animation.core.Animatable$stop$2", m3645f = "Animatable.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.Animatable$stop$2 */
    /* loaded from: classes4.dex */
    static final class C09932 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09932(Animatable<T, V> animatable, Continuation<? super C09932> continuation) {
            super(1, continuation);
            this.this$0 = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C09932(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C09932) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.endAnimation();
            return Unit.INSTANCE;
        }
    }

    public final Object stop(Continuation<? super Unit> continuation) {
        Object objMutate$default = InternalMutatorMutex3.mutate$default(this.mutatorMutex, null, new C09932(this, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    public final SnapshotState4<T> asState() {
        return this.internalState;
    }
}
