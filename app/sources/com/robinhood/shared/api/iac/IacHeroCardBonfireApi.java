package com.robinhood.shared.api.iac;

import com.robinhood.models.api.ApiIacActionRequest;
import com.robinhood.models.api.ApiIacHeroCardResponse;
import com.robinhood.models.api.IacDismissMethod;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: IacHeroCardBonfireApi.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J\"\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/api/iac/IacHeroCardBonfireApi;", "", "getHeroCard", "Lcom/robinhood/models/api/ApiIacHeroCardResponse;", "location", "", "instrumentId", "Ljava/util/UUID;", "currencyPairId", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postHeroCardSeen", "", "id", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postHeroCardTapped", "action", "Lcom/robinhood/models/api/ApiIacActionRequest;", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiIacActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postHeroCardDismissed", "method", "Lcom/robinhood/models/api/IacDismissMethod;", "(Ljava/util/UUID;Lcom/robinhood/models/api/IacDismissMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-iac_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface IacHeroCardBonfireApi {
    @GET("app-comms/surface/hero-card/")
    Object getHeroCard(@Query("location") String str, @Query("instrument_id") UUID uuid, @Query("currency_pair_id") UUID uuid2, Continuation<? super ApiIacHeroCardResponse> continuation);

    @POST("app-comms/receipt/dismiss/{id}/")
    Object postHeroCardDismissed(@Path("id") UUID uuid, @Query("method") IacDismissMethod iacDismissMethod, Continuation<? super Unit> continuation);

    @POST("app-comms/receipt/seen/{id}/")
    Object postHeroCardSeen(@Path("id") UUID uuid, Continuation<? super Unit> continuation);

    @POST("app-comms/receipt/tapped/{id}/")
    Object postHeroCardTapped(@Path("id") UUID uuid, @Body ApiIacActionRequest apiIacActionRequest, Continuation<? super Unit> continuation);
}
