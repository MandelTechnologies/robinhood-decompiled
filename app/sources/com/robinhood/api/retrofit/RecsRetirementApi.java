package com.robinhood.api.retrofit;

import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.recommendations.retirement.models.api.ApiQuestionnaireResults;
import com.robinhood.recommendations.retirement.models.api.ApiQuestionnaireResultsRequestBody;
import com.robinhood.recommendations.retirement.models.api.ApiRecsRetirementEligibility;
import com.robinhood.recommendations.retirement.models.api.ApiRecsRetirementIntro;
import com.robinhood.recommendations.retirement.models.api.ApiRecsRetirementPortfolio;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: RecsRetirementApi.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/api/retrofit/RecsRetirementApi;", "", "getPortfolio", "Lcom/robinhood/recommendations/retirement/models/api/ApiRecsRetirementPortfolio;", "recommendationId", "Ljava/util/UUID;", "isReorder", "", "(Ljava/util/UUID;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIntro", "Lcom/robinhood/recommendations/retirement/models/api/ApiRecsRetirementIntro;", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEligibility", "Lcom/robinhood/recommendations/retirement/models/api/ApiRecsRetirementEligibility;", "createQuestionnaireResults", "Lcom/robinhood/recommendations/retirement/models/api/ApiQuestionnaireResults;", "requestBody", "Lcom/robinhood/recommendations/retirement/models/api/ApiQuestionnaireResultsRequestBody;", "(Lcom/robinhood/recommendations/retirement/models/api/ApiQuestionnaireResultsRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface RecsRetirementApi {
    @POST("recommendations/retirement/questionnaire_results/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object createQuestionnaireResults(@Body ApiQuestionnaireResultsRequestBody apiQuestionnaireResultsRequestBody, Continuation<? super ApiQuestionnaireResults> continuation);

    @GET("recommendations/retirement/eligibility")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getEligibility(@Query("account_number") String str, Continuation<? super ApiRecsRetirementEligibility> continuation);

    @GET("recommendations/retirement/intro")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getIntro(@Query("account_number") String str, Continuation<? super ApiRecsRetirementIntro> continuation);

    @POST("recommendations/retirement/{recommendation_id}/portfolio")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getPortfolio(@Path("recommendation_id") UUID uuid, @Query("is_reorder") boolean z, Continuation<? super ApiRecsRetirementPortfolio> continuation);
}
