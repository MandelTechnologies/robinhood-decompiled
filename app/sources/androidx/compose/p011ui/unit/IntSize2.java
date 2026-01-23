package androidx.compose.p011ui.unit;

import androidx.compose.p011ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IntSize.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0016\u0010\t\u001a\u00020\u0006*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0016\u0010\u000b\u001a\u00020\u0003*\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\"\u001e\u0010\u0010\u001a\u00020\f*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\r\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, m3636d2 = {"", "width", "height", "Landroidx/compose/ui/unit/IntSize;", "IntSize", "(II)J", "Landroidx/compose/ui/geometry/Size;", "toSize-ozmzZPI", "(J)J", "toSize", "roundToIntSize-uvyYCjk", "roundToIntSize", "Landroidx/compose/ui/unit/IntOffset;", "getCenter-ozmzZPI", "getCenter-ozmzZPI$annotations", "(J)V", "center", "ui-unit_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.unit.IntSizeKt, reason: use source file name */
/* loaded from: classes.dex */
public final class IntSize2 {
    /* renamed from: roundToIntSize-uvyYCjk, reason: not valid java name */
    public static final long m8066roundToIntSizeuvyYCjk(long j) {
        return IntSize.m8056constructorimpl((Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32));
    }

    public static final long IntSize(int i, int i2) {
        return IntSize.m8056constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m8067toSizeozmzZPI(long j) {
        return Size.m6575constructorimpl((Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
    }

    /* renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m8065getCenterozmzZPI(long j) {
        return IntOffset.m8033constructorimpl((((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32));
    }
}
