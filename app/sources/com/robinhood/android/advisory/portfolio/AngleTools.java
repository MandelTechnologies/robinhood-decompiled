package com.robinhood.android.advisory.portfolio;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AngleTools.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\r\u001a.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u001a)\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f2\u0006\u0010\u001f\u001a\u00020\u0015H\u0000¢\u0006\u0004\b \u0010!\"\u0018\u0010\u0014\u001a\u00020\u0001*\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u0018\u001a\u00020\u0001*\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\""}, m3636d2 = {"findNormalizedPointFromTouch", "Landroidx/compose/ui/geometry/Offset;", "canvasCenter", "findNormalizedPointFromTouch-0a9Yr6o", "(JJ)J", "calculateTouchAngleAccordingToCanvas", "", "normalizedPoint", "calculateTouchAngleAccordingToCanvas-0a9Yr6o", "(JJ)F", "calculateTouchAngleInDegrees", "", "calculateTouchAngleInDegrees-0a9Yr6o", "(JJ)D", "getSliceWindows", "", "Lcom/robinhood/android/advisory/portfolio/SliceWindow;", "slices", "gapAngle", "cumulativeGapAngle", "topLeftOffsetForCenteredCircle", "Landroidx/compose/ui/geometry/Size;", "getTopLeftOffsetForCenteredCircle-uvyYCjk", "(J)J", "bottomRightOffsetForCenteredCircle", "getBottomRightOffsetForCenteredCircle-uvyYCjk", "linearGradientForCenteredCircle", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/graphics/Brush$Companion;", "colors", "Landroidx/compose/ui/graphics/Color;", "size", "linearGradientForCenteredCircle-cSwnlzA", "(Landroidx/compose/ui/graphics/Brush$Companion;Ljava/util/List;J)Landroidx/compose/ui/graphics/Brush;", "lib-advisory_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.portfolio.AngleToolsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AngleTools {
    /* renamed from: calculateTouchAngleInDegrees-0a9Yr6o, reason: not valid java name */
    public static final double m11141calculateTouchAngleInDegrees0a9Yr6o(long j, long j2) {
        return (((float) Math.atan2(Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (4294967295L & j)), Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j >> 32)))) * (-180)) / 3.141592653589793d;
    }

    /* renamed from: findNormalizedPointFromTouch-0a9Yr6o, reason: not valid java name */
    public static final long m11142findNormalizedPointFromTouch0a9Yr6o(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        int i = (int) (j2 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) + (Float.intBitsToFloat(i) - Float.intBitsToFloat((int) (j & 4294967295L)));
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: calculateTouchAngleAccordingToCanvas-0a9Yr6o, reason: not valid java name */
    public static final float m11140calculateTouchAngleAccordingToCanvas0a9Yr6o(long j, long j2) {
        double dM11141calculateTouchAngleInDegrees0a9Yr6o = m11141calculateTouchAngleInDegrees0a9Yr6o(j, j2);
        double d = 360;
        return (float) ((dM11141calculateTouchAngleInDegrees0a9Yr6o + d) % d);
    }

    public static /* synthetic */ List getSliceWindows$default(List list, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = (list.size() - 1) * f;
        }
        return getSliceWindows(list, f, f2);
    }

    public static final List<SliceWindow> getSliceWindows(List<Float> slices, float f, float f2) {
        Intrinsics.checkNotNullParameter(slices, "slices");
        List<SliceWindow> listEmptyList = CollectionsKt.emptyList();
        int i = 0;
        for (Object obj : slices) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float f3 = 360.0f;
            float fFloatValue = (360.0f - f2) * ((Number) obj).floatValue();
            List<SliceWindow> list = listEmptyList;
            float end = !list.isEmpty() ? ((SliceWindow) CollectionsKt.last((List) listEmptyList)).getEnd() : 0.0f;
            if (i != slices.size() - 1) {
                f3 = fFloatValue + end + f;
            }
            listEmptyList = CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt.listOf(new SliceWindow(end, f3)));
            i = i2;
        }
        return listEmptyList;
    }

    /* renamed from: getTopLeftOffsetForCenteredCircle-uvyYCjk, reason: not valid java name */
    public static final long m11144getTopLeftOffsetForCenteredCircleuvyYCjk(long j) {
        double d = 2.0f;
        float fSqrt = (0.5f - (0.5f / ((float) Math.sqrt(d)))) * Float.intBitsToFloat((int) (j >> 32));
        float fSqrt2 = (0.5f - (0.5f / ((float) Math.sqrt(d)))) * Float.intBitsToFloat((int) (j & 4294967295L));
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(fSqrt) << 32) | (4294967295L & Float.floatToRawIntBits(fSqrt2)));
    }

    /* renamed from: getBottomRightOffsetForCenteredCircle-uvyYCjk, reason: not valid java name */
    public static final long m11143getBottomRightOffsetForCenteredCircleuvyYCjk(long j) {
        double d = 2.0f;
        float fSqrt = ((0.5f / ((float) Math.sqrt(d))) + 0.5f) * Float.intBitsToFloat((int) (j >> 32));
        float fSqrt2 = ((0.5f / ((float) Math.sqrt(d))) + 0.5f) * Float.intBitsToFloat((int) (j & 4294967295L));
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(fSqrt) << 32) | (Float.floatToRawIntBits(fSqrt2) & 4294967295L));
    }

    /* renamed from: linearGradientForCenteredCircle-cSwnlzA, reason: not valid java name */
    public static final Brush m11145linearGradientForCenteredCirclecSwnlzA(Brush.Companion linearGradientForCenteredCircle, List<Color> colors, long j) {
        Intrinsics.checkNotNullParameter(linearGradientForCenteredCircle, "$this$linearGradientForCenteredCircle");
        Intrinsics.checkNotNullParameter(colors, "colors");
        return Brush.Companion.m6678linearGradientmHitzGk$default(linearGradientForCenteredCircle, colors, m11144getTopLeftOffsetForCenteredCircleuvyYCjk(j), m11143getBottomRightOffsetForCenteredCircleuvyYCjk(j), 0, 8, (Object) null);
    }
}
