package com.robinhood.android.transfers.deeplink;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.regiongate.MoneyMovementsTransfersDeepLinkRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.transfers.contracts.UpdateRecurringDepositKey;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: UpdateRecurringDepositDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\fH\u0002J\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\t¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/deeplink/UpdateRecurringDepositDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "toTransferFrequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "", "createFaultyDeeplinkFallback", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class UpdateRecurringDepositDeeplinkTarget extends DeeplinkTarget4 {
    public static final UpdateRecurringDepositDeeplinkTarget INSTANCE = new UpdateRecurringDepositDeeplinkTarget();
    public static final int $stable = 8;

    private UpdateRecurringDepositDeeplinkTarget() {
        super("update_recurring_deposit", (RegionGate) MoneyMovementsTransfersDeepLinkRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter(MatchSelectionActivity.TRANSFER_ID_EXTRA);
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("amount");
        UUID uuid = null;
        BigDecimal bigDecimal = queryParameter2 != null ? new BigDecimal(queryParameter2) : null;
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("frequency");
        ApiCreateTransferRequest2 transferFrequency = queryParameter3 != null ? toTransferFrequency(queryParameter3) : null;
        if (queryParameter == null || StringsKt.isBlank(queryParameter)) {
            return createFaultyDeeplinkFallback(deeplinkContext);
        }
        if (bigDecimal == null) {
            return createFaultyDeeplinkFallback(deeplinkContext);
        }
        if (transferFrequency == null) {
            return createFaultyDeeplinkFallback(deeplinkContext);
        }
        if (transferFrequency == ApiCreateTransferRequest2.ONCE) {
            return createFaultyDeeplinkFallback(deeplinkContext);
        }
        String queryParameter4 = deeplinkContext.getUri().getQueryParameter("source_account_id");
        if (queryParameter4 != null) {
            try {
                uuid = com.robinhood.utils.extensions.StringsKt.toUuid(queryParameter4);
            } catch (IllegalArgumentException unused) {
            }
        }
        return new Intent[]{deeplinkContext.getMainIntent(), Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new UpdateRecurringDepositKey(queryParameter, bigDecimal, uuid, transferFrequency, MAXTransferContext.EntryPoint.ONE_PERCENT_MAX_AWARENESS_BOTTOMSHEET, null, 32, null), null, false, 12, null)};
    }

    private final ApiCreateTransferRequest2 toTransferFrequency(String str) {
        return (ApiCreateTransferRequest2) ApiCreateTransferRequest2.INSTANCE.fromServerValue(str);
    }

    private final Intent[] createFaultyDeeplinkFallback(DeeplinkTarget2 deeplinkContext) {
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 7, null), null, false, 12, null)};
    }
}
