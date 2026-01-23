package com.robinhood.android.indexes.detail.components.chart;

import com.robinhood.android.charts.model.Point;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiChartMappers.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartKt$IndexHistoricalChart$lambda$29$$inlined$SduiSegmentedLineChart$1 */
/* loaded from: classes10.dex */
public final class C18831xee38b87e implements Function1<Point, Unit> {
    public static final C18831xee38b87e INSTANCE = new C18831xee38b87e();

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Point it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Point point) {
        invoke2(point);
        return Unit.INSTANCE;
    }
}
