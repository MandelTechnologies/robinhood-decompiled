package p479j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;
import p479j$.time.AbstractC45722b;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.ValueRange;

/* renamed from: j$.time.format.f */
/* loaded from: classes29.dex */
public final class C45764f extends C45768j {

    /* renamed from: g */
    public final boolean f6830g;

    @Override // p479j$.time.format.C45768j
    /* renamed from: b */
    public final boolean mo3561b(C45780v c45780v) {
        return c45780v.f6882c && this.f6839b == this.f6840c && !this.f6830g;
    }

    @Override // p479j$.time.format.C45768j, p479j$.time.format.InterfaceC45763e
    /* renamed from: i */
    public final int mo3560i(C45780v c45780v, CharSequence charSequence, int i) {
        boolean z = c45780v.f6882c;
        DateTimeFormatter dateTimeFormatter = c45780v.f6880a;
        int i2 = (z || mo3561b(c45780v)) ? this.f6839b : 0;
        int i3 = (c45780v.f6882c || mo3561b(c45780v)) ? this.f6840c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.f6830g) {
                if (charSequence.charAt(i) == dateTimeFormatter.f6802c.f6819c) {
                    i++;
                } else if (i2 > 0) {
                    return ~i;
                }
            }
            int i4 = i;
            int i5 = i2 + i4;
            if (i5 > length) {
                return ~i4;
            }
            int iMin = Math.min(i3 + i4, length);
            int i6 = 0;
            int i7 = i4;
            while (true) {
                if (i7 >= iMin) {
                    break;
                }
                int i8 = i7 + 1;
                int iCharAt = charSequence.charAt(i7) - dateTimeFormatter.f6802c.f6817a;
                if (iCharAt < 0 || iCharAt > 9) {
                    iCharAt = -1;
                }
                if (iCharAt >= 0) {
                    i6 = (i6 * 10) + iCharAt;
                    i7 = i8;
                } else if (i8 < i5) {
                    return ~i4;
                }
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i6).movePointLeft(i7 - i4);
            ValueRange valueRangeRange = this.f6838a.range();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(valueRangeRange.f6931a);
            return c45780v.m3588g(this.f6838a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(valueRangeRange.getMaximum()).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i4, i7);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    public C45764f(TemporalField temporalField, int i, int i2, boolean z) {
        this(temporalField, i, i2, z, 0);
        Objects.requireNonNull(temporalField, "field");
        ValueRange valueRangeRange = temporalField.range();
        if (valueRangeRange.f6931a != valueRangeRange.f6932b || valueRangeRange.f6933c != valueRangeRange.f6934d) {
            throw new IllegalArgumentException(AbstractC45722b.m3469a("Field must have a fixed set of values: ", temporalField));
        }
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    public C45764f(TemporalField temporalField, int i, int i2, boolean z, int i3) {
        super(temporalField, i, i2, SignStyle.NOT_NEGATIVE, i3);
        this.f6830g = z;
    }

    @Override // p479j$.time.format.C45768j
    /* renamed from: e */
    public final C45768j mo3562e() {
        if (this.f6842e == -1) {
            return this;
        }
        return new C45764f(this.f6838a, this.f6839b, this.f6840c, this.f6830g, -1);
    }

    @Override // p479j$.time.format.C45768j
    /* renamed from: f */
    public final C45768j mo3563f(int i) {
        return new C45764f(this.f6838a, this.f6839b, this.f6840c, this.f6830g, this.f6842e + i);
    }

    @Override // p479j$.time.format.C45768j, p479j$.time.format.InterfaceC45763e
    /* renamed from: c */
    public final boolean mo3559c(C45782x c45782x, StringBuilder sb) {
        TemporalField temporalField = this.f6838a;
        Long lM3590a = c45782x.m3590a(temporalField);
        if (lM3590a == null) {
            return false;
        }
        DecimalStyle decimalStyle = c45782x.f6890b.f6802c;
        long jLongValue = lM3590a.longValue();
        ValueRange valueRangeRange = temporalField.range();
        valueRangeRange.checkValidValue(jLongValue, temporalField);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(valueRangeRange.f6931a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(valueRangeRange.getMaximum()).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.f6830g;
        int i = this.f6839b;
        if (iScale != 0) {
            String strM3558a = decimalStyle.m3558a(bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.f6840c), roundingMode).toPlainString().substring(2));
            if (z) {
                sb.append(decimalStyle.f6819c);
            }
            sb.append(strM3558a);
            return true;
        }
        if (i > 0) {
            if (z) {
                sb.append(decimalStyle.f6819c);
            }
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(decimalStyle.f6817a);
            }
        }
        return true;
    }

    @Override // p479j$.time.format.C45768j
    public final String toString() {
        return "Fraction(" + this.f6838a + "," + this.f6839b + "," + this.f6840c + (this.f6830g ? ",DecimalPoint" : "") + ")";
    }
}
