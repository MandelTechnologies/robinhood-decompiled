package com.robinhood.api.retrofit;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.regiongate.CryptoDetailRegionGate;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCryptoActivation;
import com.robinhood.models.api.ApiCryptoCancelAllPendingOrders;
import com.robinhood.models.api.ApiCryptoCancelAllPendingOrdersRequest;
import com.robinhood.models.api.ApiCryptoOrder;
import com.robinhood.models.api.ApiCryptoOrderRequest;
import com.robinhood.models.api.ApiCryptoPortfolio;
import com.robinhood.models.api.ApiCurrencyPair;
import com.robinhood.models.api.ApiResidencyDocument;
import com.truelayer.payments.p419ui.utils.TestTags;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p479j$.time.Instant;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: Nummus.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\b\u0010\tJ:\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00102\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0013\u001a\u00020\u000eH§@¢\u0006\u0004\b\u001b\u0010\u0015J\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u001c2\b\b\u0001\u0010\u001f\u001a\u00020\u000eH§@¢\u0006\u0004\b \u0010\u0015J\u001a\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0004\b\"\u0010\u001eJ\"\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00022\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b%\u0010\u001eJ:\u0010,\u001a\u00020\u001a2\b\b\u0001\u0010&\u001a\u00020\u000e2\b\b\u0001\u0010(\u001a\u00020'2\b\b\u0001\u0010*\u001a\u00020)2\n\b\u0001\u0010+\u001a\u0004\u0018\u00010)H§@¢\u0006\u0004\b,\u0010-J \u00102\u001a\b\u0012\u0004\u0012\u000201002\b\b\u0001\u0010/\u001a\u00020.H§@¢\u0006\u0004\b2\u00103¨\u00064"}, m3636d2 = {"Lcom/robinhood/api/retrofit/Nummus;", "", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiCryptoActivation;", "getActivations", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiCryptoActivation$Request;", "request", "createActivation", "(Lcom/robinhood/models/api/ApiCryptoActivation$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cursor", "j$/time/Instant", "updatedAt", "Ljava/util/UUID;", "accountId", "Lcom/robinhood/models/api/ApiCryptoOrder;", "fetchOrders", "(Ljava/lang/String;Lj$/time/Instant;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forexOrderId", "fetchOrder", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiCryptoOrderRequest;", "cryptoOrderRequest", "submitOrder", "(Lcom/robinhood/models/api/ApiCryptoOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cancelOrder", "Lcom/robinhood/models/api/ApiCurrencyPair;", "fetchCurrencyPairs", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currencyPairId", "fetchCurrencyPair", "Lcom/robinhood/models/api/ApiCryptoPortfolio;", "fetchPortfolio", "state", "Lcom/robinhood/models/api/ApiResidencyDocument;", "fetchResidencyDocuments", "id", "Lokhttp3/RequestBody;", "documentType", "Lokhttp3/MultipartBody$Part;", "front", TestTags.BACK, "uploadResidencyDocument", "(Ljava/util/UUID;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/ApiCryptoCancelAllPendingOrdersRequest;", CarResultComposable2.BODY, "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiCryptoCancelAllPendingOrders;", "cancelAllPendingOrders", "(Lcom/robinhood/models/api/ApiCryptoCancelAllPendingOrdersRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface Nummus {
    @POST("orders/cancel_all_pending/")
    @RequiresRegionGate(regionGates = {CryptoRegionGate.class})
    Object cancelAllPendingOrders(@Body ApiCryptoCancelAllPendingOrdersRequest apiCryptoCancelAllPendingOrdersRequest, Continuation<? super Response<ApiCryptoCancelAllPendingOrders>> continuation);

    @POST("orders/{id}/cancel/")
    @RequiresRegionGate(regionGates = {CryptoRegionGate.class})
    Object cancelOrder(@Path("id") UUID uuid, Continuation<? super Unit> continuation);

    @POST("activations/")
    @RequiresRegionGate(regionGates = {CryptoRegionGate.class})
    Object createActivation(@Body ApiCryptoActivation.Request request, Continuation<? super ApiCryptoActivation> continuation);

    @GET("currency_pairs/{id}/")
    @RequiresRegionGate(regionGates = {CryptoDetailRegionGate.class})
    Object fetchCurrencyPair(@Path("id") UUID uuid, Continuation<? super ApiCurrencyPair> continuation);

    @GET("currency_pairs/")
    @RequiresRegionGate(regionGates = {CryptoDetailRegionGate.class})
    Object fetchCurrencyPairs(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiCurrencyPair>> continuation);

    @GET("orders/{id}/")
    @RequiresRegionGate(regionGates = {CryptoRegionGate.class})
    Object fetchOrder(@Path("id") UUID uuid, Continuation<? super ApiCryptoOrder> continuation);

    @GET("orders/")
    @RequiresRegionGate(regionGates = {CryptoRegionGate.class})
    Object fetchOrders(@Query("cursor") String str, @Query("updated_at[gte]") Instant instant, @Query("account_id") UUID uuid, Continuation<? super PaginatedResult<ApiCryptoOrder>> continuation);

    @GET("portfolios/{id}/")
    @RequiresRegionGate(regionGates = {CryptoRegionGate.class})
    Object fetchPortfolio(@Path("id") String str, Continuation<? super ApiCryptoPortfolio> continuation);

    @GET("residency_documents/")
    @RequiresRegionGate(regionGates = {CryptoRegionGate.class})
    Object fetchResidencyDocuments(@Query("state") String str, Continuation<? super PaginatedResult<ApiResidencyDocument>> continuation);

    @GET("activations/")
    @RequiresRegionGate(regionGates = {CryptoRegionGate.class})
    Object getActivations(Continuation<? super PaginatedResult<ApiCryptoActivation>> continuation);

    @POST("orders/")
    @RequiresRegionGate(regionGates = {CryptoRegionGate.class})
    Object submitOrder(@Body ApiCryptoOrderRequest apiCryptoOrderRequest, Continuation<? super ApiCryptoOrder> continuation);

    @POST("residency_documents/{id}/upload/")
    @RequiresRegionGate(regionGates = {CryptoRegionGate.class})
    @Multipart
    Object uploadResidencyDocument(@Path("id") UUID uuid, @Part("document_type") RequestBody requestBody, @Part MultipartBody.Part part, @Part MultipartBody.Part part2, Continuation<? super Unit> continuation);

    /* compiled from: Nummus.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object fetchResidencyDocuments$default(Nummus nummus2, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchResidencyDocuments");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return nummus2.fetchResidencyDocuments(str, continuation);
        }
    }
}
