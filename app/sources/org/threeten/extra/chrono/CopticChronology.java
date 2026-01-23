package org.threeten.extra.chrono;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.ZoneId;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.chrono.ChronoLocalDateTime;
import p479j$.time.chrono.ChronoZonedDateTime;
import p479j$.time.chrono.Era;
import p479j$.time.format.ResolverStyle;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes25.dex */
public final class CopticChronology extends AbstractNileChronology implements Serializable {
    public static final CopticChronology INSTANCE = new CopticChronology();

    @Override // org.threeten.extra.chrono.AbstractNileChronology, p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public /* bridge */ /* synthetic */ boolean isLeapYear(long j) {
        return super.isLeapYear(j);
    }

    @Override // org.threeten.extra.chrono.AbstractNileChronology, p479j$.time.chrono.Chronology
    public /* bridge */ /* synthetic */ ValueRange range(ChronoField chronoField) {
        return super.range(chronoField);
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public /* bridge */ /* synthetic */ ChronoLocalDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return resolveDate((Map<TemporalField, Long>) map, resolverStyle);
    }

    @Deprecated
    public CopticChronology() {
    }

    @Override // p479j$.time.chrono.Chronology
    public String getId() {
        return "Coptic";
    }

    @Override // p479j$.time.chrono.Chronology
    public String getCalendarType() {
        return "coptic";
    }

    @Override // p479j$.time.chrono.Chronology
    public CopticDate date(Era era, int i, int i2, int i3) {
        return date(prolepticYear(era, i), i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public CopticDate date(int i, int i2, int i3) {
        return CopticDate.m3997of(i, i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public CopticDate dateYearDay(Era era, int i, int i2) {
        return dateYearDay(prolepticYear(era, i), i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public CopticDate dateYearDay(int i, int i2) {
        return CopticDate.ofYearDay(i, i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public CopticDate dateEpochDay(long j) {
        return CopticDate.ofEpochDay(j);
    }

    @Override // p479j$.time.chrono.Chronology
    public CopticDate dateNow() {
        return CopticDate.now();
    }

    @Override // p479j$.time.chrono.Chronology
    public CopticDate dateNow(ZoneId zoneId) {
        return CopticDate.now(zoneId);
    }

    @Override // p479j$.time.chrono.Chronology
    public CopticDate dateNow(Clock clock) {
        return CopticDate.now(clock);
    }

    @Override // p479j$.time.chrono.Chronology
    public CopticDate date(TemporalAccessor temporalAccessor) {
        return CopticDate.from(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoLocalDateTime<CopticDate> localDateTime(TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<CopticDate> zonedDateTime(TemporalAccessor temporalAccessor) {
        return super.zonedDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<CopticDate> zonedDateTime(Instant instant, ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }

    @Override // p479j$.time.chrono.Chronology
    public int prolepticYear(Era era, int i) {
        if (era instanceof CopticEra) {
            return era == CopticEra.AM ? i : 1 - i;
        }
        throw new ClassCastException("Era must be CopticEra");
    }

    @Override // p479j$.time.chrono.Chronology
    public CopticEra eraOf(int i) {
        return CopticEra.m3998of(i);
    }

    @Override // p479j$.time.chrono.Chronology
    public List<Era> eras() {
        return Arrays.asList(CopticEra.values());
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public CopticDate resolveDate(Map<TemporalField, Long> map, ResolverStyle resolverStyle) {
        return (CopticDate) super.resolveDate(map, resolverStyle);
    }
}
