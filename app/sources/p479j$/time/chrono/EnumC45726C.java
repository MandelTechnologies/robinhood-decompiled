package p479j$.time.chrono;

import com.robinhood.iso.countrycode.CountryCode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.chrono.C */
/* loaded from: classes29.dex */
public final class EnumC45726C implements Era {

    /* renamed from: BE */
    public static final EnumC45726C f6716BE;
    public static final EnumC45726C BEFORE_BE;

    /* renamed from: a */
    public static final /* synthetic */ EnumC45726C[] f6717a;

    public static EnumC45726C valueOf(String str) {
        return (EnumC45726C) Enum.valueOf(EnumC45726C.class, str);
    }

    public static EnumC45726C[] values() {
        return (EnumC45726C[]) f6717a.clone();
    }

    static {
        EnumC45726C enumC45726C = new EnumC45726C("BEFORE_BE", 0);
        BEFORE_BE = enumC45726C;
        EnumC45726C enumC45726C2 = new EnumC45726C(CountryCode.COUNTRY_CODE_BE, 1);
        f6716BE = enumC45726C2;
        f6717a = new EnumC45726C[]{enumC45726C, enumC45726C2};
    }

    @Override // p479j$.time.chrono.Era
    public final int getValue() {
        return ordinal();
    }
}
