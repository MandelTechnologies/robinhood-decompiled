package com.robinhood.android.cash.rhy.tab.p077v2;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CashTabSectionKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/CashTabSectionKey;", "", "<init>", "(Ljava/lang/String;I)V", "Header", "CarouselOrNux", "ActionBar", "HistoryTitle", "MatchaPendingTransactions", "HistoryShowMore", "HistoryEmpty", "Offers", "PaycheckModule", "AtmFinder", "AccountSection", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CashTabSectionKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CashTabSectionKey[] $VALUES;
    public static final CashTabSectionKey Header = new CashTabSectionKey("Header", 0);
    public static final CashTabSectionKey CarouselOrNux = new CashTabSectionKey("CarouselOrNux", 1);
    public static final CashTabSectionKey ActionBar = new CashTabSectionKey("ActionBar", 2);
    public static final CashTabSectionKey HistoryTitle = new CashTabSectionKey("HistoryTitle", 3);
    public static final CashTabSectionKey MatchaPendingTransactions = new CashTabSectionKey("MatchaPendingTransactions", 4);
    public static final CashTabSectionKey HistoryShowMore = new CashTabSectionKey("HistoryShowMore", 5);
    public static final CashTabSectionKey HistoryEmpty = new CashTabSectionKey("HistoryEmpty", 6);
    public static final CashTabSectionKey Offers = new CashTabSectionKey("Offers", 7);
    public static final CashTabSectionKey PaycheckModule = new CashTabSectionKey("PaycheckModule", 8);
    public static final CashTabSectionKey AtmFinder = new CashTabSectionKey("AtmFinder", 9);
    public static final CashTabSectionKey AccountSection = new CashTabSectionKey("AccountSection", 10);

    private static final /* synthetic */ CashTabSectionKey[] $values() {
        return new CashTabSectionKey[]{Header, CarouselOrNux, ActionBar, HistoryTitle, MatchaPendingTransactions, HistoryShowMore, HistoryEmpty, Offers, PaycheckModule, AtmFinder, AccountSection};
    }

    public static EnumEntries<CashTabSectionKey> getEntries() {
        return $ENTRIES;
    }

    private CashTabSectionKey(String str, int i) {
    }

    static {
        CashTabSectionKey[] cashTabSectionKeyArr$values = $values();
        $VALUES = cashTabSectionKeyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cashTabSectionKeyArr$values);
    }

    public static CashTabSectionKey valueOf(String str) {
        return (CashTabSectionKey) Enum.valueOf(CashTabSectionKey.class, str);
    }

    public static CashTabSectionKey[] values() {
        return (CashTabSectionKey[]) $VALUES.clone();
    }
}
