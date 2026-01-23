package com.robinhood.android.onboarding.p205ui.targets;

import android.content.Intent;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.OnboardingFlowPathType;
import com.robinhood.android.onboarding.contracts.PostUserCreationShimIntentKey;
import com.robinhood.models.api.ColorTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResumeApplicationDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/targets/ResumeApplicationDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ResumeApplicationDeeplinkTarget extends DeeplinkTarget4 {
    public static final ResumeApplicationDeeplinkTarget INSTANCE = new ResumeApplicationDeeplinkTarget();
    public static final int $stable = 8;

    private ResumeApplicationDeeplinkTarget() {
        super("resume_application", false, false, false, true, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        OnboardingFlowPathType brokerage;
        ColorTheme colorThemeFromServerValue;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("source");
        if (Intrinsics.areEqual(deeplinkContext.getUri().getQueryParameter(InstantCashConstants.ACCOUNT_TYPE_KEY), AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO)) {
            brokerage = OnboardingFlowPathType.Rhce.INSTANCE;
        } else {
            brokerage = new OnboardingFlowPathType.Brokerage(null, 1, null);
        }
        OnboardingFlowPathType onboardingFlowPathType = brokerage;
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("theme");
        if (queryParameter2 == null || (colorThemeFromServerValue = ColorTheme.INSTANCE.fromServerValue(queryParameter2)) == null) {
            colorThemeFromServerValue = ColorTheme.DEFAULT;
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new PostUserCreationShimIntentKey(false, null, queryParameter, colorThemeFromServerValue == ColorTheme.DARK, onboardingFlowPathType, 3, null), null, false, 12, null)};
    }
}
