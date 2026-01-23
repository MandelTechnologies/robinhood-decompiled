package com.robinhood.android.feature.livetrivia.composable;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: SpinningCoinGridComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinGridComposable$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class SpinningCoinGridComposable4 implements PointerInputEventHandler {
    final /* synthetic */ int $columns;
    final /* synthetic */ SnapshotState<Boolean> $isDragging;
    final /* synthetic */ int $rows;
    final /* synthetic */ SnapshotState<SpinningCoinGridComposable> $spinDirection;
    final /* synthetic */ SnapshotState<Tuples2<Integer, Integer>> $touchedCircle;

    SpinningCoinGridComposable4(SnapshotState<Boolean> snapshotState, int i, int i2, SnapshotState<Tuples2<Integer, Integer>> snapshotState2, SnapshotState<SpinningCoinGridComposable> snapshotState3) {
        this.$isDragging = snapshotState;
        this.$columns = i;
        this.$rows = i2;
        this.$touchedCircle = snapshotState2;
        this.$spinDirection = snapshotState3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(PointerInputScope pointerInputScope, int i, int i2, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, PointerInputChange change, Offset offset) {
        Intrinsics.checkNotNullParameter(change, "change");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (offset.getPackedValue() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (offset.getPackedValue() & 4294967295L));
        Tuples2 tuples2M3642to = Tuples4.m3642to(Integer.valueOf(RangesKt.coerceIn((int) (Float.intBitsToFloat((int) (change.getPosition() & 4294967295L)) / (((int) (pointerInputScope.getBoundsSize() & 4294967295L)) / i2)), 0, i2 - 1)), Integer.valueOf(RangesKt.coerceIn((int) (Float.intBitsToFloat((int) (change.getPosition() >> 32)) / (((int) (pointerInputScope.getBoundsSize() >> 32)) / i)), 0, i - 1)));
        snapshotState.setValue(Boolean.TRUE);
        snapshotState2.setValue(tuples2M3642to);
        snapshotState3.setValue(Math.abs(fIntBitsToFloat) > Math.abs(fIntBitsToFloat2) ? SpinningCoinGridComposable.HORIZONTAL : SpinningCoinGridComposable.VERTICAL);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final SnapshotState<Boolean> snapshotState = this.$isDragging;
        Function0 function0 = new Function0() { // from class: com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinGridComposable$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpinningCoinGridComposable4.invoke$lambda$0(snapshotState);
            }
        };
        final int i = this.$columns;
        final int i2 = this.$rows;
        final SnapshotState<Boolean> snapshotState2 = this.$isDragging;
        final SnapshotState<Tuples2<Integer, Integer>> snapshotState3 = this.$touchedCircle;
        final SnapshotState<SpinningCoinGridComposable> snapshotState4 = this.$spinDirection;
        Object objDetectDragGestures$default = DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, function0, null, new Function2() { // from class: com.robinhood.android.feature.livetrivia.composable.SpinningCoinGridComposableKt$SpinningCoinGridComposable$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SpinningCoinGridComposable4.invoke$lambda$1(pointerInputScope, i, i2, snapshotState2, snapshotState3, snapshotState4, (PointerInputChange) obj, (Offset) obj2);
            }
        }, continuation, 5, null);
        return objDetectDragGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDragGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(SnapshotState snapshotState) {
        snapshotState.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
