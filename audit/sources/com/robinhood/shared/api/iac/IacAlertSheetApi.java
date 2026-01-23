package com.robinhood.shared.api.iac;

import com.robinhood.models.api.ApiIacAlertSheetAction;
import com.robinhood.models.api.ApiIacAlertSheetResponse;
import com.robinhood.models.api.IacAlertSheetDismissMethod;
import com.robinhood.models.p320db.IacAlertSheetLocation;
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

/* compiled from: IacAlertSheetApi.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JN\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\fH§@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0011J\"\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/api/iac/IacAlertSheetApi;", "", "getIacAlertSheet", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIacAlertSheetResponse;", "location", "Lcom/robinhood/models/db/IacAlertSheetLocation;", "instrumentId", "Ljava/util/UUID;", "currencyPairId", "optionChainId", "optionStrategy", "", "(Lcom/robinhood/models/db/IacAlertSheetLocation;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postIacBottomSheetSeen", "", "id", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postIacBottomSheetTapped", "action", "Lcom/robinhood/models/api/ApiIacAlertSheetAction;", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiIacAlertSheetAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postIacBottomSheetDismissed", "method", "Lcom/robinhood/models/api/IacAlertSheetDismissMethod;", "(Ljava/util/UUID;Lcom/robinhood/models/api/IacAlertSheetDismissMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-iac_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface IacAlertSheetApi {
    @GET("app-comms/surface/alert-sheet/")
    Object getIacAlertSheet(@Query("location") IacAlertSheetLocation iacAlertSheetLocation, @Query("instrument_id") UUID uuid, @Query("currency_pair_id") UUID uuid2, @Query("option_chain_id") UUID uuid3, @Query("option_strategy") String str, Continuation<? super Response<ApiIacAlertSheetResponse>> continuation);

    @POST("app-comms/receipt/dismiss/{id}/")
    Object postIacBottomSheetDismissed(@Path("id") UUID uuid, @Query("method") IacAlertSheetDismissMethod iacAlertSheetDismissMethod, Continuation<? super Unit> continuation);

    @POST("app-comms/receipt/seen/{id}/")
    Object postIacBottomSheetSeen(@Path("id") UUID uuid, Continuation<? super Unit> continuation);

    @POST("app-comms/receipt/tapped/{id}/")
    Object postIacBottomSheetTapped(@Path("id") UUID uuid, @Body ApiIacAlertSheetAction apiIacAlertSheetAction, Continuation<? super Unit> continuation);
}
