package com.robinhood.android.crypto.transfer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.shared.crypto.contracts.CryptoTransferIntentKey;
import com.robinhood.utils.extensions.StringsKt;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/crypto/transfer/CryptoTransferDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoTransferDeeplinkTarget extends DeeplinkTarget4 {
    public static final CryptoTransferDeeplinkTarget INSTANCE = new CryptoTransferDeeplinkTarget();
    public static final int $stable = 8;

    private CryptoTransferDeeplinkTarget() {
        super("crypto_transfer", (RegionGate) CryptoRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        CryptoTransferIntentKey.Source source;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        ArrayList arrayList = new ArrayList();
        if (deeplinkContext.getDeepLinkOrigin().isExternalOrNotification()) {
            arrayList.add(deeplinkContext.getMainIntent());
        }
        Uri uri = deeplinkContext.getUri();
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        String queryParameter = uri.getQueryParameter("id");
        UUID uuid = queryParameter != null ? StringsKt.toUuid(queryParameter) : null;
        CryptoTransferIntentKey.Action.Companion companion = CryptoTransferIntentKey.Action.INSTANCE;
        String queryParameter2 = uri.getQueryParameter("action");
        if (queryParameter2 != null) {
            CryptoTransferIntentKey.Action actionFromQueryParam = companion.fromQueryParam(queryParameter2);
            String queryParameter3 = uri.getQueryParameter("exit_deeplink_enrollment_completed");
            String queryParameter4 = uri.getQueryParameter("source");
            if (queryParameter4 != null && queryParameter4.hashCode() == -526138314 && queryParameter4.equals("crypto_fees_deposit_incentive")) {
                source = CryptoTransferIntentKey.Source.CryptoFeesDepositIncentive.INSTANCE;
            } else {
                source = CryptoTransferIntentKey.Source.Default.INSTANCE;
            }
            arrayList.add(Navigator.DefaultImpls.createIntent$default(navigator, context, new CryptoTransferIntentKey(actionFromQueryParam, uuid, source, false, queryParameter3, 8, null), null, false, 12, null));
            return (Intent[]) arrayList.toArray(new Intent[0]);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
