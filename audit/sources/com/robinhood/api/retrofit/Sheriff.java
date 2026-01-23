package com.robinhood.api.retrofit;

import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiLoginRequest;
import com.robinhood.models.api.ApiLogoutRequest;
import com.robinhood.models.api.ApplicationIsInternalResponse;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.CreateChallengeResponse;
import com.robinhood.models.api.DeviceSecurityConfig;
import com.robinhood.models.api.DisableRemoveDeviceResponse;
import com.robinhood.models.api.GenericMessage;
import com.robinhood.models.api.Mfa;
import com.robinhood.models.api.OAuthAuthorizeRequest;
import com.robinhood.models.api.OAuthAuthorizeResponse;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.models.api.PromptsPendingChallengeResponse;
import com.robinhood.models.api.PromptsStatusResponse;
import com.robinhood.models.api.PromptsUserEnrollmentResponse;
import com.robinhood.models.api.WebauthnChallenge;
import com.robinhood.models.api.WebauthnCredential;
import com.robinhood.models.api.sheriff.ApiUser;
import com.robinhood.models.api.sheriff.ApiUserEmailValidationResponse;
import com.robinhood.models.api.sheriff.ApiUserVerifyEmailInfo;
import com.robinhood.models.api.sheriff.ApiUserVerifyPhoneInfo;
import com.robinhood.models.api.sheriff.OAuthGrantType;
import com.robinhood.models.api.sheriff.secretcode.ApiSecretCode;
import com.robinhood.models.api.sheriff.secretcode.ApiSecretCodeRequest;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.utils.http.Headers;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: Sheriff.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010\bJT\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0012\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u0011\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u001fH§@¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\"2\b\b\u0001\u0010\u001e\u001a\u00020#H§@¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\u00020\"2\b\b\u0001\u0010\u001e\u001a\u00020#H§@¢\u0006\u0002\u0010$J\u0018\u0010&\u001a\u00020\"2\b\b\u0001\u0010\u001e\u001a\u00020'H§@¢\u0006\u0002\u0010(J\u0018\u0010)\u001a\u00020*2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010+J\"\u0010,\u001a\u00020*2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010-\u001a\u00020.H§@¢\u0006\u0002\u0010/J\"\u00100\u001a\u00020*2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010-\u001a\u00020.H§@¢\u0006\u0002\u0010/J\"\u00101\u001a\u00020*2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u00102\u001a\u000203H§@¢\u0006\u0002\u00104J\u000e\u00105\u001a\u000206H§@¢\u0006\u0002\u00107J\u0018\u00108\u001a\u00020\u00152\b\b\u0001\u0010\u001e\u001a\u000209H§@¢\u0006\u0002\u0010:J\u0018\u0010;\u001a\u0002062\b\b\u0001\u0010\u001e\u001a\u00020<H§@¢\u0006\u0002\u0010=J\u0018\u0010>\u001a\u0002062\b\b\u0001\u0010\u001e\u001a\u00020?H§@¢\u0006\u0002\u0010@J\u000e\u0010A\u001a\u00020BH§@¢\u0006\u0002\u00107J\u0018\u0010C\u001a\u00020D2\b\b\u0001\u0010E\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u001bJ\u000e\u0010F\u001a\u00020GH§@¢\u0006\u0002\u00107J\u0018\u0010H\u001a\u00020I2\b\b\u0001\u0010E\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u001bJ\u0018\u0010J\u001a\u00020\u00152\b\b\u0001\u0010K\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u001bJ\"\u0010L\u001a\u00020\u00152\b\b\u0001\u0010K\u001a\u00020\u000b2\b\b\u0001\u0010M\u001a\u00020\u000bH§@¢\u0006\u0002\u0010NJ\u000e\u0010O\u001a\u00020IH§@¢\u0006\u0002\u00107J.\u0010P\u001a\u00020Q2\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010R\u001a\u00020\u000b2\b\b\u0001\u0010S\u001a\u00020\u000bH§@¢\u0006\u0002\u0010TJ\u0018\u0010U\u001a\u00020V2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010+J\u001a\u0010W\u001a\u00020X2\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010+J\u000e\u0010Y\u001a\u00020ZH§@¢\u0006\u0002\u00107J\u0018\u0010[\u001a\u00020\\2\b\b\u0001\u0010\u001e\u001a\u00020]H§@¢\u0006\u0002\u0010^J \u0010_\u001a\b\u0012\u0004\u0012\u00020a0`2\n\b\u0001\u0010b\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0002\u0010\u001bJ\u001a\u0010c\u001a\u00020d2\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010+J\u000e\u0010e\u001a\u00020dH§@¢\u0006\u0002\u00107J\"\u0010f\u001a\u00020*2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010-\u001a\u00020gH§@¢\u0006\u0002\u0010hJ$\u0010i\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020j2\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010kJ\u0018\u0010l\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020mH§@¢\u0006\u0002\u0010nJ\u000e\u0010o\u001a\u00020pH§@¢\u0006\u0002\u00107J\u0018\u0010q\u001a\u00020r2\b\b\u0001\u0010s\u001a\u00020rH§@¢\u0006\u0002\u0010t¨\u0006u"}, m3636d2 = {"Lcom/robinhood/api/retrofit/Sheriff;", "", "oAuthLogin", "Lcom/robinhood/models/api/OAuthToken;", "apiLoginRequest", "Lcom/robinhood/models/api/ApiLoginRequest$UsernamePassword;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "(Lcom/robinhood/models/api/ApiLoginRequest$UsernamePassword;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "oAuthRefreshToken", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "", "deviceLabel", "refreshToken", "grantType", "Lcom/robinhood/models/api/sheriff/OAuthGrantType;", "scope", Auth.DEVELOPER_NAME, "build", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/sheriff/OAuthGrantType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "oAuthRevokeToken", "", "apiLogoutRequest", "Lcom/robinhood/models/api/ApiLogoutRequest;", "(Lcom/robinhood/models/api/ApiLogoutRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applicationIsInternal", "Lcom/robinhood/models/api/ApplicationIsInternalResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "oAuthAuthorize", "Lcom/robinhood/models/api/OAuthAuthorizeResponse;", "request", "Lcom/robinhood/models/api/OAuthAuthorizeRequest;", "(Lcom/robinhood/models/api/OAuthAuthorizeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createChallengeForFlow", "Lcom/robinhood/models/api/CreateChallengeResponse;", "Lcom/robinhood/models/api/Challenge$CreateChallengeRequest;", "(Lcom/robinhood/models/api/Challenge$CreateChallengeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createChallengeForForgotPasswordFlow", "createChallengeForLoggedOutFlow", "Lcom/robinhood/models/api/Challenge$LoggedOutCreateChallengeRequest;", "(Lcom/robinhood/models/api/Challenge$LoggedOutCreateChallengeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retryChallenge", "Lcom/robinhood/models/api/Challenge;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitChallenge", "response", "Lcom/robinhood/models/api/Challenge$Response;", "(Ljava/util/UUID;Lcom/robinhood/models/api/Challenge$Response;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "respondChallenge", "replaceChallenge", "challengeType", "Lcom/robinhood/models/api/Challenge$Type;", "(Ljava/util/UUID;Lcom/robinhood/models/api/Challenge$Type;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "Lcom/robinhood/models/api/sheriff/ApiUser;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateEmail", "Lcom/robinhood/models/api/sheriff/ApiUser$ValidateEmailRequest;", "(Lcom/robinhood/models/api/sheriff/ApiUser$ValidateEmailRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUser", "Lcom/robinhood/models/api/sheriff/ApiUser$CreateUserRequest;", "(Lcom/robinhood/models/api/sheriff/ApiUser$CreateUserRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "Lcom/robinhood/models/api/sheriff/ApiUser$UpdateRequest;", "(Lcom/robinhood/models/api/sheriff/ApiUser$UpdateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserVerifyEmailInfo", "Lcom/robinhood/models/api/sheriff/ApiUserVerifyEmailInfo;", "getUserEmailValidation", "Lcom/robinhood/models/api/sheriff/ApiUserEmailValidationResponse;", "email", "getUserVerifyPhoneInfo", "Lcom/robinhood/models/api/sheriff/ApiUserVerifyPhoneInfo;", "sendPasswordResetEmail", "Lcom/robinhood/models/api/GenericMessage;", "resetPassword", "password", "changePassword", "oldPassword", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestPasswordResetEmail", "recoverSmsMfa", "Lcom/robinhood/models/api/Mfa$RecoverSmsMfaResponse;", "mfaCode", "enrollmentToken", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPromptsChallengeStatus", "Lcom/robinhood/models/api/PromptsStatusResponse;", "hardEnrollUserIntoPrompts", "Lcom/robinhood/models/api/PromptsUserEnrollmentResponse;", "getPendingChallenge", "Lcom/robinhood/models/api/PromptsPendingChallengeResponse;", "createSecretCode", "Lcom/robinhood/models/api/sheriff/secretcode/ApiSecretCode;", "Lcom/robinhood/models/api/sheriff/secretcode/ApiSecretCodeRequest;", "(Lcom/robinhood/models/api/sheriff/secretcode/ApiSecretCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generatedPasskeysWithAccount", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/WebauthnCredential;", "paginationCursor", "createWebauthnRegisterRequest", "Lcom/robinhood/models/api/WebauthnChallenge;", "createLoginWebauthnChallenge", "submitPasskeyLoginChallenge", "Lcom/robinhood/models/api/Challenge$PasskeyResponse;", "(Ljava/util/UUID;Lcom/robinhood/models/api/Challenge$PasskeyResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginPasskeys", "Lcom/robinhood/models/api/ApiLoginRequest$Passkeys;", "(Lcom/robinhood/models/api/ApiLoginRequest$Passkeys;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginAccountRecovery", "Lcom/robinhood/models/api/ApiLoginRequest$AccountRecovery;", "(Lcom/robinhood/models/api/ApiLoginRequest$AccountRecovery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemoveDevicesStatus", "Lcom/robinhood/models/api/DisableRemoveDeviceResponse;", "deviceSecurityConfigUpdated", "Lcom/robinhood/models/api/DeviceSecurityConfig;", "deviceSecurityConfig", "(Lcom/robinhood/models/api/DeviceSecurityConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-sheriff_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface Sheriff {
    @GET("oauth2/sheriff_application_is_internal/{client_id}/")
    Object applicationIsInternal(@Path("client_id") String str, Continuation<? super ApplicationIsInternalResponse> continuation);

    @FormUrlEncoded
    @POST("password_change/")
    Object changePassword(@Field("password") String str, @Field("old_password") String str2, Continuation<? super Unit> continuation);

    @POST("challenge/create/")
    Object createChallengeForFlow(@Body Challenge.CreateChallengeRequest createChallengeRequest, Continuation<? super CreateChallengeResponse> continuation);

    @POST("challenge/create/forgot_password/")
    Object createChallengeForForgotPasswordFlow(@Body Challenge.CreateChallengeRequest createChallengeRequest, Continuation<? super CreateChallengeResponse> continuation);

    @POST("challenge/create/logged_out/")
    Object createChallengeForLoggedOutFlow(@Body Challenge.LoggedOutCreateChallengeRequest loggedOutCreateChallengeRequest, Continuation<? super CreateChallengeResponse> continuation);

    @POST("webauthn/challenge/create/")
    Object createLoginWebauthnChallenge(Continuation<? super WebauthnChallenge> continuation);

    @POST("devices/create_secret_code/")
    Object createSecretCode(@Body ApiSecretCodeRequest apiSecretCodeRequest, Continuation<? super ApiSecretCode> continuation);

    @PUT("user/")
    Object createUser(@Body ApiUser.CreateUserRequest createUserRequest, Continuation<? super ApiUser> continuation);

    @POST("webauthn/register/request/")
    Object createWebauthnRegisterRequest(@Header(Headers.CHALLENGE_RESPONSE_ID) UUID uuid, Continuation<? super WebauthnChallenge> continuation);

    @POST("devices/security_config/")
    Object deviceSecurityConfigUpdated(@Body DeviceSecurityConfig deviceSecurityConfig, Continuation<? super DeviceSecurityConfig> continuation);

    @GET("webauthn/credentials/")
    Object generatedPasskeysWithAccount(@Query("cursor") String str, Continuation<? super PaginatedResult<WebauthnCredential>> continuation);

    @GET("push/pending_challenge/")
    Object getPendingChallenge(Continuation<? super PromptsPendingChallengeResponse> continuation);

    @GET("push/{id}/get_prompts_status/")
    Object getPromptsChallengeStatus(@Path("id") UUID uuid, Continuation<? super PromptsStatusResponse> continuation);

    @GET("devices/disable_remove_device/")
    Object getRemoveDevicesStatus(Continuation<? super DisableRemoveDeviceResponse> continuation);

    @GET("user/")
    Object getUser(Continuation<? super ApiUser> continuation);

    @GET("user/email_validation/")
    Object getUserEmailValidation(@Query("email") String str, Continuation<? super ApiUserEmailValidationResponse> continuation);

    @GET("user/verify/email/info/")
    Object getUserVerifyEmailInfo(Continuation<? super ApiUserVerifyEmailInfo> continuation);

    @GET("user/phone_number/")
    Object getUserVerifyPhoneInfo(Continuation<? super ApiUserVerifyPhoneInfo> continuation);

    @PUT("mfa/push/enroll/")
    Object hardEnrollUserIntoPrompts(@Header(Headers.CHALLENGE_RESPONSE_ID) UUID uuid, Continuation<? super PromptsUserEnrollmentResponse> continuation);

    @retrofit2.http.Headers({"X-Omit-Auth-Header: 1"})
    @POST("oauth2/token/")
    Object loginAccountRecovery(@Body ApiLoginRequest.AccountRecovery accountRecovery, Continuation<? super OAuthToken> continuation);

    @retrofit2.http.Headers({"X-Omit-Auth-Header: 1"})
    @POST("oauth2/token/")
    Object loginPasskeys(@Body ApiLoginRequest.Passkeys passkeys, @Header(Headers.CHALLENGE_RESPONSE_ID) UUID uuid, Continuation<? super OAuthToken> continuation);

    @POST("oauth2/authorize/")
    Object oAuthAuthorize(@Body OAuthAuthorizeRequest oAuthAuthorizeRequest, Continuation<? super OAuthAuthorizeResponse> continuation);

    @retrofit2.http.Headers({"X-Omit-Auth-Header: 1"})
    @POST("oauth2/token/")
    Object oAuthLogin(@Body ApiLoginRequest.UsernamePassword usernamePassword, @Header(Headers.CHALLENGE_RESPONSE_ID) UUID uuid, Continuation<? super OAuthToken> continuation);

    @FormUrlEncoded
    @retrofit2.http.Headers({"X-Dont-Intercept-For-OAuth: 1", "X-Omit-Auth-Header: 1"})
    @POST("oauth2/token/")
    Object oAuthRefreshToken(@Field("device_token") String str, @Field("device_label") String str2, @Field("refresh_token") String str3, @Field("grant_type") OAuthGrantType oAuthGrantType, @Field("scope") String str4, @Field("client_id") String str5, @Field("build") String str6, Continuation<? super OAuthToken> continuation);

    @retrofit2.http.Headers({"X-Omit-Auth-Header: 1"})
    @POST("oauth2/revoke_token/")
    Object oAuthRevokeToken(@Body ApiLogoutRequest apiLogoutRequest, Continuation<? super Unit> continuation);

    @FormUrlEncoded
    @retrofit2.http.Headers({"X-Dont-Intercept-For-OAuth: 1", "X-Omit-Auth-Header: 1"})
    @PUT("mfa/sms/recovery/")
    Object recoverSmsMfa(@Header(Headers.CHALLENGE_RESPONSE_ID) UUID uuid, @Field("mfa_code") String str, @Field("enrollment_token") String str2, Continuation<? super Mfa.RecoverSmsMfaResponse> continuation);

    @FormUrlEncoded
    @POST("challenge/{id}/replace/")
    Object replaceChallenge(@Path("id") UUID uuid, @Field("challenge_type") Challenge.Type type2, Continuation<? super Challenge> continuation);

    @POST("password_change/request/")
    Object requestPasswordResetEmail(Continuation<? super GenericMessage> continuation);

    @FormUrlEncoded
    @POST("password_reset/account_recovery/")
    Object resetPassword(@Field("password") String str, Continuation<? super Unit> continuation);

    @POST("challenge/{id}/respond/")
    Object respondChallenge(@Path("id") UUID uuid, @Body Challenge.Response response, Continuation<? super Challenge> continuation);

    @POST("challenge/{id}/retry/")
    Object retryChallenge(@Path("id") UUID uuid, Continuation<? super Challenge> continuation);

    @FormUrlEncoded
    @POST("password_reset/request/")
    Object sendPasswordResetEmail(@Field("email") String str, Continuation<? super GenericMessage> continuation);

    @POST("challenge/{id}/respond/")
    Object submitChallenge(@Path("id") UUID uuid, @Body Challenge.Response response, Continuation<? super Challenge> continuation);

    @POST("challenge/{id}/respond/")
    Object submitPasskeyLoginChallenge(@Path("id") UUID uuid, @Body Challenge.PasskeyResponse passkeyResponse, Continuation<? super Challenge> continuation);

    @PATCH("user/")
    Object updateUser(@Body ApiUser.UpdateRequest updateRequest, Continuation<? super ApiUser> continuation);

    @PUT("user/")
    Object validateEmail(@Body ApiUser.ValidateEmailRequest validateEmailRequest, Continuation<? super Unit> continuation);

    /* compiled from: Sheriff.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object oAuthLogin$default(Sheriff sheriff, ApiLoginRequest.UsernamePassword usernamePassword, UUID uuid, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: oAuthLogin");
            }
            if ((i & 2) != 0) {
                uuid = null;
            }
            return sheriff.oAuthLogin(usernamePassword, uuid, continuation);
        }

        public static /* synthetic */ Object loginPasskeys$default(Sheriff sheriff, ApiLoginRequest.Passkeys passkeys, UUID uuid, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loginPasskeys");
            }
            if ((i & 2) != 0) {
                uuid = null;
            }
            return sheriff.loginPasskeys(passkeys, uuid, continuation);
        }
    }
}
