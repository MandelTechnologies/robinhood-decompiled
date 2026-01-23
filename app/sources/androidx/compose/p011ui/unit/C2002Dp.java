package androidx.compose.p011ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Dp.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m3636d2 = {"Landroidx/compose/ui/unit/Dp;", "", "", "value", "constructor-impl", "(F)F", "other", "", "compareTo-0680j_4", "(FF)I", "compareTo", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "hashCode-impl", "(F)I", "hashCode", "", "", "equals-impl", "(FLjava/lang/Object;)Z", "equals", "F", "getValue", "()F", "Companion", "ui-unit_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* renamed from: androidx.compose.ui.unit.Dp */
/* loaded from: classes.dex */
public final class C2002Dp implements Comparable<C2002Dp> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float Hairline = m7995constructorimpl(0.0f);
    private static final float Infinity = m7995constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m7995constructorimpl(Float.NaN);
    private final float value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ C2002Dp m7993boximpl(float f) {
        return new C2002Dp(f);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m7995constructorimpl(float f) {
        return f;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7996equalsimpl(float f, Object obj) {
        return (obj instanceof C2002Dp) && Float.compare(f, ((C2002Dp) obj).getValue()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7997equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7998hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    public boolean equals(Object obj) {
        return m7996equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7998hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ float getValue() {
        return this.value;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C2002Dp c2002Dp) {
        return m8000compareTo0680j_4(c2002Dp.getValue());
    }

    private /* synthetic */ C2002Dp(float f) {
        this.value = f;
    }

    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m7994compareTo0680j_4(float f, float f2) {
        return Float.compare(f, f2);
    }

    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m8000compareTo0680j_4(float f) {
        return m7994compareTo0680j_4(this.value, f);
    }

    public String toString() {
        return m7999toStringimpl(this.value);
    }

    /* compiled from: Dp.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, m3636d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "Hairline", "F", "getHairline-D9Ej5fM", "()F", "getHairline-D9Ej5fM$annotations", "Infinity", "getInfinity-D9Ej5fM", "getInfinity-D9Ej5fM$annotations", "Unspecified", "getUnspecified-D9Ej5fM", "getUnspecified-D9Ej5fM$annotations", "ui-unit_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: androidx.compose.ui.unit.Dp$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m8002getHairlineD9Ej5fM() {
            return C2002Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m8003getInfinityD9Ej5fM() {
            return C2002Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m8004getUnspecifiedD9Ej5fM() {
            return C2002Dp.Unspecified;
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7999toStringimpl(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }
}
