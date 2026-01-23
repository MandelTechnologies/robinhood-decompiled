package com.robinhood.android.advisory.history.trade;

import android.content.Context;
import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.contracts.AdvisorTradeDetailsKey;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.utils.logging.CrashReporter;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisorTradeDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "REBALANCE_ID_QUERY_PARAM", "", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisorTradeDeeplinkTarget extends DeeplinkTarget4 {
    private static final String REBALANCE_ID_QUERY_PARAM = "id";
    public static final AdvisorTradeDeeplinkTarget INSTANCE = new AdvisorTradeDeeplinkTarget();
    public static final int $stable = 8;

    private AdvisorTradeDeeplinkTarget() {
        super("advisor_trade", (RegionGate) AdvisoryRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 4, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        if (queryParameter == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Launched advisor trade without a rebalance id"), true, null, 4, null);
            return new Intent[0];
        }
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        UUID uuidFromString = UUID.fromString(queryParameter);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(navigator, context, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new AdvisorTradeDetailsKey(uuidFromString, true), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, false, 12, null)};
    }
}
