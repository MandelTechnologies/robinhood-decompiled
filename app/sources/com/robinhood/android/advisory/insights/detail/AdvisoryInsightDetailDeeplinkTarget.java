package com.robinhood.android.advisory.insights.detail;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.contracts.AdvisoryInsightDetailKey;
import com.robinhood.android.advisory.contracts.InsightNavArg;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryInsightDetailDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/AdvisoryInsightDetailDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "INSIGHT_ID_QUERY_PARAM", "", "ACCOUNT_NUMBER_QUERY_PARAM", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisoryInsightDetailDeeplinkTarget extends DeeplinkTarget4 {
    public static final String ACCOUNT_NUMBER_QUERY_PARAM = "account_number";
    public static final String INSIGHT_ID_QUERY_PARAM = "insight_id";
    public static final AdvisoryInsightDetailDeeplinkTarget INSTANCE = new AdvisoryInsightDetailDeeplinkTarget();
    public static final int $stable = 8;

    private AdvisoryInsightDetailDeeplinkTarget() {
        super("strategies_insight", (RegionGate) AdvisoryRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 4, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter(INSIGHT_ID_QUERY_PARAM);
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("account_number");
        if (queryParameter == null || queryParameter2 == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Launched advisory insight detail screen without id or account number"), true, null, 4, null);
            return new Intent[0];
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new AdvisoryInsightDetailKey(queryParameter2, new InsightNavArg(queryParameter, AdvisoryInsight.PageType.UNSPECIFIED), null, 4, null), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, false, 12, null)};
    }
}
