package com.robinhood.android.sdui.chartgroup;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvancedChartGroupState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/sdui/chartgroup/AdvancedChartPointerInputState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "PRESSING", "SCRUBBING", "ZOOMING", "lib-sdui-charts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.sdui.chartgroup.AdvancedChartPointerInputState, reason: use source file name */
/* loaded from: classes5.dex */
public final class AdvancedChartGroupState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdvancedChartGroupState2[] $VALUES;
    public static final AdvancedChartGroupState2 IDLE = new AdvancedChartGroupState2("IDLE", 0);
    public static final AdvancedChartGroupState2 PRESSING = new AdvancedChartGroupState2("PRESSING", 1);
    public static final AdvancedChartGroupState2 SCRUBBING = new AdvancedChartGroupState2("SCRUBBING", 2);
    public static final AdvancedChartGroupState2 ZOOMING = new AdvancedChartGroupState2("ZOOMING", 3);

    private static final /* synthetic */ AdvancedChartGroupState2[] $values() {
        return new AdvancedChartGroupState2[]{IDLE, PRESSING, SCRUBBING, ZOOMING};
    }

    public static EnumEntries<AdvancedChartGroupState2> getEntries() {
        return $ENTRIES;
    }

    private AdvancedChartGroupState2(String str, int i) {
    }

    static {
        AdvancedChartGroupState2[] advancedChartGroupState2Arr$values = $values();
        $VALUES = advancedChartGroupState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(advancedChartGroupState2Arr$values);
    }

    public static AdvancedChartGroupState2 valueOf(String str) {
        return (AdvancedChartGroupState2) Enum.valueOf(AdvancedChartGroupState2.class, str);
    }

    public static AdvancedChartGroupState2[] values() {
        return (AdvancedChartGroupState2[]) $VALUES.clone();
    }
}
