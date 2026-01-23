package org.threeten.extra.chrono;

import p479j$.time.DateTimeException;
import p479j$.time.chrono.Era;

/* loaded from: classes25.dex */
public enum CopticEra implements Era {
    BEFORE_AM,
    AM;

    /* renamed from: of */
    public static CopticEra m3998of(int i) {
        if (i == 0) {
            return BEFORE_AM;
        }
        if (i == 1) {
            return AM;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // p479j$.time.chrono.Era
    public int getValue() {
        return ordinal();
    }
}
