package com.robinhood.android.chart.blackwidowadvancedchart.onboarding;

import android.content.Intent;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartExperiment;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartNuxFragmentKey;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BlackWidowAdvancedChartDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/onboarding/BlackWidowAdvancedChartDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BlackWidowAdvancedChartDeeplinkTarget extends DeeplinkTarget4 {
    public static final BlackWidowAdvancedChartDeeplinkTarget INSTANCE = new BlackWidowAdvancedChartDeeplinkTarget();
    public static final int $stable = 8;

    private BlackWidowAdvancedChartDeeplinkTarget() {
        super("mobile_advanced_chart", (ExperimentDeclaration) BlackWidowAdvancedChartExperiment.INSTANCE, false, 4, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("instrument_id");
        if (queryParameter != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter);
            } catch (IllegalArgumentException unused) {
                uuid = null;
            }
            if (uuid == null) {
                uuid = StringsKt.toUuid("8f92e76f-1e0e-4478-8580-16a6ffcfaef5");
            }
        }
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("source");
        if (queryParameter2 == null) {
            queryParameter2 = "deeplink";
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new BlackWidowAdvancedChartNuxFragmentKey(uuid, queryParameter2), false, false, false, null, false, true, false, false, true, null, false, 7028, null)};
    }
}
