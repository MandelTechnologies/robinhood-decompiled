package com.robinhood.api.equity;

import com.robinhood.models.api.ApiProxyCommunication;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* compiled from: EquitiesSay.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/api/equity/EquitiesSay;", "", "getInstrumentProxyCommunications", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiProxyCommunication;", "instrumentId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface EquitiesSay {
    @GET("say-brokers/robinhood/v1/proxy-communications/{instrumentId}/")
    Object getInstrumentProxyCommunications(@Path("instrumentId") UUID uuid, Continuation<? super Response<ApiProxyCommunication>> continuation);
}
