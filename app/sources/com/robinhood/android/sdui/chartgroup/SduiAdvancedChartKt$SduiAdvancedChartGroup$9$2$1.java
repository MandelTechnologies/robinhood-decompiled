package com.robinhood.android.sdui.chartgroup;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Ranges3;

/* compiled from: SduiAdvancedChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
final class SduiAdvancedChartKt$SduiAdvancedChartGroup$9$2$1 implements PointerInputEventHandler {
    final /* synthetic */ SnapshotFloatState2 $edgeBounceOffset$delegate;
    final /* synthetic */ SnapshotState4<Rect> $globalChartRect$delegate;
    final /* synthetic */ SnapshotState<Offset> $globalScrubOffset$delegate;
    final /* synthetic */ Function0<Unit> $onXAxisZoomEnd;
    final /* synthetic */ Function1<Ranges3<Float>, Unit> $onXAxisZoomed;
    final /* synthetic */ SnapshotState<AdvancedChartGroupState2> $pointerInputState$delegate;
    final /* synthetic */ AdvancedChartGroupState $state;
    final /* synthetic */ SnapshotState<Ranges3<Float>> $xZoomRange$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    SduiAdvancedChartKt$SduiAdvancedChartGroup$9$2$1(AdvancedChartGroupState advancedChartGroupState, Function1<? super Ranges3<Float>, Unit> function1, SnapshotState<Offset> snapshotState, SnapshotState<AdvancedChartGroupState2> snapshotState2, SnapshotState4<Rect> snapshotState4, SnapshotState<Ranges3<Float>> snapshotState3, SnapshotFloatState2 snapshotFloatState2, Function0<Unit> function0) {
        this.$state = advancedChartGroupState;
        this.$onXAxisZoomed = function1;
        this.$globalScrubOffset$delegate = snapshotState;
        this.$pointerInputState$delegate = snapshotState2;
        this.$globalChartRect$delegate = snapshotState4;
        this.$xZoomRange$delegate = snapshotState3;
        this.$edgeBounceOffset$delegate = snapshotFloatState2;
        this.$onXAxisZoomEnd = function0;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final AdvancedChartGroupState advancedChartGroupState = this.$state;
        final Function1<Ranges3<Float>, Unit> function1 = this.$onXAxisZoomed;
        final SnapshotState<Offset> snapshotState = this.$globalScrubOffset$delegate;
        final SnapshotState<AdvancedChartGroupState2> snapshotState2 = this.$pointerInputState$delegate;
        final SnapshotState4<Rect> snapshotState4 = this.$globalChartRect$delegate;
        final SnapshotState<Ranges3<Float>> snapshotState3 = this.$xZoomRange$delegate;
        final SnapshotFloatState2 snapshotFloatState2 = this.$edgeBounceOffset$delegate;
        Function4 function4 = new Function4() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$9$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SduiAdvancedChartKt$SduiAdvancedChartGroup$9$2$1.invoke$lambda$0(advancedChartGroupState, function1, snapshotState, snapshotState2, snapshotState4, snapshotState3, snapshotFloatState2, (Offset) obj, (Offset) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue());
            }
        };
        final Function0<Unit> function0 = this.$onXAxisZoomEnd;
        final SnapshotState<AdvancedChartGroupState2> snapshotState5 = this.$pointerInputState$delegate;
        final SnapshotFloatState2 snapshotFloatState22 = this.$edgeBounceOffset$delegate;
        Object objDetectChartZoomGestures$default = SduiChartZoomGestureDetector.detectChartZoomGestures$default(pointerInputScope, false, function4, new Function0() { // from class: com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$SduiAdvancedChartGroup$9$2$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SduiAdvancedChartKt$SduiAdvancedChartGroup$9$2$1.invoke$lambda$1(function0, snapshotState5, snapshotFloatState22);
            }
        }, continuation, 1, null);
        return objDetectChartZoomGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectChartZoomGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(AdvancedChartGroupState advancedChartGroupState, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState4 snapshotState4, SnapshotState snapshotState3, SnapshotFloatState2 snapshotFloatState2, Offset offset, Offset offset2, float f, float f2) {
        if (SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$24(snapshotState) == null) {
            snapshotState2.setValue(AdvancedChartGroupState2.ZOOMING);
            Rect rectSduiAdvancedChartGroup$lambda$36 = SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$36(snapshotState4);
            if (rectSduiAdvancedChartGroup$lambda$36 != null) {
                XAxisZoomState xAxisZoomStateM18611mapGestureToXAxisZoomRangeAndBounceOffsetxrVmA = SduiChartZoomTransformer.m18611mapGestureToXAxisZoomRangeAndBounceOffsetxrVmA(offset.getPackedValue(), offset2.getPackedValue(), f, rectSduiAdvancedChartGroup$lambda$36.getRight() - rectSduiAdvancedChartGroup$lambda$36.getLeft(), SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$11(snapshotState3), snapshotFloatState2.getFloatValue(), advancedChartGroupState.getAxisConfig().getPrimaryChartMaxX(), advancedChartGroupState.getAxisConfig().getGapBetweenScrubbingLabels());
                snapshotState3.setValue(xAxisZoomStateM18611mapGestureToXAxisZoomRangeAndBounceOffsetxrVmA.getZoomRange());
                function1.invoke(SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$11(snapshotState3));
                snapshotFloatState2.setFloatValue(xAxisZoomStateM18611mapGestureToXAxisZoomRangeAndBounceOffsetxrVmA.getEdgeBounceOffset());
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Function0 function0, SnapshotState snapshotState, SnapshotFloatState2 snapshotFloatState2) {
        if (SduiAdvancedChartKt.SduiAdvancedChartGroup$lambda$18(snapshotState) == AdvancedChartGroupState2.ZOOMING) {
            snapshotFloatState2.setFloatValue(0.0f);
            function0.invoke();
        }
        snapshotState.setValue(AdvancedChartGroupState2.IDLE);
        return Unit.INSTANCE;
    }
}
