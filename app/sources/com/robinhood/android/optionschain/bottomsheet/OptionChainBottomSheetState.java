package com.robinhood.android.optionschain.bottomsheet;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionChainBottomSheetComponent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetState;", "", "<init>", "(Ljava/lang/String;I)V", "READY", "ERROR", "CHART_ERROR", "NO_QUOTE", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionChainBottomSheetState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionChainBottomSheetState[] $VALUES;
    public static final OptionChainBottomSheetState READY = new OptionChainBottomSheetState("READY", 0);
    public static final OptionChainBottomSheetState ERROR = new OptionChainBottomSheetState("ERROR", 1);
    public static final OptionChainBottomSheetState CHART_ERROR = new OptionChainBottomSheetState("CHART_ERROR", 2);
    public static final OptionChainBottomSheetState NO_QUOTE = new OptionChainBottomSheetState("NO_QUOTE", 3);

    private static final /* synthetic */ OptionChainBottomSheetState[] $values() {
        return new OptionChainBottomSheetState[]{READY, ERROR, CHART_ERROR, NO_QUOTE};
    }

    public static EnumEntries<OptionChainBottomSheetState> getEntries() {
        return $ENTRIES;
    }

    private OptionChainBottomSheetState(String str, int i) {
    }

    static {
        OptionChainBottomSheetState[] optionChainBottomSheetStateArr$values = $values();
        $VALUES = optionChainBottomSheetStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionChainBottomSheetStateArr$values);
    }

    public static OptionChainBottomSheetState valueOf(String str) {
        return (OptionChainBottomSheetState) Enum.valueOf(OptionChainBottomSheetState.class, str);
    }

    public static OptionChainBottomSheetState[] values() {
        return (OptionChainBottomSheetState[]) $VALUES.clone();
    }
}
