package com.robinhood.android.optionschain.chainsettings;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionChainSettingsViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDropdownType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT_PRICE", "BID_ASK_PRICE_LABEL", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDropdownType, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainSettingsViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionChainSettingsViewState2[] $VALUES;
    public static final OptionChainSettingsViewState2 DEFAULT_PRICE = new OptionChainSettingsViewState2("DEFAULT_PRICE", 0);
    public static final OptionChainSettingsViewState2 BID_ASK_PRICE_LABEL = new OptionChainSettingsViewState2("BID_ASK_PRICE_LABEL", 1);

    private static final /* synthetic */ OptionChainSettingsViewState2[] $values() {
        return new OptionChainSettingsViewState2[]{DEFAULT_PRICE, BID_ASK_PRICE_LABEL};
    }

    public static EnumEntries<OptionChainSettingsViewState2> getEntries() {
        return $ENTRIES;
    }

    private OptionChainSettingsViewState2(String str, int i) {
    }

    static {
        OptionChainSettingsViewState2[] optionChainSettingsViewState2Arr$values = $values();
        $VALUES = optionChainSettingsViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionChainSettingsViewState2Arr$values);
    }

    public static OptionChainSettingsViewState2 valueOf(String str) {
        return (OptionChainSettingsViewState2) Enum.valueOf(OptionChainSettingsViewState2.class, str);
    }

    public static OptionChainSettingsViewState2[] values() {
        return (OptionChainSettingsViewState2[]) $VALUES.clone();
    }
}
