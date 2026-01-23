package org.threeten.extra.chrono;

import p479j$.time.DateTimeException;
import p479j$.time.chrono.Era;

/* loaded from: classes25.dex */
public enum JulianEra implements Era {
    BC,
    AD;

    /* renamed from: of */
    public static JulianEra m4006of(int i) {
        if (i == 0) {
            return BC;
        }
        if (i == 1) {
            return AD;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // p479j$.time.chrono.Era
    public int getValue() {
        return ordinal();
    }
}
