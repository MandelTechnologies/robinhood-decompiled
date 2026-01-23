package p479j$.time.chrono;

import p479j$.time.AbstractC45722b;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.TemporalQuery;
import p479j$.time.temporal.UnsupportedTemporalTypeException;

/* loaded from: classes29.dex */
public interface Era extends TemporalAccessor, TemporalAdjuster {
    int getValue();

    @Override // p479j$.time.temporal.TemporalAccessor
    default boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.ERA : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    default int get(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return getValue();
        }
        return super.get(temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    default long getLong(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
        }
        return temporalField.getFrom(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    default Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.precision()) {
            return ChronoUnit.ERAS;
        }
        return super.query(temporalQuery);
    }

    @Override // p479j$.time.temporal.TemporalAdjuster
    default Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.ERA, getValue());
    }
}
