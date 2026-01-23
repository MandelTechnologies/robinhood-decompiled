package com.robinhood.android.margin.upgrade.loading;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistViewState4;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility2;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.margin.upgrade.MarginUpgradeContext;
import com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingState3;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeLoadingState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingDataState;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState;", "<init>", "()V", "reduce", "dataState", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingStateProvider, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarginUpgradeLoadingState2 implements StateProvider<MarginUpgradeLoadingDataState, MarginUpgradeLoadingState3> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public MarginUpgradeLoadingState3 reduce(MarginUpgradeLoadingDataState dataState) {
        MarginEligibilityChecklistViewState4 skip2KCheck;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getThrowable() != null) {
            return new MarginUpgradeLoadingState3.Failure(dataState.getThrowable());
        }
        MarginSettings settings = dataState.getSettings();
        if (settings != null && settings.isMarginInvestingEnabled()) {
            return MarginUpgradeLoadingState3.AlreadyEnabled.INSTANCE;
        }
        if (dataState.getReason() != null) {
            return new MarginUpgradeLoadingState3.MarginUpgradeBlocked(dataState.getReason());
        }
        if (Intrinsics.areEqual(dataState.getWillBeRestricted(), Boolean.TRUE)) {
            return MarginUpgradeLoadingState3.WillBeRestricted.INSTANCE;
        }
        if (Intrinsics.areEqual(dataState.getLocality(), CountryCode.Supported.UnitedKingdom.INSTANCE) && dataState.getSplash() != null && dataState.getAccount() != null) {
            return new MarginUpgradeLoadingState3.UkFlow(dataState.getSplash(), dataState.getAccount().getAccountNumber());
        }
        if (dataState.getSplash() != null && dataState.getAccount() != null && dataState.getInfo() != null && dataState.getGainsContent() != null && dataState.getLossesContent() != null && dataState.isGoldFeatureSupportedInRegion() != null && dataState.isSlipFeatureSupportedInRegion() != null && dataState.getMarginDisclosureUrlRes() != null && dataState.getMarginReviewHelperRes() != null && dataState.getLocality() != null && dataState.isEligible() != null && dataState.getApiMarginEligibility() != null) {
            if (dataState.isEligible().booleanValue()) {
                skip2KCheck = MarginEligibilityChecklistViewState4.QuickOnboarding.INSTANCE;
            } else if (dataState.getApiMarginEligibility().getIsSkip2KEligible()) {
                ApiMarginEligibility2.AccountBalance accountBalance = dataState.getApiMarginEligibility().getAccountBalance();
                Money minimumDeposit = accountBalance != null ? accountBalance.getMinimumDeposit() : null;
                ApiMarginEligibility2.AccountBalance accountBalance2 = dataState.getApiMarginEligibility().getAccountBalance();
                skip2KCheck = new MarginEligibilityChecklistViewState4.Skip2KCheck(minimumDeposit, accountBalance2 != null ? accountBalance2.getRecommendedDeposit() : null);
            } else {
                skip2KCheck = MarginEligibilityChecklistViewState4.Default.INSTANCE;
            }
            return new MarginUpgradeLoadingState3.UsFlow(new MarginUpgradeContext(dataState.getAccount().getAccountNumber(), dataState.getAccount().getType(), AccountDisplayNames.getDisplayName(dataState.getAccount()), dataState.getAccount().getBrokerageAccountType(), dataState.getSplash(), dataState.getInfo(), dataState.getProduct(), dataState.getGainsContent(), dataState.getLossesContent(), dataState.isGoldFeatureSupportedInRegion().booleanValue(), dataState.isSlipFeatureSupportedInRegion().booleanValue(), dataState.getMarginDisclosureUrlRes().intValue(), dataState.getMarginReviewHelperRes().intValue(), false, dataState.isEligible().booleanValue(), skip2KCheck), dataState.getLocality());
        }
        return MarginUpgradeLoadingState3.Loading.INSTANCE;
    }
}
