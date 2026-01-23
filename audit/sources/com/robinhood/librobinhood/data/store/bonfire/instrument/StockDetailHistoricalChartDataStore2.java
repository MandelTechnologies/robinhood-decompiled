package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore;
import com.robinhood.models.api.bonfire.instrument.ApiStockDetailHistoricalChartData;
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

/* compiled from: StockDetailHistoricalChartDataStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/instrument/ApiStockDetailHistoricalChartData;", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/StockDetailHistoricalChartDataStore$RequestParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore$historicalChartDataEndpoint$1", m3645f = "StockDetailHistoricalChartDataStore.kt", m3646l = {52}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.StockDetailHistoricalChartDataStore$historicalChartDataEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class StockDetailHistoricalChartDataStore2 extends ContinuationImpl7 implements Function2<StockDetailHistoricalChartDataStore.RequestParams, Continuation<? super Response<ApiStockDetailHistoricalChartData>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StockDetailHistoricalChartDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StockDetailHistoricalChartDataStore2(StockDetailHistoricalChartDataStore stockDetailHistoricalChartDataStore, Continuation<? super StockDetailHistoricalChartDataStore2> continuation) {
        super(2, continuation);
        this.this$0 = stockDetailHistoricalChartDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StockDetailHistoricalChartDataStore2 stockDetailHistoricalChartDataStore2 = new StockDetailHistoricalChartDataStore2(this.this$0, continuation);
        stockDetailHistoricalChartDataStore2.L$0 = obj;
        return stockDetailHistoricalChartDataStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(StockDetailHistoricalChartDataStore.RequestParams requestParams, Continuation<? super Response<ApiStockDetailHistoricalChartData>> continuation) {
        return ((StockDetailHistoricalChartDataStore2) create(requestParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        StockDetailHistoricalChartDataStore.RequestParams requestParams = (StockDetailHistoricalChartDataStore.RequestParams) this.L$0;
        InstrumentsApi instrumentsApi = this.this$0.instrumentsApi;
        UUID instrumentId = requestParams.getInstrumentId();
        String span = requestParams.getSpan();
        Boolean hideExtendedHours = requestParams.getHideExtendedHours();
        Boolean showCandlesticks = requestParams.getShowCandlesticks();
        this.label = 1;
        Object stockDetailHistoricalChart = instrumentsApi.getStockDetailHistoricalChart(instrumentId, span, hideExtendedHours, showCandlesticks, null, this);
        return stockDetailHistoricalChart == coroutine_suspended ? coroutine_suspended : stockDetailHistoricalChart;
    }
}
