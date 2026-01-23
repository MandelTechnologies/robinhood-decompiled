package androidx.compose.p011ui.text;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.graphics.drawscope.DrawScope3;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextForegroundStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TextPainter.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TextPainter {
    public static final TextPainter INSTANCE = new TextPainter();

    private TextPainter() {
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) throws Throwable {
        Canvas canvas2;
        Throwable th;
        Canvas canvas3;
        long jM6716getBlack0d7_KjU;
        float alpha;
        boolean z = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m7955equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), TextOverflow.INSTANCE.m7962getVisiblegIe3tQ8());
        if (z) {
            float size = (int) (textLayoutResult.getSize() >> 32);
            float size2 = (int) (textLayoutResult.getSize() & 4294967295L);
            Rect rectM6565Recttz77jQw = Rect2.m6565Recttz77jQw(Offset.INSTANCE.m6553getZeroF1C5BW0(), Size.m6575constructorimpl((Float.floatToRawIntBits(size2) & 4294967295L) | (Float.floatToRawIntBits(size) << 32)));
            canvas.save();
            canvas2 = null;
            Canvas.m6695clipRectmtrdDE$default(canvas, rectM6565Recttz77jQw, 0, 2, null);
        }
        SpanStyle spanStyle = textLayoutResult.getLayoutInput().getStyle().getSpanStyle();
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.getNone();
        }
        Shadow shadow2 = shadow;
        DrawScope2 drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = DrawScope3.INSTANCE;
        }
        DrawScope2 drawScope2 = drawStyle;
        try {
            Brush brush = spanStyle.getBrush();
            try {
                if (brush != null) {
                    if (spanStyle.getTextForegroundStyle() != TextForegroundStyle.Unspecified.INSTANCE) {
                        try {
                            alpha = spanStyle.getTextForegroundStyle().getAlpha();
                        } catch (Throwable th2) {
                            th = th2;
                            canvas2 = canvas;
                            if (z) {
                                throw th;
                            }
                            canvas2.restore();
                            throw th;
                        }
                    } else {
                        alpha = 1.0f;
                    }
                    canvas3 = canvas;
                    MultiParagraph.m7544painthn5TExg$default(textLayoutResult.getMultiParagraph(), canvas3, brush, alpha, shadow2, textDecoration2, drawScope2, 0, 64, null);
                } else {
                    canvas3 = canvas;
                    if (spanStyle.getTextForegroundStyle() != TextForegroundStyle.Unspecified.INSTANCE) {
                        jM6716getBlack0d7_KjU = spanStyle.getTextForegroundStyle().getValue();
                    } else {
                        jM6716getBlack0d7_KjU = Color.INSTANCE.m6716getBlack0d7_KjU();
                    }
                    textLayoutResult.getMultiParagraph().m7549paintLG529CI(canvas3, (30 & 2) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : jM6716getBlack0d7_KjU, (30 & 4) != 0 ? null : shadow2, (30 & 8) != 0 ? null : textDecoration2, (30 & 16) == 0 ? drawScope2 : null, (30 & 32) != 0 ? DrawScope.INSTANCE.m6964getDefaultBlendMode0nO6VwU() : 0);
                }
                if (z) {
                    canvas3.restore();
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                if (z) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            canvas2 = canvas;
        }
    }
}
