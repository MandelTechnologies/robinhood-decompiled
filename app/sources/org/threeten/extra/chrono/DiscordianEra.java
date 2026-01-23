package org.threeten.extra.chrono;

import p479j$.time.DateTimeException;
import p479j$.time.chrono.Era;

/* loaded from: classes25.dex */
public enum DiscordianEra implements Era {
    YOLD;

    /* renamed from: of */
    public static DiscordianEra m4000of(int i) {
        if (i == 1) {
            return YOLD;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // p479j$.time.chrono.Era
    public int getValue() {
        return ordinal();
    }
}
