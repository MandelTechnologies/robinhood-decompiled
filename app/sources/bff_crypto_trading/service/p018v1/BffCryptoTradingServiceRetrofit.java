package bff_crypto_trading.service.p018v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: BffCryptoTradingServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b\f\u0010\rJ8\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00032\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u001a\u0010\u0011J6\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b!\u0010\b¨\u0006\""}, m3636d2 = {"Lbff_crypto_trading/service/v1/BffCryptoTradingServiceRetrofit;", "", "", "", "headers", "Lretrofit2/Response;", "Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto;", "GetCryptoI18NRegions", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_crypto_trading/service/v1/CryptoAssetTypeDto;", "asset_type", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateResponseDto;", "GetCryptoExploreState", "(Ljava/util/Map;Lbff_crypto_trading/service/v1/CryptoAssetTypeDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currency_pair_id", "Lbff_crypto_trading/service/v1/GetCryptoDetailPageStateResponseDto;", "GetCryptoDetailPageState", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "region", "Lbff_crypto_trading/service/v1/GetCryptoDetailPageStateLoggedOutResponseDto;", "GetCryptoDetailPageStateLoggedOut", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_crypto_trading/service/v1/GetCryptoExploreStateLoggedOutResponseDto;", "GetCryptoExploreStateLoggedOut", "(Ljava/util/Map;Ljava/lang/String;Lbff_crypto_trading/service/v1/CryptoAssetTypeDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponseDto;", "GetCryptoTokenizedStocksOrderEntryConfig", "Lbff_crypto_trading/service/v1/PostRHWTokenRequestDto;", CarResultComposable2.BODY, "Lbff_crypto_trading/service/v1/PostRHWTokenResponseDto;", "PostRHWToken", "(Ljava/util/Map;Lbff_crypto_trading/service/v1/PostRHWTokenRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbff_crypto_trading/service/v1/GetWatchlistExplainerResponseDto;", "GetWatchlistExplainer", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface BffCryptoTradingServiceRetrofit {
    @GET("crypto-trading/cdp/state")
    Object GetCryptoDetailPageState(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("currencyPairId") String str, Continuation<Response<GetCryptoDetailPageStateResponseDto>> continuation);

    @GET("crypto-trading/{region}/cdp/state")
    Object GetCryptoDetailPageStateLoggedOut(@HeaderMap Map<String, String> map, @Path("region") @IdlField(protoType = "string") String str, @IdlField(protoType = "string") @Query("currencyPairId") String str2, Continuation<Response<GetCryptoDetailPageStateLoggedOutResponseDto>> continuation);

    @GET("crypto-trading/explore/state")
    Object GetCryptoExploreState(@HeaderMap Map<String, String> map, @Query("assetType") CryptoAssetTypeDto cryptoAssetTypeDto, Continuation<Response<GetCryptoExploreStateResponseDto>> continuation);

    @GET("crypto-trading/{region}/explore/state")
    Object GetCryptoExploreStateLoggedOut(@HeaderMap Map<String, String> map, @Path("region") @IdlField(protoType = "string") String str, @Query("assetType") CryptoAssetTypeDto cryptoAssetTypeDto, Continuation<Response<GetCryptoExploreStateLoggedOutResponseDto>> continuation);

    @GET("crypto-trading/i18n/regions")
    Object GetCryptoI18NRegions(@HeaderMap Map<String, String> map, Continuation<Response<GetCryptoI18NRegionsResponseDto>> continuation);

    @GET("crypto-trading/tokenized-stocks/order-entry-config")
    Object GetCryptoTokenizedStocksOrderEntryConfig(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("currencyPairId") String str, Continuation<Response<GetCryptoTokenizedStocksOrderEntryConfigResponseDto>> continuation);

    @GET("crypto-trading/watchlist/explainer")
    Object GetWatchlistExplainer(@HeaderMap Map<String, String> map, Continuation<Response<GetWatchlistExplainerResponseDto>> continuation);

    @POST("crypto-trading/rhw-token")
    Object PostRHWToken(@HeaderMap Map<String, String> map, @Body PostRHWTokenRequestDto postRHWTokenRequestDto, Continuation<Response<PostRHWTokenResponseDto>> continuation);
}
