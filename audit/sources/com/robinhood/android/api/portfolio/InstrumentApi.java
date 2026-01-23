package com.robinhood.android.api.portfolio;

import com.robinhood.android.models.portfolio.api.ApiInstrumentDetails;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: InstrumentApi.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/api/portfolio/InstrumentApi;", "", "getInstrumentDetails", "Lcom/robinhood/android/models/portfolio/api/ApiInstrumentDetails;", "instrumentId", "Ljava/util/UUID;", "instrumentType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;", "displayType", "", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface InstrumentApi {
    @GET("instruments/{instrument_id}/list-item-details")
    Object getInstrumentDetails(@Path("instrument_id") UUID uuid, @Query("instrument_type") InstrumentType instrumentType, @Query("display_type") String str, Continuation<? super ApiInstrumentDetails> continuation);
}
