package androidx.compose.p011ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Size.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087@\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\u0007\u001a\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001b\u0010\b\u001a\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010 R\u001a\u0010'\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010\"\u001a\u0004\b%\u0010 R\u001a\u0010*\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\"\u001a\u0004\b(\u0010 \u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, m3636d2 = {"Landroidx/compose/ui/geometry/Size;", "", "", "packedValue", "constructor-impl", "(J)J", "", "width", "height", "copy-xjbvk4A", "(JFF)J", "copy", "", "isEmpty-impl", "(J)Z", "isEmpty", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getPackedValue", "()J", "getWidth-impl", "(J)F", "getWidth$annotations", "()V", "getHeight-impl", "getHeight$annotations", "getMinDimension-impl", "getMinDimension$annotations", "minDimension", "getMaxDimension-impl", "getMaxDimension$annotations", "maxDimension", "Companion", "ui-geometry_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Size {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m6575constructorimpl(0);
    private static final long Unspecified = m6575constructorimpl(9205357640488583168L);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Size m6574boximpl(long j) {
        return new Size(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6575constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6578equalsimpl(long j, Object obj) {
        return (obj instanceof Size) && j == ((Size) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6579equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6584hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m6585isEmptyimpl(long j) {
        long j2 = (~((((-9223372034707292160L) & j) >>> 31) * (-1))) & j;
        return (((j2 & 4294967295L) & (j2 >>> 32)) == 0) | (j == 9205357640488583168L);
    }

    public boolean equals(Object obj) {
        return m6578equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6584hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: copy-xjbvk4A$default, reason: not valid java name */
    public static /* synthetic */ long m6577copyxjbvk4A$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (4294967295L & j));
        }
        return m6576copyxjbvk4A(j, f, f2);
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final float m6580getHeightimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: getMaxDimension-impl, reason: not valid java name */
    public static final float m6581getMaxDimensionimpl(long j) {
        return Math.max(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    /* renamed from: getMinDimension-impl, reason: not valid java name */
    public static final float m6582getMinDimensionimpl(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final float m6583getWidthimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: copy-xjbvk4A, reason: not valid java name */
    public static final long m6576copyxjbvk4A(long j, float f, float f2) {
        return m6575constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    private /* synthetic */ Size(long j) {
        this.packedValue = j;
    }

    /* compiled from: Size.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, m3636d2 = {"Landroidx/compose/ui/geometry/Size$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Size;", "Zero", "J", "getZero-NH-jbRc", "()J", "getZero-NH-jbRc$annotations", "Unspecified", "getUnspecified-NH-jbRc", "getUnspecified-NH-jbRc$annotations", "ui-geometry_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-NH-jbRc, reason: not valid java name */
        public final long m6589getZeroNHjbRc() {
            return Size.Zero;
        }

        /* renamed from: getUnspecified-NH-jbRc, reason: not valid java name */
        public final long m6588getUnspecifiedNHjbRc() {
            return Size.Unspecified;
        }
    }

    public String toString() {
        return m6586toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6586toStringimpl(long j) {
        if (j != 9205357640488583168L) {
            return "Size(" + GeometryUtils.toStringAsFixed(Float.intBitsToFloat((int) (j >> 32)), 1) + ", " + GeometryUtils.toStringAsFixed(Float.intBitsToFloat((int) (j & 4294967295L)), 1) + ')';
        }
        return "Size.Unspecified";
    }
}
