package com.robinhood.android.advisory.portfolio;

import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.advisory.portfolio.PortfolioDonutChart7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: PortfolioDonutChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt$PortfolioDonutChart$2$1$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class PortfolioDonutChart2 implements PointerInputEventHandler {
    final /* synthetic */ SnapshotState<PortfolioDonutChart7> $lastSource$delegate;
    final /* synthetic */ SnapshotState<Offset> $userInputOffset$delegate;

    PortfolioDonutChart2(SnapshotState<Offset> snapshotState, SnapshotState<PortfolioDonutChart7> snapshotState2) {
        this.$userInputOffset$delegate = snapshotState;
        this.$lastSource$delegate = snapshotState2;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final SnapshotState<Offset> snapshotState = this.$userInputOffset$delegate;
        final SnapshotState<PortfolioDonutChart7> snapshotState2 = this.$lastSource$delegate;
        Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt$PortfolioDonutChart$2$1$1$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PortfolioDonutChart2.invoke$lambda$0(snapshotState, snapshotState2, (Offset) obj);
            }
        }, continuation, 7, null);
        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(SnapshotState snapshotState, SnapshotState snapshotState2, Offset offset) {
        PortfolioDonutChart.PortfolioDonutChart$lambda$14(snapshotState, offset.getPackedValue());
        snapshotState2.setValue(PortfolioDonutChart7.Tap.INSTANCE);
        return Unit.INSTANCE;
    }
}
