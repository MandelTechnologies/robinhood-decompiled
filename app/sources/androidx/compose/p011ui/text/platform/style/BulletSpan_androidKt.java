package androidx.compose.p011ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RoundRect2;
import androidx.compose.p011ui.graphics.AndroidPath;
import androidx.compose.p011ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Brush5;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.Outline;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.graphics.drawscope.DrawScope3;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BulletSpan.android.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a>\u0010\f\u001a\u00020\u0001*\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, m3636d2 = {"draw", "", "Landroidx/compose/ui/graphics/Outline;", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "xStart", "", "yCenter", "dir", "", "setBrushAndDraw", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "size", "Landroidx/compose/ui/geometry/Size;", "Lkotlin/Function0;", "setBrushAndDraw-yzxVdVo", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/Brush;FJLkotlin/jvm/functions/Function0;)V", "setDrawStyle", "value", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "ui-text_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BulletSpan_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDrawStyle(Paint paint, DrawScope2 drawScope2) {
        if (Intrinsics.areEqual(drawScope2, DrawScope3.INSTANCE)) {
            paint.setStyle(Paint.Style.FILL);
            return;
        }
        if (drawScope2 instanceof Stroke) {
            paint.setStyle(Paint.Style.STROKE);
            Stroke stroke = (Stroke) drawScope2;
            paint.setStrokeWidth(stroke.getWidth());
            paint.setStrokeMiter(stroke.getMiter());
            paint.setStrokeCap(DrawStyleSpan_androidKt.m7823toAndroidCapBeK7IIE(stroke.getCap()));
            paint.setStrokeJoin(DrawStyleSpan_androidKt.m7824toAndroidJoinWw9F2mQ(stroke.getJoin()));
            PathEffect pathEffect = stroke.getPathEffect();
            paint.setPathEffect(pathEffect != null ? AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draw(Outline outline, Canvas canvas, Paint paint, float f, float f2, int i) {
        if (outline instanceof Outline.Generic) {
            canvas.save();
            Rect rect = outline.getRect();
            canvas.translate(f, f2 - ((rect.getBottom() - rect.getTop()) / 2.0f));
            Path path = ((Outline.Generic) outline).getPath();
            if (!(path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            canvas.drawPath(((AndroidPath) path).getInternalPath(), paint);
            canvas.restore();
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            if (RoundRect2.isSimple(rounded.getRoundRect())) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (rounded.getRoundRect().getTopLeftCornerRadius() >> 32));
                canvas.drawRoundRect(f, f2 - (rounded.getRoundRect().getHeight() / 2.0f), (i * rounded.getRoundRect().getWidth()) + f, (rounded.getRoundRect().getHeight() / 2.0f) + f2, fIntBitsToFloat, fIntBitsToFloat, paint);
                return;
            }
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect$default(Path, rounded.getRoundRect(), null, 2, null);
            canvas.save();
            canvas.translate(f, f2 - (rounded.getRoundRect().getHeight() / 2.0f));
            if (!(Path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            canvas.drawPath(((AndroidPath) Path).getInternalPath(), paint);
            canvas.restore();
            return;
        }
        if (outline instanceof Outline.Rectangle) {
            Outline.Rectangle rectangle = (Outline.Rectangle) outline;
            Rect rect2 = rectangle.getRect();
            float bottom = f2 - ((rect2.getBottom() - rect2.getTop()) / 2.0f);
            Rect rect3 = rectangle.getRect();
            float right = f + (i * (rect3.getRight() - rect3.getLeft()));
            Rect rect4 = rectangle.getRect();
            canvas.drawRect(f, bottom, right, f2 + ((rect4.getBottom() - rect4.getTop()) / 2.0f), paint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBrushAndDraw-yzxVdVo, reason: not valid java name */
    public static final void m7822setBrushAndDrawyzxVdVo(Paint paint, Brush brush, float f, long j, Function0<Unit> function0) {
        Integer numValueOf = null;
        if (brush == null) {
            if (!Float.isNaN(f)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f * 255.0f));
            }
            function0.invoke();
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (brush instanceof SolidColor) {
            int color = paint.getColor();
            if (!Float.isNaN(f)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f * 255.0f));
            }
            paint.setColor(Color2.m6735toArgb8_81llA(((SolidColor) brush).getValue()));
            function0.invoke();
            paint.setColor(color);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (brush instanceof Brush5) {
            Shader shader = paint.getShader();
            if (!Float.isNaN(f)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f * 255.0f));
            }
            paint.setShader(((Brush5) brush).mo6692createShaderuvyYCjk(j));
            function0.invoke();
            paint.setShader(shader);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        }
    }
}
