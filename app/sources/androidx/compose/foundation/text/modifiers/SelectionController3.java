package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.LongPressTextDragObserver2;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGestures2;
import androidx.compose.foundation.text.selection.SelectionGestures3;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrar2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: SelectionController.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¨\u0006\b"}, m3636d2 = {"makeSelectionModifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectableId", "", "layoutCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.text.modifiers.SelectionControllerKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class SelectionController3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier makeSelectionModifier(final SelectionRegistrar selectionRegistrar, final long j, final Function0<? extends LayoutCoordinates> function0) {
        LongPressTextDragObserver2 longPressTextDragObserver2 = new LongPressTextDragObserver2() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1
            private long dragTotalDistance;
            private long lastPosition;

            @Override // androidx.compose.foundation.text.LongPressTextDragObserver2
            /* renamed from: onDown-k-4lQ0M */
            public void mo5413onDownk4lQ0M(long point) {
            }

            @Override // androidx.compose.foundation.text.LongPressTextDragObserver2
            public void onUp() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                Offset.Companion companion = Offset.INSTANCE;
                this.lastPosition = companion.m6553getZeroF1C5BW0();
                this.dragTotalDistance = companion.m6553getZeroF1C5BW0();
            }

            @Override // androidx.compose.foundation.text.LongPressTextDragObserver2
            /* renamed from: onStart-k-4lQ0M */
            public void mo5415onStartk4lQ0M(long startPoint) {
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (!layoutCoordinatesInvoke.isAttached()) {
                        return;
                    }
                    selectionRegistrar2.m5521notifySelectionUpdateStartubNVwUQ(layoutCoordinatesInvoke, startPoint, SelectionAdjustment.INSTANCE.getWord(), true);
                    this.lastPosition = startPoint;
                }
                if (SelectionRegistrar2.hasSelection(selectionRegistrar, j)) {
                    this.dragTotalDistance = Offset.INSTANCE.m6553getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.LongPressTextDragObserver2
            /* renamed from: onDrag-k-4lQ0M */
            public void mo5414onDragk4lQ0M(long delta) {
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j2 = j;
                    if (layoutCoordinatesInvoke.isAttached() && SelectionRegistrar2.hasSelection(selectionRegistrar2, j2)) {
                        long jM6547plusMKHz9U = Offset.m6547plusMKHz9U(this.dragTotalDistance, delta);
                        this.dragTotalDistance = jM6547plusMKHz9U;
                        long jM6547plusMKHz9U2 = Offset.m6547plusMKHz9U(this.lastPosition, jM6547plusMKHz9U);
                        if (selectionRegistrar2.m5520notifySelectionUpdatenjBpvok(layoutCoordinatesInvoke, jM6547plusMKHz9U2, this.lastPosition, false, SelectionAdjustment.INSTANCE.getWord(), true)) {
                            this.lastPosition = jM6547plusMKHz9U2;
                            this.dragTotalDistance = Offset.INSTANCE.m6553getZeroF1C5BW0();
                        }
                    }
                }
            }

            @Override // androidx.compose.foundation.text.LongPressTextDragObserver2
            public void onStop() {
                if (SelectionRegistrar2.hasSelection(selectionRegistrar, j)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            @Override // androidx.compose.foundation.text.LongPressTextDragObserver2
            public void onCancel() {
                if (SelectionRegistrar2.hasSelection(selectionRegistrar, j)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }
        };
        return SelectionGestures3.selectionGestureInput(Modifier.INSTANCE, new SelectionGestures2() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1
            private long lastPosition = Offset.INSTANCE.m6553getZeroF1C5BW0();

            @Override // androidx.compose.foundation.text.selection.SelectionGestures2
            /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
            public boolean mo5502onExtendk4lQ0M(long downPosition) {
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!layoutCoordinatesInvoke.isAttached()) {
                    return false;
                }
                if (selectionRegistrar2.m5520notifySelectionUpdatenjBpvok(layoutCoordinatesInvoke, downPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.getNone(), false)) {
                    this.lastPosition = downPosition;
                }
                return SelectionRegistrar2.hasSelection(selectionRegistrar2, j2);
            }

            @Override // androidx.compose.foundation.text.selection.SelectionGestures2
            /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
            public boolean mo5503onExtendDragk4lQ0M(long dragPosition) {
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!layoutCoordinatesInvoke.isAttached() || !SelectionRegistrar2.hasSelection(selectionRegistrar2, j2)) {
                    return false;
                }
                if (!selectionRegistrar2.m5520notifySelectionUpdatenjBpvok(layoutCoordinatesInvoke, dragPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.getNone(), false)) {
                    return true;
                }
                this.lastPosition = dragPosition;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.SelectionGestures2
            /* renamed from: onStart-3MmeM6k, reason: not valid java name */
            public boolean mo5504onStart3MmeM6k(long downPosition, SelectionAdjustment adjustment) {
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!layoutCoordinatesInvoke.isAttached()) {
                    return false;
                }
                selectionRegistrar2.m5521notifySelectionUpdateStartubNVwUQ(layoutCoordinatesInvoke, downPosition, adjustment, false);
                this.lastPosition = downPosition;
                return SelectionRegistrar2.hasSelection(selectionRegistrar2, j2);
            }

            @Override // androidx.compose.foundation.text.selection.SelectionGestures2
            /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
            public boolean mo5501onDrag3MmeM6k(long dragPosition, SelectionAdjustment adjustment) {
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j2 = j;
                if (!layoutCoordinatesInvoke.isAttached() || !SelectionRegistrar2.hasSelection(selectionRegistrar2, j2)) {
                    return false;
                }
                if (!selectionRegistrar2.m5520notifySelectionUpdatenjBpvok(layoutCoordinatesInvoke, dragPosition, this.lastPosition, false, adjustment, false)) {
                    return true;
                }
                this.lastPosition = dragPosition;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.SelectionGestures2
            public void onDragDone() {
                selectionRegistrar.notifySelectionUpdateEnd();
            }
        }, longPressTextDragObserver2);
    }
}
