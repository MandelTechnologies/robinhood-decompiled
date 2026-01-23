package com.robinhood.android.api.options.retrofit;

import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.api.ApiIacAlertSheetResponse;
import com.robinhood.models.api.ApiLateCloseAnnouncementCardFlag;
import com.robinhood.models.api.ApiOptionOrderCheck;
import com.robinhood.models.api.ApiOptionOrderDetailScreen;
import com.robinhood.models.api.ApiOptionOrderPostBody;
import com.robinhood.models.api.ApiOptionOrderStrategies;
import com.robinhood.models.api.ApiOptionStrategyChainTemplate;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse2;
import com.robinhood.models.api.ApiOptionsBuyingPower;
import com.robinhood.models.api.ApiOptionsDisplayedBuyingPower;
import com.robinhood.models.api.ApiShouldShowOptionsUpgradeOnSdp;
import com.robinhood.models.api.ApiToggleAllOptionsPriceMovementAlertsRequest;
import com.robinhood.models.api.ApiToggleAllOptionsPriceMovementAlertsResponse;
import com.robinhood.models.api.marketability.ApiOptionOrderMarketability;
import com.robinhood.models.api.strategybuilder.ApiOptionStrategyBuilder;
import com.robinhood.models.api.strategybuilder.ApiOptionStrategyBuilderNuxStates;
import com.robinhood.models.api.strategybuilder.ApiOptionStrategyBuilderTourStates;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OrderDirection;
import java.math.BigDecimal;
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

/* compiled from: OptionsBonfireApi.kt */
@Metadata(m3635d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0016\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0006J\u001a\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010\u0006J\u0010\u0010\"\u001a\u00020!H§@¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020$2\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\b%\u0010\u0006J\u0010\u0010'\u001a\u00020&H§@¢\u0006\u0004\b'\u0010#J\u001a\u0010(\u001a\u00020$2\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\b(\u0010\u0006J\u001a\u0010+\u001a\u00020*2\b\b\u0001\u0010\r\u001a\u00020)H§@¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\b\u0001\u0010-\u001a\u00020\u0007H§@¢\u0006\u0004\b/\u00100J\u001a\u00101\u001a\u00020.2\b\b\u0001\u0010-\u001a\u00020\u0007H§@¢\u0006\u0004\b1\u00100J\u001a\u00104\u001a\u0002032\b\b\u0001\u00102\u001a\u00020\u0007H§@¢\u0006\u0004\b4\u00100J\u001a\u00107\u001a\u0002062\b\b\u0001\u00105\u001a\u00020)H§@¢\u0006\u0004\b7\u0010,J \u0010;\u001a\b\u0012\u0004\u0012\u00020:092\b\b\u0001\u00108\u001a\u00020\u0007H§@¢\u0006\u0004\b;\u00100J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020:09H§@¢\u0006\u0004\b<\u0010#J \u0010>\u001a\b\u0012\u0004\u0012\u00020:092\b\b\u0001\u0010=\u001a\u00020\u0002H§@¢\u0006\u0004\b>\u0010\u0006JL\u0010I\u001a\u00020H2\b\b\u0001\u0010@\u001a\u00020?2\b\b\u0001\u0010B\u001a\u00020A2\b\b\u0001\u0010C\u001a\u00020\u00022\b\b\u0001\u0010D\u001a\u00020\u00022\b\b\u0001\u0010E\u001a\u00020\u00022\b\b\u0001\u0010G\u001a\u00020FH§@¢\u0006\u0004\bI\u0010JJj\u0010Q\u001a\u00020H2\b\b\u0001\u0010K\u001a\u00020?2\b\b\u0001\u0010C\u001a\u00020\u00022\b\b\u0001\u0010D\u001a\u00020\u00022\b\b\u0001\u0010L\u001a\u00020?2\b\b\u0001\u0010M\u001a\u00020\u00022\b\b\u0001\u0010N\u001a\u00020?2\b\b\u0001\u0010O\u001a\u00020\u00022\b\b\u0001\u0010G\u001a\u00020F2\b\b\u0001\u0010P\u001a\u00020FH§@¢\u0006\u0004\bQ\u0010RJ~\u0010Q\u001a\u00020X2\b\b\u0001\u0010K\u001a\u00020?2\b\b\u0001\u0010C\u001a\u00020S2\b\b\u0001\u0010T\u001a\u00020F2\b\b\u0001\u0010D\u001a\u00020S2\b\b\u0001\u0010U\u001a\u00020F2\b\b\u0001\u0010L\u001a\u00020?2\b\b\u0001\u0010V\u001a\u00020S2\b\b\u0001\u0010G\u001a\u00020F2\b\b\u0001\u0010N\u001a\u00020?2\b\b\u0001\u0010W\u001a\u00020S2\b\b\u0001\u0010P\u001a\u00020FH§@¢\u0006\u0004\bQ\u0010Y¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/android/api/options/retrofit/OptionsBonfireApi;", "", "", "accountNumber", "Lcom/robinhood/models/api/ApiOptionsBuyingPower;", "getBuyingPowerForOptions", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/UUID;", "orderToReplaceId", "Lcom/robinhood/models/api/ApiOptionsDisplayedBuyingPower$BuyingPower;", "getDisplayedBuyingPowerForOptions", "(Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiToggleAllOptionsPriceMovementAlertsRequest;", "request", "Lcom/robinhood/models/api/ApiToggleAllOptionsPriceMovementAlertsResponse;", "toggleAllOptionsPriceMovementAlerts", "(Lcom/robinhood/models/api/ApiToggleAllOptionsPriceMovementAlertsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "shouldIncludeNullRiskTolerance", "Lcom/robinhood/models/api/ApiShouldShowOptionsUpgradeOnSdp;", "shouldShowOptionsUpgradeOnSdp", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestLegsJson", "Lcom/robinhood/models/api/ApiOptionOrderStrategies;", "getOptionOrderStrategyDisplayName", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "type", "Lcom/robinhood/models/api/strategybuilder/ApiOptionStrategyBuilder;", "getOptionStrategyBuilder", "(Lcom/robinhood/models/db/OptionChain$UnderlyingType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "strategy", "Lcom/robinhood/models/api/ApiOptionStrategyChainTemplate;", "getOptionStrategyChainTemplate", "Lcom/robinhood/models/api/strategybuilder/ApiOptionStrategyBuilderNuxStates;", "getShouldShowStrategyBuilderNux", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "updateShouldShowStrategyBuilderNux", "Lcom/robinhood/models/api/strategybuilder/ApiOptionStrategyBuilderTourStates;", "getShouldShowStrategyBuilderTour", "updateShouldShowStrategyBuilderShow", "Lcom/robinhood/models/api/ApiOptionOrderPostBody;", "Lcom/robinhood/models/api/marketability/ApiOptionOrderMarketability;", "getOptionOrderMarketability", "(Lcom/robinhood/models/api/ApiOptionOrderPostBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chainId", "Lcom/robinhood/models/api/ApiLateCloseAnnouncementCardFlag;", "getLateCloseAnnouncementCardFlag", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordLateCloseAnnouncementCardDismissed", "orderId", "Lcom/robinhood/models/api/ApiOptionOrderDetailScreen;", "getOptionOrderDetailScreen", "optionOrderPayload", "Lcom/robinhood/models/api/ApiOptionOrderCheck;", "getOptionOrderCheck", "optionChainId", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIacAlertSheetResponse;", "getIacAlertSheetForInvestingOptionChain", "getIacAlertSheetForInvestingOptionChainCustomizationGtm", "optionStrategyType", "getIacAlertSheetForInvestingOptionBuilder", "", "tradeMultiplier", "j$/time/Instant", "watchedAt", "markPrice", "previousClosePrice", "simulatedOpenPrice", "Lcom/robinhood/models/db/OrderDirection;", "direction", "Lcom/robinhood/models/api/ApiOptionTodayTotalReturnResponseLegacy;", "getOptionsSimulatedReturn", "(ILj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/db/OrderDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tradeValueMultiplier", "quantity", "averageOpenPrice", "intradayQuantity", "intradayAverageOpenPrice", "intradayDirection", "getOptionTodayTotalReturn", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Lcom/robinhood/models/db/OrderDirection;Lcom/robinhood/models/db/OrderDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/math/BigDecimal;", "markPriceDirection", "previousClosePriceDirection", "costBasis", "intradayCostBasis", "Lcom/robinhood/models/api/ApiOptionTodayTotalReturnResponse;", "(ILjava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;ILjava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;ILjava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface OptionsBonfireApi {
    @GET("accounts/{accountNumber}/options_buying_power/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getBuyingPowerForOptions(@Path("accountNumber") String str, Continuation<? super ApiOptionsBuyingPower> continuation);

    @GET("accounts/{account_number}/options_buying_power/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getDisplayedBuyingPowerForOptions(@Path("account_number") String str, @Query("order_to_replace_id") UUID uuid, Continuation<? super ApiOptionsDisplayedBuyingPower.BuyingPower> continuation);

    @GET("app-comms/surface/alert-sheet/?location=investing_option_chain_builder")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getIacAlertSheetForInvestingOptionBuilder(@Query("option_strategy") String str, Continuation<? super Response<ApiIacAlertSheetResponse>> continuation);

    @GET("app-comms/surface/alert-sheet/?location=investing_option_chain")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getIacAlertSheetForInvestingOptionChain(@Query("option_chain_id") UUID uuid, Continuation<? super Response<ApiIacAlertSheetResponse>> continuation);

    @GET("app-comms/surface/alert-sheet/?location=investing_option_chain_customization_gtm")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getIacAlertSheetForInvestingOptionChainCustomizationGtm(Continuation<? super Response<ApiIacAlertSheetResponse>> continuation);

    @GET("options/late_close_etf_announcement_card/{chainId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getLateCloseAnnouncementCardFlag(@Path("chainId") UUID uuid, Continuation<? super ApiLateCloseAnnouncementCardFlag> continuation);

    @POST("options/orders/review/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionOrderCheck(@Body ApiOptionOrderPostBody apiOptionOrderPostBody, Continuation<? super ApiOptionOrderCheck> continuation);

    @GET("options/order_detail_screen/v1/{order_id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionOrderDetailScreen(@Path("order_id") UUID uuid, Continuation<? super ApiOptionOrderDetailScreen> continuation);

    @POST("options/orders/marketability/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionOrderMarketability(@Body ApiOptionOrderPostBody apiOptionOrderPostBody, Continuation<? super ApiOptionOrderMarketability> continuation);

    @GET("options/order_strategy_display_name/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionOrderStrategyDisplayName(@Query("legs") String str, Continuation<? super ApiOptionOrderStrategies> continuation);

    @GET("options/strategy_builder/v1/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionStrategyBuilder(@Query("type") OptionChain.UnderlyingType underlyingType, Continuation<? super ApiOptionStrategyBuilder> continuation);

    @GET("options/strategy_chain_template/v1/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionStrategyChainTemplate(@Query("strategy") String str, Continuation<? super ApiOptionStrategyChainTemplate> continuation);

    @GET("options/position/today_total_return/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionTodayTotalReturn(@Query("trade_multiplier") int i, @Query("mark_price") String str, @Query("previous_close_price") String str2, @Query("quantity") int i2, @Query("average_open_price") String str3, @Query("intraday_quantity") int i3, @Query("intraday_average_open_price") String str4, @Query("direction") OrderDirection orderDirection, @Query("intraday_direction") OrderDirection orderDirection2, Continuation<? super ApiOptionTodayTotalReturnResponse2> continuation);

    @GET("options/position/today_total_return_v2/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionTodayTotalReturn(@Query("trade_multiplier") int i, @Query("mark_price") BigDecimal bigDecimal, @Query("mark_price_direction") OrderDirection orderDirection, @Query("previous_close_price") BigDecimal bigDecimal2, @Query("previous_close_price_direction") OrderDirection orderDirection2, @Query("quantity") int i2, @Query("cost_basis") BigDecimal bigDecimal3, @Query("direction") OrderDirection orderDirection3, @Query("intraday_quantity") int i3, @Query("intraday_cost_basis") BigDecimal bigDecimal4, @Query("intraday_direction") OrderDirection orderDirection4, Continuation<? super ApiOptionTodayTotalReturnResponse> continuation);

    @GET("options/simulated/today_total_return")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getOptionsSimulatedReturn(@Query("trade_multiplier") int i, @Query("watched_at") Instant instant, @Query("mark_price") String str, @Query("previous_close_price") String str2, @Query("simulated_open_price") String str3, @Query("direction") OrderDirection orderDirection, Continuation<? super ApiOptionTodayTotalReturnResponse2> continuation);

    @GET("options/strategy_builder_nux_fetch/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getShouldShowStrategyBuilderNux(Continuation<? super ApiOptionStrategyBuilderNuxStates> continuation);

    @GET("options/strategy_builder_tour_fetch/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getShouldShowStrategyBuilderTour(Continuation<? super ApiOptionStrategyBuilderTourStates> continuation);

    @POST("options/late_close_etf_announcement_card/{chainId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object recordLateCloseAnnouncementCardDismissed(@Path("chainId") UUID uuid, Continuation<? super ApiLateCloseAnnouncementCardFlag> continuation);

    @GET("options/should_show_options_upgrade_on_sdp/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object shouldShowOptionsUpgradeOnSdp(@Query("account_number") String str, @Query("should_include_null_risk_tolerance") Boolean bool, Continuation<? super ApiShouldShowOptionsUpgradeOnSdp> continuation);

    @POST("options/toggle_all_price_movement_alerts/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object toggleAllOptionsPriceMovementAlerts(@Body ApiToggleAllOptionsPriceMovementAlertsRequest apiToggleAllOptionsPriceMovementAlertsRequest, Continuation<? super ApiToggleAllOptionsPriceMovementAlertsResponse> continuation);

    @POST("options/strategy_builder_nux_update/{strategy}")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object updateShouldShowStrategyBuilderNux(@Path("strategy") String str, Continuation<? super Unit> continuation);

    @POST("options/strategy_builder_tour_update/{strategy}")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object updateShouldShowStrategyBuilderShow(@Path("strategy") String str, Continuation<? super Unit> continuation);
}
