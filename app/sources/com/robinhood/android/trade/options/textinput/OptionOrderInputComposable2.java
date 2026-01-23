package com.robinhood.android.trade.options.textinput;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionOrderInputComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/options/textinput/InputType;", "", "<init>", "(Ljava/lang/String;I)V", "PRICE", "QUANTITY", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.textinput.InputType, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionOrderInputComposable2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionOrderInputComposable2[] $VALUES;
    public static final OptionOrderInputComposable2 PRICE = new OptionOrderInputComposable2("PRICE", 0);
    public static final OptionOrderInputComposable2 QUANTITY = new OptionOrderInputComposable2("QUANTITY", 1);

    private static final /* synthetic */ OptionOrderInputComposable2[] $values() {
        return new OptionOrderInputComposable2[]{PRICE, QUANTITY};
    }

    public static EnumEntries<OptionOrderInputComposable2> getEntries() {
        return $ENTRIES;
    }

    private OptionOrderInputComposable2(String str, int i) {
    }

    static {
        OptionOrderInputComposable2[] optionOrderInputComposable2Arr$values = $values();
        $VALUES = optionOrderInputComposable2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionOrderInputComposable2Arr$values);
    }

    public static OptionOrderInputComposable2 valueOf(String str) {
        return (OptionOrderInputComposable2) Enum.valueOf(OptionOrderInputComposable2.class, str);
    }

    public static OptionOrderInputComposable2[] values() {
        return (OptionOrderInputComposable2[]) $VALUES.clone();
    }
}
