package bonfire.proto.idl.crypto.p033v1;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: CryptoServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J8\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\b\u0010\tJD\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0014\u0010\tJ8\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u0017\u0010\tJ8\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u001a\u0010\tJ8\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u001c\u0010\tJV\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0010\b\u0001\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001fH§@¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/CryptoServiceRetrofit;", "", "", "", "headers", "currency_id", "Lretrofit2/Response;", "Lbonfire/proto/idl/crypto/v1/NewsfeedResponseDto;", "Newsfeed", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "location", "asset_type", "Lbonfire/proto/idl/crypto/v1/GetCryptoCategoriesResponseDto;", "GetCryptoCategories", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto;", "GetNonCurrencyPairAccountSwitcher", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currency_pair_id", "Lbonfire/proto/idl/crypto/v1/GetCurrencyPairAccountSwitcherResponseDto;", "GetCurrencyPairAccountSwitcher", "rhs_account_number", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto;", "GetCryptoUserAgreements", "account_id", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto;", "GetCryptoPulsePreview", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedResponseDto;", "GetCryptoPulseFeed", "", "currency_pair_ids", "", "include_digest", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;", "GetCryptoPulseFeedRefresh", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface CryptoServiceRetrofit {
    @GET("crypto/categories")
    Object GetCryptoCategories(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("location") String str, @IdlField(protoType = "string") @Query("assetType") String str2, Continuation<Response<GetCryptoCategoriesResponseDto>> continuation);

    @GET("crypto/pulse/feed")
    Object GetCryptoPulseFeed(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountId") String str, Continuation<Response<GetCryptoPulseFeedResponseDto>> continuation);

    @GET("crypto/pulse/feed/refresh")
    Object GetCryptoPulseFeedRefresh(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountId") String str, @IdlField(protoType = "string") @Query("currencyPairIds") List<String> list, @IdlField(protoType = "bool") @Query("includeDigest") Boolean bool, Continuation<Response<GetCryptoPulseFeedRefreshResponseDto>> continuation);

    @GET("crypto/pulse/preview")
    Object GetCryptoPulsePreview(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountId") String str, Continuation<Response<GetCryptoPulsePreviewResponseDto>> continuation);

    @GET("crypto/agreements")
    Object GetCryptoUserAgreements(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("rhsAccountNumber") String str, Continuation<Response<GetCryptoUserAgreementsResponseDto>> continuation);

    @GET("crypto/account_switcher/currency_pair/{currency_pair_id}")
    Object GetCurrencyPairAccountSwitcher(@HeaderMap Map<String, String> map, @Path("currency_pair_id") @IdlField(protoType = "string") String str, Continuation<Response<GetCurrencyPairAccountSwitcherResponseDto>> continuation);

    @GET("crypto/account_switcher/non_currency_pair")
    Object GetNonCurrencyPairAccountSwitcher(@HeaderMap Map<String, String> map, Continuation<Response<GetNonCurrencyPairAccountSwitcherResponseDto>> continuation);

    @GET("crypto/newsfeed")
    Object Newsfeed(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("currencyId") String str, Continuation<Response<NewsfeedResponseDto>> continuation);
}
