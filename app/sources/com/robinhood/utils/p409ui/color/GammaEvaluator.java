package com.robinhood.utils.p409ui.color;

import android.animation.TypeEvaluator;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* compiled from: GammaEvaluator.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/utils/ui/color/GammaEvaluator;", "Landroid/animation/TypeEvaluator;", "", "<init>", "()V", "evaluate", "fraction", "", "startValue", "endValue", "(FII)Ljava/lang/Integer;", "optoElectronicConvert", "linear", "electroOpticalConvert", "sRgb", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GammaEvaluator implements TypeEvaluator<Integer> {
    public static final int $stable = 0;
    public static final GammaEvaluator INSTANCE = new GammaEvaluator();

    private GammaEvaluator() {
    }

    @Override // android.animation.TypeEvaluator
    public /* bridge */ /* synthetic */ Integer evaluate(float f, Integer num, Integer num2) {
        return evaluate(f, num.intValue(), num2.intValue());
    }

    public Integer evaluate(float fraction, int startValue, int endValue) {
        float f = ((startValue >> 24) & 255) / 255.0f;
        float fElectroOpticalConvert = electroOpticalConvert(((startValue >> 16) & 255) / 255.0f);
        float fElectroOpticalConvert2 = electroOpticalConvert(((startValue >> 8) & 255) / 255.0f);
        float fElectroOpticalConvert3 = electroOpticalConvert((startValue & 255) / 255.0f);
        float fElectroOpticalConvert4 = electroOpticalConvert(((endValue >> 16) & 255) / 255.0f);
        float f2 = f + (((((endValue >> 24) & 255) / 255.0f) - f) * fraction);
        float fElectroOpticalConvert5 = fElectroOpticalConvert2 + ((electroOpticalConvert(((endValue >> 8) & 255) / 255.0f) - fElectroOpticalConvert2) * fraction);
        float fElectroOpticalConvert6 = fElectroOpticalConvert3 + (fraction * (electroOpticalConvert((endValue & 255) / 255.0f) - fElectroOpticalConvert3));
        return Integer.valueOf((MathKt.roundToInt(optoElectronicConvert(fElectroOpticalConvert + ((fElectroOpticalConvert4 - fElectroOpticalConvert) * fraction)) * 255.0f) << 16) | (MathKt.roundToInt(f2 * 255.0f) << 24) | (MathKt.roundToInt(optoElectronicConvert(fElectroOpticalConvert5) * 255.0f) << 8) | MathKt.roundToInt(optoElectronicConvert(fElectroOpticalConvert6) * 255.0f));
    }

    private final float optoElectronicConvert(float linear) {
        return linear <= 0.0031308f ? linear * 12.92f : (float) ((Math.pow(linear, 0.4166666666666667d) * 1.055d) - 0.055d);
    }

    private final float electroOpticalConvert(float sRgb) {
        return sRgb <= 0.04045f ? sRgb / 12.92f : (float) Math.pow((sRgb + 0.055f) / 1.055f, 2.4f);
    }
}
