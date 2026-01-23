package com.robinhood.android.optionschain.sbschain;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/TableHighlightPhase;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL_SBS", "HIGHLIGHT_BID", "HIGHLIGHT_ASK", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class TableHighlightPhase {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TableHighlightPhase[] $VALUES;
    public static final TableHighlightPhase NORMAL_SBS = new TableHighlightPhase("NORMAL_SBS", 0);
    public static final TableHighlightPhase HIGHLIGHT_BID = new TableHighlightPhase("HIGHLIGHT_BID", 1);
    public static final TableHighlightPhase HIGHLIGHT_ASK = new TableHighlightPhase("HIGHLIGHT_ASK", 2);

    private static final /* synthetic */ TableHighlightPhase[] $values() {
        return new TableHighlightPhase[]{NORMAL_SBS, HIGHLIGHT_BID, HIGHLIGHT_ASK};
    }

    public static EnumEntries<TableHighlightPhase> getEntries() {
        return $ENTRIES;
    }

    private TableHighlightPhase(String str, int i) {
    }

    static {
        TableHighlightPhase[] tableHighlightPhaseArr$values = $values();
        $VALUES = tableHighlightPhaseArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tableHighlightPhaseArr$values);
    }

    public static TableHighlightPhase valueOf(String str) {
        return (TableHighlightPhase) Enum.valueOf(TableHighlightPhase.class, str);
    }

    public static TableHighlightPhase[] values() {
        return (TableHighlightPhase[]) $VALUES.clone();
    }
}
