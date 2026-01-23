package account_aggregation.service.p005v1;

import account_aggregation.service.models.p004v1.AccountSwitcherLocationDto;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Query;

/* compiled from: AccountAggregationServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Laccount_aggregation/service/v1/AccountAggregationServiceRetrofit;", "", "GetAccountSwitcher", "Lretrofit2/Response;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto;", "headers", "", "", "asset_id", "location", "Laccount_aggregation/service/models/v1/AccountSwitcherLocationDto;", "(Ljava/util/Map;Ljava/lang/String;Laccount_aggregation/service/models/v1/AccountSwitcherLocationDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "account_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes23.dex */
public interface AccountAggregationServiceRetrofit {
    @GET("account-aggregation/v1/account_switcher")
    Object GetAccountSwitcher(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("assetId") String str, @Query("location") AccountSwitcherLocationDto accountSwitcherLocationDto, Continuation<Response<GetAccountSwitcherResponseDto>> continuation);
}
