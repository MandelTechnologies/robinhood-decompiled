package com.robinhood.android.retirement.p239ui.funded;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeader;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementDashboard.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/FundedDashboardCallbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderCallbacks;", "Lcom/robinhood/android/retirement/ui/funded/ChartFooterCallbacks;", "Lcom/robinhood/android/retirement/ui/funded/RetirementContributeFooterButtonCallbacks;", "Lcom/robinhood/android/retirement/ui/funded/RetirementAssetHeaderCallbacks;", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface FundedDashboardCallbacks extends SduiActionHandler<GenericAction>, RetirementDashboardHeader, RetirementDashboardChartFooter2, RetirementContributeFooterButton2, RetirementAssetHeaderCallbacks {

    /* compiled from: RetirementDashboard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void onAllAccountsSelected(FundedDashboardCallbacks fundedDashboardCallbacks) {
            RetirementDashboardHeader.DefaultImpls.onAllAccountsSelected(fundedDashboardCallbacks);
        }

        public static void onPendingApplicationClicked(FundedDashboardCallbacks fundedDashboardCallbacks, String applicationId, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            RetirementDashboardHeader.DefaultImpls.onPendingApplicationClicked(fundedDashboardCallbacks, applicationId, brokerageAccountType);
        }

        public static void showSduiAccountSwitcher(FundedDashboardCallbacks fundedDashboardCallbacks, SurfaceDto surface) {
            Intrinsics.checkNotNullParameter(surface, "surface");
            RetirementDashboardHeader.DefaultImpls.showSduiAccountSwitcher(fundedDashboardCallbacks, surface);
        }
    }
}
