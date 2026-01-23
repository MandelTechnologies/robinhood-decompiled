package com.robinhood.android.retirement.p239ui.unfunded;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeader;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.shared.iac.infobanner.InfoBannerCallbacks;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnfundedDashboard.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/unfunded/UnfundedDashboardCallbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderCallbacks;", "Lcom/robinhood/shared/iac/infobanner/InfoBannerCallbacks;", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.ui.unfunded.UnfundedDashboardCallbacks, reason: use source file name */
/* loaded from: classes5.dex */
public interface UnfundedDashboard extends SduiActionHandler<GenericAction>, RetirementDashboardHeader, InfoBannerCallbacks {

    /* compiled from: UnfundedDashboard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.ui.unfunded.UnfundedDashboardCallbacks$DefaultImpls */
    public static final class DefaultImpls {
        public static void onAllAccountsSelected(UnfundedDashboard unfundedDashboard) {
            RetirementDashboardHeader.DefaultImpls.onAllAccountsSelected(unfundedDashboard);
        }

        public static void onPendingApplicationClicked(UnfundedDashboard unfundedDashboard, String applicationId, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            RetirementDashboardHeader.DefaultImpls.onPendingApplicationClicked(unfundedDashboard, applicationId, brokerageAccountType);
        }

        public static void showSduiAccountSwitcher(UnfundedDashboard unfundedDashboard, SurfaceDto surface) {
            Intrinsics.checkNotNullParameter(surface, "surface");
            RetirementDashboardHeader.DefaultImpls.showSduiAccountSwitcher(unfundedDashboard, surface);
        }
    }
}
