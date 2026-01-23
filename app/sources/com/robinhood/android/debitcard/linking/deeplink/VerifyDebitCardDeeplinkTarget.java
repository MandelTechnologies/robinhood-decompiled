package com.robinhood.android.debitcard.linking.deeplink;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: VerifyDebitCardDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/deeplink/VerifyDebitCardDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class VerifyDebitCardDeeplinkTarget extends DeeplinkTarget4 {
    public static final VerifyDebitCardDeeplinkTarget INSTANCE = new VerifyDebitCardDeeplinkTarget();
    public static final int $stable = 8;

    private VerifyDebitCardDeeplinkTarget() {
        super("verify_debit_card", (RegionGate) MoneyMovementsUsRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) throws NumberFormatException {
        PaymentLinkingContext.EntryPoint entryPointFromValue;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        Intrinsics.checkNotNull(queryParameter);
        UUID uuid = StringsKt.toUuid(queryParameter);
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("entry_point");
        if (queryParameter2 != null) {
            entryPointFromValue = PaymentLinkingContext.EntryPoint.INSTANCE.fromValue(Integer.parseInt(queryParameter2));
            if (entryPointFromValue == null) {
                entryPointFromValue = PaymentLinkingContext.EntryPoint.DEEPLINK;
            }
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator, context, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new LegacyFragmentKey.DebitCardDynamicCodeVerification.Standalone(uuid, entryPointFromValue), false, false, false, false, false, false, 118, null), null, false, 12, null)};
    }
}
