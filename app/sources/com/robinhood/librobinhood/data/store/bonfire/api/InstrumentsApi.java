package com.robinhood.librobinhood.data.store.bonfire.api;

import com.robinhood.android.charts.models.api.ApiAdvancedChart;
import com.robinhood.models.api.bonfire.instrument.ApiInstrumentChartBounds;
import com.robinhood.models.api.bonfire.instrument.ApiInstrumentChartIntervals;
import com.robinhood.models.api.bonfire.instrument.ApiInstrumentChartSpans;
import com.robinhood.models.api.bonfire.instrument.ApiStockDetailHistoricalChartData;
import com.robinhood.models.api.bonfire.instrument.PostApiInstrumentChartIntervalsConfig;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.shared.models.advancedChart.api.ApiAdvancedChartSupportedIndicators;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicatorConfigRequest;
import com.robinhood.shared.models.advancedChart.api.ApiTitledTechnicalIndicatorConfig;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import p479j$.time.Instant;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: InstrumentsApi.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JP\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\f\u0010\rJ`\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b\u001f\u0010\u0018J\u001c\u0010#\u001a\u00020\"2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010 H§@¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%H§@¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010(\u001a\u00020'2\b\b\u0001\u0010\u0003\u001a\u00020\u0004H§@¢\u0006\u0004\b(\u0010)J$\u0010,\u001a\u00020\u001b2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010+\u001a\u00020*H§@¢\u0006\u0004\b,\u0010-¨\u0006."}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "", "Ljava/util/UUID;", "instrumentId", "", "span", "", "hideExtendedHours", "showCandlesticks", "showAllDay", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/instrument/ApiStockDetailHistoricalChartData;", "getStockDetailHistoricalChart", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "displaySpan", "technicalIndicators", "interval", "gridlines", "Lcom/robinhood/android/charts/models/api/ApiAdvancedChart;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getAdvancedChart", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/shared/models/advancedChart/api/ApiTitledTechnicalIndicatorConfig;", "getAdvancedChartConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicatorConfigRequest;", "request", "", "updateAdvancedChartConfig", "(Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicatorConfigRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/shared/models/advancedChart/api/ApiAdvancedChartSupportedIndicators;", "getAdvancedChartSupportedIndicators", "j$/time/Instant", "now", "Lcom/robinhood/models/api/bonfire/instrument/ApiInstrumentChartBounds;", "getInstrumentChartBounds", "(Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/bonfire/instrument/ApiInstrumentChartSpans;", "getInstrumentChartSpans", "Lcom/robinhood/models/api/bonfire/instrument/ApiInstrumentChartIntervals;", "getInstrumentChartIntervals", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/bonfire/instrument/PostApiInstrumentChartIntervalsConfig;", "config", "postInstrumentChartIntervalsConfig", "(Ljava/lang/String;Lcom/robinhood/models/api/bonfire/instrument/PostApiInstrumentChartIntervalsConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public interface InstrumentsApi {
    @GET("instruments/{instrument_id}/stock-advanced-chart/")
    Object getAdvancedChart(@Path("instrument_id") UUID uuid, @Query("display_span") String str, @Query("indicators") String str2, @Query("hide_extended_hours") boolean z, @Query("show_candlesticks") boolean z2, @Query("interval") String str3, @Query("gridlines") Boolean bool, Continuation<? super ApiAdvancedChart<GenericAction>> continuation);

    @GET("instruments/stock-advanced-chart-config/")
    Object getAdvancedChartConfig(Continuation<? super ApiTitledTechnicalIndicatorConfig> continuation);

    @GET("instruments/stock-advanced-chart-supported-indicators/")
    Object getAdvancedChartSupportedIndicators(Continuation<? super ApiAdvancedChartSupportedIndicators> continuation);

    @GET("instruments/chart-bounds/")
    Object getInstrumentChartBounds(@Query("now") Instant instant, Continuation<? super ApiInstrumentChartBounds> continuation);

    @GET("instruments/{instrument_id}/intervals")
    Object getInstrumentChartIntervals(@Path("instrument_id") String str, Continuation<? super ApiInstrumentChartIntervals> continuation);

    @GET("instruments/spans")
    Object getInstrumentChartSpans(Continuation<? super ApiInstrumentChartSpans> continuation);

    @GET("instruments/{instrument_id}/historical-chart/")
    Object getStockDetailHistoricalChart(@Path("instrument_id") UUID uuid, @Query("display_span") String str, @Query("hide_extended_hours") Boolean bool, @Query("show_candlesticks") Boolean bool2, @Query("show_all_day") Boolean bool3, Continuation<? super Response<ApiStockDetailHistoricalChartData>> continuation);

    @POST("instruments/{instrument_id}/intervals/config")
    Object postInstrumentChartIntervalsConfig(@Path("instrument_id") String str, @Body PostApiInstrumentChartIntervalsConfig postApiInstrumentChartIntervalsConfig, Continuation<? super Unit> continuation);

    @POST("instruments/stock-advanced-chart-config/")
    Object updateAdvancedChartConfig(@Body ApiTechnicalIndicatorConfigRequest apiTechnicalIndicatorConfigRequest, Continuation<? super Unit> continuation);
}
