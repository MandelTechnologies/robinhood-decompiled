package com.robinhood.android.optionschain.sbschain;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionSideBySideChainDataState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/TooltipState;", "", "<init>", "(Ljava/lang/String;I)V", "SPREAD_DRAG_NUX", "CHAIN_SETTINGS_NUX", "SWITCH_SIMULATED_RETURN_CHART_NUX", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.TooltipState, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainDataState7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionSideBySideChainDataState7[] $VALUES;
    public static final OptionSideBySideChainDataState7 SPREAD_DRAG_NUX = new OptionSideBySideChainDataState7("SPREAD_DRAG_NUX", 0);
    public static final OptionSideBySideChainDataState7 CHAIN_SETTINGS_NUX = new OptionSideBySideChainDataState7("CHAIN_SETTINGS_NUX", 1);
    public static final OptionSideBySideChainDataState7 SWITCH_SIMULATED_RETURN_CHART_NUX = new OptionSideBySideChainDataState7("SWITCH_SIMULATED_RETURN_CHART_NUX", 2);

    private static final /* synthetic */ OptionSideBySideChainDataState7[] $values() {
        return new OptionSideBySideChainDataState7[]{SPREAD_DRAG_NUX, CHAIN_SETTINGS_NUX, SWITCH_SIMULATED_RETURN_CHART_NUX};
    }

    public static EnumEntries<OptionSideBySideChainDataState7> getEntries() {
        return $ENTRIES;
    }

    private OptionSideBySideChainDataState7(String str, int i) {
    }

    static {
        OptionSideBySideChainDataState7[] optionSideBySideChainDataState7Arr$values = $values();
        $VALUES = optionSideBySideChainDataState7Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionSideBySideChainDataState7Arr$values);
    }

    public static OptionSideBySideChainDataState7 valueOf(String str) {
        return (OptionSideBySideChainDataState7) Enum.valueOf(OptionSideBySideChainDataState7.class, str);
    }

    public static OptionSideBySideChainDataState7[] values() {
        return (OptionSideBySideChainDataState7[]) $VALUES.clone();
    }
}
