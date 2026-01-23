package com.robinhood.android.investmentstracker;

import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingDataDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingFirstPageDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingSecondPageDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerTooltipDataDto;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAgreementViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAllocationsBarViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceHeaderViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherViewModel;
import com.robinhood.android.investmentstracker.viewmodels.OnboardingViewModel;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: InvestmentsTrackerViewState.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\t\u0010O\u001a\u00020\u0006HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\t\u0010Q\u001a\u00020\u0006HÆ\u0003JÝ\u0001\u0010R\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0006HÆ\u0001J\u0013\u0010S\u001a\u00020\u00062\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020VHÖ\u0001J\t\u0010W\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u001c\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u001f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0011\u0010?\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b@\u0010.¨\u0006X"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/InvestmentsTrackerViewState;", "", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponent;", "showHomeHeader", "", "addingScreen", "Lcom/robinhood/udf/UiEvent;", "poppingScreen", "headerInfo", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerPerformanceHeaderViewModel;", "switcherData", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherViewModel;", "navigationTitle", "", "usingUpdateMode", "updateModeAccountLinkId", "allocationBarData", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAllocationsBarViewModel;", "onboardingData", "Lcom/robinhood/android/investmentstracker/viewmodels/OnboardingViewModel;", "onboardingBottomSheetPagePopupData", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPageDto;", "agreementResponse", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAgreementViewModel;", "infoSheetData", "Lbff_money_movement/service/v1/InvestmentsTrackerTooltipDataDto;", "showExoPlayer", "analyticsState", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerAnalyticsStateData;", "showLoadingPage", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerPerformanceHeaderViewModel;Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherViewModel;Ljava/lang/String;ZLjava/lang/String;Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAllocationsBarViewModel;Lcom/robinhood/android/investmentstracker/viewmodels/OnboardingViewModel;Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPageDto;Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAgreementViewModel;Lbff_money_movement/service/v1/InvestmentsTrackerTooltipDataDto;ZLcom/robinhood/android/investmentstracker/InvestmentsTrackerAnalyticsStateData;Z)V", "getComponents", "()Lkotlinx/collections/immutable/ImmutableList;", "getShowHomeHeader", "()Z", "getAddingScreen", "()Lcom/robinhood/udf/UiEvent;", "getPoppingScreen", "getHeaderInfo", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerPerformanceHeaderViewModel;", "getSwitcherData", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerSwitcherViewModel;", "getNavigationTitle", "()Ljava/lang/String;", "getUsingUpdateMode", "getUpdateModeAccountLinkId", "getAllocationBarData", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAllocationsBarViewModel;", "getOnboardingData", "()Lcom/robinhood/android/investmentstracker/viewmodels/OnboardingViewModel;", "getOnboardingBottomSheetPagePopupData", "()Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPageDto;", "getAgreementResponse", "()Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerAgreementViewModel;", "getInfoSheetData", "()Lbff_money_movement/service/v1/InvestmentsTrackerTooltipDataDto;", "getShowExoPlayer", "getAnalyticsState", "()Lcom/robinhood/android/investmentstracker/InvestmentsTrackerAnalyticsStateData;", "getShowLoadingPage", "onboardingButtonText", "getOnboardingButtonText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestmentsTrackerViewState {
    public static final int $stable = 8;
    private final UiEvent<Boolean> addingScreen;
    private final InvestmentsTrackerAgreementViewModel agreementResponse;
    private final InvestmentsTrackerAllocationsBarViewModel allocationBarData;
    private final InvestmentsTrackerAnalyticsStateData analyticsState;
    private final ImmutableList<InvestmentsTrackerComponent> components;
    private final InvestmentsTrackerPerformanceHeaderViewModel headerInfo;
    private final InvestmentsTrackerTooltipDataDto infoSheetData;
    private final String navigationTitle;
    private final InvestmentsTrackerOnboardingSecondPageDto onboardingBottomSheetPagePopupData;
    private final OnboardingViewModel onboardingData;
    private final UiEvent<Boolean> poppingScreen;
    private final boolean showExoPlayer;
    private final boolean showHomeHeader;
    private final boolean showLoadingPage;
    private final InvestmentsTrackerSwitcherViewModel switcherData;
    private final String updateModeAccountLinkId;
    private final boolean usingUpdateMode;

    public static /* synthetic */ InvestmentsTrackerViewState copy$default(InvestmentsTrackerViewState investmentsTrackerViewState, ImmutableList immutableList, boolean z, UiEvent uiEvent, UiEvent uiEvent2, InvestmentsTrackerPerformanceHeaderViewModel investmentsTrackerPerformanceHeaderViewModel, InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel, String str, boolean z2, String str2, InvestmentsTrackerAllocationsBarViewModel investmentsTrackerAllocationsBarViewModel, OnboardingViewModel onboardingViewModel, InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto, InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel, InvestmentsTrackerTooltipDataDto investmentsTrackerTooltipDataDto, boolean z3, InvestmentsTrackerAnalyticsStateData investmentsTrackerAnalyticsStateData, boolean z4, int i, Object obj) {
        boolean z5;
        InvestmentsTrackerAnalyticsStateData investmentsTrackerAnalyticsStateData2;
        ImmutableList immutableList2;
        InvestmentsTrackerViewState investmentsTrackerViewState2;
        boolean z6;
        boolean z7;
        UiEvent uiEvent3;
        UiEvent uiEvent4;
        InvestmentsTrackerPerformanceHeaderViewModel investmentsTrackerPerformanceHeaderViewModel2;
        InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel2;
        String str3;
        boolean z8;
        String str4;
        InvestmentsTrackerAllocationsBarViewModel investmentsTrackerAllocationsBarViewModel2;
        OnboardingViewModel onboardingViewModel2;
        InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto2;
        InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel2;
        InvestmentsTrackerTooltipDataDto investmentsTrackerTooltipDataDto2;
        ImmutableList immutableList3 = (i & 1) != 0 ? investmentsTrackerViewState.components : immutableList;
        boolean z9 = (i & 2) != 0 ? investmentsTrackerViewState.showHomeHeader : z;
        UiEvent uiEvent5 = (i & 4) != 0 ? investmentsTrackerViewState.addingScreen : uiEvent;
        UiEvent uiEvent6 = (i & 8) != 0 ? investmentsTrackerViewState.poppingScreen : uiEvent2;
        InvestmentsTrackerPerformanceHeaderViewModel investmentsTrackerPerformanceHeaderViewModel3 = (i & 16) != 0 ? investmentsTrackerViewState.headerInfo : investmentsTrackerPerformanceHeaderViewModel;
        InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel3 = (i & 32) != 0 ? investmentsTrackerViewState.switcherData : investmentsTrackerSwitcherViewModel;
        String str5 = (i & 64) != 0 ? investmentsTrackerViewState.navigationTitle : str;
        boolean z10 = (i & 128) != 0 ? investmentsTrackerViewState.usingUpdateMode : z2;
        String str6 = (i & 256) != 0 ? investmentsTrackerViewState.updateModeAccountLinkId : str2;
        InvestmentsTrackerAllocationsBarViewModel investmentsTrackerAllocationsBarViewModel3 = (i & 512) != 0 ? investmentsTrackerViewState.allocationBarData : investmentsTrackerAllocationsBarViewModel;
        OnboardingViewModel onboardingViewModel3 = (i & 1024) != 0 ? investmentsTrackerViewState.onboardingData : onboardingViewModel;
        InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto3 = (i & 2048) != 0 ? investmentsTrackerViewState.onboardingBottomSheetPagePopupData : investmentsTrackerOnboardingSecondPageDto;
        InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel3 = (i & 4096) != 0 ? investmentsTrackerViewState.agreementResponse : investmentsTrackerAgreementViewModel;
        InvestmentsTrackerTooltipDataDto investmentsTrackerTooltipDataDto3 = (i & 8192) != 0 ? investmentsTrackerViewState.infoSheetData : investmentsTrackerTooltipDataDto;
        ImmutableList immutableList4 = immutableList3;
        boolean z11 = (i & 16384) != 0 ? investmentsTrackerViewState.showExoPlayer : z3;
        InvestmentsTrackerAnalyticsStateData investmentsTrackerAnalyticsStateData3 = (i & 32768) != 0 ? investmentsTrackerViewState.analyticsState : investmentsTrackerAnalyticsStateData;
        if ((i & 65536) != 0) {
            investmentsTrackerAnalyticsStateData2 = investmentsTrackerAnalyticsStateData3;
            z5 = investmentsTrackerViewState.showLoadingPage;
            z6 = z11;
            z7 = z9;
            uiEvent3 = uiEvent5;
            uiEvent4 = uiEvent6;
            investmentsTrackerPerformanceHeaderViewModel2 = investmentsTrackerPerformanceHeaderViewModel3;
            investmentsTrackerSwitcherViewModel2 = investmentsTrackerSwitcherViewModel3;
            str3 = str5;
            z8 = z10;
            str4 = str6;
            investmentsTrackerAllocationsBarViewModel2 = investmentsTrackerAllocationsBarViewModel3;
            onboardingViewModel2 = onboardingViewModel3;
            investmentsTrackerOnboardingSecondPageDto2 = investmentsTrackerOnboardingSecondPageDto3;
            investmentsTrackerAgreementViewModel2 = investmentsTrackerAgreementViewModel3;
            investmentsTrackerTooltipDataDto2 = investmentsTrackerTooltipDataDto3;
            immutableList2 = immutableList4;
            investmentsTrackerViewState2 = investmentsTrackerViewState;
        } else {
            z5 = z4;
            investmentsTrackerAnalyticsStateData2 = investmentsTrackerAnalyticsStateData3;
            immutableList2 = immutableList4;
            investmentsTrackerViewState2 = investmentsTrackerViewState;
            z6 = z11;
            z7 = z9;
            uiEvent3 = uiEvent5;
            uiEvent4 = uiEvent6;
            investmentsTrackerPerformanceHeaderViewModel2 = investmentsTrackerPerformanceHeaderViewModel3;
            investmentsTrackerSwitcherViewModel2 = investmentsTrackerSwitcherViewModel3;
            str3 = str5;
            z8 = z10;
            str4 = str6;
            investmentsTrackerAllocationsBarViewModel2 = investmentsTrackerAllocationsBarViewModel3;
            onboardingViewModel2 = onboardingViewModel3;
            investmentsTrackerOnboardingSecondPageDto2 = investmentsTrackerOnboardingSecondPageDto3;
            investmentsTrackerAgreementViewModel2 = investmentsTrackerAgreementViewModel3;
            investmentsTrackerTooltipDataDto2 = investmentsTrackerTooltipDataDto3;
        }
        return investmentsTrackerViewState2.copy(immutableList2, z7, uiEvent3, uiEvent4, investmentsTrackerPerformanceHeaderViewModel2, investmentsTrackerSwitcherViewModel2, str3, z8, str4, investmentsTrackerAllocationsBarViewModel2, onboardingViewModel2, investmentsTrackerOnboardingSecondPageDto2, investmentsTrackerAgreementViewModel2, investmentsTrackerTooltipDataDto2, z6, investmentsTrackerAnalyticsStateData2, z5);
    }

    public final ImmutableList<InvestmentsTrackerComponent> component1() {
        return this.components;
    }

    /* renamed from: component10, reason: from getter */
    public final InvestmentsTrackerAllocationsBarViewModel getAllocationBarData() {
        return this.allocationBarData;
    }

    /* renamed from: component11, reason: from getter */
    public final OnboardingViewModel getOnboardingData() {
        return this.onboardingData;
    }

    /* renamed from: component12, reason: from getter */
    public final InvestmentsTrackerOnboardingSecondPageDto getOnboardingBottomSheetPagePopupData() {
        return this.onboardingBottomSheetPagePopupData;
    }

    /* renamed from: component13, reason: from getter */
    public final InvestmentsTrackerAgreementViewModel getAgreementResponse() {
        return this.agreementResponse;
    }

    /* renamed from: component14, reason: from getter */
    public final InvestmentsTrackerTooltipDataDto getInfoSheetData() {
        return this.infoSheetData;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getShowExoPlayer() {
        return this.showExoPlayer;
    }

    /* renamed from: component16, reason: from getter */
    public final InvestmentsTrackerAnalyticsStateData getAnalyticsState() {
        return this.analyticsState;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getShowLoadingPage() {
        return this.showLoadingPage;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowHomeHeader() {
        return this.showHomeHeader;
    }

    public final UiEvent<Boolean> component3() {
        return this.addingScreen;
    }

    public final UiEvent<Boolean> component4() {
        return this.poppingScreen;
    }

    /* renamed from: component5, reason: from getter */
    public final InvestmentsTrackerPerformanceHeaderViewModel getHeaderInfo() {
        return this.headerInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final InvestmentsTrackerSwitcherViewModel getSwitcherData() {
        return this.switcherData;
    }

    /* renamed from: component7, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getUsingUpdateMode() {
        return this.usingUpdateMode;
    }

    /* renamed from: component9, reason: from getter */
    public final String getUpdateModeAccountLinkId() {
        return this.updateModeAccountLinkId;
    }

    public final InvestmentsTrackerViewState copy(ImmutableList<? extends InvestmentsTrackerComponent> components, boolean showHomeHeader, UiEvent<Boolean> addingScreen, UiEvent<Boolean> poppingScreen, InvestmentsTrackerPerformanceHeaderViewModel headerInfo, InvestmentsTrackerSwitcherViewModel switcherData, String navigationTitle, boolean usingUpdateMode, String updateModeAccountLinkId, InvestmentsTrackerAllocationsBarViewModel allocationBarData, OnboardingViewModel onboardingData, InvestmentsTrackerOnboardingSecondPageDto onboardingBottomSheetPagePopupData, InvestmentsTrackerAgreementViewModel agreementResponse, InvestmentsTrackerTooltipDataDto infoSheetData, boolean showExoPlayer, InvestmentsTrackerAnalyticsStateData analyticsState, boolean showLoadingPage) {
        Intrinsics.checkNotNullParameter(components, "components");
        return new InvestmentsTrackerViewState(components, showHomeHeader, addingScreen, poppingScreen, headerInfo, switcherData, navigationTitle, usingUpdateMode, updateModeAccountLinkId, allocationBarData, onboardingData, onboardingBottomSheetPagePopupData, agreementResponse, infoSheetData, showExoPlayer, analyticsState, showLoadingPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerViewState)) {
            return false;
        }
        InvestmentsTrackerViewState investmentsTrackerViewState = (InvestmentsTrackerViewState) other;
        return Intrinsics.areEqual(this.components, investmentsTrackerViewState.components) && this.showHomeHeader == investmentsTrackerViewState.showHomeHeader && Intrinsics.areEqual(this.addingScreen, investmentsTrackerViewState.addingScreen) && Intrinsics.areEqual(this.poppingScreen, investmentsTrackerViewState.poppingScreen) && Intrinsics.areEqual(this.headerInfo, investmentsTrackerViewState.headerInfo) && Intrinsics.areEqual(this.switcherData, investmentsTrackerViewState.switcherData) && Intrinsics.areEqual(this.navigationTitle, investmentsTrackerViewState.navigationTitle) && this.usingUpdateMode == investmentsTrackerViewState.usingUpdateMode && Intrinsics.areEqual(this.updateModeAccountLinkId, investmentsTrackerViewState.updateModeAccountLinkId) && Intrinsics.areEqual(this.allocationBarData, investmentsTrackerViewState.allocationBarData) && Intrinsics.areEqual(this.onboardingData, investmentsTrackerViewState.onboardingData) && Intrinsics.areEqual(this.onboardingBottomSheetPagePopupData, investmentsTrackerViewState.onboardingBottomSheetPagePopupData) && Intrinsics.areEqual(this.agreementResponse, investmentsTrackerViewState.agreementResponse) && Intrinsics.areEqual(this.infoSheetData, investmentsTrackerViewState.infoSheetData) && this.showExoPlayer == investmentsTrackerViewState.showExoPlayer && Intrinsics.areEqual(this.analyticsState, investmentsTrackerViewState.analyticsState) && this.showLoadingPage == investmentsTrackerViewState.showLoadingPage;
    }

    public int hashCode() {
        int iHashCode = ((this.components.hashCode() * 31) + Boolean.hashCode(this.showHomeHeader)) * 31;
        UiEvent<Boolean> uiEvent = this.addingScreen;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Boolean> uiEvent2 = this.poppingScreen;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        InvestmentsTrackerPerformanceHeaderViewModel investmentsTrackerPerformanceHeaderViewModel = this.headerInfo;
        int iHashCode4 = (iHashCode3 + (investmentsTrackerPerformanceHeaderViewModel == null ? 0 : investmentsTrackerPerformanceHeaderViewModel.hashCode())) * 31;
        InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel = this.switcherData;
        int iHashCode5 = (iHashCode4 + (investmentsTrackerSwitcherViewModel == null ? 0 : investmentsTrackerSwitcherViewModel.hashCode())) * 31;
        String str = this.navigationTitle;
        int iHashCode6 = (((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.usingUpdateMode)) * 31;
        String str2 = this.updateModeAccountLinkId;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        InvestmentsTrackerAllocationsBarViewModel investmentsTrackerAllocationsBarViewModel = this.allocationBarData;
        int iHashCode8 = (iHashCode7 + (investmentsTrackerAllocationsBarViewModel == null ? 0 : investmentsTrackerAllocationsBarViewModel.hashCode())) * 31;
        OnboardingViewModel onboardingViewModel = this.onboardingData;
        int iHashCode9 = (iHashCode8 + (onboardingViewModel == null ? 0 : onboardingViewModel.hashCode())) * 31;
        InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto = this.onboardingBottomSheetPagePopupData;
        int iHashCode10 = (iHashCode9 + (investmentsTrackerOnboardingSecondPageDto == null ? 0 : investmentsTrackerOnboardingSecondPageDto.hashCode())) * 31;
        InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel = this.agreementResponse;
        int iHashCode11 = (iHashCode10 + (investmentsTrackerAgreementViewModel == null ? 0 : investmentsTrackerAgreementViewModel.hashCode())) * 31;
        InvestmentsTrackerTooltipDataDto investmentsTrackerTooltipDataDto = this.infoSheetData;
        int iHashCode12 = (((iHashCode11 + (investmentsTrackerTooltipDataDto == null ? 0 : investmentsTrackerTooltipDataDto.hashCode())) * 31) + Boolean.hashCode(this.showExoPlayer)) * 31;
        InvestmentsTrackerAnalyticsStateData investmentsTrackerAnalyticsStateData = this.analyticsState;
        return ((iHashCode12 + (investmentsTrackerAnalyticsStateData != null ? investmentsTrackerAnalyticsStateData.hashCode() : 0)) * 31) + Boolean.hashCode(this.showLoadingPage);
    }

    public String toString() {
        return "InvestmentsTrackerViewState(components=" + this.components + ", showHomeHeader=" + this.showHomeHeader + ", addingScreen=" + this.addingScreen + ", poppingScreen=" + this.poppingScreen + ", headerInfo=" + this.headerInfo + ", switcherData=" + this.switcherData + ", navigationTitle=" + this.navigationTitle + ", usingUpdateMode=" + this.usingUpdateMode + ", updateModeAccountLinkId=" + this.updateModeAccountLinkId + ", allocationBarData=" + this.allocationBarData + ", onboardingData=" + this.onboardingData + ", onboardingBottomSheetPagePopupData=" + this.onboardingBottomSheetPagePopupData + ", agreementResponse=" + this.agreementResponse + ", infoSheetData=" + this.infoSheetData + ", showExoPlayer=" + this.showExoPlayer + ", analyticsState=" + this.analyticsState + ", showLoadingPage=" + this.showLoadingPage + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvestmentsTrackerViewState(ImmutableList<? extends InvestmentsTrackerComponent> components, boolean z, UiEvent<Boolean> uiEvent, UiEvent<Boolean> uiEvent2, InvestmentsTrackerPerformanceHeaderViewModel investmentsTrackerPerformanceHeaderViewModel, InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel, String str, boolean z2, String str2, InvestmentsTrackerAllocationsBarViewModel investmentsTrackerAllocationsBarViewModel, OnboardingViewModel onboardingViewModel, InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto, InvestmentsTrackerAgreementViewModel investmentsTrackerAgreementViewModel, InvestmentsTrackerTooltipDataDto investmentsTrackerTooltipDataDto, boolean z3, InvestmentsTrackerAnalyticsStateData investmentsTrackerAnalyticsStateData, boolean z4) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.components = components;
        this.showHomeHeader = z;
        this.addingScreen = uiEvent;
        this.poppingScreen = uiEvent2;
        this.headerInfo = investmentsTrackerPerformanceHeaderViewModel;
        this.switcherData = investmentsTrackerSwitcherViewModel;
        this.navigationTitle = str;
        this.usingUpdateMode = z2;
        this.updateModeAccountLinkId = str2;
        this.allocationBarData = investmentsTrackerAllocationsBarViewModel;
        this.onboardingData = onboardingViewModel;
        this.onboardingBottomSheetPagePopupData = investmentsTrackerOnboardingSecondPageDto;
        this.agreementResponse = investmentsTrackerAgreementViewModel;
        this.infoSheetData = investmentsTrackerTooltipDataDto;
        this.showExoPlayer = z3;
        this.analyticsState = investmentsTrackerAnalyticsStateData;
        this.showLoadingPage = z4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InvestmentsTrackerViewState(kotlinx.collections.immutable.ImmutableList r22, boolean r23, com.robinhood.udf.UiEvent r24, com.robinhood.udf.UiEvent r25, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceHeaderViewModel r26, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherViewModel r27, java.lang.String r28, boolean r29, java.lang.String r30, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAllocationsBarViewModel r31, com.robinhood.android.investmentstracker.viewmodels.OnboardingViewModel r32, bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingSecondPageDto r33, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAgreementViewModel r34, bff_money_movement.service.p019v1.InvestmentsTrackerTooltipDataDto r35, boolean r36, com.robinhood.android.investmentstracker.InvestmentsTrackerAnalyticsStateData r37, boolean r38, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
        /*
            r21 = this;
            r0 = r39
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L9
            r8 = r2
            goto Lb
        L9:
            r8 = r26
        Lb:
            r1 = r0 & 32
            if (r1 == 0) goto L11
            r9 = r2
            goto L13
        L11:
            r9 = r27
        L13:
            r1 = r0 & 64
            if (r1 == 0) goto L19
            r10 = r2
            goto L1b
        L19:
            r10 = r28
        L1b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r3 = 0
            if (r1 == 0) goto L22
            r11 = r3
            goto L24
        L22:
            r11 = r29
        L24:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L2a
            r12 = r2
            goto L2c
        L2a:
            r12 = r30
        L2c:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L32
            r13 = r2
            goto L34
        L32:
            r13 = r31
        L34:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L3a
            r14 = r2
            goto L3c
        L3a:
            r14 = r32
        L3c:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L42
            r15 = r2
            goto L44
        L42:
            r15 = r33
        L44:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L4b
            r16 = r2
            goto L4d
        L4b:
            r16 = r34
        L4d:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L54
            r17 = r2
            goto L56
        L54:
            r17 = r35
        L56:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L5d
            r18 = r3
            goto L5f
        L5d:
            r18 = r36
        L5f:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L68
            r19 = r2
            goto L6a
        L68:
            r19 = r37
        L6a:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L7c
            r20 = r3
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r3 = r21
            goto L88
        L7c:
            r20 = r38
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
        L88:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.investmentstracker.InvestmentsTrackerViewState.<init>(kotlinx.collections.immutable.ImmutableList, boolean, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceHeaderViewModel, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherViewModel, java.lang.String, boolean, java.lang.String, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAllocationsBarViewModel, com.robinhood.android.investmentstracker.viewmodels.OnboardingViewModel, bff_money_movement.service.v1.InvestmentsTrackerOnboardingSecondPageDto, com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAgreementViewModel, bff_money_movement.service.v1.InvestmentsTrackerTooltipDataDto, boolean, com.robinhood.android.investmentstracker.InvestmentsTrackerAnalyticsStateData, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final ImmutableList<InvestmentsTrackerComponent> getComponents() {
        return this.components;
    }

    public final boolean getShowHomeHeader() {
        return this.showHomeHeader;
    }

    public final UiEvent<Boolean> getAddingScreen() {
        return this.addingScreen;
    }

    public final UiEvent<Boolean> getPoppingScreen() {
        return this.poppingScreen;
    }

    public final InvestmentsTrackerPerformanceHeaderViewModel getHeaderInfo() {
        return this.headerInfo;
    }

    public final InvestmentsTrackerSwitcherViewModel getSwitcherData() {
        return this.switcherData;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final boolean getUsingUpdateMode() {
        return this.usingUpdateMode;
    }

    public final String getUpdateModeAccountLinkId() {
        return this.updateModeAccountLinkId;
    }

    public final InvestmentsTrackerAllocationsBarViewModel getAllocationBarData() {
        return this.allocationBarData;
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

    public final String getOnboardingButtonText() {
        InvestmentsTrackerOnboardingDataDto data;
        InvestmentsTrackerOnboardingSecondPageDto second_page;
        OnboardingViewModel onboardingViewModel = this.onboardingData;
        String primary_button_text = null;
        if (onboardingViewModel != null && onboardingViewModel.getCurrentPage() == 0) {
            InvestmentsTrackerOnboardingFirstPageDto first_page = this.onboardingData.getData().getFirst_page();
            if (first_page != null) {
                primary_button_text = first_page.getPrimary_button_text();
            }
        } else {
            OnboardingViewModel onboardingViewModel2 = this.onboardingData;
            if (onboardingViewModel2 != null && (data = onboardingViewModel2.getData()) != null && (second_page = data.getSecond_page()) != null) {
                primary_button_text = second_page.getPrimary_button_text();
            }
        }
        return primary_button_text == null ? "" : primary_button_text;
    }
}
