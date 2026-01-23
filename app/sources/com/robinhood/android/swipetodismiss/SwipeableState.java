package com.robinhood.android.swipetodismiss;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver2;
import androidx.compose.runtime.saveable.Saver5;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.swipetodismiss.SwipeableState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Swipeable.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u0000 u*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001uBD\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012#\b\u0002\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010;\u001a\u00020<2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000,H\u0000¢\u0006\u0002\b>J8\u0010?\u001a\u00020<2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000,2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000,H\u0080@¢\u0006\u0004\bA\u0010BJ\u0016\u0010^\u001a\u00020<2\u0006\u0010_\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010`J$\u0010a\u001a\u00020<2\u0006\u0010_\u001a\u00020\u00062\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@¢\u0006\u0002\u0010cJ\u0016\u0010l\u001a\u00020<2\u0006\u0010d\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010mJ&\u0010n\u001a\u00020<2\u0006\u0010d\u001a\u00028\u00002\u000e\b\u0002\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086@¢\u0006\u0002\u0010pJ\u0016\u0010q\u001a\u00020<2\u0006\u0010r\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010`J\u000e\u0010s\u001a\u00020\u00062\u0006\u0010t\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R/\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R+\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060!8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060+X\u0082\u0004¢\u0006\u0002\n\u0000RC\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000,2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000,8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u001a\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R \u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000,04X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001e\u00109\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u00108RO\u0010D\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060C2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060C8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010\u001a\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010J\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u001c\"\u0004\bL\u0010\u001eR+\u0010M\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bN\u00108\"\u0004\bO\u0010PR/\u0010T\u001a\u0004\u0018\u00010S2\b\u0010\u0013\u001a\u0004\u0018\u00010S8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010\u001a\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020[X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0011\u0010d\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\be\u0010\u0016R\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000g8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0011\u0010j\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bk\u00108¨\u0006v"}, m3636d2 = {"Lcom/robinhood/android/swipetodismiss/SwipeableState;", "T", "", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getConfirmStateChange$lib_swipe_to_dismiss_externalDebug", "()Lkotlin/jvm/functions/Function1;", "<set-?>", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "isAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "isAnimationRunning$delegate", "offset", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "overflow", "getOverflow", "offsetState", "Landroidx/compose/runtime/MutableFloatState;", "overflowState", "absoluteOffset", "animationTarget", "Landroidx/compose/runtime/MutableState;", "", "anchors", "getAnchors$lib_swipe_to_dismiss_externalDebug", "()Ljava/util/Map;", "setAnchors$lib_swipe_to_dismiss_externalDebug", "(Ljava/util/Map;)V", "anchors$delegate", "latestNonEmptyAnchorsFlow", "Lkotlinx/coroutines/flow/Flow;", "value", "minBound", "getMinBound", "()F", "maxBound", "getMaxBound", "ensureInit", "", "newAnchors", "ensureInit$lib_swipe_to_dismiss_externalDebug", "processNewAnchors", "oldAnchors", "processNewAnchors$lib_swipe_to_dismiss_externalDebug", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "thresholds", "getThresholds$lib_swipe_to_dismiss_externalDebug", "()Lkotlin/jvm/functions/Function2;", "setThresholds$lib_swipe_to_dismiss_externalDebug", "(Lkotlin/jvm/functions/Function2;)V", "thresholds$delegate", "flingEnabled", "getFlingEnabled$lib_swipe_to_dismiss_externalDebug", "setFlingEnabled$lib_swipe_to_dismiss_externalDebug", "velocityThreshold", "getVelocityThreshold$lib_swipe_to_dismiss_externalDebug", "setVelocityThreshold$lib_swipe_to_dismiss_externalDebug", "(F)V", "velocityThreshold$delegate", "Landroidx/compose/runtime/MutableFloatState;", "Lcom/robinhood/android/swipetodismiss/ResistanceConfig;", "resistance", "getResistance$lib_swipe_to_dismiss_externalDebug", "()Lcom/robinhood/android/swipetodismiss/ResistanceConfig;", "setResistance$lib_swipe_to_dismiss_externalDebug", "(Lcom/robinhood/android/swipetodismiss/ResistanceConfig;)V", "resistance$delegate", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$lib_swipe_to_dismiss_externalDebug", "()Landroidx/compose/foundation/gestures/DraggableState;", "snapInternalToOffset", "target", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateInternalToOffset", "spec", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "getTargetValue", "progress", "Lcom/robinhood/android/swipetodismiss/SwipeProgress;", "getProgress", "()Lcom/robinhood/android/swipetodismiss/SwipeProgress;", "direction", "getDirection", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "anim", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performFling", "velocity", "performDrag", "delta", "Companion", "lib-swipe-to-dismiss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public class SwipeableState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SnapshotFloatState2 absoluteOffset;

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    private final SnapshotState anchors;
    private final AnimationSpec<Float> animationSpec;
    private final SnapshotState<Float> animationTarget;
    private final Function1<T, Boolean> confirmStateChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final SnapshotState currentValue;
    private final DraggableState draggableState;
    private boolean flingEnabled;

    /* renamed from: isAnimationRunning$delegate, reason: from kotlin metadata */
    private final SnapshotState isAnimationRunning;
    private final Flow<Map<Float, T>> latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;
    private final SnapshotFloatState2 offsetState;
    private final SnapshotFloatState2 overflowState;

    /* renamed from: resistance$delegate, reason: from kotlin metadata */
    private final SnapshotState resistance;

    /* renamed from: thresholds$delegate, reason: from kotlin metadata */
    private final SnapshotState thresholds;

    /* renamed from: velocityThreshold$delegate, reason: from kotlin metadata */
    private final SnapshotFloatState2 velocityThreshold;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float thresholds_delegate$lambda$7(float f, float f2) {
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T t, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> confirmStateChange) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.animationSpec = animationSpec;
        this.confirmStateChange = confirmStateChange;
        this.currentValue = SnapshotState3.mutableStateOf$default(t, null, 2, null);
        this.isAnimationRunning = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.offsetState = SnapshotFloatState3.mutableFloatStateOf(0.0f);
        this.overflowState = SnapshotFloatState3.mutableFloatStateOf(0.0f);
        this.absoluteOffset = SnapshotFloatState3.mutableFloatStateOf(0.0f);
        this.animationTarget = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.anchors = SnapshotState3.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
        final Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.swipetodismiss.SwipeableState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getAnchors$lib_swipe_to_dismiss_externalDebug();
            }
        });
        this.latestNonEmptyAnchorsFlow = FlowKt.take(new Flow<Map<Float, ? extends T>>() { // from class: com.robinhood.android.swipetodismiss.SwipeableState$special$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowSnapshotFlow.collect(new C292092(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.swipetodismiss.SwipeableState$special$$inlined$filter$1$2 */
            public static final class C292092<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.swipetodismiss.SwipeableState$special$$inlined$filter$1$2", m3645f = "Swipeable.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.swipetodismiss.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C292092.this.emit(null, this);
                    }
                }

                public C292092(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (!((Map) obj).isEmpty()) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        this.thresholds = SnapshotState3.mutableStateOf$default(new Function2() { // from class: com.robinhood.android.swipetodismiss.SwipeableState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Float.valueOf(SwipeableState.thresholds_delegate$lambda$7(((Float) obj).floatValue(), ((Float) obj2).floatValue()));
            }
        }, null, 2, null);
        this.flingEnabled = true;
        this.velocityThreshold = SnapshotFloatState3.mutableFloatStateOf(0.0f);
        this.resistance = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.draggableState = DraggableKt.DraggableState(new Function1() { // from class: com.robinhood.android.swipetodismiss.SwipeableState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SwipeableState.draggableState$lambda$8(this.f$0, ((Float) obj).floatValue());
            }
        });
    }

    public /* synthetic */ SwipeableState(Object obj, AnimationSpec animationSpec, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i & 4) != 0 ? new Function1() { // from class: com.robinhood.android.swipetodismiss.SwipeableState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(SwipeableState._init_$lambda$0(obj2));
            }
        } : function1);
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final Function1<T, Boolean> getConfirmStateChange$lib_swipe_to_dismiss_externalDebug() {
        return this.confirmStateChange;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t) {
        this.currentValue.setValue(t);
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationRunning(boolean z) {
        this.isAnimationRunning.setValue(Boolean.valueOf(z));
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning.getValue()).booleanValue();
    }

    public final SnapshotState4<Float> getOffset() {
        return this.offsetState;
    }

    public final SnapshotState4<Float> getOverflow() {
        return this.overflowState;
    }

    public final Map<Float, T> getAnchors$lib_swipe_to_dismiss_externalDebug() {
        return (Map) this.anchors.getValue();
    }

    public final void setAnchors$lib_swipe_to_dismiss_externalDebug(Map<Float, ? extends T> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.anchors.setValue(map);
    }

    public final float getMinBound() {
        return this.minBound;
    }

    public final float getMaxBound() {
        return this.maxBound;
    }

    public final void ensureInit$lib_swipe_to_dismiss_externalDebug(Map<Float, ? extends T> newAnchors) {
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        if (getAnchors$lib_swipe_to_dismiss_externalDebug().isEmpty()) {
            Float offset = SwipeableKt.getOffset(newAnchors, getCurrentValue());
            if (offset == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.");
            }
            this.offsetState.setFloatValue(offset.floatValue());
            this.absoluteOffset.setFloatValue(offset.floatValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (snapInternalToOffset(r10, r0) == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c0, code lost:
    
        if (r12 == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ff, code lost:
    
        if (snapInternalToOffset(r10, r0) != r1) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v24, types: [float] */
    /* JADX WARN: Type inference failed for: r10v65 */
    /* JADX WARN: Type inference failed for: r10v68, types: [float] */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v73 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processNewAnchors$lib_swipe_to_dismiss_externalDebug(Map<Float, ? extends T> map, Map<Float, ? extends T> map2, Continuation<? super Unit> continuation) {
        SwipeableState$processNewAnchors$1 swipeableState$processNewAnchors$1;
        float fFloatValue;
        if (continuation instanceof SwipeableState$processNewAnchors$1) {
            swipeableState$processNewAnchors$1 = (SwipeableState$processNewAnchors$1) continuation;
            int i = swipeableState$processNewAnchors$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                swipeableState$processNewAnchors$1.label = i - Integer.MIN_VALUE;
            } else {
                swipeableState$processNewAnchors$1 = new SwipeableState$processNewAnchors$1(this, continuation);
            }
        }
        Object obj = swipeableState$processNewAnchors$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = swipeableState$processNewAnchors$1.label;
        try {
            try {
            } catch (CancellationException unused) {
                swipeableState$processNewAnchors$1.L$0 = map2;
                swipeableState$processNewAnchors$1.F$0 = map;
                swipeableState$processNewAnchors$1.label = 3;
            }
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (map.isEmpty()) {
                    Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMinOrNull);
                    this.minBound = fMinOrNull.floatValue();
                    Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
                    Intrinsics.checkNotNull(fMaxOrNull);
                    this.maxBound = fMaxOrNull.floatValue();
                    Float offset = SwipeableKt.getOffset(map2, getCurrentValue());
                    if (offset == null) {
                        throw new IllegalArgumentException("The initial value must have an associated anchor.");
                    }
                    float fFloatValue2 = offset.floatValue();
                    swipeableState$processNewAnchors$1.label = 1;
                } else {
                    if (!Intrinsics.areEqual(map2, map)) {
                        this.minBound = Float.NEGATIVE_INFINITY;
                        this.maxBound = Float.POSITIVE_INFINITY;
                        Float value = this.animationTarget.getValue();
                        Object next = null;
                        if (value != null) {
                            Float offset2 = SwipeableKt.getOffset(map2, map.get(value));
                            if (offset2 != null) {
                                fFloatValue = offset2.floatValue();
                            } else {
                                Iterator<T> it = map2.keySet().iterator();
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (it.hasNext()) {
                                        float fAbs = Math.abs(((Number) next).floatValue() - value.floatValue());
                                        do {
                                            Object next2 = it.next();
                                            float fAbs2 = Math.abs(((Number) next2).floatValue() - value.floatValue());
                                            if (Float.compare(fAbs, fAbs2) > 0) {
                                                next = next2;
                                                fAbs = fAbs2;
                                            }
                                        } while (it.hasNext());
                                    }
                                }
                                Intrinsics.checkNotNull(next);
                                fFloatValue = ((Number) next).floatValue();
                            }
                        } else {
                            Object currentValue = map.get(getOffset().getValue());
                            if (Intrinsics.areEqual(currentValue, getCurrentValue())) {
                                currentValue = getCurrentValue();
                            }
                            Float offset3 = SwipeableKt.getOffset(map2, currentValue);
                            if (offset3 != null) {
                                fFloatValue = offset3.floatValue();
                            } else {
                                Iterator<T> it2 = map2.keySet().iterator();
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (it2.hasNext()) {
                                        float fAbs3 = Math.abs(((Number) next).floatValue() - getOffset().getValue().floatValue());
                                        do {
                                            Object next3 = it2.next();
                                            float fAbs4 = Math.abs(((Number) next3).floatValue() - getOffset().getValue().floatValue());
                                            if (Float.compare(fAbs3, fAbs4) > 0) {
                                                next = next3;
                                                fAbs3 = fAbs4;
                                            }
                                        } while (it2.hasNext());
                                    }
                                }
                                Intrinsics.checkNotNull(next);
                                fFloatValue = ((Number) next).floatValue();
                            }
                        }
                        AnimationSpec<Float> animationSpec = this.animationSpec;
                        swipeableState$processNewAnchors$1.L$0 = map2;
                        swipeableState$processNewAnchors$1.F$0 = fFloatValue;
                        swipeableState$processNewAnchors$1.label = 2;
                        Object objAnimateInternalToOffset = animateInternalToOffset(fFloatValue, animationSpec, swipeableState$processNewAnchors$1);
                        map = fFloatValue;
                    }
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i2 == 2) {
                boolean z = (Map<Float, ? extends T>) swipeableState$processNewAnchors$1.F$0;
                map2 = (Map) swipeableState$processNewAnchors$1.L$0;
                ResultKt.throwOnFailure(obj);
                map = z;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map<Float, ? extends T>) swipeableState$processNewAnchors$1.F$0;
                map2 = (Map) swipeableState$processNewAnchors$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        } finally {
            setCurrentValue(MapsKt.getValue(map2, boxing.boxFloat(map)));
            Float fMinOrNull2 = CollectionsKt.minOrNull((Iterable<? extends Float>) map2.keySet());
            Intrinsics.checkNotNull(fMinOrNull2);
            this.minBound = fMinOrNull2.floatValue();
            Float fMaxOrNull2 = CollectionsKt.maxOrNull((Iterable<? extends Float>) map2.keySet());
            Intrinsics.checkNotNull(fMaxOrNull2);
            this.maxBound = fMaxOrNull2.floatValue();
        }
    }

    public final Function2<Float, Float, Float> getThresholds$lib_swipe_to_dismiss_externalDebug() {
        return (Function2) this.thresholds.getValue();
    }

    public final void setThresholds$lib_swipe_to_dismiss_externalDebug(Function2<? super Float, ? super Float, Float> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.thresholds.setValue(function2);
    }

    /* renamed from: getFlingEnabled$lib_swipe_to_dismiss_externalDebug, reason: from getter */
    public final boolean getFlingEnabled() {
        return this.flingEnabled;
    }

    public final void setFlingEnabled$lib_swipe_to_dismiss_externalDebug(boolean z) {
        this.flingEnabled = z;
    }

    public final float getVelocityThreshold$lib_swipe_to_dismiss_externalDebug() {
        return this.velocityThreshold.getFloatValue();
    }

    public final void setVelocityThreshold$lib_swipe_to_dismiss_externalDebug(float f) {
        this.velocityThreshold.setFloatValue(f);
    }

    public final ResistanceConfig getResistance$lib_swipe_to_dismiss_externalDebug() {
        return (ResistanceConfig) this.resistance.getValue();
    }

    public final void setResistance$lib_swipe_to_dismiss_externalDebug(ResistanceConfig resistanceConfig) {
        this.resistance.setValue(resistanceConfig);
    }

    /* renamed from: getDraggableState$lib_swipe_to_dismiss_externalDebug, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit draggableState$lambda$8(SwipeableState swipeableState, float f) {
        float floatValue = swipeableState.absoluteOffset.getFloatValue() + f;
        float fCoerceIn = RangesKt.coerceIn(floatValue, swipeableState.minBound, swipeableState.maxBound);
        float f2 = floatValue - fCoerceIn;
        ResistanceConfig resistance$lib_swipe_to_dismiss_externalDebug = swipeableState.getResistance$lib_swipe_to_dismiss_externalDebug();
        swipeableState.offsetState.setFloatValue(fCoerceIn + (resistance$lib_swipe_to_dismiss_externalDebug != null ? resistance$lib_swipe_to_dismiss_externalDebug.computeResistance(f2) : 0.0f));
        swipeableState.overflowState.setFloatValue(f2);
        swipeableState.absoluteOffset.setFloatValue(floatValue);
        return Unit.INSTANCE;
    }

    /* compiled from: Swipeable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.swipetodismiss.SwipeableState$snapInternalToOffset$2", m3645f = "Swipeable.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.swipetodismiss.SwipeableState$snapInternalToOffset$2 */
    static final class C292132 extends ContinuationImpl7 implements Function2<DragScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $target;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SwipeableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C292132(float f, SwipeableState<T> swipeableState, Continuation<? super C292132> continuation) {
            super(2, continuation);
            this.$target = f;
            this.this$0 = swipeableState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C292132 c292132 = new C292132(this.$target, this.this$0, continuation);
            c292132.L$0 = obj;
            return c292132;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
            return ((C292132) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ((DragScope) this.L$0).dragBy(this.$target - ((SwipeableState) this.this$0).absoluteOffset.getFloatValue());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object snapInternalToOffset(float f, Continuation<? super Unit> continuation) {
        Object objDrag$default = DraggableState.drag$default(this.draggableState, null, new C292132(f, this, null), continuation, 1, null);
        return objDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDrag$default : Unit.INSTANCE;
    }

    /* compiled from: Swipeable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.swipetodismiss.SwipeableState$animateInternalToOffset$2", m3645f = "Swipeable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.swipetodismiss.SwipeableState$animateInternalToOffset$2 */
    static final class C292102 extends ContinuationImpl7 implements Function2<DragScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $spec;
        final /* synthetic */ float $target;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SwipeableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C292102(SwipeableState<T> swipeableState, float f, AnimationSpec<Float> animationSpec, Continuation<? super C292102> continuation) {
            super(2, continuation);
            this.this$0 = swipeableState;
            this.$target = f;
            this.$spec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C292102 c292102 = new C292102(this.this$0, this.$target, this.$spec, continuation);
            c292102.L$0 = obj;
            return c292102;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
            return ((C292102) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objAnimateTo$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final DragScope dragScope = (DragScope) this.L$0;
                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                    floatRef.element = ((SwipeableState) this.this$0).absoluteOffset.getFloatValue();
                    ((SwipeableState) this.this$0).animationTarget.setValue(boxing.boxFloat(this.$target));
                    this.this$0.setAnimationRunning(true);
                    Animatable animatableAnimatable$default = Animatable2.Animatable$default(floatRef.element, 0.0f, 2, null);
                    Float fBoxFloat = boxing.boxFloat(this.$target);
                    AnimationSpec<Float> animationSpec = this.$spec;
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.swipetodismiss.SwipeableState$animateInternalToOffset$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SwipeableState.C292102.invokeSuspend$lambda$0(dragScope, floatRef, (Animatable) obj2);
                        }
                    };
                    this.label = 1;
                    objAnimateTo$default = Animatable.animateTo$default(animatableAnimatable$default, fBoxFloat, animationSpec, null, function1, this, 4, null);
                    if (objAnimateTo$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objAnimateTo$default = obj;
                }
                ((SwipeableState) this.this$0).animationTarget.setValue(null);
                this.this$0.setAnimationRunning(false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                ((SwipeableState) this.this$0).animationTarget.setValue(null);
                this.this$0.setAnimationRunning(false);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(DragScope dragScope, Ref.FloatRef floatRef, Animatable animatable) {
            dragScope.dragBy(((Number) animatable.getValue()).floatValue() - floatRef.element);
            floatRef.element = ((Number) animatable.getValue()).floatValue();
            return Unit.INSTANCE;
        }
    }

    public final Object animateInternalToOffset(float f, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object objDrag$default = DraggableState.drag$default(this.draggableState, null, new C292102(this, f, animationSpec, null), continuation, 1, null);
        return objDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDrag$default : Unit.INSTANCE;
    }

    public final T getTargetValue() {
        float fComputeTarget;
        Float value = this.animationTarget.getValue();
        if (value != null) {
            fComputeTarget = value.floatValue();
        } else {
            float fFloatValue = getOffset().getValue().floatValue();
            Float offset = SwipeableKt.getOffset(getAnchors$lib_swipe_to_dismiss_externalDebug(), getCurrentValue());
            fComputeTarget = SwipeableKt.computeTarget(fFloatValue, offset != null ? offset.floatValue() : getOffset().getValue().floatValue(), getAnchors$lib_swipe_to_dismiss_externalDebug().keySet(), getThresholds$lib_swipe_to_dismiss_externalDebug(), 0.0f, this.flingEnabled, Float.POSITIVE_INFINITY);
        }
        T t = getAnchors$lib_swipe_to_dismiss_externalDebug().get(Float.valueOf(fComputeTarget));
        return t == null ? getCurrentValue() : t;
    }

    public final SwipeProgress<T> getProgress() {
        Object currentValue;
        Object value;
        float fFloatValue;
        Tuples2 tuples2M3642to;
        List listFindBounds = SwipeableKt.findBounds(getOffset().getValue().floatValue(), getAnchors$lib_swipe_to_dismiss_externalDebug().keySet());
        int size = listFindBounds.size();
        if (size == 0) {
            T currentValue2 = getCurrentValue();
            currentValue = getCurrentValue();
            value = currentValue2;
            fFloatValue = 1.0f;
        } else if (size == 1) {
            Object value2 = MapsKt.getValue(getAnchors$lib_swipe_to_dismiss_externalDebug(), listFindBounds.get(0));
            currentValue = MapsKt.getValue(getAnchors$lib_swipe_to_dismiss_externalDebug(), listFindBounds.get(0));
            fFloatValue = 1.0f;
            value = value2;
        } else {
            if (getDirection() > 0.0f) {
                tuples2M3642to = Tuples4.m3642to(listFindBounds.get(0), listFindBounds.get(1));
            } else {
                tuples2M3642to = Tuples4.m3642to(listFindBounds.get(1), listFindBounds.get(0));
            }
            float fFloatValue2 = ((Number) tuples2M3642to.component1()).floatValue();
            float fFloatValue3 = ((Number) tuples2M3642to.component2()).floatValue();
            value = MapsKt.getValue(getAnchors$lib_swipe_to_dismiss_externalDebug(), Float.valueOf(fFloatValue2));
            currentValue = MapsKt.getValue(getAnchors$lib_swipe_to_dismiss_externalDebug(), Float.valueOf(fFloatValue3));
            fFloatValue = (getOffset().getValue().floatValue() - fFloatValue2) / (fFloatValue3 - fFloatValue2);
        }
        return new SwipeProgress<>(value, currentValue, fFloatValue);
    }

    public final float getDirection() {
        Float offset = SwipeableKt.getOffset(getAnchors$lib_swipe_to_dismiss_externalDebug(), getCurrentValue());
        if (offset == null) {
            return 0.0f;
        }
        return Math.signum(getOffset().getValue().floatValue() - offset.floatValue());
    }

    /* compiled from: Swipeable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.swipetodismiss.SwipeableState$snapTo$2 */
    static final class C292142<T> implements FlowCollector {
        final /* synthetic */ T $targetValue;
        final /* synthetic */ SwipeableState<T> this$0;

        C292142(T t, SwipeableState<T> swipeableState) {
            this.$targetValue = t;
            this.this$0 = swipeableState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((Map) obj, (Continuation<? super Unit>) continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Map<Float, ? extends T> map, Continuation<? super Unit> continuation) {
            SwipeableState$snapTo$2$emit$1 swipeableState$snapTo$2$emit$1;
            if (continuation instanceof SwipeableState$snapTo$2$emit$1) {
                swipeableState$snapTo$2$emit$1 = (SwipeableState$snapTo$2$emit$1) continuation;
                int i = swipeableState$snapTo$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    swipeableState$snapTo$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    swipeableState$snapTo$2$emit$1 = new SwipeableState$snapTo$2$emit$1(this, continuation);
                }
            }
            Object obj = swipeableState$snapTo$2$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = swipeableState$snapTo$2$emit$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Float offset = SwipeableKt.getOffset(map, this.$targetValue);
                if (offset == null) {
                    throw new IllegalArgumentException("The target value must have an associated anchor.");
                }
                SwipeableState<T> swipeableState = this.this$0;
                float fFloatValue = offset.floatValue();
                swipeableState$snapTo$2$emit$1.label = 1;
                if (swipeableState.snapInternalToOffset(fFloatValue, swipeableState$snapTo$2$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.setCurrentValue(this.$targetValue);
            return Unit.INSTANCE;
        }
    }

    public final Object snapTo(T t, Continuation<? super Unit> continuation) {
        Object objCollect = this.latestNonEmptyAnchorsFlow.collect(new C292142(t, this), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* compiled from: Swipeable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.swipetodismiss.SwipeableState$animateTo$2 */
    static final class C292112<T> implements FlowCollector {
        final /* synthetic */ AnimationSpec<Float> $anim;
        final /* synthetic */ T $targetValue;
        final /* synthetic */ SwipeableState<T> this$0;

        C292112(T t, SwipeableState<T> swipeableState, AnimationSpec<Float> animationSpec) {
            this.$targetValue = t;
            this.this$0 = swipeableState;
            this.$anim = animationSpec;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((Map) obj, (Continuation<? super Unit>) continuation);
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Map<Float, ? extends T> map, Continuation<? super Unit> continuation) {
            SwipeableState$animateTo$2$emit$1 swipeableState$animateTo$2$emit$1;
            if (continuation instanceof SwipeableState$animateTo$2$emit$1) {
                swipeableState$animateTo$2$emit$1 = (SwipeableState$animateTo$2$emit$1) continuation;
                int i = swipeableState$animateTo$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    swipeableState$animateTo$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    swipeableState$animateTo$2$emit$1 = new SwipeableState$animateTo$2$emit$1(this, continuation);
                }
            }
            Object obj = swipeableState$animateTo$2$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = swipeableState$animateTo$2$emit$1.label;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Float offset = SwipeableKt.getOffset(map, this.$targetValue);
                    if (offset == null) {
                        throw new IllegalArgumentException("The target value must have an associated anchor.");
                    }
                    SwipeableState<T> swipeableState = this.this$0;
                    float fFloatValue = offset.floatValue();
                    AnimationSpec<Float> animationSpec = this.$anim;
                    swipeableState$animateTo$2$emit$1.L$0 = map;
                    swipeableState$animateTo$2$emit$1.label = 1;
                    if (swipeableState.animateInternalToOffset(fFloatValue, animationSpec, swipeableState$animateTo$2$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (Map) swipeableState$animateTo$2$emit$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                float floatValue = ((SwipeableState) this.this$0).absoluteOffset.getFloatValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Float, ? extends T> entry : map.entrySet()) {
                    if (Math.abs(entry.getKey().floatValue() - floatValue) < 0.5f) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Object objFirstOrNull = CollectionsKt.firstOrNull(linkedHashMap.values());
                if (objFirstOrNull == null) {
                    objFirstOrNull = this.this$0.getCurrentValue();
                }
                this.this$0.setCurrentValue(objFirstOrNull);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                float floatValue2 = ((SwipeableState) this.this$0).absoluteOffset.getFloatValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<Float, ? extends T> entry2 : map.entrySet()) {
                    if (Math.abs(entry2.getKey().floatValue() - floatValue2) < 0.5f) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Object objFirstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap2.values());
                if (objFirstOrNull2 == null) {
                    objFirstOrNull2 = this.this$0.getCurrentValue();
                }
                this.this$0.setCurrentValue(objFirstOrNull2);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, Continuation continuation, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i & 2) != 0) {
            animationSpec = swipeableState.animationSpec;
        }
        return swipeableState.animateTo(obj, animationSpec, continuation);
    }

    public final Object animateTo(T t, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object objCollect = this.latestNonEmptyAnchorsFlow.collect(new C292112(t, this, animationSpec), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public final Object performFling(final float f, Continuation<? super Unit> continuation) {
        Object objCollect = this.latestNonEmptyAnchorsFlow.collect(new FlowCollector(this) { // from class: com.robinhood.android.swipetodismiss.SwipeableState.performFling.2
            final /* synthetic */ SwipeableState<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((Map) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(Map<Float, ? extends T> map, Continuation<? super Unit> continuation2) {
                Float offset = SwipeableKt.getOffset(map, this.this$0.getCurrentValue());
                Intrinsics.checkNotNull(offset);
                float fFloatValue = offset.floatValue();
                T t = map.get(boxing.boxFloat(SwipeableKt.computeTarget(this.this$0.getOffset().getValue().floatValue(), fFloatValue, map.keySet(), this.this$0.getThresholds$lib_swipe_to_dismiss_externalDebug(), f, this.this$0.getFlingEnabled(), this.this$0.getVelocityThreshold$lib_swipe_to_dismiss_externalDebug())));
                if (t != null && this.this$0.getConfirmStateChange$lib_swipe_to_dismiss_externalDebug().invoke(t).booleanValue()) {
                    Object objAnimateTo$default = SwipeableState.animateTo$default(this.this$0, t, null, continuation2, 2, null);
                    return objAnimateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
                }
                SwipeableState<T> swipeableState = this.this$0;
                Object objAnimateInternalToOffset = swipeableState.animateInternalToOffset(fFloatValue, swipeableState.getAnimationSpec(), continuation2);
                return objAnimateInternalToOffset == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateInternalToOffset : Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public final float performDrag(float delta) {
        float fCoerceIn = RangesKt.coerceIn(this.absoluteOffset.getFloatValue() + delta, this.minBound, this.maxBound) - this.absoluteOffset.getFloatValue();
        if (Math.abs(fCoerceIn) > 0.0f) {
            this.draggableState.dispatchRawDelta(fCoerceIn);
        }
        return fCoerceIn;
    }

    /* compiled from: Swipeable.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0001\u0010\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\r0\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/swipetodismiss/SwipeableState$Companion;", "", "<init>", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/robinhood/android/swipetodismiss/SwipeableState;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "lib-swipe-to-dismiss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> Saver<SwipeableState<T>, T> Saver(final AnimationSpec<Float> animationSpec, final Function1<? super T, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return Saver2.Saver(new Function2() { // from class: com.robinhood.android.swipetodismiss.SwipeableState$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SwipeableState.Companion.Saver$lambda$0((Saver5) obj, (SwipeableState) obj2);
                }
            }, new Function1() { // from class: com.robinhood.android.swipetodismiss.SwipeableState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SwipeableState.Companion.Saver$lambda$1(animationSpec, confirmStateChange, obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object Saver$lambda$0(Saver5 Saver, SwipeableState it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SwipeableState Saver$lambda$1(AnimationSpec animationSpec, Function1 function1, Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new SwipeableState(it, animationSpec, function1);
        }
    }
}
