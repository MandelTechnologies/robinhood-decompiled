package com.robinhood.api.supporthub;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.models.api.supporthub.ApiConciergeEligibility;
import com.robinhood.models.api.supporthub.ApiPostConciergeOnboarding;
import com.robinhood.models.api.supporthub.ApiPrioritySupportChannelAvailability;
import com.robinhood.models.api.supporthub.ApiRecommendedActions;
import com.robinhood.models.api.supporthub.ApiSupportHub;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;

/* compiled from: SupportHubApi.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0004¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/api/supporthub/SupportHubApi;", "", "getSupportHub", "Lcom/robinhood/models/api/supporthub/ApiSupportHub;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecommendedActions", "Lcom/robinhood/models/api/supporthub/ApiRecommendedActions;", "getConciergeEligibility", "Lcom/robinhood/models/api/supporthub/ApiConciergeEligibility;", "postConciergeOnboarding", "", CarResultComposable2.BODY, "Lcom/robinhood/models/api/supporthub/ApiPostConciergeOnboarding;", "(Lcom/robinhood/models/api/supporthub/ApiPostConciergeOnboarding;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrioritySupportChannelAvailability", "Lcom/robinhood/models/api/supporthub/ApiPrioritySupportChannelAvailability;", "lib-api-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface SupportHubApi {
    @GET("concierge/eligibility/")
    Object getConciergeEligibility(Continuation<? super ApiConciergeEligibility> continuation);

    @GET("concierge/channel_availability/")
    Object getPrioritySupportChannelAvailability(Continuation<? super ApiPrioritySupportChannelAvailability> continuation);

    @GET("support_hub/recommended_actions/")
    Object getRecommendedActions(Continuation<? super ApiRecommendedActions> continuation);

    @GET("support_hub/")
    Object getSupportHub(Continuation<? super ApiSupportHub> continuation);

    @PATCH("concierge/onboarding/")
    Object postConciergeOnboarding(@Body ApiPostConciergeOnboarding apiPostConciergeOnboarding, Continuation<? super Unit> continuation);
}
