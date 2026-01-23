package p479j$.time.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.zone.d */
/* loaded from: classes29.dex */
public final class EnumC45811d {
    public static final EnumC45811d STANDARD;
    public static final EnumC45811d UTC;
    public static final EnumC45811d WALL;

    /* renamed from: a */
    public static final /* synthetic */ EnumC45811d[] f6987a;

    public static EnumC45811d valueOf(String str) {
        return (EnumC45811d) Enum.valueOf(EnumC45811d.class, str);
    }

    public static EnumC45811d[] values() {
        return (EnumC45811d[]) f6987a.clone();
    }

    static {
        EnumC45811d enumC45811d = new EnumC45811d("UTC", 0);
        UTC = enumC45811d;
        EnumC45811d enumC45811d2 = new EnumC45811d("WALL", 1);
        WALL = enumC45811d2;
        EnumC45811d enumC45811d3 = new EnumC45811d("STANDARD", 2);
        STANDARD = enumC45811d3;
        f6987a = new EnumC45811d[]{enumC45811d, enumC45811d2, enumC45811d3};
    }
}
