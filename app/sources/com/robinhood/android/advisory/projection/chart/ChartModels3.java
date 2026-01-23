package com.robinhood.android.advisory.projection.chart;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChartModels.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/chart/ChartTopLabel;", "", "<init>", "(Ljava/lang/String;I)V", "AGE", "YEAR", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.projection.chart.ChartTopLabel, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartModels3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChartModels3[] $VALUES;
    public static final ChartModels3 AGE = new ChartModels3("AGE", 0);
    public static final ChartModels3 YEAR = new ChartModels3("YEAR", 1);

    private static final /* synthetic */ ChartModels3[] $values() {
        return new ChartModels3[]{AGE, YEAR};
    }

    public static EnumEntries<ChartModels3> getEntries() {
        return $ENTRIES;
    }

    private ChartModels3(String str, int i) {
    }

    static {
        ChartModels3[] chartModels3Arr$values = $values();
        $VALUES = chartModels3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(chartModels3Arr$values);
    }

    public static ChartModels3 valueOf(String str) {
        return (ChartModels3) Enum.valueOf(ChartModels3.class, str);
    }

    public static ChartModels3[] values() {
        return (ChartModels3[]) $VALUES.clone();
    }
}
