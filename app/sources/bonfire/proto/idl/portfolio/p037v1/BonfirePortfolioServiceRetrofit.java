package bonfire.proto.idl.portfolio.p037v1;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import com.robinhood.rosetta.common.CurrencyDto;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: BonfirePortfolioServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001Jz\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0002\u0010\u0011Jd\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioServiceRetrofit;", "", "GetAccountPositionDetails", "Lretrofit2/Response;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto;", "headers", "", "", "account_number", "instrument_id", "display_type", "position_instrument_type", "instrument_type", "chart_type", "Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;", "display_currency", "Lcom/robinhood/rosetta/common/CurrencyDto;", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionDetailChartTypeDto;Lcom/robinhood/rosetta/common/CurrencyDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetAccountPositionsV2", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto;", "positions_location", "Lbonfire/proto/idl/portfolio/v1/PositionsLocationDto;", "sort_direction", "Lbonfire/proto/idl/portfolio/v1/PositionsSortDirectionDto;", "sort_type", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionsLocationDto;Lbonfire/proto/idl/portfolio/v1/PositionsSortDirectionDto;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface BonfirePortfolioServiceRetrofit {
    @GET("portfolio/{account_number}/positions/{instrument_id}")
    Object GetAccountPositionDetails(@HeaderMap Map<String, String> map, @Path("account_number") @IdlField(protoType = "string") String str, @Path("instrument_id") @IdlField(protoType = "string") String str2, @IdlField(protoType = "string") @Query("display_type") String str3, @IdlField(protoType = "string") @Query("position_instrument_type") String str4, @IdlField(protoType = "string") @Query("instrument_type") String str5, @Query("chart_type") PositionDetailChartTypeDto positionDetailChartTypeDto, @Query("display_currency") CurrencyDto currencyDto, Continuation<Response<GetAccountPositionDetailsResponseDto>> continuation);

    @GET("portfolio/{account_number}/positions_v2")
    Object GetAccountPositionsV2(@HeaderMap Map<String, String> map, @Path("account_number") @IdlField(protoType = "string") String str, @IdlField(protoType = "string") @Query("instrument_type") String str2, @Query("positions_location") PositionsLocationDto positionsLocationDto, @Query("sort_direction") PositionsSortDirectionDto positionsSortDirectionDto, @IdlField(protoType = "string") @Query("sort_type") String str3, Continuation<Response<GetAccountPositionsV2ResponseDto>> continuation);
}
