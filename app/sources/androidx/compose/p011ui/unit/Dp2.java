package androidx.compose.p011ui.unit;

import androidx.compose.p011ui.util.MathHelpers;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Dp.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, m3636d2 = {"Landroidx/compose/ui/unit/Dp;", "start", "stop", "", "fraction", "lerp-Md-fbLM", "(FFF)F", "lerp", "x", "y", "Landroidx/compose/ui/unit/DpOffset;", "DpOffset-YgX7TsA", "(FF)J", "DpOffset", "width", "height", "Landroidx/compose/ui/unit/DpSize;", "DpSize-YgX7TsA", "DpSize", "ui-unit_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.unit.DpKt, reason: use source file name */
/* loaded from: classes.dex */
public final class Dp2 {
    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m8005DpOffsetYgX7TsA(float f, float f2) {
        return Dp3.m8009constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m8006DpSizeYgX7TsA(float f, float f2) {
        return Dp5.m8018constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m8007lerpMdfbLM(float f, float f2, float f3) {
        return C2002Dp.m7995constructorimpl(MathHelpers.lerp(f, f2, f3));
    }
}
