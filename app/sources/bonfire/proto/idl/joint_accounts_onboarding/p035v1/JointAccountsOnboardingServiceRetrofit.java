package bonfire.proto.idl.joint_accounts_onboarding.p035v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import com.robinhood.android.jointaccounts.DeeplinkTargetsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: JointAccountsOnboardingServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J8\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\b\u0010\tJB\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0014\u0010\tJD\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u0017\u0010\u000eJ6\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u001aJ6\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountsOnboardingServiceRetrofit;", "", "", "", "headers", DeeplinkTargetsKt.INVITATION_ID_QUERY_KEY, "Lretrofit2/Response;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto;", "FetchSecondaryPostAgreements", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "account_number", "entry_point", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto;", "FetchJointAccountCreated", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/SignSweepAgreementsRequestDto;", CarResultComposable2.BODY, "SignSweepAgreements", "(Ljava/util/Map;Lbonfire/proto/idl/joint_accounts_onboarding/v1/SignSweepAgreementsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/GetGoldFeaturesResponseDto;", "GetGoldFeatures", "product_context", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/JointAccountCoOwnerQuestionnaireCompletedResponseDto;", "JointAccountCoOwnerQuestionnaireCompleted", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/SignMarginAgreementsRequestDto;", "SignMarginAgreements", "(Ljava/util/Map;Lbonfire/proto/idl/joint_accounts_onboarding/v1/SignMarginAgreementsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/SendCoOwnerIpEmailRequestDto;", "SendCoOwnerIpEmail", "(Ljava/util/Map;Lbonfire/proto/idl/joint_accounts_onboarding/v1/SendCoOwnerIpEmailRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface JointAccountsOnboardingServiceRetrofit {
    @GET("joint_accounts/new_user_experience/{account_number}/account_created")
    Object FetchJointAccountCreated(@HeaderMap Map<String, String> map, @Path("account_number") @IdlField(protoType = "string") String str, @IdlField(protoType = "string") @Query("entryPoint") String str2, Continuation<Response<FetchJointAccountCreatedResponseDto>> continuation);

    @GET("joint_accounts/onboarding/secondary_post_agreements/v2")
    Object FetchSecondaryPostAgreements(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("invitationId") String str, Continuation<Response<FetchSecondaryPostAgreementsResponseDto>> continuation);

    @GET("joint_accounts/gold_features/{account_number}")
    Object GetGoldFeatures(@HeaderMap Map<String, String> map, @Path("account_number") @IdlField(protoType = "string") String str, Continuation<Response<GetGoldFeaturesResponseDto>> continuation);

    @GET("joint_accounts/co_owner/questionnaire_completed")
    Object JointAccountCoOwnerQuestionnaireCompleted(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("productContext") String str, @IdlField(protoType = "string") @Query("accountNumber") String str2, Continuation<Response<JointAccountCoOwnerQuestionnaireCompletedResponseDto>> continuation);

    @POST("joint_accounts/margin/send_co_owner_ip_email")
    Object SendCoOwnerIpEmail(@HeaderMap Map<String, String> map, @Body SendCoOwnerIpEmailRequestDto sendCoOwnerIpEmailRequestDto, Continuation<Response<Object>> continuation);

    @POST("joint_accounts/sign_margin_agreements")
    Object SignMarginAgreements(@HeaderMap Map<String, String> map, @Body SignMarginAgreementsRequestDto signMarginAgreementsRequestDto, Continuation<Response<Object>> continuation);

    @POST("joint_accounts/sign_sweep_agreements")
    Object SignSweepAgreements(@HeaderMap Map<String, String> map, @Body SignSweepAgreementsRequestDto signSweepAgreementsRequestDto, Continuation<Response<Object>> continuation);
}
