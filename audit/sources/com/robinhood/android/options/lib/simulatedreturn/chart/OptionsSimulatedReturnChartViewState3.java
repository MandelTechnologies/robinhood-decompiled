package com.robinhood.android.options.lib.simulatedreturn.chart;

import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggings;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsSimulatedReturnChartViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartType;", "", "buttonIdentifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getButtonIdentifier", "()Ljava/lang/String;", "DOLLAR", "PERCENT", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartType, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnChartViewState3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsSimulatedReturnChartViewState3[] $VALUES;
    public static final OptionsSimulatedReturnChartViewState3 DOLLAR = new OptionsSimulatedReturnChartViewState3("DOLLAR", 0, OptionsSimulatedReturnLoggings.SIMULATED_RETURNS_SWITCH_TO_PERCENT_IDENTIFIER);
    public static final OptionsSimulatedReturnChartViewState3 PERCENT = new OptionsSimulatedReturnChartViewState3("PERCENT", 1, OptionsSimulatedReturnLoggings.SIMULATED_RETURNS_SWITCH_TO_DOLLAR_IDENTIFIER);
    private final String buttonIdentifier;

    private static final /* synthetic */ OptionsSimulatedReturnChartViewState3[] $values() {
        return new OptionsSimulatedReturnChartViewState3[]{DOLLAR, PERCENT};
    }

    public static EnumEntries<OptionsSimulatedReturnChartViewState3> getEntries() {
        return $ENTRIES;
    }

    private OptionsSimulatedReturnChartViewState3(String str, int i, String str2) {
        this.buttonIdentifier = str2;
    }

    public final String getButtonIdentifier() {
        return this.buttonIdentifier;
    }

    static {
        OptionsSimulatedReturnChartViewState3[] optionsSimulatedReturnChartViewState3Arr$values = $values();
        $VALUES = optionsSimulatedReturnChartViewState3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsSimulatedReturnChartViewState3Arr$values);
    }

    public static OptionsSimulatedReturnChartViewState3 valueOf(String str) {
        return (OptionsSimulatedReturnChartViewState3) Enum.valueOf(OptionsSimulatedReturnChartViewState3.class, str);
    }

    public static OptionsSimulatedReturnChartViewState3[] values() {
        return (OptionsSimulatedReturnChartViewState3[]) $VALUES.clone();
    }
}
