package com.robinhood.shared.api.iac;

import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.api.ApiIacActionRequest;
import com.robinhood.models.api.ApiIacInfoBannerBatchResponse;
import com.robinhood.models.api.IacDismissMethod;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: IacInfoBannerApi.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u009c\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\tH§@¢\u0006\u0002\u0010\u0017J\"\u0010\u0018\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020\u001aH§@¢\u0006\u0002\u0010\u001bJ\"\u0010\u001c\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\t2\b\b\u0001\u0010\u001d\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/api/iac/IacInfoBannerApi;", "", "getBatchIacInfoBanner", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIacInfoBannerBatchResponse;", "locations", "Lcom/robinhood/models/CommaSeparatedList;", "", "instrumentId", "Ljava/util/UUID;", "currencyPairId", "perpetualContractId", "optionChainId", "listId", "eventId", "futuresContractId", "optionStrategyCode", "accountNumber", "orderId", "(Lcom/robinhood/models/CommaSeparatedList;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postIacInfoBannerSeen", "", "receiptUuid", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postIacInfoBannerTapped", "action", "Lcom/robinhood/models/api/ApiIacActionRequest;", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiIacActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postIacInfoBannerDismissed", "method", "Lcom/robinhood/models/api/IacDismissMethod;", "(Ljava/util/UUID;Lcom/robinhood/models/api/IacDismissMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-iac_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface IacInfoBannerApi {
    @GET("app-comms/batch/surface/info-banner/")
    Object getBatchIacInfoBanner(@Query("locations") CommaSeparatedList<String> commaSeparatedList, @Query("instrument_id") UUID uuid, @Query("currency_pair_id") UUID uuid2, @Query("perpetuals_contract_id") UUID uuid3, @Query("option_chain_id") UUID uuid4, @Query("list_id") UUID uuid5, @Query("event_id") UUID uuid6, @Query("futures_contract_id") UUID uuid7, @Query("option_strategy_code") String str, @Query("account_number") String str2, @Query("order_id") UUID uuid8, Continuation<? super Response<ApiIacInfoBannerBatchResponse>> continuation);

    @POST("app-comms/receipt/dismiss/{uuid}/")
    Object postIacInfoBannerDismissed(@Path("uuid") UUID uuid, @Query("method") IacDismissMethod iacDismissMethod, Continuation<? super Unit> continuation);

    @POST("app-comms/receipt/seen/{uuid}/")
    Object postIacInfoBannerSeen(@Path("uuid") UUID uuid, Continuation<? super Unit> continuation);

    @POST("app-comms/receipt/tapped/{uuid}/")
    Object postIacInfoBannerTapped(@Path("uuid") UUID uuid, @Body ApiIacActionRequest apiIacActionRequest, Continuation<? super Unit> continuation);
}
