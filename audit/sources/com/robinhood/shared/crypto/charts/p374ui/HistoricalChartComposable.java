package com.robinhood.shared.crypto.charts.p374ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HistoricalChartComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/charts/ui/ChartMode;", "", "<init>", "(Ljava/lang/String;I)V", "CANDLE_STICK", "LINE", "lib-charts-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.charts.ui.ChartMode, reason: use source file name */
/* loaded from: classes6.dex */
public final class HistoricalChartComposable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HistoricalChartComposable[] $VALUES;
    public static final HistoricalChartComposable CANDLE_STICK = new HistoricalChartComposable("CANDLE_STICK", 0);
    public static final HistoricalChartComposable LINE = new HistoricalChartComposable("LINE", 1);

    private static final /* synthetic */ HistoricalChartComposable[] $values() {
        return new HistoricalChartComposable[]{CANDLE_STICK, LINE};
    }

    public static EnumEntries<HistoricalChartComposable> getEntries() {
        return $ENTRIES;
    }

    private HistoricalChartComposable(String str, int i) {
    }

    static {
        HistoricalChartComposable[] historicalChartComposableArr$values = $values();
        $VALUES = historicalChartComposableArr$values;
        $ENTRIES = EnumEntries2.enumEntries(historicalChartComposableArr$values);
    }

    public static HistoricalChartComposable valueOf(String str) {
        return (HistoricalChartComposable) Enum.valueOf(HistoricalChartComposable.class, str);
    }

    public static HistoricalChartComposable[] values() {
        return (HistoricalChartComposable[]) $VALUES.clone();
    }
}
