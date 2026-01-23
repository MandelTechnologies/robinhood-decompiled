package com.robinhood.android.portfolio.curatedlist.createScreenerOrList;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreateScreenerOrWatchListRow.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/curatedlist/createScreenerOrList/BottomSheetState;", "", "<init>", "(Ljava/lang/String;I)V", "HIDDEN", "CREATE", "CREATE_WATCHLIST", "CREATE_SCREENER", "lib-curated-list_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.BottomSheetState, reason: use source file name */
/* loaded from: classes11.dex */
final class CreateScreenerOrWatchListRow {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CreateScreenerOrWatchListRow[] $VALUES;
    public static final CreateScreenerOrWatchListRow HIDDEN = new CreateScreenerOrWatchListRow("HIDDEN", 0);
    public static final CreateScreenerOrWatchListRow CREATE = new CreateScreenerOrWatchListRow("CREATE", 1);
    public static final CreateScreenerOrWatchListRow CREATE_WATCHLIST = new CreateScreenerOrWatchListRow("CREATE_WATCHLIST", 2);
    public static final CreateScreenerOrWatchListRow CREATE_SCREENER = new CreateScreenerOrWatchListRow("CREATE_SCREENER", 3);

    private static final /* synthetic */ CreateScreenerOrWatchListRow[] $values() {
        return new CreateScreenerOrWatchListRow[]{HIDDEN, CREATE, CREATE_WATCHLIST, CREATE_SCREENER};
    }

    public static EnumEntries<CreateScreenerOrWatchListRow> getEntries() {
        return $ENTRIES;
    }

    private CreateScreenerOrWatchListRow(String str, int i) {
    }

    static {
        CreateScreenerOrWatchListRow[] createScreenerOrWatchListRowArr$values = $values();
        $VALUES = createScreenerOrWatchListRowArr$values;
        $ENTRIES = EnumEntries2.enumEntries(createScreenerOrWatchListRowArr$values);
    }

    public static CreateScreenerOrWatchListRow valueOf(String str) {
        return (CreateScreenerOrWatchListRow) Enum.valueOf(CreateScreenerOrWatchListRow.class, str);
    }

    public static CreateScreenerOrWatchListRow[] values() {
        return (CreateScreenerOrWatchListRow[]) $VALUES.clone();
    }
}
