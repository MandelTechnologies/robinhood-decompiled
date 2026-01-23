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
public final class EthiopicChronology extends AbstractNileChronology implements Serializable {
    public static final EthiopicChronology INSTANCE = new EthiopicChronology();

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
    public EthiopicChronology() {
    }

    @Override // p479j$.time.chrono.Chronology
    public String getId() {
        return "Ethiopic";
    }

    @Override // p479j$.time.chrono.Chronology
    public String getCalendarType() {
        return "ethiopic";
    }

    @Override // p479j$.time.chrono.Chronology
    public EthiopicDate date(Era era, int i, int i2, int i3) {
        return date(prolepticYear(era, i), i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public EthiopicDate date(int i, int i2, int i3) {
        return EthiopicDate.m4001of(i, i2, i3);
    }

    @Override // p479j$.time.chrono.Chronology
    public EthiopicDate dateYearDay(Era era, int i, int i2) {
        return dateYearDay(prolepticYear(era, i), i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public EthiopicDate dateYearDay(int i, int i2) {
        return EthiopicDate.ofYearDay(i, i2);
    }

    @Override // p479j$.time.chrono.Chronology
    public EthiopicDate dateEpochDay(long j) {
        return EthiopicDate.ofEpochDay(j);
    }

    @Override // p479j$.time.chrono.Chronology
    public EthiopicDate dateNow() {
        return EthiopicDate.now();
    }

    @Override // p479j$.time.chrono.Chronology
    public EthiopicDate dateNow(ZoneId zoneId) {
        return EthiopicDate.now(zoneId);
    }

    @Override // p479j$.time.chrono.Chronology
    public EthiopicDate dateNow(Clock clock) {
        return EthiopicDate.now(clock);
    }

    @Override // p479j$.time.chrono.Chronology
    public EthiopicDate date(TemporalAccessor temporalAccessor) {
        return EthiopicDate.from(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoLocalDateTime<EthiopicDate> localDateTime(TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<EthiopicDate> zonedDateTime(TemporalAccessor temporalAccessor) {
        return super.zonedDateTime(temporalAccessor);
    }

    @Override // p479j$.time.chrono.Chronology
    public ChronoZonedDateTime<EthiopicDate> zonedDateTime(Instant instant, ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }

    @Override // p479j$.time.chrono.Chronology
    public int prolepticYear(Era era, int i) {
        if (era instanceof EthiopicEra) {
            return era == EthiopicEra.INCARNATION ? i : 1 - i;
        }
        throw new ClassCastException("Era must be EthiopicEra");
    }

    @Override // p479j$.time.chrono.Chronology
    public EthiopicEra eraOf(int i) {
        return EthiopicEra.m4002of(i);
    }

    @Override // p479j$.time.chrono.Chronology
    public List<Era> eras() {
        return Arrays.asList(EthiopicEra.values());
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public EthiopicDate resolveDate(Map<TemporalField, Long> map, ResolverStyle resolverStyle) {
        return (EthiopicDate) super.resolveDate(map, resolverStyle);
    }
}
