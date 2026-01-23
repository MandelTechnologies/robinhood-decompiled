package com.robinhood.android.transfers.deeplink;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.DepositFundsDeepLink;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.models.api.ApiAutomaticDeposit;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DepositFundsDeepLinkTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0005\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0004H\u0002¨\u0006\b"}, m3636d2 = {"getIntent", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "createDepositFundsDeepLinkIntentKey", "Lcom/robinhood/android/transfers/contracts/DepositFundsDeepLink;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.deeplink.DepositFundsDeepLinkTargetsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class DepositFundsDeepLinkTargets {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] getIntent(DeeplinkTarget2 deeplinkTarget2) {
        return new Intent[]{deeplinkTarget2.getMainIntent(), Navigator.DefaultImpls.createIntent$default(deeplinkTarget2.getNavigator(), deeplinkTarget2.getContext(), createDepositFundsDeepLinkIntentKey(deeplinkTarget2), null, false, 12, null)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DepositFundsDeepLink createDepositFundsDeepLinkIntentKey(DeeplinkTarget2 deeplinkTarget2) {
        String queryParameter = deeplinkTarget2.getUri().getQueryParameter("amount");
        BigDecimal bigDecimal = queryParameter != null ? new BigDecimal(queryParameter) : null;
        ApiAutomaticDeposit.Frequency frequencyFromServerValue = ApiAutomaticDeposit.Frequency.INSTANCE.fromServerValue(deeplinkTarget2.getUri().getQueryParameter("frequency"));
        if (frequencyFromServerValue == null) {
            frequencyFromServerValue = ApiAutomaticDeposit.Frequency.ONCE;
        }
        ApiAutomaticDeposit.Frequency frequency = frequencyFromServerValue;
        TransferContext.RobinhoodAccountType robinhoodAccountType = (TransferContext.RobinhoodAccountType) TransferContext.RobinhoodAccountType.INSTANCE.fromServerValue(deeplinkTarget2.getUri().getQueryParameter(InstantCashConstants.ACCOUNT_TYPE_KEY));
        if (robinhoodAccountType == null) {
            robinhoodAccountType = TransferContext.RobinhoodAccountType.BROKERAGE;
        }
        return new DepositFundsDeepLink(bigDecimal, frequency, robinhoodAccountType, false, null, 24, null);
    }
}
