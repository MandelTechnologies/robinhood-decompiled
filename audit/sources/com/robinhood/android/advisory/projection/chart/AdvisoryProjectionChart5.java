package com.robinhood.android.advisory.projection.chart;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotIntState2;
import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.AdvisoryFutureReturnScrubBarContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisoryProjectionChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$5$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryProjectionChart5 implements PointerInputEventHandler {
    final /* synthetic */ SnapshotIntState2 $chartWidthPx$delegate;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ float $gapBetweenBars;
    final /* synthetic */ float $leftPaddingPx;
    final /* synthetic */ int $numYears;
    final /* synthetic */ SnapshotIntState2 $selectedYear$delegate;

    AdvisoryProjectionChart5(float f, int i, float f2, EventLogger eventLogger, SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22) {
        this.$leftPaddingPx = f;
        this.$numYears = i;
        this.$gapBetweenBars = f2;
        this.$eventLogger = eventLogger;
        this.$chartWidthPx$delegate = snapshotIntState2;
        this.$selectedYear$delegate = snapshotIntState22;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final float f = this.$leftPaddingPx;
        final int i = this.$numYears;
        final float f2 = this.$gapBetweenBars;
        final EventLogger eventLogger = this.$eventLogger;
        final SnapshotIntState2 snapshotIntState2 = this.$chartWidthPx$delegate;
        final SnapshotIntState2 snapshotIntState22 = this.$selectedYear$delegate;
        Object objDetectDragGestures$default = DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, null, null, new Function2() { // from class: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$5$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AdvisoryProjectionChart5.invoke$lambda$0(f, i, pointerInputScope, f2, eventLogger, snapshotIntState2, snapshotIntState22, (PointerInputChange) obj, (Offset) obj2);
            }
        }, continuation, 7, null);
        return objDetectDragGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDragGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(float f, int i, PointerInputScope pointerInputScope, float f2, EventLogger eventLogger, SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22, PointerInputChange change, Offset offset) {
        Intrinsics.checkNotNullParameter(change, "change");
        int selectedYear = ChartUtils.getSelectedYear(Float.intBitsToFloat((int) (change.getPosition() >> 32)) - f, i, snapshotIntState2.getIntValue(), pointerInputScope.mo5016toPx0680j_4(f2));
        if (selectedYear != snapshotIntState22.getIntValue()) {
            snapshotIntState22.setIntValue(selectedYear);
            EventLogger.DefaultImpls.logDrag$default(eventLogger, UserInteractionEventData.Action.DONE, new Screen(Screen.Name.ADVISORY_FUTURE_RETURNS, null, null, null, 14, null), new Component(Component.ComponentType.SCRUB_BAR, "future_returns_scrub_bar", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AdvisoryFutureReturnScrubBarContext(snapshotIntState22.getIntValue(), null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -262145, 16383, null), false, 40, null);
        }
        change.consume();
        return Unit.INSTANCE;
    }
}
