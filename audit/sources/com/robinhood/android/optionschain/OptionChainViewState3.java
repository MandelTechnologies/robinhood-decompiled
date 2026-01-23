package com.robinhood.android.optionschain;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionChainViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainSettingsIcon;", "", "<init>", "(Ljava/lang/String;I)V", "GEAR", "NONE", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.OptionChainSettingsIcon, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainViewState3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionChainViewState3[] $VALUES;
    public static final OptionChainViewState3 GEAR = new OptionChainViewState3("GEAR", 0);
    public static final OptionChainViewState3 NONE = new OptionChainViewState3("NONE", 1);

    private static final /* synthetic */ OptionChainViewState3[] $values() {
        return new OptionChainViewState3[]{GEAR, NONE};
    }

    public static EnumEntries<OptionChainViewState3> getEntries() {
        return $ENTRIES;
    }

    private OptionChainViewState3(String str, int i) {
    }

    static {
        OptionChainViewState3[] optionChainViewState3Arr$values = $values();
        $VALUES = optionChainViewState3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionChainViewState3Arr$values);
    }

    public static OptionChainViewState3 valueOf(String str) {
        return (OptionChainViewState3) Enum.valueOf(OptionChainViewState3.class, str);
    }

    public static OptionChainViewState3[] values() {
        return (OptionChainViewState3[]) $VALUES.clone();
    }
}
