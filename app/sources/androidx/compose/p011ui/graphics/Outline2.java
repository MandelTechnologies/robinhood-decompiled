package androidx.compose.p011ui.graphics;

import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RoundRect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.graphics.drawscope.DrawScope3;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Outline.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\u0010\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aN\u0010\u0010\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0018\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u001bH\u0002¢\u0006\u0004\b\u0017\u0010\u001c\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u001bH\u0002¢\u0006\u0004\b\u001a\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m3636d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", ResourceTypes.STYLE, "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "drawOutline-wDX37Ww", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOutline", "Landroidx/compose/ui/graphics/Brush;", "brush", "drawOutline-hn5TExg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "(Landroidx/compose/ui/geometry/Rect;)J", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/geometry/RoundRect;", "(Landroidx/compose/ui/geometry/RoundRect;)J", "ui-graphics_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.graphics.OutlineKt, reason: use source file name */
/* loaded from: classes.dex */
public final class Outline2 {
    private static final long size(Rect rect) {
        float right = rect.getRight() - rect.getLeft();
        float bottom = rect.getBottom() - rect.getTop();
        return Size.m6575constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    /* renamed from: drawOutline-wDX37Ww$default, reason: not valid java name */
    public static /* synthetic */ void m6799drawOutlinewDX37Ww$default(DrawScope drawScope, Outline outline, long j, float f, DrawScope2 drawScope2, ColorFilter colorFilter, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            drawScope2 = DrawScope3.INSTANCE;
        }
        DrawScope2 drawScope22 = drawScope2;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        m6798drawOutlinewDX37Ww(drawScope, outline, j, f2, drawScope22, colorFilter, (i2 & 32) != 0 ? DrawScope.INSTANCE.m6964getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawOutline-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m6797drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f, DrawScope2 drawScope2, ColorFilter colorFilter, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            drawScope2 = DrawScope3.INSTANCE;
        }
        DrawScope2 drawScope22 = drawScope2;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            i = DrawScope.INSTANCE.m6964getDefaultBlendMode0nO6VwU();
        }
        m6796drawOutlinehn5TExg(drawScope, outline, brush, f2, drawScope22, colorFilter2, i);
    }

    private static final long topLeft(Rect rect) {
        float left = rect.getLeft();
        float top = rect.getTop();
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & 4294967295L));
    }

    private static final long topLeft(RoundRect roundRect) {
        float left = roundRect.getLeft();
        float top = roundRect.getTop();
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & 4294967295L));
    }

    private static final long size(RoundRect roundRect) {
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        return Size.m6575constructorimpl((Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L));
    }

    /* renamed from: drawOutline-hn5TExg, reason: not valid java name */
    public static final void m6796drawOutlinehn5TExg(DrawScope drawScope, Outline outline, Brush brush, float f, DrawScope2 drawScope2, ColorFilter colorFilter, int i) {
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo6929drawRectAsUm42w(brush, topLeft(rect), size(rect), f, drawScope2, colorFilter, i);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath = rounded.getRoundRectPath();
            if (roundRectPath != null) {
                drawScope.mo6926drawPathGBMwjPU(roundRectPath, brush, f, drawScope2, colorFilter, i);
                return;
            }
            RoundRect roundRect = rounded.getRoundRect();
            float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32));
            drawScope.mo6931drawRoundRectZuiqVtQ(brush, topLeft(roundRect), size(roundRect), CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), f, drawScope2, colorFilter, i);
            return;
        }
        if (outline instanceof Outline.Generic) {
            drawScope.mo6926drawPathGBMwjPU(((Outline.Generic) outline).getPath(), brush, f, drawScope2, colorFilter, i);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: drawOutline-wDX37Ww, reason: not valid java name */
    public static final void m6798drawOutlinewDX37Ww(DrawScope drawScope, Outline outline, long j, float f, DrawScope2 drawScope2, ColorFilter colorFilter, int i) {
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo6930drawRectnJ9OG0(j, topLeft(rect), size(rect), f, drawScope2, colorFilter, i);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath = rounded.getRoundRectPath();
            if (roundRectPath != null) {
                drawScope.mo6927drawPathLG529CI(roundRectPath, j, f, drawScope2, colorFilter, i);
                return;
            }
            RoundRect roundRect = rounded.getRoundRect();
            float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32));
            drawScope.mo6932drawRoundRectuAw5IA(j, topLeft(roundRect), size(roundRect), CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), drawScope2, f, colorFilter, i);
            return;
        }
        if (outline instanceof Outline.Generic) {
            drawScope.mo6927drawPathLG529CI(((Outline.Generic) outline).getPath(), j, f, drawScope2, colorFilter, i);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
}
