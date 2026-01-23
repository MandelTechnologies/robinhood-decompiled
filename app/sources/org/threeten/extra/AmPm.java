package org.threeten.extra;

import java.util.Locale;
import p479j$.time.DateTimeException;
import p479j$.time.format.DateTimeFormatterBuilder;
import p479j$.time.format.TextStyle;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.TemporalQuery;
import p479j$.time.temporal.UnsupportedTemporalTypeException;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes23.dex */
public enum AmPm implements TemporalAccessor, TemporalAdjuster {
    AM,
    PM;

    /* renamed from: of */
    public static AmPm m3990of(int i) {
        if (i == 0) {
            return AM;
        }
        if (i == 1) {
            return PM;
        }
        throw new DateTimeException("Invalid value for AM/PM: " + i);
    }

    public static AmPm ofHour(int i) {
        ChronoField.HOUR_OF_DAY.checkValidValue(i);
        return i < 12 ? AM : PM;
    }

    public static AmPm from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof AmPm) {
            return (AmPm) temporalAccessor;
        }
        try {
            return m3990of(temporalAccessor.get(ChronoField.AMPM_OF_DAY));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain AmPm from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public int getValue() {
        return ordinal();
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        return new DateTimeFormatterBuilder().appendText(ChronoField.AMPM_OF_DAY, textStyle).toFormatter(locale).format(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.AMPM_OF_DAY : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField == ChronoField.AMPM_OF_DAY) {
            return temporalField.range();
        }
        if (temporalField instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        if (temporalField == ChronoField.AMPM_OF_DAY) {
            return getValue();
        }
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        if (temporalField == ChronoField.AMPM_OF_DAY) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        return temporalField.getFrom(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public <R> R query(TemporalQuery<R> temporalQuery) {
        if (temporalQuery == TemporalQueries.precision()) {
            return (R) ChronoUnit.HALF_DAYS;
        }
        return (R) super.query(temporalQuery);
    }

    @Override // p479j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.AMPM_OF_DAY, getValue());
    }
}
