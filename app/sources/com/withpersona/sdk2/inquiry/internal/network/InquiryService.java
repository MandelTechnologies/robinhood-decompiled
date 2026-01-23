package com.withpersona.sdk2.inquiry.internal.network;

import com.robinhood.android.navigation.compose.NavTransition2;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.p424ui.network.TransitionInquiryRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: InquiryService.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\u000eJD\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0011\u001a\u00020\b2\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H§@¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0017H§@¢\u0006\u0002\u0010\u0018J(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u001aH§@¢\u0006\u0002\u0010\u001bJ2\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u001dH§@¢\u0006\u0002\u0010\u001eJ2\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020 H§@¢\u0006\u0002\u0010!J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0010\u001a\u00020\bH§@¢\u0006\u0002\u0010#J(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020%H§@¢\u0006\u0002\u0010&J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00032\b\b\u0001\u0010\u0005\u001a\u00020)H§@¢\u0006\u0002\u0010*¨\u0006+"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/InquiryService;", "", "createInquiry", "Lretrofit2/Response;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "request", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;", "fallbackMode", "", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createInquirySession", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkInquiry", "sessionToken", "inquiryId", "include", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateInquiry", "Lokhttp3/ResponseBody;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyDeviceIntegrity", "Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/VerifyDeviceIntegrityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", NavTransition2.KEY_TRANSITION, "Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionBack", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelCurrentInquirySession", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportError", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exchangeOneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeResponse;", "Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;", "(Lcom/withpersona/sdk2/inquiry/internal/network/ExchangeOneTimeLinkCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface InquiryService {
    @POST("/api/internal/verify/v1/current-inquiry-session/cancel")
    Object cancelCurrentInquirySession(@Header("Authorization") String str, Continuation<? super Response<ResponseBody>> continuation);

    @GET("/api/internal/verify/v1/inquiries/{inquiryId}")
    Object checkInquiry(@Header("Authorization") String str, @Header("Persona-Device-Id") String str2, @Path("inquiryId") String str3, @Query("include") String[] strArr, Continuation<? super Response<CheckInquiryResponse>> continuation);

    @POST("/api/internal/verify/v1/inquiries")
    Object createInquiry(@Body CreateInquiryRequest createInquiryRequest, @Header("Persona-Fallback-Mode") String str, Continuation<? super Response<CheckInquiryResponse>> continuation);

    @POST("/api/internal/verify/v1/inquiry-sessions")
    Object createInquirySession(@Body CreateInquirySessionRequest createInquirySessionRequest, @Header("Persona-Device-Id") String str, Continuation<? super Response<CreateInquirySessionResponse>> continuation);

    @POST("/api/internal/verify/v1/inquiry-sessions/exchange-one-time-link-code")
    Object exchangeOneTimeLinkCode(@Body ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest, Continuation<? super Response<ExchangeOneTimeLinkCodeResponse>> continuation);

    @POST("/api/internal/verify/v1/current-inquiry-session/error")
    Object reportError(@Header("Authorization") String str, @Body ErrorRequest errorRequest, Continuation<? super Response<ResponseBody>> continuation);

    @POST("/api/internal/verify/v1/inquiries/{inquiryId}/transition")
    Object transition(@Header("Authorization") String str, @Path("inquiryId") String str2, @Body TransitionInquiryRequest transitionInquiryRequest, Continuation<? super Response<CheckInquiryResponse>> continuation);

    @POST("/api/internal/verify/v1/inquiries/{inquiryId}/transition-back")
    Object transitionBack(@Header("Authorization") String str, @Path("inquiryId") String str2, @Body TransitionBackRequest transitionBackRequest, Continuation<? super Response<CheckInquiryResponse>> continuation);

    @PATCH("/api/internal/verify/v1/current-inquiry-session")
    Object updateInquiry(@Header("Authorization") String str, @Body UpdateInquirySessionRequest updateInquirySessionRequest, Continuation<? super Response<ResponseBody>> continuation);

    @POST("/api/internal/verify/v1/current-inquiry-session/verify-device-integrity")
    Object verifyDeviceIntegrity(@Header("Authorization") String str, @Body VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest, Continuation<? super Response<ResponseBody>> continuation);
}
