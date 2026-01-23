package p479j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes29.dex */
public final class ResolverStyle {
    public static final ResolverStyle LENIENT;
    public static final ResolverStyle SMART;
    public static final ResolverStyle STRICT;

    /* renamed from: a */
    public static final /* synthetic */ ResolverStyle[] f6821a;

    public static ResolverStyle valueOf(String str) {
        return (ResolverStyle) Enum.valueOf(ResolverStyle.class, str);
    }

    public static ResolverStyle[] values() {
        return (ResolverStyle[]) f6821a.clone();
    }

    static {
        ResolverStyle resolverStyle = new ResolverStyle("STRICT", 0);
        STRICT = resolverStyle;
        ResolverStyle resolverStyle2 = new ResolverStyle("SMART", 1);
        SMART = resolverStyle2;
        ResolverStyle resolverStyle3 = new ResolverStyle("LENIENT", 2);
        LENIENT = resolverStyle3;
        f6821a = new ResolverStyle[]{resolverStyle, resolverStyle2, resolverStyle3};
    }
}
