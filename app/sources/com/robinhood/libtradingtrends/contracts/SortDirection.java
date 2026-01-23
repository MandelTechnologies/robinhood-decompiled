package com.robinhood.libtradingtrends.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TradingTrendsTable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/SortDirection;", "", "(Ljava/lang/String;I)V", "ASC", "DESC", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SortDirection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SortDirection[] $VALUES;
    public static final SortDirection ASC = new SortDirection("ASC", 0);
    public static final SortDirection DESC = new SortDirection("DESC", 1);

    private static final /* synthetic */ SortDirection[] $values() {
        return new SortDirection[]{ASC, DESC};
    }

    public static EnumEntries<SortDirection> getEntries() {
        return $ENTRIES;
    }

    public static SortDirection valueOf(String str) {
        return (SortDirection) Enum.valueOf(SortDirection.class, str);
    }

    public static SortDirection[] values() {
        return (SortDirection[]) $VALUES.clone();
    }

    private SortDirection(String str, int i) {
    }

    static {
        SortDirection[] sortDirectionArr$values = $values();
        $VALUES = sortDirectionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sortDirectionArr$values);
    }
}
