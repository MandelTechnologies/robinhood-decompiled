package acats_aggregation.service.p001v1;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;

/* compiled from: AcatsAggregationServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ@\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u0003H§@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u000f\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lacats_aggregation/service/v1/AcatsAggregationServiceRetrofit;", "", "", "", "headers", "Lretrofit2/Response;", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryResponseDto;", "FeeReimbursementsHistory", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "account_number", "id", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailsResponseDto;", "FeeReimbursementsHistoryDetails", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lacats_aggregation/service/v1/PlaidIntroResponseDto;", "PlaidIntro", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes23.dex */
public interface AcatsAggregationServiceRetrofit {
    @GET("acats-aggregation/fee_reimbursements/history")
    Object FeeReimbursementsHistory(@HeaderMap Map<String, String> map, Continuation<Response<FeeReimbursementsHistoryResponseDto>> continuation);

    @GET("acats-aggregation/fee_reimbursements/history/details/{account_number}/{id}")
    Object FeeReimbursementsHistoryDetails(@HeaderMap Map<String, String> map, @Path("account_number") @IdlField(protoType = "string") String str, @Path("id") @IdlField(protoType = "string") String str2, Continuation<Response<FeeReimbursementsHistoryDetailsResponseDto>> continuation);

    @GET("acats-aggregation/plaid_intro")
    Object PlaidIntro(@HeaderMap Map<String, String> map, Continuation<Response<PlaidIntroResponseDto>> continuation);
}
