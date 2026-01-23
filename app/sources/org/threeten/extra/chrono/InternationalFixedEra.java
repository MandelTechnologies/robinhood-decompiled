package org.threeten.extra.chrono;

import p479j$.time.DateTimeException;
import p479j$.time.chrono.Era;

/* loaded from: classes25.dex */
public enum InternationalFixedEra implements Era {
    CE;

    @Override // p479j$.time.chrono.Era
    public int getValue() {
        return 1;
    }

    /* renamed from: of */
    public static InternationalFixedEra m4004of(int i) {
        if (i == 1) {
            return CE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }
}
