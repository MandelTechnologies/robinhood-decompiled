package com.robinhood.android.optionschain.targets;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionChainOnboardingFragmentKey;
import com.robinhood.android.options.contracts.OptionChainOnboardingFragmentKey2;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimulatedReturnPreTradeOnboardingDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionschain/targets/SimulatedReturnPreTradeOnboardingDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class SimulatedReturnPreTradeOnboardingDeeplinkTarget extends DeeplinkTarget4 {
    public static final SimulatedReturnPreTradeOnboardingDeeplinkTarget INSTANCE = new SimulatedReturnPreTradeOnboardingDeeplinkTarget();
    public static final int $stable = 8;

    private SimulatedReturnPreTradeOnboardingDeeplinkTarget() {
        super("sr-pre-trade-onboarding", (RegionGate) OptionsRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter(InstantCashConstants.ACCOUNT_TYPE_KEY);
        BrokerageAccountType brokerageAccountTypeFromServerValue = queryParameter != null ? BrokerageAccountType.INSTANCE.fromServerValue(queryParameter) : null;
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("source");
        if (brokerageAccountTypeFromServerValue == null) {
            return new Intent[0];
        }
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        String str = queryParameter2;
        OptionChainOnboardingFragmentKey2 optionChainOnboardingFragmentKey2 = OptionChainOnboardingFragmentKey2.SIMULATED_RETURN_PRE_TRADE;
        if (str == null) {
            str = "";
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new OptionChainOnboardingFragmentKey(brokerageAccountTypeFromServerValue, optionChainOnboardingFragmentKey2, str), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
    }
}
