package org.threeten.extra.chrono;

import p479j$.time.DateTimeException;
import p479j$.time.chrono.Era;

/* loaded from: classes25.dex */
public enum PaxEra implements Era {
    BCE,
    CE;

    /* renamed from: of */
    public static PaxEra m4008of(int i) {
        if (i == 0) {
            return BCE;
        }
        if (i == 1) {
            return CE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // p479j$.time.chrono.Era
    public int getValue() {
        return ordinal();
    }
}
