package com.robinhood.android.futures.detail.p140ui.chart;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FuturesDetailChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/chart/ChartViewMode;", "", "<init>", "(Ljava/lang/String;I)V", "LEGACY", "CONTRACT_ONLY", "PRODUCT_ONLY", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.detail.ui.chart.ChartViewMode, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesDetailChartDuxo4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FuturesDetailChartDuxo4[] $VALUES;
    public static final FuturesDetailChartDuxo4 LEGACY = new FuturesDetailChartDuxo4("LEGACY", 0);
    public static final FuturesDetailChartDuxo4 CONTRACT_ONLY = new FuturesDetailChartDuxo4("CONTRACT_ONLY", 1);
    public static final FuturesDetailChartDuxo4 PRODUCT_ONLY = new FuturesDetailChartDuxo4("PRODUCT_ONLY", 2);

    private static final /* synthetic */ FuturesDetailChartDuxo4[] $values() {
        return new FuturesDetailChartDuxo4[]{LEGACY, CONTRACT_ONLY, PRODUCT_ONLY};
    }

    public static EnumEntries<FuturesDetailChartDuxo4> getEntries() {
        return $ENTRIES;
    }

    private FuturesDetailChartDuxo4(String str, int i) {
    }

    static {
        FuturesDetailChartDuxo4[] futuresDetailChartDuxo4Arr$values = $values();
        $VALUES = futuresDetailChartDuxo4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(futuresDetailChartDuxo4Arr$values);
    }

    public static FuturesDetailChartDuxo4 valueOf(String str) {
        return (FuturesDetailChartDuxo4) Enum.valueOf(FuturesDetailChartDuxo4.class, str);
    }

    public static FuturesDetailChartDuxo4[] values() {
        return (FuturesDetailChartDuxo4[]) $VALUES.clone();
    }
}
