package com.robinhood.android.optionschain.sbschain;

import com.robinhood.android.common.options.OptionDefaultPricingState;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.view.OptionChainTooltipBanner3;
import com.robinhood.models.p355ui.OptionLegBundle;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionSideBySideChainViewState.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bN\b\u0087\b\u0018\u00002\u00020\u0001Bó\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010 \u001a\u00020\u0012\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010#\u001a\u00020\u0012\u0012\u0006\u0010$\u001a\u00020\u0012\u0012\u0006\u0010%\u001a\u00020\u0012\u0012\u0006\u0010&\u001a\u00020\u0012\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020\u0012\u0012\u0006\u0010*\u001a\u00020\u0012\u0012\u0006\u0010+\u001a\u00020\u0012¢\u0006\u0004\b,\u0010-J\u0010\u0010T\u001a\u0004\u0018\u00010\u00052\u0006\u0010U\u001a\u00020\u0010J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00103J\t\u0010Y\u001a\u00020\tHÆ\u0003J\t\u0010Z\u001a\u00020\u000bHÆ\u0003J\u0011\u0010[\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0003J\t\u0010]\u001a\u00020\u0012HÆ\u0003J\t\u0010^\u001a\u00020\u0014HÆ\u0003J\t\u0010_\u001a\u00020\u0012HÆ\u0003J\t\u0010`\u001a\u00020\u0012HÆ\u0003J\t\u0010a\u001a\u00020\u0012HÆ\u0003J\t\u0010b\u001a\u00020\u0019HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\t\u0010f\u001a\u00020\u0012HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\"HÆ\u0003J\t\u0010h\u001a\u00020\u0012HÆ\u0003J\t\u0010i\u001a\u00020\u0012HÆ\u0003J\t\u0010j\u001a\u00020\u0012HÆ\u0003J\t\u0010k\u001a\u00020\u0012HÆ\u0003J\t\u0010l\u001a\u00020(HÆ\u0003J\t\u0010m\u001a\u00020\u0012HÆ\u0003J\t\u0010n\u001a\u00020\u0012HÆ\u0003J\t\u0010o\u001a\u00020\u0012HÆ\u0003J®\u0002\u0010p\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00122\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u0010+\u001a\u00020\u0012HÆ\u0001¢\u0006\u0002\u0010qJ\u0013\u0010r\u001a\u00020\u00122\b\u0010s\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010t\u001a\u00020\u0007HÖ\u0001J\t\u0010u\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b@\u0010=R\u0011\u0010\u0016\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010=R\u0011\u0010\u0017\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bA\u0010=R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010 \u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010=R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010#\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010=R\u0011\u0010$\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010=R\u0011\u0010%\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bL\u0010=R\u0011\u0010&\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bM\u0010=R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010)\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010=R\u0011\u0010*\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bP\u0010=R\u0011\u0010+\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010=R\u0013\u0010Q\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006v"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainViewState;", "", "accountNumber", "", "orderIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "currentPage", "", "defaultPricingState", "Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "launchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "adjustedExpirationDateStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "selectedLegs", "Lcom/robinhood/models/ui/OptionLegBundle;", "selloutSnackbarDismissedOrElapsed", "", "callPutSwitcherState", "Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;", "showClearButton", "isEtfSupported", "multilegAvailable", "tooltipEligibility", "Lcom/robinhood/android/optionschain/sbschain/TooltipEligibility;", "tooltipState", "Lcom/robinhood/android/optionschain/sbschain/TooltipState;", "topTooltipBannerType", "Lcom/robinhood/android/optionschain/view/OptionChainTooltipBannerType;", "nuxMode", "Lcom/robinhood/android/optionschain/sbschain/NuxMode;", "isNuxSearchDismissed", "initialExpirationPageScrollingEvent", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;", "isOnTodayTab", "isSelloutSnackbarDismissalExperimentEnabled", "inSelloutImprovementExperiment", "inSbsNuxRevampExperiment", "eduFooterAnimationState", "Lcom/robinhood/android/optionschain/sbschain/SbsFooterEducationAnimationState;", "isEduFooterAnimationDismissed", "hasSeenLottieNuxAnimation", "isMemberPdtRevampV1", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;Ljava/lang/Integer;Lcom/robinhood/android/common/options/OptionDefaultPricingState;Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;ZZZLcom/robinhood/android/optionschain/sbschain/TooltipEligibility;Lcom/robinhood/android/optionschain/sbschain/TooltipState;Lcom/robinhood/android/optionschain/view/OptionChainTooltipBannerType;Lcom/robinhood/android/optionschain/sbschain/NuxMode;ZLcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;ZZZZLcom/robinhood/android/optionschain/sbschain/SbsFooterEducationAnimationState;ZZZ)V", "getAccountNumber", "()Ljava/lang/String;", "getOrderIntentKey", "()Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "getCurrentPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDefaultPricingState", "()Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "getAdjustedExpirationDateStates", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedLegs", "getSelloutSnackbarDismissedOrElapsed", "()Z", "getCallPutSwitcherState", "()Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;", "getShowClearButton", "getMultilegAvailable", "getTooltipEligibility", "()Lcom/robinhood/android/optionschain/sbschain/TooltipEligibility;", "getTooltipState", "()Lcom/robinhood/android/optionschain/sbschain/TooltipState;", "getTopTooltipBannerType", "()Lcom/robinhood/android/optionschain/view/OptionChainTooltipBannerType;", "getNuxMode", "()Lcom/robinhood/android/optionschain/sbschain/NuxMode;", "getInitialExpirationPageScrollingEvent", "()Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;", "getInSelloutImprovementExperiment", "getInSbsNuxRevampExperiment", "getEduFooterAnimationState", "()Lcom/robinhood/android/optionschain/sbschain/SbsFooterEducationAnimationState;", "getHasSeenLottieNuxAnimation", "selectedExpirationPage", "getSelectedExpirationPage", "()Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "getSingleLegOptionOrderIntent", "legBundle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/String;Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;Ljava/lang/Integer;Lcom/robinhood/android/common/options/OptionDefaultPricingState;Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;ZZZLcom/robinhood/android/optionschain/sbschain/TooltipEligibility;Lcom/robinhood/android/optionschain/sbschain/TooltipState;Lcom/robinhood/android/optionschain/view/OptionChainTooltipBannerType;Lcom/robinhood/android/optionschain/sbschain/NuxMode;ZLcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;ZZZZLcom/robinhood/android/optionschain/sbschain/SbsFooterEducationAnimationState;ZZZ)Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainViewState;", "equals", "other", "hashCode", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionSideBySideChainViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final ImmutableList<OptionChainExpirationDateState> adjustedExpirationDateStates;
    private final OptionSideBySideChainDataState2 callPutSwitcherState;
    private final Integer currentPage;
    private final OptionDefaultPricingState defaultPricingState;
    private final OptionSideBySideChainDataState5 eduFooterAnimationState;
    private final boolean hasSeenLottieNuxAnimation;
    private final boolean inSbsNuxRevampExperiment;
    private final boolean inSelloutImprovementExperiment;
    private final OptionSideBySideChainEvent initialExpirationPageScrollingEvent;
    private final boolean isEduFooterAnimationDismissed;
    private final boolean isEtfSupported;
    private final boolean isMemberPdtRevampV1;
    private final boolean isNuxSearchDismissed;
    private final boolean isOnTodayTab;
    private final boolean isSelloutSnackbarDismissalExperimentEnabled;
    private final OptionChainLaunchMode launchMode;
    private final boolean multilegAvailable;
    private final OptionSideBySideChainDataState4 nuxMode;
    private final OptionOrderIntentKey.FromOptionOrderBundle orderIntentKey;
    private final ImmutableList<OptionLegBundle> selectedLegs;
    private final boolean selloutSnackbarDismissedOrElapsed;
    private final boolean showClearButton;
    private final TooltipEligibility tooltipEligibility;
    private final OptionSideBySideChainDataState7 tooltipState;
    private final OptionChainTooltipBanner3 topTooltipBannerType;

    public static /* synthetic */ OptionSideBySideChainViewState copy$default(OptionSideBySideChainViewState optionSideBySideChainViewState, String str, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, Integer num, OptionDefaultPricingState optionDefaultPricingState, OptionChainLaunchMode optionChainLaunchMode, ImmutableList immutableList, ImmutableList immutableList2, boolean z, OptionSideBySideChainDataState2 optionSideBySideChainDataState2, boolean z2, boolean z3, boolean z4, TooltipEligibility tooltipEligibility, OptionSideBySideChainDataState7 optionSideBySideChainDataState7, OptionChainTooltipBanner3 optionChainTooltipBanner3, OptionSideBySideChainDataState4 optionSideBySideChainDataState4, boolean z5, OptionSideBySideChainEvent optionSideBySideChainEvent, boolean z6, boolean z7, boolean z8, boolean z9, OptionSideBySideChainDataState5 optionSideBySideChainDataState5, boolean z10, boolean z11, boolean z12, int i, Object obj) {
        boolean z13;
        boolean z14;
        String str2 = (i & 1) != 0 ? optionSideBySideChainViewState.accountNumber : str;
        OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle2 = (i & 2) != 0 ? optionSideBySideChainViewState.orderIntentKey : fromOptionOrderBundle;
        Integer num2 = (i & 4) != 0 ? optionSideBySideChainViewState.currentPage : num;
        OptionDefaultPricingState optionDefaultPricingState2 = (i & 8) != 0 ? optionSideBySideChainViewState.defaultPricingState : optionDefaultPricingState;
        OptionChainLaunchMode optionChainLaunchMode2 = (i & 16) != 0 ? optionSideBySideChainViewState.launchMode : optionChainLaunchMode;
        ImmutableList immutableList3 = (i & 32) != 0 ? optionSideBySideChainViewState.adjustedExpirationDateStates : immutableList;
        ImmutableList immutableList4 = (i & 64) != 0 ? optionSideBySideChainViewState.selectedLegs : immutableList2;
        boolean z15 = (i & 128) != 0 ? optionSideBySideChainViewState.selloutSnackbarDismissedOrElapsed : z;
        OptionSideBySideChainDataState2 optionSideBySideChainDataState22 = (i & 256) != 0 ? optionSideBySideChainViewState.callPutSwitcherState : optionSideBySideChainDataState2;
        boolean z16 = (i & 512) != 0 ? optionSideBySideChainViewState.showClearButton : z2;
        boolean z17 = (i & 1024) != 0 ? optionSideBySideChainViewState.isEtfSupported : z3;
        boolean z18 = (i & 2048) != 0 ? optionSideBySideChainViewState.multilegAvailable : z4;
        TooltipEligibility tooltipEligibility2 = (i & 4096) != 0 ? optionSideBySideChainViewState.tooltipEligibility : tooltipEligibility;
        OptionSideBySideChainDataState7 optionSideBySideChainDataState72 = (i & 8192) != 0 ? optionSideBySideChainViewState.tooltipState : optionSideBySideChainDataState7;
        String str3 = str2;
        OptionChainTooltipBanner3 optionChainTooltipBanner32 = (i & 16384) != 0 ? optionSideBySideChainViewState.topTooltipBannerType : optionChainTooltipBanner3;
        OptionSideBySideChainDataState4 optionSideBySideChainDataState42 = (i & 32768) != 0 ? optionSideBySideChainViewState.nuxMode : optionSideBySideChainDataState4;
        boolean z19 = (i & 65536) != 0 ? optionSideBySideChainViewState.isNuxSearchDismissed : z5;
        OptionSideBySideChainEvent optionSideBySideChainEvent2 = (i & 131072) != 0 ? optionSideBySideChainViewState.initialExpirationPageScrollingEvent : optionSideBySideChainEvent;
        boolean z20 = (i & 262144) != 0 ? optionSideBySideChainViewState.isOnTodayTab : z6;
        boolean z21 = (i & 524288) != 0 ? optionSideBySideChainViewState.isSelloutSnackbarDismissalExperimentEnabled : z7;
        boolean z22 = (i & 1048576) != 0 ? optionSideBySideChainViewState.inSelloutImprovementExperiment : z8;
        boolean z23 = (i & 2097152) != 0 ? optionSideBySideChainViewState.inSbsNuxRevampExperiment : z9;
        OptionSideBySideChainDataState5 optionSideBySideChainDataState52 = (i & 4194304) != 0 ? optionSideBySideChainViewState.eduFooterAnimationState : optionSideBySideChainDataState5;
        boolean z24 = (i & 8388608) != 0 ? optionSideBySideChainViewState.isEduFooterAnimationDismissed : z10;
        boolean z25 = (i & 16777216) != 0 ? optionSideBySideChainViewState.hasSeenLottieNuxAnimation : z11;
        if ((i & 33554432) != 0) {
            z14 = z25;
            z13 = optionSideBySideChainViewState.isMemberPdtRevampV1;
        } else {
            z13 = z12;
            z14 = z25;
        }
        return optionSideBySideChainViewState.copy(str3, fromOptionOrderBundle2, num2, optionDefaultPricingState2, optionChainLaunchMode2, immutableList3, immutableList4, z15, optionSideBySideChainDataState22, z16, z17, z18, tooltipEligibility2, optionSideBySideChainDataState72, optionChainTooltipBanner32, optionSideBySideChainDataState42, z19, optionSideBySideChainEvent2, z20, z21, z22, z23, optionSideBySideChainDataState52, z24, z14, z13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowClearButton() {
        return this.showClearButton;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsEtfSupported() {
        return this.isEtfSupported;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getMultilegAvailable() {
        return this.multilegAvailable;
    }

    /* renamed from: component13, reason: from getter */
    public final TooltipEligibility getTooltipEligibility() {
        return this.tooltipEligibility;
    }

    /* renamed from: component14, reason: from getter */
    public final OptionSideBySideChainDataState7 getTooltipState() {
        return this.tooltipState;
    }

    /* renamed from: component15, reason: from getter */
    public final OptionChainTooltipBanner3 getTopTooltipBannerType() {
        return this.topTooltipBannerType;
    }

    /* renamed from: component16, reason: from getter */
    public final OptionSideBySideChainDataState4 getNuxMode() {
        return this.nuxMode;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsNuxSearchDismissed() {
        return this.isNuxSearchDismissed;
    }

    /* renamed from: component18, reason: from getter */
    public final OptionSideBySideChainEvent getInitialExpirationPageScrollingEvent() {
        return this.initialExpirationPageScrollingEvent;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsOnTodayTab() {
        return this.isOnTodayTab;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionOrderIntentKey.FromOptionOrderBundle getOrderIntentKey() {
        return this.orderIntentKey;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsSelloutSnackbarDismissalExperimentEnabled() {
        return this.isSelloutSnackbarDismissalExperimentEnabled;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getInSelloutImprovementExperiment() {
        return this.inSelloutImprovementExperiment;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getInSbsNuxRevampExperiment() {
        return this.inSbsNuxRevampExperiment;
    }

    /* renamed from: component23, reason: from getter */
    public final OptionSideBySideChainDataState5 getEduFooterAnimationState() {
        return this.eduFooterAnimationState;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsEduFooterAnimationDismissed() {
        return this.isEduFooterAnimationDismissed;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getHasSeenLottieNuxAnimation() {
        return this.hasSeenLottieNuxAnimation;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionDefaultPricingState getDefaultPricingState() {
        return this.defaultPricingState;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final ImmutableList<OptionChainExpirationDateState> component6() {
        return this.adjustedExpirationDateStates;
    }

    public final ImmutableList<OptionLegBundle> component7() {
        return this.selectedLegs;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSelloutSnackbarDismissedOrElapsed() {
        return this.selloutSnackbarDismissedOrElapsed;
    }

    /* renamed from: component9, reason: from getter */
    public final OptionSideBySideChainDataState2 getCallPutSwitcherState() {
        return this.callPutSwitcherState;
    }

    public final OptionSideBySideChainViewState copy(String accountNumber, OptionOrderIntentKey.FromOptionOrderBundle orderIntentKey, Integer currentPage, OptionDefaultPricingState defaultPricingState, OptionChainLaunchMode launchMode, ImmutableList<OptionChainExpirationDateState> adjustedExpirationDateStates, ImmutableList<OptionLegBundle> selectedLegs, boolean selloutSnackbarDismissedOrElapsed, OptionSideBySideChainDataState2 callPutSwitcherState, boolean showClearButton, boolean isEtfSupported, boolean multilegAvailable, TooltipEligibility tooltipEligibility, OptionSideBySideChainDataState7 tooltipState, OptionChainTooltipBanner3 topTooltipBannerType, OptionSideBySideChainDataState4 nuxMode, boolean isNuxSearchDismissed, OptionSideBySideChainEvent initialExpirationPageScrollingEvent, boolean isOnTodayTab, boolean isSelloutSnackbarDismissalExperimentEnabled, boolean inSelloutImprovementExperiment, boolean inSbsNuxRevampExperiment, OptionSideBySideChainDataState5 eduFooterAnimationState, boolean isEduFooterAnimationDismissed, boolean hasSeenLottieNuxAnimation, boolean isMemberPdtRevampV1) {
        Intrinsics.checkNotNullParameter(defaultPricingState, "defaultPricingState");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(selectedLegs, "selectedLegs");
        Intrinsics.checkNotNullParameter(callPutSwitcherState, "callPutSwitcherState");
        Intrinsics.checkNotNullParameter(tooltipEligibility, "tooltipEligibility");
        Intrinsics.checkNotNullParameter(eduFooterAnimationState, "eduFooterAnimationState");
        return new OptionSideBySideChainViewState(accountNumber, orderIntentKey, currentPage, defaultPricingState, launchMode, adjustedExpirationDateStates, selectedLegs, selloutSnackbarDismissedOrElapsed, callPutSwitcherState, showClearButton, isEtfSupported, multilegAvailable, tooltipEligibility, tooltipState, topTooltipBannerType, nuxMode, isNuxSearchDismissed, initialExpirationPageScrollingEvent, isOnTodayTab, isSelloutSnackbarDismissalExperimentEnabled, inSelloutImprovementExperiment, inSbsNuxRevampExperiment, eduFooterAnimationState, isEduFooterAnimationDismissed, hasSeenLottieNuxAnimation, isMemberPdtRevampV1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionSideBySideChainViewState)) {
            return false;
        }
        OptionSideBySideChainViewState optionSideBySideChainViewState = (OptionSideBySideChainViewState) other;
        return Intrinsics.areEqual(this.accountNumber, optionSideBySideChainViewState.accountNumber) && Intrinsics.areEqual(this.orderIntentKey, optionSideBySideChainViewState.orderIntentKey) && Intrinsics.areEqual(this.currentPage, optionSideBySideChainViewState.currentPage) && this.defaultPricingState == optionSideBySideChainViewState.defaultPricingState && Intrinsics.areEqual(this.launchMode, optionSideBySideChainViewState.launchMode) && Intrinsics.areEqual(this.adjustedExpirationDateStates, optionSideBySideChainViewState.adjustedExpirationDateStates) && Intrinsics.areEqual(this.selectedLegs, optionSideBySideChainViewState.selectedLegs) && this.selloutSnackbarDismissedOrElapsed == optionSideBySideChainViewState.selloutSnackbarDismissedOrElapsed && this.callPutSwitcherState == optionSideBySideChainViewState.callPutSwitcherState && this.showClearButton == optionSideBySideChainViewState.showClearButton && this.isEtfSupported == optionSideBySideChainViewState.isEtfSupported && this.multilegAvailable == optionSideBySideChainViewState.multilegAvailable && Intrinsics.areEqual(this.tooltipEligibility, optionSideBySideChainViewState.tooltipEligibility) && this.tooltipState == optionSideBySideChainViewState.tooltipState && this.topTooltipBannerType == optionSideBySideChainViewState.topTooltipBannerType && this.nuxMode == optionSideBySideChainViewState.nuxMode && this.isNuxSearchDismissed == optionSideBySideChainViewState.isNuxSearchDismissed && Intrinsics.areEqual(this.initialExpirationPageScrollingEvent, optionSideBySideChainViewState.initialExpirationPageScrollingEvent) && this.isOnTodayTab == optionSideBySideChainViewState.isOnTodayTab && this.isSelloutSnackbarDismissalExperimentEnabled == optionSideBySideChainViewState.isSelloutSnackbarDismissalExperimentEnabled && this.inSelloutImprovementExperiment == optionSideBySideChainViewState.inSelloutImprovementExperiment && this.inSbsNuxRevampExperiment == optionSideBySideChainViewState.inSbsNuxRevampExperiment && this.eduFooterAnimationState == optionSideBySideChainViewState.eduFooterAnimationState && this.isEduFooterAnimationDismissed == optionSideBySideChainViewState.isEduFooterAnimationDismissed && this.hasSeenLottieNuxAnimation == optionSideBySideChainViewState.hasSeenLottieNuxAnimation && this.isMemberPdtRevampV1 == optionSideBySideChainViewState.isMemberPdtRevampV1;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle = this.orderIntentKey;
        int iHashCode2 = (iHashCode + (fromOptionOrderBundle == null ? 0 : fromOptionOrderBundle.hashCode())) * 31;
        Integer num = this.currentPage;
        int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.defaultPricingState.hashCode()) * 31) + this.launchMode.hashCode()) * 31;
        ImmutableList<OptionChainExpirationDateState> immutableList = this.adjustedExpirationDateStates;
        int iHashCode4 = (((((((((((((((iHashCode3 + (immutableList == null ? 0 : immutableList.hashCode())) * 31) + this.selectedLegs.hashCode()) * 31) + Boolean.hashCode(this.selloutSnackbarDismissedOrElapsed)) * 31) + this.callPutSwitcherState.hashCode()) * 31) + Boolean.hashCode(this.showClearButton)) * 31) + Boolean.hashCode(this.isEtfSupported)) * 31) + Boolean.hashCode(this.multilegAvailable)) * 31) + this.tooltipEligibility.hashCode()) * 31;
        OptionSideBySideChainDataState7 optionSideBySideChainDataState7 = this.tooltipState;
        int iHashCode5 = (iHashCode4 + (optionSideBySideChainDataState7 == null ? 0 : optionSideBySideChainDataState7.hashCode())) * 31;
        OptionChainTooltipBanner3 optionChainTooltipBanner3 = this.topTooltipBannerType;
        int iHashCode6 = (iHashCode5 + (optionChainTooltipBanner3 == null ? 0 : optionChainTooltipBanner3.hashCode())) * 31;
        OptionSideBySideChainDataState4 optionSideBySideChainDataState4 = this.nuxMode;
        int iHashCode7 = (((iHashCode6 + (optionSideBySideChainDataState4 == null ? 0 : optionSideBySideChainDataState4.hashCode())) * 31) + Boolean.hashCode(this.isNuxSearchDismissed)) * 31;
        OptionSideBySideChainEvent optionSideBySideChainEvent = this.initialExpirationPageScrollingEvent;
        return ((((((((((((((((iHashCode7 + (optionSideBySideChainEvent != null ? optionSideBySideChainEvent.hashCode() : 0)) * 31) + Boolean.hashCode(this.isOnTodayTab)) * 31) + Boolean.hashCode(this.isSelloutSnackbarDismissalExperimentEnabled)) * 31) + Boolean.hashCode(this.inSelloutImprovementExperiment)) * 31) + Boolean.hashCode(this.inSbsNuxRevampExperiment)) * 31) + this.eduFooterAnimationState.hashCode()) * 31) + Boolean.hashCode(this.isEduFooterAnimationDismissed)) * 31) + Boolean.hashCode(this.hasSeenLottieNuxAnimation)) * 31) + Boolean.hashCode(this.isMemberPdtRevampV1);
    }

    public String toString() {
        return "OptionSideBySideChainViewState(accountNumber=" + this.accountNumber + ", orderIntentKey=" + this.orderIntentKey + ", currentPage=" + this.currentPage + ", defaultPricingState=" + this.defaultPricingState + ", launchMode=" + this.launchMode + ", adjustedExpirationDateStates=" + this.adjustedExpirationDateStates + ", selectedLegs=" + this.selectedLegs + ", selloutSnackbarDismissedOrElapsed=" + this.selloutSnackbarDismissedOrElapsed + ", callPutSwitcherState=" + this.callPutSwitcherState + ", showClearButton=" + this.showClearButton + ", isEtfSupported=" + this.isEtfSupported + ", multilegAvailable=" + this.multilegAvailable + ", tooltipEligibility=" + this.tooltipEligibility + ", tooltipState=" + this.tooltipState + ", topTooltipBannerType=" + this.topTooltipBannerType + ", nuxMode=" + this.nuxMode + ", isNuxSearchDismissed=" + this.isNuxSearchDismissed + ", initialExpirationPageScrollingEvent=" + this.initialExpirationPageScrollingEvent + ", isOnTodayTab=" + this.isOnTodayTab + ", isSelloutSnackbarDismissalExperimentEnabled=" + this.isSelloutSnackbarDismissalExperimentEnabled + ", inSelloutImprovementExperiment=" + this.inSelloutImprovementExperiment + ", inSbsNuxRevampExperiment=" + this.inSbsNuxRevampExperiment + ", eduFooterAnimationState=" + this.eduFooterAnimationState + ", isEduFooterAnimationDismissed=" + this.isEduFooterAnimationDismissed + ", hasSeenLottieNuxAnimation=" + this.hasSeenLottieNuxAnimation + ", isMemberPdtRevampV1=" + this.isMemberPdtRevampV1 + ")";
    }

    public OptionSideBySideChainViewState(String str, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, Integer num, OptionDefaultPricingState defaultPricingState, OptionChainLaunchMode launchMode, ImmutableList<OptionChainExpirationDateState> immutableList, ImmutableList<OptionLegBundle> selectedLegs, boolean z, OptionSideBySideChainDataState2 callPutSwitcherState, boolean z2, boolean z3, boolean z4, TooltipEligibility tooltipEligibility, OptionSideBySideChainDataState7 optionSideBySideChainDataState7, OptionChainTooltipBanner3 optionChainTooltipBanner3, OptionSideBySideChainDataState4 optionSideBySideChainDataState4, boolean z5, OptionSideBySideChainEvent optionSideBySideChainEvent, boolean z6, boolean z7, boolean z8, boolean z9, OptionSideBySideChainDataState5 eduFooterAnimationState, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(defaultPricingState, "defaultPricingState");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(selectedLegs, "selectedLegs");
        Intrinsics.checkNotNullParameter(callPutSwitcherState, "callPutSwitcherState");
        Intrinsics.checkNotNullParameter(tooltipEligibility, "tooltipEligibility");
        Intrinsics.checkNotNullParameter(eduFooterAnimationState, "eduFooterAnimationState");
        this.accountNumber = str;
        this.orderIntentKey = fromOptionOrderBundle;
        this.currentPage = num;
        this.defaultPricingState = defaultPricingState;
        this.launchMode = launchMode;
        this.adjustedExpirationDateStates = immutableList;
        this.selectedLegs = selectedLegs;
        this.selloutSnackbarDismissedOrElapsed = z;
        this.callPutSwitcherState = callPutSwitcherState;
        this.showClearButton = z2;
        this.isEtfSupported = z3;
        this.multilegAvailable = z4;
        this.tooltipEligibility = tooltipEligibility;
        this.tooltipState = optionSideBySideChainDataState7;
        this.topTooltipBannerType = optionChainTooltipBanner3;
        this.nuxMode = optionSideBySideChainDataState4;
        this.isNuxSearchDismissed = z5;
        this.initialExpirationPageScrollingEvent = optionSideBySideChainEvent;
        this.isOnTodayTab = z6;
        this.isSelloutSnackbarDismissalExperimentEnabled = z7;
        this.inSelloutImprovementExperiment = z8;
        this.inSbsNuxRevampExperiment = z9;
        this.eduFooterAnimationState = eduFooterAnimationState;
        this.isEduFooterAnimationDismissed = z10;
        this.hasSeenLottieNuxAnimation = z11;
        this.isMemberPdtRevampV1 = z12;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final OptionOrderIntentKey.FromOptionOrderBundle getOrderIntentKey() {
        return this.orderIntentKey;
    }

    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    public final OptionDefaultPricingState getDefaultPricingState() {
        return this.defaultPricingState;
    }

    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final ImmutableList<OptionChainExpirationDateState> getAdjustedExpirationDateStates() {
        return this.adjustedExpirationDateStates;
    }

    public final ImmutableList<OptionLegBundle> getSelectedLegs() {
        return this.selectedLegs;
    }

    public final boolean getSelloutSnackbarDismissedOrElapsed() {
        return this.selloutSnackbarDismissedOrElapsed;
    }

    public final OptionSideBySideChainDataState2 getCallPutSwitcherState() {
        return this.callPutSwitcherState;
    }

    public final boolean getShowClearButton() {
        return this.showClearButton;
    }

    public final boolean isEtfSupported() {
        return this.isEtfSupported;
    }

    public final boolean getMultilegAvailable() {
        return this.multilegAvailable;
    }

    public final TooltipEligibility getTooltipEligibility() {
        return this.tooltipEligibility;
    }

    public final OptionSideBySideChainDataState7 getTooltipState() {
        return this.tooltipState;
    }

    public final OptionChainTooltipBanner3 getTopTooltipBannerType() {
        return this.topTooltipBannerType;
    }

    public final OptionSideBySideChainDataState4 getNuxMode() {
        return this.nuxMode;
    }

    public final boolean isNuxSearchDismissed() {
        return this.isNuxSearchDismissed;
    }

    public final OptionSideBySideChainEvent getInitialExpirationPageScrollingEvent() {
        return this.initialExpirationPageScrollingEvent;
    }

    public final boolean isOnTodayTab() {
        return this.isOnTodayTab;
    }

    public final boolean isSelloutSnackbarDismissalExperimentEnabled() {
        return this.isSelloutSnackbarDismissalExperimentEnabled;
    }

    public final boolean getInSelloutImprovementExperiment() {
        return this.inSelloutImprovementExperiment;
    }

    public final boolean getInSbsNuxRevampExperiment() {
        return this.inSbsNuxRevampExperiment;
    }

    public final OptionSideBySideChainDataState5 getEduFooterAnimationState() {
        return this.eduFooterAnimationState;
    }

    public final boolean isEduFooterAnimationDismissed() {
        return this.isEduFooterAnimationDismissed;
    }

    public final boolean getHasSeenLottieNuxAnimation() {
        return this.hasSeenLottieNuxAnimation;
    }

    public final boolean isMemberPdtRevampV1() {
        return this.isMemberPdtRevampV1;
    }

    public final OptionChainExpirationDateState getSelectedExpirationPage() {
        ImmutableList<OptionChainExpirationDateState> immutableList;
        Integer num = this.currentPage;
        if (num == null || (immutableList = this.adjustedExpirationDateStates) == null) {
            return null;
        }
        return (OptionChainExpirationDateState) CollectionsKt.getOrNull(immutableList, num.intValue());
    }

    public final OptionOrderIntentKey.FromOptionOrderBundle getSingleLegOptionOrderIntent(OptionLegBundle legBundle) {
        Intrinsics.checkNotNullParameter(legBundle, "legBundle");
        String str = this.accountNumber;
        if (str != null) {
            return OptionSideBySideChainStateProvider2.getOptionOrderIntentKey(str, extensions2.persistentListOf(legBundle), this.launchMode, this.defaultPricingState.getDefaultPricingSettingForOptionOrder());
        }
        return null;
    }
}
