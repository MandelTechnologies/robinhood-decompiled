package com.robinhood.android.sdui.chartgroup;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvancedChartGroupState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/sdui/chartgroup/ChartBottomDividerType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "CONSTRAINED", "NONE", "lib-sdui-charts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.sdui.chartgroup.ChartBottomDividerType, reason: use source file name */
/* loaded from: classes5.dex */
public final class AdvancedChartGroupState5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdvancedChartGroupState5[] $VALUES;
    public static final AdvancedChartGroupState5 DEFAULT = new AdvancedChartGroupState5("DEFAULT", 0);
    public static final AdvancedChartGroupState5 CONSTRAINED = new AdvancedChartGroupState5("CONSTRAINED", 1);
    public static final AdvancedChartGroupState5 NONE = new AdvancedChartGroupState5("NONE", 2);

    private static final /* synthetic */ AdvancedChartGroupState5[] $values() {
        return new AdvancedChartGroupState5[]{DEFAULT, CONSTRAINED, NONE};
    }

    public static EnumEntries<AdvancedChartGroupState5> getEntries() {
        return $ENTRIES;
    }

    private AdvancedChartGroupState5(String str, int i) {
    }

    static {
        AdvancedChartGroupState5[] advancedChartGroupState5Arr$values = $values();
        $VALUES = advancedChartGroupState5Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(advancedChartGroupState5Arr$values);
    }

    public static AdvancedChartGroupState5 valueOf(String str) {
        return (AdvancedChartGroupState5) Enum.valueOf(AdvancedChartGroupState5.class, str);
    }

    public static AdvancedChartGroupState5[] values() {
        return (AdvancedChartGroupState5[]) $VALUES.clone();
    }
}
