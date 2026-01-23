package com.robinhood.android.optionschain.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionChainCustomizationLaunchMode;
import com.robinhood.android.options.contracts.OptionChainCustomizationLaunchMode3;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.models.api.OptionStrategyType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainCustomizationDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionschain/targets/OptionChainCustomizationDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionChainCustomizationDeeplinkTarget extends DeeplinkTarget4 {
    public static final OptionChainCustomizationDeeplinkTarget INSTANCE = new OptionChainCustomizationDeeplinkTarget();
    public static final int $stable = 8;

    private OptionChainCustomizationDeeplinkTarget() {
        super("options_chain_customization", (RegionGate) OptionsRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intent mainIntent;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        OptionStrategyType optionStrategyTypeFromServerValue = OptionStrategyType.INSTANCE.fromServerValue(deeplinkContext.getUri().getQueryParameter("strategy"));
        if (optionStrategyTypeFromServerValue != null) {
            mainIntent = Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new OptionChainCustomizationLaunchMode.StrategyBuilder(optionStrategyTypeFromServerValue, OptionChainCustomizationLaunchMode3.SOURCE_CHAIN_CUSTOMIZATION_STRATEGY_BUILDER_DEEPLINK), false, false, false, null, false, true, false, false, false, null, false, 8052, null);
        } else {
            mainIntent = deeplinkContext.getMainIntent();
        }
        return new Intent[]{mainIntent};
    }
}
