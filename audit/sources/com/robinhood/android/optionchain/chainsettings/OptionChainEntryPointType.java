package com.robinhood.android.optionchain.chainsettings;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionChainEntryPointType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionchain/chainsettings/OptionChainEntryPointType;", "", "<init>", "(Ljava/lang/String;I)V", "CHAIN", "STRATEGY_BUILDER", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class OptionChainEntryPointType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionChainEntryPointType[] $VALUES;
    public static final OptionChainEntryPointType CHAIN = new OptionChainEntryPointType("CHAIN", 0);
    public static final OptionChainEntryPointType STRATEGY_BUILDER = new OptionChainEntryPointType("STRATEGY_BUILDER", 1);

    private static final /* synthetic */ OptionChainEntryPointType[] $values() {
        return new OptionChainEntryPointType[]{CHAIN, STRATEGY_BUILDER};
    }

    public static EnumEntries<OptionChainEntryPointType> getEntries() {
        return $ENTRIES;
    }

    private OptionChainEntryPointType(String str, int i) {
    }

    static {
        OptionChainEntryPointType[] optionChainEntryPointTypeArr$values = $values();
        $VALUES = optionChainEntryPointTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionChainEntryPointTypeArr$values);
    }

    public static OptionChainEntryPointType valueOf(String str) {
        return (OptionChainEntryPointType) Enum.valueOf(OptionChainEntryPointType.class, str);
    }

    public static OptionChainEntryPointType[] values() {
        return (OptionChainEntryPointType[]) $VALUES.clone();
    }
}
