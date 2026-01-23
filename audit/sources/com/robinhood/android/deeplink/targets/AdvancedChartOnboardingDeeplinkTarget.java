package com.robinhood.android.deeplink.targets;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartExperiment;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.rosetta.eventlogging.AdvancedChartsAboutContext;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartOnboardingFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartNuxFragmentKey;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Targets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/AdvancedChartOnboardingDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AdvancedChartOnboardingDeeplinkTarget extends DeeplinkTarget4 {
    public static final AdvancedChartOnboardingDeeplinkTarget INSTANCE = new AdvancedChartOnboardingDeeplinkTarget();
    public static final int $stable = 8;

    private AdvancedChartOnboardingDeeplinkTarget() {
        super(DeepLinkPath.ADVANCED_CHART_ONBOARDING.getPath(), false, false, true, true, false, null, 102, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        String lowerCase;
        AdvancedChartsAboutContext.SourceType sourceType;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("source_type");
        if (queryParameter != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            lowerCase = queryParameter.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case -1043655596:
                    if (!lowerCase.equals("investment_page_card")) {
                        sourceType = AdvancedChartsAboutContext.SourceType.SOURCE_TYPE_UNSPECIFIED;
                        break;
                    } else {
                        sourceType = AdvancedChartsAboutContext.SourceType.INVESTMENT_PAGE_CARD;
                        break;
                    }
                case 400802883:
                    if (lowerCase.equals("marketing_email")) {
                        sourceType = AdvancedChartsAboutContext.SourceType.MARKETING_EMAIL;
                        break;
                    }
                    break;
                case 666902000:
                    if (lowerCase.equals("push_notification")) {
                        sourceType = AdvancedChartsAboutContext.SourceType.PUSH_NOTIFICATION;
                        break;
                    }
                    break;
                case 1392894798:
                    if (lowerCase.equals("inbox_message")) {
                        sourceType = AdvancedChartsAboutContext.SourceType.INBOX_MESSAGE;
                        break;
                    }
                    break;
            }
        }
        if (!deeplinkContext.getExperimentState(BlackWidowAdvancedChartExperiment.INSTANCE)) {
            return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new AdvancedChartOnboardingFragmentKey(sourceType), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
        }
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        UUID uuidFromString = UUID.fromString("8f92e76f-1e0e-4478-8580-16a6ffcfaef5");
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("source_type");
        if (queryParameter2 == null) {
            queryParameter2 = "deeplink";
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new BlackWidowAdvancedChartNuxFragmentKey(uuidFromString, queryParameter2), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
    }
}
