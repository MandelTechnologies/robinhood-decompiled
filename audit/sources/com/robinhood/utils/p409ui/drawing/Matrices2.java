package com.robinhood.utils.p409ui.drawing;

import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Matrices.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, m3636d2 = {"changeValues", "", "Landroid/graphics/Matrix;", "matrixValues", "", "mutate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "values", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.ui.drawing.MatricesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Matrices2 {
    public static final void changeValues(Matrix matrix, float[] matrixValues, Function1<? super float[], Unit> mutate) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Intrinsics.checkNotNullParameter(matrixValues, "matrixValues");
        Intrinsics.checkNotNullParameter(mutate, "mutate");
        matrix.getValues(matrixValues);
        mutate.invoke(matrixValues);
        matrix.setValues(matrixValues);
    }
}
