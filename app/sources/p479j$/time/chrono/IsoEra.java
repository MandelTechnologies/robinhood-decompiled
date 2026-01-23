package p479j$.time.chrono;

import p479j$.time.DateTimeException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes29.dex */
public final class IsoEra implements Era {
    public static final IsoEra BCE;

    /* renamed from: CE */
    public static final IsoEra f6718CE;

    /* renamed from: a */
    public static final /* synthetic */ IsoEra[] f6719a;

    public static IsoEra valueOf(String str) {
        return (IsoEra) Enum.valueOf(IsoEra.class, str);
    }

    public static IsoEra[] values() {
        return (IsoEra[]) f6719a.clone();
    }

    static {
        IsoEra isoEra = new IsoEra("BCE", 0);
        BCE = isoEra;
        IsoEra isoEra2 = new IsoEra("CE", 1);
        f6718CE = isoEra2;
        f6719a = new IsoEra[]{isoEra, isoEra2};
    }

    /* renamed from: of */
    public static IsoEra m3487of(int i) {
        if (i == 0) {
            return BCE;
        }
        if (i == 1) {
            return f6718CE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // p479j$.time.chrono.Era
    public final int getValue() {
        return ordinal();
    }
}
