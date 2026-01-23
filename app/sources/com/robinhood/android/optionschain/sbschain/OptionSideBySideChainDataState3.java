package com.robinhood.android.optionschain.sbschain;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionSideBySideChainDataState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/IdleTimerState;", "", "<init>", "(Ljava/lang/String;I)V", "LOAD_FINISHED", "USER_INTERACTION_IN_PROGRESS", "USER_INTERACTION_ENDED", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.IdleTimerState, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainDataState3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionSideBySideChainDataState3[] $VALUES;
    public static final OptionSideBySideChainDataState3 LOAD_FINISHED = new OptionSideBySideChainDataState3("LOAD_FINISHED", 0);
    public static final OptionSideBySideChainDataState3 USER_INTERACTION_IN_PROGRESS = new OptionSideBySideChainDataState3("USER_INTERACTION_IN_PROGRESS", 1);
    public static final OptionSideBySideChainDataState3 USER_INTERACTION_ENDED = new OptionSideBySideChainDataState3("USER_INTERACTION_ENDED", 2);

    private static final /* synthetic */ OptionSideBySideChainDataState3[] $values() {
        return new OptionSideBySideChainDataState3[]{LOAD_FINISHED, USER_INTERACTION_IN_PROGRESS, USER_INTERACTION_ENDED};
    }

    public static EnumEntries<OptionSideBySideChainDataState3> getEntries() {
        return $ENTRIES;
    }

    private OptionSideBySideChainDataState3(String str, int i) {
    }

    static {
        OptionSideBySideChainDataState3[] optionSideBySideChainDataState3Arr$values = $values();
        $VALUES = optionSideBySideChainDataState3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionSideBySideChainDataState3Arr$values);
    }

    public static OptionSideBySideChainDataState3 valueOf(String str) {
        return (OptionSideBySideChainDataState3) Enum.valueOf(OptionSideBySideChainDataState3.class, str);
    }

    public static OptionSideBySideChainDataState3[] values() {
        return (OptionSideBySideChainDataState3[]) $VALUES.clone();
    }
}
