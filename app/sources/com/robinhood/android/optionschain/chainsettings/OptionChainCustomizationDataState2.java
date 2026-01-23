package com.robinhood.android.optionschain.chainsettings;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionChainCustomizationDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/HighlightedMetric;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "METRIC_ONE", "METRIC_TWO", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.chainsettings.HighlightedMetric, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainCustomizationDataState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionChainCustomizationDataState2[] $VALUES;
    public static final OptionChainCustomizationDataState2 METRIC_ONE = new OptionChainCustomizationDataState2("METRIC_ONE", 0, "metric_one");
    public static final OptionChainCustomizationDataState2 METRIC_TWO = new OptionChainCustomizationDataState2("METRIC_TWO", 1, "metric_two");
    private final String value;

    private static final /* synthetic */ OptionChainCustomizationDataState2[] $values() {
        return new OptionChainCustomizationDataState2[]{METRIC_ONE, METRIC_TWO};
    }

    public static EnumEntries<OptionChainCustomizationDataState2> getEntries() {
        return $ENTRIES;
    }

    private OptionChainCustomizationDataState2(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        OptionChainCustomizationDataState2[] optionChainCustomizationDataState2Arr$values = $values();
        $VALUES = optionChainCustomizationDataState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionChainCustomizationDataState2Arr$values);
    }

    public static OptionChainCustomizationDataState2 valueOf(String str) {
        return (OptionChainCustomizationDataState2) Enum.valueOf(OptionChainCustomizationDataState2.class, str);
    }

    public static OptionChainCustomizationDataState2[] values() {
        return (OptionChainCustomizationDataState2[]) $VALUES.clone();
    }
}
