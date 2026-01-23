package com.robinhood.android.equityscreener.indicators;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IndicatorRangeSliderSelector.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/indicators/DataType;", "", "prefix", "", "postfix", "formatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/android/lib/formats/NumberFormatter;)V", "getPrefix", "()Ljava/lang/String;", "getPostfix", "getFormatter", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "DOLLARS", "PERCENTAGE", "NUMERIC", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.indicators.DataType, reason: use source file name */
/* loaded from: classes3.dex */
public final class IndicatorRangeSliderSelector {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IndicatorRangeSliderSelector[] $VALUES;
    public static final IndicatorRangeSliderSelector DOLLARS;
    public static final IndicatorRangeSliderSelector NUMERIC = new IndicatorRangeSliderSelector("NUMERIC", 2, null, null, IndicatorRangeSliderSelector5.getNumberFormatter(), 3, null);
    public static final IndicatorRangeSliderSelector PERCENTAGE;
    private final NumberFormatter formatter;
    private final String postfix;
    private final String prefix;

    private static final /* synthetic */ IndicatorRangeSliderSelector[] $values() {
        return new IndicatorRangeSliderSelector[]{DOLLARS, PERCENTAGE, NUMERIC};
    }

    public static EnumEntries<IndicatorRangeSliderSelector> getEntries() {
        return $ENTRIES;
    }

    private IndicatorRangeSliderSelector(String str, int i, String str2, String str3, NumberFormatter numberFormatter) {
        this.prefix = str2;
        this.postfix = str3;
        this.formatter = numberFormatter;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ IndicatorRangeSliderSelector(String str, int i, String str2, String str3, NumberFormatter numberFormatter, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        NumberFormatter numberFormatter2;
        String str4;
        str2 = (i2 & 1) != 0 ? "" : str2;
        if ((i2 & 2) != 0) {
            numberFormatter2 = numberFormatter;
            str4 = "";
        } else {
            numberFormatter2 = numberFormatter;
            str4 = str3;
        }
        this(str, i, str2, str4, numberFormatter2);
    }

    public final NumberFormatter getFormatter() {
        return this.formatter;
    }

    public final String getPostfix() {
        return this.postfix;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    static {
        String str = null;
        DOLLARS = new IndicatorRangeSliderSelector("DOLLARS", 0, "$", str, Formats.getNoSymbolCurrencyFormat(), 2, null);
        PERCENTAGE = new IndicatorRangeSliderSelector("PERCENTAGE", 1, str, "%", Formats.getInterestRateFormatShort(), 1, null);
        IndicatorRangeSliderSelector[] indicatorRangeSliderSelectorArr$values = $values();
        $VALUES = indicatorRangeSliderSelectorArr$values;
        $ENTRIES = EnumEntries2.enumEntries(indicatorRangeSliderSelectorArr$values);
    }

    public static IndicatorRangeSliderSelector valueOf(String str) {
        return (IndicatorRangeSliderSelector) Enum.valueOf(IndicatorRangeSliderSelector.class, str);
    }

    public static IndicatorRangeSliderSelector[] values() {
        return (IndicatorRangeSliderSelector[]) $VALUES.clone();
    }
}
