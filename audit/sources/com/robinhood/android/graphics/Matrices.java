package com.robinhood.android.graphics;

import android.graphics.Matrix;
import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Matrices.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"setTranslate", "", "Landroid/graphics/Matrix;", "translation", "Landroid/graphics/PointF;", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.graphics.MatricesKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class Matrices {
    public static final void setTranslate(Matrix matrix, PointF translation) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Intrinsics.checkNotNullParameter(translation, "translation");
        matrix.setTranslate(translation.x, translation.y);
    }
}
