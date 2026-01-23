package com.robinhood.android.indexes.detail.components.chart;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.indexes.detail.IndexDetailPageLoggings;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexHistoricalChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
final class IndexHistoricalChartKt$IndexHistoricalChart$2$17$1 implements Function1<DisplaySpan, Unit> {
    final /* synthetic */ IndexHistoricalChartDuxo $duxo;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState4<IndexHistoricalChartViewState> $viewState$delegate;

    IndexHistoricalChartKt$IndexHistoricalChart$2$17$1(IndexHistoricalChartDuxo indexHistoricalChartDuxo, SnapshotState4<IndexHistoricalChartViewState> snapshotState4, EventLogger eventLogger) {
        this.$duxo = indexHistoricalChartDuxo;
        this.$viewState$delegate = snapshotState4;
        this.$eventLogger = eventLogger;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DisplaySpan displaySpan) {
        invoke2(displaySpan);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DisplaySpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        this.$duxo.onSpanSelected(span);
        IndexHistoricalChartEventData eventData = IndexHistoricalChartKt.IndexHistoricalChart$lambda$0(this.$viewState$delegate).getEventData();
        if (eventData != null) {
            IndexDetailPageLoggings.logIndexHistoricalChartSpanSelected(this.$eventLogger, IndexHistoricalChartEventData.copy$default(eventData, null, null, span, false, 11, null));
        }
    }
}
