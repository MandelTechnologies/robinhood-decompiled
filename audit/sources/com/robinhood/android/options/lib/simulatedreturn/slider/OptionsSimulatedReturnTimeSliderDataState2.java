package com.robinhood.android.options.lib.simulatedreturn.slider;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsSimulatedReturnTimeSliderDataState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/CoarseIncrement;", "", "<init>", "(Ljava/lang/String;I)V", "ONE_HOUR", "TWELVE_HOUR", "ONE_DAY", "SEVEN_DAY", "EIGHTY_FOUR_DAY", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.CoarseIncrement, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnTimeSliderDataState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsSimulatedReturnTimeSliderDataState2[] $VALUES;
    public static final OptionsSimulatedReturnTimeSliderDataState2 ONE_HOUR = new OptionsSimulatedReturnTimeSliderDataState2("ONE_HOUR", 0);
    public static final OptionsSimulatedReturnTimeSliderDataState2 TWELVE_HOUR = new OptionsSimulatedReturnTimeSliderDataState2("TWELVE_HOUR", 1);
    public static final OptionsSimulatedReturnTimeSliderDataState2 ONE_DAY = new OptionsSimulatedReturnTimeSliderDataState2("ONE_DAY", 2);
    public static final OptionsSimulatedReturnTimeSliderDataState2 SEVEN_DAY = new OptionsSimulatedReturnTimeSliderDataState2("SEVEN_DAY", 3);
    public static final OptionsSimulatedReturnTimeSliderDataState2 EIGHTY_FOUR_DAY = new OptionsSimulatedReturnTimeSliderDataState2("EIGHTY_FOUR_DAY", 4);

    private static final /* synthetic */ OptionsSimulatedReturnTimeSliderDataState2[] $values() {
        return new OptionsSimulatedReturnTimeSliderDataState2[]{ONE_HOUR, TWELVE_HOUR, ONE_DAY, SEVEN_DAY, EIGHTY_FOUR_DAY};
    }

    public static EnumEntries<OptionsSimulatedReturnTimeSliderDataState2> getEntries() {
        return $ENTRIES;
    }

    private OptionsSimulatedReturnTimeSliderDataState2(String str, int i) {
    }

    static {
        OptionsSimulatedReturnTimeSliderDataState2[] optionsSimulatedReturnTimeSliderDataState2Arr$values = $values();
        $VALUES = optionsSimulatedReturnTimeSliderDataState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsSimulatedReturnTimeSliderDataState2Arr$values);
    }

    public static OptionsSimulatedReturnTimeSliderDataState2 valueOf(String str) {
        return (OptionsSimulatedReturnTimeSliderDataState2) Enum.valueOf(OptionsSimulatedReturnTimeSliderDataState2.class, str);
    }

    public static OptionsSimulatedReturnTimeSliderDataState2[] values() {
        return (OptionsSimulatedReturnTimeSliderDataState2[]) $VALUES.clone();
    }
}
