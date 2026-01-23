package org.threeten.extra;

import java.util.Locale;
import p479j$.time.DateTimeException;
import p479j$.time.LocalDate;
import p479j$.time.Month;
import p479j$.time.chrono.Chronology;
import p479j$.time.chrono.IsoChronology;
import p479j$.time.format.DateTimeFormatterBuilder;
import p479j$.time.format.TextStyle;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.IsoFields;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.TemporalQuery;
import p479j$.time.temporal.UnsupportedTemporalTypeException;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes23.dex */
public enum Quarter implements TemporalAccessor, TemporalAdjuster {
    Q1,
    Q2,
    Q3,
    Q4;

    /* renamed from: of */
    public static Quarter m3994of(int i) {
        if (i == 1) {
            return Q1;
        }
        if (i == 2) {
            return Q2;
        }
        if (i == 3) {
            return Q3;
        }
        if (i == 4) {
            return Q4;
        }
        throw new DateTimeException("Invalid value for Quarter: " + i);
    }

    public static Quarter ofMonth(int i) {
        TemporalField temporalField = ChronoField.MONTH_OF_YEAR;
        temporalField.range().checkValidValue(i, temporalField);
        return m3994of(((i - 1) / 3) + 1);
    }

    public static Quarter from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Quarter) {
            return (Quarter) temporalAccessor;
        }
        if (temporalAccessor instanceof Month) {
            return m3994of((((Month) temporalAccessor).ordinal() / 3) + 1);
        }
        try {
            return m3994of(Math.toIntExact((!IsoChronology.INSTANCE.equals(Chronology.from(temporalAccessor)) ? LocalDate.from(temporalAccessor) : temporalAccessor).getLong(IsoFields.QUARTER_OF_YEAR)));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Quarter from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        return new DateTimeFormatterBuilder().appendText(IsoFields.QUARTER_OF_YEAR, textStyle).toFormatter(locale).format(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        if (temporalField == IsoFields.QUARTER_OF_YEAR) {
            return true;
        }
        return ((temporalField instanceof ChronoField) || temporalField == null || !temporalField.isSupportedBy(this)) ? false : true;
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField == IsoFields.QUARTER_OF_YEAR) {
            return temporalField.range();
        }
        if (temporalField instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        return super.range(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        if (temporalField == IsoFields.QUARTER_OF_YEAR) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        return super.get(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        if (temporalField == IsoFields.QUARTER_OF_YEAR) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        return temporalField.getFrom(this);
    }

    public Quarter plus(long j) {
        return values()[(ordinal() + ((((int) j) % 4) + 4)) % 4];
    }

    public Quarter minus(long j) {
        return plus(-(j % 4));
    }

    /* renamed from: org.threeten.extra.Quarter$1 */
    /* loaded from: classes25.dex */
    static /* synthetic */ class C480291 {
        static final /* synthetic */ int[] $SwitchMap$org$threeten$extra$Quarter;

        static {
            int[] iArr = new int[Quarter.values().length];
            $SwitchMap$org$threeten$extra$Quarter = iArr;
            try {
                iArr[Quarter.Q1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$threeten$extra$Quarter[Quarter.Q2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$threeten$extra$Quarter[Quarter.Q3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$threeten$extra$Quarter[Quarter.Q4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public int length(boolean z) {
        int i = C480291.$SwitchMap$org$threeten$extra$Quarter[ordinal()];
        return i != 1 ? i != 2 ? 92 : 91 : z ? 91 : 90;
    }

    public Month firstMonth() {
        int i = C480291.$SwitchMap$org$threeten$extra$Quarter[ordinal()];
        if (i == 1) {
            return Month.JANUARY;
        }
        if (i == 2) {
            return Month.APRIL;
        }
        if (i == 3) {
            return Month.JULY;
        }
        if (i == 4) {
            return Month.OCTOBER;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public <R> R query(TemporalQuery<R> temporalQuery) {
        if (temporalQuery == TemporalQueries.chronology()) {
            return (R) IsoChronology.INSTANCE;
        }
        if (temporalQuery == TemporalQueries.precision()) {
            return (R) IsoFields.QUARTER_YEARS;
        }
        return (R) super.query(temporalQuery);
    }

    @Override // p479j$.time.temporal.TemporalAdjuster
    public Temporal adjustInto(Temporal temporal) {
        if (!Chronology.from(temporal).equals(IsoChronology.INSTANCE)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.with(IsoFields.QUARTER_OF_YEAR, getValue());
    }
}
