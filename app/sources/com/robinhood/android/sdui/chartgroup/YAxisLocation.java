package com.robinhood.android.sdui.chartgroup;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SduiAdvancedChart.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/sdui/chartgroup/YAxisLocation;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "lib-sdui-charts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class YAxisLocation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ YAxisLocation[] $VALUES;
    public static final YAxisLocation START = new YAxisLocation("START", 0);
    public static final YAxisLocation END = new YAxisLocation("END", 1);

    private static final /* synthetic */ YAxisLocation[] $values() {
        return new YAxisLocation[]{START, END};
    }

    public static EnumEntries<YAxisLocation> getEntries() {
        return $ENTRIES;
    }

    private YAxisLocation(String str, int i) {
    }

    static {
        YAxisLocation[] yAxisLocationArr$values = $values();
        $VALUES = yAxisLocationArr$values;
        $ENTRIES = EnumEntries2.enumEntries(yAxisLocationArr$values);
    }

    public static YAxisLocation valueOf(String str) {
        return (YAxisLocation) Enum.valueOf(YAxisLocation.class, str);
    }

    public static YAxisLocation[] values() {
        return (YAxisLocation[]) $VALUES.clone();
    }
}
