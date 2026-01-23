package com.robinhood.android.options.lib.simulatedreturn.slider;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsSimulatedReturnSliderViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/QuotePillAnchor;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.QuotePillAnchor, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnSliderViewState3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsSimulatedReturnSliderViewState3[] $VALUES;
    public static final OptionsSimulatedReturnSliderViewState3 START = new OptionsSimulatedReturnSliderViewState3("START", 0);
    public static final OptionsSimulatedReturnSliderViewState3 END = new OptionsSimulatedReturnSliderViewState3("END", 1);

    private static final /* synthetic */ OptionsSimulatedReturnSliderViewState3[] $values() {
        return new OptionsSimulatedReturnSliderViewState3[]{START, END};
    }

    public static EnumEntries<OptionsSimulatedReturnSliderViewState3> getEntries() {
        return $ENTRIES;
    }

    private OptionsSimulatedReturnSliderViewState3(String str, int i) {
    }

    static {
        OptionsSimulatedReturnSliderViewState3[] optionsSimulatedReturnSliderViewState3Arr$values = $values();
        $VALUES = optionsSimulatedReturnSliderViewState3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsSimulatedReturnSliderViewState3Arr$values);
    }

    public static OptionsSimulatedReturnSliderViewState3 valueOf(String str) {
        return (OptionsSimulatedReturnSliderViewState3) Enum.valueOf(OptionsSimulatedReturnSliderViewState3.class, str);
    }

    public static OptionsSimulatedReturnSliderViewState3[] values() {
        return (OptionsSimulatedReturnSliderViewState3[]) $VALUES.clone();
    }
}
