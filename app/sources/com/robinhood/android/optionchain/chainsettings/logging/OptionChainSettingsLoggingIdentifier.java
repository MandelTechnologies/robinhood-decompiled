package com.robinhood.android.optionchain.chainsettings.logging;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionChainSettingsLoggingIdentifier.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionchain/chainsettings/logging/OptionChainSettingsLoggingIdentifier;", "", "identifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "CUSTOMIZE_BUY", "CUSTOMIZE_SELL", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class OptionChainSettingsLoggingIdentifier {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionChainSettingsLoggingIdentifier[] $VALUES;
    public static final OptionChainSettingsLoggingIdentifier CUSTOMIZE_BUY = new OptionChainSettingsLoggingIdentifier("CUSTOMIZE_BUY", 0, "customize_buy");
    public static final OptionChainSettingsLoggingIdentifier CUSTOMIZE_SELL = new OptionChainSettingsLoggingIdentifier("CUSTOMIZE_SELL", 1, "customize_sell");
    private final String identifier;

    private static final /* synthetic */ OptionChainSettingsLoggingIdentifier[] $values() {
        return new OptionChainSettingsLoggingIdentifier[]{CUSTOMIZE_BUY, CUSTOMIZE_SELL};
    }

    public static EnumEntries<OptionChainSettingsLoggingIdentifier> getEntries() {
        return $ENTRIES;
    }

    private OptionChainSettingsLoggingIdentifier(String str, int i, String str2) {
        this.identifier = str2;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    static {
        OptionChainSettingsLoggingIdentifier[] optionChainSettingsLoggingIdentifierArr$values = $values();
        $VALUES = optionChainSettingsLoggingIdentifierArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionChainSettingsLoggingIdentifierArr$values);
    }

    public static OptionChainSettingsLoggingIdentifier valueOf(String str) {
        return (OptionChainSettingsLoggingIdentifier) Enum.valueOf(OptionChainSettingsLoggingIdentifier.class, str);
    }

    public static OptionChainSettingsLoggingIdentifier[] values() {
        return (OptionChainSettingsLoggingIdentifier[]) $VALUES.clone();
    }
}
