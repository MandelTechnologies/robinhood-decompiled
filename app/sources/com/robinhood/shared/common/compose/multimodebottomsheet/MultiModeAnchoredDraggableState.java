package com.robinhood.shared.common.compose.multimodebottomsheet;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.MutatorMutex2;
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
import com.robinhood.shared.common.compose.multimodebottomsheet.AnchoredDragScope;
import com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: MultiModeAnchoredDraggable.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 l*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001lB\u0098\u0001\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0005\u0012#\b\u0002\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0004\b\u0013\u0010\u0014B¨\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0005\u0012#\b\u0002\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0004\b\u0013\u0010\u0017J\u0006\u0010<\u001a\u00020\u0006J#\u0010O\u001a\u00020\u00122\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\b\b\u0002\u0010Q\u001a\u00028\u0000¢\u0006\u0002\u0010RJ\u0016\u0010S\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010UJ%\u0010V\u001a\u00028\u00002\u0006\u00105\u001a\u00020\u00062\u0006\u0010'\u001a\u00028\u00002\u0006\u0010T\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010WJ\u001d\u0010X\u001a\u00028\u00002\u0006\u00105\u001a\u00020\u00062\u0006\u0010'\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010YJ\\\u0010\\\u001a\u00020\u00122\b\b\u0002\u0010]\u001a\u00020^2B\u0010_\u001a>\b\u0001\u0012\u0004\u0012\u00020[\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120a\u0012\u0006\u0012\u0004\u0018\u00010\u00020`¢\u0006\u0002\bbH\u0086@¢\u0006\u0002\u0010cJy\u0010\\\u001a\u00020\u00122\u0006\u0010.\u001a\u00028\u00002\b\b\u0002\u0010]\u001a\u00020^2W\u0010_\u001aS\b\u0001\u0012\u0004\u0012\u00020[\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120a\u0012\u0006\u0012\u0004\u0018\u00010\u00020d¢\u0006\u0002\bbH\u0086@¢\u0006\u0002\u0010eJ\u0015\u0010f\u001a\u00020\u00062\u0006\u0010g\u001a\u00020\u0006H\u0000¢\u0006\u0002\bhJ\u000e\u0010i\u001a\u00020\u00062\u0006\u0010g\u001a\u00020\u0006J\u0015\u0010j\u001a\u00020\u00102\u0006\u0010.\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010kR/\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR/\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R/\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00120\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R+\u0010'\u001a\u00028\u00002\u0006\u0010&\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u0010.\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b/\u0010)R\u001b\u00102\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b3\u0010)R+\u00105\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0011\u0010=\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001b\u0010?\u001a\u00020\u00068GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u00101\u001a\u0004\b@\u00107R+\u0010B\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010;\u001a\u0004\bC\u00107\"\u0004\bD\u00109R/\u0010F\u001a\u0004\u0018\u00018\u00002\b\u0010&\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010-\u001a\u0004\bG\u0010)\"\u0004\bH\u0010+R7\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010-\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u000e\u0010Z\u001a\u00020[X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006m"}, m3636d2 = {"Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeAnchoredDraggableState;", "T", "", "initialValue", "positionalThreshold", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "velocityThreshold", "Lkotlin/Function0;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmValueChange", "newValue", "", "onValueChangeSettled", "", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "anchors", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;", "(Ljava/lang/Object;Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getPositionalThreshold$lib_compose_multi_mode_bottom_sheet_externalDebug", "()Lkotlin/jvm/functions/Function1;", "getVelocityThreshold$lib_compose_multi_mode_bottom_sheet_externalDebug", "()Lkotlin/jvm/functions/Function0;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getConfirmValueChange$lib_compose_multi_mode_bottom_sheet_externalDebug", "getOnValueChangeSettled$lib_compose_multi_mode_bottom_sheet_externalDebug", "dragMutex", "Landroidx/compose/foundation/MutatorMutex;", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$lib_compose_multi_mode_bottom_sheet_externalDebug", "()Landroidx/compose/foundation/gestures/DraggableState;", "<set-?>", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "targetValue", "getTargetValue", "targetValue$delegate", "Landroidx/compose/runtime/State;", "closestValue", "getClosestValue$lib_compose_multi_mode_bottom_sheet_externalDebug", "closestValue$delegate", "offset", "getOffset", "()F", "setOffset", "(F)V", "offset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "requireOffset", "isAnimationRunning", "()Z", "progress", "getProgress", "progress$delegate", "lastVelocity", "getLastVelocity", "setLastVelocity", "lastVelocity$delegate", "dragTarget", "getDragTarget", "setDragTarget", "dragTarget$delegate", "getAnchors", "()Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;", "setAnchors", "(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;)V", "anchors$delegate", "updateAnchors", "newAnchors", "newTarget", "(Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;Ljava/lang/Object;)V", "settle", "velocity", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeTarget", "(FLjava/lang/Object;F)Ljava/lang/Object;", "computeTargetWithoutThresholds", "(FLjava/lang/Object;)Ljava/lang/Object;", "anchoredDragScope", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/AnchoredDragScope;", "anchoredDrag", "dragPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function4;", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newOffsetForDelta", "delta", "newOffsetForDelta$lib_compose_multi_mode_bottom_sheet_externalDebug", "dispatchRawDelta", "trySnapTo", "(Ljava/lang/Object;)Z", "Companion", "lib-compose-multi-mode-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class MultiModeAnchoredDraggableState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AnchoredDragScope anchoredDragScope;

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    private final SnapshotState anchors;
    private final AnimationSpec<Float> animationSpec;

    /* renamed from: closestValue$delegate, reason: from kotlin metadata */
    private final SnapshotState4 closestValue;
    private final Function1<T, Boolean> confirmValueChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final SnapshotState currentValue;
    private final MutatorMutex dragMutex;

    /* renamed from: dragTarget$delegate, reason: from kotlin metadata */
    private final SnapshotState dragTarget;
    private final DraggableState draggableState;

    /* renamed from: lastVelocity$delegate, reason: from kotlin metadata */
    private final SnapshotFloatState2 lastVelocity;

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    private final SnapshotFloatState2 offset;
    private final Function1<T, Unit> onValueChangeSettled;
    private final Function1<Float, Float> positionalThreshold;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    private final SnapshotState4 progress;

    /* renamed from: targetValue$delegate, reason: from kotlin metadata */
    private final SnapshotState4 targetValue;
    private final Function0<Float> velocityThreshold;

    /* compiled from: MultiModeAnchoredDraggable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {534}, m3647m = "anchoredDrag")
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$anchoredDrag$1 */
    static final class C374191 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MultiModeAnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374191(MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState, Continuation<? super C374191> continuation) {
            super(continuation);
            this.this$0 = multiModeAnchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, this);
        }
    }

    /* compiled from: MultiModeAnchoredDraggable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {580}, m3647m = "anchoredDrag")
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$anchoredDrag$3 */
    static final class C374213 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MultiModeAnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374213(MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState, Continuation<? super C374213> continuation) {
            super(continuation);
            this.this$0 = multiModeAnchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, null, this);
        }
    }

    /* compiled from: MultiModeAnchoredDraggable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {448, 452}, m3647m = "settle")
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$settle$1 */
    static final class C374231 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MultiModeAnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C374231(MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState, Continuation<? super C374231> continuation) {
            super(continuation);
            this.this$0 = multiModeAnchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.settle(0.0f, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(Object obj) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MultiModeAnchoredDraggableState(T t, Function1<? super Float, Float> positionalThreshold, Function0<Float> velocityThreshold, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> confirmValueChange, Function1<? super T, Unit> onValueChangeSettled) {
        Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
        Intrinsics.checkNotNullParameter(velocityThreshold, "velocityThreshold");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        Intrinsics.checkNotNullParameter(onValueChangeSettled, "onValueChangeSettled");
        this.positionalThreshold = positionalThreshold;
        this.velocityThreshold = velocityThreshold;
        this.animationSpec = animationSpec;
        this.confirmValueChange = confirmValueChange;
        this.onValueChangeSettled = onValueChangeSettled;
        this.dragMutex = new MutatorMutex();
        this.draggableState = new MultiModeAnchoredDraggableState$draggableState$1(this);
        this.currentValue = SnapshotState3.mutableStateOf$default(t, null, 2, null);
        this.targetValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiModeAnchoredDraggableState.targetValue_delegate$lambda$5(this.f$0);
            }
        });
        this.closestValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiModeAnchoredDraggableState.closestValue_delegate$lambda$7(this.f$0);
            }
        });
        this.offset = SnapshotFloatState3.mutableFloatStateOf(Float.NaN);
        this.progress = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(MultiModeAnchoredDraggableState.progress_delegate$lambda$9(this.f$0));
            }
        });
        this.lastVelocity = SnapshotFloatState3.mutableFloatStateOf(0.0f);
        this.dragTarget = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.anchors = SnapshotState3.mutableStateOf$default(MultiModeAnchoredDraggableKt.emptyDraggableAnchors(), null, 2, null);
        this.anchoredDragScope = new AnchoredDragScope(this) { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$anchoredDragScope$1
            final /* synthetic */ MultiModeAnchoredDraggableState<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.robinhood.shared.common.compose.multimodebottomsheet.AnchoredDragScope
            public void dragTo(float newOffset, float lastKnownVelocity) {
                this.this$0.setOffset(newOffset);
                this.this$0.setLastVelocity(lastKnownVelocity);
            }
        };
    }

    /* renamed from: getPositionalThreshold$lib_compose_multi_mode_bottom_sheet_externalDebug */
    public final Function1<Float, Float> m2757x5eeff4e0() {
        return this.positionalThreshold;
    }

    /* renamed from: getVelocityThreshold$lib_compose_multi_mode_bottom_sheet_externalDebug */
    public final Function0<Float> m2758x18b04ff7() {
        return this.velocityThreshold;
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public /* synthetic */ MultiModeAnchoredDraggableState(Object obj, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12, Function1 function13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function1, function0, animationSpec, (i & 16) != 0 ? new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(MultiModeAnchoredDraggableState._init_$lambda$0(obj2));
            }
        } : function12, (i & 32) != 0 ? new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return MultiModeAnchoredDraggableState._init_$lambda$1(obj2);
            }
        } : function13);
    }

    /* renamed from: getConfirmValueChange$lib_compose_multi_mode_bottom_sheet_externalDebug */
    public final Function1<T, Boolean> m2754xd05a8e76() {
        return this.confirmValueChange;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(Object obj) {
        return Unit.INSTANCE;
    }

    /* renamed from: getOnValueChangeSettled$lib_compose_multi_mode_bottom_sheet_externalDebug */
    public final Function1<T, Unit> m2756xe0f88acc() {
        return this.onValueChangeSettled;
    }

    public /* synthetic */ MultiModeAnchoredDraggableState(Object obj, MultiModeDraggableAnchors multiModeDraggableAnchors, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12, Function1 function13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, multiModeDraggableAnchors, function1, function0, animationSpec, (i & 32) != 0 ? new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(MultiModeAnchoredDraggableState._init_$lambda$2(obj2));
            }
        } : function12, (i & 64) != 0 ? new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return MultiModeAnchoredDraggableState._init_$lambda$3(obj2);
            }
        } : function13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(Object obj) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiModeAnchoredDraggableState(T t, MultiModeDraggableAnchors<T> anchors, Function1<? super Float, Float> positionalThreshold, Function0<Float> velocityThreshold, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> confirmValueChange, Function1<? super T, Unit> onValueChangeSettled) {
        this(t, positionalThreshold, velocityThreshold, animationSpec, confirmValueChange, onValueChangeSettled);
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
        Intrinsics.checkNotNullParameter(velocityThreshold, "velocityThreshold");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        Intrinsics.checkNotNullParameter(onValueChangeSettled, "onValueChangeSettled");
        setAnchors(anchors);
        trySnapTo(t);
    }

    /* renamed from: getDraggableState$lib_compose_multi_mode_bottom_sheet_externalDebug, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    private final void setCurrentValue(T t) {
        this.currentValue.setValue(t);
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object targetValue_delegate$lambda$5(MultiModeAnchoredDraggableState multiModeAnchoredDraggableState) {
        Object dragTarget = multiModeAnchoredDraggableState.getDragTarget();
        if (dragTarget != null) {
            return dragTarget;
        }
        float offset = multiModeAnchoredDraggableState.getOffset();
        if (!Float.isNaN(offset)) {
            return multiModeAnchoredDraggableState.computeTarget(offset, multiModeAnchoredDraggableState.getCurrentValue(), 0.0f);
        }
        return multiModeAnchoredDraggableState.getCurrentValue();
    }

    /* renamed from: getClosestValue$lib_compose_multi_mode_bottom_sheet_externalDebug */
    public final T m2753x78b7b42d() {
        return (T) this.closestValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object closestValue_delegate$lambda$7(MultiModeAnchoredDraggableState multiModeAnchoredDraggableState) {
        Object dragTarget = multiModeAnchoredDraggableState.getDragTarget();
        if (dragTarget != null) {
            return dragTarget;
        }
        float offset = multiModeAnchoredDraggableState.getOffset();
        if (!Float.isNaN(offset)) {
            return multiModeAnchoredDraggableState.computeTargetWithoutThresholds(offset, multiModeAnchoredDraggableState.getCurrentValue());
        }
        return multiModeAnchoredDraggableState.getCurrentValue();
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

    public final float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float progress_delegate$lambda$9(MultiModeAnchoredDraggableState multiModeAnchoredDraggableState) {
        float fPositionOf = multiModeAnchoredDraggableState.getAnchors().positionOf(multiModeAnchoredDraggableState.getCurrentValue());
        float fPositionOf2 = multiModeAnchoredDraggableState.getAnchors().positionOf(multiModeAnchoredDraggableState.m2753x78b7b42d()) - fPositionOf;
        float fAbs = Math.abs(fPositionOf2);
        if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
            return 1.0f;
        }
        float fRequireOffset = (multiModeAnchoredDraggableState.requireOffset() - fPositionOf) / fPositionOf2;
        if (fRequireOffset < 1.0E-6f) {
            return 0.0f;
        }
        if (fRequireOffset > 0.999999f) {
            return 1.0f;
        }
        return fRequireOffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f) {
        this.lastVelocity.setFloatValue(f);
    }

    public final float getLastVelocity() {
        return this.lastVelocity.getFloatValue();
    }

    private final T getDragTarget() {
        return this.dragTarget.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragTarget(T t) {
        this.dragTarget.setValue(t);
    }

    private final void setAnchors(MultiModeDraggableAnchors<T> multiModeDraggableAnchors) {
        this.anchors.setValue(multiModeDraggableAnchors);
    }

    public final MultiModeDraggableAnchors<T> getAnchors() {
        return (MultiModeDraggableAnchors) this.anchors.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(MultiModeAnchoredDraggableState multiModeAnchoredDraggableState, MultiModeDraggableAnchors multiModeDraggableAnchors, Object obj, int i, Object obj2) {
        if ((i & 2) != 0 && (Float.isNaN(multiModeAnchoredDraggableState.getOffset()) || (obj = multiModeDraggableAnchors.closestAnchor(multiModeAnchoredDraggableState.getOffset())) == null)) {
            obj = multiModeAnchoredDraggableState.getTargetValue();
        }
        multiModeAnchoredDraggableState.updateAnchors(multiModeDraggableAnchors, obj);
    }

    public final void updateAnchors(MultiModeDraggableAnchors<T> newAnchors, T newTarget) {
        Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        if (Intrinsics.areEqual(getAnchors(), newAnchors)) {
            return;
        }
        setAnchors(newAnchors);
        if (trySnapTo(newTarget)) {
            return;
        }
        setDragTarget(newTarget);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object settle(float f, Continuation<? super Unit> continuation) {
        C374231 c374231;
        Object obj;
        Object obj2;
        if (continuation instanceof C374231) {
            c374231 = (C374231) continuation;
            int i = c374231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c374231.label = i - Integer.MIN_VALUE;
            } else {
                c374231 = new C374231(this, continuation);
            }
        }
        Object obj3 = c374231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c374231.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj3);
            T currentValue = getCurrentValue();
            T tComputeTarget = computeTarget(requireOffset(), currentValue, f);
            if (this.confirmValueChange.invoke(tComputeTarget).booleanValue()) {
                c374231.L$0 = tComputeTarget;
                c374231.label = 1;
                if (MultiModeAnchoredDraggableKt.animateTo(this, tComputeTarget, f, c374231) != coroutine_suspended) {
                    obj2 = tComputeTarget;
                    this.onValueChangeSettled.invoke(obj2);
                }
            } else {
                c374231.L$0 = currentValue;
                c374231.label = 2;
                if (MultiModeAnchoredDraggableKt.animateTo(this, currentValue, f, c374231) != coroutine_suspended) {
                    obj = currentValue;
                    this.onValueChangeSettled.invoke(obj);
                }
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            obj2 = c374231.L$0;
            ResultKt.throwOnFailure(obj3);
            this.onValueChangeSettled.invoke(obj2);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c374231.L$0;
            ResultKt.throwOnFailure(obj3);
            this.onValueChangeSettled.invoke(obj);
        }
        return Unit.INSTANCE;
    }

    private final T computeTarget(float offset, T currentValue, float velocity) {
        MultiModeDraggableAnchors<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(currentValue);
        float fFloatValue = this.velocityThreshold.invoke().floatValue();
        if (fPositionOf != offset && !Float.isNaN(fPositionOf)) {
            if (Math.abs(velocity) >= Math.abs(fFloatValue)) {
                T tClosestAnchor = anchors.closestAnchor(offset, offset - fPositionOf > 0.0f);
                Intrinsics.checkNotNull(tClosestAnchor);
                return tClosestAnchor;
            }
            T tClosestAnchor2 = anchors.closestAnchor(offset, offset - fPositionOf > 0.0f);
            Intrinsics.checkNotNull(tClosestAnchor2);
            if (Math.abs(fPositionOf - offset) > Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(fPositionOf - anchors.positionOf(tClosestAnchor2)))).floatValue())) {
                return tClosestAnchor2;
            }
        }
        return currentValue;
    }

    private final T computeTargetWithoutThresholds(float offset, T currentValue) {
        MultiModeDraggableAnchors<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(currentValue);
        if (fPositionOf != offset && !Float.isNaN(fPositionOf)) {
            T tClosestAnchor = anchors.closestAnchor(offset, offset - fPositionOf > 0.0f);
            if (tClosestAnchor != null) {
                return tClosestAnchor;
            }
        }
        return currentValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object anchoredDrag(MutatorMutex2 mutatorMutex2, Function3<? super AnchoredDragScope, ? super MultiModeDraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        C374191 c374191;
        T tClosestAnchor;
        if (continuation instanceof C374191) {
            c374191 = (C374191) continuation;
            int i = c374191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c374191.label = i - Integer.MIN_VALUE;
            } else {
                c374191 = new C374191(this, continuation);
            }
        }
        Object obj = c374191.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c374191.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                MutatorMutex mutatorMutex = this.dragMutex;
                C374202 c374202 = new C374202(this, function3, null);
                c374191.label = 1;
                if (mutatorMutex.mutate(mutatorMutex2, c374202, c374191) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (tClosestAnchor != null && Math.abs(getOffset() - getAnchors().positionOf(tClosestAnchor)) <= 0.5f && this.confirmValueChange.invoke(tClosestAnchor).booleanValue()) {
                setCurrentValue(tClosestAnchor);
            }
            return Unit.INSTANCE;
        } finally {
            tClosestAnchor = getAnchors().closestAnchor(getOffset());
            if (tClosestAnchor != null && Math.abs(getOffset() - getAnchors().positionOf(tClosestAnchor)) <= 0.5f && this.confirmValueChange.invoke(tClosestAnchor).booleanValue()) {
                setCurrentValue(tClosestAnchor);
            }
        }
    }

    public static /* synthetic */ Object anchoredDrag$default(MultiModeAnchoredDraggableState multiModeAnchoredDraggableState, MutatorMutex2 mutatorMutex2, Function3 function3, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatorMutex2 = MutatorMutex2.Default;
        }
        return multiModeAnchoredDraggableState.anchoredDrag(mutatorMutex2, function3, continuation);
    }

    /* compiled from: MultiModeAnchoredDraggable.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$anchoredDrag$2", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {535}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$anchoredDrag$2 */
    static final class C374202 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<AnchoredDragScope, MultiModeDraggableAnchors<T>, Continuation<? super Unit>, Object> $block;
        int label;
        final /* synthetic */ MultiModeAnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C374202(MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState, Function3<? super AnchoredDragScope, ? super MultiModeDraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C374202> continuation) {
            super(1, continuation);
            this.this$0 = multiModeAnchoredDraggableState;
            this.$block = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C374202(this.this$0, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C374202) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MultiModeAnchoredDraggable.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "T", "latestAnchors", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$anchoredDrag$2$2", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {536}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MultiModeDraggableAnchors<T>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<AnchoredDragScope, MultiModeDraggableAnchors<T>, Continuation<? super Unit>, Object> $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MultiModeAnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function3<? super AnchoredDragScope, ? super MultiModeDraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$block = function3;
                this.this$0 = multiModeAnchoredDraggableState;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MultiModeDraggableAnchors<T> multiModeDraggableAnchors, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(multiModeDraggableAnchors, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MultiModeDraggableAnchors<T> multiModeDraggableAnchors = (MultiModeDraggableAnchors) this.L$0;
                    Function3<AnchoredDragScope, MultiModeDraggableAnchors<T>, Continuation<? super Unit>, Object> function3 = this.$block;
                    AnchoredDragScope anchoredDragScope = ((MultiModeAnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (function3.invoke(anchoredDragScope, multiModeDraggableAnchors, this) == coroutine_suspended) {
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
                final MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState = this.this$0;
                Function0 function0 = new Function0() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$anchoredDrag$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return multiModeAnchoredDraggableState.getAnchors();
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
                this.label = 1;
                if (MultiModeAnchoredDraggableKt.restartable(function0, anonymousClass2, this) == coroutine_suspended) {
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
    public final Object anchoredDrag(T t, MutatorMutex2 mutatorMutex2, Function4<? super AnchoredDragScope, ? super MultiModeDraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, Continuation<? super Unit> continuation) {
        C374213 c374213;
        T tClosestAnchor;
        if (continuation instanceof C374213) {
            c374213 = (C374213) continuation;
            int i = c374213.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c374213.label = i - Integer.MIN_VALUE;
            } else {
                c374213 = new C374213(this, continuation);
            }
        }
        Object obj = c374213.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c374213.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (getAnchors().hasAnchorFor(t)) {
                    MutatorMutex mutatorMutex = this.dragMutex;
                    C374224 c374224 = new C374224(this, t, function4, null);
                    c374213.label = 1;
                    if (mutatorMutex.mutate(mutatorMutex2, c374224, c374213) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (tClosestAnchor != null && Math.abs(getOffset() - getAnchors().positionOf(tClosestAnchor)) <= 0.5f && this.confirmValueChange.invoke(tClosestAnchor).booleanValue()) {
                setCurrentValue(tClosestAnchor);
            }
            return Unit.INSTANCE;
        } finally {
            setDragTarget(null);
            tClosestAnchor = getAnchors().closestAnchor(getOffset());
            if (tClosestAnchor != null && Math.abs(getOffset() - getAnchors().positionOf(tClosestAnchor)) <= 0.5f && this.confirmValueChange.invoke(tClosestAnchor).booleanValue()) {
                setCurrentValue(tClosestAnchor);
            }
        }
    }

    public static /* synthetic */ Object anchoredDrag$default(MultiModeAnchoredDraggableState multiModeAnchoredDraggableState, Object obj, MutatorMutex2 mutatorMutex2, Function4 function4, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatorMutex2 = MutatorMutex2.Default;
        }
        return multiModeAnchoredDraggableState.anchoredDrag(obj, mutatorMutex2, function4, continuation);
    }

    /* compiled from: MultiModeAnchoredDraggable.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$anchoredDrag$4", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {582}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$anchoredDrag$4 */
    static final class C374224 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Function4<AnchoredDragScope, MultiModeDraggableAnchors<T>, T, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ MultiModeAnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C374224(MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState, T t, Function4<? super AnchoredDragScope, ? super MultiModeDraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, Continuation<? super C374224> continuation) {
            super(1, continuation);
            this.this$0 = multiModeAnchoredDraggableState;
            this.$targetValue = t;
            this.$block = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C374224(this.this$0, this.$targetValue, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C374224) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.setDragTarget(this.$targetValue);
                final MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState = this.this$0;
                Function0 function0 = new Function0() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$anchoredDrag$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MultiModeAnchoredDraggableState.C374224.invokeSuspend$lambda$0(multiModeAnchoredDraggableState);
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
                this.label = 1;
                if (MultiModeAnchoredDraggableKt.restartable(function0, anonymousClass2, this) == coroutine_suspended) {
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
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "T", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeDraggableAnchors;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$anchoredDrag$4$2", m3645f = "MultiModeAnchoredDraggable.kt", m3646l = {585}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends MultiModeDraggableAnchors<T>, ? extends T>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function4<AnchoredDragScope, MultiModeDraggableAnchors<T>, T, Continuation<? super Unit>, Object> $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MultiModeAnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function4<? super AnchoredDragScope, ? super MultiModeDraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, MultiModeAnchoredDraggableState<T> multiModeAnchoredDraggableState, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$block = function4;
                this.this$0 = multiModeAnchoredDraggableState;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Tuples2<? extends MultiModeDraggableAnchors<T>, ? extends T> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    MultiModeDraggableAnchors multiModeDraggableAnchors = (MultiModeDraggableAnchors) tuples2.component1();
                    Object objComponent2 = tuples2.component2();
                    Function4<AnchoredDragScope, MultiModeDraggableAnchors<T>, T, Continuation<? super Unit>, Object> function4 = this.$block;
                    AnchoredDragScope anchoredDragScope = ((MultiModeAnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (function4.invoke(anchoredDragScope, multiModeDraggableAnchors, objComponent2, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Tuples2 invokeSuspend$lambda$0(MultiModeAnchoredDraggableState multiModeAnchoredDraggableState) {
            return Tuples4.m3642to(multiModeAnchoredDraggableState.getAnchors(), multiModeAnchoredDraggableState.getTargetValue());
        }
    }

    /* renamed from: newOffsetForDelta$lib_compose_multi_mode_bottom_sheet_externalDebug */
    public final float m2759x45bc5a01(float delta) {
        return RangesKt.coerceIn((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + delta, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    public final float dispatchRawDelta(float delta) {
        float fM2759x45bc5a01 = m2759x45bc5a01(delta);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(fM2759x45bc5a01);
        return fM2759x45bc5a01 - offset;
    }

    private final boolean trySnapTo(T targetValue) {
        MutatorMutex mutatorMutex = this.dragMutex;
        boolean zTryLock = mutatorMutex.tryLock();
        if (!zTryLock) {
            return zTryLock;
        }
        try {
            AnchoredDragScope anchoredDragScope = this.anchoredDragScope;
            float fPositionOf = getAnchors().positionOf(targetValue);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.DefaultImpls.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
                setDragTarget(null);
            }
            setCurrentValue(targetValue);
            mutatorMutex.unlock();
            return zTryLock;
        } catch (Throwable th) {
            mutatorMutex.unlock();
            throw th;
        }
    }

    /* compiled from: MultiModeAnchoredDraggable.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0085\u0001\u0010\u0004\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\t0\b0\u0005\"\b\b\u0001\u0010\u0007*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00140\rH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeAnchoredDraggableState$Companion;", "", "<init>", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeAnchoredDraggableState;", "T", "Lkotlin/Pair;", "", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "positionalThreshold", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "distance", "velocityThreshold", "Lkotlin/Function0;", "confirmValueChange", "", "lib-compose-multi-mode-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean Saver$lambda$0(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return true;
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Saver Saver$default(Companion companion, AnimationSpec animationSpec, Function1 function1, Function0 function0, Function1 function12, int i, Object obj) {
            if ((i & 8) != 0) {
                function12 = new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(MultiModeAnchoredDraggableState.Companion.Saver$lambda$0(obj2));
                    }
                };
            }
            return companion.Saver(animationSpec, function1, function0, function12);
        }

        public final <T> Saver<MultiModeAnchoredDraggableState<T>, Tuples2<T, Float>> Saver(final AnimationSpec<Float> animationSpec, final Function1<? super Float, Float> positionalThreshold, final Function0<Float> velocityThreshold, final Function1<? super T, Boolean> confirmValueChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
            Intrinsics.checkNotNullParameter(velocityThreshold, "velocityThreshold");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            return Saver2.Saver(new Function2() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiModeAnchoredDraggableState.Companion.Saver$lambda$1((Saver5) obj, (MultiModeAnchoredDraggableState) obj2);
                }
            }, new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeAnchoredDraggableState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MultiModeAnchoredDraggableState.Companion.Saver$lambda$3(positionalThreshold, velocityThreshold, animationSpec, confirmValueChange, (Tuples2) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Tuples2 Saver$lambda$1(Saver5 Saver, MultiModeAnchoredDraggableState it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Tuples4.m3642to(it.getCurrentValue(), Float.valueOf(it.getOffset()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MultiModeAnchoredDraggableState Saver$lambda$3(Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12, Tuples2 tuples2) {
            Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
            Object objComponent1 = tuples2.component1();
            float fFloatValue = ((Number) tuples2.component2()).floatValue();
            MultiModeAnchoredDraggableState multiModeAnchoredDraggableState = new MultiModeAnchoredDraggableState(objComponent1, function1, function0, animationSpec, function12, null, 32, null);
            multiModeAnchoredDraggableState.setOffset(fFloatValue);
            return multiModeAnchoredDraggableState;
        }
    }
}
