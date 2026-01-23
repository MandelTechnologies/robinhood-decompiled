package com.robinhood.android.chart.blackwidowadvancedchart.composables;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionRow.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/SelectionRowStyle;", "", "<init>", "(Ljava/lang/String;I)V", "RADIO", "CHECK", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionRowStyle, reason: use source file name */
/* loaded from: classes7.dex */
public final class SelectionRow6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SelectionRow6[] $VALUES;
    public static final SelectionRow6 RADIO = new SelectionRow6("RADIO", 0);
    public static final SelectionRow6 CHECK = new SelectionRow6("CHECK", 1);

    private static final /* synthetic */ SelectionRow6[] $values() {
        return new SelectionRow6[]{RADIO, CHECK};
    }

    public static EnumEntries<SelectionRow6> getEntries() {
        return $ENTRIES;
    }

    private SelectionRow6(String str, int i) {
    }

    static {
        SelectionRow6[] selectionRow6Arr$values = $values();
        $VALUES = selectionRow6Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(selectionRow6Arr$values);
    }

    public static SelectionRow6 valueOf(String str) {
        return (SelectionRow6) Enum.valueOf(SelectionRow6.class, str);
    }

    public static SelectionRow6[] values() {
        return (SelectionRow6[]) $VALUES.clone();
    }
}
