package com.robinhood.android.options.lib.simulatedreturn.slider;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DimensionSubcomposeLayout.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/SlotsEnum;", "", "<init>", "(Ljava/lang/String;I)V", "MEASURE", "ACTUAL", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.SlotsEnum, reason: use source file name */
/* loaded from: classes11.dex */
final class DimensionSubcomposeLayout3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DimensionSubcomposeLayout3[] $VALUES;
    public static final DimensionSubcomposeLayout3 MEASURE = new DimensionSubcomposeLayout3("MEASURE", 0);
    public static final DimensionSubcomposeLayout3 ACTUAL = new DimensionSubcomposeLayout3("ACTUAL", 1);

    private static final /* synthetic */ DimensionSubcomposeLayout3[] $values() {
        return new DimensionSubcomposeLayout3[]{MEASURE, ACTUAL};
    }

    public static EnumEntries<DimensionSubcomposeLayout3> getEntries() {
        return $ENTRIES;
    }

    private DimensionSubcomposeLayout3(String str, int i) {
    }

    static {
        DimensionSubcomposeLayout3[] dimensionSubcomposeLayout3Arr$values = $values();
        $VALUES = dimensionSubcomposeLayout3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(dimensionSubcomposeLayout3Arr$values);
    }

    public static DimensionSubcomposeLayout3 valueOf(String str) {
        return (DimensionSubcomposeLayout3) Enum.valueOf(DimensionSubcomposeLayout3.class, str);
    }

    public static DimensionSubcomposeLayout3[] values() {
        return (DimensionSubcomposeLayout3[]) $VALUES.clone();
    }
}
