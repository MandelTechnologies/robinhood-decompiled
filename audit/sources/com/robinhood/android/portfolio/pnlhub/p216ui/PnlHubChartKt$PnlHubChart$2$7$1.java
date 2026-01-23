package com.robinhood.android.portfolio.pnlhub.p216ui;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.charts.model.Point;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: PnlHubChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
final class PnlHubChartKt$PnlHubChart$2$7$1 implements Function0<Unit> {
    final /* synthetic */ SnapshotState<Point> $selectedPoint$delegate;

    PnlHubChartKt$PnlHubChart$2$7$1(SnapshotState<Point> snapshotState) {
        this.$selectedPoint$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$selectedPoint$delegate.setValue(null);
    }
}
