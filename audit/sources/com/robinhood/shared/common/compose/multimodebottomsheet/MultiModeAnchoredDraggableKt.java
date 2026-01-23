package com.robinhood.shared.common.compose.multimodebottomsheet;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimation;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.common.compose.multimodebottomsheet.AnchoredDragScope;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: MultiModeAnchoredDraggable.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u001d\u0010\u0004\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007\u001aR\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0007\u001a&\u0010\u0015\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0006\u0010\u0016\u001a\u0002H\u0002H\u0087@¢\u0006\u0002\u0010\u0017\u001a0\u0010\u0018\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0006\u0010\u0016\u001a\u0002H\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0087@¢\u0006\u0002\u0010\u001b\u001a\u008c\u0001\u0010\u001c\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2l\u0010\u001d\u001ah\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00020\u0001¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b($\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070%\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e¢\u0006\u0002\b\bH\u0087@¢\u0006\u0002\u0010&\u001aF\u0010'\u001a\u00020\u0007\"\u0004\b\u0000\u0010(2\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H(0*2\"\u0010\u001d\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070%\u0012\u0006\u0012\u0004\u0018\u00010\u00030+H\u0082@¢\u0006\u0002\u0010,\u001a\u0014\u0010-\u001a\b\u0012\u0004\u0012\u0002H\u00020.\"\u0004\b\u0000\u0010\u0002H\u0002¨\u0006/"}, m3636d2 = {"DraggableAnchors", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;", "T", "", "builder", "Lkotlin/Function1;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/DraggableAnchorsConfig;", "", "Lkotlin/ExtensionFunctionType;", "anchoredDraggable", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeAnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "", "reverseDirection", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startDragImmediately", "snapTo", "targetValue", "(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeAnchoredDraggableState;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "velocity", "", "(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeAnchoredDraggableState;Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forceDrag", "block", "Lkotlin/Function5;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/AnchoredDragScope;", "Lkotlin/ParameterName;", "name", "anchors", "lastVelocity", "offset", "Lkotlin/coroutines/Continuation;", "(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeAnchoredDraggableState;Lkotlin/jvm/functions/Function5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "restartable", "I", "inputs", "Lkotlin/Function0;", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emptyDraggableAnchors", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MapDraggableAnchors;", "lib-compose-multi-mode-bottom-sheet_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class MultiModeAnchoredDraggableKt {

    /* compiled from: MultiModeAnchoredDraggable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {737}, m3647m = "restartable")
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$restartable$1 */
    static final class C374111<I> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C374111(Continuation<? super C374111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiModeAnchoredDraggableKt.restartable(null, null, this);
        }
    }

    public static final <T> MultiModeDraggableAnchors<T> DraggableAnchors(Function1<? super DraggableAnchorsConfig<T>, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        builder.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.getAnchors$lib_compose_multi_mode_bottom_sheet_externalDebug());
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, MultiModeAnchoredDraggableState multiModeAnchoredDraggableState, Orientation orientation, boolean z, boolean z2, InteractionSource3 interactionSource3, boolean z3, int i, Object obj) {
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
            z3 = multiModeAnchoredDraggableState.isAnimationRunning();
        }
        return anchoredDraggable(modifier, multiModeAnchoredDraggableState, orientation, z4, z5, interactionSource32, z3);
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, MultiModeAnchoredDraggableState<T> state, Orientation orientation, boolean z, boolean z2, InteractionSource3 interactionSource3, boolean z3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return DraggableKt.draggable$default(modifier, state.getDraggableState(), orientation, z, interactionSource3, z3, null, new C374081(state, null), z2, 32, null);
    }

    /* compiled from: MultiModeAnchoredDraggable.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$anchoredDraggable$1", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$anchoredDraggable$1 */
    static final class C374081 extends ContinuationImpl7 implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
        final /* synthetic */ MultiModeAnchoredDraggableState<T> $state;
        /* synthetic */ float F$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374081(MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState, Continuation<? super C374081> continuation) {
            super(3, continuation);
            this.$state = multiModeAnchoredDraggableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f, Continuation<? super Unit> continuation) {
            return invoke(coroutineScope, f.floatValue(), continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, float f, Continuation<? super Unit> continuation) {
            C374081 c374081 = new C374081(this.$state, continuation);
            c374081.L$0 = coroutineScope;
            c374081.F$0 = f;
            return c374081.invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MultiModeAnchoredDraggable.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$anchoredDraggable$1$1", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$anchoredDraggable$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ MultiModeAnchoredDraggableState<T> $state;
            final /* synthetic */ float $velocity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState, float f, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$state = multiModeAnchoredDraggableState;
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
                    MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState = this.$state;
                    float f = this.$velocity;
                    this.label = 1;
                    if (multiModeAnchoredDraggableState.settle(f, this) == coroutine_suspended) {
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

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: MultiModeAnchoredDraggable.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/AnchoredDragScope;", "anchors", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;", "latestTarget"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$snapTo$2", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$snapTo$2 */
    static final class C374132<T> extends ContinuationImpl7 implements Function4<AnchoredDragScope, MultiModeDraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        C374132(Continuation<? super C374132> continuation) {
            super(4, continuation);
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, MultiModeDraggableAnchors<T> multiModeDraggableAnchors, T t, Continuation<? super Unit> continuation) {
            C374132 c374132 = new C374132(continuation);
            c374132.L$0 = anchoredDragScope;
            c374132.L$1 = multiModeDraggableAnchors;
            c374132.L$2 = t;
            return c374132.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Object obj2, Continuation<? super Unit> continuation) {
            return invoke(anchoredDragScope, (MultiModeDraggableAnchors<MultiModeDraggableAnchors<T>>) obj, (MultiModeDraggableAnchors<T>) obj2, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float fPositionOf = ((MultiModeDraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.DefaultImpls.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final <T> Object snapTo(MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState, T t, Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = MultiModeAnchoredDraggableState.anchoredDrag$default(multiModeAnchoredDraggableState, t, null, new C374132(null), continuation, 2, null);
        return objAnchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$default(MultiModeAnchoredDraggableState multiModeAnchoredDraggableState, Object obj, float f, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = multiModeAnchoredDraggableState.getLastVelocity();
        }
        return animateTo(multiModeAnchoredDraggableState, obj, f, continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: MultiModeAnchoredDraggable.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/AnchoredDragScope;", "anchors", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;", "latestTarget"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$animateTo$2", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {703}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$animateTo$2 */
    static final class C374092<T> extends ContinuationImpl7 implements Function4<AnchoredDragScope, MultiModeDraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ MultiModeAnchoredDraggableState<T> $this_animateTo;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374092(MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState, float f, Continuation<? super C374092> continuation) {
            super(4, continuation);
            this.$this_animateTo = multiModeAnchoredDraggableState;
            this.$velocity = f;
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, MultiModeDraggableAnchors<T> multiModeDraggableAnchors, T t, Continuation<? super Unit> continuation) {
            C374092 c374092 = new C374092(this.$this_animateTo, this.$velocity, continuation);
            c374092.L$0 = anchoredDragScope;
            c374092.L$1 = multiModeDraggableAnchors;
            c374092.L$2 = t;
            return c374092.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Object obj2, Continuation<? super Unit> continuation) {
            return invoke(anchoredDragScope, (MultiModeDraggableAnchors<MultiModeDraggableAnchors<T>>) obj, (MultiModeDraggableAnchors<T>) obj2, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                float fPositionOf = ((MultiModeDraggableAnchors) this.L$1).positionOf(this.L$2);
                if (!Float.isNaN(fPositionOf)) {
                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                    float offset = Float.isNaN(this.$this_animateTo.getOffset()) ? 0.0f : this.$this_animateTo.getOffset();
                    floatRef.element = offset;
                    float f = this.$velocity;
                    AnimationSpec<Float> animationSpec = this.$this_animateTo.getAnimationSpec();
                    Function2 function2 = new Function2() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$animateTo$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return MultiModeAnchoredDraggableKt.C374092.invokeSuspend$lambda$0(anchoredDragScope, floatRef, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(AnchoredDragScope anchoredDragScope, Ref.FloatRef floatRef, float f, float f2) {
            anchoredDragScope.dragTo(f, f2);
            floatRef.element = f;
            return Unit.INSTANCE;
        }
    }

    public static final <T> Object animateTo(MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState, T t, float f, Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = MultiModeAnchoredDraggableState.anchoredDrag$default(multiModeAnchoredDraggableState, t, null, new C374092(multiModeAnchoredDraggableState, f, null), continuation, 2, null);
        return objAnchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: MultiModeAnchoredDraggable.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/AnchoredDragScope;", "anchors", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$forceDrag$2", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {724}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$forceDrag$2 */
    static final class C374102<T> extends ContinuationImpl7 implements Function3<AnchoredDragScope, MultiModeDraggableAnchors<T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function5<AnchoredDragScope, MultiModeDraggableAnchors<T>, Float, Float, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ MultiModeAnchoredDraggableState<T> $this_forceDrag;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C374102(Function5<? super AnchoredDragScope, ? super MultiModeDraggableAnchors<T>, ? super Float, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function5, MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState, Continuation<? super C374102> continuation) {
            super(3, continuation);
            this.$block = function5;
            this.$this_forceDrag = multiModeAnchoredDraggableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(AnchoredDragScope anchoredDragScope, MultiModeDraggableAnchors<T> multiModeDraggableAnchors, Continuation<? super Unit> continuation) {
            C374102 c374102 = new C374102(this.$block, this.$this_forceDrag, continuation);
            c374102.L$0 = anchoredDragScope;
            c374102.L$1 = multiModeDraggableAnchors;
            return c374102.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                MultiModeDraggableAnchors<T> multiModeDraggableAnchors = (MultiModeDraggableAnchors) this.L$1;
                Function5<AnchoredDragScope, MultiModeDraggableAnchors<T>, Float, Float, Continuation<? super Unit>, Object> function5 = this.$block;
                Float fBoxFloat = boxing.boxFloat(this.$this_forceDrag.getLastVelocity());
                Float fBoxFloat2 = boxing.boxFloat(this.$this_forceDrag.getOffset());
                this.L$0 = null;
                this.label = 1;
                if (function5.invoke(anchoredDragScope, multiModeDraggableAnchors, fBoxFloat, fBoxFloat2, this) == coroutine_suspended) {
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

    public static final <T> Object forceDrag(MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState, Function5<? super AnchoredDragScope, ? super MultiModeDraggableAnchors<T>, ? super Float, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function5, Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = MultiModeAnchoredDraggableState.anchoredDrag$default(multiModeAnchoredDraggableState, null, new C374102(function5, multiModeAnchoredDraggableState, null), continuation, 1, null);
        return objAnchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <I> Object restartable(Function0<? extends I> function0, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        C374111 c374111;
        if (continuation instanceof C374111) {
            c374111 = (C374111) continuation;
            int i = c374111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c374111.label = i - Integer.MIN_VALUE;
            } else {
                c374111 = new C374111(continuation);
            }
        }
        Object obj = c374111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c374111.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                C374122 c374122 = new C374122(function0, function2, null);
                c374111.label = 1;
                if (CoroutineScope2.coroutineScope(c374122, c374111) == coroutine_suspended) {
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

    /* compiled from: MultiModeAnchoredDraggable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$restartable$2", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {740}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$restartable$2 */
    static final class C374122 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Function0<I> $inputs;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C374122(Function0<? extends I> function0, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C374122> continuation) {
            super(2, continuation);
            this.$inputs = function0;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C374122 c374122 = new C374122(this.$inputs, this.$block, continuation);
            c374122.L$0 = obj;
            return c374122;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C374122) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

        /* compiled from: MultiModeAnchoredDraggable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$restartable$2$1, reason: invalid class name */
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
                MultiModeAnchoredDraggableKt$restartable$2$1$emit$1 multiModeAnchoredDraggableKt$restartable$2$1$emit$1;
                Object obj;
                if (continuation instanceof MultiModeAnchoredDraggableKt$restartable$2$1$emit$1) {
                    multiModeAnchoredDraggableKt$restartable$2$1$emit$1 = (MultiModeAnchoredDraggableKt$restartable$2$1$emit$1) continuation;
                    int i2 = multiModeAnchoredDraggableKt$restartable$2$1$emit$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        multiModeAnchoredDraggableKt$restartable$2$1$emit$1.label = i2 - Integer.MIN_VALUE;
                    } else {
                        multiModeAnchoredDraggableKt$restartable$2$1$emit$1 = new MultiModeAnchoredDraggableKt$restartable$2$1$emit$1(this, continuation);
                    }
                }
                Object obj2 = multiModeAnchoredDraggableKt$restartable$2$1$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = multiModeAnchoredDraggableKt$restartable$2$1$emit$1.label;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    Job job = this.$previousDrag.element;
                    obj = i;
                    if (job != null) {
                        job.cancel((CancellationException) new AnchoredDragFinishedSignal());
                        multiModeAnchoredDraggableKt$restartable$2$1$emit$1.L$0 = i;
                        multiModeAnchoredDraggableKt$restartable$2$1$emit$1.L$1 = job;
                        multiModeAnchoredDraggableKt$restartable$2$1$emit$1.label = 1;
                        obj = i;
                        if (job.join(multiModeAnchoredDraggableKt$restartable$2$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = multiModeAnchoredDraggableKt$restartable$2$1$emit$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    obj = obj3;
                }
                Ref.ObjectRef<Job> objectRef = this.$previousDrag;
                CoroutineScope coroutineScope = this.$$this$coroutineScope;
                objectRef.element = (T) BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(this.$block, obj, coroutineScope, null), 1, null);
                return Unit.INSTANCE;
            }

            /* compiled from: MultiModeAnchoredDraggable.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$restartable$2$1$2", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {746}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
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
}
