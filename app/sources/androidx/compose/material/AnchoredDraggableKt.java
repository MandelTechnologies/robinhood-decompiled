package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimation;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AnchoredDraggable.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001aY\u0010\u0015\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a2\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0017\u001a\u00028\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0081@¢\u0006\u0004\b\u001a\u0010\u001b\u001aH\u0010\"\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 \u0012\u0006\u0012\u0004\u0018\u00010\u00000\u001fH\u0082@¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0001H\u0002¢\u0006\u0004\b%\u0010&\u001ay\u0010/\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\r2H\u0010.\u001aD\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110+¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00028\u00000-0\u001fH\u0001¢\u0006\u0004\b/\u00100¨\u00061"}, m3636d2 = {"", "T", "Lkotlin/Function1;", "Landroidx/compose/material/DraggableAnchorsConfig;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Landroidx/compose/material/DraggableAnchors;", "DraggableAnchors", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/material/DraggableAnchors;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/material/AnchoredDraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "anchoredDraggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Z)Landroidx/compose/ui/Modifier;", "targetValue", "", "velocity", "animateTo", "(Landroidx/compose/material/AnchoredDraggableState;Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "I", "Lkotlin/Function0;", "inputs", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "restartable", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material/MapDraggableAnchors;", "emptyDraggableAnchors", "()Landroidx/compose/material/MapDraggableAnchors;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "size", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Pair;", "anchors", "draggableAnchors", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "material_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableKt {

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.material.AnchoredDraggableKt", m3645f = "AnchoredDraggable.kt", m3646l = {720}, m3647m = "restartable")
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$1 */
    /* loaded from: classes4.dex */
    static final class C14561<I> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C14561(Continuation<? super C14561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.restartable(null, null, this);
        }
    }

    public static final <T> DraggableAnchors<T> DraggableAnchors(Function1<? super DraggableAnchorsConfig<T>, Unit> function1) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        function1.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.getAnchors$material_release());
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, boolean z2, InteractionSource3 interactionSource3, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            interactionSource3 = null;
        }
        InteractionSource3 interactionSource32 = interactionSource3;
        if ((i & 32) != 0) {
            z3 = anchoredDraggableState.isAnimationRunning();
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z4, z5, interactionSource32, z3);
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, boolean z2, InteractionSource3 interactionSource3, boolean z3) {
        return DraggableKt.draggable$default(modifier, anchoredDraggableState.getDraggableState(), orientation, z, interactionSource3, z3, null, new C14541(anchoredDraggableState, null), z2, 32, null);
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", m3645f = "AnchoredDraggable.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1 */
    /* loaded from: classes4.dex */
    static final class C14541 extends ContinuationImpl7 implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnchoredDraggableState<T> $state;
        /* synthetic */ float F$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14541(AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super C14541> continuation) {
            super(3, continuation);
            this.$state = anchoredDraggableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f, Continuation<? super Unit> continuation) {
            return invoke(coroutineScope, f.floatValue(), continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, float f, Continuation<? super Unit> continuation) {
            C14541 c14541 = new C14541(this.$state, continuation);
            c14541.L$0 = coroutineScope;
            c14541.F$0 = f;
            return c14541.invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", m3645f = "AnchoredDraggable.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
        /* renamed from: androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ AnchoredDraggableState<T> $state;
            final /* synthetic */ float $velocity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState, float f, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$state = anchoredDraggableState;
                this.$velocity = f;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$state, this.$velocity, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AnchoredDraggableState<T> anchoredDraggableState = this.$state;
                    float f = this.$velocity;
                    this.label = 1;
                    if (anchoredDraggableState.settle(f, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(this.$state, this.F$0, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = anchoredDraggableState.getLastVelocity();
        }
        return animateTo(anchoredDraggableState, obj, f, continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Landroidx/compose/material/AnchoredDragScope;", "anchors", "Landroidx/compose/material/DraggableAnchors;", "latestTarget"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", m3645f = "AnchoredDraggable.kt", m3646l = {693}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$animateTo$2 */
    /* loaded from: classes4.dex */
    static final class C14552<T> extends ContinuationImpl7 implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14552(AnchoredDraggableState<T> anchoredDraggableState, float f, Continuation<? super C14552> continuation) {
            super(4, continuation);
            this.$this_animateTo = anchoredDraggableState;
            this.$velocity = f;
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, Continuation<? super Unit> continuation) {
            C14552 c14552 = new C14552(this.$this_animateTo, this.$velocity, continuation);
            c14552.L$0 = anchoredDragScope;
            c14552.L$1 = draggableAnchors;
            c14552.L$2 = t;
            return c14552.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Object obj2, Continuation<? super Unit> continuation) {
            return invoke(anchoredDragScope, (DraggableAnchors<DraggableAnchors<T>>) obj, (DraggableAnchors<T>) obj2, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
                if (!Float.isNaN(fPositionOf)) {
                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                    float offset = Float.isNaN(this.$this_animateTo.getOffset()) ? 0.0f : this.$this_animateTo.getOffset();
                    floatRef.element = offset;
                    float f = this.$velocity;
                    AnimationSpec<Float> animationSpec = this.$this_animateTo.getAnimationSpec();
                    Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.material.AnchoredDraggableKt.animateTo.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f3) {
                            invoke(f2.floatValue(), f3.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(float f2, float f3) {
                            anchoredDragScope.dragTo(f2, f3);
                            floatRef.element = f2;
                        }
                    };
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (SuspendAnimation.animate(offset, fPositionOf, f, animationSpec, function2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, T t, float f, Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new C14552(anchoredDraggableState, f, null), continuation, 2, null);
        return objAnchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <I> Object restartable(Function0<? extends I> function0, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        C14561 c14561;
        if (continuation instanceof C14561) {
            c14561 = (C14561) continuation;
            int i = c14561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14561.label = i - Integer.MIN_VALUE;
            } else {
                c14561 = new C14561(continuation);
            }
        }
        Object obj = c14561.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14561.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                C14572 c14572 = new C14572(function0, function2, null);
                c14561.label = 1;
                if (CoroutineScope2.coroutineScope(c14572, c14561) == coroutine_suspended) {
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
    @DebugMetadata(m3644c = "androidx.compose.material.AnchoredDraggableKt$restartable$2", m3645f = "AnchoredDraggable.kt", m3646l = {722}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2 */
    /* loaded from: classes4.dex */
    static final class C14572 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Function0<I> $inputs;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14572(Function0<? extends I> function0, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C14572> continuation) {
            super(2, continuation);
            this.$inputs = function0;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C14572 c14572 = new C14572(this.$inputs, this.$block, continuation);
            c14572.L$0 = obj;
            return c14572;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14572) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
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
            @DebugMetadata(m3644c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2", m3645f = "AnchoredDraggable.kt", m3646l = {729}, m3647m = "invokeSuspend")
            /* renamed from: androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
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
    public static final <T> MapDraggableAnchors<T> emptyDraggableAnchors() {
        return new MapDraggableAnchors<>(MapsKt.emptyMap());
    }

    public static final <T> Modifier draggableAnchors(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, Function2<? super IntSize, ? super Constraints, ? extends Tuples2<? extends DraggableAnchors<T>, ? extends T>> function2) {
        return modifier.then(new DraggableAnchorsElement(anchoredDraggableState, function2, orientation));
    }
}
