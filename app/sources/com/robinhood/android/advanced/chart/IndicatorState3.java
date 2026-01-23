package com.robinhood.android.advanced.chart;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IndicatorState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advanced/chart/IndicatorIconType;", "", "<init>", "(Ljava/lang/String;I)V", "INFO", "SETTINGS", "feature-lib-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advanced.chart.IndicatorIconType, reason: use source file name */
/* loaded from: classes24.dex */
public final class IndicatorState3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IndicatorState3[] $VALUES;
    public static final IndicatorState3 INFO = new IndicatorState3("INFO", 0);
    public static final IndicatorState3 SETTINGS = new IndicatorState3("SETTINGS", 1);

    private static final /* synthetic */ IndicatorState3[] $values() {
        return new IndicatorState3[]{INFO, SETTINGS};
    }

    public static EnumEntries<IndicatorState3> getEntries() {
        return $ENTRIES;
    }

    private IndicatorState3(String str, int i) {
    }

    static {
        IndicatorState3[] indicatorState3Arr$values = $values();
        $VALUES = indicatorState3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(indicatorState3Arr$values);
    }

    public static IndicatorState3 valueOf(String str) {
        return (IndicatorState3) Enum.valueOf(IndicatorState3.class, str);
    }

    public static IndicatorState3[] values() {
        return (IndicatorState3[]) $VALUES.clone();
    }
}
