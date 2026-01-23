package org.threeten.extra.chrono;

import p479j$.time.temporal.ValueRange;

/* loaded from: classes25.dex */
abstract class AbstractNileDate extends AbstractDate {
    abstract int getEpochDayDifference();

    @Override // org.threeten.extra.chrono.AbstractDate
    int lengthOfYearInMonths() {
        return 13;
    }

    AbstractNileDate() {
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    int getDayOfYear() {
        return ((getMonth() - 1) * 30) + getDayOfMonth();
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    AbstractDate withDayOfYear(int i) {
        int i2 = i - 1;
        return resolvePrevious(getProlepticYear(), (i2 / 30) + 1, (i2 % 30) + 1);
    }

    @Override // org.threeten.extra.chrono.AbstractDate
    ValueRange rangeAlignedWeekOfMonth() {
        return ValueRange.m3598of(1L, getMonth() == 13 ? 1L : 5L);
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public int lengthOfMonth() {
        if (getMonth() == 13) {
            return isLeapYear() ? 6 : 5;
        }
        return 30;
    }

    @Override // p479j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long prolepticYear = getProlepticYear();
        return ((((prolepticYear - 1) * 365) + Math.floorDiv(prolepticYear, 4L)) + (getDayOfYear() - 1)) - getEpochDayDifference();
    }
}
