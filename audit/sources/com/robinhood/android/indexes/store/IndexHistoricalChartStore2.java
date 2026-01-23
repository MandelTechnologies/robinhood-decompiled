package com.robinhood.android.indexes.store;

import com.robinhood.android.charts.models.api.ApiIndexHistoricalChart;
import com.robinhood.android.charts.models.api.ApiIndexHistoricalChartRequest;
import com.robinhood.android.indexes.models.api.IndexBonfireApi;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
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
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/android/charts/models/api/ApiIndexHistoricalChart;", "request", "Lcom/robinhood/android/charts/models/api/ApiIndexHistoricalChartRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexHistoricalChartStore$endpoint$1", m3645f = "IndexHistoricalChartStore.kt", m3646l = {37}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.indexes.store.IndexHistoricalChartStore$endpoint$1, reason: use source file name */
/* loaded from: classes10.dex */
final class IndexHistoricalChartStore2 extends ContinuationImpl7 implements Function2<ApiIndexHistoricalChartRequest, Continuation<? super Response<ApiIndexHistoricalChart>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IndexHistoricalChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndexHistoricalChartStore2(IndexHistoricalChartStore indexHistoricalChartStore, Continuation<? super IndexHistoricalChartStore2> continuation) {
        super(2, continuation);
        this.this$0 = indexHistoricalChartStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndexHistoricalChartStore2 indexHistoricalChartStore2 = new IndexHistoricalChartStore2(this.this$0, continuation);
        indexHistoricalChartStore2.L$0 = obj;
        return indexHistoricalChartStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiIndexHistoricalChartRequest apiIndexHistoricalChartRequest, Continuation<? super Response<ApiIndexHistoricalChart>> continuation) {
        return ((IndexHistoricalChartStore2) create(apiIndexHistoricalChartRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        ApiIndexHistoricalChartRequest apiIndexHistoricalChartRequest = (ApiIndexHistoricalChartRequest) this.L$0;
        IndexBonfireApi indexBonfireApi = this.this$0.indexBonfireApi;
        UUID index_id = apiIndexHistoricalChartRequest.getIndex_id();
        DisplaySpan display_span = apiIndexHistoricalChartRequest.getDisplay_span();
        Boolean show_candlesticks = apiIndexHistoricalChartRequest.getShow_candlesticks();
        this.label = 1;
        Object indexHistoricalChart = indexBonfireApi.getIndexHistoricalChart(index_id, display_span, show_candlesticks, this);
        return indexHistoricalChart == coroutine_suspended ? coroutine_suspended : indexHistoricalChart;
    }
}
