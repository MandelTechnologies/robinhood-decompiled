package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.deeplink;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.rhy.contracts.PaycheckRecurringInvestmentsOnboardingIntentKey;
import com.robinhood.experiments.ExperimentDeclaration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringPaycheckDdOnboardingDeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/deeplink/CreatePaycheckRecurringInvestmentNoDdDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.deeplink.CreatePaycheckRecurringInvestmentNoDdDeeplinkTarget, reason: use source file name */
/* loaded from: classes11.dex */
public final class RecurringPaycheckDdOnboardingDeeplinkTargets2 extends DeeplinkTarget4 {
    public static final RecurringPaycheckDdOnboardingDeeplinkTargets2 INSTANCE = new RecurringPaycheckDdOnboardingDeeplinkTargets2();
    public static final int $stable = 8;

    private RecurringPaycheckDdOnboardingDeeplinkTargets2() {
        super("create_paycheck_recurring_investment_no_dd", (RegionGate) SpendingRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        PaycheckRecurringInvestmentsOnboardingIntentKey.SypIntro sypIntro;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("skip_intro");
        if (queryParameter == null) {
            queryParameter = "false";
        }
        boolean z = Boolean.parseBoolean(queryParameter);
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("retirement_only");
        if (queryParameter2 == null) {
            queryParameter2 = "false";
        }
        boolean z2 = Boolean.parseBoolean(queryParameter2);
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("can_skip_asset_category_selection");
        boolean z3 = Boolean.parseBoolean(queryParameter3 != null ? queryParameter3 : "false");
        if (z) {
            sypIntro = PaycheckRecurringInvestmentsOnboardingIntentKey.SypIntro.DIRECT_DEPOSIT_ONLY;
        } else {
            sypIntro = PaycheckRecurringInvestmentsOnboardingIntentKey.SypIntro.INTRO_WITH_DIRECT_DEPOSIT;
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new PaycheckRecurringInvestmentsOnboardingIntentKey.General(sypIntro, z2, z3), null, false, 12, null)};
    }
}
