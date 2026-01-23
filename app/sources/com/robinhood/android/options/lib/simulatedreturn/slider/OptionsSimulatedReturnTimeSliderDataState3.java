package com.robinhood.android.options.lib.simulatedreturn.slider;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsSimulatedReturnTimeSliderDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/FineIncrement;", "", "numOfSec", "", "<init>", "(Ljava/lang/String;II)V", "getNumOfSec", "()I", "FIVE_MIN", "ONE_HOUR", "THREE_HOUR", "ONE_DAY", "SEVEN_DAY", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.FineIncrement, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnTimeSliderDataState3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsSimulatedReturnTimeSliderDataState3[] $VALUES;
    private final int numOfSec;
    public static final OptionsSimulatedReturnTimeSliderDataState3 FIVE_MIN = new OptionsSimulatedReturnTimeSliderDataState3("FIVE_MIN", 0, 300);
    public static final OptionsSimulatedReturnTimeSliderDataState3 ONE_HOUR = new OptionsSimulatedReturnTimeSliderDataState3("ONE_HOUR", 1, OptionsSimulatedReturnTimeSliderDataState4.ONE_HOUR_IN_SEC);
    public static final OptionsSimulatedReturnTimeSliderDataState3 THREE_HOUR = new OptionsSimulatedReturnTimeSliderDataState3("THREE_HOUR", 2, OptionsSimulatedReturnTimeSliderDataState4.THREE_HOUR_IN_SEC);
    public static final OptionsSimulatedReturnTimeSliderDataState3 ONE_DAY = new OptionsSimulatedReturnTimeSliderDataState3("ONE_DAY", 3, OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC);
    public static final OptionsSimulatedReturnTimeSliderDataState3 SEVEN_DAY = new OptionsSimulatedReturnTimeSliderDataState3("SEVEN_DAY", 4, OptionsSimulatedReturnTimeSliderDataState4.SEVEN_DAY_IN_SEC);

    private static final /* synthetic */ OptionsSimulatedReturnTimeSliderDataState3[] $values() {
        return new OptionsSimulatedReturnTimeSliderDataState3[]{FIVE_MIN, ONE_HOUR, THREE_HOUR, ONE_DAY, SEVEN_DAY};
    }

    public static EnumEntries<OptionsSimulatedReturnTimeSliderDataState3> getEntries() {
        return $ENTRIES;
    }

    private OptionsSimulatedReturnTimeSliderDataState3(String str, int i, int i2) {
        this.numOfSec = i2;
    }

    public final int getNumOfSec() {
        return this.numOfSec;
    }

    static {
        OptionsSimulatedReturnTimeSliderDataState3[] optionsSimulatedReturnTimeSliderDataState3Arr$values = $values();
        $VALUES = optionsSimulatedReturnTimeSliderDataState3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsSimulatedReturnTimeSliderDataState3Arr$values);
    }

    public static OptionsSimulatedReturnTimeSliderDataState3 valueOf(String str) {
        return (OptionsSimulatedReturnTimeSliderDataState3) Enum.valueOf(OptionsSimulatedReturnTimeSliderDataState3.class, str);
    }

    public static OptionsSimulatedReturnTimeSliderDataState3[] values() {
        return (OptionsSimulatedReturnTimeSliderDataState3[]) $VALUES.clone();
    }
}
