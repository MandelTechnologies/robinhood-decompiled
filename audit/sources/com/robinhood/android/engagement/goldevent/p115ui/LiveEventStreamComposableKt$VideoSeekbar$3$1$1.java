package com.robinhood.android.engagement.goldevent.p115ui;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotFloatState2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges3;
import kotlin.ranges.RangesKt;
import timber.log.Timber;

/* compiled from: LiveEventStreamComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class LiveEventStreamComposableKt$VideoSeekbar$3$1$1 implements PointerInputEventHandler {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ HapticFeedback $haptic;
    final /* synthetic */ Function1<Long, Unit> $onSeekEnded;
    final /* synthetic */ Function0<Unit> $onSeekStarted;
    final /* synthetic */ SnapshotFloatState2 $seekPosition$delegate;
    final /* synthetic */ PrimitiveRanges3 $seekRange;
    final /* synthetic */ SnapshotFloatState2 $seekStartPosition$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    LiveEventStreamComposableKt$VideoSeekbar$3$1$1(boolean z, HapticFeedback hapticFeedback, Function0<Unit> function0, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, PrimitiveRanges3 primitiveRanges3, Function1<? super Long, Unit> function1) {
        this.$enabled = z;
        this.$haptic = hapticFeedback;
        this.$onSeekStarted = function0;
        this.$seekPosition$delegate = snapshotFloatState2;
        this.$seekStartPosition$delegate = snapshotFloatState22;
        this.$seekRange = primitiveRanges3;
        this.$onSeekEnded = function1;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        if (!this.$enabled) {
            return Unit.INSTANCE;
        }
        final HapticFeedback hapticFeedback = this.$haptic;
        final Function0<Unit> function0 = this.$onSeekStarted;
        final SnapshotFloatState2 snapshotFloatState2 = this.$seekPosition$delegate;
        final SnapshotFloatState2 snapshotFloatState22 = this.$seekStartPosition$delegate;
        Function1 function1 = new Function1() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoSeekbar$3$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveEventStreamComposableKt$VideoSeekbar$3$1$1.invoke$lambda$0(hapticFeedback, function0, pointerInputScope, snapshotFloatState2, snapshotFloatState22, (Offset) obj);
            }
        };
        final PrimitiveRanges3 primitiveRanges3 = this.$seekRange;
        final Function1<Long, Unit> function12 = this.$onSeekEnded;
        final SnapshotFloatState2 snapshotFloatState23 = this.$seekPosition$delegate;
        Function0 function02 = new Function0() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoSeekbar$3$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveEventStreamComposableKt$VideoSeekbar$3$1$1.invoke$lambda$1(primitiveRanges3, function12, snapshotFloatState23);
            }
        };
        final SnapshotFloatState2 snapshotFloatState24 = this.$seekPosition$delegate;
        Object objDetectHorizontalDragGestures$default = DragGestureDetectorKt.detectHorizontalDragGestures$default(pointerInputScope, function1, function02, null, new Function2() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoSeekbar$3$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LiveEventStreamComposableKt$VideoSeekbar$3$1$1.invoke$lambda$2(pointerInputScope, snapshotFloatState24, (PointerInputChange) obj, ((Float) obj2).floatValue());
            }
        }, continuation, 4, null);
        return objDetectHorizontalDragGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectHorizontalDragGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(HapticFeedback hapticFeedback, Function0 function0, PointerInputScope pointerInputScope, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, Offset offset) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        snapshotFloatState22.setFloatValue(snapshotFloatState2.getFloatValue());
        function0.invoke();
        snapshotFloatState2.setFloatValue(RangesKt.coerceIn(Float.intBitsToFloat((int) (offset.getPackedValue() >> 32)) / ((int) (pointerInputScope.getBoundsSize() >> 32)), 0.0f, 1.0f));
        Timber.INSTANCE.mo3350d("Drag start: offset=" + offset + ", seekPosition=" + snapshotFloatState2.getFloatValue(), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(PrimitiveRanges3 primitiveRanges3, Function1 function1, SnapshotFloatState2 snapshotFloatState2) {
        long first = primitiveRanges3.getFirst() + ((long) ((primitiveRanges3.getLast() - primitiveRanges3.getFirst()) * snapshotFloatState2.getFloatValue()));
        Timber.INSTANCE.mo3350d("Drag end: newPosition=" + first, new Object[0]);
        function1.invoke(Long.valueOf(first));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(PointerInputScope pointerInputScope, SnapshotFloatState2 snapshotFloatState2, PointerInputChange change, float f) {
        Intrinsics.checkNotNullParameter(change, "change");
        int boundsSize = (int) (pointerInputScope.getBoundsSize() >> 32);
        change.consume();
        float f2 = boundsSize;
        snapshotFloatState2.setFloatValue(RangesKt.coerceIn(((snapshotFloatState2.getFloatValue() * f2) + f) / f2, 0.0f, 1.0f));
        Timber.INSTANCE.mo3350d("Drag onDrag: width=" + ((int) (pointerInputScope.getBoundsSize() >> 32)) + " seekPosition=" + snapshotFloatState2.getFloatValue(), new Object[0]);
        return Unit.INSTANCE;
    }
}
