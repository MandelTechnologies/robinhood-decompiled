package com.robinhood.android.indexes.detail.components.chart;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.indexes.detail.IndexDetailPageLoggings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IndexHistoricalChart.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.chart.IndexHistoricalChartKt$IndexHistoricalChart$2$3$1", m3645f = "IndexHistoricalChart.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class IndexHistoricalChartKt$IndexHistoricalChart$2$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState4<IndexHistoricalChartViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndexHistoricalChartKt$IndexHistoricalChart$2$3$1(SnapshotState4<IndexHistoricalChartViewState> snapshotState4, EventLogger eventLogger, Continuation<? super IndexHistoricalChartKt$IndexHistoricalChart$2$3$1> continuation) {
        super(2, continuation);
        this.$viewState$delegate = snapshotState4;
        this.$eventLogger = eventLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IndexHistoricalChartKt$IndexHistoricalChart$2$3$1(this.$viewState$delegate, this.$eventLogger, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IndexHistoricalChartKt$IndexHistoricalChart$2$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IndexHistoricalChartEventData eventData;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (IndexHistoricalChartKt.IndexHistoricalChart$lambda$0(this.$viewState$delegate).getTertiaryValueTooltip() != null && (eventData = IndexHistoricalChartKt.IndexHistoricalChart$lambda$0(this.$viewState$delegate).getEventData()) != null) {
                IndexDetailPageLoggings.logIndexCurbTooltipAppear(this.$eventLogger, eventData);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
