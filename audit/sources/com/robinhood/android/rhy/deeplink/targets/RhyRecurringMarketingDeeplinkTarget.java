package com.robinhood.android.rhy.deeplink.targets;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.transfers.contracts.TransferFundsDeepLink;
import com.robinhood.android.transfers.contracts.TransferFundsDeepLinkAccountType;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/rhy/deeplink/targets/RhyRecurringMarketingDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyRecurringMarketingDeeplinkTarget extends DeeplinkTarget4 {
    public static final RhyRecurringMarketingDeeplinkTarget INSTANCE = new RhyRecurringMarketingDeeplinkTarget();

    private RhyRecurringMarketingDeeplinkTarget() {
        super(DeepLinkPath.RHY_RECURRING_MARKETING.getPath(), (RegionGate) SpendingRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        MAXTransferContext.EntryPoint entryPoint;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("entry_point");
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        ApiCreateTransferRequest2 apiCreateTransferRequest2 = ApiCreateTransferRequest2.WEEKLY;
        TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType = TransferFundsDeepLinkAccountType.ACH_RELATIONSHIP;
        TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType2 = TransferFundsDeepLinkAccountType.SPENDING;
        if (queryParameter != null) {
            int iHashCode = queryParameter.hashCode();
            if (iHashCode != 3452698) {
                if (iHashCode != 96619420) {
                    if (iHashCode == 100344454 && queryParameter.equals(AnalyticsStrings.TAB_NAV_TAB_BAR_INBOX)) {
                        entryPoint = MAXTransferContext.EntryPoint.RHY_RECURRING_MARKETING_INBOX;
                    }
                } else if (queryParameter.equals("email")) {
                    entryPoint = MAXTransferContext.EntryPoint.RHY_RECURRING_MARKETING_EMAIL;
                }
            } else if (queryParameter.equals("push")) {
                entryPoint = MAXTransferContext.EntryPoint.RHY_RECURRING_MARKETING_PUSH;
            }
        } else {
            entryPoint = MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator, context, new TransferFundsDeepLink(null, apiCreateTransferRequest2, null, null, transferFundsDeepLinkAccountType, transferFundsDeepLinkAccountType2, null, null, null, null, null, null, entryPoint, queryParameter, null, 4044, null), null, false, 12, null)};
    }
}
