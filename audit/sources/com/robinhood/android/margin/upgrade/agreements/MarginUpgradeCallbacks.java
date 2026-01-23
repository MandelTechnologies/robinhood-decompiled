package com.robinhood.android.margin.upgrade.agreements;

import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistViewState4;
import com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResponse2;
import com.robinhood.models.util.Money;
import kotlin.Metadata;

/* compiled from: MarginUpgradeCallbacks.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeCallbacks;", "", "onMarginUpgradeSuccess", "", "newBuyingPower", "Lcom/robinhood/models/util/Money;", "marginFlow", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "displayName", "Lcom/robinhood/android/account/strings/DisplayName;", "onMarginUpgradeError", "result", "Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "errorReason", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MarginUpgradeCallbacks {
    void onMarginUpgradeError(ApiToggleMarginInvestingResponse2 result, String errorReason);

    void onMarginUpgradeSuccess(Money newBuyingPower, MarginEligibilityChecklistViewState4 marginFlow, DisplayName displayName);
}
