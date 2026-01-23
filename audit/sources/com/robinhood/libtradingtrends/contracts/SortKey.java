package com.robinhood.libtradingtrends.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TradingTrendsTable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/SortKey;", "", "(Ljava/lang/String;I)V", "NAME", "ACTIVITY", "DESCRIPTION", "SHARES", "TOTAL_SHARES", "MARKET_VALUE", "DATE", "PERCENT_CHANGE", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SortKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SortKey[] $VALUES;
    public static final SortKey NAME = new SortKey("NAME", 0);
    public static final SortKey ACTIVITY = new SortKey("ACTIVITY", 1);
    public static final SortKey DESCRIPTION = new SortKey("DESCRIPTION", 2);
    public static final SortKey SHARES = new SortKey("SHARES", 3);
    public static final SortKey TOTAL_SHARES = new SortKey("TOTAL_SHARES", 4);
    public static final SortKey MARKET_VALUE = new SortKey("MARKET_VALUE", 5);
    public static final SortKey DATE = new SortKey("DATE", 6);
    public static final SortKey PERCENT_CHANGE = new SortKey("PERCENT_CHANGE", 7);

    private static final /* synthetic */ SortKey[] $values() {
        return new SortKey[]{NAME, ACTIVITY, DESCRIPTION, SHARES, TOTAL_SHARES, MARKET_VALUE, DATE, PERCENT_CHANGE};
    }

    public static EnumEntries<SortKey> getEntries() {
        return $ENTRIES;
    }

    public static SortKey valueOf(String str) {
        return (SortKey) Enum.valueOf(SortKey.class, str);
    }

    public static SortKey[] values() {
        return (SortKey[]) $VALUES.clone();
    }

    private SortKey(String str, int i) {
    }

    static {
        SortKey[] sortKeyArr$values = $values();
        $VALUES = sortKeyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sortKeyArr$values);
    }
}
