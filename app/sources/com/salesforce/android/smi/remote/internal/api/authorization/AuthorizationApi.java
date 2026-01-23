package com.salesforce.android.smi.remote.internal.api.authorization;

import com.salesforce.android.smi.remote.internal.dto.request.RevokeTokenRequest;
import com.salesforce.android.smi.remote.internal.dto.request.unauthenticated.UnauthenticatedRenewTokenRequest;
import com.salesforce.android.smi.remote.internal.dto.request.unauthenticated.UnauthenticatedTokenRequest;
import com.salesforce.android.smi.remote.internal.dto.request.userVerification.UserVerificationAuthTokenRequest;
import com.salesforce.android.smi.remote.internal.dto.response.AuthenticatedTokenResponse;
import com.salesforce.android.smi.remote.internal.dto.response.UnauthenticatedTokenResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: AuthorizationApi.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JL\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\fJL\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000f\u0010\u0010JL\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00192\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationApi;", "", "Lcom/salesforce/android/smi/remote/internal/dto/request/unauthenticated/UnauthenticatedTokenRequest;", "unauthenticatedTokenPost", "", "appName", "deviceType", "os", "osVersion", "clientVersion", "Lcom/salesforce/android/smi/remote/internal/dto/response/UnauthenticatedTokenResponse;", "fetchUnauthenticatedTokens", "(Lcom/salesforce/android/smi/remote/internal/dto/request/unauthenticated/UnauthenticatedTokenRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/remote/internal/dto/request/unauthenticated/UnauthenticatedRenewTokenRequest;", "unauthenticatedRenewPost", "renewUnauthenticatedTokens", "(Lcom/salesforce/android/smi/remote/internal/dto/request/unauthenticated/UnauthenticatedRenewTokenRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/remote/internal/dto/request/userVerification/UserVerificationAuthTokenRequest;", "authenticatedTokenPost", "Lcom/salesforce/android/smi/remote/internal/dto/response/AuthenticatedTokenResponse;", "fetchAuthenticatedTokens", "(Lcom/salesforce/android/smi/remote/internal/dto/request/userVerification/UserVerificationAuthTokenRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/remote/internal/dto/request/RevokeTokenRequest;", "revokeTokenRequest", "authHeader", "Lretrofit2/Response;", "", "revokeToken", "(Lcom/salesforce/android/smi/remote/internal/dto/request/RevokeTokenRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface AuthorizationApi {
    @POST("iamessage/v1/authorization/authenticated/accessToken")
    Object fetchAuthenticatedTokens(@Body UserVerificationAuthTokenRequest userVerificationAuthTokenRequest, @Query("AppName") String str, @Query("DeviceType") String str2, @Query("Os") String str3, @Query("OsVersion") String str4, @Query("ClientVersion") String str5, Continuation<? super AuthenticatedTokenResponse> continuation);

    @POST("iamessage/v1/authorization/unauthenticated/persistedToken")
    Object fetchUnauthenticatedTokens(@Body UnauthenticatedTokenRequest unauthenticatedTokenRequest, @Query("AppName") String str, @Query("DeviceType") String str2, @Query("Os") String str3, @Query("OsVersion") String str4, @Query("ClientVersion") String str5, Continuation<? super UnauthenticatedTokenResponse> continuation);

    @POST("iamessage/v1/authorization/renewToken")
    Object renewUnauthenticatedTokens(@Body UnauthenticatedRenewTokenRequest unauthenticatedRenewTokenRequest, @Query("AppName") String str, @Query("DeviceType") String str2, @Query("Os") String str3, @Query("OsVersion") String str4, @Query("ClientVersion") String str5, Continuation<? super UnauthenticatedTokenResponse> continuation);

    @POST("iamessage/v1/authorization/revokeToken")
    Object revokeToken(@Body RevokeTokenRequest revokeTokenRequest, @Header("Authorization") String str, Continuation<? super Response<Unit>> continuation);
}
