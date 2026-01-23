package options_product.service;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: OnboardingServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJD\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J6\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Loptions_product/service/OnboardingServiceRetrofit;", "", "", "", "headers", "Loptions_product/service/GetNextOnboardingScreensRequestDto;", CarResultComposable2.BODY, "Lretrofit2/Response;", "Loptions_product/service/GetNextOnboardingScreensResponseDto;", "GetNextOnboardingScreens", "(Ljava/util/Map;Loptions_product/service/GetNextOnboardingScreensRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/UpdateOptionsSuitabilityInfoRequestDto;", "UpdateOptionsSuitabilityInfo", "(Ljava/util/Map;Loptions_product/service/UpdateOptionsSuitabilityInfoRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "account_number", "options_eligibility_knowledge_check_manual_review_m1", "Loptions_product/service/GetOptionsStatusResponseDto;", "GetOptionsStatus", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/ConfirmUserAnswersRequestDto;", "", "ConfirmUserAnswers", "(Ljava/util/Map;Loptions_product/service/ConfirmUserAnswersRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/GetAppointmentDataResponseDto;", "GetAppointmentData", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/CreateChatRequestDto;", "Loptions_product/service/CreateChatResponseDto;", "CreateChat", "(Ljava/util/Map;Loptions_product/service/CreateChatRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes25.dex */
public interface OnboardingServiceRetrofit {
    @POST("options-product/onboarding/confirm_user_answers")
    Object ConfirmUserAnswers(@HeaderMap Map<String, String> map, @Body ConfirmUserAnswersRequestDto confirmUserAnswersRequestDto, Continuation<Response<Unit>> continuation);

    @POST("options-product/onboarding/chat")
    Object CreateChat(@HeaderMap Map<String, String> map, @Body CreateChatRequestDto createChatRequestDto, Continuation<Response<CreateChatResponseDto>> continuation);

    @GET("options-product/onboarding/appointment/{account_number}")
    Object GetAppointmentData(@HeaderMap Map<String, String> map, @Path("account_number") @IdlField(protoType = "string") String str, Continuation<Response<GetAppointmentDataResponseDto>> continuation);

    @POST("options-product/onboarding/next_screens")
    Object GetNextOnboardingScreens(@HeaderMap Map<String, String> map, @Body GetNextOnboardingScreensRequestDto getNextOnboardingScreensRequestDto, Continuation<Response<GetNextOnboardingScreensResponseDto>> continuation);

    @GET("options-product/onboarding/status")
    Object GetOptionsStatus(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountNumber") String str, @IdlField(protoType = "string") @Query("optionsEligibilityKnowledgeCheckManualReviewM1") String str2, Continuation<Response<GetOptionsStatusResponseDto>> continuation);

    @POST("options-product/onboarding/update_suitability_info")
    Object UpdateOptionsSuitabilityInfo(@HeaderMap Map<String, String> map, @Body UpdateOptionsSuitabilityInfoRequestDto updateOptionsSuitabilityInfoRequestDto, Continuation<Response<Object>> continuation);
}
