package com.robinhood.android.options.lib.simulatedreturn.chart;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsSimulatedReturnChartAxis.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisAxisType;", "", "<init>", "(Ljava/lang/String;I)V", "X", "Y", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartAxisAxisType, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnChartAxis {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsSimulatedReturnChartAxis[] $VALUES;

    /* renamed from: X */
    public static final OptionsSimulatedReturnChartAxis f4730X = new OptionsSimulatedReturnChartAxis("X", 0);

    /* renamed from: Y */
    public static final OptionsSimulatedReturnChartAxis f4731Y = new OptionsSimulatedReturnChartAxis("Y", 1);

    private static final /* synthetic */ OptionsSimulatedReturnChartAxis[] $values() {
        return new OptionsSimulatedReturnChartAxis[]{f4730X, f4731Y};
    }

    public static EnumEntries<OptionsSimulatedReturnChartAxis> getEntries() {
        return $ENTRIES;
    }

    private OptionsSimulatedReturnChartAxis(String str, int i) {
    }

    static {
        OptionsSimulatedReturnChartAxis[] optionsSimulatedReturnChartAxisArr$values = $values();
        $VALUES = optionsSimulatedReturnChartAxisArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsSimulatedReturnChartAxisArr$values);
    }

    public static OptionsSimulatedReturnChartAxis valueOf(String str) {
        return (OptionsSimulatedReturnChartAxis) Enum.valueOf(OptionsSimulatedReturnChartAxis.class, str);
    }

    public static OptionsSimulatedReturnChartAxis[] values() {
        return (OptionsSimulatedReturnChartAxis[]) $VALUES.clone();
    }
}
