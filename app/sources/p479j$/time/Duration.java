package p479j$.time;

import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState4;
import com.robinhood.iso.countrycode.CountryCode;
import com.squareup.wire.internal.MathMethods;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAmount;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.UnsupportedTemporalTypeException;

/* loaded from: classes29.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);

    /* renamed from: c */
    public static final BigInteger f6665c = BigInteger.valueOf(MathMethods.NANOS_PER_SECOND);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a */
    public final long f6666a;

    /* renamed from: b */
    public final int f6667b;

    public static Duration ofDays(long j) {
        return m3369c(Math.multiplyExact(j, OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC), 0);
    }

    public static Duration ofHours(long j) {
        return m3369c(Math.multiplyExact(j, OptionsSimulatedReturnTimeSliderDataState4.ONE_HOUR_IN_SEC), 0);
    }

    public static Duration ofMinutes(long j) {
        return m3369c(Math.multiplyExact(j, 60), 0);
    }

    public static Duration ofSeconds(long j) {
        return m3369c(j, 0);
    }

    public static Duration ofSeconds(long j, long j2) {
        return m3369c(Math.addExact(j, Math.floorDiv(j2, MathMethods.NANOS_PER_SECOND)), (int) Math.floorMod(j2, MathMethods.NANOS_PER_SECOND));
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return m3369c(j2, i * InvestFlowConstants.MAX_ONE_TIME_AMOUNT);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / MathMethods.NANOS_PER_SECOND;
        int i = (int) (j % MathMethods.NANOS_PER_SECOND);
        if (i < 0) {
            i = (int) (i + MathMethods.NANOS_PER_SECOND);
            j2--;
        }
        return m3369c(j2, i);
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return ofNanos(temporal.until(temporal2, ChronoUnit.NANOS));
        } catch (DateTimeException | ArithmeticException unused) {
            long jUntil = temporal.until(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                long j2 = temporal2.getLong(chronoField) - temporal.getLong(chronoField);
                if (jUntil > 0 && j2 < 0) {
                    jUntil++;
                } else if (jUntil < 0 && j2 > 0) {
                    jUntil--;
                }
                j = j2;
            } catch (DateTimeException unused2) {
            }
            return ofSeconds(jUntil, j);
        }
    }

    /* renamed from: c */
    public static Duration m3369c(long j, int i) {
        if ((i | j) == 0) {
            return ZERO;
        }
        return new Duration(j, i);
    }

    public Duration(long j, int i) {
        this.f6666a = j;
        this.f6667b = i;
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public final long get(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.SECONDS) {
            return this.f6666a;
        }
        if (temporalUnit == ChronoUnit.NANOS) {
            return this.f6667b;
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public final List getUnits() {
        return AbstractC45753d.f6775a;
    }

    public boolean isZero() {
        return (this.f6666a | ((long) this.f6667b)) == 0;
    }

    public boolean isNegative() {
        return this.f6666a < 0;
    }

    public long getSeconds() {
        return this.f6666a;
    }

    public int getNano() {
        return this.f6667b;
    }

    public Duration withSeconds(long j) {
        return m3369c(j, this.f6667b);
    }

    public Duration plus(Duration duration) {
        return m3371j(duration.getSeconds(), duration.getNano());
    }

    public Duration plusDays(long j) {
        return m3371j(Math.multiplyExact(j, OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC), 0L);
    }

    public Duration minusHours(long j) {
        if (j != Long.MIN_VALUE) {
            return m3371j(Math.multiplyExact(-j, OptionsSimulatedReturnTimeSliderDataState4.ONE_HOUR_IN_SEC), 0L);
        }
        long j2 = OptionsSimulatedReturnTimeSliderDataState4.ONE_HOUR_IN_SEC;
        Duration durationM3371j = m3371j(Math.multiplyExact(Long.MAX_VALUE, j2), 0L);
        durationM3371j.getClass();
        return durationM3371j.m3371j(Math.multiplyExact(1L, j2), 0L);
    }

    public Duration plusMinutes(long j) {
        return m3371j(Math.multiplyExact(j, 60), 0L);
    }

    /* renamed from: j */
    public final Duration m3371j(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(Math.addExact(Math.addExact(this.f6666a, j), j2 / MathMethods.NANOS_PER_SECOND), this.f6667b + (j2 % MathMethods.NANOS_PER_SECOND));
    }

    public Duration minus(Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        if (seconds == Long.MIN_VALUE) {
            return m3371j(Long.MAX_VALUE, -nano).m3371j(1L, 0L);
        }
        return m3371j(-seconds, -nano);
    }

    public Duration minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    public Duration minusMinutes(long j) {
        return j == Long.MIN_VALUE ? plusMinutes(Long.MAX_VALUE).plusMinutes(1L) : plusMinutes(-j);
    }

    public Duration multipliedBy(long j) {
        if (j == 0) {
            return ZERO;
        }
        return j == 1 ? this : m3370i(BigDecimal.valueOf(this.f6666a).add(BigDecimal.valueOf(this.f6667b, 9)).multiply(BigDecimal.valueOf(j)));
    }

    public Duration dividedBy(long j) {
        if (j != 0) {
            return j == 1 ? this : m3370i(BigDecimal.valueOf(this.f6666a).add(BigDecimal.valueOf(this.f6667b, 9)).divide(BigDecimal.valueOf(j), RoundingMode.DOWN));
        }
        throw new ArithmeticException("Cannot divide by zero");
    }

    /* renamed from: i */
    public static Duration m3370i(BigDecimal bigDecimal) {
        BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(f6665c);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() > 63) {
            throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
        }
        return ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
    }

    public Duration abs() {
        return isNegative() ? multipliedBy(-1L) : this;
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public final Temporal addTo(Temporal temporal) {
        long j = this.f6666a;
        if (j != 0) {
            temporal = temporal.plus(j, ChronoUnit.SECONDS);
        }
        int i = this.f6667b;
        return i != 0 ? temporal.plus(i, ChronoUnit.NANOS) : temporal;
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public final Temporal subtractFrom(Temporal temporal) {
        long j = this.f6666a;
        if (j != 0) {
            temporal = temporal.minus(j, ChronoUnit.SECONDS);
        }
        int i = this.f6667b;
        return i != 0 ? temporal.minus(i, ChronoUnit.NANOS) : temporal;
    }

    public long toDays() {
        return this.f6666a / 86400;
    }

    public long toHours() {
        return this.f6666a / 3600;
    }

    public long toMinutes() {
        return this.f6666a / 60;
    }

    public long toSeconds() {
        return this.f6666a;
    }

    public long toMillis() {
        long j = this.f6666a;
        long j2 = this.f6667b;
        if (j < 0) {
            j++;
            j2 -= MathMethods.NANOS_PER_SECOND;
        }
        return Math.addExact(Math.multiplyExact(j, 1000), j2 / 1000000);
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iCompare = Long.compare(this.f6666a, duration.f6666a);
        return iCompare != 0 ? iCompare : this.f6667b - duration.f6667b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f6666a == duration.f6666a && this.f6667b == duration.f6667b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f6666a;
        return (this.f6667b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.f6666a;
        if (j < 0 && this.f6667b > 0) {
            j++;
        }
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append(CountryCode.COUNTRY_CODE_PT);
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.f6667b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (this.f6666a < 0 && this.f6667b > 0 && i2 == 0) {
            sb.append("-0");
        } else {
            sb.append(i2);
        }
        if (this.f6667b > 0) {
            int length = sb.length();
            if (this.f6666a < 0) {
                sb.append(2000000000 - this.f6667b);
            } else {
                sb.append(this.f6667b + MathMethods.NANOS_PER_SECOND);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new C45792n((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
