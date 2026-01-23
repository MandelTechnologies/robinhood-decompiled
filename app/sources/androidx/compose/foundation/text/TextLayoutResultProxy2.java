package androidx.compose.foundation.text;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TextLayoutResultProxy.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, m3636d2 = {"coerceIn", "Landroidx/compose/ui/geometry/Offset;", "rect", "Landroidx/compose/ui/geometry/Rect;", "coerceIn-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)J", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.TextLayoutResultProxyKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class TextLayoutResultProxy2 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m5445coerceIn3MmeM6k(long j, Rect rect) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i) < rect.getLeft() ? rect.getLeft() : Float.intBitsToFloat(i) > rect.getRight() ? rect.getRight() : Float.intBitsToFloat(i)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i2) < rect.getTop() ? rect.getTop() : Float.intBitsToFloat(i2) > rect.getBottom() ? rect.getBottom() : Float.intBitsToFloat(i2)) & 4294967295L));
    }
}
