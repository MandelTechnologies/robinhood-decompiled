package androidx.compose.p011ui.graphics;

import androidx.compose.p011ui.graphics.colorspace.ColorSpace;
import androidx.compose.p011ui.graphics.colorspace.ColorSpace2;
import androidx.compose.p011ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.UnsignedJVM;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Color.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u001a\u0010\r\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u000e\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010&\u001a\u0004\b*\u0010(R\u001a\u0010\u000f\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010&\u001a\u0004\b,\u0010(R\u001a\u0010\f\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010&\u001a\u0004\b.\u0010(\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, m3636d2 = {"Landroidx/compose/ui/graphics/Color;", "", "Lkotlin/ULong;", "value", "constructor-impl", "(J)J", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "convert", "", "alpha", "red", "green", "blue", "copy-wmQWz5c", "(JFFFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getValue-s-VKNKU", "()J", "getColorSpace-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace$annotations", "()V", "getRed-impl", "(J)F", "getRed$annotations", "getGreen-impl", "getGreen$annotations", "getBlue-impl", "getBlue$annotations", "getAlpha-impl", "getAlpha$annotations", "Companion", "ui-graphics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Color {
    private final long value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Black = Color2.Color(4278190080L);
    private static final long DarkGray = Color2.Color(4282664004L);
    private static final long Gray = Color2.Color(4287137928L);
    private static final long LightGray = Color2.Color(4291611852L);
    private static final long White = Color2.Color(4294967295L);
    private static final long Red = Color2.Color(4294901760L);
    private static final long Green = Color2.Color(4278255360L);
    private static final long Blue = Color2.Color(4278190335L);
    private static final long Yellow = Color2.Color(4294967040L);
    private static final long Cyan = Color2.Color(4278255615L);
    private static final long Magenta = Color2.Color(4294902015L);
    private static final long Transparent = Color2.Color(0);
    private static final long Unspecified = Color2.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m6701boximpl(long j) {
        return new Color(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6702constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6706equalsimpl(long j, Object obj) {
        return (obj instanceof Color) && j == ((Color) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6707equalsimpl0(long j, long j2) {
        return ULong.m28607equalsimpl0(j, j2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6713hashCodeimpl(long j) {
        return ULong.m28608hashCodeimpl(j);
    }

    public boolean equals(Object obj) {
        return m6706equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6713hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    private /* synthetic */ Color(long j) {
        this.value = j;
    }

    /* renamed from: getColorSpace-impl, reason: not valid java name */
    public static final ColorSpace m6710getColorSpaceimpl(long j) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) ULong.m28605constructorimpl(j & 63)];
    }

    /* renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m6703convertvNxB06k(long j, ColorSpace colorSpace) {
        return ColorSpace2.m6888connectYBCOT_4$default(m6710getColorSpaceimpl(j), colorSpace, 0, 2, null).mo6891transformToColorl2rxGTc$ui_graphics_release(j);
    }

    /* renamed from: getRed-impl, reason: not valid java name */
    public static final float m6712getRedimpl(long j) {
        int i;
        int i2;
        int i3;
        if (ULong.m28605constructorimpl(63 & j) == 0) {
            return ((float) UnsignedJVM.ulongToDouble(ULong.m28605constructorimpl(ULong.m28605constructorimpl(j >>> 48) & 255))) / 255.0f;
        }
        short sM28605constructorimpl = (short) ULong.m28605constructorimpl(ULong.m28605constructorimpl(j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & sM28605constructorimpl;
        int i5 = ((65535 & sM28605constructorimpl) >>> 10) & 31;
        int i6 = sM28605constructorimpl & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16.Fp32DenormalFloat;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* renamed from: getGreen-impl, reason: not valid java name */
    public static final float m6711getGreenimpl(long j) {
        int i;
        int i2;
        int i3;
        if (ULong.m28605constructorimpl(63 & j) == 0) {
            return ((float) UnsignedJVM.ulongToDouble(ULong.m28605constructorimpl(ULong.m28605constructorimpl(j >>> 40) & 255))) / 255.0f;
        }
        short sM28605constructorimpl = (short) ULong.m28605constructorimpl(ULong.m28605constructorimpl(j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & sM28605constructorimpl;
        int i5 = ((65535 & sM28605constructorimpl) >>> 10) & 31;
        int i6 = sM28605constructorimpl & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16.Fp32DenormalFloat;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* renamed from: getBlue-impl, reason: not valid java name */
    public static final float m6709getBlueimpl(long j) {
        int i;
        int i2;
        int i3;
        if (ULong.m28605constructorimpl(63 & j) == 0) {
            return ((float) UnsignedJVM.ulongToDouble(ULong.m28605constructorimpl(ULong.m28605constructorimpl(j >>> 32) & 255))) / 255.0f;
        }
        short sM28605constructorimpl = (short) ULong.m28605constructorimpl(ULong.m28605constructorimpl(j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & sM28605constructorimpl;
        int i5 = ((65535 & sM28605constructorimpl) >>> 10) & 31;
        int i6 = sM28605constructorimpl & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16.Fp32DenormalFloat;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m6708getAlphaimpl(long j) {
        float fUlongToDouble;
        float f;
        if (ULong.m28605constructorimpl(63 & j) == 0) {
            fUlongToDouble = (float) UnsignedJVM.ulongToDouble(ULong.m28605constructorimpl(ULong.m28605constructorimpl(j >>> 56) & 255));
            f = 255.0f;
        } else {
            fUlongToDouble = (float) UnsignedJVM.ulongToDouble(ULong.m28605constructorimpl(ULong.m28605constructorimpl(j >>> 6) & 1023));
            f = 1023.0f;
        }
        return fUlongToDouble / f;
    }

    /* renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m6705copywmQWz5c$default(long j, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m6708getAlphaimpl(j);
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = m6712getRedimpl(j);
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = m6711getGreenimpl(j);
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = m6709getBlueimpl(j);
        }
        return m6704copywmQWz5c(j, f5, f6, f7, f4);
    }

    /* renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m6704copywmQWz5c(long j, float f, float f2, float f3, float f4) {
        return Color2.Color(f2, f3, f4, f, m6710getColorSpaceimpl(j));
    }

    public String toString() {
        return m6714toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6714toStringimpl(long j) {
        return "Color(" + m6712getRedimpl(j) + ", " + m6711getGreenimpl(j) + ", " + m6709getBlueimpl(j) + ", " + m6708getAlphaimpl(j) + ", " + m6710getColorSpaceimpl(j).getName() + ')';
    }

    /* compiled from: Color.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR&\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR&\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR&\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR&\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR&\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR&\u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\bR&\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b%\u0010\u0006\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\bR&\u0010(\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b(\u0010\u0006\u0012\u0004\b*\u0010\u0003\u001a\u0004\b)\u0010\bR&\u0010+\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b+\u0010\u0006\u0012\u0004\b-\u0010\u0003\u001a\u0004\b,\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, m3636d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "Black", "J", "getBlack-0d7_KjU", "()J", "getBlack-0d7_KjU$annotations", "DarkGray", "getDarkGray-0d7_KjU", "getDarkGray-0d7_KjU$annotations", "Gray", "getGray-0d7_KjU", "getGray-0d7_KjU$annotations", "LightGray", "getLightGray-0d7_KjU", "getLightGray-0d7_KjU$annotations", "White", "getWhite-0d7_KjU", "getWhite-0d7_KjU$annotations", "Red", "getRed-0d7_KjU", "getRed-0d7_KjU$annotations", "Green", "getGreen-0d7_KjU", "getGreen-0d7_KjU$annotations", "Blue", "getBlue-0d7_KjU", "getBlue-0d7_KjU$annotations", "Yellow", "getYellow-0d7_KjU", "getYellow-0d7_KjU$annotations", "Cyan", "getCyan-0d7_KjU", "getCyan-0d7_KjU$annotations", "Magenta", "getMagenta-0d7_KjU", "getMagenta-0d7_KjU$annotations", "Transparent", "getTransparent-0d7_KjU", "getTransparent-0d7_KjU$annotations", "Unspecified", "getUnspecified-0d7_KjU", "getUnspecified-0d7_KjU$annotations", "ui-graphics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m6716getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
        public final long m6719getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m6720getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m6722getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m6727getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m6724getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m6721getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m6717getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m6728getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* renamed from: getCyan-0d7_KjU, reason: not valid java name */
        public final long m6718getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* renamed from: getMagenta-0d7_KjU, reason: not valid java name */
        public final long m6723getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m6725getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m6726getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }
    }
}
