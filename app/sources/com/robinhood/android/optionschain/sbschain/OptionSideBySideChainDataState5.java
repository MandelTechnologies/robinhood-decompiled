package com.robinhood.android.optionschain.sbschain;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionSideBySideChainDataState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/SbsFooterEducationAnimationState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_PLAYING", "PLAYING", "FINISHED_PLAYING", "DISMISSED", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.SbsFooterEducationAnimationState, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainDataState5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionSideBySideChainDataState5[] $VALUES;
    public static final OptionSideBySideChainDataState5 NOT_PLAYING = new OptionSideBySideChainDataState5("NOT_PLAYING", 0);
    public static final OptionSideBySideChainDataState5 PLAYING = new OptionSideBySideChainDataState5("PLAYING", 1);
    public static final OptionSideBySideChainDataState5 FINISHED_PLAYING = new OptionSideBySideChainDataState5("FINISHED_PLAYING", 2);
    public static final OptionSideBySideChainDataState5 DISMISSED = new OptionSideBySideChainDataState5("DISMISSED", 3);

    private static final /* synthetic */ OptionSideBySideChainDataState5[] $values() {
        return new OptionSideBySideChainDataState5[]{NOT_PLAYING, PLAYING, FINISHED_PLAYING, DISMISSED};
    }

    public static EnumEntries<OptionSideBySideChainDataState5> getEntries() {
        return $ENTRIES;
    }

    private OptionSideBySideChainDataState5(String str, int i) {
    }

    static {
        OptionSideBySideChainDataState5[] optionSideBySideChainDataState5Arr$values = $values();
        $VALUES = optionSideBySideChainDataState5Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionSideBySideChainDataState5Arr$values);
    }

    public static OptionSideBySideChainDataState5 valueOf(String str) {
        return (OptionSideBySideChainDataState5) Enum.valueOf(OptionSideBySideChainDataState5.class, str);
    }

    public static OptionSideBySideChainDataState5[] values() {
        return (OptionSideBySideChainDataState5[]) $VALUES.clone();
    }
}
