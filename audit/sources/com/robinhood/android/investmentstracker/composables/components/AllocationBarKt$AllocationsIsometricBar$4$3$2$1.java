package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AllocationBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
final class AllocationBarKt$AllocationsIsometricBar$4$3$2$1 implements PointerInputEventHandler {
    final /* synthetic */ SnapshotState<Size> $canvasSize$delegate;
    final /* synthetic */ SnapshotState<List<Float>> $cubeWidths$delegate;
    final /* synthetic */ SnapshotFloatState2 $endingSwipeX$delegate;
    final /* synthetic */ Function1<String, Unit> $onSectionSelected;
    final /* synthetic */ SnapshotState<List<Float>> $previousXPositions$delegate;
    final /* synthetic */ ImmutableList<AllocationSection> $sections;
    final /* synthetic */ SnapshotState<Integer> $selectedIndex$delegate;
    final /* synthetic */ SnapshotFloatState2 $startSwipeX$delegate;
    final /* synthetic */ SnapshotLongState2 $swipeStartTime$delegate;
    final /* synthetic */ SnapshotState<List<Float>> $targetXPositions$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    AllocationBarKt$AllocationsIsometricBar$4$3$2$1(SnapshotLongState2 snapshotLongState2, SnapshotFloatState2 snapshotFloatState2, SnapshotState<Integer> snapshotState, Function1<? super String, Unit> function1, ImmutableList<AllocationSection> immutableList, SnapshotFloatState2 snapshotFloatState22, SnapshotState<List<Float>> snapshotState2, SnapshotState<Size> snapshotState3, SnapshotState<List<Float>> snapshotState4, SnapshotState<List<Float>> snapshotState5) {
        this.$swipeStartTime$delegate = snapshotLongState2;
        this.$startSwipeX$delegate = snapshotFloatState2;
        this.$selectedIndex$delegate = snapshotState;
        this.$onSectionSelected = function1;
        this.$sections = immutableList;
        this.$endingSwipeX$delegate = snapshotFloatState22;
        this.$cubeWidths$delegate = snapshotState2;
        this.$canvasSize$delegate = snapshotState3;
        this.$targetXPositions$delegate = snapshotState4;
        this.$previousXPositions$delegate = snapshotState5;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final SnapshotLongState2 snapshotLongState2 = this.$swipeStartTime$delegate;
        final SnapshotFloatState2 snapshotFloatState2 = this.$startSwipeX$delegate;
        Function1 function1 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$AllocationsIsometricBar$4$3$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AllocationBarKt$AllocationsIsometricBar$4$3$2$1.invoke$lambda$0(snapshotLongState2, snapshotFloatState2, (Offset) obj);
            }
        };
        final SnapshotLongState2 snapshotLongState22 = this.$swipeStartTime$delegate;
        final SnapshotState<Integer> snapshotState = this.$selectedIndex$delegate;
        final Function1<String, Unit> function12 = this.$onSectionSelected;
        final ImmutableList<AllocationSection> immutableList = this.$sections;
        final SnapshotFloatState2 snapshotFloatState22 = this.$endingSwipeX$delegate;
        final SnapshotFloatState2 snapshotFloatState23 = this.$startSwipeX$delegate;
        final SnapshotState<List<Float>> snapshotState2 = this.$cubeWidths$delegate;
        final SnapshotState<Size> snapshotState3 = this.$canvasSize$delegate;
        final SnapshotState<List<Float>> snapshotState4 = this.$targetXPositions$delegate;
        final SnapshotState<List<Float>> snapshotState5 = this.$previousXPositions$delegate;
        Function0 function0 = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$AllocationsIsometricBar$4$3$2$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AllocationBarKt$AllocationsIsometricBar$4$3$2$1.invoke$lambda$2(snapshotLongState22, snapshotState, function12, immutableList, snapshotFloatState22, snapshotFloatState23, snapshotState2, snapshotState3, snapshotState4, snapshotState5);
            }
        };
        final SnapshotFloatState2 snapshotFloatState24 = this.$endingSwipeX$delegate;
        Object objDetectHorizontalDragGestures$default = DragGestureDetectorKt.detectHorizontalDragGestures$default(pointerInputScope, function1, function0, null, new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$AllocationsIsometricBar$4$3$2$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AllocationBarKt$AllocationsIsometricBar$4$3$2$1.invoke$lambda$3(snapshotFloatState24, (PointerInputChange) obj, ((Float) obj2).floatValue());
            }
        }, continuation, 4, null);
        return objDetectHorizontalDragGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectHorizontalDragGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(SnapshotLongState2 snapshotLongState2, SnapshotFloatState2 snapshotFloatState2, Offset offset) {
        snapshotLongState2.setLongValue(System.currentTimeMillis());
        snapshotFloatState2.setFloatValue(Float.intBitsToFloat((int) (offset.getPackedValue() >> 32)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invoke$lambda$2(SnapshotLongState2 snapshotLongState2, SnapshotState snapshotState, Function1 function1, ImmutableList immutableList, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4, SnapshotState snapshotState5) {
        Integer numAllocationsIsometricBar_wC_cr3g$lambda$29;
        int i;
        if (System.currentTimeMillis() - snapshotLongState2.getLongValue() < 300 && (numAllocationsIsometricBar_wC_cr3g$lambda$29 = AllocationBarKt.AllocationsIsometricBar_wC_cr3g$lambda$29(snapshotState)) != null) {
            int iIntValue = numAllocationsIsometricBar_wC_cr3g$lambda$29.intValue();
            if (snapshotFloatState2.getFloatValue() <= snapshotFloatState22.getFloatValue() ? (i = iIntValue + 1) < AllocationBarKt.AllocationsIsometricBar_wC_cr3g$lambda$23(snapshotState2).size() : iIntValue - 1 >= 0) {
                iIntValue = i;
            }
            function1.invoke(((AllocationSection) immutableList.get(iIntValue)).getId());
            snapshotState.setValue(Integer.valueOf(iIntValue));
            AllocationBarKt.AllocationsIsometricBar_wC_cr3g$updateTargetPositions(snapshotState3, snapshotState2, snapshotState, snapshotState4, snapshotState5);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(SnapshotFloatState2 snapshotFloatState2, PointerInputChange change, float f) {
        Intrinsics.checkNotNullParameter(change, "change");
        snapshotFloatState2.setFloatValue(Float.intBitsToFloat((int) (change.getPosition() >> 32)));
        return Unit.INSTANCE;
    }
}
