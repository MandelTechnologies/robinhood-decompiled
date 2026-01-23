package com.robinhood.android.optionschain.sbschain;

import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionSideBySideChainStateProvider.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000¨\u0006\u000b"}, m3636d2 = {"getOptionOrderIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "accountNumber", "", "legs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/OptionLegBundle;", "launchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "defaultPricingSettingOverride", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainStateProviderKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainStateProvider2 {
    public static final OptionOrderIntentKey.FromOptionOrderBundle getOptionOrderIntentKey(String accountNumber, ImmutableList<OptionLegBundle> legs, OptionChainLaunchMode launchMode, OptionSettings.DefaultPricingSetting defaultPricingSetting) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        if (legs.isEmpty()) {
            return null;
        }
        return new OptionOrderIntentKey.FromOptionOrderBundle(defaultPricingSetting, accountNumber, new OptionOrderBundle(legs, null, 2, null), null, null, null, null, false, false, !launchMode.getFeatureSet().contains(OptionChainLaunchMode.Feature.USE_DEFAULT_PRICING_SETTING), OptionChainDisplayMode.SIDE_BY_SIDE, OptionOrderFormSource.OPTION_CHAIN, null, TransitionReason.OPTION_TRADE_CHAIN, 4600, null);
    }
}
