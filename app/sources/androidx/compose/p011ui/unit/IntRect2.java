package androidx.compose.p011ui.unit;

import androidx.compose.p011ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IntRect.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\u0004*\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, m3636d2 = {"Landroidx/compose/ui/unit/IntOffset;", "offset", "Landroidx/compose/ui/unit/IntSize;", "size", "Landroidx/compose/ui/unit/IntRect;", "IntRect-VbeCjmY", "(JJ)Landroidx/compose/ui/unit/IntRect;", "IntRect", "Landroidx/compose/ui/geometry/Rect;", "roundToIntRect", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/unit/IntRect;", "ui-unit_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.unit.IntRectKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class IntRect2 {
    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m8054IntRectVbeCjmY(long j, long j2) {
        return new IntRect(IntOffset.m8038getXimpl(j), IntOffset.m8039getYimpl(j), IntOffset.m8038getXimpl(j) + ((int) (j2 >> 32)), IntOffset.m8039getYimpl(j) + ((int) (j2 & 4294967295L)));
    }

    public static final IntRect roundToIntRect(Rect rect) {
        return new IntRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }
}
