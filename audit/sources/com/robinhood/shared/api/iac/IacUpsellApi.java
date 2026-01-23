package com.robinhood.shared.api.iac;

import android.annotation.SuppressLint;
import com.robinhood.models.p355ui.IacUpsellLocation;
import com.robinhood.models.p355ui.IacUpsellResponse;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: IacUpsellApi.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J`\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/api/iac/IacUpsellApi;", "", "getIacUpsell", "Lcom/robinhood/models/ui/IacUpsellResponse;", "location", "Lcom/robinhood/models/ui/IacUpsellLocation;", "instrumentId", "Ljava/util/UUID;", "orderId", "depositId", "accountNumber", "", "entryPoint", "notificationStatus", "", "(Lcom/robinhood/models/ui/IacUpsellLocation;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postHeroCardSeen", "", "id", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-iac_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface IacUpsellApi {
    @GET("app-comms/surface/upsell/")
    Object getIacUpsell(@Query("location") IacUpsellLocation iacUpsellLocation, @Query("instrument_id") UUID uuid, @Query("order_id") UUID uuid2, @Query("deposit_id") UUID uuid3, @Query("account_number") String str, @Query("entry_point") String str2, @Query("notification_status") Boolean bool, Continuation<? super IacUpsellResponse> continuation);

    @POST("app-comms/receipt/seen/{id}/")
    @SuppressLint({"NoNewRetrofitEndpoints"})
    Object postHeroCardSeen(@Path("id") UUID uuid, Continuation<? super Unit> continuation);
}
