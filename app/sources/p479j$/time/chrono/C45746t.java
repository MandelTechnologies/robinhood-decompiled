package p479j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import p479j$.time.AbstractC45723c;
import p479j$.time.Clock;
import p479j$.time.DateTimeException;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;
import p479j$.time.format.ResolverStyle;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.ValueRange;

/* renamed from: j$.time.chrono.t */
/* loaded from: classes29.dex */
public final class C45746t extends AbstractChronology implements Serializable {

    /* renamed from: d */
    public static final C45746t f6767d = new C45746t();
    private static final long serialVersionUID = 1039765215346859963L;

    private C45746t() {
    }

    @Override // p479j$.time.chrono.Chronology
    public final String getId() {
        return "Minguo";
    }

    @Override // p479j$.time.chrono.Chronology
    public final Era eraOf(int i) {
        if (i == 0) {
            return EnumC45749w.BEFORE_ROC;
        }
        if (i == 1) {
            return EnumC45749w.ROC;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // p479j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "roc";
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate date(Era era, int i, int i2, int i3) {
        return new C45748v(LocalDate.m3377of(prolepticYear(era, i) + 1911, i2, i3));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate date(int i, int i2, int i3) {
        return new C45748v(LocalDate.m3377of(i + 1911, i2, i3));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateYearDay(Era era, int i, int i2) {
        return new C45748v(LocalDate.ofYearDay(prolepticYear(era, i) + 1911, i2));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateYearDay(int i, int i2) {
        return new C45748v(LocalDate.ofYearDay(i + 1911, i2));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateEpochDay(long j) {
        return new C45748v(LocalDate.ofEpochDay(j));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow() {
        return new C45748v(LocalDate.from(LocalDate.now(Clock.systemDefaultZone())));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow(ZoneId zoneId) {
        return new C45748v(LocalDate.from(LocalDate.now(Clock.system(zoneId))));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow(Clock clock) {
        return new C45748v(LocalDate.from(LocalDate.now(clock)));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate date(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof C45748v) {
            return (C45748v) temporalAccessor;
        }
        return new C45748v(LocalDate.from(temporalAccessor));
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public final boolean isLeapYear(long j) {
        return IsoChronology.INSTANCE.isLeapYear(j + 1911);
    }

    @Override // p479j$.time.chrono.Chronology
    public final int prolepticYear(Era era, int i) {
        if (era instanceof EnumC45749w) {
            return era == EnumC45749w.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // p479j$.time.chrono.Chronology
    public final List eras() {
        return AbstractC45723c.m3471b(EnumC45749w.values());
    }

    @Override // p479j$.time.chrono.Chronology
    public final ValueRange range(ChronoField chronoField) {
        int i = AbstractC45745s.f6766a[chronoField.ordinal()];
        if (i == 1) {
            ValueRange valueRangeRange = ChronoField.PROLEPTIC_MONTH.range();
            return ValueRange.m3598of(valueRangeRange.f6931a - 22932, valueRangeRange.getMaximum() - 22932);
        }
        if (i == 2) {
            ValueRange valueRangeRange2 = ChronoField.YEAR.range();
            return ValueRange.m3599of(1L, valueRangeRange2.getMaximum() - 1911, (-valueRangeRange2.f6931a) + 1912);
        }
        if (i == 3) {
            ValueRange valueRangeRange3 = ChronoField.YEAR.range();
            return ValueRange.m3598of(valueRangeRange3.f6931a - 1911, valueRangeRange3.getMaximum() - 1911);
        }
        return chronoField.range();
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public final ChronoLocalDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return (C45748v) super.resolveDate(map, resolverStyle);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C45750x((byte) 1, this);
    }
}
