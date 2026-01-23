package com.robinhood.utils.p409ui.drawing;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Canvases.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a-\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0086\b¨\u0006\f"}, m3636d2 = {"clipOutPathCompat", "", "Landroid/graphics/Canvas;", "path", "Landroid/graphics/Path;", "clipOutRectCompat", "", "left", "", "top", "right", "bottom", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.ui.drawing.CanvasesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Canvases {
    public static final void clipOutPathCompat(Canvas canvas, Path path) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public static final boolean clipOutRectCompat(Canvas canvas, float f, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        if (Build.VERSION.SDK_INT >= 26) {
            return canvas.clipOutRect(f, f2, f3, f4);
        }
        return canvas.clipRect(f, f2, f3, f4, Region.Op.DIFFERENCE);
    }
}
