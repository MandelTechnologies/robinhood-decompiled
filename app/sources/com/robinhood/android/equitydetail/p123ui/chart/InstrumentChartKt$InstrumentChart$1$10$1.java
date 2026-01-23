package com.robinhood.android.equitydetail.p123ui.chart;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.models.serverdriven.experimental.api.Point;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: InstrumentChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
final class InstrumentChartKt$InstrumentChart$1$10$1 implements Function0<Unit> {
    final /* synthetic */ SnapshotState<Point> $selectedPoint$delegate;

    InstrumentChartKt$InstrumentChart$1$10$1(SnapshotState<Point> snapshotState) {
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
