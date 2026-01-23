package p479j$.time.format;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.squareup.wire.internal.MathMethods;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p479j$.time.AbstractC45722b;
import p479j$.time.DateTimeException;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalTime;
import p479j$.time.Period;
import p479j$.time.ZoneId;
import p479j$.time.ZoneOffset;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.chrono.Chronology;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.TemporalQuery;
import p479j$.time.temporal.UnsupportedTemporalTypeException;

/* renamed from: j$.time.format.B */
/* loaded from: classes29.dex */
public final class C45757B implements TemporalAccessor {

    /* renamed from: b */
    public ZoneId f6783b;

    /* renamed from: c */
    public Chronology f6784c;

    /* renamed from: d */
    public boolean f6785d;

    /* renamed from: e */
    public ResolverStyle f6786e;

    /* renamed from: f */
    public ChronoLocalDate f6787f;

    /* renamed from: g */
    public LocalTime f6788g;

    /* renamed from: a */
    public final Map f6782a = new HashMap();

    /* renamed from: h */
    public Period f6789h = Period.ZERO;

    @Override // p479j$.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate;
        LocalTime localTime;
        if (((HashMap) this.f6782a).containsKey(temporalField) || (((chronoLocalDate = this.f6787f) != null && chronoLocalDate.isSupported(temporalField)) || ((localTime = this.f6788g) != null && localTime.isSupported(temporalField)))) {
            return true;
        }
        return (temporalField == null || (temporalField instanceof ChronoField) || !temporalField.isSupportedBy(this)) ? false : true;
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        Long l = (Long) ((HashMap) this.f6782a).get(temporalField);
        if (l != null) {
            return l.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f6787f;
        if (chronoLocalDate != null && chronoLocalDate.isSupported(temporalField)) {
            return this.f6787f.getLong(temporalField);
        }
        LocalTime localTime = this.f6788g;
        if (localTime != null && localTime.isSupported(temporalField)) {
            return this.f6788g.getLong(temporalField);
        }
        if (temporalField instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
        }
        return temporalField.getFrom(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.f6924a) {
            return this.f6783b;
        }
        if (temporalQuery == TemporalQueries.chronology()) {
            return this.f6784c;
        }
        if (temporalQuery == TemporalQueries.localDate()) {
            ChronoLocalDate chronoLocalDate = this.f6787f;
            if (chronoLocalDate != null) {
                return LocalDate.from(chronoLocalDate);
            }
            return null;
        }
        if (temporalQuery == TemporalQueries.localTime()) {
            return this.f6788g;
        }
        if (temporalQuery == TemporalQueries.f6927d) {
            Long l = (Long) ((HashMap) this.f6782a).get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                return ZoneOffset.ofTotalSeconds(l.intValue());
            }
            ZoneId zoneId = this.f6783b;
            return zoneId instanceof ZoneOffset ? zoneId : temporalQuery.queryFrom(this);
        }
        if (temporalQuery == TemporalQueries.f6928e) {
            return temporalQuery.queryFrom(this);
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    /* renamed from: n */
    public final void m3540n(TemporalField temporalField, ChronoField chronoField, Long l) {
        Long l2 = (Long) ((HashMap) this.f6782a).put(chronoField, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + chronoField + PlaceholderUtils.XXShortPlaceholderText + l2 + " differs from " + chronoField + PlaceholderUtils.XXShortPlaceholderText + l + " while resolving  " + temporalField);
    }

    /* renamed from: e */
    public final void m3534e() {
        if (((HashMap) this.f6782a).containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f6783b;
            if (zoneId != null) {
                m3535i(zoneId);
                return;
            }
            Long l = (Long) ((HashMap) this.f6782a).get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                m3535i(ZoneOffset.ofTotalSeconds(l.intValue()));
            }
        }
    }

    /* renamed from: i */
    public final void m3535i(ZoneId zoneId) {
        Map map = this.f6782a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        m3539m(this.f6784c.zonedDateTime(Instant.ofEpochSecond(((Long) ((HashMap) map).remove(chronoField)).longValue()), zoneId).mo3459a());
        m3540n(chronoField, ChronoField.SECOND_OF_DAY, Long.valueOf(r5.toLocalTime().toSecondOfDay()));
    }

    /* renamed from: m */
    public final void m3539m(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f6787f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            throw new DateTimeException("Conflict found: Fields resolved to two different dates: " + this.f6787f + PlaceholderUtils.XXShortPlaceholderText + chronoLocalDate);
        }
        if (chronoLocalDate != null) {
            if (!this.f6784c.equals(chronoLocalDate.getChronology())) {
                throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.f6784c);
            }
            this.f6787f = chronoLocalDate;
        }
    }

    /* renamed from: k */
    public final void m3537k() {
        Map map = this.f6782a;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(chronoField)) {
            long jLongValue = ((Long) ((HashMap) this.f6782a).remove(chronoField)).longValue();
            ResolverStyle resolverStyle = this.f6786e;
            if (resolverStyle == ResolverStyle.STRICT || (resolverStyle == ResolverStyle.SMART && jLongValue != 0)) {
                chronoField.checkValidValue(jLongValue);
            }
            ChronoField chronoField2 = ChronoField.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            m3540n(chronoField, chronoField2, Long.valueOf(jLongValue));
        }
        Map map2 = this.f6782a;
        ChronoField chronoField3 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(chronoField3)) {
            long jLongValue2 = ((Long) ((HashMap) this.f6782a).remove(chronoField3)).longValue();
            ResolverStyle resolverStyle2 = this.f6786e;
            if (resolverStyle2 == ResolverStyle.STRICT || (resolverStyle2 == ResolverStyle.SMART && jLongValue2 != 0)) {
                chronoField3.checkValidValue(jLongValue2);
            }
            m3540n(chronoField3, ChronoField.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        Map map3 = this.f6782a;
        ChronoField chronoField4 = ChronoField.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(chronoField4)) {
            Map map4 = this.f6782a;
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(chronoField5)) {
                long jLongValue3 = ((Long) ((HashMap) this.f6782a).remove(chronoField4)).longValue();
                long jLongValue4 = ((Long) ((HashMap) this.f6782a).remove(chronoField5)).longValue();
                if (this.f6786e == ResolverStyle.LENIENT) {
                    m3540n(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(jLongValue3, 12), jLongValue4)));
                } else {
                    chronoField4.checkValidValue(jLongValue3);
                    chronoField5.checkValidValue(jLongValue3);
                    m3540n(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        Map map5 = this.f6782a;
        ChronoField chronoField6 = ChronoField.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(chronoField6)) {
            long jLongValue5 = ((Long) ((HashMap) this.f6782a).remove(chronoField6)).longValue();
            if (this.f6786e != ResolverStyle.LENIENT) {
                chronoField6.checkValidValue(jLongValue5);
            }
            m3540n(chronoField6, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            m3540n(chronoField6, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            m3540n(chronoField6, ChronoField.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / MathMethods.NANOS_PER_SECOND) % 60));
            m3540n(chronoField6, ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue5 % MathMethods.NANOS_PER_SECOND));
        }
        Map map6 = this.f6782a;
        ChronoField chronoField7 = ChronoField.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(chronoField7)) {
            long jLongValue6 = ((Long) ((HashMap) this.f6782a).remove(chronoField7)).longValue();
            if (this.f6786e != ResolverStyle.LENIENT) {
                chronoField7.checkValidValue(jLongValue6);
            }
            m3540n(chronoField7, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            m3540n(chronoField7, ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        Map map7 = this.f6782a;
        ChronoField chronoField8 = ChronoField.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(chronoField8)) {
            long jLongValue7 = ((Long) ((HashMap) this.f6782a).remove(chronoField8)).longValue();
            if (this.f6786e != ResolverStyle.LENIENT) {
                chronoField8.checkValidValue(jLongValue7);
            }
            m3540n(chronoField8, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            m3540n(chronoField8, ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        Map map8 = this.f6782a;
        ChronoField chronoField9 = ChronoField.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(chronoField9)) {
            long jLongValue8 = ((Long) ((HashMap) this.f6782a).remove(chronoField9)).longValue();
            if (this.f6786e != ResolverStyle.LENIENT) {
                chronoField9.checkValidValue(jLongValue8);
            }
            m3540n(chronoField9, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            m3540n(chronoField9, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            m3540n(chronoField9, ChronoField.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        Map map9 = this.f6782a;
        ChronoField chronoField10 = ChronoField.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(chronoField10)) {
            long jLongValue9 = ((Long) ((HashMap) this.f6782a).remove(chronoField10)).longValue();
            if (this.f6786e != ResolverStyle.LENIENT) {
                chronoField10.checkValidValue(jLongValue9);
            }
            m3540n(chronoField10, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            m3540n(chronoField10, ChronoField.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        Map map10 = this.f6782a;
        ChronoField chronoField11 = ChronoField.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(chronoField11)) {
            long jLongValue10 = ((Long) ((HashMap) this.f6782a).get(chronoField11)).longValue();
            ResolverStyle resolverStyle3 = this.f6786e;
            ResolverStyle resolverStyle4 = ResolverStyle.LENIENT;
            if (resolverStyle3 != resolverStyle4) {
                chronoField11.checkValidValue(jLongValue10);
            }
            Map map11 = this.f6782a;
            ChronoField chronoField12 = ChronoField.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(chronoField12)) {
                long jLongValue11 = ((Long) ((HashMap) this.f6782a).remove(chronoField12)).longValue();
                if (this.f6786e != resolverStyle4) {
                    chronoField12.checkValidValue(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                m3540n(chronoField12, chronoField11, Long.valueOf(jLongValue10));
            }
            Map map12 = this.f6782a;
            ChronoField chronoField13 = ChronoField.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(chronoField13)) {
                long jLongValue12 = ((Long) ((HashMap) this.f6782a).remove(chronoField13)).longValue();
                if (this.f6786e != resolverStyle4) {
                    chronoField13.checkValidValue(jLongValue12);
                }
                m3540n(chronoField13, chronoField11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        Map map13 = this.f6782a;
        ChronoField chronoField14 = ChronoField.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(chronoField14)) {
            Map map14 = this.f6782a;
            ChronoField chronoField15 = ChronoField.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(chronoField15)) {
                Map map15 = this.f6782a;
                ChronoField chronoField16 = ChronoField.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(chronoField16) && ((HashMap) this.f6782a).containsKey(chronoField11)) {
                    m3536j(((Long) ((HashMap) this.f6782a).remove(chronoField14)).longValue(), ((Long) ((HashMap) this.f6782a).remove(chronoField15)).longValue(), ((Long) ((HashMap) this.f6782a).remove(chronoField16)).longValue(), ((Long) ((HashMap) this.f6782a).remove(chronoField11)).longValue());
                }
            }
        }
    }

    /* renamed from: j */
    public final void m3536j(long j, long j2, long j3, long j4) {
        if (this.f6786e == ResolverStyle.LENIENT) {
            long jAddExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j, 3600000000000L), Math.multiplyExact(j2, 60000000000L)), Math.multiplyExact(j3, MathMethods.NANOS_PER_SECOND)), j4);
            m3538l(LocalTime.m3407k(Math.floorMod(jAddExact, 86400000000000L)), Period.m3431a(0, 0, (int) Math.floorDiv(jAddExact, 86400000000000L)));
            return;
        }
        int iCheckValidIntValue = ChronoField.MINUTE_OF_HOUR.checkValidIntValue(j2);
        int iCheckValidIntValue2 = ChronoField.NANO_OF_SECOND.checkValidIntValue(j4);
        if (this.f6786e == ResolverStyle.SMART && j == 24 && iCheckValidIntValue == 0 && j3 == 0 && iCheckValidIntValue2 == 0) {
            m3538l(LocalTime.MIDNIGHT, Period.m3431a(0, 0, 1));
        } else {
            m3538l(LocalTime.m3409of(ChronoField.HOUR_OF_DAY.checkValidIntValue(j), iCheckValidIntValue, ChronoField.SECOND_OF_MINUTE.checkValidIntValue(j3), iCheckValidIntValue2), Period.ZERO);
        }
    }

    /* renamed from: l */
    public final void m3538l(LocalTime localTime, Period period) {
        LocalTime localTime2 = this.f6788g;
        if (localTime2 != null) {
            if (!localTime2.equals(localTime)) {
                throw new DateTimeException("Conflict found: Fields resolved to different times: " + this.f6788g + PlaceholderUtils.XXShortPlaceholderText + localTime);
            }
            if (!this.f6789h.isZero() && !period.isZero() && !this.f6789h.equals(period)) {
                throw new DateTimeException("Conflict found: Fields resolved to different excess periods: " + this.f6789h + PlaceholderUtils.XXShortPlaceholderText + period);
            }
            this.f6789h = period;
            return;
        }
        this.f6788g = localTime;
        this.f6789h = period;
    }

    /* renamed from: c */
    public final void m3533c(TemporalAccessor temporalAccessor) {
        Iterator it = ((HashMap) this.f6782a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            TemporalField temporalField = (TemporalField) entry.getKey();
            if (temporalAccessor.isSupported(temporalField)) {
                try {
                    long j = temporalAccessor.getLong(temporalField);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (j != jLongValue) {
                        throw new DateTimeException("Conflict found: Field " + temporalField + PlaceholderUtils.XXShortPlaceholderText + j + " differs from " + temporalField + PlaceholderUtils.XXShortPlaceholderText + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f6782a);
        sb.append(',');
        sb.append(this.f6784c);
        if (this.f6783b != null) {
            sb.append(',');
            sb.append(this.f6783b);
        }
        if (this.f6787f != null || this.f6788g != null) {
            sb.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f6787f;
            if (chronoLocalDate != null) {
                sb.append(chronoLocalDate);
                if (this.f6788g != null) {
                    sb.append('T');
                    sb.append(this.f6788g);
                }
            } else {
                sb.append(this.f6788g);
            }
        }
        return sb.toString();
    }
}
