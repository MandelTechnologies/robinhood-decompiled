package com.robinhood.android.charts.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Axis.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/charts/model/AxisType;", "", "<init>", "(Ljava/lang/String;I)V", "X", "Y", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AxisType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AxisType[] $VALUES;

    /* renamed from: X */
    public static final AxisType f3953X = new AxisType("X", 0);

    /* renamed from: Y */
    public static final AxisType f3954Y = new AxisType("Y", 1);

    private static final /* synthetic */ AxisType[] $values() {
        return new AxisType[]{f3953X, f3954Y};
    }

    public static EnumEntries<AxisType> getEntries() {
        return $ENTRIES;
    }

    private AxisType(String str, int i) {
    }

    static {
        AxisType[] axisTypeArr$values = $values();
        $VALUES = axisTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(axisTypeArr$values);
    }

    public static AxisType valueOf(String str) {
        return (AxisType) Enum.valueOf(AxisType.class, str);
    }

    public static AxisType[] values() {
        return (AxisType[]) $VALUES.clone();
    }
}
