package com.robinhood.utils.p409ui.color;

import android.graphics.ColorMatrix;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColorMatrices.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\b"}, m3636d2 = {"rotateHue", "", "Landroid/graphics/ColorMatrix;", "degrees", "", "scaleBrightness", "scale", "scaleSaturation", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.ui.color.ColorMatricesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ColorMatrices2 {
    public static final void rotateHue(ColorMatrix colorMatrix, float f) {
        Intrinsics.checkNotNullParameter(colorMatrix, "<this>");
        colorMatrix.postConcat(ColorMatrices.INSTANCE.hueRotation(f));
    }

    public static final void scaleBrightness(ColorMatrix colorMatrix, float f) {
        Intrinsics.checkNotNullParameter(colorMatrix, "<this>");
        colorMatrix.postConcat(ColorMatrices.INSTANCE.brightnessScale(f));
    }

    public static final void scaleSaturation(ColorMatrix colorMatrix, float f) {
        Intrinsics.checkNotNullParameter(colorMatrix, "<this>");
        colorMatrix.postConcat(ColorMatrices.INSTANCE.saturationScale(f));
    }
}
