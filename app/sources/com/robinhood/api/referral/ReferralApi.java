package com.robinhood.api.referral;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiReferral;
import com.robinhood.models.api.EstablishReferralRequest;
import com.robinhood.models.api.ReferralCode;
import com.robinhood.models.api.ReferredLandingPageContentResponse;
import com.robinhood.models.api.ReferrerData;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: ReferralApi.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\t2\b\b\u0001\u0010\u0018\u001a\u00020\u0019H§@¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/api/referral/ReferralApi;", "", "getReferredLandingPageContent", "Lcom/robinhood/models/api/ReferredLandingPageContentResponse;", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "", "referralCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "establishReferral", "", "request", "Lcom/robinhood/models/api/EstablishReferralRequest;", "(Lcom/robinhood/models/api/EstablishReferralRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReferralCode", "Lcom/robinhood/models/api/ReferralCode;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReferrerData", "Lcom/robinhood/models/api/ReferrerData;", "getReferrals", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiReferral;", "paginationCursor", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remindPendingReferral", "referralId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface ReferralApi {
    @POST("referral/")
    Object establishReferral(@Body EstablishReferralRequest establishReferralRequest, Continuation<? super Unit> continuation);

    @GET("referral/code/")
    Object getReferralCode(Continuation<? super ReferralCode> continuation);

    @GET("referral/")
    Object getReferrals(@Query("cursor") String str, Continuation<? super PaginatedResult<ApiReferral>> continuation);

    @GET("referral/promotion/")
    Object getReferredLandingPageContent(@Query("device_id") String str, @Query("referral_code") String str2, Continuation<? super ReferredLandingPageContentResponse> continuation);

    @GET("referral/campaign/general/")
    Object getReferrerData(Continuation<? super ReferrerData> continuation);

    @POST("referral/{referralId}/remind/")
    Object remindPendingReferral(@Path("referralId") UUID uuid, Continuation<? super Unit> continuation);

    /* compiled from: ReferralApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getReferredLandingPageContent$default(ReferralApi referralApi, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReferredLandingPageContent");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return referralApi.getReferredLandingPageContent(str, str2, continuation);
        }
    }
}
