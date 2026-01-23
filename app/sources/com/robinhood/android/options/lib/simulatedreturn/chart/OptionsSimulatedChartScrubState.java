package com.robinhood.android.options.lib.simulatedreturn.chart;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsSimulatedChartScrubState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "SCRUB_IN_PROGRESS", "SCRUB_PAUSED", "scrubbing", "", "getScrubbing", "()Z", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsSimulatedChartScrubState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsSimulatedChartScrubState[] $VALUES;
    public static final OptionsSimulatedChartScrubState IDLE = new OptionsSimulatedChartScrubState("IDLE", 0);
    public static final OptionsSimulatedChartScrubState SCRUB_IN_PROGRESS = new OptionsSimulatedChartScrubState("SCRUB_IN_PROGRESS", 1);
    public static final OptionsSimulatedChartScrubState SCRUB_PAUSED = new OptionsSimulatedChartScrubState("SCRUB_PAUSED", 2);

    private static final /* synthetic */ OptionsSimulatedChartScrubState[] $values() {
        return new OptionsSimulatedChartScrubState[]{IDLE, SCRUB_IN_PROGRESS, SCRUB_PAUSED};
    }

    public static EnumEntries<OptionsSimulatedChartScrubState> getEntries() {
        return $ENTRIES;
    }

    private OptionsSimulatedChartScrubState(String str, int i) {
    }

    static {
        OptionsSimulatedChartScrubState[] optionsSimulatedChartScrubStateArr$values = $values();
        $VALUES = optionsSimulatedChartScrubStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsSimulatedChartScrubStateArr$values);
    }

    public final boolean getScrubbing() {
        return this == SCRUB_IN_PROGRESS;
    }

    public static OptionsSimulatedChartScrubState valueOf(String str) {
        return (OptionsSimulatedChartScrubState) Enum.valueOf(OptionsSimulatedChartScrubState.class, str);
    }

    public static OptionsSimulatedChartScrubState[] values() {
        return (OptionsSimulatedChartScrubState[]) $VALUES.clone();
    }
}
