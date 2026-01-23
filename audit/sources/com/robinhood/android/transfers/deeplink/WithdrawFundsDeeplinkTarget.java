package com.robinhood.android.transfers.deeplink;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.MoneyMovementsTransfersDeepLinkRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.transfers.contracts.WithdrawFundsDeeplink;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.experiments.ExperimentDeclaration;
import java.math.BigDecimal;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WithdrawFundsDeeplinkTarget.kt */
@Deprecated
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/deeplink/WithdrawFundsDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WithdrawFundsDeeplinkTarget extends DeeplinkTarget4 {
    public static final WithdrawFundsDeeplinkTarget INSTANCE = new WithdrawFundsDeeplinkTarget();
    public static final int $stable = 8;

    private WithdrawFundsDeeplinkTarget() {
        super(AnalyticsStrings.USER_ACTION_WITHDRAW, (RegionGate) MoneyMovementsTransfersDeepLinkRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("amount");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter(InstantCashConstants.ACCOUNT_TYPE_KEY);
        Intent mainIntent = deeplinkContext.getMainIntent();
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        BigDecimal bigDecimal = queryParameter != null ? new BigDecimal(queryParameter) : null;
        TransferContext.RobinhoodAccountType robinhoodAccountType = (TransferContext.RobinhoodAccountType) TransferContext.RobinhoodAccountType.INSTANCE.fromServerValue(queryParameter2);
        if (robinhoodAccountType == null) {
            robinhoodAccountType = TransferContext.RobinhoodAccountType.BROKERAGE;
        }
        return new Intent[]{mainIntent, Navigator.DefaultImpls.createIntent$default(navigator, context, new WithdrawFundsDeeplink(bigDecimal, robinhoodAccountType), null, false, 12, null)};
    }
}
