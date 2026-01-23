package com.robinhood.android.advisory.portfolio;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope3;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Progressions2;
import kotlin.ranges.RangesKt;

/* compiled from: InnerDialWithCaret.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0004\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0001¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0007\u0010\u0005\"\u0010\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u000b\u001a\u00020\u0001¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\f\u0010\u0005¨\u0006\u001c"}, m3636d2 = {"InnerCirclePadding", "Landroidx/compose/ui/unit/Dp;", "F", "TickYPadding", "getTickYPadding", "()F", "CenterRadiusPadding", "getCenterRadiusPadding", "CaretNotchSize", "CaretStroke", "TickHeight", "TickWidth", "getTickWidth", "innerDialWithCaret", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "touchAngle", "", "isDragging", "", "caretBrush", "Landroidx/compose/ui/graphics/Brush;", "tickBrush", "innerDialWithCaret-lyF-E1g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLjava/lang/Float;ZLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;)V", "lib-advisory_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.portfolio.InnerDialWithCaretKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class InnerDialWithCaret {
    private static final float CaretNotchSize;
    private static final float TickHeight;
    private static final float InnerCirclePadding = C2002Dp.m7995constructorimpl(8);
    private static final float TickYPadding = C2002Dp.m7995constructorimpl(20);
    private static final float CenterRadiusPadding = C2002Dp.m7995constructorimpl(36);
    private static final float CaretStroke = C2002Dp.m7995constructorimpl(2);
    private static final float TickWidth = C2002Dp.m7995constructorimpl(1);

    public static final float getTickYPadding() {
        return TickYPadding;
    }

    public static final float getCenterRadiusPadding() {
        return CenterRadiusPadding;
    }

    public static final float getTickWidth() {
        return TickWidth;
    }

    /* renamed from: innerDialWithCaret-lyF-E1g, reason: not valid java name */
    public static final void m11146innerDialWithCaretlyFE1g(DrawScope drawScope, long j, float f, Float f2, boolean z, Brush caretBrush, Brush tickBrush) throws Throwable {
        DrawContext drawContext;
        long j2;
        DrawScope innerDialWithCaret = drawScope;
        long j3 = j;
        Intrinsics.checkNotNullParameter(innerDialWithCaret, "$this$innerDialWithCaret");
        Intrinsics.checkNotNullParameter(caretBrush, "caretBrush");
        Intrinsics.checkNotNullParameter(tickBrush, "tickBrush");
        float fMo5016toPx0680j_4 = innerDialWithCaret.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f - TickYPadding));
        Progressions2 progressions2Step = RangesKt.step(RangesKt.until(0, 360), 5);
        int first = progressions2Step.getFirst();
        int last = progressions2Step.getLast();
        int step = progressions2Step.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            int i = first;
            while (true) {
                float fRint = 1.0f;
                float f3 = i * 1.0f;
                if (f2 != null) {
                    float fAbs = Math.abs(f2.floatValue() - f3);
                    if (fAbs > 180.0f) {
                        fAbs = 360.0f - fAbs;
                    }
                    if (fAbs >= 0.0f && fAbs < 45.0f && z) {
                        fRint = ((float) Math.rint((fAbs / 45.0f) * r5)) / 1000;
                    }
                }
                DrawContext drawContext2 = innerDialWithCaret.getDrawContext();
                long jMo6936getSizeNHjbRc = drawContext2.mo6936getSizeNHjbRc();
                drawContext2.getCanvas().save();
                try {
                    drawContext2.getTransform().mo6941rotateUv8p0NA(f3, j3);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - fMo5016toPx0680j_4;
                    long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                    int iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2);
                    int i2 = i;
                    long jM6535constructorimpl = Offset.m6535constructorimpl((iFloatToRawIntBits & 4294967295L) | (jFloatToRawIntBits << 32));
                    float fMo5016toPx0680j_42 = innerDialWithCaret.mo5016toPx0680j_4(TickWidth) * fRint;
                    float fMo5016toPx0680j_43 = innerDialWithCaret.mo5016toPx0680j_4(TickHeight) * fRint;
                    int i3 = last;
                    j2 = jMo6936getSizeNHjbRc;
                    float f4 = fMo5016toPx0680j_4;
                    innerDialWithCaret = drawScope;
                    try {
                        DrawScope.m6957drawRectAsUm42w$default(innerDialWithCaret, tickBrush, jM6535constructorimpl, Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_42) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_43) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                        drawContext2.getCanvas().restore();
                        drawContext2.mo6937setSizeuvyYCjk(j2);
                        if (i2 == i3) {
                            break;
                        }
                        i = i2 + step;
                        j3 = j;
                        last = i3;
                        fMo5016toPx0680j_4 = f4;
                    } catch (Throwable th) {
                        th = th;
                        drawContext = drawContext2;
                        drawContext.getCanvas().restore();
                        drawContext.mo6937setSizeuvyYCjk(j2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    drawContext = drawContext2;
                    j2 = jMo6936getSizeNHjbRc;
                }
            }
        }
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(f - InnerCirclePadding);
        float fMo5016toPx0680j_44 = innerDialWithCaret.mo5016toPx0680j_4(fM7995constructorimpl);
        float fMo5016toPx0680j_45 = innerDialWithCaret.mo5016toPx0680j_4(CaretNotchSize);
        float fMo5016toPx0680j_46 = innerDialWithCaret.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(fM7995constructorimpl - C2002Dp.m7995constructorimpl(4)));
        float fMo5016toPx0680j_47 = innerDialWithCaret.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(fM7995constructorimpl - C2002Dp.m7995constructorimpl(3)));
        if (f2 != null) {
            float fFloatValue = f2.floatValue();
            DrawContext drawContext3 = innerDialWithCaret.getDrawContext();
            long jMo6936getSizeNHjbRc2 = drawContext3.mo6936getSizeNHjbRc();
            drawContext3.getCanvas().save();
            try {
                drawContext3.getTransform().mo6941rotateUv8p0NA(fFloatValue, j);
                Path Path = AndroidPath_androidKt.Path();
                int i4 = (int) (j >> 32);
                int i5 = (int) (j & 4294967295L);
                Path.moveTo(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5) - fMo5016toPx0680j_44);
                Path.lineTo(Float.intBitsToFloat(i4) + fMo5016toPx0680j_45, Float.intBitsToFloat(i5) - fMo5016toPx0680j_46);
                Path.lineTo(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5) - fMo5016toPx0680j_47);
                Path.lineTo(Float.intBitsToFloat(i4) - fMo5016toPx0680j_45, Float.intBitsToFloat(i5) - fMo5016toPx0680j_46);
                Path.lineTo(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5) - fMo5016toPx0680j_44);
                Path.close();
                DrawScope.m6954drawPathGBMwjPU$default(innerDialWithCaret, Path, caretBrush, 0.0f, DrawScope3.INSTANCE, null, 0, 52, null);
                DrawScope.m6954drawPathGBMwjPU$default(innerDialWithCaret, Path, caretBrush, 0.0f, new Stroke(innerDialWithCaret.mo5016toPx0680j_4(CaretStroke), 0.0f, StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), StrokeJoin.INSTANCE.m6857getRoundLxFBmk8(), null, 18, null), null, 0, 52, null);
            } finally {
                drawContext3.getCanvas().restore();
                drawContext3.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc2);
            }
        }
    }

    static {
        float f = 4;
        CaretNotchSize = C2002Dp.m7995constructorimpl(f);
        TickHeight = C2002Dp.m7995constructorimpl(f);
    }
}
