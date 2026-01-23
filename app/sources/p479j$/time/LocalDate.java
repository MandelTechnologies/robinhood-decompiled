package p479j$.time;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState4;
import com.robinhood.models.card.p311db.Card;
import com.squareup.wire.internal.MathMethods;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.chrono.Chronology;
import p479j$.time.chrono.Era;
import p479j$.time.chrono.IsoChronology;
import p479j$.time.chrono.IsoEra;
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
import p479j$.time.zone.C45809b;

/* loaded from: classes29.dex */
public final class LocalDate implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a */
    public final int f6670a;

    /* renamed from: b */
    public final short f6671b;

    /* renamed from: c */
    public final short f6672c;
    public static final LocalDate MIN = m3377of(-999999999, 1, 1);
    public static final LocalDate MAX = m3377of(999999999, 12, 31);

    static {
        m3377of(1970, 1, 1);
    }

    public static LocalDate now() {
        return now(Clock.systemDefaultZone());
    }

    public static LocalDate now(ZoneId zoneId) {
        return now(Clock.system(zoneId));
    }

    public static LocalDate now(Clock clock) {
        Objects.requireNonNull(clock, Card.Icon.CLOCK);
        return ofInstant(clock.instant(), clock.getZone());
    }

    /* renamed from: of */
    public static LocalDate m3378of(int i, Month month, int i2) {
        ChronoField.YEAR.checkValidValue(i);
        Objects.requireNonNull(month, ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS);
        ChronoField.DAY_OF_MONTH.checkValidValue(i2);
        return m3376i(i, month.getValue(), i2);
    }

    /* renamed from: of */
    public static LocalDate m3377of(int i, int i2, int i3) {
        ChronoField.YEAR.checkValidValue(i);
        ChronoField.MONTH_OF_YEAR.checkValidValue(i2);
        ChronoField.DAY_OF_MONTH.checkValidValue(i3);
        return m3376i(i, i2, i3);
    }

    public static LocalDate ofYearDay(int i, int i2) {
        long j = i;
        ChronoField.YEAR.checkValidValue(j);
        ChronoField.DAY_OF_YEAR.checkValidValue(i2);
        boolean zIsLeapYear = IsoChronology.INSTANCE.isLeapYear(j);
        if (i2 == 366 && !zIsLeapYear) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        Month monthM3422of = Month.m3422of(((i2 - 1) / 31) + 1);
        if (i2 > (monthM3422of.length(zIsLeapYear) + monthM3422of.firstDayOfYear(zIsLeapYear)) - 1) {
            monthM3422of = monthM3422of.plus(1L);
        }
        return new LocalDate(i, monthM3422of.getValue(), (i2 - monthM3422of.firstDayOfYear(zIsLeapYear)) + 1);
    }

    public static LocalDate ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, GoldFeature.INSTANT);
        Objects.requireNonNull(zoneId, "zone");
        return ofEpochDay(Math.floorDiv(instant.getEpochSecond() + zoneId.getRules().getOffset(instant).getTotalSeconds(), OptionsSimulatedReturnTimeSliderDataState4.ONE_DAY_IN_SEC));
    }

    public static LocalDate ofEpochDay(long j) {
        long j2;
        ChronoField.EPOCH_DAY.checkValidValue(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE;
        return new LocalDate(ChronoField.YEAR.checkValidIntValue(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE) + 5) / 10)) + 1);
    }

    public static LocalDate from(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.query(TemporalQueries.localDate());
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalDate parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.parse(charSequence, new C45754e(1));
    }

    /* renamed from: i */
    public static LocalDate m3376i(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (IsoChronology.INSTANCE.isLeapYear(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + Month.m3422of(i2).name() + PlaceholderUtils.XXShortPlaceholderText + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    /* renamed from: r */
    public static LocalDate m3379r(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, IsoChronology.INSTANCE.isLeapYear((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public LocalDate(int i, int i2, int i3) {
        this.f6670a = i;
        this.f6671b = (short) i2;
        this.f6672c = (short) i3;
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.rangeRefinedBy(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (!chronoField.isDateBased()) {
            throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
        }
        int i = AbstractC45785g.f6894a[chronoField.ordinal()];
        if (i == 1) {
            return ValueRange.m3598of(1L, lengthOfMonth());
        }
        if (i == 2) {
            return ValueRange.m3598of(1L, lengthOfYear());
        }
        if (i != 3) {
            return i != 4 ? temporalField.range() : getYear() <= 0 ? ValueRange.m3598of(1L, MathMethods.NANOS_PER_SECOND) : ValueRange.m3598of(1L, 999999999L);
        }
        return ValueRange.m3598of(1L, (getMonth() != Month.FEBRUARY || isLeapYear()) ? 5L : 4L);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return m3381j((ChronoField) temporalField);
        }
        return super.get(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.EPOCH_DAY) {
                return toEpochDay();
            }
            if (temporalField == ChronoField.PROLEPTIC_MONTH) {
                return m3382k();
            }
            return m3381j((ChronoField) temporalField);
        }
        return temporalField.getFrom(this);
    }

    /* renamed from: j */
    public final int m3381j(ChronoField chronoField) {
        switch (AbstractC45785g.f6894a[chronoField.ordinal()]) {
            case 1:
                return this.f6672c;
            case 2:
                return getDayOfYear();
            case 3:
                return ((this.f6672c - 1) / 7) + 1;
            case 4:
                int i = this.f6670a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.f6672c - 1) % 7) + 1;
            case 7:
                return ((getDayOfYear() - 1) % 7) + 1;
            case 8:
                throw new UnsupportedTemporalTypeException("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((getDayOfYear() - 1) / 7) + 1;
            case 10:
                return this.f6671b;
            case 11:
                throw new UnsupportedTemporalTypeException("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f6670a;
            case 13:
                return this.f6670a >= 1 ? 1 : 0;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + chronoField);
        }
    }

    /* renamed from: k */
    public final long m3382k() {
        return ((this.f6670a * 12) + this.f6671b) - 1;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final Chronology getChronology() {
        return IsoChronology.INSTANCE;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final Era getEra() {
        return getYear() >= 1 ? IsoEra.f6718CE : IsoEra.BCE;
    }

    public int getYear() {
        return this.f6670a;
    }

    public int getMonthValue() {
        return this.f6671b;
    }

    public Month getMonth() {
        return Month.m3422of(this.f6671b);
    }

    public int getDayOfMonth() {
        return this.f6672c;
    }

    public int getDayOfYear() {
        return (getMonth().firstDayOfYear(isLeapYear()) + this.f6672c) - 1;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.m3368of(((int) Math.floorMod(toEpochDay() + 3, 7)) + 1);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public final boolean isLeapYear() {
        return IsoChronology.INSTANCE.isLeapYear(this.f6670a);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int lengthOfMonth() {
        short s = this.f6671b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : isLeapYear() ? 29 : 28;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // p479j$.time.temporal.Temporal
    public LocalDate with(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalDate) {
            return (LocalDate) temporalAdjuster;
        }
        return (LocalDate) temporalAdjuster.adjustInto(this);
    }

    @Override // p479j$.time.temporal.Temporal
    public LocalDate with(TemporalField temporalField, long j) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDate) temporalField.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.checkValidValue(j);
        switch (AbstractC45785g.f6894a[chronoField.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.f6672c != i) {
                    return m3377of(this.f6670a, this.f6671b, i);
                }
                return this;
            case 2:
                return withDayOfYear((int) j);
            case 3:
                return m3388q(j - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f6670a < 1) {
                    j = 1 - j;
                }
                return m3389s((int) j);
            case 5:
                return plusDays(j - getDayOfWeek().getValue());
            case 6:
                return plusDays(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j);
            case 9:
                return m3388q(j - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i2 = (int) j;
                if (this.f6671b != i2) {
                    ChronoField.MONTH_OF_YEAR.checkValidValue(i2);
                    return m3379r(this.f6670a, i2, this.f6672c);
                }
                return this;
            case 11:
                return plusMonths(j - m3382k());
            case 12:
                return m3389s((int) j);
            case 13:
                if (getLong(ChronoField.ERA) != j) {
                    return m3389s(1 - this.f6670a);
                }
                return this;
            default:
                throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
        }
    }

    /* renamed from: s */
    public final LocalDate m3389s(int i) {
        if (this.f6670a == i) {
            return this;
        }
        ChronoField.YEAR.checkValidValue(i);
        return m3379r(i, this.f6671b, this.f6672c);
    }

    public LocalDate withDayOfYear(int i) {
        return getDayOfYear() == i ? this : ofYearDay(this.f6670a, i);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final LocalDate plus(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            return plusMonths(((Period) temporalAmount).toTotalMonths()).plusDays(r4.getDays());
        }
        Objects.requireNonNull(temporalAmount, "amountToAdd");
        return (LocalDate) temporalAmount.addTo(this);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final LocalDate plus(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.addTo(this, j);
        }
        switch (AbstractC45785g.f6895b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return m3388q(j);
            case 3:
                return plusMonths(j);
            case 4:
                return plusYears(j);
            case 5:
                return plusYears(Math.multiplyExact(j, 10));
            case 6:
                return plusYears(Math.multiplyExact(j, 100));
            case 7:
                return plusYears(Math.multiplyExact(j, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return with((TemporalField) chronoField, Math.addExact(getLong(chronoField), j));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
    }

    public LocalDate plusYears(long j) {
        return j == 0 ? this : m3379r(ChronoField.YEAR.checkValidIntValue(this.f6670a + j), this.f6671b, this.f6672c);
    }

    public LocalDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.f6670a * 12) + (this.f6671b - 1) + j;
        long j3 = 12;
        return m3379r(ChronoField.YEAR.checkValidIntValue(Math.floorDiv(j2, j3)), ((int) Math.floorMod(j2, j3)) + 1, this.f6672c);
    }

    /* renamed from: q */
    public final LocalDate m3388q(long j) {
        return plusDays(Math.multiplyExact(j, 7));
    }

    public LocalDate plusDays(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.f6672c + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new LocalDate(this.f6670a, this.f6671b, (int) j2);
            }
            if (j2 <= 59) {
                long jLengthOfMonth = lengthOfMonth();
                if (j2 <= jLengthOfMonth) {
                    return new LocalDate(this.f6670a, this.f6671b, (int) j2);
                }
                short s = this.f6671b;
                if (s < 12) {
                    return new LocalDate(this.f6670a, s + 1, (int) (j2 - jLengthOfMonth));
                }
                ChronoField.YEAR.checkValidValue(this.f6670a + 1);
                return new LocalDate(this.f6670a + 1, 1, (int) (j2 - jLengthOfMonth));
            }
        }
        return ofEpochDay(Math.addExact(toEpochDay(), j));
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final LocalDate minus(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            long totalMonths = ((Period) temporalAmount).toTotalMonths();
            return (totalMonths == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-totalMonths)).minusDays(r5.getDays());
        }
        Objects.requireNonNull(temporalAmount, "amountToSubtract");
        return (LocalDate) temporalAmount.subtractFrom(this);
    }

    @Override // p479j$.time.temporal.Temporal
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final LocalDate minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public LocalDate minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    public LocalDate minusWeeks(long j) {
        return j == Long.MIN_VALUE ? m3388q(Long.MAX_VALUE).m3388q(1L) : m3388q(-j);
    }

    public LocalDate minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final Object query(TemporalQuery temporalQuery) {
        return temporalQuery == TemporalQueries.localDate() ? this : super.query(temporalQuery);
    }

    @Override // p479j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.between(this, localDateFrom);
        }
        switch (AbstractC45785g.f6895b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateFrom.toEpochDay() - toEpochDay();
            case 2:
                return (localDateFrom.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return m3385n(localDateFrom);
            case 4:
                return m3385n(localDateFrom) / 12;
            case 5:
                return m3385n(localDateFrom) / 120;
            case 6:
                return m3385n(localDateFrom) / 1200;
            case 7:
                return m3385n(localDateFrom) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return localDateFrom.getLong(chronoField) - getLong(chronoField);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
        }
    }

    /* renamed from: n */
    public final long m3385n(LocalDate localDate) {
        return (((localDate.m3382k() * 32) + localDate.getDayOfMonth()) - ((m3382k() * 32) + getDayOfMonth())) / 32;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public Period until(ChronoLocalDate chronoLocalDate) {
        LocalDate localDateFrom = from(chronoLocalDate);
        long jM3382k = localDateFrom.m3382k() - m3382k();
        int iLengthOfMonth = localDateFrom.f6672c - this.f6672c;
        if (jM3382k > 0 && iLengthOfMonth < 0) {
            jM3382k--;
            iLengthOfMonth = (int) (localDateFrom.toEpochDay() - plusMonths(jM3382k).toEpochDay());
        } else if (jM3382k < 0 && iLengthOfMonth > 0) {
            jM3382k++;
            iLengthOfMonth -= localDateFrom.lengthOfMonth();
        }
        return Period.m3431a(Math.toIntExact(jM3382k / 12), (int) (jM3382k % 12), iLengthOfMonth);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public LocalDateTime atTime(LocalTime localTime) {
        return LocalDateTime.m3393of(this, localTime);
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.m3393of(this, LocalTime.MIDNIGHT);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime localDateTimeAtTime = atTime(LocalTime.MIDNIGHT);
        if (!(zoneId instanceof ZoneOffset)) {
            Object objM3622d = zoneId.getRules().m3622d(localDateTimeAtTime);
            C45809b c45809b = objM3622d instanceof C45809b ? (C45809b) objM3622d : null;
            if (c45809b != null && c45809b.m3629c()) {
                localDateTimeAtTime = c45809b.f6983b.m3400m(c45809b.f6985d.getTotalSeconds() - c45809b.f6984c.getTotalSeconds());
            }
        }
        return ZonedDateTime.m3457j(localDateTimeAtTime, zoneId, null);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j = this.f6670a;
        long j2 = this.f6671b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.f6672c - 1);
        if (j2 > 2) {
            j4 = !isLeapYear() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p479j$.time.chrono.ChronoLocalDate, java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return m3380c((LocalDate) chronoLocalDate);
        }
        return super.compareTo(chronoLocalDate);
    }

    /* renamed from: c */
    public final int m3380c(LocalDate localDate) {
        int i = this.f6670a - localDate.f6670a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f6671b - localDate.f6671b;
        return i2 == 0 ? this.f6672c - localDate.f6672c : i2;
    }

    public boolean isAfter(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? m3380c((LocalDate) chronoLocalDate) > 0 : toEpochDay() > chronoLocalDate.toEpochDay();
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public boolean isBefore(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return m3380c((LocalDate) chronoLocalDate) < 0;
        }
        return super.isBefore(chronoLocalDate);
    }

    public boolean isEqual(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? m3380c((LocalDate) chronoLocalDate) == 0 : toEpochDay() == chronoLocalDate.toEpochDay();
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && m3380c((LocalDate) obj) == 0;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i = this.f6670a;
        return (((i << 11) + (this.f6671b << 6)) + this.f6672c) ^ (i & (-2048));
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i = this.f6670a;
        short s = this.f6671b;
        short s2 = this.f6672c;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C45792n((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
