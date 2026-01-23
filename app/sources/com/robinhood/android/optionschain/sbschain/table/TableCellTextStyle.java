package com.robinhood.android.optionschain.sbschain.table;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionSideBySideChainTableViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/TableCellTextStyle;", "", "<init>", "(Ljava/lang/String;I)V", "HEADER", "METRIC", "STRIKE", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class TableCellTextStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TableCellTextStyle[] $VALUES;
    public static final TableCellTextStyle HEADER = new TableCellTextStyle("HEADER", 0);
    public static final TableCellTextStyle METRIC = new TableCellTextStyle("METRIC", 1);
    public static final TableCellTextStyle STRIKE = new TableCellTextStyle("STRIKE", 2);

    private static final /* synthetic */ TableCellTextStyle[] $values() {
        return new TableCellTextStyle[]{HEADER, METRIC, STRIKE};
    }

    public static EnumEntries<TableCellTextStyle> getEntries() {
        return $ENTRIES;
    }

    private TableCellTextStyle(String str, int i) {
    }

    static {
        TableCellTextStyle[] tableCellTextStyleArr$values = $values();
        $VALUES = tableCellTextStyleArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tableCellTextStyleArr$values);
    }

    public static TableCellTextStyle valueOf(String str) {
        return (TableCellTextStyle) Enum.valueOf(TableCellTextStyle.class, str);
    }

    public static TableCellTextStyle[] values() {
        return (TableCellTextStyle[]) $VALUES.clone();
    }
}
