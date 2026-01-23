package rosetta.portfolio.p541v1;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import com.robinhood.rosetta.common.CurrencyDto;
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

/* compiled from: PortfolioRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JN\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJh\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lrosetta/portfolio/v1/PortfolioRetrofit;", "", "", "", "headers", "account", "bounds", "Lcom/robinhood/rosetta/common/CurrencyDto;", "display_currency", "Lretrofit2/Response;", "Lrosetta/portfolio/v1/GetAccountValueResponseDto;", "GetAccountValue", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/CurrencyDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rhs_account_number", "", "Lrosetta/portfolio/v1/SpanDto;", "spans", "Lrosetta/portfolio/v1/AssetClassDto;", "asset_classes", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryResponseDto;", "GetRealizedPerformanceSummary", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/common/CurrencyDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes25.dex */
public interface PortfolioRetrofit {
    @GET("portfolios/{account}")
    Object GetAccountValue(@HeaderMap Map<String, String> map, @Path("account") @IdlField(protoType = "string") String str, @IdlField(protoType = "string") @Query("bounds") String str2, @Query("displayCurrency") CurrencyDto currencyDto, Continuation<Response<GetAccountValueResponseDto>> continuation);

    @GET("portfolios/v2/pnl/realized-performance-summary")
    Object GetRealizedPerformanceSummary(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("rhsAccountNumber") String str, @Query("spans") List<SpanDto> list, @Query("assetClasses") List<AssetClassDto> list2, @Query("displayCurrency") CurrencyDto currencyDto, Continuation<Response<GetRealizedPerformanceSummaryResponseDto>> continuation);
}
