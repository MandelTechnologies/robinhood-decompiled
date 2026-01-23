package com.robinhood.android.transfers;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.MoneyMovementsTransfersDeepLinkRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.transfers.contracts.TransferFundsDeepLink;
import com.robinhood.android.transfers.contracts.TransferFundsDeepLinkAccountType;
import com.robinhood.android.transfers.contracts.TransfersDeepLinkMetadata;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.utils.extensions.StringsKt;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferFundsDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/TransferFundsDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TransferFundsDeeplinkTarget extends DeeplinkTarget4 {
    public static final TransferFundsDeeplinkTarget INSTANCE = new TransferFundsDeeplinkTarget();
    public static final int $stable = 8;

    private TransferFundsDeeplinkTarget() {
        super("transfer_funds", (RegionGate) MoneyMovementsTransfersDeepLinkRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        MAXTransferContext.EntryPoint entryPointValueOf;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        long jCurrentTimeMillis = System.currentTimeMillis();
        String queryParameter = deeplinkContext.getUri().getQueryParameter("entry_point");
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        String strNullIfEmpty = StringsKt.nullIfEmpty(deeplinkContext.getUri().getQueryParameter("amount"));
        BigDecimal bigDecimal = strNullIfEmpty != null ? new BigDecimal(strNullIfEmpty) : null;
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("frequency");
        ApiCreateTransferRequest2 apiCreateTransferRequest2 = queryParameter2 != null ? (ApiCreateTransferRequest2) ApiCreateTransferRequest2.INSTANCE.fromServerValue(queryParameter2) : null;
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("from_account_id");
        String queryParameter4 = deeplinkContext.getUri().getQueryParameter("to_account_id");
        String queryParameter5 = deeplinkContext.getUri().getQueryParameter("from_account_type");
        TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType = queryParameter5 != null ? (TransferFundsDeepLinkAccountType) TransferFundsDeepLinkAccountType.INSTANCE.fromServerValue(queryParameter5) : null;
        String queryParameter6 = deeplinkContext.getUri().getQueryParameter("to_account_type");
        TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType2 = queryParameter6 != null ? (TransferFundsDeepLinkAccountType) TransferFundsDeepLinkAccountType.INSTANCE.fromServerValue(queryParameter6) : null;
        String queryParameter7 = deeplinkContext.getUri().getQueryParameter("ira_contribution_type");
        IraContributionType iraContributionType = queryParameter7 != null ? (IraContributionType) IraContributionType.INSTANCE.fromServerValue(queryParameter7) : null;
        String queryParameter8 = deeplinkContext.getUri().getQueryParameter("transfer_direction");
        TransferDirectionV2 transferDirectionV2FromServerValue = queryParameter8 != null ? TransferDirectionV2.INSTANCE.fromServerValue(queryParameter8) : null;
        String queryParameter9 = deeplinkContext.getUri().getQueryParameter("min_deposit_amount");
        Double doubleOrNull = queryParameter9 != null ? kotlin.text.StringsKt.toDoubleOrNull(queryParameter9) : null;
        String queryParameter10 = deeplinkContext.getUri().getQueryParameter("min_deposit_rate");
        Double doubleOrNull2 = queryParameter10 != null ? kotlin.text.StringsKt.toDoubleOrNull(queryParameter10) : null;
        String queryParameter11 = deeplinkContext.getUri().getQueryParameter("promotion_name");
        String queryParameter12 = deeplinkContext.getUri().getQueryParameter("promotion_type");
        if (queryParameter != null) {
            switch (queryParameter.hashCode()) {
                case -999144789:
                    if (!queryParameter.equals("short_sell_enablement")) {
                        if (queryParameter == null) {
                            entryPointValueOf = MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
                            break;
                        } else {
                            try {
                                String upperCase = queryParameter.toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                entryPointValueOf = MAXTransferContext.EntryPoint.valueOf(upperCase);
                                break;
                            } catch (IllegalArgumentException unused) {
                                entryPointValueOf = MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
                                break;
                            }
                        }
                    } else {
                        entryPointValueOf = MAXTransferContext.EntryPoint.SHORT_SELL_ENABLEMENT;
                        break;
                    }
                case 699996249:
                    if (queryParameter.equals("rhs_rad_upsell")) {
                        entryPointValueOf = MAXTransferContext.EntryPoint.RHS_RECURRING_UPSELL;
                        break;
                    }
                    break;
                case 767842934:
                    if (queryParameter.equals("margin_call_warn")) {
                        entryPointValueOf = MAXTransferContext.EntryPoint.MAINTENANCE_CALL_WARNING;
                        break;
                    }
                    break;
                case 1474492563:
                    if (queryParameter.equals("rhy_rad_upsell")) {
                        entryPointValueOf = MAXTransferContext.EntryPoint.RHY_RECURRING_UPSELL;
                        break;
                    }
                    break;
            }
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator, context, new TransferFundsDeepLink(bigDecimal, apiCreateTransferRequest2, queryParameter3, queryParameter4, transferFundsDeepLinkAccountType, transferFundsDeepLinkAccountType2, iraContributionType, transferDirectionV2FromServerValue, doubleOrNull, doubleOrNull2, queryParameter11, queryParameter12, entryPointValueOf, queryParameter, new TransfersDeepLinkMetadata(jCurrentTimeMillis, deeplinkContext.getUri())), null, false, 12, null)};
    }
}
