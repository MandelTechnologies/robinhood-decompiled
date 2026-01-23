package org.threeten.extra;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.joda.convert.ToString;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAmount;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.UnsupportedTemporalTypeException;

/* loaded from: classes25.dex */
public final class Days implements TemporalAmount, Comparable<Days>, Serializable {
    private final int days;
    public static final Days ZERO = new Days(0);
    public static final Days ONE = new Days(1);
    private static final Pattern PATTERN = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    /* renamed from: of */
    public static Days m3991of(int i) {
        if (i == 0) {
            return ZERO;
        }
        if (i == 1) {
            return ONE;
        }
        return new Days(i);
    }

    private Days(int i) {
        this.days = i;
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public long get(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.DAYS) {
            return this.days;
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public List<TemporalUnit> getUnits() {
        return Collections.singletonList(ChronoUnit.DAYS);
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public Temporal addTo(Temporal temporal) {
        int i = this.days;
        return i != 0 ? temporal.plus(i, ChronoUnit.DAYS) : temporal;
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public Temporal subtractFrom(Temporal temporal) {
        int i = this.days;
        return i != 0 ? temporal.minus(i, ChronoUnit.DAYS) : temporal;
    }

    @Override // java.lang.Comparable
    public int compareTo(Days days) {
        return Integer.compare(this.days, days.days);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Days) && this.days == ((Days) obj).days;
    }

    public int hashCode() {
        return this.days;
    }

    @ToString
    public String toString() {
        return "P" + this.days + "D";
    }
}
