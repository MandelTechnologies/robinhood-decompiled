package androidx.compose.p011ui.graphics.drawscope;

import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.InlineClassHelper3;
import androidx.compose.p011ui.graphics.Path;
import kotlin.Metadata;

/* compiled from: CanvasDrawScope.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"asDrawTransform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt, reason: use source file name */
/* loaded from: classes.dex */
public final class CanvasDrawScope3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt.asDrawTransform.1
            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo6940getSizeNHjbRc() {
                return drawContext.mo6936getSizeNHjbRc();
            }

            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            public void inset(float left, float top, float right, float bottom) {
                Canvas canvas = drawContext.getCanvas();
                DrawContext drawContext2 = drawContext;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (mo6940getSizeNHjbRc() >> 32)) - (right + left);
                long jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo6940getSizeNHjbRc() & 4294967295L)) - (bottom + top)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
                if (!(Float.intBitsToFloat((int) (jM6575constructorimpl >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jM6575constructorimpl & 4294967295L)) >= 0.0f)) {
                    InlineClassHelper3.throwIllegalArgumentException("Width and height must be greater than or equal to zero");
                }
                drawContext2.mo6937setSizeuvyYCjk(jM6575constructorimpl);
                canvas.translate(left, top);
            }

            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo6939clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
                drawContext.getCanvas().mo6596clipRectN_I0leg(left, top, right, bottom, clipOp);
            }

            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo6938clipPathmtrdDE(Path path, int clipOp) {
                drawContext.getCanvas().mo6595clipPathmtrdDE(path, clipOp);
            }

            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            public void translate(float left, float top) {
                drawContext.getCanvas().translate(left, top);
            }

            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo6941rotateUv8p0NA(float degrees, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                int i = (int) (pivot >> 32);
                int i2 = (int) (pivot & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                canvas.rotate(degrees);
                canvas.translate(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            }

            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo6942scale0AR0LA0(float scaleX, float scaleY, long pivot) {
                Canvas canvas = drawContext.getCanvas();
                int i = (int) (pivot >> 32);
                int i2 = (int) (pivot & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                canvas.scale(scaleX, scaleY);
                canvas.translate(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            }

            @Override // androidx.compose.p011ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo6943transform58bKbWc(float[] matrix) {
                drawContext.getCanvas().mo6597concat58bKbWc(matrix);
            }
        };
    }
}
