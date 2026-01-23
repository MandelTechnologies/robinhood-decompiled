package com.robinhood.utils.p409ui.color;

import android.graphics.ColorMatrix;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ColorMatrices.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/utils/ui/color/ColorMatrices;", "", "<init>", "()V", "hueRotation", "Landroid/graphics/ColorMatrix;", "degrees", "", "brightnessScale", "scale", "saturationScale", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ColorMatrices {
    public static final int $stable = 0;
    public static final ColorMatrices INSTANCE = new ColorMatrices();

    private ColorMatrices() {
    }

    public final ColorMatrix hueRotation(float degrees) {
        float f = ((((degrees % 360.0f) + 360.0f) % 360.0f) / 180.0f) * 3.1415927f;
        if (f == 0.0f) {
            return new ColorMatrix();
        }
        double d = f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = 1;
        float f3 = f2 - 0.2126f;
        float f4 = (fCos * (-0.7152f)) + 0.7152f;
        float f5 = ((-0.0722f) * fCos) + 0.0722f;
        float f6 = f2 - 0.0722f;
        float f7 = ((-0.2126f) * fCos) + 0.2126f;
        return new ColorMatrix(new float[]{(fCos * f3) + 0.2126f + (fSin * (-0.2126f)), ((-0.7152f) * fSin) + f4, f5 + (fSin * f6), 0.0f, 0.0f, (0.143f * fSin) + f7, ((f2 - 0.7152f) * fCos) + 0.7152f + (0.14f * fSin), f5 + ((-0.283f) * fSin), 0.0f, 0.0f, f7 + ((-f3) * fSin), f4 + (0.7152f * fSin), (fCos * f6) + 0.0722f + (fSin * 0.0722f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public final ColorMatrix brightnessScale(float scale) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(scale, scale, scale, 1.0f);
        return colorMatrix;
    }

    public final ColorMatrix saturationScale(float scale) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(scale);
        return colorMatrix;
    }
}
