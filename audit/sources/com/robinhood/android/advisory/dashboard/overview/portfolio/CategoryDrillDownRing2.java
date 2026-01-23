package com.robinhood.android.advisory.dashboard.overview.portfolio;

import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.advisory.portfolio.AngleTools;
import com.robinhood.android.advisory.portfolio.SliceWindow;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CategoryDrillDownRing.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownRingKt$CategoryDrillDownRing$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class CategoryDrillDownRing2 implements PointerInputEventHandler {
    final /* synthetic */ float $adjustedMidpointAngle;
    final /* synthetic */ SnapshotState<Offset> $center$delegate;
    final /* synthetic */ Function1<Integer, Unit> $onSliceSelected;
    final /* synthetic */ List<SliceWindow> $sliceWindows;

    /* JADX WARN: Multi-variable type inference failed */
    CategoryDrillDownRing2(float f, List<SliceWindow> list, Function1<? super Integer, Unit> function1, SnapshotState<Offset> snapshotState) {
        this.$adjustedMidpointAngle = f;
        this.$sliceWindows = list;
        this.$onSliceSelected = function1;
        this.$center$delegate = snapshotState;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final float f = this.$adjustedMidpointAngle;
        final List<SliceWindow> list = this.$sliceWindows;
        final Function1<Integer, Unit> function1 = this.$onSliceSelected;
        final SnapshotState<Offset> snapshotState = this.$center$delegate;
        Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownRingKt$CategoryDrillDownRing$1$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CategoryDrillDownRing2.invoke$lambda$1(f, list, function1, snapshotState, (Offset) obj);
            }
        }, continuation, 7, null);
        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(float f, List list, Function1 function1, SnapshotState snapshotState, Offset offset) {
        float fM11140calculateTouchAngleAccordingToCanvas0a9Yr6o = (AngleTools.m11140calculateTouchAngleAccordingToCanvas0a9Yr6o(CategoryDrillDownRing.CategoryDrillDownRing$lambda$1(snapshotState), AngleTools.m11142findNormalizedPointFromTouch0a9Yr6o(offset.getPackedValue(), CategoryDrillDownRing.CategoryDrillDownRing$lambda$1(snapshotState))) + f) % 360.0f;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((SliceWindow) it.next()).contains(fM11140calculateTouchAngleAccordingToCanvas0a9Yr6o)) {
                break;
            }
            i++;
        }
        function1.invoke(Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
