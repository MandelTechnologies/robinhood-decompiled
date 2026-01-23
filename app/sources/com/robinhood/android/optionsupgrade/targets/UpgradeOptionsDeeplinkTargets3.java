package com.robinhood.android.optionsupgrade.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.AccountOverviewLaunchType;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.settings.contracts.Constants6;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: UpgradeOptionsDeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"getIntent", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.targets.UpgradeOptionsDeeplinkTargetsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UpgradeOptionsDeeplinkTargets3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent[] getIntent(DeeplinkTarget2 deeplinkTarget2) {
        Intent intentCreateIntent$default;
        String queryParameter = deeplinkTarget2.getUri().getQueryParameter("account_number");
        String queryParameter2 = deeplinkTarget2.getUri().getQueryParameter(InstantCashConstants.ACCOUNT_TYPE_KEY);
        String str = null;
        BrokerageAccountType brokerageAccountTypeFromServerValue = queryParameter2 != null ? BrokerageAccountType.INSTANCE.fromServerValue(queryParameter2) : null;
        String queryParameter3 = deeplinkTarget2.getUri().getQueryParameter("source");
        if (queryParameter3 == null) {
            queryParameter3 = "";
        }
        String queryParameter4 = deeplinkTarget2.getUri().getQueryParameter("success_deeplink");
        if (queryParameter4 != null && !StringsKt.isBlank(queryParameter4)) {
            str = queryParameter4;
        }
        if (queryParameter != null) {
            intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(deeplinkTarget2.getNavigator(), deeplinkTarget2.getContext(), new OptionOnboarding(new OptionOnboarding2.AccountNumber(queryParameter), new OptionOnboarding.OptionOnboardingSource.Legacy(queryParameter3), str), null, false, 12, null);
        } else if (brokerageAccountTypeFromServerValue != null) {
            intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(deeplinkTarget2.getNavigator(), deeplinkTarget2.getContext(), new OptionOnboarding(new OptionOnboarding2.AccountType(brokerageAccountTypeFromServerValue), new OptionOnboarding.OptionOnboardingSource.Legacy(queryParameter3), str), null, false, 12, null);
        } else {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("No accountNumber or accountType in option onboarding deeplink: " + deeplinkTarget2.getUri()), false, null, 4, null);
            intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(deeplinkTarget2.getNavigator(), deeplinkTarget2.getContext(), new OptionOnboarding(new OptionOnboarding2.AccountType(BrokerageAccountType.INDIVIDUAL), new OptionOnboarding.OptionOnboardingSource.Legacy(queryParameter3), str), null, false, 12, null);
        }
        if (Intrinsics.areEqual(queryParameter3, Constants6.MARGIN_SETTINGS_PAGE_ID) || Intrinsics.areEqual(queryParameter3, "margin_strategy_builder")) {
            Intent intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(deeplinkTarget2.getNavigator(), deeplinkTarget2.getContext(), new LegacyFragmentKey.AccountOverview(AccountOverviewLaunchType.OPTIONS, queryParameter), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
            intentCreateIntentForFragment$default.addFlags(335544320);
            Unit unit = Unit.INSTANCE;
            return new Intent[]{intentCreateIntentForFragment$default, intentCreateIntent$default};
        }
        return new Intent[]{intentCreateIntent$default};
    }
}
