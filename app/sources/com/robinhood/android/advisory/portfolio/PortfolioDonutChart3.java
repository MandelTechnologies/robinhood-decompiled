package com.robinhood.android.advisory.portfolio;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.advisory.portfolio.PortfolioDonutChart7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PortfolioDonutChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt$PortfolioDonutChart$2$1$1$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class PortfolioDonutChart3 implements PointerInputEventHandler {
    final /* synthetic */ SnapshotState<Boolean> $isActivelyDragging$delegate;
    final /* synthetic */ SnapshotState<PortfolioDonutChart7> $lastSource$delegate;
    final /* synthetic */ SnapshotState<Offset> $userInputOffset$delegate;

    PortfolioDonutChart3(SnapshotState<Offset> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<PortfolioDonutChart7> snapshotState3) {
        this.$userInputOffset$delegate = snapshotState;
        this.$isActivelyDragging$delegate = snapshotState2;
        this.$lastSource$delegate = snapshotState3;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final SnapshotState<Offset> snapshotState = this.$userInputOffset$delegate;
        final SnapshotState<Boolean> snapshotState2 = this.$isActivelyDragging$delegate;
        final SnapshotState<PortfolioDonutChart7> snapshotState3 = this.$lastSource$delegate;
        Function1 function1 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt$PortfolioDonutChart$2$1$1$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PortfolioDonutChart3.invoke$lambda$0(snapshotState, snapshotState2, snapshotState3, (Offset) obj);
            }
        };
        final SnapshotState<Offset> snapshotState4 = this.$userInputOffset$delegate;
        final SnapshotState<PortfolioDonutChart7> snapshotState5 = this.$lastSource$delegate;
        final SnapshotState<Boolean> snapshotState6 = this.$isActivelyDragging$delegate;
        Function0 function0 = new Function0() { // from class: com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt$PortfolioDonutChart$2$1$1$2$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PortfolioDonutChart3.invoke$lambda$1(snapshotState4, snapshotState5, snapshotState6);
            }
        };
        final SnapshotState<Offset> snapshotState7 = this.$userInputOffset$delegate;
        final SnapshotState<PortfolioDonutChart7> snapshotState8 = this.$lastSource$delegate;
        Function0 function02 = new Function0() { // from class: com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt$PortfolioDonutChart$2$1$1$2$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PortfolioDonutChart3.invoke$lambda$2(snapshotState7, snapshotState8);
            }
        };
        final SnapshotState<Offset> snapshotState9 = this.$userInputOffset$delegate;
        final SnapshotState<PortfolioDonutChart7> snapshotState10 = this.$lastSource$delegate;
        Object objDetectDragGesturesAfterLongPress = DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, function1, function0, function02, new Function2() { // from class: com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt$PortfolioDonutChart$2$1$1$2$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PortfolioDonutChart3.invoke$lambda$3(snapshotState9, snapshotState10, (PointerInputChange) obj, (Offset) obj2);
            }
        }, continuation);
        return objDetectDragGesturesAfterLongPress == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDragGesturesAfterLongPress : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, Offset offset) {
        PortfolioDonutChart.PortfolioDonutChart$lambda$14(snapshotState, offset.getPackedValue());
        PortfolioDonutChart.PortfolioDonutChart$lambda$17(snapshotState2, true);
        snapshotState3.setValue(PortfolioDonutChart7.Drag.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(SnapshotState snapshotState, SnapshotState snapshotState2) {
        snapshotState2.setValue(new PortfolioDonutChart7.DragRelease(PortfolioDonutChart.PortfolioDonutChart$lambda$13(snapshotState), null));
        PortfolioDonutChart.PortfolioDonutChart$lambda$14(snapshotState, Offset.INSTANCE.m6552getUnspecifiedF1C5BW0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3) {
        snapshotState2.setValue(new PortfolioDonutChart7.DragRelease(PortfolioDonutChart.PortfolioDonutChart$lambda$13(snapshotState), null));
        PortfolioDonutChart.PortfolioDonutChart$lambda$17(snapshotState3, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(SnapshotState snapshotState, SnapshotState snapshotState2, PointerInputChange change, Offset offset) {
        Intrinsics.checkNotNullParameter(change, "change");
        change.consume();
        if ((PortfolioDonutChart.PortfolioDonutChart$lambda$13(snapshotState) & 9223372034707292159L) != 9205357640488583168L) {
            PortfolioDonutChart.PortfolioDonutChart$lambda$14(snapshotState, Offset.m6547plusMKHz9U(PortfolioDonutChart.PortfolioDonutChart$lambda$13(snapshotState), offset.getPackedValue()));
            snapshotState2.setValue(PortfolioDonutChart7.Drag.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
