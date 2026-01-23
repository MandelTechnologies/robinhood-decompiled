package com.robinhood.android.lib.formats;

import android.icu.text.NumberFormat;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.FieldPosition;
import java.text.ParsePosition;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IcuSmallAmountFormatter.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/IcuSmallAmountFormatter;", "Landroid/icu/text/NumberFormat;", "formatter", "enableSubPennyFormatting", "", "forceSubPennyTrailingZeros", "<init>", "(Landroid/icu/text/NumberFormat;ZZ)V", "format", "Ljava/lang/StringBuffer;", "value", "", "buffer", "field", "Ljava/text/FieldPosition;", "", "Ljava/math/BigInteger;", "Ljava/math/BigDecimal;", "Landroid/icu/math/BigDecimal;", "parse", "", "", "position", "Ljava/text/ParsePosition;", "formatConditionally", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class IcuSmallAmountFormatter extends NumberFormat {
    private final boolean enableSubPennyFormatting;
    private final boolean forceSubPennyTrailingZeros;
    private final NumberFormat formatter;

    public /* synthetic */ IcuSmallAmountFormatter(NumberFormat numberFormat, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(numberFormat, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    public IcuSmallAmountFormatter(NumberFormat formatter, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.formatter = formatter;
        this.enableSubPennyFormatting = z;
        this.forceSubPennyTrailingZeros = z2;
    }

    @Override // android.icu.text.NumberFormat
    public StringBuffer format(double value, StringBuffer buffer, FieldPosition field) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(field, "field");
        return formatConditionally(Double.valueOf(value), buffer, field);
    }

    @Override // android.icu.text.NumberFormat
    public StringBuffer format(long value, StringBuffer buffer, FieldPosition field) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(field, "field");
        return formatConditionally(Long.valueOf(value), buffer, field);
    }

    @Override // android.icu.text.NumberFormat
    public StringBuffer format(BigInteger value, StringBuffer buffer, FieldPosition field) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(field, "field");
        return formatConditionally(value, buffer, field);
    }

    @Override // android.icu.text.NumberFormat
    public StringBuffer format(BigDecimal value, StringBuffer buffer, FieldPosition field) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(field, "field");
        return formatConditionally(value, buffer, field);
    }

    @Override // android.icu.text.NumberFormat
    public StringBuffer format(android.icu.math.BigDecimal value, StringBuffer buffer, FieldPosition field) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(field, "field");
        return formatConditionally(value, buffer, field);
    }

    @Override // android.icu.text.NumberFormat
    public Number parse(String value, ParsePosition position) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(position, "position");
        Number number = this.formatter.parse(value, position);
        Intrinsics.checkNotNullExpressionValue(number, "parse(...)");
        return number;
    }

    private final StringBuffer formatConditionally(Number value, StringBuffer buffer, FieldPosition field) {
        boolean z = Float.compare(value.floatValue(), 1.0f) <= 0 && Float.compare(value.floatValue(), -1.0f) >= 0;
        if (this.enableSubPennyFormatting && z) {
            this.formatter.setMaximumFractionDigits(6);
            if (this.forceSubPennyTrailingZeros) {
                this.formatter.setMinimumFractionDigits(6);
            }
        } else if (z) {
            this.formatter.setMaximumFractionDigits(4);
        } else {
            this.formatter.setMaximumFractionDigits(2);
        }
        StringBuffer stringBuffer = this.formatter.format(value, buffer, field);
        Intrinsics.checkNotNullExpressionValue(stringBuffer, "format(...)");
        return stringBuffer;
    }
}
