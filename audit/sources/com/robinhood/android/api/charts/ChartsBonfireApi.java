package com.robinhood.android.api.charts;

import com.robinhood.android.charts.models.api.ApiOptionHistoricalChart;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ChartsBonfireApi.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JR\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/api/charts/ChartsBonfireApi;", "", "getOptionHistoricalChart", "Lretrofit2/Response;", "Lcom/robinhood/android/charts/models/api/ApiOptionHistoricalChart;", "strategyCode", "", "displaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "showCandlesticks", "", "lateEtfBoundsEnabled", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "hideExtendedHours", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Ljava/lang/Boolean;ZLcom/robinhood/models/db/OptionChain$UnderlyingType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface ChartsBonfireApi {
    @GET("options/{strategy_code}/historical-chart/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionHistoricalChart(@Path("strategy_code") String str, @Query("display_span") DisplaySpan displaySpan, @Query("show_candlesticks") Boolean bool, @Query("late_etf_bounds_enabled") boolean z, @Query("underlying_type") OptionChain.UnderlyingType underlyingType, @Query("hide_extended_hours") boolean z2, Continuation<? super Response<ApiOptionHistoricalChart>> continuation);
}
