package p479j$.time.chrono;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p479j$.time.AbstractC45723c;
import p479j$.time.C45754e;
import p479j$.time.Clock;
import p479j$.time.DateTimeException;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;
import p479j$.time.format.ResolverStyle;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.UnsupportedTemporalTypeException;
import p479j$.time.temporal.ValueRange;

/* renamed from: j$.time.chrono.o */
/* loaded from: classes29.dex */
public final class C45741o extends AbstractChronology implements Serializable {

    /* renamed from: d */
    public static final C45741o f6755d = new C45741o();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // p479j$.time.chrono.Chronology
    public final /* bridge */ /* synthetic */ ChronoLocalDate date(Era era, int i, int i2, int i3) {
        return m3515o(era, i, i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public final /* bridge */ /* synthetic */ ChronoLocalDate dateYearDay(Era era, int i, int i2) {
        return m3516p(era, i, i2);
    }

    private C45741o() {
    }

    @Override // p479j$.time.chrono.Chronology
    public final String getId() {
        return "Japanese";
    }

    @Override // p479j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "japanese";
    }

    /* renamed from: o */
    public static C45743q m3515o(Era era, int i, int i2, int i3) {
        if (!(era instanceof C45744r)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        C45744r c45744r = (C45744r) era;
        LocalDate localDate = C45743q.f6757d;
        Objects.requireNonNull(c45744r, "era");
        LocalDate localDateM3377of = LocalDate.m3377of((c45744r.f6764b.getYear() + i) - 1, i2, i3);
        if (localDateM3377of.isBefore(c45744r.f6764b) || c45744r != C45744r.m3521c(localDateM3377of)) {
            throw new DateTimeException("year, month, and day not valid for Era");
        }
        return new C45743q(c45744r, i, localDateM3377of);
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate date(int i, int i2, int i3) {
        return new C45743q(LocalDate.m3377of(i, i2, i3));
    }

    /* renamed from: p */
    public static C45743q m3516p(Era era, int i, int i2) {
        C45744r c45744r = (C45744r) era;
        LocalDate localDate = C45743q.f6757d;
        Objects.requireNonNull(c45744r, "era");
        LocalDate localDateOfYearDay = i == 1 ? LocalDate.ofYearDay(c45744r.f6764b.getYear(), (c45744r.f6764b.getDayOfYear() + i2) - 1) : LocalDate.ofYearDay((c45744r.f6764b.getYear() + i) - 1, i2);
        if (localDateOfYearDay.isBefore(c45744r.f6764b) || c45744r != C45744r.m3521c(localDateOfYearDay)) {
            throw new DateTimeException("Invalid parameters");
        }
        return new C45743q(c45744r, i, localDateOfYearDay);
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateYearDay(int i, int i2) {
        return new C45743q(LocalDate.ofYearDay(i, i2));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateEpochDay(long j) {
        return new C45743q(LocalDate.ofEpochDay(j));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow() {
        return new C45743q(LocalDate.from(LocalDate.now(Clock.systemDefaultZone())));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow(ZoneId zoneId) {
        return new C45743q(LocalDate.from(LocalDate.now(Clock.system(zoneId))));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow(Clock clock) {
        return new C45743q(LocalDate.from(LocalDate.now(clock)));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate date(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof C45743q) {
            return (C45743q) temporalAccessor;
        }
        return new C45743q(LocalDate.from(temporalAccessor));
    }

    @Override // p479j$.time.chrono.Chronology
    public final List eras() {
        C45744r[] c45744rArr = C45744r.f6762e;
        return AbstractC45723c.m3471b((C45744r[]) Arrays.copyOf(c45744rArr, c45744rArr.length));
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public final boolean isLeapYear(long j) {
        return IsoChronology.INSTANCE.isLeapYear(j);
    }

    @Override // p479j$.time.chrono.Chronology
    public final int prolepticYear(Era era, int i) {
        if (!(era instanceof C45744r)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        C45744r c45744r = (C45744r) era;
        int year = (c45744r.f6764b.getYear() + i) - 1;
        if (i != 1 && (year < -999999999 || year > 999999999 || year < c45744r.f6764b.getYear() || era != C45744r.m3521c(LocalDate.m3377of(year, 1, 1)))) {
            throw new DateTimeException("Invalid yearOfEra value");
        }
        return year;
    }

    @Override // p479j$.time.chrono.Chronology
    public final Era eraOf(int i) {
        return C45744r.m3522i(i);
    }

    @Override // p479j$.time.chrono.Chronology
    public final ValueRange range(ChronoField chronoField) {
        switch (AbstractC45740n.f6754a[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + chronoField);
            case 5:
                C45744r[] c45744rArr = C45744r.f6762e;
                int year = c45744rArr[c45744rArr.length - 1].f6764b.getYear();
                int year2 = 1000000000 - c45744rArr[c45744rArr.length - 1].f6764b.getYear();
                int year3 = c45744rArr[0].f6764b.getYear();
                int i = 1;
                while (true) {
                    C45744r[] c45744rArr2 = C45744r.f6762e;
                    if (i >= c45744rArr2.length) {
                        return ValueRange.m3599of(1L, year2, 999999999 - year);
                    }
                    C45744r c45744r = c45744rArr2[i];
                    year2 = Math.min(year2, (c45744r.f6764b.getYear() - year3) + 1);
                    year3 = c45744r.f6764b.getYear();
                    i++;
                }
            case 6:
                C45744r c45744r2 = C45744r.f6761d;
                long j = ChronoField.DAY_OF_YEAR.range().f6933c;
                long jMin = j;
                for (C45744r c45744r3 : C45744r.f6762e) {
                    long jMin2 = Math.min(jMin, (c45744r3.f6764b.lengthOfYear() - c45744r3.f6764b.getDayOfYear()) + 1);
                    jMin = c45744r3.m3523e() != null ? Math.min(jMin2, c45744r3.m3523e().f6764b.getDayOfYear() - 1) : jMin2;
                }
                return ValueRange.m3599of(1L, jMin, ChronoField.DAY_OF_YEAR.range().getMaximum());
            case 7:
                return ValueRange.m3598of(C45743q.f6757d.getYear(), 999999999L);
            case 8:
                long j2 = C45744r.f6761d.f6763a;
                C45744r[] c45744rArr3 = C45744r.f6762e;
                return ValueRange.m3598of(j2, c45744rArr3[c45744rArr3.length - 1].f6763a);
            default:
                return chronoField.range();
        }
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public final ChronoLocalDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return (C45743q) super.resolveDate(map, resolverStyle);
    }

    @Override // p479j$.time.chrono.AbstractChronology
    /* renamed from: n */
    public final ChronoLocalDate mo3479n(Map map, ResolverStyle resolverStyle) {
        C45743q c45743qM3518n;
        ChronoField chronoField = ChronoField.ERA;
        Long l = (Long) map.get(chronoField);
        C45744r c45744rM3522i = l != null ? C45744r.m3522i(range(chronoField).checkValidIntValue(l.longValue(), chronoField)) : null;
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l2 = (Long) map.get(chronoField2);
        int iCheckValidIntValue = l2 != null ? range(chronoField2).checkValidIntValue(l2.longValue(), chronoField2) : 0;
        if (c45744rM3522i == null && l2 != null && !map.containsKey(ChronoField.YEAR) && resolverStyle != ResolverStyle.STRICT) {
            C45744r[] c45744rArr = C45744r.f6762e;
            c45744rM3522i = ((C45744r[]) Arrays.copyOf(c45744rArr, c45744rArr.length))[((C45744r[]) Arrays.copyOf(c45744rArr, c45744rArr.length)).length - 1];
        }
        if (l2 != null && c45744rM3522i != null) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                ChronoField chronoField4 = ChronoField.DAY_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    map.remove(chronoField);
                    map.remove(chronoField2);
                    if (resolverStyle == ResolverStyle.LENIENT) {
                        return new C45743q(LocalDate.m3377of((c45744rM3522i.f6764b.getYear() + iCheckValidIntValue) - 1, 1, 1)).m3517m(Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L), ChronoUnit.MONTHS).m3517m(Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iCheckValidIntValue2 = range(chronoField3).checkValidIntValue(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int iCheckValidIntValue3 = range(chronoField4).checkValidIntValue(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    if (resolverStyle != ResolverStyle.SMART) {
                        return m3515o(c45744rM3522i, iCheckValidIntValue, iCheckValidIntValue2, iCheckValidIntValue3);
                    }
                    if (iCheckValidIntValue < 1) {
                        throw new DateTimeException("Invalid YearOfEra: " + iCheckValidIntValue);
                    }
                    int year = (c45744rM3522i.f6764b.getYear() + iCheckValidIntValue) - 1;
                    try {
                        c45743qM3518n = new C45743q(LocalDate.m3377of(year, iCheckValidIntValue2, iCheckValidIntValue3));
                    } catch (DateTimeException unused) {
                        c45743qM3518n = new C45743q(LocalDate.m3377of(year, iCheckValidIntValue2, 1)).m3518n(new C45754e(7));
                    }
                    if (c45743qM3518n.f6759b == c45744rM3522i || c45743qM3518n.get(ChronoField.YEAR_OF_ERA) <= 1 || iCheckValidIntValue <= 1) {
                        return c45743qM3518n;
                    }
                    throw new DateTimeException("Invalid YearOfEra for Era: " + c45744rM3522i + PlaceholderUtils.XXShortPlaceholderText + iCheckValidIntValue);
                }
            }
            ChronoField chronoField5 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField5)) {
                map.remove(chronoField);
                map.remove(chronoField2);
                if (resolverStyle != ResolverStyle.LENIENT) {
                    return m3516p(c45744rM3522i, iCheckValidIntValue, range(chronoField5).checkValidIntValue(((Long) map.remove(chronoField5)).longValue(), chronoField5));
                }
                return new C45743q(LocalDate.ofYearDay((c45744rM3522i.f6764b.getYear() + iCheckValidIntValue) - 1, 1)).m3517m(Math.subtractExact(((Long) map.remove(chronoField5)).longValue(), 1L), ChronoUnit.DAYS);
            }
        }
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C45750x((byte) 1, this);
    }
}
