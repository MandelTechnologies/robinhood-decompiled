package com.robinhood.api.trade.equity.retrofit;

import com.robinhood.models.api.ApiBuySellOrderOnboardingResponse;
import com.robinhood.models.api.ApiEquityOrderChecksRequest;
import com.robinhood.models.api.ApiEquityOrderChecksResponse;
import com.robinhood.models.api.ApiEquityTradingSessionChangedResponse;
import com.robinhood.models.api.ApiInstrumentBuyingPower;
import com.robinhood.models.api.ApiSduiInfoSheetResponse;
import com.robinhood.models.api.bonfire.ApiEquityOrderTypeTooltipResponse;
import com.robinhood.models.api.bonfire.ApiEquityTradingSeenStatusRequest;
import com.robinhood.models.api.bonfire.ApiEquityTradingSeenStatusRequest2;
import com.robinhood.models.api.bonfire.ApiEquityTradingSeenStatusResponse;
import com.robinhood.models.api.bonfire.ApiNewTradingHoursOnboarding;
import com.robinhood.models.api.bonfire.ApiOrderDetail;
import com.robinhood.models.api.bonfire.ApiOrderTypeSelectorResponse;
import com.robinhood.models.api.bonfire.instrument.ApiInstrumentAccountSwitcherV2;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.nbbo.models.api.ApiNbboSummary;
import com.robinhood.ordersummary.models.api.ApiOrderSummaryExplanation;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: TradeEquityBonfireApi.kt */
@Metadata(m3635d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u000eJ\"\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u001fH§@¢\u0006\u0002\u0010\u000eJ\u0018\u0010 \u001a\u00020!2\b\b\u0001\u0010\"\u001a\u00020#H§@¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020&H§@¢\u0006\u0002\u0010\u000eJ\u000e\u0010'\u001a\u00020(H§@¢\u0006\u0002\u0010\u000eJ.\u0010)\u001a\u00020*2\b\b\u0001\u0010+\u001a\u00020\u00142\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u001bH§@¢\u0006\u0002\u0010-J\u0018\u0010.\u001a\u00020/2\b\b\u0001\u00100\u001a\u00020\u001bH§@¢\u0006\u0002\u00101J\u001e\u00102\u001a\b\u0012\u0004\u0012\u000204032\b\b\u0001\u0010\u001a\u001a\u00020\u001bH§@¢\u0006\u0002\u00101J>\u00105\u001a\u0002062\u000e\b\u0001\u00107\u001a\b\u0012\u0004\u0012\u00020\u001b082\b\b\u0001\u00109\u001a\u00020:2\b\b\u0001\u0010;\u001a\u00020:2\n\b\u0001\u0010<\u001a\u0004\u0018\u00010=H§@¢\u0006\u0002\u0010>¨\u0006?"}, m3636d2 = {"Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "", "equityOrderTypeSelector", "Lcom/robinhood/models/api/bonfire/ApiOrderTypeSelectorResponse;", "orderSide", "Lcom/robinhood/models/db/EquityOrderSide;", "(Lcom/robinhood/models/db/EquityOrderSide;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "equityOrderChecks", "Lcom/robinhood/models/api/ApiEquityOrderChecksResponse;", "request", "Lcom/robinhood/models/api/ApiEquityOrderChecksRequest;", "(Lcom/robinhood/models/api/ApiEquityOrderChecksRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buySellOrderOnboarding", "Lcom/robinhood/models/api/ApiBuySellOrderOnboardingResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buySellOrderOnboardingSeen", "", "sduiInfoSheet", "Lcom/robinhood/models/api/ApiSduiInfoSheetResponse;", "sheetId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "equityTradingSessionChanged", "Lcom/robinhood/models/api/ApiEquityTradingSessionChangedResponse;", "getAccountSwitcherV2", "Lcom/robinhood/models/api/bonfire/instrument/ApiInstrumentAccountSwitcherV2;", "instrumentId", "Ljava/util/UUID;", "includeAccountTypes", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEquityOrderTypeTooltip", "Lcom/robinhood/models/api/bonfire/ApiEquityOrderTypeTooltipResponse;", "setSeenStatus", "Lcom/robinhood/models/api/bonfire/ApiEquityTradingSeenStatusPatchResponse;", "status", "Lcom/robinhood/models/api/bonfire/ApiEquityTradingSeenStatusRequest;", "(Lcom/robinhood/models/api/bonfire/ApiEquityTradingSeenStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSeenStatus", "Lcom/robinhood/models/api/bonfire/ApiEquityTradingSeenStatusResponse;", "getNewTradingHoursOnboarding", "Lcom/robinhood/models/api/bonfire/ApiNewTradingHoursOnboarding;", "getBuyingPowerForInstrument", "Lcom/robinhood/models/api/ApiInstrumentBuyingPower;", "accountNumber", "orderToReplaceId", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderDetail", "Lcom/robinhood/models/api/bonfire/ApiOrderDetail;", "orderId", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNbboSummary", "Lretrofit2/Response;", "Lcom/robinhood/nbbo/models/api/ApiNbboSummary;", "getOrderSummaryExplanation", "Lcom/robinhood/ordersummary/models/api/ApiOrderSummaryExplanation;", "instrumentIds", "", "isCollared", "", "isPresetPercentLimitOrder", "presetPercentLimit", "Ljava/math/BigDecimal;", "(Ljava/util/List;ZZLjava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface TradeEquityBonfireApi {
    @GET("buy_sell_order/onboarding/")
    Object buySellOrderOnboarding(Continuation<? super ApiBuySellOrderOnboardingResponse> continuation);

    @PUT("buy_sell_order/onboarding/seen/")
    Object buySellOrderOnboardingSeen(Continuation<? super Unit> continuation);

    @POST("equity_trading/orders/checks/?endpoint_version=2022-03-03")
    Object equityOrderChecks(@Body ApiEquityOrderChecksRequest apiEquityOrderChecksRequest, Continuation<? super ApiEquityOrderChecksResponse> continuation);

    @GET("equity_trading/order_type_selector/{orderSide}/")
    Object equityOrderTypeSelector(@Path("orderSide") EquityOrderSide equityOrderSide, Continuation<? super ApiOrderTypeSelectorResponse> continuation);

    @GET("equity_trading/trading_session_changed/")
    Object equityTradingSessionChanged(Continuation<? super ApiEquityTradingSessionChangedResponse> continuation);

    @GET("account_switcher/instrument/v2/{instrument_id}/")
    Object getAccountSwitcherV2(@Path("instrument_id") UUID uuid, @Query("include_account_types") String str, Continuation<? super ApiInstrumentAccountSwitcherV2> continuation);

    @GET("accounts/{accountNumber}/instrument_buying_power/{instrumentId}/")
    Object getBuyingPowerForInstrument(@Path("accountNumber") String str, @Path("instrumentId") UUID uuid, @Query("order_to_replace_id") UUID uuid2, Continuation<? super ApiInstrumentBuyingPower> continuation);

    @GET("equity_trading/order_type_tooltip/")
    Object getEquityOrderTypeTooltip(Continuation<? super ApiEquityOrderTypeTooltipResponse> continuation);

    @GET("instruments/{instrumentId}/nbbo-summary/")
    Object getNbboSummary(@Path("instrumentId") UUID uuid, Continuation<? super Response<ApiNbboSummary>> continuation);

    @GET("equity_trading/new_trading_hours_onboarding/")
    Object getNewTradingHoursOnboarding(Continuation<? super ApiNewTradingHoursOnboarding> continuation);

    @GET("orders/detail/{order_id}")
    Object getOrderDetail(@Path("order_id") UUID uuid, Continuation<? super ApiOrderDetail> continuation);

    @GET("instruments/order-summary-explanation/")
    Object getOrderSummaryExplanation(@Query("instrument_ids") List<UUID> list, @Query("is_collared_order") boolean z, @Query("is_preset_percent_limit_order") boolean z2, @Query("preset_percent_limit") BigDecimal bigDecimal, Continuation<? super ApiOrderSummaryExplanation> continuation);

    @GET("equity_trading/seen_status/")
    Object getSeenStatus(Continuation<? super ApiEquityTradingSeenStatusResponse> continuation);

    @GET("sdui/info_sheet")
    Object sduiInfoSheet(@Query("id") String str, Continuation<? super ApiSduiInfoSheetResponse> continuation);

    @PATCH("equity_trading/seen_status/")
    Object setSeenStatus(@Body ApiEquityTradingSeenStatusRequest apiEquityTradingSeenStatusRequest, Continuation<? super ApiEquityTradingSeenStatusRequest2> continuation);

    /* compiled from: TradeEquityBonfireApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getBuyingPowerForInstrument$default(TradeEquityBonfireApi tradeEquityBonfireApi, String str, UUID uuid, UUID uuid2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBuyingPowerForInstrument");
            }
            if ((i & 4) != 0) {
                uuid2 = null;
            }
            return tradeEquityBonfireApi.getBuyingPowerForInstrument(str, uuid, uuid2, continuation);
        }
    }
}
