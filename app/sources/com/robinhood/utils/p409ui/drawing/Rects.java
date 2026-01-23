package com.robinhood.utils.p409ui.drawing;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Rects.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0000\u001a\u00020\u0006*\u00020\u0007H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0006*\u00020\u0007H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0006*\u00020\u0007H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0086\b\u001a\u0015\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0002\u001a\u001a\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006\u001a\u001a\u0010\b\u001a\u00020\t*\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¨\u0006\u0011"}, m3636d2 = {"component1", "", "Landroid/graphics/Rect;", "component2", "component3", "component4", "", "Landroid/graphics/RectF;", "set", "", "other", "contains", "", "point", "Landroid/graphics/PointF;", "x", "y", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.ui.drawing.RectsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Rects {
    public static final boolean contains(Rect rect, PointF point) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(point, "point");
        return contains(rect, point.x, point.y);
    }

    public static final int component1(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.left;
    }

    public static final int component2(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.top;
    }

    public static final int component3(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.right;
    }

    public static final int component4(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.bottom;
    }

    public static final float component1(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.left;
    }

    public static final float component2(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.top;
    }

    public static final float component3(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.right;
    }

    public static final float component4(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return rectF.bottom;
    }

    public static final void set(Rect rect, RectF other) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        rect.left = (int) other.left;
        rect.top = (int) other.top;
        rect.right = (int) other.right;
        rect.bottom = (int) other.bottom;
    }

    public static final boolean contains(Rect rect, float f, float f2) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(rect, "<this>");
        int i3 = rect.left;
        int i4 = rect.right;
        return i3 < i4 && (i = rect.top) < (i2 = rect.bottom) && f >= ((float) i3) && f < ((float) i4) && f2 >= ((float) i) && f2 < ((float) i2);
    }

    public static final void set(RectF rectF, float f, float f2) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        rectF.set(f, f2, f, f2);
    }
}
