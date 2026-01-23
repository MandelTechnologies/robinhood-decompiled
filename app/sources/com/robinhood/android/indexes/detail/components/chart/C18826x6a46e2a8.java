package com.robinhood.android.indexes.detail.components.chart;

import androidx.compose.p011ui.node.Ref;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.charts.models.p080db.IndexHistoricalChartData;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartKt$IndexHistoricalChart$$inlined$ConstraintLayout$1 */
/* loaded from: classes10.dex */
public final class C18826x6a46e2a8 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ DisplaySpan $activeDisplaySpan$inlined;
    final /* synthetic */ Channel $channel;
    final /* synthetic */ ChartType $chartType$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ IndexHistoricalChartDuxo $duxo$inlined;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ EventLogger $eventLogger$inlined;
    final /* synthetic */ SnapshotIntState2 $graphHeaderHeight$delegate$inlined;
    final /* synthetic */ IndexHistoricalChartData $historicalChartData$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ Chart $sduiChart$inlined;
    final /* synthetic */ SnapshotState $selectedPoint$delegate$inlined;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ SnapshotState4 $viewState$delegate$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18826x6a46e2a8(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, ChartType chartType, Chart chart, IndexHistoricalChartData indexHistoricalChartData, SnapshotState4 snapshotState4, EventLogger eventLogger, IndexHistoricalChartDuxo indexHistoricalChartDuxo, DisplaySpan displaySpan, SnapshotState snapshotState5, SnapshotIntState2 snapshotIntState2) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$chartType$inlined = chartType;
        this.$sduiChart$inlined = chart;
        this.$historicalChartData$inlined = indexHistoricalChartData;
        this.$viewState$delegate$inlined = snapshotState4;
        this.$eventLogger$inlined = eventLogger;
        this.$duxo$inlined = indexHistoricalChartDuxo;
        this.$activeDisplaySpan$inlined = displaySpan;
        this.$selectedPoint$delegate$inlined = snapshotState5;
        this.$graphHeaderHeight$delegate$inlined = snapshotIntState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws NumberFormatException {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void invoke(androidx.compose.runtime.Composer r72, int r73) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.indexes.detail.components.chart.C18826x6a46e2a8.invoke(androidx.compose.runtime.Composer, int):void");
    }
}
