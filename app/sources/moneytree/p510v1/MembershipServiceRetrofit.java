package moneytree.p510v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.rosetta.common.CurrencyDto;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: MembershipServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJB\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lmoneytree/v1/MembershipServiceRetrofit;", "", "UpdateMembership", "Lretrofit2/Response;", "Lmoneytree/v1/UpdateMembershipResponseDto;", "headers", "", "", CarResultComposable2.BODY, "Lmoneytree/v1/UpdateMembershipRequestDto;", "(Ljava/util/Map;Lmoneytree/v1/UpdateMembershipRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetMembershipDetails", "Lmoneytree/v1/GetMembershipDetailsResponseDto;", "vendor", "Lmoneytree/v1/VendorDto;", "currency", "Lcom/robinhood/rosetta/common/CurrencyDto;", "(Ljava/util/Map;Lmoneytree/v1/VendorDto;Lcom/robinhood/rosetta/common/CurrencyDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes14.dex */
public interface MembershipServiceRetrofit {
    @GET("moneytree/membership/details")
    Object GetMembershipDetails(@HeaderMap Map<String, String> map, @Query("vendor") VendorDto vendorDto, @Query("currency") CurrencyDto currencyDto, Continuation<Response<GetMembershipDetailsResponseDto>> continuation);

    @POST("moneytree/membership/update")
    Object UpdateMembership(@HeaderMap Map<String, String> map, @Body UpdateMembershipRequestDto updateMembershipRequestDto, Continuation<Response<UpdateMembershipResponseDto>> continuation);
}
