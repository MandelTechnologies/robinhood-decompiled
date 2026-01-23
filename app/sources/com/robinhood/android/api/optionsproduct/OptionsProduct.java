package com.robinhood.android.api.optionsproduct;

import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.api.ApiOptionTooltip;
import com.robinhood.models.api.chainsettings.ApiChainAvailableMetrics;
import com.robinhood.models.api.chainsettings.ApiChainCustomization;
import com.robinhood.models.api.chainsettings.ApiChainCustomizationEducation;
import com.robinhood.models.api.chainsettings.ApiChainCustomizationList;
import com.robinhood.models.api.simulatedreturns.ApiOptionShouldShowSimulatedReturnsResponse;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationResponse;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: OptionsProduct.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\nJ,\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\bJ,\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\bJ\"\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\nJ\u0018\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0018\u001a\u00020\u0019H§@¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u0015\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0016J\u0018\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u0015\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0016J\"\u0010\u001e\u001a\u00020\u001c2\b\b\u0001\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u0010\u001f\u001a\u00020 H§@¢\u0006\u0002\u0010!J\"\u0010\"\u001a\u00020\u001c2\b\b\u0001\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u0010\u001f\u001a\u00020 H§@¢\u0006\u0002\u0010!J\"\u0010#\u001a\u00020\u00112\b\b\u0001\u0010$\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\nJ\u0018\u0010%\u001a\u00020&2\b\b\u0001\u0010\u0015\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0016J\u0018\u0010'\u001a\u00020&2\b\b\u0001\u0010\u0015\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0016J\u0018\u0010(\u001a\u00020)2\b\b\u0001\u0010*\u001a\u00020+H§@¢\u0006\u0002\u0010,J\u0018\u0010-\u001a\u00020.2\b\b\u0001\u0010/\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0016¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/api/optionsproduct/OptionsProduct;", "", "getOptionStrategyBuilderTooltip", "Lcom/robinhood/models/api/ApiOptionTooltip;", "strategyId", "", "locationItemId", "accountNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOptionChainTooltip", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOptionPositionHomeTabTooltip", "getOptionDetailPageTooltip", "source", "getOptionSimulatedReturnTooltip", "symbol", "postOptionTooltipSeen", "", "receiptId", "getChainAvailableMetrics", "Lcom/robinhood/models/api/chainsettings/ApiChainAvailableMetrics;", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStrategyBuilderAvailableMetrics", "getChainCustomizations", "Lcom/robinhood/models/api/chainsettings/ApiChainCustomizationList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChainCustomization", "Lcom/robinhood/models/api/chainsettings/ApiChainCustomization;", "getStrategyBuilderCustomization", "updateChainCustomization", "updateMetricsRequest", "Lcom/robinhood/models/api/chainsettings/ApiChainCustomization$UpdateMetricsRequest;", "(Ljava/lang/String;Lcom/robinhood/models/api/chainsettings/ApiChainCustomization$UpdateMetricsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateStrategyBuilderCustomization", "postOptionUserContextSeen", "seenContext", "getChainCustomizationEducation", "Lcom/robinhood/models/api/chainsettings/ApiChainCustomizationEducation;", "getStrategyBuilderCustomizationEducation", "getSimulatedReturnsConfigurationV3", "Lcom/robinhood/models/api/simulatedreturns/ApiOptionSimulatedReturnsConfigurationResponse;", "request", "Lcom/robinhood/models/api/simulatedreturns/ApiOptionSimulatedReturnsConfigurationV3Request;", "(Lcom/robinhood/models/api/simulatedreturns/ApiOptionSimulatedReturnsConfigurationV3Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShouldShowSimulatedReturns", "Lcom/robinhood/models/api/simulatedreturns/ApiOptionShouldShowSimulatedReturnsResponse;", "strategyCode", "lib-api-options-product_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface OptionsProduct {
    @GET("chain/metrics/{id}/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getChainAvailableMetrics(@Path("id") String str, Continuation<? super ApiChainAvailableMetrics> continuation);

    @GET("chain/customizations/{id}/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getChainCustomization(@Path("id") String str, Continuation<? super ApiChainCustomization> continuation);

    @GET("chain/education/{id}/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getChainCustomizationEducation(@Path("id") String str, Continuation<? super ApiChainCustomizationEducation> continuation);

    @GET("chain/customizations/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getChainCustomizations(Continuation<? super ApiChainCustomizationList> continuation);

    @GET("tooltips/chain/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getOptionChainTooltip(@Query("location_item_ids") String str, @Query("account_number") String str2, Continuation<? super ApiOptionTooltip> continuation);

    @GET("tooltips/odp/{source}/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getOptionDetailPageTooltip(@Path("source") String str, @Query("location_item_ids") String str2, @Query("account_number") String str3, Continuation<? super ApiOptionTooltip> continuation);

    @GET("tooltips/home-tab/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getOptionPositionHomeTabTooltip(@Query("location_item_ids") String str, @Query("account_number") String str2, Continuation<? super ApiOptionTooltip> continuation);

    @GET("tooltips/simulated-returns/{symbol}/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getOptionSimulatedReturnTooltip(@Path("symbol") String str, @Query("location_item_ids") String str2, @Query("account_number") String str3, Continuation<? super ApiOptionTooltip> continuation);

    @GET("tooltips/builder/{strategy}/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getOptionStrategyBuilderTooltip(@Path("strategy") String str, @Query("location_item_ids") String str2, @Query("account_number") String str3, Continuation<? super ApiOptionTooltip> continuation);

    @GET("simulated-returns/should-show-simulated-returns/{strategy_code}/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getShouldShowSimulatedReturns(@Path("strategy_code") String str, Continuation<? super ApiOptionShouldShowSimulatedReturnsResponse> continuation);

    @POST("simulated-returns/configuration/v3/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object getSimulatedReturnsConfigurationV3(@Body ApiOptionSimulatedReturnsConfigurationV3Request apiOptionSimulatedReturnsConfigurationV3Request, Continuation<? super ApiOptionSimulatedReturnsConfigurationResponse> continuation);

    @GET("builder/metrics/{id}/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getStrategyBuilderAvailableMetrics(@Path("id") String str, Continuation<? super ApiChainAvailableMetrics> continuation);

    @GET("builder/customizations/{id}/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getStrategyBuilderCustomization(@Path("id") String str, Continuation<? super ApiChainCustomization> continuation);

    @GET("builder/education/{id}/")
    @RequiresRegionGate(regionGates = {OptionsRegionGate.class})
    Object getStrategyBuilderCustomizationEducation(@Path("id") String str, Continuation<? super ApiChainCustomizationEducation> continuation);

    @POST("tooltips/{receipt_id}/seen/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object postOptionTooltipSeen(@Path("receipt_id") String str, @Query("account_number") String str2, Continuation<? super Unit> continuation);

    @POST("user-context/{seen_context}/seen/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object postOptionUserContextSeen(@Path("seen_context") String str, @Query("account_number") String str2, Continuation<? super Unit> continuation);

    @PATCH("chain/customizations/{id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object updateChainCustomization(@Path("id") String str, @Body ApiChainCustomization.UpdateMetricsRequest updateMetricsRequest, Continuation<? super ApiChainCustomization> continuation);

    @PATCH("builder/customizations/{id}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {OptionsRegionGate.class})
    Object updateStrategyBuilderCustomization(@Path("id") String str, @Body ApiChainCustomization.UpdateMetricsRequest updateMetricsRequest, Continuation<? super ApiChainCustomization> continuation);
}
