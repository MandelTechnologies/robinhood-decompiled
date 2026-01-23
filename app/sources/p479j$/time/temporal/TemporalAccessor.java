package p479j$.time.temporal;

import java.util.Objects;
import p479j$.time.AbstractC45722b;
import p479j$.time.DateTimeException;

/* loaded from: classes29.dex */
public interface TemporalAccessor {
    long getLong(TemporalField temporalField);

    boolean isSupported(TemporalField temporalField);

    default ValueRange range(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.requireNonNull(temporalField, "field");
            return temporalField.rangeRefinedBy(this);
        }
        if (isSupported(temporalField)) {
            return temporalField.range();
        }
        throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
    }

    default int get(TemporalField temporalField) {
        ValueRange valueRangeRange = range(temporalField);
        if (!valueRangeRange.m3602b()) {
            throw new UnsupportedTemporalTypeException("Invalid field " + temporalField + " for get() method, use getLong() instead");
        }
        long j = getLong(temporalField);
        if (valueRangeRange.m3603c(j)) {
            return (int) j;
        }
        throw new DateTimeException("Invalid value for " + temporalField + " (valid values " + valueRangeRange + "): " + j);
    }

    default <R> R query(TemporalQuery<R> temporalQuery) {
        if (temporalQuery == TemporalQueries.f6924a || temporalQuery == TemporalQueries.chronology() || temporalQuery == TemporalQueries.precision()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }
}
