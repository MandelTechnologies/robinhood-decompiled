package bonfire.proto.idl.accounts.p028v1;

import bonfire.proto.idl.accounts.p028v1.FundingOptionsRequestDto;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
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
import retrofit2.http.Path;
import retrofit2.http.Query;
import rosetta.account.BrokerageAccountTypeDto;
import rosetta.account.ManagementTypeDto;

/* compiled from: AccountsServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JD\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJZ\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013H§@¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001aH§@¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b \u0010!J6\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0003H§@¢\u0006\u0004\b#\u0010$¨\u0006%"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/AccountsServiceRetrofit;", "", "", "", "headers", "account_number", "nickname", "Lretrofit2/Response;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto;", "ValidateNickname", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto;", CarResultComposable2.BODY, "Lbonfire/proto/idl/accounts/v1/CreateApplicationResponseDto;", "CreateApplication", "(Ljava/util/Map;Lbonfire/proto/idl/accounts/v1/CreateApplicationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entry_point", "Lbonfire/proto/idl/accounts/v1/FundingOptionsRequestDto$LocationDto;", "location", "Lbonfire/proto/idl/accounts/v1/FundingOptionsRequestDto$LayoutDto;", "requested_layout", "Lbonfire/proto/idl/accounts/v1/FundingOptionsResponseDto;", "FundingOptions", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/accounts/v1/FundingOptionsRequestDto$LocationDto;Lbonfire/proto/idl/accounts/v1/FundingOptionsRequestDto$LayoutDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrosetta/account/BrokerageAccountTypeDto;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementTypeDto;", "management_type", "Lbonfire/proto/idl/accounts/v1/AccountOnboardingEligibilityResponseDto;", "AccountOnboardingEligibility", "(Ljava/util/Map;Lrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/AccountNumbersResponseDto;", "AccountNumbers", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/accounts/v1/AccountDashboardFooterResponseDto;", "AccountDashboardFooter", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes16.dex */
public interface AccountsServiceRetrofit {
    @GET("rad/accounts/{account_number}/dashboard_footer")
    Object AccountDashboardFooter(@HeaderMap Map<String, String> map, @Path("account_number") @IdlField(protoType = "string") String str, Continuation<Response<AccountDashboardFooterResponseDto>> continuation);

    @GET("rad/accounts/account_numbers")
    Object AccountNumbers(@HeaderMap Map<String, String> map, Continuation<Response<AccountNumbersResponseDto>> continuation);

    @GET("rad/accounts/onboarding/eligibility")
    Object AccountOnboardingEligibility(@HeaderMap Map<String, String> map, @Query("brokerageAccountType") BrokerageAccountTypeDto brokerageAccountTypeDto, @Query("managementType") ManagementTypeDto managementTypeDto, Continuation<Response<AccountOnboardingEligibilityResponseDto>> continuation);

    @POST("rad/accounts/create_application")
    Object CreateApplication(@HeaderMap Map<String, String> map, @Body CreateApplicationRequestDto createApplicationRequestDto, Continuation<Response<CreateApplicationResponseDto>> continuation);

    @GET("rad/accounts/{account_number}/funding_options")
    Object FundingOptions(@HeaderMap Map<String, String> map, @Path("account_number") @IdlField(protoType = "string") String str, @IdlField(protoType = "string") @Query("entryPoint") String str2, @Query("location") FundingOptionsRequestDto.LocationDto locationDto, @Query("requestedLayout") FundingOptionsRequestDto.LayoutDto layoutDto, Continuation<Response<FundingOptionsResponseDto>> continuation);

    @GET("rad/accounts/nickname/validate")
    Object ValidateNickname(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("accountNumber") String str, @IdlField(protoType = "string") @Query("nickname") String str2, Continuation<Response<ValidateNicknameResponseDto>> continuation);
}
