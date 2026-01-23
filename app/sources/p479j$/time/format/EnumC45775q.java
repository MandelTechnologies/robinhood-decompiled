package p479j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.format.q */
/* loaded from: classes29.dex */
public final class EnumC45775q implements InterfaceC45763e {
    public static final EnumC45775q INSENSITIVE;
    public static final EnumC45775q LENIENT;
    public static final EnumC45775q SENSITIVE;
    public static final EnumC45775q STRICT;

    /* renamed from: a */
    public static final /* synthetic */ EnumC45775q[] f6864a;

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: c */
    public final boolean mo3559c(C45782x c45782x, StringBuilder sb) {
        return true;
    }

    public static EnumC45775q valueOf(String str) {
        return (EnumC45775q) Enum.valueOf(EnumC45775q.class, str);
    }

    public static EnumC45775q[] values() {
        return (EnumC45775q[]) f6864a.clone();
    }

    static {
        EnumC45775q enumC45775q = new EnumC45775q("SENSITIVE", 0);
        SENSITIVE = enumC45775q;
        EnumC45775q enumC45775q2 = new EnumC45775q("INSENSITIVE", 1);
        INSENSITIVE = enumC45775q2;
        EnumC45775q enumC45775q3 = new EnumC45775q("STRICT", 2);
        STRICT = enumC45775q3;
        EnumC45775q enumC45775q4 = new EnumC45775q("LENIENT", 3);
        LENIENT = enumC45775q4;
        f6864a = new EnumC45775q[]{enumC45775q, enumC45775q2, enumC45775q3, enumC45775q4};
    }

    @Override // p479j$.time.format.InterfaceC45763e
    /* renamed from: i */
    public final int mo3560i(C45780v c45780v, CharSequence charSequence, int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            c45780v.f6881b = true;
            return i;
        }
        if (iOrdinal == 1) {
            c45780v.f6881b = false;
            return i;
        }
        if (iOrdinal == 2) {
            c45780v.f6882c = true;
            return i;
        }
        if (iOrdinal != 3) {
            return i;
        }
        c45780v.f6882c = false;
        return i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
