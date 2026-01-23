package com.robinhood.android.chart.sharedchartspan;

import com.robinhood.android.futures.charts.DisplaySpans;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UnifiedSpan.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/chart/sharedchartspan/UnifiedSpan;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "LIVE", "FOUR_HOUR", "DAY", "WEEK", "MONTH", "THREE_MONTH", DisplaySpans.YTD, "YEAR", "FIVE_YEAR", DisplaySpans.ALL, "lib-shared-chart-span_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class UnifiedSpan {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UnifiedSpan[] $VALUES;
    public static final UnifiedSpan UNKNOWN = new UnifiedSpan("UNKNOWN", 0);
    public static final UnifiedSpan LIVE = new UnifiedSpan("LIVE", 1);
    public static final UnifiedSpan FOUR_HOUR = new UnifiedSpan("FOUR_HOUR", 2);
    public static final UnifiedSpan DAY = new UnifiedSpan("DAY", 3);
    public static final UnifiedSpan WEEK = new UnifiedSpan("WEEK", 4);
    public static final UnifiedSpan MONTH = new UnifiedSpan("MONTH", 5);
    public static final UnifiedSpan THREE_MONTH = new UnifiedSpan("THREE_MONTH", 6);
    public static final UnifiedSpan YTD = new UnifiedSpan(DisplaySpans.YTD, 7);
    public static final UnifiedSpan YEAR = new UnifiedSpan("YEAR", 8);
    public static final UnifiedSpan FIVE_YEAR = new UnifiedSpan("FIVE_YEAR", 9);
    public static final UnifiedSpan ALL = new UnifiedSpan(DisplaySpans.ALL, 10);

    private static final /* synthetic */ UnifiedSpan[] $values() {
        return new UnifiedSpan[]{UNKNOWN, LIVE, FOUR_HOUR, DAY, WEEK, MONTH, THREE_MONTH, YTD, YEAR, FIVE_YEAR, ALL};
    }

    public static EnumEntries<UnifiedSpan> getEntries() {
        return $ENTRIES;
    }

    private UnifiedSpan(String str, int i) {
    }

    static {
        UnifiedSpan[] unifiedSpanArr$values = $values();
        $VALUES = unifiedSpanArr$values;
        $ENTRIES = EnumEntries2.enumEntries(unifiedSpanArr$values);
    }

    public static UnifiedSpan valueOf(String str) {
        return (UnifiedSpan) Enum.valueOf(UnifiedSpan.class, str);
    }

    public static UnifiedSpan[] values() {
        return (UnifiedSpan[]) $VALUES.clone();
    }
}
