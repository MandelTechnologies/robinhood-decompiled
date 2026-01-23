package com.robinhood.android.options.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionChainCustomizationLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/InitialHighlightedMetric;", "", "<init>", "(Ljava/lang/String;I)V", "METRIC_ONE", "METRIC_TWO", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.contracts.InitialHighlightedMetric, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainCustomizationLaunchMode2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionChainCustomizationLaunchMode2[] $VALUES;
    public static final OptionChainCustomizationLaunchMode2 METRIC_ONE = new OptionChainCustomizationLaunchMode2("METRIC_ONE", 0);
    public static final OptionChainCustomizationLaunchMode2 METRIC_TWO = new OptionChainCustomizationLaunchMode2("METRIC_TWO", 1);

    private static final /* synthetic */ OptionChainCustomizationLaunchMode2[] $values() {
        return new OptionChainCustomizationLaunchMode2[]{METRIC_ONE, METRIC_TWO};
    }

    public static EnumEntries<OptionChainCustomizationLaunchMode2> getEntries() {
        return $ENTRIES;
    }

    private OptionChainCustomizationLaunchMode2(String str, int i) {
    }

    static {
        OptionChainCustomizationLaunchMode2[] optionChainCustomizationLaunchMode2Arr$values = $values();
        $VALUES = optionChainCustomizationLaunchMode2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionChainCustomizationLaunchMode2Arr$values);
    }

    public static OptionChainCustomizationLaunchMode2 valueOf(String str) {
        return (OptionChainCustomizationLaunchMode2) Enum.valueOf(OptionChainCustomizationLaunchMode2.class, str);
    }

    public static OptionChainCustomizationLaunchMode2[] values() {
        return (OptionChainCustomizationLaunchMode2[]) $VALUES.clone();
    }
}
