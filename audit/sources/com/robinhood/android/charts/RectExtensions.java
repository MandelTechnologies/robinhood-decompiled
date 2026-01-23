package com.robinhood.android.charts;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.unit.IntOffset;
import com.robinhood.android.charts.model.Point;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RectExtensions.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0017\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\n\u001a!\u0010\u0006\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0012\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u0012\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0001\u001a\u001f\u0010\u0013\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0002\u0010\u0017\u001a\u0012\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0012\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0019\u0010\u001a\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"getHorizontalTranslation", "", "Landroidx/compose/ui/geometry/Rect;", "x", "getVerticalTranslation", "y", "getTranslation", "Landroidx/compose/ui/geometry/Offset;", "offset", "Lcom/robinhood/android/charts/model/Point;", "(Landroidx/compose/ui/geometry/Rect;Lcom/robinhood/android/charts/model/Point;)J", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "getTranslation-aZF9jCo", "(JFF)J", "getTranslatedWidth", "width", "getTranslatedHeight", "height", "getTranslatedSize", "Landroidx/compose/ui/geometry/Size;", "topLeft", "bottomRight", "(Landroidx/compose/ui/geometry/Rect;Lcom/robinhood/android/charts/model/Point;Lcom/robinhood/android/charts/model/Point;)J", "getHorizontalNormalizedPoint", "getVerticalNormalizedPoint", "getNormalizedPoint", "getNormalizedPoint-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Lcom/robinhood/android/charts/model/Point;", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.RectExtensionsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RectExtensions {
    public static final float getHorizontalTranslation(Rect rect, float f) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.getLeft() + (f * (rect.getRight() - rect.getLeft()));
    }

    public static final float getVerticalTranslation(Rect rect, float f) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.getTop() + ((1.0f - f) * (rect.getBottom() - rect.getTop()));
    }

    public static final long getTranslation(Rect rect, Point offset) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        float horizontalTranslation = getHorizontalTranslation(rect, offset.getX());
        float verticalTranslation = getVerticalTranslation(rect, offset.getY());
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(verticalTranslation) & 4294967295L) | (Float.floatToRawIntBits(horizontalTranslation) << 32));
    }

    /* renamed from: getTranslation-aZF9jCo, reason: not valid java name */
    public static final long m11983getTranslationaZF9jCo(long j, float f, float f2) {
        return IntOffset.m8033constructorimpl((((int) (((int) (j >> 32)) * f)) << 32) | (((int) (((int) (j & 4294967295L)) * (1.0f - f2))) & 4294967295L));
    }

    public static final long getTranslatedSize(Rect rect, Point topLeft, Point bottomRight) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        float translatedWidth = getTranslatedWidth(rect, bottomRight.getX() - topLeft.getX());
        float translatedHeight = getTranslatedHeight(rect, topLeft.getY() - bottomRight.getY());
        return Size.m6575constructorimpl((Float.floatToRawIntBits(translatedWidth) << 32) | (Float.floatToRawIntBits(translatedHeight) & 4294967295L));
    }

    public static final float getHorizontalNormalizedPoint(Rect rect, float f) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        if (rect.getRight() - rect.getLeft() == 0.0f) {
            return 0.0f;
        }
        return f / (rect.getRight() - rect.getLeft());
    }

    public static final float getTranslatedWidth(Rect rect, float f) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return (rect.getRight() - rect.getLeft()) * f;
    }

    public static final float getTranslatedHeight(Rect rect, float f) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return (rect.getBottom() - rect.getTop()) * f;
    }

    public static final float getVerticalNormalizedPoint(Rect rect, float f) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        if (rect.getBottom() - rect.getTop() == 0.0f) {
            return 0.0f;
        }
        return 1.0f - (f / (rect.getBottom() - rect.getTop()));
    }

    /* renamed from: getNormalizedPoint-Uv8p0NA, reason: not valid java name */
    public static final Point m11982getNormalizedPointUv8p0NA(Rect getNormalizedPoint, long j) {
        Intrinsics.checkNotNullParameter(getNormalizedPoint, "$this$getNormalizedPoint");
        return new Point(getHorizontalNormalizedPoint(getNormalizedPoint, Float.intBitsToFloat((int) (j >> 32))), getVerticalNormalizedPoint(getNormalizedPoint, Float.intBitsToFloat((int) (j & 4294967295L))));
    }
}
