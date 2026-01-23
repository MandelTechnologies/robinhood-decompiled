package p479j$.time;

import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState4;
import com.robinhood.models.card.p311db.Card;
import com.squareup.wire.internal.MathMethods;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p479j$.time.chrono.ChronoLocalDateTime;
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
import p479j$.time.temporal.ValueRange;

/* loaded from: classes29.dex */
public final class LocalDateTime implements Temporal, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a */
    public final LocalDate f6673a;

    /* renamed from: b */
    public final LocalTime f6674b;
    public static final LocalDateTime MIN = m3393of(LocalDate.MIN, LocalTime.MIN);
    public static final LocalDateTime MAX = m3393of(LocalDate.MAX, LocalTime.MAX);

    public static LocalDateTime now() {
        return now(Clock.systemDefaultZone());
    }

    public static LocalDateTime now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    public static LocalDateTime now(Clock clock) {
        Objects.requireNonNull(clock, Card.Icon.CLOCK);
        Instant instant = clock.instant();
        return ofEpochSecond(instant.getEpochSecond(), instant.getNano(), clock.getZone().getRules().getOffset(instant));
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return new OffsetDateTime(this, zoneOffset);
    }

    @Override // p479j$.time.chrono.ChronoLocalDateTime
    /* renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime mo3396g(ZoneId zoneId) {
        return ZonedDateTime.m3457j(this, zoneId, null);
    }

    /* renamed from: of */
    public static LocalDateTime m3391of(int i, int i2, int i3, int i4, int i5) {
        return new LocalDateTime(LocalDate.m3377of(i, i2, i3), LocalTime.m3408of(i4, i5));
    }

    /* renamed from: of */
    public static LocalDateTime m3392of(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new LocalDateTime(LocalDate.m3377of(i, i2, i3), LocalTime.m3409of(i4, i5, i6, i7));
    }

    /* renamed from: of */
    public static LocalDateTime m3393of(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, InquiryField.DateField.TYPE);
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, GoldFeature.INSTANT);
        Objects.requireNonNull(zoneId, "zone");
        return ofEpochSecond(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().getOffset(instant));
    }

    public static LocalDateTime ofEpochSecond(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        ChronoField.NANO_OF_SECOND.checkValidValue(j2);
        return new LocalDateTime(LocalDate.ofEpochDay(Math.floorDiv(j + zoneOffset.getTotalSeconds(), OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC)), LocalTime.m3407k((((int) Math.floorMod(r5, r7)) * MathMethods.NANOS_PER_SECOND) + j2));
    }

    /* renamed from: i */
    public static LocalDateTime m3390i(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).mo3461d();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.from(temporalAccessor), LocalTime.m3406i(temporalAccessor));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f6798h;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.parse(charSequence, new C45754e(2));
    }

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.f6673a = localDate;
        this.f6674b = localTime;
    }

    /* renamed from: o */
    public final LocalDateTime m3402o(LocalDate localDate, LocalTime localTime) {
        return (this.f6673a == localDate && this.f6674b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.isSupportedBy(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.isDateBased() || chronoField.m3595i();
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).m3595i() ? this.f6674b.range(temporalField) : this.f6673a.range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).m3595i() ? this.f6674b.get(temporalField) : this.f6673a.get(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).m3595i() ? this.f6674b.getLong(temporalField) : this.f6673a.getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    @Override // p479j$.time.chrono.ChronoLocalDateTime
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate mo3394a() {
        return this.f6673a;
    }

    public int getYear() {
        return this.f6673a.getYear();
    }

    public int getMonthValue() {
        return this.f6673a.getMonthValue();
    }

    public int getDayOfYear() {
        return this.f6673a.getDayOfYear();
    }

    public DayOfWeek getDayOfWeek() {
        return this.f6673a.getDayOfWeek();
    }

    @Override // p479j$.time.chrono.ChronoLocalDateTime
    public LocalTime toLocalTime() {
        return this.f6674b;
    }

    public int getHour() {
        return this.f6674b.f6676a;
    }

    public int getMinute() {
        return this.f6674b.getMinute();
    }

    public int getSecond() {
        return this.f6674b.f6678c;
    }

    public int getNano() {
        return this.f6674b.f6679d;
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime with(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalDate) {
            return m3402o((LocalDate) temporalAdjuster, this.f6674b);
        }
        if (temporalAdjuster instanceof LocalTime) {
            return m3402o(this.f6673a, (LocalTime) temporalAdjuster);
        }
        if (temporalAdjuster instanceof LocalDateTime) {
            return (LocalDateTime) temporalAdjuster;
        }
        return (LocalDateTime) temporalAdjuster.adjustInto(this);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).m3595i()) {
                return m3402o(this.f6673a, this.f6674b.with(temporalField, j));
            }
            return m3402o(this.f6673a.with(temporalField, j), this.f6674b);
        }
        return (LocalDateTime) temporalField.adjustInto(this, j);
    }

    public LocalDateTime withHour(int i) {
        return m3402o(this.f6673a, this.f6674b.m3419t(i));
    }

    public LocalDateTime withMinute(int i) {
        LocalTime localTimeM3405c = this.f6674b;
        if (localTimeM3405c.f6677b != i) {
            ChronoField.MINUTE_OF_HOUR.checkValidValue(i);
            localTimeM3405c = LocalTime.m3405c(localTimeM3405c.f6676a, i, localTimeM3405c.f6678c, localTimeM3405c.f6679d);
        }
        return m3402o(this.f6673a, localTimeM3405c);
    }

    public LocalDateTime withSecond(int i) {
        LocalTime localTimeM3405c = this.f6674b;
        if (localTimeM3405c.f6678c != i) {
            ChronoField.SECOND_OF_MINUTE.checkValidValue(i);
            localTimeM3405c = LocalTime.m3405c(localTimeM3405c.f6676a, localTimeM3405c.f6677b, i, localTimeM3405c.f6679d);
        }
        return m3402o(this.f6673a, localTimeM3405c);
    }

    public LocalDateTime withNano(int i) {
        return m3402o(this.f6673a, this.f6674b.m3420u(i));
    }

    public LocalDateTime truncatedTo(TemporalUnit temporalUnit) {
        LocalDate localDate = this.f6673a;
        LocalTime localTimeM3407k = this.f6674b;
        localTimeM3407k.getClass();
        if (temporalUnit != ChronoUnit.NANOS) {
            Duration duration = temporalUnit.getDuration();
            if (duration.getSeconds() > 86400) {
                throw new UnsupportedTemporalTypeException("Unit is too large to be used for truncation");
            }
            long j = duration.f6666a;
            long j2 = duration.f6667b;
            if (j < 0) {
                j++;
                j2 -= MathMethods.NANOS_PER_SECOND;
            }
            long jAddExact = Math.addExact(Math.multiplyExact(j, MathMethods.NANOS_PER_SECOND), j2);
            if (86400000000000L % jAddExact != 0) {
                throw new UnsupportedTemporalTypeException("Unit must divide into a standard day without remainder");
            }
            localTimeM3407k = LocalTime.m3407k((localTimeM3407k.m3417r() / jAddExact) * jAddExact);
        }
        return m3402o(localDate, localTimeM3407k);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime plus(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            return m3402o(this.f6673a.plus((Period) temporalAmount), this.f6674b);
        }
        Objects.requireNonNull(temporalAmount, "amountToAdd");
        return (LocalDateTime) temporalAmount.addTo(this);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime plus(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.addTo(this, j);
        }
        switch (AbstractC45786h.f6896a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m3401n(this.f6673a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimePlusDays = plusDays(j / 86400000000L);
                return localDateTimePlusDays.m3401n(localDateTimePlusDays.f6673a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimePlusDays2 = plusDays(j / 86400000);
                return localDateTimePlusDays2.m3401n(localDateTimePlusDays2.f6673a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return m3400m(j);
            case 5:
                return plusMinutes(j);
            case 6:
                return plusHours(j);
            case 7:
                return plusDays(j / 256).plusHours((j % 256) * 12);
            default:
                return m3402o(this.f6673a.plus(j, temporalUnit), this.f6674b);
        }
    }

    public LocalDateTime plusMonths(long j) {
        return m3402o(this.f6673a.plusMonths(j), this.f6674b);
    }

    public LocalDateTime plusDays(long j) {
        return m3402o(this.f6673a.plusDays(j), this.f6674b);
    }

    public LocalDateTime plusHours(long j) {
        return m3401n(this.f6673a, j, 0L, 0L, 0L);
    }

    public LocalDateTime plusMinutes(long j) {
        return m3401n(this.f6673a, 0L, j, 0L, 0L);
    }

    /* renamed from: m */
    public final LocalDateTime m3400m(long j) {
        return m3401n(this.f6673a, 0L, 0L, j, 0L);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime minus(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            return m3402o(this.f6673a.minus((Period) temporalAmount), this.f6674b);
        }
        Objects.requireNonNull(temporalAmount, "amountToSubtract");
        return (LocalDateTime) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public final ChronoLocalDateTime minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // p479j$.time.temporal.Temporal
    public final Temporal minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public LocalDateTime minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    /* renamed from: n */
    public final LocalDateTime m3401n(LocalDate localDate, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return m3402o(localDate, this.f6674b);
        }
        long j5 = 1;
        long j6 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * MathMethods.NANOS_PER_SECOND) + (j4 % 86400000000000L);
        long jM3417r = this.f6674b.m3417r();
        long j7 = (j6 * j5) + jM3417r;
        long jFloorDiv = Math.floorDiv(j7, 86400000000000L) + (((j / 24) + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L)) * j5);
        long jFloorMod = Math.floorMod(j7, 86400000000000L);
        return m3402o(localDate.plusDays(jFloorDiv), jFloorMod == jM3417r ? this.f6674b : LocalTime.m3407k(jFloorMod));
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.localDate()) {
            return this.f6673a;
        }
        return super.query(temporalQuery);
    }

    @Override // p479j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        long jMultiplyExact;
        long j;
        LocalDateTime localDateTimeM3390i = m3390i(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateTimeM3390i);
        }
        if (!((ChronoUnit) temporalUnit).isTimeBased()) {
            LocalDate localDatePlusDays = localDateTimeM3390i.f6673a;
            if (localDatePlusDays.isAfter(this.f6673a) && localDateTimeM3390i.f6674b.compareTo(this.f6674b) < 0) {
                localDatePlusDays = localDatePlusDays.minusDays(1L);
            } else if (localDatePlusDays.isBefore(this.f6673a) && localDateTimeM3390i.f6674b.compareTo(this.f6674b) > 0) {
                localDatePlusDays = localDatePlusDays.plusDays(1L);
            }
            return this.f6673a.until(localDatePlusDays, temporalUnit);
        }
        LocalDate localDate = this.f6673a;
        LocalDate localDate2 = localDateTimeM3390i.f6673a;
        localDate.getClass();
        long epochDay = localDate2.toEpochDay() - localDate.toEpochDay();
        if (epochDay == 0) {
            return this.f6674b.until(localDateTimeM3390i.f6674b, temporalUnit);
        }
        long jM3417r = localDateTimeM3390i.f6674b.m3417r() - this.f6674b.m3417r();
        if (epochDay > 0) {
            jMultiplyExact = epochDay - 1;
            j = jM3417r + 86400000000000L;
        } else {
            jMultiplyExact = epochDay + 1;
            j = jM3417r - 86400000000000L;
        }
        switch (AbstractC45786h.f6896a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000000L);
                break;
            case 2:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000L);
                j /= 1000;
                break;
            case 3:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000L);
                j /= 1000000;
                break;
            case 4:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC);
                j /= MathMethods.NANOS_PER_SECOND;
                break;
            case 5:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 1440);
                j /= 60000000000L;
                break;
            case 6:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 24);
                j /= 3600000000000L;
                break;
            case 7:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 2);
                j /= 43200000000000L;
                break;
        }
        return Math.addExact(jMultiplyExact, j);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p479j$.time.chrono.ChronoLocalDateTime, java.lang.Comparable
    public int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return m3395c((LocalDateTime) chronoLocalDateTime);
        }
        return super.compareTo((ChronoLocalDateTime) chronoLocalDateTime);
    }

    /* renamed from: c */
    public final int m3395c(LocalDateTime localDateTime) {
        int iM3380c = this.f6673a.m3380c(localDateTime.mo3394a());
        return iM3380c == 0 ? this.f6674b.compareTo(localDateTime.toLocalTime()) : iM3380c;
    }

    public boolean isBefore(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return m3395c((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long epochDay = mo3394a().toEpochDay();
        long epochDay2 = chronoLocalDateTime.mo3394a().toEpochDay();
        return epochDay < epochDay2 || (epochDay == epochDay2 && toLocalTime().m3417r() < chronoLocalDateTime.toLocalTime().m3417r());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f6673a.equals(localDateTime.f6673a) && this.f6674b.equals(localDateTime.f6674b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f6673a.hashCode() ^ this.f6674b.hashCode();
    }

    public String toString() {
        return this.f6673a.toString() + "T" + this.f6674b.toString();
    }

    private Object writeReplace() {
        return new C45792n((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
