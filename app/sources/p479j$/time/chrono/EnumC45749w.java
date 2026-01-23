package p479j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.chrono.w */
/* loaded from: classes29.dex */
public final class EnumC45749w implements Era {
    public static final EnumC45749w BEFORE_ROC;
    public static final EnumC45749w ROC;

    /* renamed from: a */
    public static final /* synthetic */ EnumC45749w[] f6770a;

    public static EnumC45749w valueOf(String str) {
        return (EnumC45749w) Enum.valueOf(EnumC45749w.class, str);
    }

    public static EnumC45749w[] values() {
        return (EnumC45749w[]) f6770a.clone();
    }

    static {
        EnumC45749w enumC45749w = new EnumC45749w("BEFORE_ROC", 0);
        BEFORE_ROC = enumC45749w;
        EnumC45749w enumC45749w2 = new EnumC45749w("ROC", 1);
        ROC = enumC45749w2;
        f6770a = new EnumC45749w[]{enumC45749w, enumC45749w2};
    }

    @Override // p479j$.time.chrono.Era
    public final int getValue() {
        return ordinal();
    }
}
