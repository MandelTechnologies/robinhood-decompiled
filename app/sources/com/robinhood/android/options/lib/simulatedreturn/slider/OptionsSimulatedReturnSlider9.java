package com.robinhood.android.options.lib.simulatedreturn.slider;

import com.robinhood.android.transfers.contracts.transfercontext.TransferContext3;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsSimulatedReturnSlider.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/PriceTooltipDisplayMode;", "", "<init>", "(Ljava/lang/String;I)V", TransferContext3.NORMAL, "EXPANDED", "MEASURING", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.PriceTooltipDisplayMode, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionsSimulatedReturnSlider9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsSimulatedReturnSlider9[] $VALUES;
    public static final OptionsSimulatedReturnSlider9 NORMAL = new OptionsSimulatedReturnSlider9(TransferContext3.NORMAL, 0);
    public static final OptionsSimulatedReturnSlider9 EXPANDED = new OptionsSimulatedReturnSlider9("EXPANDED", 1);
    public static final OptionsSimulatedReturnSlider9 MEASURING = new OptionsSimulatedReturnSlider9("MEASURING", 2);

    private static final /* synthetic */ OptionsSimulatedReturnSlider9[] $values() {
        return new OptionsSimulatedReturnSlider9[]{NORMAL, EXPANDED, MEASURING};
    }

    public static EnumEntries<OptionsSimulatedReturnSlider9> getEntries() {
        return $ENTRIES;
    }

    private OptionsSimulatedReturnSlider9(String str, int i) {
    }

    static {
        OptionsSimulatedReturnSlider9[] optionsSimulatedReturnSlider9Arr$values = $values();
        $VALUES = optionsSimulatedReturnSlider9Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsSimulatedReturnSlider9Arr$values);
    }

    public static OptionsSimulatedReturnSlider9 valueOf(String str) {
        return (OptionsSimulatedReturnSlider9) Enum.valueOf(OptionsSimulatedReturnSlider9.class, str);
    }

    public static OptionsSimulatedReturnSlider9[] values() {
        return (OptionsSimulatedReturnSlider9[]) $VALUES.clone();
    }
}
