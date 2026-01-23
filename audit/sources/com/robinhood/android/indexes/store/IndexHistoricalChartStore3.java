package com.robinhood.android.indexes.store;

import com.robinhood.android.charts.models.api.ApiIndexHistoricalChart;
import com.robinhood.android.charts.models.api.ApiIndexHistoricalChartData;
import com.robinhood.android.charts.models.dao.IndexHistoricalChartDao;
import com.robinhood.android.charts.models.p080db.IndexHistoricalChartData;
import com.robinhood.android.charts.models.p080db.IndexHistoricalChartModel;
import com.robinhood.android.models.charts.normalizer.api.ApiNormalizationData;
import com.robinhood.android.models.charts.normalizer.p185db.NormalizationData2;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: IndexHistoricalChartStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lretrofit2/Response;", "Lcom/robinhood/android/charts/models/api/ApiIndexHistoricalChart;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexHistoricalChartStore$endpoint$2", m3645f = "IndexHistoricalChartStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.indexes.store.IndexHistoricalChartStore$endpoint$2, reason: use source file name */
/* loaded from: classes10.dex */
final class IndexHistoricalChartStore3 extends ContinuationImpl7 implements Function2<Response<ApiIndexHistoricalChart>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IndexHistoricalChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndexHistoricalChartStore3(IndexHistoricalChartStore indexHistoricalChartStore, Continuation<? super IndexHistoricalChartStore3> continuation) {
        super(2, continuation);
        this.this$0 = indexHistoricalChartStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndexHistoricalChartStore3 indexHistoricalChartStore3 = new IndexHistoricalChartStore3(this.this$0, continuation);
        indexHistoricalChartStore3.L$0 = obj;
        return indexHistoricalChartStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<ApiIndexHistoricalChart> response, Continuation<? super Unit> continuation) {
        return ((IndexHistoricalChartStore3) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiIndexHistoricalChart apiIndexHistoricalChart = (ApiIndexHistoricalChart) ((Response) this.L$0).body();
        if (apiIndexHistoricalChart != null) {
            IndexHistoricalChartDao indexHistoricalChartDao = this.this$0.chartDao;
            UUID index_id = apiIndexHistoricalChart.getIndex_id();
            ApiIndexHistoricalChartData chart_data = apiIndexHistoricalChart.getChart_data();
            IndexHistoricalChartData indexHistoricalChartData = null;
            if (chart_data != null) {
                UUID id = chart_data.getId();
                UUID index_id2 = chart_data.getIndex_id();
                CursorData default_display = chart_data.getDefault_display();
                Chart<GenericAction> chart = chart_data.getChart();
                DisplaySpan display_span = chart_data.getDisplay_span();
                Direction page_direction = chart_data.getPage_direction();
                Boolean show_candlesticks = chart_data.getShow_candlesticks();
                boolean zBooleanValue = show_candlesticks != null ? show_candlesticks.booleanValue() : false;
                List<UIComponent<GenericAction>> overlays = chart_data.getOverlays();
                ApiNormalizationData normalization_data = chart_data.getNormalization_data();
                indexHistoricalChartData = new IndexHistoricalChartData(id, index_id2, default_display, chart, display_span, page_direction, zBooleanValue, overlays, normalization_data != null ? NormalizationData2.toDbModel(normalization_data) : null);
            }
            DisplaySpan display_span2 = apiIndexHistoricalChart.getDisplay_span();
            Boolean show_candlesticks2 = apiIndexHistoricalChart.getShow_candlesticks();
            indexHistoricalChartDao.insert(new IndexHistoricalChartModel(index_id, display_span2, show_candlesticks2 != null ? show_candlesticks2.booleanValue() : false, indexHistoricalChartData));
        }
        return Unit.INSTANCE;
    }
}
