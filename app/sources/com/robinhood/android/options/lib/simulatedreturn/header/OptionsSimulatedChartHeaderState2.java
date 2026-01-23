package com.robinhood.android.options.lib.simulatedreturn.header;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsSimulatedChartHeaderState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/header/TickerDirection;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.header.TickerDirection, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedChartHeaderState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsSimulatedChartHeaderState2[] $VALUES;

    /* renamed from: UP */
    public static final OptionsSimulatedChartHeaderState2 f4734UP = new OptionsSimulatedChartHeaderState2("UP", 0);
    public static final OptionsSimulatedChartHeaderState2 DOWN = new OptionsSimulatedChartHeaderState2("DOWN", 1);

    private static final /* synthetic */ OptionsSimulatedChartHeaderState2[] $values() {
        return new OptionsSimulatedChartHeaderState2[]{f4734UP, DOWN};
    }

    public static EnumEntries<OptionsSimulatedChartHeaderState2> getEntries() {
        return $ENTRIES;
    }

    private OptionsSimulatedChartHeaderState2(String str, int i) {
    }

    static {
        OptionsSimulatedChartHeaderState2[] optionsSimulatedChartHeaderState2Arr$values = $values();
        $VALUES = optionsSimulatedChartHeaderState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsSimulatedChartHeaderState2Arr$values);
    }

    public static OptionsSimulatedChartHeaderState2 valueOf(String str) {
        return (OptionsSimulatedChartHeaderState2) Enum.valueOf(OptionsSimulatedChartHeaderState2.class, str);
    }

    public static OptionsSimulatedChartHeaderState2[] values() {
        return (OptionsSimulatedChartHeaderState2[]) $VALUES.clone();
    }
}
