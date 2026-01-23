package com.robinhood.android.advisory.dashboard.overview.portfolio;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.android.advisory.portfolio.InnerDialWithCaret;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Progressions2;
import kotlin.ranges.RangesKt;

/* compiled from: DrillDownDial.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0010"}, m3636d2 = {"DrillDownTickHeight", "Landroidx/compose/ui/unit/Dp;", "F", "drillDownInnerDial", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "radius", "touchAngle", "", "activeTickColor", "Landroidx/compose/ui/graphics/Color;", "defaultTickColor", "center", "Landroidx/compose/ui/geometry/Offset;", "drillDownInnerDial-PdMbvOo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJJJ)V", "lib-advisory-dashboard_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.portfolio.DrillDownDialKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DrillDownDial {
    private static final float DrillDownTickHeight = C2002Dp.m7995constructorimpl(4);

    /* renamed from: drillDownInnerDial-PdMbvOo, reason: not valid java name */
    public static final void m11020drillDownInnerDialPdMbvOo(DrawScope drawScope, float f, float f2, long j, long j2, long j3) throws Throwable {
        DrawContext drawContext;
        long j4;
        DrawScope drillDownInnerDial = drawScope;
        long j5 = j3;
        Intrinsics.checkNotNullParameter(drillDownInnerDial, "$this$drillDownInnerDial");
        float fMo5016toPx0680j_4 = drillDownInnerDial.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f - InnerDialWithCaret.getTickYPadding()));
        Progressions2 progressions2Step = RangesKt.step(RangesKt.until(0, 360), 3);
        Iterator<Integer> it = progressions2Step.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        PrimitiveIterators6 primitiveIterators6 = (PrimitiveIterators6) it;
        int iNextInt = primitiveIterators6.nextInt();
        if (it.hasNext()) {
            float fAbs = Math.abs(iNextInt - f2);
            while (true) {
                int iNextInt2 = primitiveIterators6.nextInt();
                float fAbs2 = Math.abs(iNextInt2 - f2);
                if (Float.compare(fAbs, fAbs2) > 0) {
                    iNextInt = iNextInt2;
                    fAbs = fAbs2;
                }
                if (!it.hasNext()) {
                    break;
                }
                drillDownInnerDial = drawScope;
                j5 = j3;
            }
        }
        int i = iNextInt;
        int first = progressions2Step.getFirst();
        int last = progressions2Step.getLast();
        int step = progressions2Step.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        int i2 = first;
        while (true) {
            float f3 = i2 * 1.0f;
            float fAbs3 = Math.abs(f2 - f3);
            if (fAbs3 > 180.0f) {
                fAbs3 = 360.0f - fAbs3;
            }
            float fRint = 0.0f;
            if (fAbs3 >= 0.0f && fAbs3 < 90.0f) {
                fRint = 1.0f - (((float) Math.rint((fAbs3 / 90.0f) * r7)) / 1000);
            }
            DrawContext drawContext2 = drillDownInnerDial.getDrawContext();
            long jMo6936getSizeNHjbRc = drawContext2.mo6936getSizeNHjbRc();
            drawContext2.getCanvas().save();
            try {
                drawContext2.getTransform().mo6941rotateUv8p0NA(f3, j5);
                long jM6705copywmQWz5c$default = i2 == i ? j : Color.m6705copywmQWz5c$default(j2, (fRint * 0.9f) + 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                int i3 = last;
                long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) - fMo5016toPx0680j_4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
                float fMo5016toPx0680j_42 = drillDownInnerDial.mo5016toPx0680j_4(InnerDialWithCaret.getTickWidth());
                float fMo5016toPx0680j_43 = drillDownInnerDial.mo5016toPx0680j_4(DrillDownTickHeight);
                int i4 = i2;
                int i5 = i;
                j4 = jMo6936getSizeNHjbRc;
                try {
                    DrawScope.m6958drawRectnJ9OG0$default(drawScope, jM6705copywmQWz5c$default, jM6535constructorimpl, Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_42) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_43) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                    drawContext2.getCanvas().restore();
                    drawContext2.mo6937setSizeuvyYCjk(j4);
                    if (i4 == i3) {
                        return;
                    }
                    i2 = i4 + step;
                    j5 = j3;
                    last = i3;
                    i = i5;
                    drillDownInnerDial = drawScope;
                } catch (Throwable th) {
                    th = th;
                    drawContext = drawContext2;
                    drawContext.getCanvas().restore();
                    drawContext.mo6937setSizeuvyYCjk(j4);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                drawContext = drawContext2;
                j4 = jMo6936getSizeNHjbRc;
            }
        }
    }
}
