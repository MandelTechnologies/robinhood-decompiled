package com.robinhood.api.investFlow.retrofit;

import com.robinhood.android.regiongate.InvestFlowRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboRequest;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboResponse;
import com.robinhood.investflow.models.api.ApiInvestFlowOrderCheckResponse;
import com.robinhood.investflow.models.api.ApiInvestFlowPostBody;
import com.robinhood.investflow.models.api.ApiInvestFlowPostResponse;
import com.robinhood.investflow.models.api.ApiInvestFlowReceiptPostBody;
import com.robinhood.investflow.models.api.ApiInvestFlowReceiptResponse;
import com.robinhood.investflow.models.api.allocation.ApiInvestFlowPercentAllocationRequest;
import com.robinhood.investflow.models.api.allocation.ApiInvestFlowPercentAllocationResponse;
import com.robinhood.investflow.models.api.sdui.ApiInvestFlowDiscoveryPageResponse;
import com.robinhood.investflow.models.api.sdui.ApiInvestFlowEmbeddedDetailPageResponse;
import com.robinhood.investflow.models.api.sdui.ApiInvestFlowMenuPageResponse;
import com.robinhood.recurring.models.api.ApiAssetType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: InvestFlowApi.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ,\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0013\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u0013\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u0013\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020!2\b\b\u0001\u0010\u0013\u001a\u00020\"H§@¢\u0006\u0002\u0010#¨\u0006$"}, m3636d2 = {"Lcom/robinhood/api/investFlow/retrofit/InvestFlowApi;", "", "getInvestFlowDiscoveryPage", "Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowDiscoveryPageResponse;", "assetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInvestFlowMenuPage", "Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowMenuPageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmbeddedDetailPage", "Lcom/robinhood/investflow/models/api/sdui/ApiInvestFlowEmbeddedDetailPageResponse;", "uuid", "Ljava/util/UUID;", "key", "Lcom/robinhood/api/investFlow/retrofit/InvestFlowEmbeddedDetailPageKey;", "(Ljava/util/UUID;Lcom/robinhood/recurring/models/api/ApiAssetType;Lcom/robinhood/api/investFlow/retrofit/InvestFlowEmbeddedDetailPageKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInvestFlowNbbo", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "request", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboRequest;", "(Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createInvestFlow", "Lcom/robinhood/investflow/models/api/ApiInvestFlowPostResponse;", "Lcom/robinhood/investflow/models/api/ApiInvestFlowPostBody;", "(Lcom/robinhood/investflow/models/api/ApiInvestFlowPostBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkInvestFlow", "Lcom/robinhood/investflow/models/api/ApiInvestFlowOrderCheckResponse;", "getInvestFlowReceipt", "Lcom/robinhood/investflow/models/api/ApiInvestFlowReceiptResponse;", "Lcom/robinhood/investflow/models/api/ApiInvestFlowReceiptPostBody;", "(Lcom/robinhood/investflow/models/api/ApiInvestFlowReceiptPostBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInvestFlowAllocationSplitPercent", "Lcom/robinhood/investflow/models/api/allocation/ApiInvestFlowPercentAllocationResponse;", "Lcom/robinhood/investflow/models/api/allocation/ApiInvestFlowPercentAllocationRequest;", "(Lcom/robinhood/investflow/models/api/allocation/ApiInvestFlowPercentAllocationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface InvestFlowApi {
    @POST("invest_flow/check")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {InvestFlowRegionGate.class})
    Object checkInvestFlow(@Body ApiInvestFlowPostBody apiInvestFlowPostBody, Continuation<? super ApiInvestFlowOrderCheckResponse> continuation);

    @POST("invest_flow/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {InvestFlowRegionGate.class})
    Object createInvestFlow(@Body ApiInvestFlowPostBody apiInvestFlowPostBody, Continuation<? super ApiInvestFlowPostResponse> continuation);

    @GET("invest_flow/{embedded_id}/asset_detail/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {InvestFlowRegionGate.class})
    Object getEmbeddedDetailPage(@Path("embedded_id") UUID uuid, @Query("asset_type") ApiAssetType apiAssetType, @Query("component_key") InvestFlowEmbeddedDetailPageKey investFlowEmbeddedDetailPageKey, Continuation<? super ApiInvestFlowEmbeddedDetailPageResponse> continuation);

    @POST("invest_flow/allocation_split/percent")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {InvestFlowRegionGate.class})
    Object getInvestFlowAllocationSplitPercent(@Body ApiInvestFlowPercentAllocationRequest apiInvestFlowPercentAllocationRequest, Continuation<? super ApiInvestFlowPercentAllocationResponse> continuation);

    @GET("invest_flow/discovery/{asset_type}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {InvestFlowRegionGate.class})
    Object getInvestFlowDiscoveryPage(@Path("asset_type") ApiAssetType apiAssetType, Continuation<? super ApiInvestFlowDiscoveryPageResponse> continuation);

    @GET("invest_flow/menu/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {InvestFlowRegionGate.class})
    Object getInvestFlowMenuPage(Continuation<? super ApiInvestFlowMenuPageResponse> continuation);

    @POST("invest_flow/nbbo/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {InvestFlowRegionGate.class})
    Object getInvestFlowNbbo(@Body ApiInvestFlowNbboRequest apiInvestFlowNbboRequest, Continuation<? super ApiInvestFlowNbboResponse> continuation);

    @POST("invest_flow/receipt/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {InvestFlowRegionGate.class})
    Object getInvestFlowReceipt(@Body ApiInvestFlowReceiptPostBody apiInvestFlowReceiptPostBody, Continuation<? super ApiInvestFlowReceiptResponse> continuation);
}
