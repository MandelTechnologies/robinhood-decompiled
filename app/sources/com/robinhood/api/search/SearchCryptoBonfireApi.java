package com.robinhood.api.search;

import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.g11n.iso.RegionCode;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.CryptoInstrumentType;
import com.robinhood.models.api.search.ApiSearchResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* compiled from: SearchCryptoBonfireApi.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JT\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0014\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\fH§@¢\u0006\u0002\u0010\rJ<\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH§@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/api/search/SearchCryptoBonfireApi;", "", "cryptoSearch", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/search/ApiSearchResult;", "query", "", "type", "Lcom/robinhood/models/api/CryptoInstrumentType;", "contentTypes", "Lcom/robinhood/models/CommaSeparatedList;", "additionalParams", "", "(Ljava/lang/String;Lcom/robinhood/models/api/CryptoInstrumentType;Lcom/robinhood/models/CommaSeparatedList;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cryptoSearchAnonymous", "region", "Lcom/robinhood/g11n/iso/RegionCode;", "(Lcom/robinhood/g11n/iso/RegionCode;Ljava/lang/String;Lcom/robinhood/models/CommaSeparatedList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface SearchCryptoBonfireApi {
    @GET("explore_cryptos/")
    @RequiresRegionGate(regionGates = {CryptoRegionGate.class})
    Object cryptoSearch(@Query("query") String str, @Query("instrument_type") CryptoInstrumentType cryptoInstrumentType, @Query("content_types") CommaSeparatedList<String> commaSeparatedList, @QueryMap Map<String, String> map, Continuation<? super PaginatedResult<ApiSearchResult>> continuation);

    @Headers({"X-Dont-Intercept-For-OAuth: 1", "X-Omit-Auth-Header: 1"})
    @GET("{region}/explore_cryptos/")
    @RequiresRegionGate(regionGates = {CryptoRegionGate.class})
    Object cryptoSearchAnonymous(@Path("region") RegionCode regionCode, @Query("query") String str, @Query("content_types") CommaSeparatedList<String> commaSeparatedList, Continuation<? super PaginatedResult<ApiSearchResult>> continuation);

    /* compiled from: SearchCryptoBonfireApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object cryptoSearch$default(SearchCryptoBonfireApi searchCryptoBonfireApi, String str, CryptoInstrumentType cryptoInstrumentType, CommaSeparatedList commaSeparatedList, Map map, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cryptoSearch");
            }
            if ((i & 2) != 0) {
                cryptoInstrumentType = null;
            }
            if ((i & 4) != 0) {
                commaSeparatedList = null;
            }
            if ((i & 8) != 0) {
                map = MapsKt.emptyMap();
            }
            return searchCryptoBonfireApi.cryptoSearch(str, cryptoInstrumentType, commaSeparatedList, map, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object cryptoSearchAnonymous$default(SearchCryptoBonfireApi searchCryptoBonfireApi, RegionCode regionCode, String str, CommaSeparatedList commaSeparatedList, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cryptoSearchAnonymous");
            }
            if ((i & 4) != 0) {
                commaSeparatedList = null;
            }
            return searchCryptoBonfireApi.cryptoSearchAnonymous(regionCode, str, commaSeparatedList, continuation);
        }
    }
}
