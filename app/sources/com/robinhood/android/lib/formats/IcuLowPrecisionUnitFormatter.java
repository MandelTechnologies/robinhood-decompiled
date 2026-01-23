package com.robinhood.android.lib.formats;

import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import com.robinhood.utils.math.BigDecimals7;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: IcuLowPrecisionUnitFormatter.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0004\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/IcuLowPrecisionUnitFormatter;", "Lcom/robinhood/android/lib/formats/IcuNumberFormatter;", "lowPrecisionFormat", "Landroid/icu/text/CompactDecimalFormat;", "formatForCurrency", "Landroid/icu/text/NumberFormat;", "currencySymbol", "", "locale", "Ljava/util/Locale;", "<init>", "(Landroid/icu/text/CompactDecimalFormat;Landroid/icu/text/NumberFormat;Ljava/lang/String;Ljava/util/Locale;)V", "currencySymbolPosition", "Lcom/robinhood/android/lib/formats/IcuLowPrecisionUnitFormatter$CurrencySymbolPosition;", "getCurrencySymbolPosition", "()Lcom/robinhood/android/lib/formats/IcuLowPrecisionUnitFormatter$CurrencySymbolPosition;", "format", InquiryField.FloatField.TYPE2, "", "CurrencySymbolPosition", "LowPrecisionUnitFormat", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class IcuLowPrecisionUnitFormatter extends IcuNumberFormatter {
    private final String currencySymbol;
    private final NumberFormat formatForCurrency;
    private final Locale locale;
    private final CompactDecimalFormat lowPrecisionFormat;

    /* compiled from: IcuLowPrecisionUnitFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurrencySymbolPosition.values().length];
            try {
                iArr[CurrencySymbolPosition.LEFT_SPACED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurrencySymbolPosition.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CurrencySymbolPosition.RIGHT_SPACED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CurrencySymbolPosition.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ IcuLowPrecisionUnitFormatter(CompactDecimalFormat compactDecimalFormat, NumberFormat numberFormat, String str, Locale locale, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CompactDecimalFormat.getInstance(Locale.US, CompactDecimalFormat.CompactStyle.SHORT) : compactDecimalFormat, (i & 2) != 0 ? NumberFormat.getNumberInstance(Locale.US) : numberFormat, str, locale);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IcuLowPrecisionUnitFormatter(CompactDecimalFormat lowPrecisionFormat, NumberFormat formatForCurrency, String currencySymbol, Locale locale) {
        super(new LowPrecisionUnitFormat(lowPrecisionFormat));
        Intrinsics.checkNotNullParameter(lowPrecisionFormat, "lowPrecisionFormat");
        Intrinsics.checkNotNullParameter(formatForCurrency, "formatForCurrency");
        Intrinsics.checkNotNullParameter(currencySymbol, "currencySymbol");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.lowPrecisionFormat = lowPrecisionFormat;
        this.formatForCurrency = formatForCurrency;
        this.currencySymbol = currencySymbol;
        this.locale = locale;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IcuLowPrecisionUnitFormatter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/IcuLowPrecisionUnitFormatter$CurrencySymbolPosition;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT_SPACED", "LEFT", "RIGHT_SPACED", "RIGHT", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class CurrencySymbolPosition {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CurrencySymbolPosition[] $VALUES;
        public static final CurrencySymbolPosition LEFT_SPACED = new CurrencySymbolPosition("LEFT_SPACED", 0);
        public static final CurrencySymbolPosition LEFT = new CurrencySymbolPosition("LEFT", 1);
        public static final CurrencySymbolPosition RIGHT_SPACED = new CurrencySymbolPosition("RIGHT_SPACED", 2);
        public static final CurrencySymbolPosition RIGHT = new CurrencySymbolPosition("RIGHT", 3);

        private static final /* synthetic */ CurrencySymbolPosition[] $values() {
            return new CurrencySymbolPosition[]{LEFT_SPACED, LEFT, RIGHT_SPACED, RIGHT};
        }

        public static EnumEntries<CurrencySymbolPosition> getEntries() {
            return $ENTRIES;
        }

        private CurrencySymbolPosition(String str, int i) {
        }

        static {
            CurrencySymbolPosition[] currencySymbolPositionArr$values = $values();
            $VALUES = currencySymbolPositionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(currencySymbolPositionArr$values);
        }

        public static CurrencySymbolPosition valueOf(String str) {
            return (CurrencySymbolPosition) Enum.valueOf(CurrencySymbolPosition.class, str);
        }

        public static CurrencySymbolPosition[] values() {
            return (CurrencySymbolPosition[]) $VALUES.clone();
        }
    }

    private final CurrencySymbolPosition getCurrencySymbolPosition() {
        String str = this.formatForCurrency.format(0L);
        int length = this.currencySymbol.length();
        Intrinsics.checkNotNull(str);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, this.currencySymbol, 0, false, 6, (Object) null);
        if (iIndexOf$default == (StringsKt.getLastIndex(str) - length) + 1) {
            int i = iIndexOf$default - 1;
            if (i >= 0 && CharsKt.isWhitespace(str.charAt(i))) {
                return CurrencySymbolPosition.RIGHT_SPACED;
            }
            return CurrencySymbolPosition.RIGHT;
        }
        int i2 = iIndexOf$default + length;
        if (i2 < str.length() && CharsKt.isWhitespace(str.charAt(i2))) {
            return CurrencySymbolPosition.LEFT_SPACED;
        }
        return CurrencySymbolPosition.LEFT;
    }

    @Override // com.robinhood.android.lib.formats.IcuNumberFormatter, com.robinhood.android.lib.formats.NumberFormatter
    public String format(Number number) {
        Intrinsics.checkNotNullParameter(number, "number");
        String str = this.lowPrecisionFormat.format(number);
        int i = WhenMappings.$EnumSwitchMapping$0[getCurrencySymbolPosition().ordinal()];
        if (i == 1) {
            return this.currencySymbol + " " + str;
        }
        if (i == 2) {
            return this.currencySymbol + str;
        }
        if (i == 3) {
            return str + " " + this.currencySymbol;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return str + this.currencySymbol;
    }

    /* compiled from: IcuLowPrecisionUnitFormatter.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/IcuLowPrecisionUnitFormatter$LowPrecisionUnitFormat;", "Landroid/icu/text/NumberFormat;", "baseFormat", "<init>", "(Landroid/icu/text/NumberFormat;)V", "format", "Ljava/lang/StringBuffer;", "value", "", "buffer", "field", "Ljava/text/FieldPosition;", "", InquiryField.FloatField.TYPE2, "Ljava/math/BigInteger;", "toAppendTo", "pos", "bigDecimal", "Ljava/math/BigDecimal;", "Landroid/icu/math/BigDecimal;", "parse", "", "string", "", "position", "Ljava/text/ParsePosition;", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class LowPrecisionUnitFormat extends NumberFormat {
        private final NumberFormat baseFormat;

        public LowPrecisionUnitFormat(NumberFormat baseFormat) {
            Intrinsics.checkNotNullParameter(baseFormat, "baseFormat");
            this.baseFormat = baseFormat;
        }

        @Override // android.icu.text.NumberFormat
        public StringBuffer format(double value, StringBuffer buffer, FieldPosition field) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            Intrinsics.checkNotNullParameter(field, "field");
            return format(new BigDecimal(String.valueOf(value)), buffer, field);
        }

        @Override // android.icu.text.NumberFormat
        public StringBuffer format(long value, StringBuffer buffer, FieldPosition field) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            Intrinsics.checkNotNullParameter(field, "field");
            return format(new BigDecimal(value), buffer, field);
        }

        @Override // android.icu.text.NumberFormat
        public StringBuffer format(BigInteger number, StringBuffer toAppendTo, FieldPosition pos) {
            StringBuffer stringBuffer = format((Object) new BigDecimal(number), toAppendTo, pos);
            Intrinsics.checkNotNullExpressionValue(stringBuffer, "format(...)");
            return stringBuffer;
        }

        @Override // android.icu.text.NumberFormat
        public StringBuffer format(BigDecimal bigDecimal, StringBuffer buffer, FieldPosition field) {
            Intrinsics.checkNotNullParameter(bigDecimal, "bigDecimal");
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            Intrinsics.checkNotNullParameter(field, "field");
            Object objClone = this.baseFormat.clone();
            Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type android.icu.text.NumberFormat");
            NumberFormat numberFormat = (NumberFormat) objClone;
            DecimalFormat decimalFormat = numberFormat instanceof DecimalFormat ? (DecimalFormat) numberFormat : null;
            if (decimalFormat != null) {
                decimalFormat.setPositiveSuffix("");
                decimalFormat.setNegativeSuffix("");
                numberFormat = decimalFormat;
            }
            if (bigDecimal.compareTo(BigDecimal.ONE) < 0) {
                numberFormat.setMinimumFractionDigits(0);
                numberFormat.setMaximumFractionDigits(6);
                StringBuffer stringBuffer = numberFormat.format(bigDecimal, buffer, field);
                Intrinsics.checkNotNull(stringBuffer);
                return stringBuffer;
            }
            if (!BigDecimals7.isInteger(bigDecimal)) {
                numberFormat.setMinimumFractionDigits(1);
                numberFormat.setMaximumFractionDigits(2);
            } else {
                numberFormat.setMinimumFractionDigits(0);
                numberFormat.setMaximumFractionDigits(0);
            }
            StringBuffer stringBuffer2 = numberFormat.format(bigDecimal, buffer, field);
            Intrinsics.checkNotNull(stringBuffer2);
            return stringBuffer2;
        }

        @Override // android.icu.text.NumberFormat
        public StringBuffer format(android.icu.math.BigDecimal number, StringBuffer toAppendTo, FieldPosition pos) {
            StringBuffer stringBuffer = format((Object) (number != null ? number.toBigDecimal() : null), toAppendTo, pos);
            Intrinsics.checkNotNullExpressionValue(stringBuffer, "format(...)");
            return stringBuffer;
        }

        @Override // android.icu.text.NumberFormat
        public Number parse(String string2, ParsePosition position) throws ParseException {
            Intrinsics.checkNotNullParameter(string2, "string");
            Intrinsics.checkNotNullParameter(position, "position");
            Number number = this.baseFormat.parse(string2);
            Intrinsics.checkNotNullExpressionValue(number, "parse(...)");
            return number;
        }
    }
}
