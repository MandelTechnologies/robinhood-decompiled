package com.robinhood.android.account.p060ui;

import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import bonfire.proto.idl.margin.p036v1.MultiAccountIneligibilityContentModelDto;
import com.robinhood.android.account.p060ui.margin.MarginEligibilityViewModel;
import com.robinhood.android.feature.lib.sweep.interest.SweepEnrollmentData;
import com.robinhood.android.futures.lib.rhd.accountoverview.RhdAccountDataState;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.lib.models.instant.p169db.InstantDepositCard;
import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import com.robinhood.android.models.accountoverview.p184db.DayTradeCard;
import com.robinhood.android.models.portfolio.AccountMarketValuesLive;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.DripSettingsStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.SlipHubCard;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountOverviewStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountOverviewStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/account/ui/AccountOverviewDataState;", "Lcom/robinhood/android/account/ui/AccountOverviewViewState;", "<init>", "()V", "reduce", "dataState", "toMarginEligibilityViewModel", "Lcom/robinhood/android/account/ui/margin/MarginEligibilityViewModel;", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountOverviewStateProvider implements StateProvider<AccountOverviewDataState, AccountOverviewViewState> {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccountOverviewViewState reduce(AccountOverviewDataState dataState) {
        boolean z;
        boolean z2;
        AccountOverviewRhdSectionState accountOverviewRhdSectionState;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Account activeAccount = dataState.getActiveAccount();
        List<Account> accounts2 = dataState.getAccounts();
        UnifiedBalances unifiedBalances = dataState.getUnifiedBalances();
        UnifiedAccountV2 unifiedAccount = dataState.getUnifiedAccount();
        DayTradeCard dayTradeCard = dataState.getDayTradeCard();
        MarginSettings marginSettings = dataState.getMarginSettings();
        GetMultiAccountEligibilityResponseDto marginInvestingEligibility = dataState.getMarginInvestingEligibility();
        MarginEligibilityViewModel marginEligibilityViewModel = marginInvestingEligibility != null ? toMarginEligibilityViewModel(marginInvestingEligibility) : null;
        GetMultiAccountEligibilityResponseDto accountTypeEligibility = dataState.getAccountTypeEligibility();
        MarginEligibilityViewModel marginEligibilityViewModel2 = accountTypeEligibility != null ? toMarginEligibilityViewModel(accountTypeEligibility) : null;
        List<InvestmentSchedule> investmentSchedules = dataState.getInvestmentSchedules();
        DripSettingsStore.DripCardType dripCardType = dataState.getDripCardType();
        boolean zIsDripOnboarded = dataState.isDripOnboarded();
        SlipHubCard slipHubCard = dataState.getSlipHubCard();
        boolean slipDisabled = dataState.getSlipDisabled();
        SweepEnrollmentData sweepEnrollmentData = dataState.getSweepEnrollmentData();
        Disclosure interestEarningDisclosure = dataState.getInterestEarningDisclosure();
        CharSequence dayTradesContentfulSummary = dataState.getDayTradesContentfulSummary();
        OtherMarkdown limitedMarginRiskContent = dataState.getLimitedMarginRiskContent();
        boolean isOptionsSupported = dataState.getIsOptionsSupported();
        boolean canUpgradeToOptions = dataState.getCanUpgradeToOptions();
        InstantDepositCard instantCard = dataState.getInstantCard();
        if (dataState.getInOptionsKnowledgeCheckExperiment()) {
            z = true;
        } else if (dataState.getInOptionsJointAccountPreSetupExperiment()) {
            Account activeAccount2 = dataState.getActiveAccount();
            if ((activeAccount2 != null ? activeAccount2.getBrokerageAccountType() : null) != BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
            }
        } else if (!dataState.getShowOptionsCardForced()) {
            z = false;
        }
        boolean inOptionsLevel3EntryPointOptionsSettingsExperiment = dataState.getInOptionsLevel3EntryPointOptionsSettingsExperiment();
        boolean isMarginSupported = dataState.getIsMarginSupported();
        boolean zIsInstantDepositFeatureEnabled = dataState.isInstantDepositFeatureEnabled();
        boolean zIsInLeveredMarginRegionGate = dataState.isInLeveredMarginRegionGate();
        CountryCode.Supported countryCode = dataState.getCountryCode();
        List<CardOrder.CardIdentifier> cardOrder = dataState.getCardOrder();
        boolean isDripSupported = dataState.getIsDripSupported();
        boolean isSlipSupported = dataState.getIsSlipSupported();
        boolean isRecurringSupported = dataState.getIsRecurringSupported();
        boolean isSweepSupported = dataState.getIsSweepSupported();
        boolean zIsInMcwRegionGate = dataState.isInMcwRegionGate();
        Disclosure mcwCashExplainerDisclosure = dataState.getMcwCashExplainerDisclosure();
        AccountMarketValuesLive accountMarketValuesLive = dataState.getAccountMarketValuesLive();
        RhdAccountDataState rhdAccountDataState = dataState.getRhdAccountDataState();
        if (rhdAccountDataState != null) {
            accountOverviewRhdSectionState = new AccountOverviewRhdSectionState(rhdAccountDataState, dataState.getIsEcSupported(), dataState.getIsCryptoSupported());
            z2 = z;
        } else {
            z2 = z;
            accountOverviewRhdSectionState = null;
        }
        return new AccountOverviewViewState(activeAccount, accounts2, unifiedBalances, unifiedAccount, accountOverviewRhdSectionState, dayTradeCard, marginSettings, marginEligibilityViewModel, marginEligibilityViewModel2, investmentSchedules, dripCardType, zIsDripOnboarded, slipHubCard, slipDisabled, sweepEnrollmentData, interestEarningDisclosure, dayTradesContentfulSummary, limitedMarginRiskContent, isOptionsSupported, canUpgradeToOptions, instantCard, z2, inOptionsLevel3EntryPointOptionsSettingsExperiment, isMarginSupported, zIsInstantDepositFeatureEnabled, zIsInLeveredMarginRegionGate, countryCode, cardOrder, isDripSupported, isSlipSupported, isRecurringSupported, isSweepSupported, zIsInMcwRegionGate, mcwCashExplainerDisclosure, accountMarketValuesLive, dataState.getOptionsStatus(), dataState.getShowOptionsCardForced(), dataState.getOptionKnowledgeCheckAppointmentId(), dataState.getMarginInvestingInfo(), dataState.isMemberPdtRevampV1());
    }

    private final MarginEligibilityViewModel toMarginEligibilityViewModel(GetMultiAccountEligibilityResponseDto getMultiAccountEligibilityResponseDto) {
        boolean zIs_eligible = getMultiAccountEligibilityResponseDto.is_eligible();
        MultiAccountIneligibilityContentModelDto ineligibility_content = getMultiAccountEligibilityResponseDto.getIneligibility_content();
        String title = ineligibility_content != null ? ineligibility_content.getTitle() : null;
        MultiAccountIneligibilityContentModelDto ineligibility_content2 = getMultiAccountEligibilityResponseDto.getIneligibility_content();
        String body_markdown = ineligibility_content2 != null ? ineligibility_content2.getBody_markdown() : null;
        MultiAccountIneligibilityContentModelDto ineligibility_content3 = getMultiAccountEligibilityResponseDto.getIneligibility_content();
        return new MarginEligibilityViewModel(zIs_eligible, title, body_markdown, ineligibility_content3 != null ? ineligibility_content3.getHide_switch_to_margin_cta() : null);
    }
}
