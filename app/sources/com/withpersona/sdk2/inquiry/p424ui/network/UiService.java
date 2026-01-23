package com.withpersona.sdk2.inquiry.p424ui.network;

import com.withpersona.sdk2.inquiry.steps.p423ui.network.AddressAutocompleteResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: UiService.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/UiService;", "", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;", "request", "Lretrofit2/Response;", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/AddressAutocompleteResponse;", "getAddressSuggestions", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addressId", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;", "getAddressDetails", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inquiryId", "Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest;", "Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeResponse;", "fetchOneTimeLinkCodeForPersonasVerify", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchOneTimeLinkCodeForPersonasCreate", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface UiService {
    @POST("/api/internal/verify/v1/inquiries/{inquiryId}/generate-reusable-persona-create-popup-one-time-link-code")
    Object fetchOneTimeLinkCodeForPersonasCreate(@Path("inquiryId") String str, @Header("Authorization") String str2, Continuation<? super Response<OneTimeLinkCodeResponse>> continuation);

    @POST("/api/internal/verify/v1/inquiries/{inquiryId}/generate-reusable-persona-verify-popup-one-time-link-code")
    Object fetchOneTimeLinkCodeForPersonasVerify(@Path("inquiryId") String str, @Header("Authorization") String str2, @Body OneTimeLinkCodeForPersonasRequest oneTimeLinkCodeForPersonasRequest, Continuation<? super Response<OneTimeLinkCodeResponse>> continuation);

    @GET("/api/internal/verify/v1/address/{addressId}")
    Object getAddressDetails(@Header("Authorization") String str, @Path("addressId") String str2, Continuation<? super Response<AddressDetailsResponse>> continuation);

    @POST("/api/internal/verify/v1/address/autocomplete")
    Object getAddressSuggestions(@Header("Authorization") String str, @Body AddressAutocompleteRequest addressAutocompleteRequest, Continuation<? super Response<AddressAutocompleteResponse>> continuation);
}
