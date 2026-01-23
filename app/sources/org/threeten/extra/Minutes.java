package org.threeten.extra;

import com.robinhood.iso.countrycode.CountryCode;
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
public final class Minutes implements TemporalAmount, Comparable<Minutes>, Serializable {
    private final int minutes;
    public static final Minutes ZERO = new Minutes(0);
    private static final Pattern PATTERN = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(?:T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?)?", 2);

    /* renamed from: of */
    public static Minutes m3992of(int i) {
        if (i == 0) {
            return ZERO;
        }
        return new Minutes(i);
    }

    private Minutes(int i) {
        this.minutes = i;
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public long get(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.MINUTES) {
            return this.minutes;
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public List<TemporalUnit> getUnits() {
        return Collections.singletonList(ChronoUnit.MINUTES);
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public Temporal addTo(Temporal temporal) {
        int i = this.minutes;
        return i != 0 ? temporal.plus(i, ChronoUnit.MINUTES) : temporal;
    }

    @Override // p479j$.time.temporal.TemporalAmount
    public Temporal subtractFrom(Temporal temporal) {
        int i = this.minutes;
        return i != 0 ? temporal.minus(i, ChronoUnit.MINUTES) : temporal;
    }

    @Override // java.lang.Comparable
    public int compareTo(Minutes minutes) {
        return Integer.compare(this.minutes, minutes.minutes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Minutes) && this.minutes == ((Minutes) obj).minutes;
    }

    public int hashCode() {
        return this.minutes;
    }

    @ToString
    public String toString() {
        return CountryCode.COUNTRY_CODE_PT + this.minutes + "M";
    }
}
