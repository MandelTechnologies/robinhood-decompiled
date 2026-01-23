package com.robinhood.android.account.p060ui;

import com.robinhood.android.account.p060ui.AccountSelector2;
import com.robinhood.android.futures.lib.rhd.accountoverview.p144ui.AccountOverviewRhdCallbacks2;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountOverviewCallbacks.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountOverviewCallbacks;", "Lcom/robinhood/android/account/ui/RecurringSectionCallbacks;", "Lcom/robinhood/android/account/ui/AccountSelectorCallbacks;", "Lcom/robinhood/android/account/ui/MarginSectionCallbacks;", "Lcom/robinhood/android/account/ui/DripSectionCallbacks;", "Lcom/robinhood/android/account/ui/SlipSectionCallbacks;", "Lcom/robinhood/android/account/ui/SweepSectionCallbacks;", "Lcom/robinhood/android/account/ui/AccountTypeSectionCallback;", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/ui/FuturesSectionCallbacks;", "Lcom/robinhood/android/account/ui/PortfolioSectionCallbacks;", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface AccountOverviewCallbacks extends AccountOverviewInvestmentScheduleCard3, AccountSelector2, AccountOverviewMarginCard3, AccountOverviewDripCard3, AccountOverviewSlipHubCard3, AccountOverviewSweepEnrollmentCard2, AccountTypeSectionState2, AccountOverviewRhdCallbacks2, AccountOverviewPortfolioCard3 {

    /* compiled from: AccountOverviewCallbacks.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void onAllAccountsSelected(AccountOverviewCallbacks accountOverviewCallbacks) {
            AccountSelector2.DefaultImpls.onAllAccountsSelected(accountOverviewCallbacks);
        }

        public static void onPendingApplicationClicked(AccountOverviewCallbacks accountOverviewCallbacks, String applicationId, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            AccountSelector2.DefaultImpls.onPendingApplicationClicked(accountOverviewCallbacks, applicationId, brokerageAccountType);
        }

        public static void onRefreshAccountsClicked(AccountOverviewCallbacks accountOverviewCallbacks) {
            AccountSelector2.DefaultImpls.onRefreshAccountsClicked(accountOverviewCallbacks);
        }
    }
}
