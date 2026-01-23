package com.robinhood.android.retirement.dashboard.header;

import com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks2;
import com.robinhood.models.api.BrokerageAccountType;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementDashboardHeader.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderCallbacks;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCombinedCallbacks;", "lib-retirement-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeaderCallbacks, reason: use source file name */
/* loaded from: classes5.dex */
public interface RetirementDashboardHeader extends AccountSwitcherCallbacks2 {

    /* compiled from: RetirementDashboardHeader.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeaderCallbacks$DefaultImpls */
    public static final class DefaultImpls {
        public static void onAllAccountsSelected(RetirementDashboardHeader retirementDashboardHeader) {
            AccountSwitcherCallbacks2.DefaultImpls.onAllAccountsSelected(retirementDashboardHeader);
        }

        public static void onPendingApplicationClicked(RetirementDashboardHeader retirementDashboardHeader, String applicationId, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            AccountSwitcherCallbacks2.DefaultImpls.onPendingApplicationClicked(retirementDashboardHeader, applicationId, brokerageAccountType);
        }

        public static void showSduiAccountSwitcher(RetirementDashboardHeader retirementDashboardHeader, SurfaceDto surface) {
            Intrinsics.checkNotNullParameter(surface, "surface");
            AccountSwitcherCallbacks2.DefaultImpls.showSduiAccountSwitcher(retirementDashboardHeader, surface);
        }
    }
}
