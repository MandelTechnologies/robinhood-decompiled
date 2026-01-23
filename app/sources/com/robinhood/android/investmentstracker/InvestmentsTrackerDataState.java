package com.robinhood.android.investmentstracker;

import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingSecondPageDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerPageTypeDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerTooltipDataDto;
import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDataState;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAgreementViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAllocationsBarViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceHeaderViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherViewModel;
import com.robinhood.android.investmentstracker.viewmodels.OnboardingViewModel;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestmentsTrackerDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0002\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010#\u001a\u00020$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010-\u001a\u00020\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00100\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J\u0010\u0010`\u001a\u00020\u00002\u0006\u0010a\u001a\u00020\u0006H\u0016J\u0012\u0010b\u001a\u00020\u00002\b\u0010c\u001a\u0004\u0018\u00010\u000bH\u0016J\u0011\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0006HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010m\u001a\u00020\u0006HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010p\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eHÆ\u0003J\u0011\u0010q\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eHÆ\u0003J\t\u0010r\u001a\u00020\u0006HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010x\u001a\u00020\u0006HÆ\u0003J\u000f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010|\u001a\u00020\u0006HÆ\u0003J\t\u0010}\u001a\u00020\u0006HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\"HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020$HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010,HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0006HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0006HÆ\u0003Jö\u0002\u0010\u0088\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00062\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010-\u001a\u00020\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\b\b\u0002\u00100\u001a\u00020\u0006HÆ\u0001J\u0016\u0010\u0089\u0001\u001a\u00020\u00062\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u0001HÖ\u0003J\u000b\u0010\u008c\u0001\u001a\u00030\u008d\u0001HÖ\u0001J\n\u0010\u008e\u0001\u001a\u00020\u000bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u00106R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b@\u00106R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bC\u0010BR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010;R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bG\u0010BR\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bH\u00106R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bK\u0010;R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bL\u0010;R\u0011\u0010\u001e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bM\u00106R\u0011\u0010\u001f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bN\u00106R\u0013\u0010 \u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bO\u0010;R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0013\u0010+\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0011\u0010-\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\\\u00106R\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u00100\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b_\u00106R\u0011\u0010d\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0011\u0010h\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bi\u00106¨\u0006\u008f\u0001"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;", "Lcom/robinhood/android/investmentstracker/features/plaid/PlaidEnabledDataState;", "components", "", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponent;", "callingPlaidPrepareEndpoint", "", "spanOption", "Lcom/robinhood/android/charts/models/db/SpanOption;", "loadingNewSpan", "amountOverride", "", "subtitleOverride", "accountWasSelectedForThisNavigation", "Lcom/robinhood/udf/UiEvent;", "poppingScreen", "showHomeHeader", "baseSwitcherDataFromLastRequest", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherViewModel;", "currentSwitcherData", "activeAllocationBarId", "headerInfo", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerPerformanceHeaderViewModel;", "switcherData", "inAllocationsView", "currentPageInformationStack", "Lkotlin/collections/ArrayDeque;", "Lcom/robinhood/android/investmentstracker/CurrentPageInformation;", "navigationTitle", "updateModeAccountLinkId", "usingUpdateMode", "canUseGradient", "disclosureMarkdown", "allocationBarData", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAllocationsBarViewModel;", "securityFilter", "Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "onboardingData", "Lcom/robinhood/android/investmentstracker/viewmodels/OnboardingViewModel;", "onboardingBottomSheetPagePopupData", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPageDto;", "agreementResponse", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAgreementViewModel;", "infoSheetData", "Lbff_money_movement/service/v1/InvestmentsTrackerTooltipDataDto;", "showExoPlayer", "analyticsState", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerAnalyticsStateData;", "showLoadingPage", "<init>", "(Ljava/util/List;ZLcom/robinhood/android/charts/models/db/SpanOption;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherViewModel;Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherViewModel;Ljava/lang/String;Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerPerformanceHeaderViewModel;Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherViewModel;ZLkotlin/collections/ArrayDeque;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAllocationsBarViewModel;Lcom/robinhood/android/investmentstracker/security/SecurityFilter;Lcom/robinhood/android/investmentstracker/viewmodels/OnboardingViewModel;Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPageDto;Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAgreementViewModel;Lbff_money_movement/service/v1/InvestmentsTrackerTooltipDataDto;ZLcom/robinhood/android/investmentstracker/InvestmentsTrackerAnalyticsStateData;Z)V", "getComponents", "()Ljava/util/List;", "getCallingPlaidPrepareEndpoint", "()Z", "getSpanOption", "()Lcom/robinhood/android/charts/models/db/SpanOption;", "getLoadingNewSpan", "getAmountOverride", "()Ljava/lang/String;", "getSubtitleOverride", "getAccountWasSelectedForThisNavigation", "()Lcom/robinhood/udf/UiEvent;", "getPoppingScreen", "getShowHomeHeader", "getBaseSwitcherDataFromLastRequest", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherViewModel;", "getCurrentSwitcherData", "getActiveAllocationBarId", "getHeaderInfo", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerPerformanceHeaderViewModel;", "getSwitcherData", "getInAllocationsView", "getCurrentPageInformationStack", "()Lkotlin/collections/ArrayDeque;", "getNavigationTitle", "getUpdateModeAccountLinkId", "getUsingUpdateMode", "getCanUseGradient", "getDisclosureMarkdown", "getAllocationBarData", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAllocationsBarViewModel;", "getSecurityFilter", "()Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "getOnboardingData", "()Lcom/robinhood/android/investmentstracker/viewmodels/OnboardingViewModel;", "getOnboardingBottomSheetPagePopupData", "()Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPageDto;", "getAgreementResponse", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAgreementViewModel;", "getInfoSheetData", "()Lbff_money_movement/service/v1/InvestmentsTrackerTooltipDataDto;", "getShowExoPlayer", "getAnalyticsState", "()Lcom/robinhood/android/investmentstracker/InvestmentsTrackerAnalyticsStateData;", "getShowLoadingPage", "updateCallingPlaidPrepareEndpoint", "calling", "updateAccountLinkIdForUpdateMode", "accountLinkId", "currentPageType", "Lbff_money_movement/service/v1/InvestmentsTrackerPageTypeDto;", "getCurrentPageType", "()Lbff_money_movement/service/v1/InvestmentsTrackerPageTypeDto;", "inHomeExperience", "getInHomeExperience", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestmentsTrackerDataState implements PlaidEnabledDataState {
    public static final int $stable = 8;
    private final UiEvent<Boolean> accountWasSelectedForThisNavigation;
    private final String activeAllocationBarId;
    private final InvestmentsTrackerAgreementViewModel agreementResponse;
    private final InvestmentsTrackerAllocationsBarViewModel allocationBarData;
    private final String amountOverride;
    private final InvestmentsTrackerAnalyticsStateData analyticsState;
    private final InvestmentsTrackerSwitcherViewModel baseSwitcherDataFromLastRequest;
    private final boolean callingPlaidPrepareEndpoint;
    private final boolean canUseGradient;
    private final List<InvestmentsTrackerComponent> components;
    private final ArrayDeque<CurrentPageInformation> currentPageInformationStack;
    private final InvestmentsTrackerSwitcherViewModel currentSwitcherData;
    private final String disclosureMarkdown;
    private final InvestmentsTrackerPerformanceHeaderViewModel headerInfo;
    private final boolean inAllocationsView;
    private final InvestmentsTrackerTooltipDataDto infoSheetData;
    private final boolean loadingNewSpan;
    private final String navigationTitle;
    private final InvestmentsTrackerOnboardingSecondPageDto onboardingBottomSheetPagePopupData;
    private final OnboardingViewModel onboardingData;
    private final UiEvent<Boolean> poppingScreen;
    private final SecurityFilter securityFilter;
    private final boolean showExoPlayer;
    private final boolean showHomeHeader;
    private final boolean showLoadingPage;
    private final SpanOption spanOption;
    private final String subtitleOverride;
    private final InvestmentsTrackerSwitcherViewModel switcherData;
    private final String updateModeAccountLinkId;
    private final boolean usingUpdateMode;

    public static /* synthetic */ InvestmentsTrackerDataState copy$default(InvestmentsTrackerDataState investmentsTrackerDataState, List list, boolean z, SpanOption spanOption, boolean z2, String str, String str2, UiEvent uiEvent, UiEvent uiEvent2, boolean z3, InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel, InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel2, String str3, InvestmentsTrackerPerformanceHeaderViewModel investmentsTrackerPerformanceHeaderViewModel, InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel3, boolean z4, ArrayDeque arrayDeque, String str4, String str5, boolean z5, boolean z6, String str6, InvestmentsTrackerAllocationsBarViewModel investmentsTrackerAllocationsBarViewModel, SecurityFilter securityFilter, OnboardingViewModel onboardingViewModel, InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto, InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel, InvestmentsTrackerTooltipDataDto investmentsTrackerTooltipDataDto, boolean z7, InvestmentsTrackerAnalyticsStateData investmentsTrackerAnalyticsStateData, boolean z8, int i, Object obj) {
        boolean z9;
        InvestmentsTrackerAnalyticsStateData investmentsTrackerAnalyticsStateData2;
        List list2 = (i & 1) != 0 ? investmentsTrackerDataState.components : list;
        boolean z10 = (i & 2) != 0 ? investmentsTrackerDataState.callingPlaidPrepareEndpoint : z;
        SpanOption spanOption2 = (i & 4) != 0 ? investmentsTrackerDataState.spanOption : spanOption;
        boolean z11 = (i & 8) != 0 ? investmentsTrackerDataState.loadingNewSpan : z2;
        String str7 = (i & 16) != 0 ? investmentsTrackerDataState.amountOverride : str;
        String str8 = (i & 32) != 0 ? investmentsTrackerDataState.subtitleOverride : str2;
        UiEvent uiEvent3 = (i & 64) != 0 ? investmentsTrackerDataState.accountWasSelectedForThisNavigation : uiEvent;
        UiEvent uiEvent4 = (i & 128) != 0 ? investmentsTrackerDataState.poppingScreen : uiEvent2;
        boolean z12 = (i & 256) != 0 ? investmentsTrackerDataState.showHomeHeader : z3;
        InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel4 = (i & 512) != 0 ? investmentsTrackerDataState.baseSwitcherDataFromLastRequest : investmentsTrackerSwitcherViewModel;
        InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel5 = (i & 1024) != 0 ? investmentsTrackerDataState.currentSwitcherData : investmentsTrackerSwitcherViewModel2;
        String str9 = (i & 2048) != 0 ? investmentsTrackerDataState.activeAllocationBarId : str3;
        InvestmentsTrackerPerformanceHeaderViewModel investmentsTrackerPerformanceHeaderViewModel2 = (i & 4096) != 0 ? investmentsTrackerDataState.headerInfo : investmentsTrackerPerformanceHeaderViewModel;
        InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel6 = (i & 8192) != 0 ? investmentsTrackerDataState.switcherData : investmentsTrackerSwitcherViewModel3;
        List list3 = list2;
        boolean z13 = (i & 16384) != 0 ? investmentsTrackerDataState.inAllocationsView : z4;
        ArrayDeque arrayDeque2 = (i & 32768) != 0 ? investmentsTrackerDataState.currentPageInformationStack : arrayDeque;
        String str10 = (i & 65536) != 0 ? investmentsTrackerDataState.navigationTitle : str4;
        String str11 = (i & 131072) != 0 ? investmentsTrackerDataState.updateModeAccountLinkId : str5;
        boolean z14 = (i & 262144) != 0 ? investmentsTrackerDataState.usingUpdateMode : z5;
        boolean z15 = (i & 524288) != 0 ? investmentsTrackerDataState.canUseGradient : z6;
        String str12 = (i & 1048576) != 0 ? investmentsTrackerDataState.disclosureMarkdown : str6;
        InvestmentsTrackerAllocationsBarViewModel investmentsTrackerAllocationsBarViewModel2 = (i & 2097152) != 0 ? investmentsTrackerDataState.allocationBarData : investmentsTrackerAllocationsBarViewModel;
        SecurityFilter securityFilter2 = (i & 4194304) != 0 ? investmentsTrackerDataState.securityFilter : securityFilter;
        OnboardingViewModel onboardingViewModel2 = (i & 8388608) != 0 ? investmentsTrackerDataState.onboardingData : onboardingViewModel;
        InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto2 = (i & 16777216) != 0 ? investmentsTrackerDataState.onboardingBottomSheetPagePopupData : investmentsTrackerOnboardingSecondPageDto;
        InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel2 = (i & 33554432) != 0 ? investmentsTrackerDataState.agreementResponse : investmentsTrackerAgreementViewModel;
        InvestmentsTrackerTooltipDataDto investmentsTrackerTooltipDataDto2 = (i & 67108864) != 0 ? investmentsTrackerDataState.infoSheetData : investmentsTrackerTooltipDataDto;
        boolean z16 = (i & 134217728) != 0 ? investmentsTrackerDataState.showExoPlayer : z7;
        InvestmentsTrackerAnalyticsStateData investmentsTrackerAnalyticsStateData3 = (i & 268435456) != 0 ? investmentsTrackerDataState.analyticsState : investmentsTrackerAnalyticsStateData;
        if ((i & 536870912) != 0) {
            investmentsTrackerAnalyticsStateData2 = investmentsTrackerAnalyticsStateData3;
            z9 = investmentsTrackerDataState.showLoadingPage;
        } else {
            z9 = z8;
            investmentsTrackerAnalyticsStateData2 = investmentsTrackerAnalyticsStateData3;
        }
        return investmentsTrackerDataState.copy(list3, z10, spanOption2, z11, str7, str8, uiEvent3, uiEvent4, z12, investmentsTrackerSwitcherViewModel4, investmentsTrackerSwitcherViewModel5, str9, investmentsTrackerPerformanceHeaderViewModel2, investmentsTrackerSwitcherViewModel6, z13, arrayDeque2, str10, str11, z14, z15, str12, investmentsTrackerAllocationsBarViewModel2, securityFilter2, onboardingViewModel2, investmentsTrackerOnboardingSecondPageDto2, investmentsTrackerAgreementViewModel2, investmentsTrackerTooltipDataDto2, z16, investmentsTrackerAnalyticsStateData2, z9);
    }

    public final List<InvestmentsTrackerComponent> component1() {
        return this.components;
    }

    /* renamed from: component10, reason: from getter */
    public final InvestmentsTrackerSwitcherViewModel getBaseSwitcherDataFromLastRequest() {
        return this.baseSwitcherDataFromLastRequest;
    }

    /* renamed from: component11, reason: from getter */
    public final InvestmentsTrackerSwitcherViewModel getCurrentSwitcherData() {
        return this.currentSwitcherData;
    }

    /* renamed from: component12, reason: from getter */
    public final String getActiveAllocationBarId() {
        return this.activeAllocationBarId;
    }

    /* renamed from: component13, reason: from getter */
    public final InvestmentsTrackerPerformanceHeaderViewModel getHeaderInfo() {
        return this.headerInfo;
    }

    /* renamed from: component14, reason: from getter */
    public final InvestmentsTrackerSwitcherViewModel getSwitcherData() {
        return this.switcherData;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getInAllocationsView() {
        return this.inAllocationsView;
    }

    public final ArrayDeque<CurrentPageInformation> component16() {
        return this.currentPageInformationStack;
    }

    /* renamed from: component17, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* renamed from: component18, reason: from getter */
    public final String getUpdateModeAccountLinkId() {
        return this.updateModeAccountLinkId;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getUsingUpdateMode() {
        return this.usingUpdateMode;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCallingPlaidPrepareEndpoint() {
        return this.callingPlaidPrepareEndpoint;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getCanUseGradient() {
        return this.canUseGradient;
    }

    /* renamed from: component21, reason: from getter */
    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    /* renamed from: component22, reason: from getter */
    public final InvestmentsTrackerAllocationsBarViewModel getAllocationBarData() {
        return this.allocationBarData;
    }

    /* renamed from: component23, reason: from getter */
    public final SecurityFilter getSecurityFilter() {
        return this.securityFilter;
    }

    /* renamed from: component24, reason: from getter */
    public final OnboardingViewModel getOnboardingData() {
        return this.onboardingData;
    }

    /* renamed from: component25, reason: from getter */
    public final InvestmentsTrackerOnboardingSecondPageDto getOnboardingBottomSheetPagePopupData() {
        return this.onboardingBottomSheetPagePopupData;
    }

    /* renamed from: component26, reason: from getter */
    public final InvestmentsTrackerAgreementViewModel getAgreementResponse() {
        return this.agreementResponse;
    }

    /* renamed from: component27, reason: from getter */
    public final InvestmentsTrackerTooltipDataDto getInfoSheetData() {
        return this.infoSheetData;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getShowExoPlayer() {
        return this.showExoPlayer;
    }

    /* renamed from: component29, reason: from getter */
    public final InvestmentsTrackerAnalyticsStateData getAnalyticsState() {
        return this.analyticsState;
    }

    /* renamed from: component3, reason: from getter */
    public final SpanOption getSpanOption() {
        return this.spanOption;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getShowLoadingPage() {
        return this.showLoadingPage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getLoadingNewSpan() {
        return this.loadingNewSpan;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAmountOverride() {
        return this.amountOverride;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSubtitleOverride() {
        return this.subtitleOverride;
    }

    public final UiEvent<Boolean> component7() {
        return this.accountWasSelectedForThisNavigation;
    }

    public final UiEvent<Boolean> component8() {
        return this.poppingScreen;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowHomeHeader() {
        return this.showHomeHeader;
    }

    public final InvestmentsTrackerDataState copy(List<InvestmentsTrackerComponent> components, boolean callingPlaidPrepareEndpoint, SpanOption spanOption, boolean loadingNewSpan, String amountOverride, String subtitleOverride, UiEvent<Boolean> accountWasSelectedForThisNavigation, UiEvent<Boolean> poppingScreen, boolean showHomeHeader, InvestmentsTrackerSwitcherViewModel baseSwitcherDataFromLastRequest, InvestmentsTrackerSwitcherViewModel currentSwitcherData, String activeAllocationBarId, InvestmentsTrackerPerformanceHeaderViewModel headerInfo, InvestmentsTrackerSwitcherViewModel switcherData, boolean inAllocationsView, ArrayDeque<CurrentPageInformation> currentPageInformationStack, String navigationTitle, String updateModeAccountLinkId, boolean usingUpdateMode, boolean canUseGradient, String disclosureMarkdown, InvestmentsTrackerAllocationsBarViewModel allocationBarData, SecurityFilter securityFilter, OnboardingViewModel onboardingData, InvestmentsTrackerOnboardingSecondPageDto onboardingBottomSheetPagePopupData, InvestmentsTrackerAgreementViewModel agreementResponse, InvestmentsTrackerTooltipDataDto infoSheetData, boolean showExoPlayer, InvestmentsTrackerAnalyticsStateData analyticsState, boolean showLoadingPage) {
        Intrinsics.checkNotNullParameter(currentPageInformationStack, "currentPageInformationStack");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        return new InvestmentsTrackerDataState(components, callingPlaidPrepareEndpoint, spanOption, loadingNewSpan, amountOverride, subtitleOverride, accountWasSelectedForThisNavigation, poppingScreen, showHomeHeader, baseSwitcherDataFromLastRequest, currentSwitcherData, activeAllocationBarId, headerInfo, switcherData, inAllocationsView, currentPageInformationStack, navigationTitle, updateModeAccountLinkId, usingUpdateMode, canUseGradient, disclosureMarkdown, allocationBarData, securityFilter, onboardingData, onboardingBottomSheetPagePopupData, agreementResponse, infoSheetData, showExoPlayer, analyticsState, showLoadingPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerDataState)) {
            return false;
        }
        InvestmentsTrackerDataState investmentsTrackerDataState = (InvestmentsTrackerDataState) other;
        return Intrinsics.areEqual(this.components, investmentsTrackerDataState.components) && this.callingPlaidPrepareEndpoint == investmentsTrackerDataState.callingPlaidPrepareEndpoint && Intrinsics.areEqual(this.spanOption, investmentsTrackerDataState.spanOption) && this.loadingNewSpan == investmentsTrackerDataState.loadingNewSpan && Intrinsics.areEqual(this.amountOverride, investmentsTrackerDataState.amountOverride) && Intrinsics.areEqual(this.subtitleOverride, investmentsTrackerDataState.subtitleOverride) && Intrinsics.areEqual(this.accountWasSelectedForThisNavigation, investmentsTrackerDataState.accountWasSelectedForThisNavigation) && Intrinsics.areEqual(this.poppingScreen, investmentsTrackerDataState.poppingScreen) && this.showHomeHeader == investmentsTrackerDataState.showHomeHeader && Intrinsics.areEqual(this.baseSwitcherDataFromLastRequest, investmentsTrackerDataState.baseSwitcherDataFromLastRequest) && Intrinsics.areEqual(this.currentSwitcherData, investmentsTrackerDataState.currentSwitcherData) && Intrinsics.areEqual(this.activeAllocationBarId, investmentsTrackerDataState.activeAllocationBarId) && Intrinsics.areEqual(this.headerInfo, investmentsTrackerDataState.headerInfo) && Intrinsics.areEqual(this.switcherData, investmentsTrackerDataState.switcherData) && this.inAllocationsView == investmentsTrackerDataState.inAllocationsView && Intrinsics.areEqual(this.currentPageInformationStack, investmentsTrackerDataState.currentPageInformationStack) && Intrinsics.areEqual(this.navigationTitle, investmentsTrackerDataState.navigationTitle) && Intrinsics.areEqual(this.updateModeAccountLinkId, investmentsTrackerDataState.updateModeAccountLinkId) && this.usingUpdateMode == investmentsTrackerDataState.usingUpdateMode && this.canUseGradient == investmentsTrackerDataState.canUseGradient && Intrinsics.areEqual(this.disclosureMarkdown, investmentsTrackerDataState.disclosureMarkdown) && Intrinsics.areEqual(this.allocationBarData, investmentsTrackerDataState.allocationBarData) && Intrinsics.areEqual(this.securityFilter, investmentsTrackerDataState.securityFilter) && Intrinsics.areEqual(this.onboardingData, investmentsTrackerDataState.onboardingData) && Intrinsics.areEqual(this.onboardingBottomSheetPagePopupData, investmentsTrackerDataState.onboardingBottomSheetPagePopupData) && Intrinsics.areEqual(this.agreementResponse, investmentsTrackerDataState.agreementResponse) && Intrinsics.areEqual(this.infoSheetData, investmentsTrackerDataState.infoSheetData) && this.showExoPlayer == investmentsTrackerDataState.showExoPlayer && Intrinsics.areEqual(this.analyticsState, investmentsTrackerDataState.analyticsState) && this.showLoadingPage == investmentsTrackerDataState.showLoadingPage;
    }

    public int hashCode() {
        List<InvestmentsTrackerComponent> list = this.components;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + Boolean.hashCode(this.callingPlaidPrepareEndpoint)) * 31;
        SpanOption spanOption = this.spanOption;
        int iHashCode2 = (((iHashCode + (spanOption == null ? 0 : spanOption.hashCode())) * 31) + Boolean.hashCode(this.loadingNewSpan)) * 31;
        String str = this.amountOverride;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitleOverride;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiEvent<Boolean> uiEvent = this.accountWasSelectedForThisNavigation;
        int iHashCode5 = (iHashCode4 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Boolean> uiEvent2 = this.poppingScreen;
        int iHashCode6 = (((iHashCode5 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31) + Boolean.hashCode(this.showHomeHeader)) * 31;
        InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel = this.baseSwitcherDataFromLastRequest;
        int iHashCode7 = (iHashCode6 + (investmentsTrackerSwitcherViewModel == null ? 0 : investmentsTrackerSwitcherViewModel.hashCode())) * 31;
        InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel2 = this.currentSwitcherData;
        int iHashCode8 = (iHashCode7 + (investmentsTrackerSwitcherViewModel2 == null ? 0 : investmentsTrackerSwitcherViewModel2.hashCode())) * 31;
        String str3 = this.activeAllocationBarId;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InvestmentsTrackerPerformanceHeaderViewModel investmentsTrackerPerformanceHeaderViewModel = this.headerInfo;
        int iHashCode10 = (iHashCode9 + (investmentsTrackerPerformanceHeaderViewModel == null ? 0 : investmentsTrackerPerformanceHeaderViewModel.hashCode())) * 31;
        InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel3 = this.switcherData;
        int iHashCode11 = (((((iHashCode10 + (investmentsTrackerSwitcherViewModel3 == null ? 0 : investmentsTrackerSwitcherViewModel3.hashCode())) * 31) + Boolean.hashCode(this.inAllocationsView)) * 31) + this.currentPageInformationStack.hashCode()) * 31;
        String str4 = this.navigationTitle;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.updateModeAccountLinkId;
        int iHashCode13 = (((((iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.usingUpdateMode)) * 31) + Boolean.hashCode(this.canUseGradient)) * 31;
        String str6 = this.disclosureMarkdown;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        InvestmentsTrackerAllocationsBarViewModel investmentsTrackerAllocationsBarViewModel = this.allocationBarData;
        int iHashCode15 = (((iHashCode14 + (investmentsTrackerAllocationsBarViewModel == null ? 0 : investmentsTrackerAllocationsBarViewModel.hashCode())) * 31) + this.securityFilter.hashCode()) * 31;
        OnboardingViewModel onboardingViewModel = this.onboardingData;
        int iHashCode16 = (iHashCode15 + (onboardingViewModel == null ? 0 : onboardingViewModel.hashCode())) * 31;
        InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto = this.onboardingBottomSheetPagePopupData;
        int iHashCode17 = (iHashCode16 + (investmentsTrackerOnboardingSecondPageDto == null ? 0 : investmentsTrackerOnboardingSecondPageDto.hashCode())) * 31;
        InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel = this.agreementResponse;
        int iHashCode18 = (iHashCode17 + (investmentsTrackerAgreementViewModel == null ? 0 : investmentsTrackerAgreementViewModel.hashCode())) * 31;
        InvestmentsTrackerTooltipDataDto investmentsTrackerTooltipDataDto = this.infoSheetData;
        int iHashCode19 = (((iHashCode18 + (investmentsTrackerTooltipDataDto == null ? 0 : investmentsTrackerTooltipDataDto.hashCode())) * 31) + Boolean.hashCode(this.showExoPlayer)) * 31;
        InvestmentsTrackerAnalyticsStateData investmentsTrackerAnalyticsStateData = this.analyticsState;
        return ((iHashCode19 + (investmentsTrackerAnalyticsStateData != null ? investmentsTrackerAnalyticsStateData.hashCode() : 0)) * 31) + Boolean.hashCode(this.showLoadingPage);
    }

    public String toString() {
        return "InvestmentsTrackerDataState(components=" + this.components + ", callingPlaidPrepareEndpoint=" + this.callingPlaidPrepareEndpoint + ", spanOption=" + this.spanOption + ", loadingNewSpan=" + this.loadingNewSpan + ", amountOverride=" + this.amountOverride + ", subtitleOverride=" + this.subtitleOverride + ", accountWasSelectedForThisNavigation=" + this.accountWasSelectedForThisNavigation + ", poppingScreen=" + this.poppingScreen + ", showHomeHeader=" + this.showHomeHeader + ", baseSwitcherDataFromLastRequest=" + this.baseSwitcherDataFromLastRequest + ", currentSwitcherData=" + this.currentSwitcherData + ", activeAllocationBarId=" + this.activeAllocationBarId + ", headerInfo=" + this.headerInfo + ", switcherData=" + this.switcherData + ", inAllocationsView=" + this.inAllocationsView + ", currentPageInformationStack=" + this.currentPageInformationStack + ", navigationTitle=" + this.navigationTitle + ", updateModeAccountLinkId=" + this.updateModeAccountLinkId + ", usingUpdateMode=" + this.usingUpdateMode + ", canUseGradient=" + this.canUseGradient + ", disclosureMarkdown=" + this.disclosureMarkdown + ", allocationBarData=" + this.allocationBarData + ", securityFilter=" + this.securityFilter + ", onboardingData=" + this.onboardingData + ", onboardingBottomSheetPagePopupData=" + this.onboardingBottomSheetPagePopupData + ", agreementResponse=" + this.agreementResponse + ", infoSheetData=" + this.infoSheetData + ", showExoPlayer=" + this.showExoPlayer + ", analyticsState=" + this.analyticsState + ", showLoadingPage=" + this.showLoadingPage + ")";
    }

    public InvestmentsTrackerDataState(List<InvestmentsTrackerComponent> list, boolean z, SpanOption spanOption, boolean z2, String str, String str2, UiEvent<Boolean> uiEvent, UiEvent<Boolean> uiEvent2, boolean z3, InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel, InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel2, String str3, InvestmentsTrackerPerformanceHeaderViewModel investmentsTrackerPerformanceHeaderViewModel, InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel3, boolean z4, ArrayDeque<CurrentPageInformation> currentPageInformationStack, String str4, String str5, boolean z5, boolean z6, String str6, InvestmentsTrackerAllocationsBarViewModel investmentsTrackerAllocationsBarViewModel, SecurityFilter securityFilter, OnboardingViewModel onboardingViewModel, InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto, InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel, InvestmentsTrackerTooltipDataDto investmentsTrackerTooltipDataDto, boolean z7, InvestmentsTrackerAnalyticsStateData investmentsTrackerAnalyticsStateData, boolean z8) {
        Intrinsics.checkNotNullParameter(currentPageInformationStack, "currentPageInformationStack");
        Intrinsics.checkNotNullParameter(securityFilter, "securityFilter");
        this.components = list;
        this.callingPlaidPrepareEndpoint = z;
        this.spanOption = spanOption;
        this.loadingNewSpan = z2;
        this.amountOverride = str;
        this.subtitleOverride = str2;
        this.accountWasSelectedForThisNavigation = uiEvent;
        this.poppingScreen = uiEvent2;
        this.showHomeHeader = z3;
        this.baseSwitcherDataFromLastRequest = investmentsTrackerSwitcherViewModel;
        this.currentSwitcherData = investmentsTrackerSwitcherViewModel2;
        this.activeAllocationBarId = str3;
        this.headerInfo = investmentsTrackerPerformanceHeaderViewModel;
        this.switcherData = investmentsTrackerSwitcherViewModel3;
        this.inAllocationsView = z4;
        this.currentPageInformationStack = currentPageInformationStack;
        this.navigationTitle = str4;
        this.updateModeAccountLinkId = str5;
        this.usingUpdateMode = z5;
        this.canUseGradient = z6;
        this.disclosureMarkdown = str6;
        this.allocationBarData = investmentsTrackerAllocationsBarViewModel;
        this.securityFilter = securityFilter;
        this.onboardingData = onboardingViewModel;
        this.onboardingBottomSheetPagePopupData = investmentsTrackerOnboardingSecondPageDto;
        this.agreementResponse = investmentsTrackerAgreementViewModel;
        this.infoSheetData = investmentsTrackerTooltipDataDto;
        this.showExoPlayer = z7;
        this.analyticsState = investmentsTrackerAnalyticsStateData;
        this.showLoadingPage = z8;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InvestmentsTrackerDataState(java.util.List r35, boolean r36, com.robinhood.android.charts.models.p080db.SpanOption r37, boolean r38, java.lang.String r39, java.lang.String r40, com.robinhood.udf.UiEvent r41, com.robinhood.udf.UiEvent r42, boolean r43, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherViewModel r44, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherViewModel r45, java.lang.String r46, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceHeaderViewModel r47, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherViewModel r48, boolean r49, kotlin.collections.ArrayDeque r50, java.lang.String r51, java.lang.String r52, boolean r53, boolean r54, java.lang.String r55, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAllocationsBarViewModel r56, com.robinhood.android.investmentstracker.security.SecurityFilter r57, com.robinhood.android.investmentstracker.viewmodels.OnboardingViewModel r58, bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingSecondPageDto r59, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAgreementViewModel r60, bff_money_movement.service.p019v1.InvestmentsTrackerTooltipDataDto r61, boolean r62, com.robinhood.android.investmentstracker.InvestmentsTrackerAnalyticsStateData r63, boolean r64, int r65, kotlin.jvm.internal.DefaultConstructorMarker r66) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.investmentstracker.InvestmentsTrackerDataState.<init>(java.util.List, boolean, com.robinhood.android.charts.models.db.SpanOption, boolean, java.lang.String, java.lang.String, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, boolean, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherViewModel, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherViewModel, java.lang.String, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceHeaderViewModel, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherViewModel, boolean, kotlin.collections.ArrayDeque, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAllocationsBarViewModel, com.robinhood.android.investmentstracker.security.SecurityFilter, com.robinhood.android.investmentstracker.viewmodels.OnboardingViewModel, bff_money_movement.service.v1.InvestmentsTrackerOnboardingSecondPageDto, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAgreementViewModel, bff_money_movement.service.v1.InvestmentsTrackerTooltipDataDto, boolean, com.robinhood.android.investmentstracker.InvestmentsTrackerAnalyticsStateData, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<InvestmentsTrackerComponent> getComponents() {
        return this.components;
    }

    public final boolean getCallingPlaidPrepareEndpoint() {
        return this.callingPlaidPrepareEndpoint;
    }

    public final SpanOption getSpanOption() {
        return this.spanOption;
    }

    public final boolean getLoadingNewSpan() {
        return this.loadingNewSpan;
    }

    public final String getAmountOverride() {
        return this.amountOverride;
    }

    public final String getSubtitleOverride() {
        return this.subtitleOverride;
    }

    public final UiEvent<Boolean> getAccountWasSelectedForThisNavigation() {
        return this.accountWasSelectedForThisNavigation;
    }

    public final UiEvent<Boolean> getPoppingScreen() {
        return this.poppingScreen;
    }

    public final boolean getShowHomeHeader() {
        return this.showHomeHeader;
    }

    public final InvestmentsTrackerSwitcherViewModel getBaseSwitcherDataFromLastRequest() {
        return this.baseSwitcherDataFromLastRequest;
    }

    public final InvestmentsTrackerSwitcherViewModel getCurrentSwitcherData() {
        return this.currentSwitcherData;
    }

    public final String getActiveAllocationBarId() {
        return this.activeAllocationBarId;
    }

    public final InvestmentsTrackerPerformanceHeaderViewModel getHeaderInfo() {
        return this.headerInfo;
    }

    public final InvestmentsTrackerSwitcherViewModel getSwitcherData() {
        return this.switcherData;
    }

    public final boolean getInAllocationsView() {
        return this.inAllocationsView;
    }

    public final ArrayDeque<CurrentPageInformation> getCurrentPageInformationStack() {
        return this.currentPageInformationStack;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final String getUpdateModeAccountLinkId() {
        return this.updateModeAccountLinkId;
    }

    public final boolean getUsingUpdateMode() {
        return this.usingUpdateMode;
    }

    public final boolean getCanUseGradient() {
        return this.canUseGradient;
    }

    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final InvestmentsTrackerAllocationsBarViewModel getAllocationBarData() {
        return this.allocationBarData;
    }

    public final SecurityFilter getSecurityFilter() {
        return this.securityFilter;
    }

    public final OnboardingViewModel getOnboardingData() {
        return this.onboardingData;
    }

    public final InvestmentsTrackerOnboardingSecondPageDto getOnboardingBottomSheetPagePopupData() {
        return this.onboardingBottomSheetPagePopupData;
    }

    public final InvestmentsTrackerAgreementViewModel getAgreementResponse() {
        return this.agreementResponse;
    }

    public final InvestmentsTrackerTooltipDataDto getInfoSheetData() {
        return this.infoSheetData;
    }

    public final boolean getShowExoPlayer() {
        return this.showExoPlayer;
    }

    public final InvestmentsTrackerAnalyticsStateData getAnalyticsState() {
        return this.analyticsState;
    }

    public final boolean getShowLoadingPage() {
        return this.showLoadingPage;
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDataState
    public InvestmentsTrackerDataState updateCallingPlaidPrepareEndpoint(boolean calling) {
        return copy$default(this, null, calling, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, 1073741821, null);
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.PlaidEnabledDataState
    public InvestmentsTrackerDataState updateAccountLinkIdForUpdateMode(String accountLinkId) {
        return copy$default(this, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, accountLinkId, false, false, null, null, null, null, null, null, null, false, null, false, 1073610751, null);
    }

    public final InvestmentsTrackerPageTypeDto getCurrentPageType() {
        InvestmentsTrackerPageTypeDto pageType;
        CurrentPageInformation currentPageInformationLastOrNull = this.currentPageInformationStack.lastOrNull();
        return (currentPageInformationLastOrNull == null || (pageType = currentPageInformationLastOrNull.getPageType()) == null) ? InvestmentsTrackerPageTypeDto.HOME : pageType;
    }

    public final boolean getInHomeExperience() {
        return this.currentPageInformationStack.size() == 1 && CollectionsKt.listOf((Object[]) new InvestmentsTrackerPageTypeDto[]{InvestmentsTrackerPageTypeDto.HOME, InvestmentsTrackerPageTypeDto.ALLOCATION_VIEW}).contains(this.currentPageInformationStack.get(0).getPageType());
    }
}
