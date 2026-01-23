package p479j$.time;

import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p479j$.time.chrono.Chronology;
import p479j$.time.chrono.IsoChronology;
import p479j$.time.format.DateTimeFormatterBuilder;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAccessor;
import p479j$.time.temporal.TemporalAdjuster;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalQueries;
import p479j$.time.temporal.TemporalQuery;
import p479j$.time.temporal.UnsupportedTemporalTypeException;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes29.dex */
public final class MonthDay implements TemporalAccessor, TemporalAdjuster, Comparable<MonthDay>, Serializable {

    /* renamed from: c */
    public static final /* synthetic */ int f6682c = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a */
    public final int f6683a;

    /* renamed from: b */
    public final int f6684b;

    @Override // java.lang.Comparable
    public final int compareTo(MonthDay monthDay) {
        MonthDay monthDay2 = monthDay;
        int i = this.f6683a - monthDay2.f6683a;
        return i == 0 ? this.f6684b - monthDay2.f6684b : i;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m3547d("--");
        dateTimeFormatterBuilder.appendValue(ChronoField.MONTH_OF_YEAR, 2).appendLiteral('-').appendValue(ChronoField.DAY_OF_MONTH, 2).toFormatter();
    }

    /* renamed from: of */
    public static MonthDay m3423of(Month month, int i) {
        Objects.requireNonNull(month, ManagedDashboardOverviewDuxo.DEFAULT_SPAN_RETURNS);
        ChronoField.DAY_OF_MONTH.checkValidValue(i);
        if (i > month.maxLength()) {
            throw new DateTimeException("Illegal value for DayOfMonth field, value " + i + " is not valid for month " + month.name());
        }
        return new MonthDay(month.getValue(), i);
    }

    public static MonthDay from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof MonthDay) {
            return (MonthDay) temporalAccessor;
        }
        try {
            if (!IsoChronology.INSTANCE.equals(Chronology.from(temporalAccessor))) {
                temporalAccessor = LocalDate.from(temporalAccessor);
            }
            return m3423of(Month.m3422of(temporalAccessor.get(ChronoField.MONTH_OF_YEAR)), temporalAccessor.get(ChronoField.DAY_OF_MONTH));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain MonthDay from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public MonthDay(int i, int i2) {
        this.f6683a = i;
        this.f6684b = i2;
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.DAY_OF_MONTH : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final ValueRange range(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.range();
        }
        if (temporalField != ChronoField.DAY_OF_MONTH) {
            return super.range(temporalField);
        }
        Month monthM3422of = Month.m3422of(this.f6683a);
        monthM3422of.getClass();
        int i = AbstractC45788j.f6899a[monthM3422of.ordinal()];
        return ValueRange.m3599of(1L, i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : 28, Month.m3422of(this.f6683a).maxLength());
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final long getLong(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.getFrom(this);
        }
        int i2 = AbstractC45789k.f6900a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.f6684b;
        } else {
            if (i2 != 2) {
                throw new UnsupportedTemporalTypeException(AbstractC45722b.m3469a("Unsupported field: ", temporalField));
            }
            i = this.f6683a;
        }
        return i;
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public final Object query(TemporalQuery temporalQuery) {
        if (temporalQuery == TemporalQueries.chronology()) {
            return IsoChronology.INSTANCE;
        }
        return super.query(temporalQuery);
    }

    @Override // p479j$.time.temporal.TemporalAdjuster
    public final Temporal adjustInto(Temporal temporal) {
        if (!Chronology.from(temporal).equals(IsoChronology.INSTANCE)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        Temporal temporalWith = temporal.with(ChronoField.MONTH_OF_YEAR, this.f6683a);
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporalWith.with(chronoField, Math.min(temporalWith.range(chronoField).getMaximum(), this.f6684b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MonthDay) {
            MonthDay monthDay = (MonthDay) obj;
            if (this.f6683a == monthDay.f6683a && this.f6684b == monthDay.f6684b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f6683a << 6) + this.f6684b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.f6683a < 10 ? "0" : "");
        sb.append(this.f6683a);
        sb.append(this.f6684b < 10 ? "-0" : "-");
        sb.append(this.f6684b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C45792n((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
