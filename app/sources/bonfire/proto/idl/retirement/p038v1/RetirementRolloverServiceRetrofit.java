package bonfire.proto.idl.retirement.p038v1;

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

/* compiled from: RetirementRolloverServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001JN\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lbonfire/proto/idl/retirement/v1/RetirementRolloverServiceRetrofit;", "", "GetAccountDetails", "Lretrofit2/Response;", "Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto;", "headers", "", "", "access_token_id", "broker_name", "account_number", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.proto.idl.retirement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface RetirementRolloverServiceRetrofit {
    @GET("rad/retirement/rollover_401k/account_details")
    Object GetAccountDetails(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("access_token_id") String str, @IdlField(protoType = "string") @Query("broker_name") String str2, @IdlField(protoType = "string") @Query("account_number") String str3, Continuation<Response<GetAccountDetailsResponseDto>> continuation);
}
