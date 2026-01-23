package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatorMutex2;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: AnchoredDraggable.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\u0001\u0018\u0000 p*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001pBs\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010#\u001a\u00020\"2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\b\b\u0002\u0010!\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b%\u0010&J^\u0010/\u001a\u00020\"2\b\b\u0002\u0010(\u001a\u00020'2B\u0010.\u001a>\b\u0001\u0012\u0004\u0012\u00020*\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0,\u0012\u0006\u0012\u0004\u0018\u00010\u00020)¢\u0006\u0002\b-H\u0086@¢\u0006\u0004\b/\u00100J{\u0010/\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00028\u00002\b\b\u0002\u0010(\u001a\u00020'2W\u0010.\u001aS\b\u0001\u0012\u0004\u0012\u00020*\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(+\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0,\u0012\u0006\u0012\u0004\u0018\u00010\u000201¢\u0006\u0002\b-H\u0086@¢\u0006\u0004\b/\u00102J\u0017\u00106\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0005H\u0000¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0005¢\u0006\u0004\b7\u00105R5\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010:R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010@R5\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\bA\u0010:R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010F\u001a\u00020E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR+\u0010\u0014\u001a\u00028\u00002\u0006\u0010J\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001b\u0010\u001a\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010NR\u001b\u0010V\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bT\u0010R\u001a\u0004\bU\u0010NR+\u0010\u0013\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010\u001e\"\u0004\bZ\u0010[R\u001b\u0010^\u001a\u00020\u00058GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010R\u001a\u0004\b]\u0010\u001eR+\u0010b\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010X\u001a\u0004\b`\u0010\u001e\"\u0004\ba\u0010[R/\u0010f\u001a\u0004\u0018\u00018\u00002\b\u0010J\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bc\u0010L\u001a\u0004\bd\u0010N\"\u0004\be\u0010PR7\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010L\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010l\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0011\u0010n\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bn\u0010o¨\u0006q"}, m3636d2 = {"Landroidx/compose/material/AnchoredDraggableState;", "T", "", "initialValue", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "newValue", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "offset", "currentValue", "velocity", "computeTarget", "(FLjava/lang/Object;F)Ljava/lang/Object;", "computeTargetWithoutThresholds", "(FLjava/lang/Object;)Ljava/lang/Object;", "targetValue", "trySnapTo", "(Ljava/lang/Object;)Z", "requireOffset", "()F", "Landroidx/compose/material/DraggableAnchors;", "newAnchors", "newTarget", "", "updateAnchors", "(Landroidx/compose/material/DraggableAnchors;Ljava/lang/Object;)V", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function3;", "Landroidx/compose/material/AnchoredDragScope;", "anchors", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "anchoredDrag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function4;", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "newOffsetForDelta$material_release", "(F)F", "newOffsetForDelta", "dispatchRawDelta", "Lkotlin/jvm/functions/Function1;", "getPositionalThreshold$material_release", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "getVelocityThreshold$material_release", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getConfirmValueChange$material_release", "Landroidx/compose/material/InternalMutatorMutex;", "dragMutex", "Landroidx/compose/material/InternalMutatorMutex;", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "<set-?>", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "targetValue$delegate", "Landroidx/compose/runtime/State;", "getTargetValue", "closestValue$delegate", "getClosestValue$material_release", "closestValue", "offset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getOffset", "setOffset", "(F)V", "progress$delegate", "getProgress", "progress", "lastVelocity$delegate", "getLastVelocity", "setLastVelocity", "lastVelocity", "dragTarget$delegate", "getDragTarget", "setDragTarget", "dragTarget", "anchors$delegate", "getAnchors", "()Landroidx/compose/material/DraggableAnchors;", "setAnchors", "(Landroidx/compose/material/DraggableAnchors;)V", "anchoredDragScope", "Landroidx/compose/material/AnchoredDragScope;", "isAnimationRunning", "()Z", "Companion", "material_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    private final AnimationSpec<Float> animationSpec;
    private final Function1<T, Boolean> confirmValueChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final SnapshotState currentValue;
    private final Function1<Float, Float> positionalThreshold;
    private final Function0<Float> velocityThreshold;
    private final InternalMutatorMutex dragMutex = new InternalMutatorMutex();
    private final DraggableState draggableState = new AnchoredDraggableState$draggableState$1(this);

    /* renamed from: targetValue$delegate, reason: from kotlin metadata */
    private final SnapshotState4 targetValue = SnapshotStateKt.derivedStateOf(new Function0<T>(this) { // from class: androidx.compose.material.AnchoredDraggableState$targetValue$2
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            T t = (T) this.this$0.getDragTarget();
            if (t != null) {
                return t;
            }
            AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            float offset = anchoredDraggableState.getOffset();
            if (!Float.isNaN(offset)) {
                return (T) anchoredDraggableState.computeTarget(offset, anchoredDraggableState.getCurrentValue(), 0.0f);
            }
            return anchoredDraggableState.getCurrentValue();
        }
    });

    /* renamed from: closestValue$delegate, reason: from kotlin metadata */
    private final SnapshotState4 closestValue = SnapshotStateKt.derivedStateOf(new Function0<T>(this) { // from class: androidx.compose.material.AnchoredDraggableState$closestValue$2
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            T t = (T) this.this$0.getDragTarget();
            if (t != null) {
                return t;
            }
            AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            float offset = anchoredDraggableState.getOffset();
            if (!Float.isNaN(offset)) {
                return (T) anchoredDraggableState.computeTargetWithoutThresholds(offset, anchoredDraggableState.getCurrentValue());
            }
            return anchoredDraggableState.getCurrentValue();
        }
    });

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    private final SnapshotFloatState2 offset = SnapshotFloatState3.mutableFloatStateOf(Float.NaN);

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    private final SnapshotState4 progress = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Float>(this) { // from class: androidx.compose.material.AnchoredDraggableState$progress$2
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            float fPositionOf = this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue());
            float fPositionOf2 = this.this$0.getAnchors().positionOf(this.this$0.getClosestValue$material_release()) - fPositionOf;
            float fAbs = Math.abs(fPositionOf2);
            float f = 1.0f;
            if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                float fRequireOffset = (this.this$0.requireOffset() - fPositionOf) / fPositionOf2;
                if (fRequireOffset < 1.0E-6f) {
                    f = 0.0f;
                } else if (fRequireOffset <= 0.999999f) {
                    f = fRequireOffset;
                }
            }
            return Float.valueOf(f);
        }
    });

    /* renamed from: lastVelocity$delegate, reason: from kotlin metadata */
    private final SnapshotFloatState2 lastVelocity = SnapshotFloatState3.mutableFloatStateOf(0.0f);

    /* renamed from: dragTarget$delegate, reason: from kotlin metadata */
    private final SnapshotState dragTarget = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    private final SnapshotState anchors = SnapshotState3.mutableStateOf$default(AnchoredDraggableKt.emptyDraggableAnchors(), null, 2, null);
    private final AnchoredDragScope anchoredDragScope = new AnchoredDragScope(this) { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDragScope$1
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        {
            this.this$0 = this;
        }

        @Override // androidx.compose.material.AnchoredDragScope
        public void dragTo(float newOffset, float lastKnownVelocity) {
            this.this$0.setOffset(newOffset);
            this.this$0.setLastVelocity(lastKnownVelocity);
        }
    };

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.material.AnchoredDraggableState", m3645f = "AnchoredDraggable.kt", m3646l = {525}, m3647m = "anchoredDrag")
    /* renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$1 */
    /* loaded from: classes4.dex */
    static final class C14581 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14581(AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super C14581> continuation) {
            super(continuation);
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, this);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.material.AnchoredDraggableState", m3645f = "AnchoredDraggable.kt", m3646l = {572}, m3647m = "anchoredDrag")
    /* renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$3 */
    /* loaded from: classes4.dex */
    static final class C14603 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14603(AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super C14603> continuation) {
            super(continuation);
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T t, Function1<? super Float, Float> function1, Function0<Float> function0, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function12) {
        this.positionalThreshold = function1;
        this.velocityThreshold = function0;
        this.animationSpec = animationSpec;
        this.confirmValueChange = function12;
        this.currentValue = SnapshotState3.mutableStateOf$default(t, null, 2, null);
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final Function1<T, Boolean> getConfirmValueChange$material_release() {
        return this.confirmValueChange;
    }

    /* renamed from: getDraggableState$material_release, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t) {
        this.currentValue.setValue(t);
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue.getValue();
    }

    public final T getClosestValue$material_release() {
        return (T) this.closestValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(float f) {
        this.offset.setFloatValue(f);
    }

    public final float getOffset() {
        return this.offset.getFloatValue();
    }

    public final float requireOffset() {
        if (Float.isNaN(getOffset())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return getOffset();
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f) {
        this.lastVelocity.setFloatValue(f);
    }

    public final float getLastVelocity() {
        return this.lastVelocity.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getDragTarget() {
        return this.dragTarget.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragTarget(T t) {
        this.dragTarget.setValue(t);
    }

    private final void setAnchors(DraggableAnchors<T> draggableAnchors) {
        this.anchors.setValue(draggableAnchors);
    }

    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors, Object obj, int i, Object obj2) {
        if ((i & 2) != 0 && (Float.isNaN(anchoredDraggableState.getOffset()) || (obj = draggableAnchors.closestAnchor(anchoredDraggableState.getOffset())) == null)) {
            obj = anchoredDraggableState.getTargetValue();
        }
        anchoredDraggableState.updateAnchors(draggableAnchors, obj);
    }

    public final void updateAnchors(DraggableAnchors<T> newAnchors, T newTarget) {
        if (Intrinsics.areEqual(getAnchors(), newAnchors)) {
            return;
        }
        setAnchors(newAnchors);
        if (trySnapTo(newTarget)) {
            return;
        }
        setDragTarget(newTarget);
    }

    public final Object settle(float f, Continuation<? super Unit> continuation) {
        T currentValue = getCurrentValue();
        T tComputeTarget = computeTarget(requireOffset(), currentValue, f);
        if (this.confirmValueChange.invoke(tComputeTarget).booleanValue()) {
            Object objAnimateTo = AnchoredDraggableKt.animateTo(this, tComputeTarget, f, continuation);
            return objAnimateTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
        }
        Object objAnimateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f, continuation);
        return objAnimateTo2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo2 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTarget(float offset, T currentValue, float velocity) {
        DraggableAnchors<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(currentValue);
        float fFloatValue = this.velocityThreshold.invoke().floatValue();
        if (fPositionOf != offset && !Float.isNaN(fPositionOf)) {
            if (fPositionOf < offset) {
                if (velocity >= fFloatValue) {
                    T tClosestAnchor = anchors.closestAnchor(offset, true);
                    Intrinsics.checkNotNull(tClosestAnchor);
                    return tClosestAnchor;
                }
                T tClosestAnchor2 = anchors.closestAnchor(offset, true);
                Intrinsics.checkNotNull(tClosestAnchor2);
                if (offset >= Math.abs(fPositionOf + Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(anchors.positionOf(tClosestAnchor2) - fPositionOf))).floatValue()))) {
                    return tClosestAnchor2;
                }
            } else {
                if (velocity <= (-fFloatValue)) {
                    T tClosestAnchor3 = anchors.closestAnchor(offset, false);
                    Intrinsics.checkNotNull(tClosestAnchor3);
                    return tClosestAnchor3;
                }
                T tClosestAnchor4 = anchors.closestAnchor(offset, false);
                Intrinsics.checkNotNull(tClosestAnchor4);
                float fAbs = Math.abs(fPositionOf - Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(fPositionOf - anchors.positionOf(tClosestAnchor4)))).floatValue()));
                if (offset >= 0.0f ? offset <= fAbs : Math.abs(offset) >= fAbs) {
                    return tClosestAnchor4;
                }
            }
        }
        return currentValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTargetWithoutThresholds(float offset, T currentValue) {
        DraggableAnchors<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(currentValue);
        if (fPositionOf != offset && !Float.isNaN(fPositionOf)) {
            if (fPositionOf < offset) {
                T tClosestAnchor = anchors.closestAnchor(offset, true);
                if (tClosestAnchor != null) {
                    return tClosestAnchor;
                }
            } else {
                T tClosestAnchor2 = anchors.closestAnchor(offset, false);
                if (tClosestAnchor2 != null) {
                    return tClosestAnchor2;
                }
            }
        }
        return currentValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object anchoredDrag(MutatorMutex2 mutatorMutex2, Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) throws Throwable {
        C14581 c14581;
        AnchoredDraggableState<T> anchoredDraggableState;
        T tClosestAnchor;
        T tClosestAnchor2;
        if (continuation instanceof C14581) {
            c14581 = (C14581) continuation;
            int i = c14581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14581.label = i - Integer.MIN_VALUE;
            } else {
                c14581 = new C14581(this, continuation);
            }
        }
        Object obj = c14581.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14581.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anchoredDraggableState = (AnchoredDraggableState) c14581.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                tClosestAnchor2 = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                if (tClosestAnchor2 != null && Math.abs(anchoredDraggableState.getOffset() - anchoredDraggableState.getAnchors().positionOf(tClosestAnchor2)) <= 0.5f && anchoredDraggableState.confirmValueChange.invoke(tClosestAnchor2).booleanValue()) {
                    anchoredDraggableState.setCurrentValue(tClosestAnchor2);
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                tClosestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                if (tClosestAnchor != null) {
                    anchoredDraggableState.setCurrentValue(tClosestAnchor);
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            InternalMutatorMutex internalMutatorMutex = this.dragMutex;
            C14592 c14592 = new C14592(this, function3, null);
            c14581.L$0 = this;
            c14581.label = 1;
            if (internalMutatorMutex.mutate(mutatorMutex2, c14592, c14581) == coroutine_suspended) {
                return coroutine_suspended;
            }
            anchoredDraggableState = this;
            tClosestAnchor2 = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
            if (tClosestAnchor2 != null) {
                anchoredDraggableState.setCurrentValue(tClosestAnchor2);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            anchoredDraggableState = this;
            tClosestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
            if (tClosestAnchor != null && Math.abs(anchoredDraggableState.getOffset() - anchoredDraggableState.getAnchors().positionOf(tClosestAnchor)) <= 0.5f && anchoredDraggableState.confirmValueChange.invoke(tClosestAnchor).booleanValue()) {
                anchoredDraggableState.setCurrentValue(tClosestAnchor);
            }
            throw th;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "T"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2", m3645f = "AnchoredDraggable.kt", m3646l = {526}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$2 */
    /* loaded from: classes4.dex */
    static final class C14592 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> $block;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14592(AnchoredDraggableState<T> anchoredDraggableState, Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C14592> continuation) {
            super(1, continuation);
            this.this$0 = anchoredDraggableState;
            this.$block = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C14592(this.this$0, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C14592) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "latestAnchors", "Landroidx/compose/material/DraggableAnchors;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2", m3645f = "AnchoredDraggable.kt", m3646l = {527}, m3647m = "invokeSuspend")
        /* renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<DraggableAnchors<T>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$block = function3;
                this.this$0 = anchoredDraggableState;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DraggableAnchors<T> draggableAnchors, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(draggableAnchors, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DraggableAnchors<T> draggableAnchors = (DraggableAnchors) this.L$0;
                    Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> function3 = this.$block;
                    AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (function3.invoke(anchoredDragScope, draggableAnchors, this) == coroutine_suspended) {
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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                Function0<DraggableAnchors<T>> function0 = new Function0<DraggableAnchors<T>>() { // from class: androidx.compose.material.AnchoredDraggableState.anchoredDrag.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DraggableAnchors<T> invoke() {
                        return anchoredDraggableState.getAnchors();
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
                this.label = 1;
                if (AnchoredDraggableKt.restartable(function0, anonymousClass2, this) == coroutine_suspended) {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object anchoredDrag(T t, MutatorMutex2 mutatorMutex2, Function4<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, Continuation<? super Unit> continuation) throws Throwable {
        C14603 c14603;
        AnchoredDraggableState<T> anchoredDraggableState;
        T tClosestAnchor;
        T tClosestAnchor2;
        if (continuation instanceof C14603) {
            c14603 = (C14603) continuation;
            int i = c14603.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14603.label = i - Integer.MIN_VALUE;
            } else {
                c14603 = new C14603(this, continuation);
            }
        }
        Object obj = c14603.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14603.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (getAnchors().hasAnchorFor(t)) {
                try {
                    InternalMutatorMutex internalMutatorMutex = this.dragMutex;
                    C14614 c14614 = new C14614(this, t, function4, null);
                    c14603.L$0 = this;
                    c14603.label = 1;
                    if (internalMutatorMutex.mutate(mutatorMutex2, c14614, c14603) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    anchoredDraggableState = this;
                    anchoredDraggableState.setDragTarget(null);
                    tClosestAnchor2 = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                    if (tClosestAnchor2 != null) {
                        anchoredDraggableState.setCurrentValue(tClosestAnchor2);
                    }
                } catch (Throwable th) {
                    th = th;
                    anchoredDraggableState = this;
                    anchoredDraggableState.setDragTarget(null);
                    tClosestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                    if (tClosestAnchor != null) {
                        anchoredDraggableState.setCurrentValue(tClosestAnchor);
                    }
                    throw th;
                }
            } else {
                setCurrentValue(t);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anchoredDraggableState = (AnchoredDraggableState) c14603.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                anchoredDraggableState.setDragTarget(null);
                tClosestAnchor2 = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                if (tClosestAnchor2 != null && Math.abs(anchoredDraggableState.getOffset() - anchoredDraggableState.getAnchors().positionOf(tClosestAnchor2)) <= 0.5f && anchoredDraggableState.confirmValueChange.invoke(tClosestAnchor2).booleanValue()) {
                    anchoredDraggableState.setCurrentValue(tClosestAnchor2);
                }
            } catch (Throwable th2) {
                th = th2;
                anchoredDraggableState.setDragTarget(null);
                tClosestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                if (tClosestAnchor != null && Math.abs(anchoredDraggableState.getOffset() - anchoredDraggableState.getAnchors().positionOf(tClosestAnchor)) <= 0.5f && anchoredDraggableState.confirmValueChange.invoke(tClosestAnchor).booleanValue()) {
                    anchoredDraggableState.setCurrentValue(tClosestAnchor);
                }
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatorMutex2 mutatorMutex2, Function4 function4, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatorMutex2 = MutatorMutex2.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatorMutex2, function4, continuation);
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "T"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4", m3645f = "AnchoredDraggable.kt", m3646l = {574}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$4 */
    /* loaded from: classes4.dex */
    static final class C14614 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14614(AnchoredDraggableState<T> anchoredDraggableState, T t, Function4<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, Continuation<? super C14614> continuation) {
            super(1, continuation);
            this.this$0 = anchoredDraggableState;
            this.$targetValue = t;
            this.$block = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C14614(this.this$0, this.$targetValue, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C14614) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.setDragTarget(this.$targetValue);
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                Function0<Tuples2<? extends DraggableAnchors<T>, ? extends T>> function0 = new Function0<Tuples2<? extends DraggableAnchors<T>, ? extends T>>() { // from class: androidx.compose.material.AnchoredDraggableState.anchoredDrag.4.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Tuples2<DraggableAnchors<T>, T> invoke() {
                        return Tuples4.m3642to(anchoredDraggableState.getAnchors(), anchoredDraggableState.getTargetValue());
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
                this.label = 1;
                if (AnchoredDraggableKt.restartable(function0, anonymousClass2, this) == coroutine_suspended) {
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
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Landroidx/compose/material/DraggableAnchors;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4$2", m3645f = "AnchoredDraggable.kt", m3646l = {576}, m3647m = "invokeSuspend")
        /* renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends DraggableAnchors<T>, ? extends T>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function4<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$block = function4;
                this.this$0 = anchoredDraggableState;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Tuples2<? extends DraggableAnchors<T>, ? extends T> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    DraggableAnchors draggableAnchors = (DraggableAnchors) tuples2.component1();
                    Object objComponent2 = tuples2.component2();
                    Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> function4 = this.$block;
                    AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (function4.invoke(anchoredDragScope, draggableAnchors, objComponent2, this) == coroutine_suspended) {
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
    }

    public final float newOffsetForDelta$material_release(float delta) {
        return RangesKt.coerceIn((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + delta, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    public final float dispatchRawDelta(float delta) {
        float fNewOffsetForDelta$material_release = newOffsetForDelta$material_release(delta);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(fNewOffsetForDelta$material_release);
        return fNewOffsetForDelta$material_release - offset;
    }

    private final boolean trySnapTo(final T targetValue) {
        return this.dragMutex.tryMutate(new Function0<Unit>(this) { // from class: androidx.compose.material.AnchoredDraggableState.trySnapTo.1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                T t = targetValue;
                float fPositionOf = anchoredDraggableState.getAnchors().positionOf(t);
                if (!Float.isNaN(fPositionOf)) {
                    AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
                    anchoredDraggableState.setDragTarget(null);
                }
                anchoredDraggableState.setCurrentValue(t);
            }
        });
    }
}
