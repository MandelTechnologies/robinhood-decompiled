package com.robinhood.android.retirement.onboarding.outro.invest;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.onboarding.outro.invest.RetirementInvestFragment;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementInvestDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/outro/invest/RetirementInvestDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementInvestDeeplinkTarget extends DeeplinkTarget4 {
    public static final RetirementInvestDeeplinkTarget INSTANCE = new RetirementInvestDeeplinkTarget();
    public static final int $stable = 8;

    private RetirementInvestDeeplinkTarget() {
        super("retirement_invest", (RegionGate) RetirementRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intent intentCreateIntent$default;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("account_number");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter(InstantCashConstants.ACCOUNT_TYPE_KEY);
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("source");
        BrokerageAccountType brokerageAccountTypeFromServerValue = BrokerageAccountType.INSTANCE.fromServerValue(queryParameter2);
        boolean zIsAuthenticationRequired = RetirementLastKnownEntryPointManager.INSTANCE.isAuthenticationRequired();
        if (queryParameter != null) {
            intentCreateIntent$default = Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new RetirementInvestFragment.Key(queryParameter, brokerageAccountTypeFromServerValue, queryParameter3), false, false, false, null, false, true, false, false, zIsAuthenticationRequired, null, false, 7028, null);
        } else {
            intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new TabLinkIntentKey.Retirement(null, null, null, 7, null), null, false, 12, null);
        }
        return new Intent[]{intentCreateIntent$default};
    }
}
