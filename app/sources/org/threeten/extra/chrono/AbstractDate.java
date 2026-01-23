package org.threeten.extra.chrono;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.chrono.ChronoPeriod;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.TemporalField;
import p479j$.time.temporal.TemporalUnit;
import p479j$.time.temporal.UnsupportedTemporalTypeException;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes25.dex */
abstract class AbstractDate implements ChronoLocalDate {
    abstract int getDayOfMonth();

    abstract int getDayOfYear();

    abstract int getMonth();

    abstract int getProlepticYear();

    int lengthOfWeek() {
        return 7;
    }

    int lengthOfYearInMonths() {
        return 12;
    }

    abstract ValueRange rangeAlignedWeekOfMonth();

    abstract AbstractDate resolvePrevious(int i, int i2, int i3);

    AbstractDate() {
    }

    AbstractDate withDayOfYear(int i) {
        return plusDays(i - getDayOfYear());
    }

    AbstractDate resolveEpochDay(long j) {
        return (AbstractDate) getChronology().dateEpochDay(j);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (isSupported(temporalField)) {
                return rangeChrono((ChronoField) temporalField);
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    ValueRange rangeChrono(ChronoField chronoField) {
        int i = C480361.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()];
        if (i == 1) {
            return ValueRange.m3598of(1L, lengthOfMonth());
        }
        if (i == 2) {
            return ValueRange.m3598of(1L, lengthOfYear());
        }
        if (i == 3) {
            return rangeAlignedWeekOfMonth();
        }
        return getChronology().range(chronoField);
    }

    @Override // p479j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        int dayOfMonth;
        if (temporalField instanceof ChronoField) {
            switch (C480361.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()]) {
                case 1:
                    dayOfMonth = getDayOfMonth();
                    break;
                case 2:
                    dayOfMonth = getDayOfYear();
                    break;
                case 3:
                    dayOfMonth = getAlignedWeekOfMonth();
                    break;
                case 4:
                    dayOfMonth = getDayOfWeek();
                    break;
                case 5:
                    dayOfMonth = getAlignedDayOfWeekInMonth();
                    break;
                case 6:
                    dayOfMonth = getAlignedDayOfWeekInYear();
                    break;
                case 7:
                    return toEpochDay();
                case 8:
                    dayOfMonth = getAlignedWeekOfYear();
                    break;
                case 9:
                    dayOfMonth = getMonth();
                    break;
                case 10:
                    return getProlepticMonth();
                case 11:
                    dayOfMonth = getYearOfEra();
                    break;
                case 12:
                    dayOfMonth = getProlepticYear();
                    break;
                case 13:
                    return getProlepticYear() < 1 ? 0 : 1;
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            }
            return dayOfMonth;
        }
        return temporalField.getFrom(this);
    }

    int getAlignedDayOfWeekInMonth() {
        return ((getDayOfMonth() - 1) % lengthOfWeek()) + 1;
    }

    int getAlignedDayOfWeekInYear() {
        return ((getDayOfYear() - 1) % lengthOfWeek()) + 1;
    }

    int getAlignedWeekOfMonth() {
        return ((getDayOfMonth() - 1) / lengthOfWeek()) + 1;
    }

    int getAlignedWeekOfYear() {
        return ((getDayOfYear() - 1) / lengthOfWeek()) + 1;
    }

    int getDayOfWeek() {
        return (int) (Math.floorMod(toEpochDay() + 3, 7L) + 1);
    }

    long getProlepticMonth() {
        return ((getProlepticYear() * lengthOfYearInMonths()) + getMonth()) - 1;
    }

    int getYearOfEra() {
        return getProlepticYear() >= 1 ? getProlepticYear() : 1 - getProlepticYear();
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public AbstractDate with(TemporalField temporalField, long j) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            getChronology().range(chronoField).checkValidValue(j, chronoField);
            int i = (int) j;
            switch (C480361.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
                case 1:
                    return resolvePrevious(getProlepticYear(), getMonth(), i);
                case 2:
                    return withDayOfYear(i);
                case 3:
                    return plusDays((j - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH)) * lengthOfWeek());
                case 4:
                    return plusDays(j - getDayOfWeek());
                case 5:
                    return plusDays(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 6:
                    return plusDays(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 7:
                    return resolveEpochDay(j);
                case 8:
                    return plusDays((j - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR)) * lengthOfWeek());
                case 9:
                    return resolvePrevious(getProlepticYear(), i, getDayOfMonth());
                case 10:
                    return plusMonths(j - getProlepticMonth());
                case 11:
                    if (getProlepticYear() < 1) {
                        i = 1 - i;
                    }
                    return resolvePrevious(i, getMonth(), getDayOfMonth());
                case 12:
                    return resolvePrevious(i, getMonth(), getDayOfMonth());
                case 13:
                    return j == getLong(ChronoField.ERA) ? this : resolvePrevious(1 - getProlepticYear(), getMonth(), getDayOfMonth());
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            }
        }
        return (AbstractDate) temporalField.adjustInto(this, j);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate, p479j$.time.temporal.Temporal
    public AbstractDate plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (C480361.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusDays(j);
                case 2:
                    return plusWeeks(j);
                case 3:
                    return plusMonths(j);
                case 4:
                    return plusYears(j);
                case 5:
                    return plusYears(Math.multiplyExact(j, 10L));
                case 6:
                    return plusYears(Math.multiplyExact(j, 100L));
                case 7:
                    return plusYears(Math.multiplyExact(j, 1000L));
                case 8:
                    ChronoField chronoField = ChronoField.ERA;
                    return with((TemporalField) chronoField, Math.addExact(getLong(chronoField), j));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return (AbstractDate) temporalUnit.addTo(this, j);
    }

    /* renamed from: org.threeten.extra.chrono.AbstractDate$1 */
    static /* synthetic */ class C480361 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr2;
            try {
                iArr2[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.DAY_OF_WEEK.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.EPOCH_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MONTH_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.PROLEPTIC_MONTH.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ERA.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    AbstractDate plusYears(long j) {
        return j == 0 ? this : resolvePrevious(ChronoField.YEAR.checkValidIntValue(Math.addExact(getProlepticYear(), j)), getMonth(), getDayOfMonth());
    }

    AbstractDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long jAddExact = Math.addExact(getProlepticMonth(), j);
        return resolvePrevious(Math.toIntExact(Math.floorDiv(jAddExact, lengthOfYearInMonths())), (int) (Math.floorMod(jAddExact, lengthOfYearInMonths()) + 1), getDayOfMonth());
    }

    AbstractDate plusWeeks(long j) {
        return plusDays(Math.multiplyExact(j, lengthOfWeek()));
    }

    AbstractDate plusDays(long j) {
        return j == 0 ? this : resolveEpochDay(Math.addExact(toEpochDay(), j));
    }

    long until(AbstractDate abstractDate, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (C480361.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return daysUntil(abstractDate);
                case 2:
                    return weeksUntil(abstractDate);
                case 3:
                    return monthsUntil(abstractDate);
                case 4:
                    return monthsUntil(abstractDate) / lengthOfYearInMonths();
                case 5:
                    return monthsUntil(abstractDate) / (lengthOfYearInMonths() * 10);
                case 6:
                    return monthsUntil(abstractDate) / (lengthOfYearInMonths() * 100);
                case 7:
                    return monthsUntil(abstractDate) / (lengthOfYearInMonths() * 1000);
                case 8:
                    ChronoField chronoField = ChronoField.ERA;
                    return abstractDate.getLong(chronoField) - getLong(chronoField);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, abstractDate);
    }

    long daysUntil(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate.toEpochDay() - toEpochDay();
    }

    long weeksUntil(AbstractDate abstractDate) {
        return daysUntil(abstractDate) / lengthOfWeek();
    }

    long monthsUntil(AbstractDate abstractDate) {
        return (((abstractDate.getProlepticMonth() * 256) + abstractDate.getDayOfMonth()) - ((getProlepticMonth() * 256) + getDayOfMonth())) / 256;
    }

    ChronoPeriod doUntil(AbstractDate abstractDate) {
        long prolepticMonth = abstractDate.getProlepticMonth() - getProlepticMonth();
        int dayOfMonth = abstractDate.getDayOfMonth() - getDayOfMonth();
        if (prolepticMonth > 0 && dayOfMonth < 0) {
            prolepticMonth--;
            dayOfMonth = (int) (abstractDate.toEpochDay() - plusMonths(prolepticMonth).toEpochDay());
        } else if (prolepticMonth < 0 && dayOfMonth > 0) {
            prolepticMonth++;
            dayOfMonth -= abstractDate.lengthOfMonth();
        }
        return getChronology().period(Math.toIntExact(prolepticMonth / lengthOfYearInMonths()), (int) (prolepticMonth % lengthOfYearInMonths()), dayOfMonth);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractDate abstractDate = (AbstractDate) obj;
            if (getProlepticYear() == abstractDate.getProlepticYear() && getMonth() == abstractDate.getMonth() && getDayOfMonth() == abstractDate.getDayOfMonth()) {
                return true;
            }
        }
        return false;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        return getChronology().getId().hashCode() ^ ((getProlepticYear() & (-2048)) ^ (((getProlepticYear() << 11) + (getMonth() << 6)) + getDayOfMonth()));
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(PlaceholderUtils.XXShortPlaceholderText);
        sb.append(getEra());
        sb.append(PlaceholderUtils.XXShortPlaceholderText);
        sb.append(getYearOfEra());
        sb.append(getMonth() < 10 ? "-0" : "-");
        sb.append(getMonth());
        sb.append(getDayOfMonth() < 10 ? "-0" : "-");
        sb.append(getDayOfMonth());
        return sb.toString();
    }
}
