package com.robinhood.android.debitcard.linking.deeplink;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.DebitCardLinkingConfiguration;
import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkDebitCardDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/deeplink/LinkDebitCardDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class LinkDebitCardDeeplinkTarget extends DeeplinkTarget4 {
    public static final LinkDebitCardDeeplinkTarget INSTANCE = new LinkDebitCardDeeplinkTarget();
    public static final int $stable = 8;

    private LinkDebitCardDeeplinkTarget() {
        super("link_debit_card", (RegionGate) MoneyMovementsUsRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        boolean booleanQueryParameter = deeplinkContext.getUri().getBooleanQueryParameter("show_intro", false);
        boolean booleanQueryParameter2 = deeplinkContext.getUri().getBooleanQueryParameter("show_transfers_cta", true);
        PaymentLinkingContext.EntryPoint.Companion companion = PaymentLinkingContext.EntryPoint.INSTANCE;
        String queryParameter = deeplinkContext.getUri().getQueryParameter("entry_point");
        if (queryParameter == null) {
            queryParameter = "0";
        }
        PaymentLinkingContext.EntryPoint entryPointFromValue = companion.fromValue(Integer.parseInt(queryParameter));
        if (entryPointFromValue == null) {
            entryPointFromValue = PaymentLinkingContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
        }
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("original_entry_point");
        PaymentLinkingContext.EntryPoint entryPointFromValue2 = companion.fromValue(Integer.parseInt(queryParameter2 != null ? queryParameter2 : "0"));
        if (entryPointFromValue2 == null) {
            entryPointFromValue2 = PaymentLinkingContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator, context, new LegacyIntentKey.DebitCardLinking(new DebitCardLinkingConfiguration.Standard(booleanQueryParameter, booleanQueryParameter2, entryPointFromValue, entryPointFromValue2)), null, false, 12, null)};
    }
}
