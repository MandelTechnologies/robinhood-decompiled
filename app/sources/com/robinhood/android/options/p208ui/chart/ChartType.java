package com.robinhood.android.options.p208ui.chart;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionHistoricalChart.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/ui/chart/ChartType;", "", "<init>", "(Ljava/lang/String;I)V", "EMPTY", "LINE", "CANDLESTICK", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ChartType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChartType[] $VALUES;
    public static final ChartType EMPTY = new ChartType("EMPTY", 0);
    public static final ChartType LINE = new ChartType("LINE", 1);
    public static final ChartType CANDLESTICK = new ChartType("CANDLESTICK", 2);

    private static final /* synthetic */ ChartType[] $values() {
        return new ChartType[]{EMPTY, LINE, CANDLESTICK};
    }

    public static EnumEntries<ChartType> getEntries() {
        return $ENTRIES;
    }

    private ChartType(String str, int i) {
    }

    static {
        ChartType[] chartTypeArr$values = $values();
        $VALUES = chartTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(chartTypeArr$values);
    }

    public static ChartType valueOf(String str) {
        return (ChartType) Enum.valueOf(ChartType.class, str);
    }

    public static ChartType[] values() {
        return (ChartType[]) $VALUES.clone();
    }
}
