package androidx.compose.foundation;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ClipScrollableContainer.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m3636d2 = {"Landroidx/compose/foundation/VerticalScrollableClipShape;", "Landroidx/compose/ui/graphics/Shape;", "()V", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.VerticalScrollableClipShape, reason: use source file name */
/* loaded from: classes4.dex */
final class ClipScrollableContainer3 implements Shape {
    public static final ClipScrollableContainer3 INSTANCE = new ClipScrollableContainer3();

    private ClipScrollableContainer3() {
    }

    @Override // androidx.compose.p011ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo4911createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        float fMo5010roundToPx0680j_4 = density.mo5010roundToPx0680j_4(ClipScrollableContainer.getMaxSupportedElevation());
        return new Outline.Rectangle(new Rect(-fMo5010roundToPx0680j_4, 0.0f, Float.intBitsToFloat((int) (size >> 32)) + fMo5010roundToPx0680j_4, Float.intBitsToFloat((int) (size & 4294967295L))));
    }
}
