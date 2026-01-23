package com.robinhood.android.redesigninvesting.api.highlights.volatility;

import com.robinhood.android.redesigninvesting.models.highlights.volatility.api.ApiFundamentalRisk;
import com.robinhood.models.PaginatedResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: HighlightsMarketdataApi.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/api/highlights/volatility/HighlightsMarketdataApi;", "", "getFundamentalRisks", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/redesigninvesting/models/highlights/volatility/api/ApiFundamentalRisk;", "commaSeparatedInstrumentIds", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-highlights-volatility_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface HighlightsMarketdataApi {
    @GET("fundamentals/risk/")
    Object getFundamentalRisks(@Query("ids") String str, Continuation<? super PaginatedResult<ApiFundamentalRisk>> continuation);
}
