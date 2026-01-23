package bonfire.proto.idl.advisory.p030v1;

import bonfire.proto.idl.transfers.p040v1.TransferAccountTypeDto;
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
import retrofit2.http.Query;

/* compiled from: AdvisoryOnboardingServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJr\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/AdvisoryOnboardingServiceRetrofit;", "", "CreateAdvisoryApplication", "Lretrofit2/Response;", "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationResponseDto;", "headers", "", "", CarResultComposable2.BODY, "Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationRequestDto;", "(Ljava/util/Map;Lbonfire/proto/idl/advisory/v1/CreateAdvisoryApplicationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetAdvisorySwipeToSubmitDetails", "Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsResponseDto;", "account_number", "transfer_amount_display_string", "source_account_display_name", "transfer_account_type", "context", "Lbonfire/proto/idl/advisory/v1/SwipeToSubmitDetailsContextDto;", "source_transfer_account_type", "Lbonfire/proto/idl/transfers/v1/TransferAccountTypeDto;", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisory/v1/SwipeToSubmitDetailsContextDto;Lbonfire/proto/idl/transfers/v1/TransferAccountTypeDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface AdvisoryOnboardingServiceRetrofit {
    @POST("advisory/create_application")
    Object CreateAdvisoryApplication(@HeaderMap Map<String, String> map, @Body CreateAdvisoryApplicationRequestDto createAdvisoryApplicationRequestDto, Continuation<Response<CreateAdvisoryApplicationResponseDto>> continuation);

    @GET("rad/advisory/onboarding/swipe_details")
    Object GetAdvisorySwipeToSubmitDetails(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountNumber") String str, @IdlField(protoType = "string") @Query("transferAmountDisplayString") String str2, @IdlField(protoType = "string") @Query("sourceAccountDisplayName") String str3, @IdlField(protoType = "string") @Query("transferAccountType") String str4, @Query("context") SwipeToSubmitDetailsContextDto swipeToSubmitDetailsContextDto, @Query("sourceTransferAccountType") TransferAccountTypeDto transferAccountTypeDto, Continuation<Response<GetAdvisorySwipeToSubmitDetailsResponseDto>> continuation);
}
