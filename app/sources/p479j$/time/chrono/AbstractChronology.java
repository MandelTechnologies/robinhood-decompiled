package p479j$.time.chrono;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import p479j$.time.C45754e;
import p479j$.time.DateTimeException;
import p479j$.time.DayOfWeek;
import p479j$.time.format.ResolverStyle;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalAdjusters;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalUnit;

/* loaded from: classes29.dex */
public abstract class AbstractChronology implements Chronology {

    /* renamed from: a */
    public static final ConcurrentHashMap f6712a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final ConcurrentHashMap f6713b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final Locale f6714c = new Locale("ja", CountryCode.COUNTRY_CODE_JP, CountryCode.COUNTRY_CODE_JP);

    @Override // p479j$.time.chrono.Chronology
    public abstract /* synthetic */ boolean isLeapYear(long j);

    /* renamed from: j */
    public static Chronology m3474j(Chronology chronology, String str) {
        String calendarType;
        Chronology chronology2 = (Chronology) f6712a.putIfAbsent(str, chronology);
        if (chronology2 == null && (calendarType = chronology.getCalendarType()) != null) {
            f6713b.putIfAbsent(calendarType, chronology);
        }
        return chronology2;
    }

    /* renamed from: i */
    public static boolean m3473i() {
        if (f6712a.get("ISO") != null) {
            return false;
        }
        C45736j c45736j = C45736j.f6735o;
        m3474j(c45736j, c45736j.getId());
        C45741o c45741o = C45741o.f6755d;
        c45741o.getClass();
        m3474j(c45741o, "Japanese");
        C45746t c45746t = C45746t.f6767d;
        c45746t.getClass();
        m3474j(c45746t, "Minguo");
        C45752z c45752z = C45752z.f6774d;
        c45752z.getClass();
        m3474j(c45752z, "ThaiBuddhist");
        Iterator it = ServiceLoader.load(AbstractChronology.class, null).iterator();
        while (it.hasNext()) {
            AbstractChronology abstractChronology = (AbstractChronology) it.next();
            if (!abstractChronology.getId().equals("ISO")) {
                m3474j(abstractChronology, abstractChronology.getId());
            }
        }
        IsoChronology isoChronology = IsoChronology.INSTANCE;
        isoChronology.getClass();
        m3474j(isoChronology, "ISO");
        return true;
    }

    public static Chronology ofLocale(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        String unicodeLocaleType = locale.getUnicodeLocaleType("ca");
        if (unicodeLocaleType == null) {
            unicodeLocaleType = locale.equals(f6714c) ? "japanese" : null;
        }
        if (unicodeLocaleType == null || "iso".equals(unicodeLocaleType) || "iso8601".equals(unicodeLocaleType)) {
            return IsoChronology.INSTANCE;
        }
        do {
            Chronology chronology = (Chronology) f6713b.get(unicodeLocaleType);
            if (chronology != null) {
                return chronology;
            }
        } while (m3473i());
        Iterator it = ServiceLoader.load(Chronology.class).iterator();
        while (it.hasNext()) {
            Chronology chronology2 = (Chronology) it.next();
            if (unicodeLocaleType.equals(chronology2.getCalendarType())) {
                return chronology2;
            }
        }
        throw new DateTimeException("Unknown calendar system: ".concat(unicodeLocaleType));
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoLocalDate resolveDate(Map<TemporalField, Long> map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return dateEpochDay(map.remove(chronoField).longValue());
        }
        mo3477l(map, resolverStyle);
        ChronoLocalDate chronoLocalDateMo3479n = mo3479n(map, resolverStyle);
        if (chronoLocalDateMo3479n != null) {
            return chronoLocalDateMo3479n;
        }
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            return null;
        }
        ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
        if (map.containsKey(chronoField3)) {
            if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                return mo3478m(map, resolverStyle);
            }
            ChronoField chronoField4 = ChronoField.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(chronoField4)) {
                ChronoField chronoField5 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (!map.containsKey(chronoField5)) {
                    ChronoField chronoField6 = ChronoField.DAY_OF_WEEK;
                    if (map.containsKey(chronoField6)) {
                        int iCheckValidIntValue = range(chronoField2).checkValidIntValue(map.remove(chronoField2).longValue(), chronoField2);
                        if (resolverStyle == ResolverStyle.LENIENT) {
                            return m3475k(date(iCheckValidIntValue, 1, 1), Math.subtractExact(map.remove(chronoField3).longValue(), 1L), Math.subtractExact(map.remove(chronoField4).longValue(), 1L), Math.subtractExact(map.remove(chronoField6).longValue(), 1L));
                        }
                        int iCheckValidIntValue2 = range(chronoField3).checkValidIntValue(map.remove(chronoField3).longValue(), chronoField3);
                        ChronoLocalDate chronoLocalDateWith = date(iCheckValidIntValue, iCheckValidIntValue2, 1).plus((range(chronoField4).checkValidIntValue(map.remove(chronoField4).longValue(), chronoField4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).with(TemporalAdjusters.nextOrSame(DayOfWeek.m3368of(range(chronoField6).checkValidIntValue(map.remove(chronoField6).longValue(), chronoField6))));
                        if (resolverStyle != ResolverStyle.STRICT || chronoLocalDateWith.get(chronoField3) == iCheckValidIntValue2) {
                            return chronoLocalDateWith;
                        }
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                } else {
                    int iCheckValidIntValue3 = range(chronoField2).checkValidIntValue(map.remove(chronoField2).longValue(), chronoField2);
                    if (resolverStyle == ResolverStyle.LENIENT) {
                        long jSubtractExact = Math.subtractExact(map.remove(chronoField3).longValue(), 1L);
                        return date(iCheckValidIntValue3, 1, 1).plus(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).plus(Math.subtractExact(map.remove(chronoField4).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).plus(Math.subtractExact(map.remove(chronoField5).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iCheckValidIntValue4 = range(chronoField3).checkValidIntValue(map.remove(chronoField3).longValue(), chronoField3);
                    int iCheckValidIntValue5 = range(chronoField4).checkValidIntValue(map.remove(chronoField4).longValue(), chronoField4);
                    ChronoLocalDate chronoLocalDatePlus = date(iCheckValidIntValue3, iCheckValidIntValue4, 1).plus((range(chronoField5).checkValidIntValue(map.remove(chronoField5).longValue(), chronoField5) - 1) + ((iCheckValidIntValue5 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (resolverStyle != ResolverStyle.STRICT || chronoLocalDatePlus.get(chronoField3) == iCheckValidIntValue4) {
                        return chronoLocalDatePlus;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        ChronoField chronoField7 = ChronoField.DAY_OF_YEAR;
        if (!map.containsKey(chronoField7)) {
            ChronoField chronoField8 = ChronoField.ALIGNED_WEEK_OF_YEAR;
            if (!map.containsKey(chronoField8)) {
                return null;
            }
            ChronoField chronoField9 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
            if (!map.containsKey(chronoField9)) {
                ChronoField chronoField10 = ChronoField.DAY_OF_WEEK;
                if (!map.containsKey(chronoField10)) {
                    return null;
                }
                int iCheckValidIntValue6 = range(chronoField2).checkValidIntValue(map.remove(chronoField2).longValue(), chronoField2);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    return m3475k(dateYearDay(iCheckValidIntValue6, 1), 0L, Math.subtractExact(map.remove(chronoField8).longValue(), 1L), Math.subtractExact(map.remove(chronoField10).longValue(), 1L));
                }
                ChronoLocalDate chronoLocalDateWith2 = dateYearDay(iCheckValidIntValue6, 1).plus((range(chronoField8).checkValidIntValue(map.remove(chronoField8).longValue(), chronoField8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).with(TemporalAdjusters.nextOrSame(DayOfWeek.m3368of(range(chronoField10).checkValidIntValue(map.remove(chronoField10).longValue(), chronoField10))));
                if (resolverStyle != ResolverStyle.STRICT || chronoLocalDateWith2.get(chronoField2) == iCheckValidIntValue6) {
                    return chronoLocalDateWith2;
                }
                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
            }
            int iCheckValidIntValue7 = range(chronoField2).checkValidIntValue(map.remove(chronoField2).longValue(), chronoField2);
            if (resolverStyle == ResolverStyle.LENIENT) {
                return dateYearDay(iCheckValidIntValue7, 1).plus(Math.subtractExact(map.remove(chronoField8).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).plus(Math.subtractExact(map.remove(chronoField9).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            int iCheckValidIntValue8 = range(chronoField8).checkValidIntValue(map.remove(chronoField8).longValue(), chronoField8);
            ChronoLocalDate chronoLocalDatePlus2 = dateYearDay(iCheckValidIntValue7, 1).plus((range(chronoField9).checkValidIntValue(map.remove(chronoField9).longValue(), chronoField9) - 1) + ((iCheckValidIntValue8 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (resolverStyle != ResolverStyle.STRICT || chronoLocalDatePlus2.get(chronoField2) == iCheckValidIntValue7) {
                return chronoLocalDatePlus2;
            }
            throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
        }
        int iCheckValidIntValue9 = range(chronoField2).checkValidIntValue(map.remove(chronoField2).longValue(), chronoField2);
        if (resolverStyle == ResolverStyle.LENIENT) {
            return dateYearDay(iCheckValidIntValue9, 1).plus(Math.subtractExact(map.remove(chronoField7).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        return dateYearDay(iCheckValidIntValue9, range(chronoField7).checkValidIntValue(map.remove(chronoField7).longValue(), chronoField7));
    }

    /* renamed from: l */
    public void mo3477l(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.checkValidValue(l.longValue());
            }
            ChronoLocalDate chronoLocalDateWith = dateNow().with((TemporalField) ChronoField.DAY_OF_MONTH, 1L).with((TemporalField) chronoField, l.longValue());
            m3472c(map, ChronoField.MONTH_OF_YEAR, chronoLocalDateWith.get(r0));
            m3472c(map, ChronoField.YEAR, chronoLocalDateWith.get(r0));
        }
    }

    /* renamed from: n */
    public ChronoLocalDate mo3479n(Map map, ResolverStyle resolverStyle) {
        int intExact;
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            Long l2 = (Long) map.remove(ChronoField.ERA);
            if (resolverStyle != ResolverStyle.LENIENT) {
                intExact = range(chronoField).checkValidIntValue(l.longValue(), chronoField);
            } else {
                intExact = Math.toIntExact(l.longValue());
            }
            if (l2 != null) {
                m3472c(map, ChronoField.YEAR, prolepticYear(eraOf(range(r2).checkValidIntValue(l2.longValue(), r2)), intExact));
                return null;
            }
            ChronoField chronoField2 = ChronoField.YEAR;
            if (map.containsKey(chronoField2)) {
                m3472c(map, chronoField2, prolepticYear(dateYearDay(range(chronoField2).checkValidIntValue(((Long) map.get(chronoField2)).longValue(), chronoField2), 1).getEra(), intExact));
                return null;
            }
            if (resolverStyle == ResolverStyle.STRICT) {
                map.put(chronoField, l);
                return null;
            }
            if (eras().isEmpty()) {
                m3472c(map, chronoField2, intExact);
                return null;
            }
            m3472c(map, chronoField2, prolepticYear(r9.get(r9.size() - 1), intExact));
            return null;
        }
        ChronoField chronoField3 = ChronoField.ERA;
        if (!map.containsKey(chronoField3)) {
            return null;
        }
        range(chronoField3).checkValidValue(((Long) map.get(chronoField3)).longValue(), chronoField3);
        return null;
    }

    /* renamed from: m */
    public ChronoLocalDate mo3478m(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int iCheckValidIntValue = range(chronoField).checkValidIntValue(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return date(iCheckValidIntValue, 1, 1).plus(jSubtractExact, (TemporalUnit) ChronoUnit.MONTHS).plus(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iCheckValidIntValue2 = range(chronoField2).checkValidIntValue(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iCheckValidIntValue3 = range(chronoField3).checkValidIntValue(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (resolverStyle != ResolverStyle.SMART) {
            return date(iCheckValidIntValue, iCheckValidIntValue2, iCheckValidIntValue3);
        }
        try {
            return date(iCheckValidIntValue, iCheckValidIntValue2, iCheckValidIntValue3);
        } catch (DateTimeException unused) {
            return date(iCheckValidIntValue, iCheckValidIntValue2, 1).with((TemporalAdjuster) new C45754e(7));
        }
    }

    /* renamed from: k */
    public static ChronoLocalDate m3475k(ChronoLocalDate chronoLocalDate, long j, long j2, long j3) {
        long j4;
        ChronoLocalDate chronoLocalDatePlus = chronoLocalDate.plus(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ChronoLocalDate chronoLocalDatePlus2 = chronoLocalDatePlus.plus(j2, (TemporalUnit) chronoUnit);
        if (j3 > 7) {
            long j5 = j3 - 1;
            chronoLocalDatePlus2 = chronoLocalDatePlus2.plus(j5 / 7, (TemporalUnit) chronoUnit);
            j4 = j5 % 7;
        } else {
            if (j3 < 1) {
                chronoLocalDatePlus2 = chronoLocalDatePlus2.plus(Math.subtractExact(j3, 7L) / 7, (TemporalUnit) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return chronoLocalDatePlus2.with(TemporalAdjusters.nextOrSame(DayOfWeek.m3368of((int) j3)));
        }
        j3 = j4 + 1;
        return chronoLocalDatePlus2.with(TemporalAdjusters.nextOrSame(DayOfWeek.m3368of((int) j3)));
    }

    /* renamed from: c */
    public static void m3472c(Map map, ChronoField chronoField, long j) {
        Long l = (Long) map.get(chronoField);
        if (l != null && l.longValue() != j) {
            throw new DateTimeException("Conflict found: " + chronoField + PlaceholderUtils.XXShortPlaceholderText + l + " differs from " + chronoField + PlaceholderUtils.XXShortPlaceholderText + j);
        }
        map.put(chronoField, Long.valueOf(j));
    }

    @Override // p479j$.time.chrono.Chronology, java.lang.Comparable
    /* renamed from: e */
    public final int compareTo(Chronology chronology) {
        return getId().compareTo(chronology.getId());
    }

    @Override // p479j$.time.chrono.Chronology
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractChronology) && compareTo((AbstractChronology) obj) == 0;
    }

    @Override // p479j$.time.chrono.Chronology
    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    @Override // p479j$.time.chrono.Chronology
    public final String toString() {
        return getId();
    }
}
