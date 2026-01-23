package com.robinhood.android.advisory.api;

import com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDeeplinkTarget;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel;
import com.robinhood.models.advisory.api.insights.ApiAdvisoryInsightsPerformanceChartModel;
import com.robinhood.models.advisory.api.onboarding.recommendation.ApiAccountTypeRecommendationIntroViewModel;
import com.robinhood.models.advisory.api.onboarding.recommendation.ApiAccountTypeRecommendationResults;
import com.robinhood.models.advisory.api.portfolio.ApiPortfolioRevealViewModel;
import com.robinhood.models.api.BrokerageAccountType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: AdvisoryApi.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013J\"\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0017\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/advisory/api/AdvisoryApi;", "", "getPortfolioRevealViewModel", "Lcom/robinhood/models/advisory/api/portfolio/ApiPortfolioRevealViewModel;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "applicationId", "Ljava/util/UUID;", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFirstTimeContributionViewModel", "Lcom/robinhood/models/advisory/api/contribution/ApiAdvisoryFirstTimeContributionViewModel;", "(Lcom/robinhood/models/api/BrokerageAccountType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountTypeRecommendationIntro", "Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationIntroViewModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountTypeRecommendationResults", "Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationResults;", "context", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPortfolioPerformanceChart", "Lcom/robinhood/models/advisory/api/insights/ApiAdvisoryInsightsPerformanceChartModel;", "accountNumber", "insightId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AdvisoryApi {
    @GET("advisory/account_type_recommendation/intro/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AdvisoryRegionGate.class})
    Object getAccountTypeRecommendationIntro(Continuation<? super ApiAccountTypeRecommendationIntroViewModel> continuation);

    @GET("advisory/account_type_recommendation/results/{questionnaire_context}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AdvisoryRegionGate.class})
    Object getAccountTypeRecommendationResults(@Path("questionnaire_context") String str, Continuation<? super ApiAccountTypeRecommendationResults> continuation);

    @GET("advisory/first_time_contribution/{brokerage_account_type}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AdvisoryRegionGate.class})
    Object getFirstTimeContributionViewModel(@Path(AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM) BrokerageAccountType brokerageAccountType, Continuation<? super ApiAdvisoryFirstTimeContributionViewModel> continuation);

    @GET("advisory/insights/portfolio_performance/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AdvisoryRegionGate.class})
    Object getPortfolioPerformanceChart(@Query("account_number") String str, @Query(AdvisoryInsightDetailDeeplinkTarget.INSIGHT_ID_QUERY_PARAM) String str2, Continuation<? super ApiAdvisoryInsightsPerformanceChartModel> continuation);

    @GET("advisory/portfolio_reveal/{brokerage_account_type}/{application_id}")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {AdvisoryRegionGate.class})
    Object getPortfolioRevealViewModel(@Path(AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM) BrokerageAccountType brokerageAccountType, @Path("application_id") UUID uuid, Continuation<? super ApiPortfolioRevealViewModel> continuation);
}
