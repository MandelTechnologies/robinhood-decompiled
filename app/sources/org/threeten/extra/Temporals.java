package org.threeten.extra;

import p479j$.time.temporal.ChronoField;
import p479j$.time.temporal.ChronoUnit;
import p479j$.time.temporal.Temporal;
import p479j$.time.temporal.TemporalAdjuster;

/* loaded from: classes25.dex */
public final class Temporals {

    private enum Adjuster implements TemporalAdjuster {
        NEXT_WORKING { // from class: org.threeten.extra.Temporals.Adjuster.1
            @Override // p479j$.time.temporal.TemporalAdjuster
            public Temporal adjustInto(Temporal temporal) {
                int i = temporal.get(ChronoField.DAY_OF_WEEK);
                if (i == 5) {
                    return temporal.plus(3L, ChronoUnit.DAYS);
                }
                if (i == 6) {
                    return temporal.plus(2L, ChronoUnit.DAYS);
                }
                return temporal.plus(1L, ChronoUnit.DAYS);
            }
        },
        PREVIOUS_WORKING { // from class: org.threeten.extra.Temporals.Adjuster.2
            @Override // p479j$.time.temporal.TemporalAdjuster
            public Temporal adjustInto(Temporal temporal) {
                int i = temporal.get(ChronoField.DAY_OF_WEEK);
                if (i == 1) {
                    return temporal.minus(3L, ChronoUnit.DAYS);
                }
                if (i == 7) {
                    return temporal.minus(2L, ChronoUnit.DAYS);
                }
                return temporal.minus(1L, ChronoUnit.DAYS);
            }
        },
        NEXT_WORKING_OR_SAME { // from class: org.threeten.extra.Temporals.Adjuster.3
            @Override // p479j$.time.temporal.TemporalAdjuster
            public Temporal adjustInto(Temporal temporal) {
                int i = temporal.get(ChronoField.DAY_OF_WEEK);
                if (i != 6) {
                    return i != 7 ? temporal : temporal.plus(1L, ChronoUnit.DAYS);
                }
                return temporal.plus(2L, ChronoUnit.DAYS);
            }
        },
        PREVIOUS_WORKING_OR_SAME { // from class: org.threeten.extra.Temporals.Adjuster.4
            @Override // p479j$.time.temporal.TemporalAdjuster
            public Temporal adjustInto(Temporal temporal) {
                int i = temporal.get(ChronoField.DAY_OF_WEEK);
                if (i != 6) {
                    return i != 7 ? temporal : temporal.minus(2L, ChronoUnit.DAYS);
                }
                return temporal.minus(1L, ChronoUnit.DAYS);
            }
        }
    }

    public static TemporalAdjuster nextWorkingDay() {
        return Adjuster.NEXT_WORKING;
    }

    public static TemporalAdjuster previousWorkingDay() {
        return Adjuster.PREVIOUS_WORKING;
    }
}
