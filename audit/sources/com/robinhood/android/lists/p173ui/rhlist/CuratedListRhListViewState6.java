package com.robinhood.android.lists.p173ui.rhlist;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CuratedListRhListViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/IpoAccessFilter;", "", "<init>", "(Ljava/lang/String;I)V", "IN_FLIGHT", "LAUNCHED", "LEARN", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.ui.rhlist.IpoAccessFilter, reason: use source file name */
/* loaded from: classes8.dex */
public final class CuratedListRhListViewState6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CuratedListRhListViewState6[] $VALUES;
    public static final CuratedListRhListViewState6 IN_FLIGHT = new CuratedListRhListViewState6("IN_FLIGHT", 0);
    public static final CuratedListRhListViewState6 LAUNCHED = new CuratedListRhListViewState6("LAUNCHED", 1);
    public static final CuratedListRhListViewState6 LEARN = new CuratedListRhListViewState6("LEARN", 2);

    private static final /* synthetic */ CuratedListRhListViewState6[] $values() {
        return new CuratedListRhListViewState6[]{IN_FLIGHT, LAUNCHED, LEARN};
    }

    public static EnumEntries<CuratedListRhListViewState6> getEntries() {
        return $ENTRIES;
    }

    private CuratedListRhListViewState6(String str, int i) {
    }

    static {
        CuratedListRhListViewState6[] curatedListRhListViewState6Arr$values = $values();
        $VALUES = curatedListRhListViewState6Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(curatedListRhListViewState6Arr$values);
    }

    public static CuratedListRhListViewState6 valueOf(String str) {
        return (CuratedListRhListViewState6) Enum.valueOf(CuratedListRhListViewState6.class, str);
    }

    public static CuratedListRhListViewState6[] values() {
        return (CuratedListRhListViewState6[]) $VALUES.clone();
    }
}
