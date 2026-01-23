package com.robinhood.android.options.p208ui.chart;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionHistoricalChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
final class OptionHistoricalChartKt$OptionHistoricalChart$1$13$1 implements Function1<List<? extends Point>, Unit> {
    final /* synthetic */ SnapshotState<Point> $selectedPoint$delegate;

    OptionHistoricalChartKt$OptionHistoricalChart$1$13$1(SnapshotState<Point> snapshotState) {
        this.$selectedPoint$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Point> list) {
        invoke2((List<Point>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<Point> point) {
        Intrinsics.checkNotNullParameter(point, "point");
        this.$selectedPoint$delegate.setValue((Point) CollectionsKt.lastOrNull((List) point));
    }
}
