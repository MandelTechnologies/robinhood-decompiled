package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AllocationBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
final class AllocationBarKt$AllocationsIsometricBar$4$3$1$1 implements PointerInputEventHandler {
    final /* synthetic */ SnapshotState<Size> $canvasSize$delegate;
    final /* synthetic */ SnapshotState<List<Float>> $cubeWidths$delegate;
    final /* synthetic */ Function1<String, Unit> $onSectionSelected;
    final /* synthetic */ SnapshotState<List<Float>> $previousXPositions$delegate;
    final /* synthetic */ ImmutableList<AllocationSection> $sections;
    final /* synthetic */ String $selectedId;
    final /* synthetic */ SnapshotState<Integer> $selectedIndex$delegate;
    final /* synthetic */ SnapshotState<List<Float>> $targetXPositions$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    AllocationBarKt$AllocationsIsometricBar$4$3$1$1(ImmutableList<AllocationSection> immutableList, Function1<? super String, Unit> function1, String str, SnapshotState<List<Float>> snapshotState, SnapshotState<List<Float>> snapshotState2, SnapshotState<Integer> snapshotState3, SnapshotState<Size> snapshotState4, SnapshotState<List<Float>> snapshotState5) {
        this.$sections = immutableList;
        this.$onSectionSelected = function1;
        this.$selectedId = str;
        this.$targetXPositions$delegate = snapshotState;
        this.$cubeWidths$delegate = snapshotState2;
        this.$selectedIndex$delegate = snapshotState3;
        this.$canvasSize$delegate = snapshotState4;
        this.$previousXPositions$delegate = snapshotState5;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final ImmutableList<AllocationSection> immutableList = this.$sections;
        final Function1<String, Unit> function1 = this.$onSectionSelected;
        final String str = this.$selectedId;
        final SnapshotState<List<Float>> snapshotState = this.$targetXPositions$delegate;
        final SnapshotState<List<Float>> snapshotState2 = this.$cubeWidths$delegate;
        final SnapshotState<Integer> snapshotState3 = this.$selectedIndex$delegate;
        final SnapshotState<Size> snapshotState4 = this.$canvasSize$delegate;
        final SnapshotState<List<Float>> snapshotState5 = this.$previousXPositions$delegate;
        Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$AllocationsIsometricBar$4$3$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AllocationBarKt$AllocationsIsometricBar$4$3$1$1.invoke$lambda$0(immutableList, function1, str, snapshotState, snapshotState2, snapshotState3, snapshotState4, snapshotState5, (Offset) obj);
            }
        }, continuation, 7, null);
        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invoke$lambda$0(ImmutableList immutableList, Function1 function1, String str, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4, SnapshotState snapshotState5, Offset offset) {
        Integer numAllocationsIsometricBar_wC_cr3g$findSectionIndex = AllocationBarKt.AllocationsIsometricBar_wC_cr3g$findSectionIndex(snapshotState, snapshotState2, offset.getPackedValue());
        if (numAllocationsIsometricBar_wC_cr3g$findSectionIndex != null) {
            if (numAllocationsIsometricBar_wC_cr3g$findSectionIndex.intValue() != -1 && !Intrinsics.areEqual(numAllocationsIsometricBar_wC_cr3g$findSectionIndex, AllocationBarKt.AllocationsIsometricBar_wC_cr3g$lambda$29(snapshotState3))) {
                String id = ((AllocationSection) immutableList.get(numAllocationsIsometricBar_wC_cr3g$findSectionIndex.intValue())).getId();
                function1.invoke(Intrinsics.areEqual(id, str) ? null : id);
                snapshotState3.setValue(numAllocationsIsometricBar_wC_cr3g$findSectionIndex);
                AllocationBarKt.AllocationsIsometricBar_wC_cr3g$updateTargetPositions(snapshotState4, snapshotState2, snapshotState3, snapshotState, snapshotState5);
            } else {
                function1.invoke(null);
                snapshotState3.setValue(null);
                AllocationBarKt.AllocationsIsometricBar_wC_cr3g$updateTargetPositions(snapshotState4, snapshotState2, snapshotState3, snapshotState, snapshotState5);
            }
        }
        return Unit.INSTANCE;
    }
}
