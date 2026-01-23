package com.robinhood.android.api.retirement;

import android.annotation.SuppressLint;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.models.retirement.api.ApiRetirement401kFinderResultsResponse;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverInterstitialResponse;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverResponse;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverSubmitUserInfoRequest;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverSubmitUserInfoResponse;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverUpdateTransactionRequest;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverUpdateTransactionRequest2;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverUserInfoResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementAccountComparisonResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementAccountCreatedResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementContributionsSummaryResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementDashboardSignupResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementFeeHistoryDetail;
import com.robinhood.android.models.retirement.api.ApiRetirementFeeHistoryResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementFundingMethodsResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchHubResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementOnboardingSubmitRequest;
import com.robinhood.android.models.retirement.api.ApiRetirementOnboardingSubmitResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpAccountSelection;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpEligibility;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpEnokiInfoResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpLimitationsInfoResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpRecommendationsInfoResponse;
import com.robinhood.android.models.retirement.api.ApiRetirementUninvestedViewModel;
import com.robinhood.android.models.retirement.api.ApiRothConversionInfoViewModel;
import com.robinhood.android.models.retirement.api.contributions.ApiGoldMatchAgreements;
import com.robinhood.android.models.retirement.api.contributions.ApiGoldMatchSelectionRowResponse;
import com.robinhood.android.models.retirement.api.contributions.ApiIraContributionBottomSheetResponse;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelection6;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionContributions;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionSubmitRequest;
import com.robinhood.android.models.retirement.api.contributions.ApiRetirementContributionsResponse;
import com.robinhood.android.models.retirement.api.dashboard.ApiRetirementAccountSwitcher;
import com.robinhood.android.models.retirement.api.dashboard.ApiRetirementCombinedContributionV2ViewModel;
import com.robinhood.android.models.retirement.api.dashboard.ApiRetirementCombinedSummaryCardViewModel;
import com.robinhood.android.models.retirement.api.dashboard.ApiRetirementDashboardState;
import com.robinhood.android.models.retirement.api.dashboard.ApiRetirementInvestmentAndTrade;
import com.robinhood.android.models.retirement.api.dashboard.ApiRetirementUnfundedV3ViewModel;
import com.robinhood.android.models.retirement.api.iraupsell.GoldBoostedMatchPromoPageViewModel;
import com.robinhood.android.models.retirement.api.partnerships.ApiRetirementClaimPartnershipBody;
import com.robinhood.android.models.retirement.api.partnerships.ApiRetirementClaimPartnershipResponse;
import com.robinhood.android.models.retirement.api.partnerships.ApiRetirementPartnershipDetailResponse;
import com.robinhood.android.models.retirement.api.rewards.ApiRetirementLearnAndEarnRewardResponse;
import com.robinhood.android.models.retirement.api.taxbenefits.ApiRetirementTaxBenefitsViewModel;
import com.robinhood.android.models.retirement.api.transfers.ApiRothConversionTransferInfo;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: RetirementApi.kt */
@Metadata(m3635d1 = {"\u0000ð\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0004J\"\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u0014\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0019\u001a\u00020\u001a2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001cH§@¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010 \u001a\u00020!H§@¢\u0006\u0002\u0010\"J\u001a\u0010#\u001a\u00020$2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010\u000bJ\u0018\u0010&\u001a\u00020'2\b\b\u0001\u0010(\u001a\u00020)H§@¢\u0006\u0002\u0010*J$\u0010+\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020!2\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010/J.\u00100\u001a\u00020,2\b\b\u0001\u0010-\u001a\u00020!2\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0002\u00101J\u000e\u00102\u001a\u000203H§@¢\u0006\u0002\u0010\u0004J\u000e\u00104\u001a\u000205H§@¢\u0006\u0002\u0010\u0004J\u000e\u00106\u001a\u000207H§@¢\u0006\u0002\u0010\u0004J\u000e\u00108\u001a\u000209H§@¢\u0006\u0002\u0010\u0004J,\u0010:\u001a\u00020;2\b\b\u0001\u0010<\u001a\u00020=2\b\b\u0001\u0010>\u001a\u00020\n2\b\b\u0001\u0010?\u001a\u00020\u0015H§@¢\u0006\u0002\u0010@J\u0018\u0010A\u001a\u00020B2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u000e\u0010C\u001a\u00020DH§@¢\u0006\u0002\u0010\u0004J\u000e\u0010E\u001a\u00020FH§@¢\u0006\u0002\u0010\u0004J\u0018\u0010G\u001a\u00020H2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u000e\u0010I\u001a\u00020JH§@¢\u0006\u0002\u0010\u0004J\u0018\u0010K\u001a\u00020L2\b\b\u0001\u0010M\u001a\u00020\u0015H§@¢\u0006\u0002\u0010NJ\u000e\u0010O\u001a\u00020PH§@¢\u0006\u0002\u0010\u0004J$\u0010Q\u001a\u00020R2\b\b\u0001\u0010S\u001a\u00020\n2\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010UJ\u0018\u0010V\u001a\u00020W2\b\b\u0001\u0010X\u001a\u00020YH§@¢\u0006\u0002\u0010ZJ\u0018\u0010[\u001a\u00020\\2\b\b\u0001\u0010X\u001a\u00020]H§@¢\u0006\u0002\u0010^J\u000e\u0010_\u001a\u00020`H§@¢\u0006\u0002\u0010\u0004J&\u0010a\u001a\u00020b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010UJ\u0018\u0010c\u001a\u00020d2\b\b\u0001\u0010e\u001a\u00020fH§@¢\u0006\u0002\u0010gJ\u000e\u0010h\u001a\u00020iH§@¢\u0006\u0002\u0010\u0004J\u0018\u0010j\u001a\u00020k2\b\b\u0001\u0010.\u001a\u00020lH§@¢\u0006\u0002\u0010mJ\u0018\u0010n\u001a\u00020k2\b\b\u0001\u0010o\u001a\u00020pH§@¢\u0006\u0002\u0010qJ\u000e\u0010r\u001a\u00020sH§@¢\u0006\u0002\u0010\u0004J\u000e\u0010t\u001a\u00020uH§@¢\u0006\u0002\u0010\u0004J\u000e\u0010v\u001a\u00020wH§@¢\u0006\u0002\u0010\u0004J\u0018\u0010x\u001a\u00020y2\b\b\u0001\u0010z\u001a\u00020fH§@¢\u0006\u0002\u0010gJ\u001a\u0010{\u001a\u00020|2\n\b\u0001\u0010}\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010\u000bJ\u001a\u0010~\u001a\u00020\u007f2\t\b\u0001\u0010X\u001a\u00030\u0080\u0001H§@¢\u0006\u0003\u0010\u0081\u0001J\u0010\u0010\u0082\u0001\u001a\u00030\u0083\u0001H§@¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0084\u0001\u001a\u00030\u0085\u00012\t\b\u0001\u0010\u0086\u0001\u001a\u00020fH§@¢\u0006\u0002\u0010gJ\u0010\u0010\u0087\u0001\u001a\u00030\u0088\u0001H§@¢\u0006\u0002\u0010\u0004¨\u0006\u0089\u0001"}, m3636d2 = {"Lcom/robinhood/android/api/retirement/RetirementApi;", "", "getRetirementDashboard", "Lcom/robinhood/android/models/retirement/api/dashboard/ApiRetirementDashboardState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRetirementContributionSummaryCard", "Lcom/robinhood/android/models/retirement/api/dashboard/ApiRetirementCombinedSummaryCardViewModel;", "getRetirementCombinedContributionV2ViewModel", "Lcom/robinhood/android/models/retirement/api/dashboard/ApiRetirementCombinedContributionV2ViewModel;", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRetirementUninvestedViewModel", "Lcom/robinhood/android/models/retirement/api/ApiRetirementUninvestedViewModel;", "getRetirementUnfundedV3ViewModel", "Lcom/robinhood/android/models/retirement/api/dashboard/ApiRetirementUnfundedV3ViewModel;", "getRetirementAccountSwitcher", "Lcom/robinhood/android/models/retirement/api/dashboard/ApiRetirementAccountSwitcher;", "getRetirementInvestmentAndTrade", "Lcom/robinhood/android/models/retirement/api/dashboard/ApiRetirementInvestmentAndTrade;", "hasPrivacy", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRetirementSignUpEligibility", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpEligibility;", "getRetirementSignUpAccountSelection", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpAccountSelection;", "managementType", "Lcom/robinhood/models/api/ManagementType;", "(Lcom/robinhood/models/api/ManagementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRetirementSignUpFlow", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "(Lcom/robinhood/models/api/BrokerageAccountType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRetirementSignupSwipeys", "Lcom/robinhood/android/models/retirement/api/ApiRetirementDashboardSignupResponse;", "firstSwipey", "submitRetirementSignUp", "Lcom/robinhood/android/models/retirement/api/ApiRetirementOnboardingSubmitResponse;", "onboardingSubmitRequest", "Lcom/robinhood/android/models/retirement/api/ApiRetirementOnboardingSubmitRequest;", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementOnboardingSubmitRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRetirementAccountCreatedLegacy", "Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountCreatedResponse;", "accountType", "entryPoint", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRetirementAccountCreated", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRetirementEnokiInfo", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpEnokiInfoResponse;", "getRetirementRecommendationsInfo", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpRecommendationsInfoResponse;", "getRetirementLimitationsInfo", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpLimitationsInfoResponse;", "getRetirementAccountComparison", "Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountComparisonResponse;", "getRetirementContributionBottomSheet", "Lcom/robinhood/android/models/retirement/api/contributions/ApiIraContributionBottomSheetResponse;", "taxYear", "", "amountSelected", "excludeUserContributionsSection", "(ILjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRetirementContributionScreenInfo", "Lcom/robinhood/android/models/retirement/api/contributions/ApiRetirementContributionsResponse;", "getRothConversionInfo", "Lcom/robinhood/android/models/retirement/api/ApiRothConversionInfoViewModel;", "getTransferInfo", "Lcom/robinhood/android/models/retirement/api/transfers/ApiRothConversionTransferInfo;", "getRetirementContributionsSummary", "Lcom/robinhood/android/models/retirement/api/ApiRetirementContributionsSummaryResponse;", "getRetirementMatchRate", "Lcom/robinhood/android/models/retirement/api/ApiRetirementMatchResponse;", "get401kRolloverInfo", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverResponse;", "hidePromo", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get401kRolloverUserInfo", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverUserInfoResponse;", "get401kRolloverInterstitial", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverInterstitialResponse;", "type", "transactionId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submit401kRolloverUserInfo", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverSubmitUserInfoResponse;", CarResultComposable2.BODY, "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverSubmitUserInfoRequest;", "(Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverSubmitUserInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update401kRolloverTransaction", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverUpdateTransactionResponse;", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverUpdateTransactionRequest;", "(Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverUpdateTransactionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRetirementTaxBenefits", "Lcom/robinhood/android/models/retirement/api/taxbenefits/ApiRetirementTaxBenefitsViewModel;", "getRetirementFundingMethods", "Lcom/robinhood/android/models/retirement/api/ApiRetirementFundingMethodsResponse;", "getLearnAndEarnReward", "Lcom/robinhood/android/models/retirement/api/rewards/ApiRetirementLearnAndEarnRewardResponse;", "rewardId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoldBoostedMatchPromo", "Lcom/robinhood/android/models/retirement/api/iraupsell/GoldBoostedMatchPromoPageViewModel$Response;", "getTransfersMatchRateSelectionViewModels", "Lcom/robinhood/android/models/retirement/api/contributions/ApiMatchRateSelectionContributions;", "Lcom/robinhood/android/models/retirement/api/contributions/MatchRateEntryPoint;", "(Lcom/robinhood/android/models/retirement/api/contributions/MatchRateEntryPoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitRetirementMatchRateSelectionInTransfers", "request", "Lcom/robinhood/android/models/retirement/api/contributions/ApiMatchRateSelectionSubmitRequest;", "(Lcom/robinhood/android/models/retirement/api/contributions/ApiMatchRateSelectionSubmitRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoldMatchSelectionRow", "Lcom/robinhood/android/models/retirement/api/contributions/ApiGoldMatchSelectionRowResponse;", "getGoldMatchAgreements", "Lcom/robinhood/android/models/retirement/api/contributions/ApiGoldMatchAgreements;", "getRetirementFeeHistory", "Lcom/robinhood/android/models/retirement/api/ApiRetirementFeeHistoryResponse;", "getRetirementFeeHistoryDetails", "Lcom/robinhood/android/models/retirement/api/ApiRetirementFeeHistoryDetail;", "id", "getRetirement1099PartnershipDetails", "Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementPartnershipDetailResponse;", "source", "postClaimPartnership", "Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementClaimPartnershipResponse;", "Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementClaimPartnershipBody;", "(Lcom/robinhood/android/models/retirement/api/partnerships/ApiRetirementClaimPartnershipBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRetirementMatchHub", "Lcom/robinhood/android/models/retirement/api/ApiRetirementMatchHubResponse;", "getIraTransferCelebration", "Lcom/robinhood/models/api/bonfire/ApiPostTransferPage$IraContributionCelebration$Data;", "transferId", "get401kAccountFinderResults", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kFinderResultsResponse;", "lib-api-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface RetirementApi {
    @GET("rad/retirement/rollover_401k/finder_results/")
    @SuppressLint({"NoNewRetrofitEndpoints"})
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object get401kAccountFinderResults(Continuation<? super ApiRetirement401kFinderResultsResponse> continuation);

    @GET("retirement/rollover_401k/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object get401kRolloverInfo(@Query("hide_promo") boolean z, Continuation<? super ApiRetirement401kRolloverResponse> continuation);

    @GET("retirement/rollover_401k/interstitial/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object get401kRolloverInterstitial(@Query("type") String str, @Query("transaction_id") String str2, Continuation<? super ApiRetirement401kRolloverInterstitialResponse> continuation);

    @GET("retirement/rollover_401k/user_info/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object get401kRolloverUserInfo(Continuation<? super ApiRetirement401kRolloverUserInfoResponse> continuation);

    @GET("retirement/match/promo_pages/gold/")
    @RequiresRegionGate(regionGates = {RetirementRegionGate.class})
    Object getGoldBoostedMatchPromo(Continuation<? super GoldBoostedMatchPromoPageViewModel.Response> continuation);

    @GET("retirement/match/gold_match_agreements/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getGoldMatchAgreements(Continuation<? super ApiGoldMatchAgreements> continuation);

    @GET("retirement/match/gold_selection_row/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getGoldMatchSelectionRow(Continuation<? super ApiGoldMatchSelectionRowResponse> continuation);

    @GET("retirement/transfer_celebration/{transfer_id}/")
    @RequiresRegionGate(regionGates = {RetirementRegionGate.class})
    Object getIraTransferCelebration(@Path(MatchSelectionActivity.TRANSFER_ID_EXTRA) UUID uuid, Continuation<? super ApiPostTransferPage.IraContributionCelebration.Data> continuation);

    @GET("retirement/learn_and_earn_reward/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getLearnAndEarnReward(@Query("id") UUID uuid, Continuation<? super ApiRetirementLearnAndEarnRewardResponse> continuation);

    @GET("retirement/1099_partnership_detail/")
    @RequiresRegionGate(regionGates = {RetirementRegionGate.class})
    Object getRetirement1099PartnershipDetails(@Query("source") String str, Continuation<? super ApiRetirementPartnershipDetailResponse> continuation);

    @GET("retirement_onboarding/account_comparison/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementAccountComparison(Continuation<? super ApiRetirementAccountComparisonResponse> continuation);

    @GET("retirement_onboarding/account_created/{brokerage_account_type}/{management_type}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementAccountCreated(@Path(AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM) BrokerageAccountType brokerageAccountType, @Path("management_type") ManagementType managementType, @Query("entry_point") String str, Continuation<? super ApiRetirementAccountCreatedResponse> continuation);

    @GET("retirement_onboarding/account_created/{brokerage_account_type}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementAccountCreatedLegacy(@Path(AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM) BrokerageAccountType brokerageAccountType, @Query("entry_point") String str, Continuation<? super ApiRetirementAccountCreatedResponse> continuation);

    @GET("retirement_dashboard/account_switcher/v2/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementAccountSwitcher(Continuation<? super ApiRetirementAccountSwitcher> continuation);

    @GET("retirement_dashboard/funded/combined_contribution/v2/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementCombinedContributionV2ViewModel(@Query("account_number") String str, Continuation<? super ApiRetirementCombinedContributionV2ViewModel> continuation);

    @GET("transfer/ira_contributions_bottom_sheet/{tax_year}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementContributionBottomSheet(@Path("tax_year") int i, @Query("amount_selected") String str, @Query("exclude_user_contributions_section") boolean z, Continuation<? super ApiIraContributionBottomSheetResponse> continuation);

    @GET("retirement_contributions/v2/{account_number}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementContributionScreenInfo(@Path("account_number") String str, Continuation<? super ApiRetirementContributionsResponse> continuation);

    @GET("retirement_dashboard/funded/contribution_summary_card/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementContributionSummaryCard(Continuation<? super ApiRetirementCombinedSummaryCardViewModel> continuation);

    @GET("retirement/contributions_summary/{account_number}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementContributionsSummary(@Path("account_number") String str, Continuation<? super ApiRetirementContributionsSummaryResponse> continuation);

    @GET("retirement_dashboard/state/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementDashboard(Continuation<? super ApiRetirementDashboardState> continuation);

    @GET("retirement_onboarding/enoki_info/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementEnokiInfo(Continuation<? super ApiRetirementSignUpEnokiInfoResponse> continuation);

    @GET("retirement/history/")
    @RequiresRegionGate(regionGates = {RetirementRegionGate.class})
    Object getRetirementFeeHistory(Continuation<? super ApiRetirementFeeHistoryResponse> continuation);

    @GET("retirement/history/{id}/details/")
    @RequiresRegionGate(regionGates = {RetirementRegionGate.class})
    Object getRetirementFeeHistoryDetails(@Path("id") UUID uuid, Continuation<? super ApiRetirementFeeHistoryDetail> continuation);

    @GET("retirement_funding_methods/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementFundingMethods(@Query("account_number") String str, @Query("entry_point") String str2, Continuation<? super ApiRetirementFundingMethodsResponse> continuation);

    @GET("portfolio/retirement/{account_number}/investment-trade/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementInvestmentAndTrade(@Path("account_number") String str, @Query("has_privacy") boolean z, Continuation<? super ApiRetirementInvestmentAndTrade> continuation);

    @GET("retirement_onboarding/limitations_info/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementLimitationsInfo(Continuation<? super ApiRetirementSignUpLimitationsInfoResponse> continuation);

    @GET("retirement/match_hub/")
    @RequiresRegionGate(regionGates = {RetirementRegionGate.class})
    Object getRetirementMatchHub(Continuation<? super ApiRetirementMatchHubResponse> continuation);

    @GET("retirement/match/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementMatchRate(Continuation<? super ApiRetirementMatchResponse> continuation);

    @GET("retirement_onboarding/recommended_portfolios_info/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementRecommendationsInfo(Continuation<? super ApiRetirementSignUpRecommendationsInfoResponse> continuation);

    @GET("retirement_onboarding/account_selection/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementSignUpAccountSelection(@Query("management_type") ManagementType managementType, Continuation<? super ApiRetirementSignUpAccountSelection> continuation);

    @GET("retirement_onboarding/signup_eligibility/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementSignUpEligibility(Continuation<? super ApiRetirementSignUpEligibility> continuation);

    @GET("retirement_onboarding/signup_flow/{brokerageAccountType}/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementSignUpFlow(@Path("brokerageAccountType") BrokerageAccountType brokerageAccountType, Continuation<? super ApiRetirementSignUpFlow> continuation);

    @GET("retirement_onboarding/swipeys/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementSignupSwipeys(@Query("first_swipey") String str, Continuation<? super ApiRetirementDashboardSignupResponse> continuation);

    @GET("retirement/tax_benefits/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementTaxBenefits(Continuation<? super ApiRetirementTaxBenefitsViewModel> continuation);

    @GET("retirement_dashboard/unfunded/v3/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementUnfundedV3ViewModel(Continuation<? super ApiRetirementUnfundedV3ViewModel> continuation);

    @GET("retirement_dashboard/funded/uninvested/{account_number}")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRetirementUninvestedViewModel(@Path("account_number") String str, Continuation<? super ApiRetirementUninvestedViewModel> continuation);

    @GET("retirement/roth_conversion/info/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getRothConversionInfo(Continuation<? super ApiRothConversionInfoViewModel> continuation);

    @GET("retirement/roth_conversion/review_state_info/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getTransferInfo(Continuation<? super ApiRothConversionTransferInfo> continuation);

    @GET("retirement/match/transfers_rate_selection_view/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object getTransfersMatchRateSelectionViewModels(@Query("entry_point") ApiMatchRateSelection6 apiMatchRateSelection6, Continuation<? super ApiMatchRateSelectionContributions> continuation);

    @POST("retirement/claim_1099_partnership/")
    @RequiresRegionGate(regionGates = {RetirementRegionGate.class})
    Object postClaimPartnership(@Body ApiRetirementClaimPartnershipBody apiRetirementClaimPartnershipBody, Continuation<? super ApiRetirementClaimPartnershipResponse> continuation);

    @POST("retirement/rollover_401k/submit_user_info")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object submit401kRolloverUserInfo(@Body ApiRetirement401kRolloverSubmitUserInfoRequest apiRetirement401kRolloverSubmitUserInfoRequest, Continuation<? super ApiRetirement401kRolloverSubmitUserInfoResponse> continuation);

    @POST("retirement/match/transfers_rate_selection_view/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object submitRetirementMatchRateSelectionInTransfers(@Body ApiMatchRateSelectionSubmitRequest apiMatchRateSelectionSubmitRequest, Continuation<? super ApiMatchRateSelectionContributions> continuation);

    @POST("retirement_onboarding/submit/")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object submitRetirementSignUp(@Body ApiRetirementOnboardingSubmitRequest apiRetirementOnboardingSubmitRequest, Continuation<? super ApiRetirementOnboardingSubmitResponse> continuation);

    @POST("retirement/rollover_401k/update_transaction")
    @RequiresRegionGate(logIfNotInRegionGate = true, regionGates = {RetirementRegionGate.class})
    Object update401kRolloverTransaction(@Body ApiRetirement401kRolloverUpdateTransactionRequest apiRetirement401kRolloverUpdateTransactionRequest, Continuation<? super ApiRetirement401kRolloverUpdateTransactionRequest2> continuation);

    /* compiled from: RetirementApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getRetirementInvestmentAndTrade$default(RetirementApi retirementApi, String str, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRetirementInvestmentAndTrade");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return retirementApi.getRetirementInvestmentAndTrade(str, z, continuation);
        }

        public static /* synthetic */ Object getRetirementAccountCreatedLegacy$default(RetirementApi retirementApi, BrokerageAccountType brokerageAccountType, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRetirementAccountCreatedLegacy");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return retirementApi.getRetirementAccountCreatedLegacy(brokerageAccountType, str, continuation);
        }

        public static /* synthetic */ Object getRetirementAccountCreated$default(RetirementApi retirementApi, BrokerageAccountType brokerageAccountType, ManagementType managementType, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRetirementAccountCreated");
            }
            if ((i & 4) != 0) {
                str = null;
            }
            return retirementApi.getRetirementAccountCreated(brokerageAccountType, managementType, str, continuation);
        }
    }
}
