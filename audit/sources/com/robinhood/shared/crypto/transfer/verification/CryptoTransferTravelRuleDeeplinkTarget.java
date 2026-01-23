package com.robinhood.shared.crypto.transfer.verification;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.librobinhood.data.store.CryptoTransfersTravelRuleEu;
import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferVerificationIntentKey;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferTravelRuleDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/CryptoTransferTravelRuleDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoTransferTravelRuleDeeplinkTarget extends DeeplinkTarget4 {
    public static final CryptoTransferTravelRuleDeeplinkTarget INSTANCE = new CryptoTransferTravelRuleDeeplinkTarget();
    public static final int $stable = 8;

    private CryptoTransferTravelRuleDeeplinkTarget() {
        super("crypto_transfer_travel_rule", (RegionGate) CryptoRegionGate.INSTANCE, (ExperimentDeclaration) CryptoTransfersTravelRuleEu.INSTANCE, false, false, 24, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        UUID uuid2;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("address_ownership_id");
        if (queryParameter != null) {
            UUID uuid3 = null;
            try {
                uuid = StringsKt.toUuid(queryParameter);
            } catch (IllegalArgumentException unused) {
                uuid = null;
            }
            if (uuid != null) {
                String queryParameter2 = deeplinkContext.getUri().getQueryParameter(MatchSelectionActivity.TRANSFER_ID_EXTRA);
                if (queryParameter2 != null) {
                    try {
                        uuid2 = StringsKt.toUuid(queryParameter2);
                    } catch (IllegalArgumentException unused2) {
                        uuid2 = null;
                    }
                    if (uuid2 != null) {
                        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("currency_id");
                        if (queryParameter3 != null) {
                            try {
                                uuid3 = StringsKt.toUuid(queryParameter3);
                            } catch (IllegalArgumentException unused3) {
                            }
                            if (uuid3 != null) {
                                Navigator navigator = deeplinkContext.getNavigator();
                                Context context = deeplinkContext.getContext();
                                UUID uuidRandomUUID = UUID.randomUUID();
                                Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                                return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator, context, new CryptoTransferVerificationIntentKey.Deeplink(uuid2, new CryptoTransferVerificationIntentKey.LoggingContext(uuid3, uuidRandomUUID, uuid2), uuid), null, false, 12, null)};
                            }
                        }
                        return new Intent[0];
                    }
                }
                return new Intent[0];
            }
        }
        return new Intent[0];
    }
}
