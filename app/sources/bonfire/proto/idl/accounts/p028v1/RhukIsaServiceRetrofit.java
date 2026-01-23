package bonfire.proto.idl.accounts.p028v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

/* compiled from: RhukIsaServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/RhukIsaServiceRetrofit;", "", "", "", "headers", "Lretrofit2/Response;", "Lbonfire/proto/idl/accounts/v1/GetIsaBonusPromotionResponseDto;", "GetIsaBonusPromotion", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountRequestDto;", CarResultComposable2.BODY, "Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountResponseDto;", "IsUserEligibleForAccount", "(Ljava/util/Map;Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface RhukIsaServiceRetrofit {
    @GET("rad/rhuk_isa/bonus_promotion")
    Object GetIsaBonusPromotion(@HeaderMap Map<String, String> map, Continuation<Response<GetIsaBonusPromotionResponseDto>> continuation);

    @POST("rad/rhuk_isa/is_user_eligible")
    Object IsUserEligibleForAccount(@HeaderMap Map<String, String> map, @Body IsUserEligibleForAccountRequestDto isUserEligibleForAccountRequestDto, Continuation<Response<IsUserEligibleForAccountResponseDto>> continuation);
}
