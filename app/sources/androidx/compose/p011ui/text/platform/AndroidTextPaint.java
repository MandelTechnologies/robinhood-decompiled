package androidx.compose.p011ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Brush5;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.Paint;
import androidx.compose.p011ui.graphics.PaintingStyle;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.graphics.drawscope.DrawScope3;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextForegroundStyle4;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AndroidTextPaint.android.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001f\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010'R\u001c\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b)\u0010*R(\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010+\u0012\u0004\b/\u0010\n\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u0012R\u001e\u00100\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b0\u00101R*\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0019\u00102\u0012\u0004\b7\u0010\n\u001a\u0004\b3\u00104\"\u0004\b5\u00106R2\u0010;\u001a\u0012\u0012\f\u0012\n\u0018\u000109j\u0004\u0018\u0001`:\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R0\u0010A\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0081\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0004\bA\u0010B\u0012\u0004\bG\u0010\n\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010HR\u0014\u0010K\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR*\u0010Q\u001a\u00020(2\u0006\u0010L\u001a\u00020(8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, m3636d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "", "flags", "", "density", "<init>", "(IF)V", "", "clearShader", "()V", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "setTextDecoration", "(Landroidx/compose/ui/text/style/TextDecoration;)V", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "setShadow", "(Landroidx/compose/ui/graphics/Shadow;)V", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "setColor-8_81llA", "(J)V", "setColor", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/geometry/Size;", "size", "alpha", "setBrush-12SF9DM", "(Landroidx/compose/ui/graphics/Brush;JF)V", "setBrush", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "setDrawStyle", "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V", "Landroidx/compose/ui/graphics/Paint;", "backingComposePaint", "Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/text/style/TextDecoration;", "Landroidx/compose/ui/graphics/BlendMode;", "backingBlendMode", "I", "Landroidx/compose/ui/graphics/Shadow;", "getShadow$ui_text_release", "()Landroidx/compose/ui/graphics/Shadow;", "setShadow$ui_text_release", "getShadow$ui_text_release$annotations", "lastColor", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/ui/graphics/Brush;", "getBrush$ui_text_release", "()Landroidx/compose/ui/graphics/Brush;", "setBrush$ui_text_release", "(Landroidx/compose/ui/graphics/Brush;)V", "getBrush$ui_text_release$annotations", "Landroidx/compose/runtime/State;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "shaderState", "Landroidx/compose/runtime/State;", "getShaderState$ui_text_release", "()Landroidx/compose/runtime/State;", "setShaderState$ui_text_release", "(Landroidx/compose/runtime/State;)V", "brushSize", "Landroidx/compose/ui/geometry/Size;", "getBrushSize-VsRJwc0$ui_text_release", "()Landroidx/compose/ui/geometry/Size;", "setBrushSize-iaC8Vc4$ui_text_release", "(Landroidx/compose/ui/geometry/Size;)V", "getBrushSize-VsRJwc0$ui_text_release$annotations", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getComposePaint", "()Landroidx/compose/ui/graphics/Paint;", "composePaint", "value", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidTextPaint extends TextPaint {
    private int backingBlendMode;
    private Paint backingComposePaint;
    private Brush brush;
    private Size brushSize;
    private DrawScope2 drawStyle;
    private Color lastColor;
    private SnapshotState4<? extends Shader> shaderState;
    private Shadow shadow;
    private TextDecoration textDecoration;

    public AndroidTextPaint(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.textDecoration = TextDecoration.INSTANCE.getNone();
        this.backingBlendMode = DrawScope.INSTANCE.m6964getDefaultBlendMode0nO6VwU();
        this.shadow = Shadow.INSTANCE.getNone();
    }

    private final Paint getComposePaint() {
        Paint paint = this.backingComposePaint;
        if (paint != null) {
            return paint;
        }
        Paint paintAsComposePaint = AndroidPaint_androidKt.asComposePaint(this);
        this.backingComposePaint = paintAsComposePaint;
        return paintAsComposePaint;
    }

    public final void setTextDecoration(TextDecoration textDecoration) {
        if (textDecoration == null || Intrinsics.areEqual(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        TextDecoration.Companion companion = TextDecoration.INSTANCE;
        setUnderlineText(textDecoration.contains(companion.getUnderline()));
        setStrikeThruText(this.textDecoration.contains(companion.getLineThrough()));
    }

    public final void setShadow(Shadow shadow) {
        if (shadow == null || Intrinsics.areEqual(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (Intrinsics.areEqual(shadow, Shadow.INSTANCE.getNone())) {
            clearShadowLayer();
        } else {
            setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Float.intBitsToFloat((int) (this.shadow.getOffset() >> 32)), Float.intBitsToFloat((int) (this.shadow.getOffset() & 4294967295L)), Color2.m6735toArgb8_81llA(this.shadow.getColor()));
        }
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m7807setColor8_81llA(long color) {
        Color color2 = this.lastColor;
        if (color2 == null ? false : Color.m6707equalsimpl0(color2.getValue(), color)) {
            return;
        }
        if (color != 16) {
            this.lastColor = Color.m6701boximpl(color);
            setColor(Color2.m6735toArgb8_81llA(color));
            clearShader();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* renamed from: setBrush-12SF9DM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7806setBrush12SF9DM(final Brush brush, final long size, float alpha) {
        if (brush == null) {
            clearShader();
            return;
        }
        if (brush instanceof SolidColor) {
            m7807setColor8_81llA(TextForegroundStyle4.m7939modulateDxMtmZc(((SolidColor) brush).getValue(), alpha));
            return;
        }
        if (brush instanceof Brush5) {
            if (Intrinsics.areEqual(this.brush, brush)) {
                Size size2 = this.brushSize;
                if (!(size2 == null ? false : Size.m6579equalsimpl0(size2.getPackedValue(), size))) {
                }
            } else {
                if (size != 9205357640488583168L) {
                    this.brush = brush;
                    this.brushSize = Size.m6574boximpl(size);
                    this.shaderState = SnapshotStateKt.derivedStateOf(new Function0<Shader>() { // from class: androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Shader invoke() {
                            return ((Brush5) brush).mo6692createShaderuvyYCjk(size);
                        }
                    });
                }
            }
            Paint composePaint = getComposePaint();
            SnapshotState4<? extends Shader> snapshotState4 = this.shaderState;
            composePaint.setShader(snapshotState4 != null ? snapshotState4.getValue() : null);
            this.lastColor = null;
            AndroidTextPaint_androidKt.setAlpha(this, alpha);
        }
    }

    public final void setDrawStyle(DrawScope2 drawStyle) {
        if (drawStyle == null || Intrinsics.areEqual(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (Intrinsics.areEqual(drawStyle, DrawScope3.INSTANCE)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (drawStyle instanceof Stroke) {
            getComposePaint().mo6621setStylek9PVt8s(PaintingStyle.INSTANCE.m6803getStrokeTiuSbCo());
            Stroke stroke = (Stroke) drawStyle;
            getComposePaint().setStrokeWidth(stroke.getWidth());
            getComposePaint().setStrokeMiterLimit(stroke.getMiter());
            getComposePaint().mo6620setStrokeJoinWw9F2mQ(stroke.getJoin());
            getComposePaint().mo6619setStrokeCapBeK7IIE(stroke.getCap());
            getComposePaint().setPathEffect(stroke.getPathEffect());
        }
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name and from getter */
    public final int getBackingBlendMode() {
        return this.backingBlendMode;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m7805setBlendModes9anfk8(int i) {
        if (BlendMode.m6640equalsimpl0(i, this.backingBlendMode)) {
            return;
        }
        getComposePaint().mo6616setBlendModes9anfk8(i);
        this.backingBlendMode = i;
    }

    private final void clearShader() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }
}
