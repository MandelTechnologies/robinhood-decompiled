package com.robinhood.android.lib.formats;

import com.robinhood.android.lib.utils.BigDecimals2;
import com.robinhood.utils.math.BigDecimals7;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.math.BigDecimal;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LowPrecisionUnitFormatter.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/LowPrecisionUnitFormatter;", "Lcom/robinhood/android/lib/formats/DefaultNumberFormatter;", "baseFormat", "Ljava/text/NumberFormat;", "truncateExactMultiplesOfOneThousand", "", "<init>", "(Ljava/text/NumberFormat;Z)V", "numberFormatter", "format", "", InquiryField.FloatField.TYPE2, "", "LowPrecisionUnitFormat", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class LowPrecisionUnitFormatter extends DefaultNumberFormatter {
    private final DefaultNumberFormatter numberFormatter;
    private final boolean truncateExactMultiplesOfOneThousand;

    /* JADX WARN: Multi-variable type inference failed */
    public LowPrecisionUnitFormatter() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ LowPrecisionUnitFormatter(NumberFormat numberFormat, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NumberFormat.getNumberInstance(Locale.US) : numberFormat, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LowPrecisionUnitFormatter(NumberFormat baseFormat, boolean z) {
        super(new LowPrecisionUnitFormat(baseFormat));
        Intrinsics.checkNotNullParameter(baseFormat, "baseFormat");
        this.truncateExactMultiplesOfOneThousand = z;
        this.numberFormatter = new DefaultNumberFormatter(getNumberFormat());
    }

    @Override // com.robinhood.android.lib.formats.DefaultNumberFormatter, com.robinhood.android.lib.formats.NumberFormatter
    public String format(Number number) {
        Intrinsics.checkNotNullParameter(number, "number");
        BigDecimal bigDecimal = BigDecimals7.toBigDecimal(number);
        return BigDecimals2.truncateLarge$default(bigDecimal, this.numberFormatter, !BigDecimals7.isInteger(bigDecimal) || (this.truncateExactMultiplesOfOneThousand && BigDecimals7.isMultipleOf(bigDecimal, new BigDecimal("1000"))), 2, null, 8, null);
    }

    /* compiled from: LowPrecisionUnitFormatter.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/LowPrecisionUnitFormatter$LowPrecisionUnitFormat;", "Ljava/text/NumberFormat;", "baseFormat", "<init>", "(Ljava/text/NumberFormat;)V", "format", "Ljava/lang/StringBuffer;", "value", "", "buffer", "field", "Ljava/text/FieldPosition;", "", "bigDecimal", "Ljava/math/BigDecimal;", "parse", "", "string", "", "position", "Ljava/text/ParsePosition;", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class LowPrecisionUnitFormat extends NumberFormat {
        private final NumberFormat baseFormat;

        public LowPrecisionUnitFormat(NumberFormat baseFormat) {
            Intrinsics.checkNotNullParameter(baseFormat, "baseFormat");
            this.baseFormat = baseFormat;
        }

        @Override // java.text.NumberFormat
        public StringBuffer format(double value, StringBuffer buffer, FieldPosition field) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            Intrinsics.checkNotNullParameter(field, "field");
            return format(new BigDecimal(String.valueOf(value)), buffer, field);
        }

        @Override // java.text.NumberFormat
        public StringBuffer format(long value, StringBuffer buffer, FieldPosition field) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            Intrinsics.checkNotNullParameter(field, "field");
            return format(new BigDecimal(value), buffer, field);
        }

        private final StringBuffer format(BigDecimal bigDecimal, StringBuffer buffer, FieldPosition field) {
            if (bigDecimal.compareTo(BigDecimal.ONE) < 0) {
                NumberFormat numberFormat = this.baseFormat;
                numberFormat.setMinimumFractionDigits(0);
                numberFormat.setMaximumFractionDigits(6);
                StringBuffer stringBuffer = this.baseFormat.format(bigDecimal, buffer, field);
                Intrinsics.checkNotNull(stringBuffer);
                return stringBuffer;
            }
            if (!BigDecimals7.isInteger(bigDecimal)) {
                NumberFormat numberFormat2 = this.baseFormat;
                numberFormat2.setMinimumFractionDigits(1);
                numberFormat2.setMaximumFractionDigits(2);
            } else {
                NumberFormat numberFormat3 = this.baseFormat;
                numberFormat3.setMinimumFractionDigits(0);
                numberFormat3.setMaximumFractionDigits(0);
            }
            StringBuffer stringBuffer2 = this.baseFormat.format(bigDecimal, buffer, field);
            Intrinsics.checkNotNull(stringBuffer2);
            return stringBuffer2;
        }

        @Override // java.text.NumberFormat
        public Number parse(String string2, ParsePosition position) throws ParseException {
            Intrinsics.checkNotNullParameter(string2, "string");
            Intrinsics.checkNotNullParameter(position, "position");
            Number number = this.baseFormat.parse(string2);
            Intrinsics.checkNotNullExpressionValue(number, "parse(...)");
            return number;
        }
    }
}
