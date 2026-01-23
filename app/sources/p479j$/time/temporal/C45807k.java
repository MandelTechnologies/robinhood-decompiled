package p479j$.time.temporal;

import java.util.Map;
import p479j$.time.DateTimeException;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.chrono.Chronology;
import p479j$.time.format.C45757B;
import p479j$.time.format.ResolverStyle;

/* renamed from: j$.time.temporal.k */
/* loaded from: classes29.dex */
public final class C45807k implements TemporalField {

    /* renamed from: f */
    public static final ValueRange f6958f = ValueRange.m3598of(1, 7);

    /* renamed from: g */
    public static final ValueRange f6959g = ValueRange.m3600of(0, 1, 4, 6);

    /* renamed from: h */
    public static final ValueRange f6960h = ValueRange.m3600of(0, 1, 52, 54);

    /* renamed from: i */
    public static final ValueRange f6961i = ValueRange.m3599of(1, 52, 53);

    /* renamed from: a */
    public final String f6962a;

    /* renamed from: b */
    public final WeekFields f6963b;

    /* renamed from: c */
    public final TemporalUnit f6964c;

    /* renamed from: d */
    public final TemporalUnit f6965d;

    /* renamed from: e */
    public final ValueRange f6966e;

    @Override // p479j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    /* renamed from: f */
    public final ChronoLocalDate m3614f(Chronology chronology, int i, int i2, int i3) {
        ChronoLocalDate chronoLocalDateDate = chronology.date(i, 1, 1);
        int iM3617i = m3617i(1, m3611b(chronoLocalDateDate));
        int i4 = i3 - 1;
        return chronoLocalDateDate.plus(((Math.min(i2, m3610a(iM3617i, chronoLocalDateDate.lengthOfYear() + this.f6963b.f6938b) - 1) - 1) * 7) + i4 + (-iM3617i), (TemporalUnit) ChronoUnit.DAYS);
    }

    public C45807k(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, ValueRange valueRange) {
        this.f6962a = str;
        this.f6963b = weekFields;
        this.f6964c = temporalUnit;
        this.f6965d = temporalUnit2;
        this.f6966e = valueRange;
    }

    @Override // p479j$.time.temporal.TemporalField
    public final long getFrom(TemporalAccessor temporalAccessor) {
        int iM3612d;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f6965d;
        if (temporalUnit == chronoUnit) {
            iM3612d = m3611b(temporalAccessor);
        } else if (temporalUnit != ChronoUnit.MONTHS) {
            if (temporalUnit != ChronoUnit.YEARS) {
                if (temporalUnit == WeekFields.f6936h) {
                    iM3612d = m3613e(temporalAccessor);
                } else if (temporalUnit == ChronoUnit.FOREVER) {
                    iM3612d = m3612d(temporalAccessor);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
                }
            } else {
                int iM3611b = m3611b(temporalAccessor);
                int i = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
                iM3612d = m3610a(m3617i(i, iM3611b), i);
            }
        } else {
            int iM3611b2 = m3611b(temporalAccessor);
            int i2 = temporalAccessor.get(ChronoField.DAY_OF_MONTH);
            iM3612d = m3610a(m3617i(i2, iM3611b2), i2);
        }
        return iM3612d;
    }

    /* renamed from: b */
    public final int m3611b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.f6963b.getFirstDayOfWeek().getValue(), 7) + 1;
    }

    /* renamed from: d */
    public final int m3612d(TemporalAccessor temporalAccessor) {
        int iM3611b = m3611b(temporalAccessor);
        int i = temporalAccessor.get(ChronoField.YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i2 = temporalAccessor.get(chronoField);
        int iM3617i = m3617i(i2, iM3611b);
        int iM3610a = m3610a(iM3617i, i2);
        return iM3610a == 0 ? i - 1 : iM3610a >= m3610a(iM3617i, ((int) temporalAccessor.range(chronoField).getMaximum()) + this.f6963b.f6938b) ? i + 1 : i;
    }

    /* renamed from: e */
    public final int m3613e(TemporalAccessor temporalAccessor) {
        int iM3610a;
        int iM3611b = m3611b(temporalAccessor);
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        int i = temporalAccessor.get(chronoField);
        int iM3617i = m3617i(i, iM3611b);
        int iM3610a2 = m3610a(iM3617i, i);
        if (iM3610a2 == 0) {
            return m3613e(Chronology.from(temporalAccessor).date(temporalAccessor).minus(i, (TemporalUnit) ChronoUnit.DAYS));
        }
        return (iM3610a2 <= 50 || iM3610a2 < (iM3610a = m3610a(iM3617i, ((int) temporalAccessor.range(chronoField).getMaximum()) + this.f6963b.f6938b))) ? iM3610a2 : (iM3610a2 - iM3610a) + 1;
    }

    /* renamed from: i */
    public final int m3617i(int i, int i2) {
        int iFloorMod = Math.floorMod(i - i2, 7);
        return iFloorMod + 1 > this.f6963b.f6938b ? 7 - iFloorMod : -iFloorMod;
    }

    /* renamed from: a */
    public static int m3610a(int i, int i2) {
        return ((i2 - 1) + (i + 7)) / 7;
    }

    @Override // p479j$.time.temporal.TemporalField
    public final Temporal adjustInto(Temporal temporal, long j) {
        if (this.f6966e.checkValidIntValue(j, this) == temporal.get(this)) {
            return temporal;
        }
        if (this.f6965d != ChronoUnit.FOREVER) {
            return temporal.plus(r0 - r1, this.f6964c);
        }
        WeekFields weekFields = this.f6963b;
        return m3614f(Chronology.from(temporal), (int) j, temporal.get(weekFields.f6941e), temporal.get(weekFields.f6939c));
    }

    @Override // p479j$.time.temporal.TemporalField
    /* renamed from: c */
    public final TemporalAccessor mo3597c(Map map, C45757B c45757b, ResolverStyle resolverStyle) {
        ChronoLocalDate chronoLocalDatePlus;
        ChronoLocalDate chronoLocalDatePlus2;
        ChronoLocalDate chronoLocalDatePlus3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int intExact = Math.toIntExact(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ValueRange valueRange = this.f6966e;
        WeekFields weekFields = this.f6963b;
        TemporalUnit temporalUnit = this.f6965d;
        if (temporalUnit == chronoUnit) {
            long jFloorMod = Math.floorMod((valueRange.checkValidIntValue(jLongValue, this) - 1) + (weekFields.getFirstDayOfWeek().getValue() - 1), 7) + 1;
            map.remove(this);
            map.put(ChronoField.DAY_OF_WEEK, Long.valueOf(jFloorMod));
            return null;
        }
        ChronoField chronoField = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField)) {
            return null;
        }
        int iFloorMod = Math.floorMod(chronoField.checkValidIntValue(((Long) map.get(chronoField)).longValue()) - weekFields.getFirstDayOfWeek().getValue(), 7) + 1;
        Chronology chronologyFrom = Chronology.from(c45757b);
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            if ((temporalUnit != WeekFields.f6936h && temporalUnit != ChronoUnit.FOREVER) || !map.containsKey(weekFields.f6942f) || !map.containsKey(weekFields.f6941e)) {
                return null;
            }
            C45807k c45807k = weekFields.f6942f;
            int iCheckValidIntValue = c45807k.f6966e.checkValidIntValue(((Long) map.get(c45807k)).longValue(), weekFields.f6942f);
            if (resolverStyle == ResolverStyle.LENIENT) {
                chronoLocalDatePlus = m3614f(chronologyFrom, iCheckValidIntValue, 1, iFloorMod).plus(Math.subtractExact(((Long) map.get(weekFields.f6941e)).longValue(), 1L), (TemporalUnit) chronoUnit);
            } else {
                C45807k c45807k2 = weekFields.f6941e;
                ChronoLocalDate chronoLocalDateM3614f = m3614f(chronologyFrom, iCheckValidIntValue, c45807k2.f6966e.checkValidIntValue(((Long) map.get(c45807k2)).longValue(), weekFields.f6941e), iFloorMod);
                if (resolverStyle == ResolverStyle.STRICT && m3612d(chronoLocalDateM3614f) != iCheckValidIntValue) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                chronoLocalDatePlus = chronoLocalDateM3614f;
            }
            map.remove(this);
            map.remove(weekFields.f6942f);
            map.remove(weekFields.f6941e);
            map.remove(chronoField);
            return chronoLocalDatePlus;
        }
        int iCheckValidIntValue2 = chronoField2.checkValidIntValue(((Long) map.get(chronoField2)).longValue());
        ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
        if (temporalUnit == chronoUnit2) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (map.containsKey(chronoField3)) {
                long jLongValue2 = ((Long) map.get(chronoField3)).longValue();
                long j = intExact;
                if (resolverStyle == ResolverStyle.LENIENT) {
                    ChronoLocalDate chronoLocalDatePlus4 = chronologyFrom.date(iCheckValidIntValue2, 1, 1).plus(Math.subtractExact(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                    int iM3611b = m3611b(chronoLocalDatePlus4);
                    int i = chronoLocalDatePlus4.get(ChronoField.DAY_OF_MONTH);
                    chronoLocalDatePlus3 = chronoLocalDatePlus4.plus(Math.addExact(Math.multiplyExact(Math.subtractExact(j, m3610a(m3617i(i, iM3611b), i)), 7), iFloorMod - m3611b(chronoLocalDatePlus4)), (TemporalUnit) ChronoUnit.DAYS);
                } else {
                    ChronoLocalDate chronoLocalDateDate = chronologyFrom.date(iCheckValidIntValue2, chronoField3.checkValidIntValue(jLongValue2), 1);
                    long jCheckValidIntValue = valueRange.checkValidIntValue(j, this);
                    int iM3611b2 = m3611b(chronoLocalDateDate);
                    int i2 = chronoLocalDateDate.get(ChronoField.DAY_OF_MONTH);
                    ChronoLocalDate chronoLocalDatePlus5 = chronoLocalDateDate.plus((((int) (jCheckValidIntValue - m3610a(m3617i(i2, iM3611b2), i2))) * 7) + (iFloorMod - m3611b(chronoLocalDateDate)), (TemporalUnit) ChronoUnit.DAYS);
                    if (resolverStyle == ResolverStyle.STRICT && chronoLocalDatePlus5.getLong(chronoField3) != jLongValue2) {
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                    chronoLocalDatePlus3 = chronoLocalDatePlus5;
                }
                map.remove(this);
                map.remove(chronoField2);
                map.remove(chronoField3);
                map.remove(chronoField);
                return chronoLocalDatePlus3;
            }
        }
        if (temporalUnit != ChronoUnit.YEARS) {
            return null;
        }
        long j2 = intExact;
        ChronoLocalDate chronoLocalDateDate2 = chronologyFrom.date(iCheckValidIntValue2, 1, 1);
        if (resolverStyle == ResolverStyle.LENIENT) {
            int iM3611b3 = m3611b(chronoLocalDateDate2);
            int i3 = chronoLocalDateDate2.get(ChronoField.DAY_OF_YEAR);
            chronoLocalDatePlus2 = chronoLocalDateDate2.plus(Math.addExact(Math.multiplyExact(Math.subtractExact(j2, m3610a(m3617i(i3, iM3611b3), i3)), 7), iFloorMod - m3611b(chronoLocalDateDate2)), (TemporalUnit) ChronoUnit.DAYS);
        } else {
            long jCheckValidIntValue2 = valueRange.checkValidIntValue(j2, this);
            int iM3611b4 = m3611b(chronoLocalDateDate2);
            int i4 = chronoLocalDateDate2.get(ChronoField.DAY_OF_YEAR);
            ChronoLocalDate chronoLocalDatePlus6 = chronoLocalDateDate2.plus((((int) (jCheckValidIntValue2 - m3610a(m3617i(i4, iM3611b4), i4))) * 7) + (iFloorMod - m3611b(chronoLocalDateDate2)), (TemporalUnit) ChronoUnit.DAYS);
            if (resolverStyle == ResolverStyle.STRICT && chronoLocalDatePlus6.getLong(chronoField2) != iCheckValidIntValue2) {
                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
            }
            chronoLocalDatePlus2 = chronoLocalDatePlus6;
        }
        map.remove(this);
        map.remove(chronoField2);
        map.remove(chronoField);
        return chronoLocalDatePlus2;
    }

    @Override // p479j$.time.temporal.TemporalField
    public final ValueRange range() {
        return this.f6966e;
    }

    @Override // p479j$.time.temporal.TemporalField
    public final boolean isSupportedBy(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.isSupported(ChronoField.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f6965d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return temporalAccessor.isSupported(ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return temporalAccessor.isSupported(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.f6936h) {
            return temporalAccessor.isSupported(ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return temporalAccessor.isSupported(ChronoField.YEAR);
        }
        return false;
    }

    @Override // p479j$.time.temporal.TemporalField
    public final ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.f6965d;
        if (temporalUnit == chronoUnit) {
            return this.f6966e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return m3615g(temporalAccessor, ChronoField.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return m3615g(temporalAccessor, ChronoField.DAY_OF_YEAR);
        }
        if (temporalUnit == WeekFields.f6936h) {
            return m3616h(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return ChronoField.YEAR.range();
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
    }

    /* renamed from: g */
    public final ValueRange m3615g(TemporalAccessor temporalAccessor, ChronoField chronoField) {
        int iM3617i = m3617i(temporalAccessor.get(chronoField), m3611b(temporalAccessor));
        ValueRange valueRangeRange = temporalAccessor.range(chronoField);
        return ValueRange.m3598of(m3610a(iM3617i, (int) valueRangeRange.f6931a), m3610a(iM3617i, (int) valueRangeRange.getMaximum()));
    }

    /* renamed from: h */
    public final ValueRange m3616h(TemporalAccessor temporalAccessor) {
        ChronoField chronoField = ChronoField.DAY_OF_YEAR;
        if (!temporalAccessor.isSupported(chronoField)) {
            return f6960h;
        }
        int iM3611b = m3611b(temporalAccessor);
        int i = temporalAccessor.get(chronoField);
        int iM3617i = m3617i(i, iM3611b);
        int iM3610a = m3610a(iM3617i, i);
        if (iM3610a == 0) {
            return m3616h(Chronology.from(temporalAccessor).date(temporalAccessor).minus(i + 7, (TemporalUnit) ChronoUnit.DAYS));
        }
        if (iM3610a >= m3610a(iM3617i, this.f6963b.f6938b + ((int) temporalAccessor.range(chronoField).getMaximum()))) {
            return m3616h(Chronology.from(temporalAccessor).date(temporalAccessor).plus((r0 - i) + 8, (TemporalUnit) ChronoUnit.DAYS));
        }
        return ValueRange.m3598of(1L, r1 - 1);
    }

    public final String toString() {
        return this.f6962a + "[" + this.f6963b.toString() + "]";
    }
}
