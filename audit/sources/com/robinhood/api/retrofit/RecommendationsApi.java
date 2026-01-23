package com.robinhood.api.retrofit;

import com.robinhood.android.regiongate.RecommendationsRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.recommendations.models.api.ApiRecommendationsCheckoutAmount;
import com.robinhood.recommendations.models.api.ApiRecommendationsCheckoutReview;
import com.robinhood.recommendations.models.api.ApiRecommendationsCheckoutReviewPostBody;
import com.robinhood.recommendations.models.api.ApiRecommendationsDisclosures;
import com.robinhood.recommendations.models.api.ApiRecommendationsEligibility;
import com.robinhood.recommendations.models.api.ApiRecommendationsExistingAnswers;
import com.robinhood.recommendations.models.api.ApiRecommendationsLearnMore;
import com.robinhood.recommendations.models.api.ApiRecommendationsOrderPostBody;
import com.robinhood.recommendations.models.api.ApiRecommendationsOrderReceipt;
import com.robinhood.recommendations.models.api.ApiRecommendationsOrderResponse;
import com.robinhood.recommendations.models.api.ApiRecommendationsOrderSummary;
import com.robinhood.recommendations.models.api.ApiRecommendationsOrderSummaryPostBody;
import com.robinhood.recommendations.models.api.ApiRecommendationsPortfolio;
import com.robinhood.recommendations.models.api.ApiRecommendationsPortfolioPostBody;
import com.robinhood.recommendations.models.api.ApiRecommendationsQuestionnaire;
import com.robinhood.recommendations.models.api.ApiRecommendationsQuestionnaireConfirmationPostBody;
import com.robinhood.recommendations.models.api.ApiRecommendationsRiskProfilePostBody;
import com.robinhood.recommendations.models.api.ApiRecommendationsRiskProfileResponse;
import com.robinhood.recommendations.models.api.ApiSignRecommendationsDisclosuresPostBody;
import com.robinhood.recommendations.models.api.allocationweights.ApiRecommendationsAllocationWeightsResponse;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: RecommendationsApi.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\b2\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H§@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\t\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\t\u001a\u00020\u001bH§@¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010\t\u001a\u00020!H§@¢\u0006\u0002\u0010\"J\"\u0010#\u001a\u00020$2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020%H§@¢\u0006\u0002\u0010&J\"\u0010'\u001a\u00020(2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020)H§@¢\u0006\u0002\u0010*J\u0018\u0010+\u001a\u00020 2\b\b\u0001\u0010\t\u001a\u00020,H§@¢\u0006\u0002\u0010-J$\u0010.\u001a\u00020/2\b\b\u0001\u0010\u0007\u001a\u00020\b2\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0002\u00101J\"\u00102\u001a\u0002032\b\b\u0001\u00104\u001a\u00020\b2\b\b\u0001\u00105\u001a\u00020\u0011H§@¢\u0006\u0002\u00101J\u000e\u00106\u001a\u000207H§@¢\u0006\u0002\u0010\u0004J\u0018\u00108\u001a\u0002092\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010:¨\u0006;"}, m3636d2 = {"Lcom/robinhood/api/retrofit/RecommendationsApi;", "", "getRecommendationsEligibility", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsEligibility;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitRecommendationOrder", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsOrderResponse;", "recommendationId", "Ljava/util/UUID;", "request", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsOrderPostBody;", "(Ljava/util/UUID;Lcom/robinhood/recommendations/models/api/ApiRecommendationsOrderPostBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecommendationsOrderReceipt", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsOrderReceipt;", "investmentId", "transferIds", "Lcom/robinhood/models/CommaSeparatedList;", "", "(Ljava/util/UUID;Lcom/robinhood/models/CommaSeparatedList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPortfolioRecommendation", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsPortfolio;", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsPortfolioPostBody;", "(Lcom/robinhood/recommendations/models/api/ApiRecommendationsPortfolioPostBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecommendationsQuestionnaire", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsQuestionnaire;", "createRecommendationsRiskProfile", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsRiskProfileResponse;", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsRiskProfilePostBody;", "(Lcom/robinhood/recommendations/models/api/ApiRecommendationsRiskProfilePostBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecommendationsDisclosures", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsDisclosures;", "signRecommendationsDisclosures", "", "Lcom/robinhood/recommendations/models/api/ApiSignRecommendationsDisclosuresPostBody;", "(Lcom/robinhood/recommendations/models/api/ApiSignRecommendationsDisclosuresPostBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRecommendationsCheckoutReview", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsCheckoutReview;", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsCheckoutReviewPostBody;", "(Ljava/util/UUID;Lcom/robinhood/recommendations/models/api/ApiRecommendationsCheckoutReviewPostBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRecommendationOrderSummary", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsOrderSummary;", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsOrderSummaryPostBody;", "(Ljava/util/UUID;Lcom/robinhood/recommendations/models/api/ApiRecommendationsOrderSummaryPostBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmRecommendationsQuestionnaireAnswers", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsQuestionnaireConfirmationPostBody;", "(Lcom/robinhood/recommendations/models/api/ApiRecommendationsQuestionnaireConfirmationPostBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecommendationsCheckoutAmount", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsCheckoutAmount;", "accountNumber", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecommendationsLearnMore", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsLearnMore;", "instrumentId", "entryPoint", "getRecommendationsExistingAnswers", "Lcom/robinhood/recommendations/models/api/ApiRecommendationsExistingAnswers;", "getRecommendationAllocationWeights", "Lcom/robinhood/recommendations/models/api/allocationweights/ApiRecommendationsAllocationWeightsResponse;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface RecommendationsApi {
    @POST("recommendations/questionnaire-confirmation/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecommendationsRegionGate.class})
    Object confirmRecommendationsQuestionnaireAnswers(@Body ApiRecommendationsQuestionnaireConfirmationPostBody apiRecommendationsQuestionnaireConfirmationPostBody, Continuation<? super Unit> continuation);

    @POST("recommendations/portfolio/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecommendationsRegionGate.class})
    Object createPortfolioRecommendation(@Body ApiRecommendationsPortfolioPostBody apiRecommendationsPortfolioPostBody, Continuation<? super ApiRecommendationsPortfolio> continuation);

    @POST("recommendations/{recommendationId}/order-summary/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecommendationsRegionGate.class})
    Object createRecommendationOrderSummary(@Path("recommendationId") UUID uuid, @Body ApiRecommendationsOrderSummaryPostBody apiRecommendationsOrderSummaryPostBody, Continuation<? super ApiRecommendationsOrderSummary> continuation);

    @POST("recommendations/{recommendationId}/checkout-review/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecommendationsRegionGate.class})
    Object createRecommendationsCheckoutReview(@Path("recommendationId") UUID uuid, @Body ApiRecommendationsCheckoutReviewPostBody apiRecommendationsCheckoutReviewPostBody, Continuation<? super ApiRecommendationsCheckoutReview> continuation);

    @POST("recommendations/risk-profile/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecommendationsRegionGate.class})
    Object createRecommendationsRiskProfile(@Body ApiRecommendationsRiskProfilePostBody apiRecommendationsRiskProfilePostBody, Continuation<? super ApiRecommendationsRiskProfileResponse> continuation);

    @GET("recommendations/{recommendation_id}/weights/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecommendationsRegionGate.class})
    Object getRecommendationAllocationWeights(@Path("recommendation_id") UUID uuid, Continuation<? super ApiRecommendationsAllocationWeightsResponse> continuation);

    @GET("recommendations/{recommendationId}/checkout-amount/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecommendationsRegionGate.class})
    Object getRecommendationsCheckoutAmount(@Path("recommendationId") UUID uuid, @Query("account_number") String str, Continuation<? super ApiRecommendationsCheckoutAmount> continuation);

    @GET("recommendations/disclosures/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecommendationsRegionGate.class})
    Object getRecommendationsDisclosures(Continuation<? super ApiRecommendationsDisclosures> continuation);

    @GET("recommendations/eligibility/")
    @RequiresRegionGate(regionGates = {RecommendationsRegionGate.class})
    Object getRecommendationsEligibility(Continuation<? super ApiRecommendationsEligibility> continuation);

    @GET("recommendations/existing-answers/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecommendationsRegionGate.class})
    Object getRecommendationsExistingAnswers(Continuation<? super ApiRecommendationsExistingAnswers> continuation);

    @GET("recommendations/learn-more/{instrumentId}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecommendationsRegionGate.class})
    Object getRecommendationsLearnMore(@Path("instrumentId") UUID uuid, @Query("entry_point") String str, Continuation<? super ApiRecommendationsLearnMore> continuation);

    @GET("recommendations/order-receipt/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecommendationsRegionGate.class})
    Object getRecommendationsOrderReceipt(@Query("investment_id") UUID uuid, @Query("transfer_ids") CommaSeparatedList<String> commaSeparatedList, Continuation<? super ApiRecommendationsOrderReceipt> continuation);

    @GET("recommendations/questionnaire/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecommendationsRegionGate.class})
    Object getRecommendationsQuestionnaire(Continuation<? super ApiRecommendationsQuestionnaire> continuation);

    @POST("recommendations/sign_disclosures/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecommendationsRegionGate.class})
    Object signRecommendationsDisclosures(@Body ApiSignRecommendationsDisclosuresPostBody apiSignRecommendationsDisclosuresPostBody, Continuation<? super Unit> continuation);

    @POST("recommendations/{recommendationId}/investment/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RecommendationsRegionGate.class})
    Object submitRecommendationOrder(@Path("recommendationId") UUID uuid, @Body ApiRecommendationsOrderPostBody apiRecommendationsOrderPostBody, Continuation<? super ApiRecommendationsOrderResponse> continuation);

    /* compiled from: RecommendationsApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getRecommendationsCheckoutAmount$default(RecommendationsApi recommendationsApi, UUID uuid, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecommendationsCheckoutAmount");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return recommendationsApi.getRecommendationsCheckoutAmount(uuid, str, continuation);
        }
    }
}
