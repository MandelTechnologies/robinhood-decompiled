package com.robinhood.android.home.contracts;

import com.robinhood.android.educationtour.EducationTourElementIds;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WatchListIntentKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/home/contracts/WatchlistScreen;", "", "<init>", "(Ljava/lang/String;I)V", "HISTORY", "ORDERS", "OPTION_EVENTS", "DIVIDENDS", "ADR_FEES", "TRANSFERS", "GIFTS", "BANKING", "TAX_DOCUMENTS", "AUTOMATIC_DEPOSITS", "HELP", EducationTourElementIds.ADD_TO_WATCHLIST_ELEMENT_ID, "SEARCH", "LICENSES", "NOT_APPLICABLE", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.home.contracts.WatchlistScreen, reason: use source file name */
/* loaded from: classes10.dex */
public final class WatchListIntentKey2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WatchListIntentKey2[] $VALUES;
    public static final WatchListIntentKey2 HISTORY = new WatchListIntentKey2("HISTORY", 0);
    public static final WatchListIntentKey2 ORDERS = new WatchListIntentKey2("ORDERS", 1);
    public static final WatchListIntentKey2 OPTION_EVENTS = new WatchListIntentKey2("OPTION_EVENTS", 2);
    public static final WatchListIntentKey2 DIVIDENDS = new WatchListIntentKey2("DIVIDENDS", 3);
    public static final WatchListIntentKey2 ADR_FEES = new WatchListIntentKey2("ADR_FEES", 4);
    public static final WatchListIntentKey2 TRANSFERS = new WatchListIntentKey2("TRANSFERS", 5);
    public static final WatchListIntentKey2 GIFTS = new WatchListIntentKey2("GIFTS", 6);
    public static final WatchListIntentKey2 BANKING = new WatchListIntentKey2("BANKING", 7);
    public static final WatchListIntentKey2 TAX_DOCUMENTS = new WatchListIntentKey2("TAX_DOCUMENTS", 8);
    public static final WatchListIntentKey2 AUTOMATIC_DEPOSITS = new WatchListIntentKey2("AUTOMATIC_DEPOSITS", 9);
    public static final WatchListIntentKey2 HELP = new WatchListIntentKey2("HELP", 10);
    public static final WatchListIntentKey2 WATCHLIST = new WatchListIntentKey2(EducationTourElementIds.ADD_TO_WATCHLIST_ELEMENT_ID, 11);
    public static final WatchListIntentKey2 SEARCH = new WatchListIntentKey2("SEARCH", 12);
    public static final WatchListIntentKey2 LICENSES = new WatchListIntentKey2("LICENSES", 13);
    public static final WatchListIntentKey2 NOT_APPLICABLE = new WatchListIntentKey2("NOT_APPLICABLE", 14);

    private static final /* synthetic */ WatchListIntentKey2[] $values() {
        return new WatchListIntentKey2[]{HISTORY, ORDERS, OPTION_EVENTS, DIVIDENDS, ADR_FEES, TRANSFERS, GIFTS, BANKING, TAX_DOCUMENTS, AUTOMATIC_DEPOSITS, HELP, WATCHLIST, SEARCH, LICENSES, NOT_APPLICABLE};
    }

    public static EnumEntries<WatchListIntentKey2> getEntries() {
        return $ENTRIES;
    }

    private WatchListIntentKey2(String str, int i) {
    }

    static {
        WatchListIntentKey2[] watchListIntentKey2Arr$values = $values();
        $VALUES = watchListIntentKey2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(watchListIntentKey2Arr$values);
    }

    public static WatchListIntentKey2 valueOf(String str) {
        return (WatchListIntentKey2) Enum.valueOf(WatchListIntentKey2.class, str);
    }

    public static WatchListIntentKey2[] values() {
        return (WatchListIntentKey2[]) $VALUES.clone();
    }
}
