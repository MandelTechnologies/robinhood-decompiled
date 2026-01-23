package com.robinhood.android.lib.api.futures;

import com.robinhood.android.models.futures.api.marketdata.ApiFuturesClosePrices;
import com.robinhood.android.models.futures.api.marketdata.ApiFuturesClosesRange;
import com.robinhood.android.models.futures.api.marketdata.ApiFuturesFundamentals;
import com.robinhood.android.models.futures.api.marketdata.ApiFuturesHistorical;
import com.robinhood.android.models.futures.api.marketdata.ApiFuturesQuote;
import com.robinhood.android.models.futures.api.marketdata.ApiMarketdataResponse;
import com.robinhood.models.p355ui.Historical;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p479j$.time.Instant;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: FuturesMarketdataApi.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J>\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\nJL\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0004\b\u0011\u0010\u0012JL\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u00070\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0004\b\u0014\u0010\u0012J8\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00060\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00070\u00060\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00060\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/lib/api/futures/FuturesMarketdataApi;", "", "", "commaSeparatedContractIds", "location", "Lretrofit2/Response;", "Lcom/robinhood/android/models/futures/api/marketdata/ApiMarketdataResponse;", "", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesQuote;", "getQuotes", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/ui/Historical$Interval;", "interval", "j$/time/Instant", "start", "end", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesHistorical;", "getHistoricals", "(Ljava/lang/String;Lcom/robinhood/models/ui/Historical$Interval;Lj$/time/Instant;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commaSeparatedProductIds", "getProductHistoricals", InquiryField.DateField.TYPE, "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesClosePrices;", "getCloses", "(Ljava/lang/String;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesClosesRange;", "getClosesRange", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesFundamentals;", "getFundamentals", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface FuturesMarketdataApi {
    @GET("futures/closes/v1/")
    Object getCloses(@Query("ids") String str, @Query(InquiryField.DateField.TYPE) Instant instant, Continuation<? super ApiMarketdataResponse<List<ApiMarketdataResponse<ApiFuturesClosePrices>>>> continuation);

    @GET("futures/closesrange/v1/")
    Object getClosesRange(@Query("ids") String str, @Query("start") Instant instant, @Query("end") Instant instant2, Continuation<? super ApiMarketdataResponse<List<ApiMarketdataResponse<List<ApiFuturesClosesRange>>>>> continuation);

    @GET("futures/fundamentals/v1/")
    Object getFundamentals(@Query("ids") String str, Continuation<? super ApiMarketdataResponse<List<ApiMarketdataResponse<ApiFuturesFundamentals>>>> continuation);

    @GET("futures/historicals/contracts/v1/")
    Object getHistoricals(@Query("ids") String str, @Query("interval") Historical.Interval interval, @Query("start") Instant instant, @Query("end") Instant instant2, Continuation<? super ApiMarketdataResponse<List<ApiMarketdataResponse<ApiFuturesHistorical>>>> continuation);

    @GET("futures/historicals/products/v1/")
    Object getProductHistoricals(@Query("ids") String str, @Query("interval") Historical.Interval interval, @Query("start") Instant instant, @Query("end") Instant instant2, Continuation<? super ApiMarketdataResponse<List<ApiMarketdataResponse<ApiFuturesHistorical>>>> continuation);

    @GET("futures/quotes/v1/")
    Object getQuotes(@Query("ids") String str, @Query("location") String str2, Continuation<? super Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiFuturesQuote>>>>> continuation);

    /* compiled from: FuturesMarketdataApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getQuotes$default(FuturesMarketdataApi futuresMarketdataApi, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getQuotes");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return futuresMarketdataApi.getQuotes(str, str2, continuation);
        }

        public static /* synthetic */ Object getCloses$default(FuturesMarketdataApi futuresMarketdataApi, String str, Instant instant, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCloses");
            }
            if ((i & 2) != 0) {
                instant = null;
            }
            return futuresMarketdataApi.getCloses(str, instant, continuation);
        }

        public static /* synthetic */ Object getClosesRange$default(FuturesMarketdataApi futuresMarketdataApi, String str, Instant instant, Instant instant2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getClosesRange");
            }
            if ((i & 4) != 0) {
                instant2 = null;
            }
            return futuresMarketdataApi.getClosesRange(str, instant, instant2, continuation);
        }
    }
}
