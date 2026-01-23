package com.robinhood.android.optionschain.logging;

import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsContext.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toOptionContext", "Lcom/robinhood/rosetta/eventlogging/OptionsContext;", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.logging.OptionsContextKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsContext2 {
    public static final OptionsContext toOptionContext(OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle) {
        OptionsContext.OptionLeg optionLeg;
        OptionsContext.OptionLeg optionLeg2;
        OptionsContext.OptionLeg optionLeg3;
        OptionsContext.OptionLeg optionLeg4;
        Intrinsics.checkNotNullParameter(fromOptionOrderBundle, "<this>");
        String string2 = fromOptionOrderBundle.getOptionOrderBundle().getOptionChainBundle().getOptionChainId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        OptionLegBundle optionLegBundle = (OptionLegBundle) CollectionsKt.getOrNull(fromOptionOrderBundle.getOptionOrderBundle().getLegBundles(), 0);
        if (optionLegBundle != null) {
            String string3 = optionLegBundle.getOptionInstrument().getId().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            optionLeg = new OptionsContext.OptionLeg(string3, null, 2, null);
        } else {
            optionLeg = null;
        }
        OptionLegBundle optionLegBundle2 = (OptionLegBundle) CollectionsKt.getOrNull(fromOptionOrderBundle.getOptionOrderBundle().getLegBundles(), 1);
        if (optionLegBundle2 != null) {
            String string4 = optionLegBundle2.getOptionInstrument().getId().toString();
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
            optionLeg2 = new OptionsContext.OptionLeg(string4, null, 2, null);
        } else {
            optionLeg2 = null;
        }
        OptionLegBundle optionLegBundle3 = (OptionLegBundle) CollectionsKt.getOrNull(fromOptionOrderBundle.getOptionOrderBundle().getLegBundles(), 2);
        if (optionLegBundle3 != null) {
            String string5 = optionLegBundle3.getOptionInstrument().getId().toString();
            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
            optionLeg3 = new OptionsContext.OptionLeg(string5, null, 2, null);
        } else {
            optionLeg3 = null;
        }
        OptionLegBundle optionLegBundle4 = (OptionLegBundle) CollectionsKt.getOrNull(fromOptionOrderBundle.getOptionOrderBundle().getLegBundles(), 3);
        if (optionLegBundle4 != null) {
            String string6 = optionLegBundle4.getOptionInstrument().getId().toString();
            Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
            optionLeg4 = new OptionsContext.OptionLeg(string6, null, 2, null);
        } else {
            optionLeg4 = null;
        }
        return new OptionsContext(string2, null, null, null, null, optionLeg, optionLeg2, optionLeg3, optionLeg4, null, null, null, null, null, 15902, null);
    }
}
