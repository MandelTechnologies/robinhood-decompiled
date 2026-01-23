package p479j$.time;

import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState4;
import com.robinhood.models.card.p311db.Card;
import com.squareup.wire.internal.MathMethods;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import org.bouncycastle.math.p525ec.Tnaf;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalAmount;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.TemporalQuery;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.UnsupportedTemporalTypeException;

/* loaded from: classes29.dex */
public final class LocalTime implements Temporal, TemporalAdjuster, Comparable<LocalTime>, Serializable {
    public static final LocalTime MAX;
    public static final LocalTime MIDNIGHT;
    public static final LocalTime MIN;

    /* renamed from: e */
    public static final LocalTime[] f6675e = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a */
    public final byte f6676a;

    /* renamed from: b */
    public final byte f6677b;

    /* renamed from: c */
    public final byte f6678c;

    /* renamed from: d */
    public final int f6679d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = f6675e;
            if (i < localTimeArr.length) {
                localTimeArr[i] = new LocalTime(i, 0, 0, 0);
                i++;
            } else {
                LocalTime localTime = localTimeArr[0];
                MIDNIGHT = localTime;
                LocalTime localTime2 = localTimeArr[12];
                MIN = localTime;
                MAX = new LocalTime(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public OffsetTime atOffset(ZoneOffset zoneOffset) {
        return new OffsetTime(this, zoneOffset);
    }

    public static LocalTime now() {
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Objects.requireNonNull(clockSystemDefaultZone, Card.Icon.CLOCK);
        return ofInstant(clockSystemDefaultZone.instant(), clockSystemDefaultZone.getZone());
    }

    /* renamed from: of */
    public static LocalTime m3408of(int i, int i2) {
        ChronoField.HOUR_OF_DAY.checkValidValue(i);
        if (i2 == 0) {
            return f6675e[i];
        }
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i2);
        return new LocalTime(i, i2, 0, 0);
    }

    /* renamed from: of */
    public static LocalTime m3409of(int i, int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.checkValidValue(i);
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i2);
        ChronoField.SECOND_OF_MINUTE.checkValidValue(i3);
        ChronoField.NANO_OF_SECOND.checkValidValue(i4);
        return m3405c(i, i2, i3, i4);
    }

    public static LocalTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, GoldFeature.INSTANT);
        Objects.requireNonNull(zoneId, "zone");
        return m3407k((((int) Math.floorMod(instant.getEpochSecond() + zoneId.getRules().getOffset(instant).getTotalSeconds(), OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC)) * MathMethods.NANOS_PER_SECOND) + instant.getNano());
    }

    /* renamed from: k */
    public static LocalTime m3407k(long j) {
        ChronoField.NANO_OF_DAY.checkValidValue(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / MathMethods.NANOS_PER_SECOND);
        return m3405c(i, i2, i3, (int) (j3 - (i3 * MathMethods.NANOS_PER_SECOND)));
    }

    /* renamed from: i */
    public static LocalTime m3406i(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.query(TemporalQueries.localTime());
        if (localTime != null) {
            return localTime;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalTime parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.f6797g);
    }

    public static LocalTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalTime) dateTimeFormatter.parse(charSequence, new C45754e(3));
    }

    /* renamed from: c */
    public static LocalTime m3405c(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return f6675e[i];
        }
        return new LocalTime(i, i2, i3, i4);
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this.f6676a = (byte) i;
        this.f6677b = (byte) i2;
        this.f6678c = (byte) i3;
        this.f6679d = i4;
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).m3595i();
        }
        return temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final boolean isSupported(TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return ((ChronoUnit) temporalUnit).isTimeBased();
        }
        return temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return m3411j((ChronoField) temporalField);
        }
        return super.get(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.NANO_OF_DAY) {
                return m3417r();
            }
            if (temporalField == ChronoField.MICRO_OF_DAY) {
                return m3417r() / 1000;
            }
            return m3411j((ChronoField) temporalField);
        }
        return temporalField.getFrom(this);
    }

    /* renamed from: j */
    public final int m3411j(ChronoField chronoField) {
        switch (AbstractC45787i.f6897a[chronoField.ordinal()]) {
            case 1:
                return this.f6679d;
            case 2:
                throw new UnsupportedTemporalTypeException("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f6679d / 1000;
            case 4:
                throw new UnsupportedTemporalTypeException("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f6679d / InvestFlowConstants.MAX_ONE_TIME_AMOUNT;
            case 6:
                return (int) (m3417r() / 1000000);
            case 7:
                return this.f6678c;
            case 8:
                return toSecondOfDay();
            case 9:
                return this.f6677b;
            case 10:
                return (this.f6676a * 60) + this.f6677b;
            case 11:
                return this.f6676a % 12;
            case 12:
                int i = this.f6676a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.f6676a;
            case 14:
                byte b = this.f6676a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.f6676a / 12;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + chronoField);
        }
    }

    public int getMinute() {
        return this.f6677b;
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal with(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalTime) {
            return (LocalTime) temporalAdjuster;
        }
        return (LocalTime) temporalAdjuster.adjustInto(this);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final LocalTime with(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalTime) temporalField.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.checkValidValue(j);
        switch (AbstractC45787i.f6897a[chronoField.ordinal()]) {
            case 1:
                return m3420u((int) j);
            case 2:
                return m3407k(j);
            case 3:
                return m3420u(((int) j) * 1000);
            case 4:
                return m3407k(j * 1000);
            case 5:
                return m3420u(((int) j) * InvestFlowConstants.MAX_ONE_TIME_AMOUNT);
            case 6:
                return m3407k(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.f6678c != i) {
                    ChronoField.SECOND_OF_MINUTE.checkValidValue(i);
                    return m3405c(this.f6676a, this.f6677b, i, this.f6679d);
                }
                return this;
            case 8:
                return m3416p(j - toSecondOfDay());
            case 9:
                int i2 = (int) j;
                if (this.f6677b != i2) {
                    ChronoField.MINUTE_OF_HOUR.checkValidValue(i2);
                    return m3405c(this.f6676a, i2, this.f6678c, this.f6679d);
                }
                return this;
            case 10:
                return m3414n(j - ((this.f6676a * 60) + this.f6677b));
            case 11:
                return m3413m(j - (this.f6676a % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return m3413m(j - (this.f6676a % 12));
            case 13:
                return m3419t((int) j);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                return m3419t((int) j);
            case 15:
                return m3413m((j - (this.f6676a / 12)) * 12);
            default:
                throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
        }
    }

    /* renamed from: t */
    public final LocalTime m3419t(int i) {
        if (this.f6676a == i) {
            return this;
        }
        ChronoField.HOUR_OF_DAY.checkValidValue(i);
        return m3405c(i, this.f6677b, this.f6678c, this.f6679d);
    }

    /* renamed from: u */
    public final LocalTime m3420u(int i) {
        if (this.f6679d == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.checkValidValue(i);
        return m3405c(this.f6676a, this.f6677b, this.f6678c, i);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal plus(TemporalAmount temporalAmount) {
        return (LocalTime) temporalAmount.addTo(this);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final LocalTime plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (AbstractC45787i.f6898b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return m3415o(j);
                case 2:
                    return m3415o((j % 86400000000L) * 1000);
                case 3:
                    return m3415o((j % 86400000) * 1000000);
                case 4:
                    return m3416p(j);
                case 5:
                    return m3414n(j);
                case 6:
                    return m3413m(j);
                case 7:
                    return m3413m((j % 2) * 12);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return (LocalTime) temporalUnit.addTo(this, j);
    }

    /* renamed from: m */
    public final LocalTime m3413m(long j) {
        return j == 0 ? this : m3405c(((((int) (j % 24)) + this.f6676a) + 24) % 24, this.f6677b, this.f6678c, this.f6679d);
    }

    /* renamed from: n */
    public final LocalTime m3414n(long j) {
        if (j != 0) {
            int i = (this.f6676a * 60) + this.f6677b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return m3405c(i2 / 60, i2 % 60, this.f6678c, this.f6679d);
            }
        }
        return this;
    }

    /* renamed from: p */
    public final LocalTime m3416p(long j) {
        if (j != 0) {
            int i = (this.f6677b * 60) + (this.f6676a * Tnaf.POW_2_WIDTH) + this.f6678c;
            int i2 = ((((int) (j % 86400)) + i) + OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC) % OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC;
            if (i != i2) {
                return m3405c(i2 / OptionsSimulatedReturnTimeSliderDataState4.ONE_HOUR_IN_SEC, (i2 / 60) % 60, i2 % 60, this.f6679d);
            }
        }
        return this;
    }

    /* renamed from: o */
    public final LocalTime m3415o(long j) {
        if (j != 0) {
            long jM3417r = m3417r();
            long j2 = (((j % 86400000000000L) + jM3417r) + 86400000000000L) % 86400000000000L;
            if (jM3417r != j2) {
                return m3405c((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / MathMethods.NANOS_PER_SECOND) % 60), (int) (j2 % MathMethods.NANOS_PER_SECOND));
            }
        }
        return this;
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal minus(TemporalAmount temporalAmount) {
        return (LocalTime) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.chronology() || temporalQuery == TemporalQueries.f6924a || temporalQuery == TemporalQueries.f6928e || temporalQuery == TemporalQueries.f6927d) {
            return null;
        }
        if (temporalQuery == TemporalQueries.localTime()) {
            return this;
        }
        if (temporalQuery == TemporalQueries.localDate()) {
            return null;
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // p479j$.time.temporal.TemporalAdjuster
    public final Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.NANO_OF_DAY, m3417r());
    }

    @Override // p479j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeM3406i = m3406i(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long jM3417r = localTimeM3406i.m3417r() - m3417r();
            switch (AbstractC45787i.f6898b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jM3417r;
                case 2:
                    return jM3417r / 1000;
                case 3:
                    return jM3417r / 1000000;
                case 4:
                    return jM3417r / MathMethods.NANOS_PER_SECOND;
                case 5:
                    return jM3417r / 60000000000L;
                case 6:
                    return jM3417r / 3600000000000L;
                case 7:
                    return jM3417r / 43200000000000L;
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, localTimeM3406i);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public int toSecondOfDay() {
        return (this.f6677b * 60) + (this.f6676a * Tnaf.POW_2_WIDTH) + this.f6678c;
    }

    /* renamed from: r */
    public final long m3417r() {
        return (this.f6678c * MathMethods.NANOS_PER_SECOND) + (this.f6677b * 60000000000L) + (this.f6676a * 3600000000000L) + this.f6679d;
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.f6676a, localTime.f6676a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f6677b, localTime.f6677b)) == 0 && (iCompare = Integer.compare(this.f6678c, localTime.f6678c)) == 0) ? Integer.compare(this.f6679d, localTime.f6679d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.f6676a == localTime.f6676a && this.f6677b == localTime.f6677b && this.f6678c == localTime.f6678c && this.f6679d == localTime.f6679d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jM3417r = m3417r();
        return (int) (jM3417r ^ (jM3417r >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.f6676a;
        byte b2 = this.f6677b;
        byte b3 = this.f6678c;
        int i = this.f6679d;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % InvestFlowConstants.MAX_ONE_TIME_AMOUNT == 0) {
                    sb.append(Integer.toString((i / InvestFlowConstants.MAX_ONE_TIME_AMOUNT) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + InvestFlowConstants.MAX_ONE_TIME_AMOUNT).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new C45792n((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: v */
    public final void m3421v(DataOutput dataOutput) {
        if (this.f6679d == 0) {
            if (this.f6678c == 0) {
                if (this.f6677b == 0) {
                    dataOutput.writeByte(~this.f6676a);
                    return;
                } else {
                    dataOutput.writeByte(this.f6676a);
                    dataOutput.writeByte(~this.f6677b);
                    return;
                }
            }
            dataOutput.writeByte(this.f6676a);
            dataOutput.writeByte(this.f6677b);
            dataOutput.writeByte(~this.f6678c);
            return;
        }
        dataOutput.writeByte(this.f6676a);
        dataOutput.writeByte(this.f6677b);
        dataOutput.writeByte(this.f6678c);
        dataOutput.writeInt(this.f6679d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* renamed from: q */
    public static LocalTime m3410q(DataInput dataInput) throws IOException {
        int i;
        int i2;
        int i3 = dataInput.readByte();
        byte b = 0;
        if (i3 < 0) {
            i3 = ~i3;
            i2 = 0;
            i = 0;
        } else {
            byte b2 = dataInput.readByte();
            if (b2 < 0) {
                ?? r5 = ~b2;
                i = 0;
                b = r5;
                i2 = 0;
            } else {
                byte b3 = dataInput.readByte();
                if (b3 < 0) {
                    i2 = ~b3;
                    i = 0;
                    b = b2;
                } else {
                    i = dataInput.readInt();
                    b = b2;
                    i2 = b3;
                }
            }
        }
        return m3409of(i3, b, i2, i);
    }
}
