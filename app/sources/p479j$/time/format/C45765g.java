package p479j$.time.format;

import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import p479j$.time.LocalDateTime;
import p479j$.time.ZoneOffset;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalAccessor;

/* renamed from: j$.time.format.g */
/* loaded from: classes29.dex */
public final class C45765g implements InterfaceC45763e {

    /* renamed from: a */
    public final int f6831a;

    public C45765g(int i) {
        this.f6831a = i;
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: c */
    public final boolean mo3559c(C45782x c45782x, StringBuilder sb) {
        Long lM3590a = c45782x.m3590a(ChronoField.INSTANT_SECONDS);
        TemporalAccessor temporalAccessor = c45782x.f6889a;
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        Long lValueOf = temporalAccessor.isSupported(chronoField) ? Long.valueOf(temporalAccessor.getLong(chronoField)) : null;
        int i = 0;
        if (lM3590a == null) {
            return false;
        }
        long jLongValue = lM3590a.longValue();
        int iCheckValidIntValue = chronoField.checkValidIntValue(lValueOf != null ? lValueOf.longValue() : 0L);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jFloorDiv = Math.floorDiv(j, 315569520000L) + 1;
            LocalDateTime localDateTimeOfEpochSecond = LocalDateTime.ofEpochSecond(Math.floorMod(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jFloorDiv > 0) {
                sb.append('+');
                sb.append(jFloorDiv);
            }
            sb.append(localDateTimeOfEpochSecond);
            if (localDateTimeOfEpochSecond.getSecond() == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime localDateTimeOfEpochSecond2 = LocalDateTime.ofEpochSecond(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeOfEpochSecond2);
            if (localDateTimeOfEpochSecond2.getSecond() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (localDateTimeOfEpochSecond2.getYear() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        int i2 = this.f6831a;
        if ((i2 < 0 && iCheckValidIntValue > 0) || i2 > 0) {
            sb.append('.');
            int i3 = 100000000;
            while (true) {
                if ((i2 != -1 || iCheckValidIntValue <= 0) && ((i2 != -2 || (iCheckValidIntValue <= 0 && i % 3 == 0)) && i >= i2)) {
                    break;
                }
                int i4 = iCheckValidIntValue / i3;
                sb.append((char) (i4 + 48));
                iCheckValidIntValue -= i4 * i3;
                i3 /= 10;
                i++;
            }
        }
        sb.append(Matrix.MATRIX_TYPE_ZERO);
        return true;
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: i */
    public final int mo3560i(C45780v c45780v, CharSequence charSequence, int i) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = this.f6831a;
        int i6 = i5 < 0 ? 0 : i5;
        if (i5 < 0) {
            i5 = 9;
        }
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m3544a(DateTimeFormatter.ISO_LOCAL_DATE);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral = dateTimeFormatterBuilder.appendLiteral('T');
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral2 = dateTimeFormatterBuilderAppendLiteral.appendValue(chronoField, 2).appendLiteral(':');
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral3 = dateTimeFormatterBuilderAppendLiteral2.appendValue(chronoField2, 2).appendLiteral(':');
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue = dateTimeFormatterBuilderAppendLiteral3.appendValue(chronoField3, 2);
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        dateTimeFormatterBuilderAppendValue.m3545b(chronoField4, i6, i5, true);
        C45762d c45762dM3543c = dateTimeFormatterBuilderAppendValue.appendLiteral(Matrix.MATRIX_TYPE_ZERO).toFormatter().m3543c();
        C45780v c45780v2 = new C45780v(c45780v.f6880a);
        c45780v2.f6881b = c45780v.f6881b;
        c45780v2.f6882c = c45780v.f6882c;
        int iMo3560i = c45762dM3543c.mo3560i(c45780v2, charSequence, i);
        if (iMo3560i < 0) {
            return iMo3560i;
        }
        long jLongValue = c45780v2.m3586e(ChronoField.YEAR).longValue();
        int iIntValue = c45780v2.m3586e(ChronoField.MONTH_OF_YEAR).intValue();
        int iIntValue2 = c45780v2.m3586e(ChronoField.DAY_OF_MONTH).intValue();
        int iIntValue3 = c45780v2.m3586e(chronoField).intValue();
        int iIntValue4 = c45780v2.m3586e(chronoField2).intValue();
        Long lM3586e = c45780v2.m3586e(chronoField3);
        Long lM3586e2 = c45780v2.m3586e(chronoField4);
        int iIntValue5 = lM3586e != null ? lM3586e.intValue() : 0;
        int iIntValue6 = lM3586e2 != null ? lM3586e2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            i2 = 0;
            i3 = iIntValue5;
            i4 = 1;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            c45780v.m3584c().f6785d = true;
            i2 = iIntValue3;
            i3 = 59;
        } else {
            i2 = iIntValue3;
            i3 = iIntValue5;
        }
        try {
            return c45780v.m3588g(chronoField4, iIntValue6, i, c45780v.m3588g(ChronoField.INSTANT_SECONDS, LocalDateTime.m3392of(((int) jLongValue) % 10000, iIntValue, iIntValue2, i2, iIntValue4, i3, 0).plusDays(i4).toEpochSecond(ZoneOffset.UTC) + Math.multiplyExact(jLongValue / 10000, 315569520000L), i, iMo3560i));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
