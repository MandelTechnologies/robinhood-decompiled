package org.threeten.extra.chrono;

import p479j$.time.chrono.AbstractChronology;
import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ValueRange;

/* loaded from: classes25.dex */
abstract class AbstractNileChronology extends AbstractChronology {
    static final ValueRange YEAR_RANGE = ValueRange.m3598of(-999998, 999999);
    static final ValueRange YOE_RANGE = ValueRange.m3598of(1, 999999);
    static final ValueRange PROLEPTIC_MONTH_RANGE = ValueRange.m3598of(-12999974, 12999999);
    static final ValueRange MOY_RANGE = ValueRange.m3598of(1, 13);
    static final ValueRange ALIGNED_WOM_RANGE = ValueRange.m3599of(1, 1, 5);
    static final ValueRange DOM_RANGE = ValueRange.m3599of(1, 5, 30);
    static final ValueRange DOM_RANGE_NONLEAP = ValueRange.m3598of(1, 5);
    static final ValueRange DOM_RANGE_LEAP = ValueRange.m3598of(1, 6);

    AbstractNileChronology() {
    }

    @Override // p479j$.time.chrono.AbstractChronology, p479j$.time.chrono.Chronology
    public boolean isLeapYear(long j) {
        return Math.floorMod(j, 4L) == 3;
    }

    /* renamed from: org.threeten.extra.chrono.AbstractNileChronology$1 */
    static /* synthetic */ class C480371 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MONTH_OF_YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.PROLEPTIC_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR_OF_ERA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // p479j$.time.chrono.Chronology
    public ValueRange range(ChronoField chronoField) {
        switch (C480371.$SwitchMap$java$time$temporal$ChronoField[chronoField.ordinal()]) {
            case 1:
                return DOM_RANGE;
            case 2:
                return ALIGNED_WOM_RANGE;
            case 3:
                return MOY_RANGE;
            case 4:
                return PROLEPTIC_MONTH_RANGE;
            case 5:
                return YOE_RANGE;
            case 6:
                return YEAR_RANGE;
            default:
                return chronoField.range();
        }
    }
}
