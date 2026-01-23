package com.robinhood.android.indexes.detail.components.chart;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexHistoricalChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
final class IndexHistoricalChartKt$IndexHistoricalChart$2$8$1 implements Function1<List<? extends Point>, Unit> {
    final /* synthetic */ SnapshotState<Point> $selectedPoint$delegate;

    IndexHistoricalChartKt$IndexHistoricalChart$2$8$1(SnapshotState<Point> snapshotState) {
        this.$selectedPoint$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Point> list) {
        invoke2((List<Point>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<Point> points) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.$selectedPoint$delegate.setValue((Point) CollectionsKt.lastOrNull((List) points));
    }
}
