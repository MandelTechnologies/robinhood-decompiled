package md_server_proxy.service.p483v1;

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
import retrofit2.http.Query;

/* compiled from: MdServerProxyServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\\\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\f\u0010\rJ>\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lmd_server_proxy/service/v1/MdServerProxyServiceRetrofit;", "", "", "", "headers", "", "currency_pair_ids", "Lmd_server_proxy/service/v1/CurrencyCodeDto;", "display_currency_codes", "routing_group", "Lretrofit2/Response;", "Lmd_server_proxy/service/v1/GetQuotesResponseDto;", "GetQuotes", "(Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmd_server_proxy/service/v1/GetFundamentalsResponseDto;", "GetFundamentals", "(Ljava/util/Map;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes14.dex */
public interface MdServerProxyServiceRetrofit {
    @GET("md-server-proxy/v1/fundamentals")
    Object GetFundamentals(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("currencyPairIds") List<String> list, Continuation<Response<GetFundamentalsResponseDto>> continuation);

    @GET("md-server-proxy/v1/quotes")
    Object GetQuotes(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("currencyPairIds") List<String> list, @Query("displayCurrencyCodes") List<CurrencyCodeDto> list2, @IdlField(protoType = "string") @Query("routingGroup") String str, Continuation<Response<GetQuotesResponseDto>> continuation);
}
