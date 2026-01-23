package com.robinhood.android.api.rating;

import com.robinhood.models.api.ApiAnalystOverview;
import com.robinhood.models.api.ApiAnalystReport;
import com.robinhood.shared.equities.models.instrumentdetails.api.ApiInstrumentRatings;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* compiled from: RatingsApi.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/api/rating/RatingsApi;", "", "getInstrumentRatings", "Lcom/robinhood/shared/equities/models/instrumentdetails/api/ApiInstrumentRatings;", "instrumentId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAnalystOverview", "Lcom/robinhood/models/api/ApiAnalystOverview;", "getAnalystReport", "Lcom/robinhood/models/api/ApiAnalystReport;", "lib-api-ratings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface RatingsApi {
    @GET("ratings/{instrumentId}/overview/")
    Object getAnalystOverview(@Path("instrumentId") UUID uuid, Continuation<? super ApiAnalystOverview> continuation);

    @GET("ratings/{instrumentId}/full/")
    Object getAnalystReport(@Path("instrumentId") UUID uuid, Continuation<? super ApiAnalystReport> continuation);

    @GET("ratings/{instrumentId}/")
    Object getInstrumentRatings(@Path("instrumentId") UUID uuid, Continuation<? super ApiInstrumentRatings> continuation);
}
