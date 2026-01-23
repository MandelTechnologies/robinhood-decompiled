package androidx.compose.p011ui.graphics.drawscope;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.ImageBitmap;
import androidx.compose.p011ui.graphics.Paint;
import androidx.compose.p011ui.graphics.Path;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EmptyCanvas.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010%\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\"\u0010*\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J*\u00100\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J7\u00101\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b1\u00102JG\u00105\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u00103\u001a\u00020\r2\u0006\u00104\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u00106J7\u00107\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b7\u00102J*\u0010<\u001a\u00020\u00042\u0006\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b:\u0010;JO\u0010A\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010=\u001a\u00020\r2\u0006\u0010>\u001a\u00020\r2\u0006\u0010@\u001a\u00020?2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bC\u0010DJ*\u0010J\u001a\u00020\u00042\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020+2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bH\u0010IJB\u0010S\u001a\u00020\u00042\u0006\u0010F\u001a\u00020E2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020K2\u0006\u0010P\u001a\u00020M2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ0\u0010Z\u001a\u00020\u00042\u0006\u0010U\u001a\u00020T2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020+0V2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ\u000f\u0010[\u001a\u00020\u0004H\u0016¢\u0006\u0004\b[\u0010\u0003J\u000f\u0010\\\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\\\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006]"}, m3636d2 = {"Landroidx/compose/ui/graphics/drawscope/EmptyCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "<init>", "()V", "", AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "restore", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/graphics/Paint;", "paint", "saveLayer", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Paint;)V", "", "dx", "dy", "translate", "(FF)V", "sx", "sy", "scale", "degrees", "rotate", "(F)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "concat-58bKbWc", "([F)V", "concat", "left", "top", "right", "bottom", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroidx/compose/ui/geometry/Offset;", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "(FFFFLandroidx/compose/ui/graphics/Paint;)V", "radiusX", "radiusY", "drawRoundRect", "(FFFFFFLandroidx/compose/ui/graphics/Paint;)V", "drawOval", "center", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc", "(FFFFFFZLandroidx/compose/ui/graphics/Paint;)V", "drawPath", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "", "points", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawPoints", "enableZ", "disableZ", "ui-graphics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class EmptyCanvas implements Canvas {
    public static final EmptyCanvas INSTANCE = new EmptyCanvas();

    private EmptyCanvas() {
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void save() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void restore() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void saveLayer(Rect bounds, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void translate(float dx, float dy) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void scale(float sx, float sy) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void rotate(float degrees) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: concat-58bKbWc */
    public void mo6597concat58bKbWc(float[] matrix) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg */
    public void mo6596clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E */
    public void mo6595clipPathmtrdDE(Path path, int clipOp) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g */
    public void mo6601drawLineWko1d7g(long p1, long p2, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void drawRect(float left, float top, float right, float bottom, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void drawRoundRect(float left, float top, float right, float bottom, float radiusX, float radiusY, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void drawOval(float left, float top, float right, float bottom, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo */
    public void mo6598drawCircle9KIMszo(long center, float radius, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I */
    public void mo6599drawImaged4ec7I(ImageBitmap image, long topLeftOffset, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0 */
    public void mo6600drawImageRectHPBpro0(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY */
    public void mo6602drawPointsO7TthRY(int pointMode, List<Offset> points, Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void enableZ() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.p011ui.graphics.Canvas
    public void disableZ() {
        throw new UnsupportedOperationException();
    }
}
