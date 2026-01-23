package com.robinhood.api.retrofit;

import com.robinhood.models.api.ApiChannelAvailabilityDetails;
import com.robinhood.models.api.ApiInquiry;
import com.robinhood.models.api.ApiIssue;
import com.robinhood.models.api.ApiIssueDetail;
import com.robinhood.models.api.ApiSimpleIssue;
import com.robinhood.models.api.ApiSupportAccessToken;
import com.robinhood.models.api.ApiSupportSalesforceToken;
import com.robinhood.models.api.ChannelType;
import com.robinhood.models.api.CreateBreadcrumbInquiryRequest;
import com.robinhood.models.api.CreateInquiryRequest;
import com.robinhood.models.api.CreateIssueRequest;
import com.robinhood.models.api.CreateLoggedOutIssueRequest;
import com.robinhood.models.api.SelfieConsentRequest;
import com.robinhood.models.api.SupportAccessTokenRequest;
import com.robinhood.models.api.pathfinder.GenericUserViewInputRequest;
import com.robinhood.models.api.pathfinder.UserViewInputRequest;
import com.robinhood.models.api.pathfinder.auxcontext.ApiAuxContext;
import com.robinhood.models.api.suv.ApiCreateUserMachineRequest;
import com.robinhood.models.p355ui.PathfinderStateError;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: PathfinderApi.kt */
@Metadata(m3635d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0016J\"\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0019J\"\u0010\u001a\u001a\u00020\u00152\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u001cH§@¢\u0006\u0002\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u00152\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u001fH§@¢\u0006\u0002\u0010 J\"\u0010!\u001a\u00020\u00152\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\"H§@¢\u0006\u0002\u0010#J\"\u0010$\u001a\u00020%2\b\b\u0001\u0010&\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020'H§@¢\u0006\u0002\u0010(J\"\u0010)\u001a\u00020*2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0002\u0010+J\u0018\u0010,\u001a\u00020-2\b\b\u0001\u0010\u000e\u001a\u00020.H§@¢\u0006\u0002\u0010/J\u0018\u0010,\u001a\u00020-2\b\b\u0001\u0010\u000e\u001a\u000200H§@¢\u0006\u0002\u00101J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020-032\b\b\u0001\u00104\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0016J\u001a\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070603H§@¢\u0006\u0002\u00108J\u0018\u00109\u001a\u00020-2\b\b\u0001\u00104\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0016J\u0018\u0010:\u001a\u00020-2\b\b\u0001\u00104\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0016J\u0018\u0010;\u001a\u00020<2\b\b\u0001\u0010\u000e\u001a\u00020=H§@¢\u0006\u0002\u0010>J\u000e\u0010?\u001a\u00020@H§@¢\u0006\u0002\u00108J\u0018\u0010A\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020BH§@¢\u0006\u0002\u0010CJ,\u0010D\u001a\u00020E2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010F\u001a\u00020\tH§@¢\u0006\u0002\u0010GJ\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020\r06H§@¢\u0006\u0002\u00108J\u000e\u0010I\u001a\u00020\rH§@¢\u0006\u0002\u00108¨\u0006J"}, m3636d2 = {"Lcom/robinhood/api/retrofit/PathfinderApi;", "", "getChannelAvailability", "Lcom/robinhood/models/api/ApiChannelAvailabilityDetails;", "inquiryId", "Ljava/util/UUID;", "channelType", "Lcom/robinhood/models/api/ChannelType;", "channelScreen", "", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "(Ljava/util/UUID;Lcom/robinhood/models/api/ChannelType;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createInquiry", "Lcom/robinhood/models/api/ApiInquiry;", "request", "Lcom/robinhood/models/api/CreateInquiryRequest;", "(Lcom/robinhood/models/api/CreateInquiryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBreadcrumbInquiry", "Lcom/robinhood/models/api/CreateBreadcrumbInquiryRequest;", "(Lcom/robinhood/models/api/CreateBreadcrumbInquiryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserViewState", "Lokhttp3/ResponseBody;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sequence", "", "(Ljava/util/UUID;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendUserViewInput", "input", "Lcom/robinhood/models/api/pathfinder/UserViewInputRequest;", "(Ljava/util/UUID;Lcom/robinhood/models/api/pathfinder/UserViewInputRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendUserViewWebInput", "Lcom/robinhood/models/api/pathfinder/GenericUserViewInputRequest;", "(Ljava/util/UUID;Lcom/robinhood/models/api/pathfinder/GenericUserViewInputRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendErrorInput", "Lcom/robinhood/models/ui/PathfinderStateError;", "(Ljava/util/UUID;Lcom/robinhood/models/ui/PathfinderStateError;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendSelfieConsent", "", "userId", "Lcom/robinhood/models/api/SelfieConsentRequest;", "(Ljava/util/UUID;Lcom/robinhood/models/api/SelfieConsentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIssueDetail", "Lcom/robinhood/models/api/ApiIssueDetail;", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNewIssue", "Lcom/robinhood/models/api/ApiIssue;", "Lcom/robinhood/models/api/CreateIssueRequest;", "(Lcom/robinhood/models/api/CreateIssueRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/CreateLoggedOutIssueRequest;", "(Lcom/robinhood/models/api/CreateLoggedOutIssueRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIssue", "Lretrofit2/Response;", "issueId", "getActivePhoneIssues", "", "Lcom/robinhood/models/api/ApiSimpleIssue;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelIssue", "requeueIssue", "refreshAccessToken", "Lcom/robinhood/models/api/ApiSupportAccessToken;", "Lcom/robinhood/models/api/SupportAccessTokenRequest;", "(Lcom/robinhood/models/api/SupportAccessTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSupportChatSalesforceToken", "Lcom/robinhood/models/api/ApiSupportSalesforceToken;", "createUserMachine", "Lcom/robinhood/models/api/suv/ApiCreateUserMachineRequest;", "(Lcom/robinhood/models/api/suv/ApiCreateUserMachineRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAuxContext", "Lcom/robinhood/models/api/pathfinder/auxcontext/ApiAuxContext;", "key", "(Ljava/util/UUID;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInquiries", "createSurveyInquiry", "lib-api-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface PathfinderApi {
    @POST("issues/clients/v2/{issueId}/cancel/")
    Object cancelIssue(@Path("issueId") UUID uuid, Continuation<? super ApiIssue> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 25", "X-Write-Timeout-Seconds-Override: 25"})
    @POST("inquiries/breadcrumbs/")
    Object createBreadcrumbInquiry(@Body CreateBreadcrumbInquiryRequest createBreadcrumbInquiryRequest, Continuation<? super ApiInquiry> continuation);

    @POST("inquiries/")
    Object createInquiry(@Body CreateInquiryRequest createInquiryRequest, Continuation<? super ApiInquiry> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 25", "X-Write-Timeout-Seconds-Override: 25"})
    @POST("issues/clients/v2/")
    Object createNewIssue(@Body CreateIssueRequest createIssueRequest, Continuation<? super ApiIssue> continuation);

    @Headers({"X-Read-Timeout-Seconds-Override: 25", "X-Write-Timeout-Seconds-Override: 25"})
    @POST("issues/clients/v2/")
    Object createNewIssue(@Body CreateLoggedOutIssueRequest createLoggedOutIssueRequest, Continuation<? super ApiIssue> continuation);

    @POST("inquiries/survey/")
    Object createSurveyInquiry(Continuation<? super ApiInquiry> continuation);

    @POST("user_machine/")
    Object createUserMachine(@Body ApiCreateUserMachineRequest apiCreateUserMachineRequest, Continuation<? super ApiInquiry> continuation);

    @GET("issues/?active_only=True")
    Object getActivePhoneIssues(Continuation<? super Response<List<ApiSimpleIssue>>> continuation);

    @GET("user_machine/{inquiryId}/{sequence}/{key}/")
    Object getAuxContext(@Path("inquiryId") UUID uuid, @Path("sequence") int i, @Path("key") String str, Continuation<? super ApiAuxContext> continuation);

    @GET("inquiries/{inquiryId}/channel_availability/")
    Object getChannelAvailability(@Path("inquiryId") UUID uuid, @Query("channel_type") ChannelType channelType, @Query("channel_screen") String str, @Query("device_id") String str2, Continuation<? super ApiChannelAvailabilityDetails> continuation);

    @GET("inquiries/")
    Object getInquiries(Continuation<? super List<ApiInquiry>> continuation);

    @GET("issues/clients/v2/{issueId}/")
    Object getIssue(@Path("issueId") UUID uuid, Continuation<? super Response<ApiIssue>> continuation);

    @GET("inquiries/{inquiryId}/v2/review_details/")
    Object getIssueDetail(@Path("inquiryId") UUID uuid, @Query("device_id") String str, Continuation<? super ApiIssueDetail> continuation);

    @POST("issues/clients/v3/sf_access_token/")
    Object getSupportChatSalesforceToken(Continuation<? super ApiSupportSalesforceToken> continuation);

    @GET("inquiries/{inquiryId}/user_view/{sequence}/")
    Object getUserViewState(@Path("inquiryId") UUID uuid, @Path("sequence") int i, Continuation<? super ResponseBody> continuation);

    @GET("inquiries/{inquiryId}/user_view/")
    Object getUserViewState(@Path("inquiryId") UUID uuid, Continuation<? super ResponseBody> continuation);

    @POST("issues/clients/v3/access_token/")
    Object refreshAccessToken(@Body SupportAccessTokenRequest supportAccessTokenRequest, Continuation<? super ApiSupportAccessToken> continuation);

    @POST("issues/clients/v2/{issueId}/requeue/")
    Object requeueIssue(@Path("issueId") UUID uuid, Continuation<? super ApiIssue> continuation);

    @POST("inquiries/{inquiryId}/user_view/error/")
    Object sendErrorInput(@Path("inquiryId") UUID uuid, @Body PathfinderStateError pathfinderStateError, Continuation<? super ResponseBody> continuation);

    @POST("inquiries/selfie_consent/{userId}/")
    Object sendSelfieConsent(@Path("userId") UUID uuid, @Body SelfieConsentRequest selfieConsentRequest, Continuation<? super Unit> continuation);

    @POST("inquiries/{inquiryId}/user_view/")
    Object sendUserViewInput(@Path("inquiryId") UUID uuid, @Body UserViewInputRequest userViewInputRequest, Continuation<? super ResponseBody> continuation);

    @POST("inquiries/{inquiryId}/user_view/")
    Object sendUserViewWebInput(@Path("inquiryId") UUID uuid, @Body GenericUserViewInputRequest genericUserViewInputRequest, Continuation<? super ResponseBody> continuation);
}
