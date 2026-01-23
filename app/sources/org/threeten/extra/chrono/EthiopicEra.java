package org.threeten.extra.chrono;

import p479j$.time.DateTimeException;
import p479j$.time.chrono.Era;

/* loaded from: classes25.dex */
public enum EthiopicEra implements Era {
    BEFORE_INCARNATION,
    INCARNATION;

    /* renamed from: of */
    public static EthiopicEra m4002of(int i) {
        if (i == 0) {
            return BEFORE_INCARNATION;
        }
        if (i == 1) {
            return INCARNATION;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // p479j$.time.chrono.Era
    public int getValue() {
        return ordinal();
    }
}
