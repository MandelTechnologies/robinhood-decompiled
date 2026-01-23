package com.robinhood.android.api.portfolio;

import com.robinhood.android.charts.models.api.ApiPortfolioChart;
import com.robinhood.android.models.portfolio.api.AccountMarketValuesType;
import com.robinhood.android.models.portfolio.api.ApiAccountMarketValues;
import com.robinhood.android.models.portfolio.api.ApiAccountMarketValuesLive;
import com.robinhood.android.models.portfolio.api.ApiBenchmarkingSearchResults;
import com.robinhood.android.models.portfolio.api.ApiPerformanceChart;
import com.robinhood.android.models.portfolio.api.ApiPerformanceChartSettingsResponse;
import com.robinhood.android.models.portfolio.api.ApiPerformanceChartSettingsV2;
import com.robinhood.android.models.portfolio.api.ApiPositionDetails;
import com.robinhood.android.models.portfolio.api.ApiPositionSortOptions;
import com.robinhood.android.models.portfolio.api.ApiPositionsDisplayOptions;
import com.robinhood.android.models.portfolio.api.ApiPositionsReorderRequest;
import com.robinhood.android.models.portfolio.api.AssetType;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: PortfolioApi.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0002\u0010\nJ0\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0002\u0010\u0011J\"\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0015J,\u0010\u0016\u001a\u00020\u00132\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0019Jr\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00052\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0002\u0010\u001fJN\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\b\b\u0001\u0010&\u001a\u00020\u00052\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010'J\"\u0010(\u001a\u00020)2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020*H§@¢\u0006\u0002\u0010+J\"\u0010,\u001a\u00020-2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010.\u001a\u00020/H§@¢\u0006\u0002\u00100J,\u00101\u001a\u0002022\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u00103\u001a\u0002042\b\b\u0001\u00105\u001a\u00020\u0005H§@¢\u0006\u0002\u00106J\u0018\u00107\u001a\u0002082\b\b\u0001\u00109\u001a\u00020\u0005H§@¢\u0006\u0002\u0010:J\"\u0010;\u001a\u00020<2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010=¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/api/portfolio/PortfolioApi;", "", "getPortfolioChart", "Lcom/robinhood/android/charts/models/api/ApiPortfolioChart;", "accountNumber", "", "span", "isForWidget", "", "isPrivacyEnabled", "(Ljava/lang/String;Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPositionDisplayValueOptions", "Lcom/robinhood/android/models/portfolio/api/ApiPositionsDisplayOptions;", "instrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "displayCurrency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPerformanceChartSettingsV2", "Lcom/robinhood/android/models/portfolio/api/ApiPerformanceChartSettingsResponse;", "chartType", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postPerformanceChartSettingsV2", "request", "Lcom/robinhood/android/models/portfolio/api/ApiPerformanceChartSettingsV2;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/ApiPerformanceChartSettingsV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPerformanceChart", "Lcom/robinhood/android/models/portfolio/api/ApiPerformanceChart;", "chartStyle", "benchmarkIds", "includeAllHours", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBatchedPositionDetails", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/models/portfolio/api/ApiPositionDetails;", "instrumentIds", "Lcom/robinhood/models/CommaSeparatedList;", "Ljava/util/UUID;", "displayType", "(Ljava/lang/String;Lcom/robinhood/models/CommaSeparatedList;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reorderPositions", "", "Lcom/robinhood/android/models/portfolio/api/ApiPositionsReorderRequest;", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/ApiPositionsReorderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPositionSortOptions", "Lcom/robinhood/android/models/portfolio/api/ApiPositionSortOptions;", "assetType", "Lcom/robinhood/android/models/portfolio/api/AssetType;", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/AssetType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountMarketValues", "Lcom/robinhood/android/models/portfolio/api/ApiAccountMarketValues;", "type", "Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "displaySpan", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "benchmarkingSearch", "Lcom/robinhood/android/models/portfolio/api/ApiBenchmarkingSearchResults;", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountMarketValuesLive", "Lcom/robinhood/android/models/portfolio/api/ApiAccountMarketValuesLive;", "(Ljava/lang/String;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface PortfolioApi {
    @GET("portfolio/account/{account_number}/live/")
    Object accountMarketValuesLive(@Path("account_number") String str, @Query("display_currency") DisplayCurrency displayCurrency, Continuation<? super ApiAccountMarketValuesLive> continuation);

    @GET("portfolio/benchmarking/search")
    Object benchmarkingSearch(@Query("query") String str, Continuation<? super ApiBenchmarkingSearchResults> continuation);

    @GET("portfolio/account/{account_number}/market_values")
    Object getAccountMarketValues(@Path("account_number") String str, @Query("market_values_type") AccountMarketValuesType accountMarketValuesType, @Query("display_span") String str2, Continuation<? super ApiAccountMarketValues> continuation);

    @GET("portfolio/{account_number}/positions/list/")
    Object getBatchedPositionDetails(@Path("account_number") String str, @Query("instrument_ids") CommaSeparatedList<UUID> commaSeparatedList, @Query("display_type") String str2, @Query("instrument_type") PositionInstrumentType positionInstrumentType, @Query("display_currency") DisplayCurrency displayCurrency, Continuation<? super PaginatedResult<ApiPositionDetails>> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 25"})
    @GET("portfolio/performance/{account_number}")
    Object getPerformanceChart(@Path("account_number") String str, @Query("display_span") String str2, @Query("chart_type") String str3, @Query("chart_style") String str4, @Query("is_for_widget") boolean z, @Query("is_privacy_enabled") boolean z2, @Query("benchmark_ids") String str5, @Query("include_all_hours") Boolean bool, @Query("display_currency") DisplayCurrency displayCurrency, Continuation<? super ApiPerformanceChart> continuation);

    @GET("portfolio/performance/{account_number}/settings_v2")
    Object getPerformanceChartSettingsV2(@Path("account_number") String str, @Query("chart_type") String str2, Continuation<? super ApiPerformanceChartSettingsResponse> continuation);

    @GET("portfolio/{account_number}/historical-chart/")
    Object getPortfolioChart(@Path("account_number") String str, @Query("display_span") String str2, @Query("is_for_widget") boolean z, @Query("is_privacy_enabled") boolean z2, Continuation<? super ApiPortfolioChart> continuation);

    @GET("portfolio/{account_number}/positions/display-values")
    Object getPositionDisplayValueOptions(@Path("account_number") String str, @Query("instrument_type") PositionInstrumentType positionInstrumentType, @Query("display_currency") DisplayCurrency displayCurrency, Continuation<? super ApiPositionsDisplayOptions> continuation);

    @GET("portfolio/{account_number}/positions/sort-options/{asset_type}")
    Object getPositionSortOptions(@Path("account_number") String str, @Path("asset_type") AssetType assetType, Continuation<? super ApiPositionSortOptions> continuation);

    @POST("portfolio/performance/{account_number}/settings_v2")
    Object postPerformanceChartSettingsV2(@Path("account_number") String str, @Query("chart_type") String str2, @Body ApiPerformanceChartSettingsV2 apiPerformanceChartSettingsV2, Continuation<? super ApiPerformanceChartSettingsResponse> continuation);

    @POST("portfolio/{account_number}/positions/reorder")
    Object reorderPositions(@Path("account_number") String str, @Body ApiPositionsReorderRequest apiPositionsReorderRequest, Continuation<? super Unit> continuation);
}
