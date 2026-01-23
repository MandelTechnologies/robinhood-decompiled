package com.robinhood.android.options.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionChainOnboardingFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainOnboardingLaunchMode;", "", "<init>", "(Ljava/lang/String;I)V", "SIDE_BY_SIDE", "SIMULATED_RETURN_PRE_TRADE", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.contracts.OptionChainOnboardingLaunchMode, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainOnboardingFragmentKey2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionChainOnboardingFragmentKey2[] $VALUES;
    public static final OptionChainOnboardingFragmentKey2 SIDE_BY_SIDE = new OptionChainOnboardingFragmentKey2("SIDE_BY_SIDE", 0);
    public static final OptionChainOnboardingFragmentKey2 SIMULATED_RETURN_PRE_TRADE = new OptionChainOnboardingFragmentKey2("SIMULATED_RETURN_PRE_TRADE", 1);

    private static final /* synthetic */ OptionChainOnboardingFragmentKey2[] $values() {
        return new OptionChainOnboardingFragmentKey2[]{SIDE_BY_SIDE, SIMULATED_RETURN_PRE_TRADE};
    }

    public static EnumEntries<OptionChainOnboardingFragmentKey2> getEntries() {
        return $ENTRIES;
    }

    private OptionChainOnboardingFragmentKey2(String str, int i) {
    }

    static {
        OptionChainOnboardingFragmentKey2[] optionChainOnboardingFragmentKey2Arr$values = $values();
        $VALUES = optionChainOnboardingFragmentKey2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionChainOnboardingFragmentKey2Arr$values);
    }

    public static OptionChainOnboardingFragmentKey2 valueOf(String str) {
        return (OptionChainOnboardingFragmentKey2) Enum.valueOf(OptionChainOnboardingFragmentKey2.class, str);
    }

    public static OptionChainOnboardingFragmentKey2[] values() {
        return (OptionChainOnboardingFragmentKey2[]) $VALUES.clone();
    }
}
