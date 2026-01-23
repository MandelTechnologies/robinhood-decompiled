package p479j$.time.chrono;

import com.robinhood.iso.countrycode.CountryCode;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
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

/* renamed from: j$.time.chrono.z */
/* loaded from: classes29.dex */
public final class C45752z extends AbstractChronology implements Serializable {

    /* renamed from: d */
    public static final C45752z f6774d = new C45752z();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", CountryCode.COUNTRY_CODE_BE});
        map.put("th", new String[]{"BB", CountryCode.COUNTRY_CODE_BE});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // p479j$.time.chrono.Chronology
    public final Era eraOf(int i) {
        if (i == 0) {
            return EnumC45726C.BEFORE_BE;
        }
        if (i == 1) {
            return EnumC45726C.f6716BE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    private C45752z() {
    }

    @Override // p479j$.time.chrono.Chronology
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // p479j$.time.chrono.Chronology
    public final String getCalendarType() {
        return "buddhist";
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate date(Era era, int i, int i2, int i3) {
        return new C45725B(LocalDate.m3377of(prolepticYear(era, i) - 543, i2, i3));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate date(int i, int i2, int i3) {
        return new C45725B(LocalDate.m3377of(i - 543, i2, i3));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateYearDay(Era era, int i, int i2) {
        return new C45725B(LocalDate.ofYearDay(prolepticYear(era, i) - 543, i2));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateYearDay(int i, int i2) {
        return new C45725B(LocalDate.ofYearDay(i - 543, i2));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateEpochDay(long j) {
        return new C45725B(LocalDate.ofEpochDay(j));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow() {
        return new C45725B(LocalDate.from(LocalDate.now(Clock.systemDefaultZone())));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow(ZoneId zoneId) {
        return new C45725B(LocalDate.from(LocalDate.now(Clock.system(zoneId))));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate dateNow(Clock clock) {
        return new C45725B(LocalDate.from(LocalDate.now(clock)));
    }

    @Override // p479j$.time.chrono.Chronology
    public final ChronoLocalDate date(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof C45725B) {
            return (C45725B) temporalAccessor;
        }
        return new C45725B(LocalDate.from(temporalAccessor));
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public final boolean isLeapYear(long j) {
        return IsoChronology.INSTANCE.isLeapYear(j - 543);
    }

    @Override // p479j$.time.chrono.Chronology
    public final int prolepticYear(Era era, int i) {
        if (era instanceof EnumC45726C) {
            return era == EnumC45726C.f6716BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // p479j$.time.chrono.Chronology
    public final List eras() {
        return AbstractC45723c.m3471b(EnumC45726C.values());
    }

    @Override // p479j$.time.chrono.Chronology
    public final ValueRange range(ChronoField chronoField) {
        int i = AbstractC45751y.f6773a[chronoField.ordinal()];
        if (i == 1) {
            ValueRange valueRangeRange = ChronoField.PROLEPTIC_MONTH.range();
            return ValueRange.m3598of(valueRangeRange.f6931a + 6516, valueRangeRange.getMaximum() + 6516);
        }
        if (i == 2) {
            ValueRange valueRangeRange2 = ChronoField.YEAR.range();
            return ValueRange.m3599of(1L, (-(valueRangeRange2.f6931a + 543)) + 1, valueRangeRange2.getMaximum() + 543);
        }
        if (i == 3) {
            ValueRange valueRangeRange3 = ChronoField.YEAR.range();
            return ValueRange.m3598of(valueRangeRange3.f6931a + 543, valueRangeRange3.getMaximum() + 543);
        }
        return chronoField.range();
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public final ChronoLocalDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return (C45725B) super.resolveDate(map, resolverStyle);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C45750x((byte) 1, this);
    }
}
