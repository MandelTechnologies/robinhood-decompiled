package com.robinhood.android.optionschain.chainsettings.logging;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionChainSettingsLogging.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/logging/OptionChainSettingsLoggingTapType;", "", "<init>", "(Ljava/lang/String;I)V", "BUTTON", "ROW", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.chainsettings.logging.OptionChainSettingsLoggingTapType, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainSettingsLogging2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionChainSettingsLogging2[] $VALUES;
    public static final OptionChainSettingsLogging2 BUTTON = new OptionChainSettingsLogging2("BUTTON", 0);
    public static final OptionChainSettingsLogging2 ROW = new OptionChainSettingsLogging2("ROW", 1);

    private static final /* synthetic */ OptionChainSettingsLogging2[] $values() {
        return new OptionChainSettingsLogging2[]{BUTTON, ROW};
    }

    public static EnumEntries<OptionChainSettingsLogging2> getEntries() {
        return $ENTRIES;
    }

    private OptionChainSettingsLogging2(String str, int i) {
    }

    static {
        OptionChainSettingsLogging2[] optionChainSettingsLogging2Arr$values = $values();
        $VALUES = optionChainSettingsLogging2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionChainSettingsLogging2Arr$values);
    }

    public static OptionChainSettingsLogging2 valueOf(String str) {
        return (OptionChainSettingsLogging2) Enum.valueOf(OptionChainSettingsLogging2.class, str);
    }

    public static OptionChainSettingsLogging2[] values() {
        return (OptionChainSettingsLogging2[]) $VALUES.clone();
    }
}
