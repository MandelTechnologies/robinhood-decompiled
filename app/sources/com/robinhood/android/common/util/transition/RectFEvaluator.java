package com.robinhood.android.common.util.transition;

import android.animation.TypeEvaluator;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RectFEvaluator.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/RectFEvaluator;", "Landroid/animation/TypeEvaluator;", "Landroid/graphics/RectF;", "<init>", "()V", "evaluate", "fraction", "", "startValue", "endValue", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RectFEvaluator implements TypeEvaluator<RectF> {
    public static final int $stable = 0;
    public static final RectFEvaluator INSTANCE = new RectFEvaluator();

    private RectFEvaluator() {
    }

    @Override // android.animation.TypeEvaluator
    public RectF evaluate(float fraction, RectF startValue, RectF endValue) {
        Intrinsics.checkNotNullParameter(startValue, "startValue");
        Intrinsics.checkNotNullParameter(endValue, "endValue");
        RectF rectF = new RectF();
        float f = startValue.left;
        rectF.left = f + ((endValue.left - f) * fraction);
        float f2 = startValue.top;
        rectF.top = f2 + ((endValue.top - f2) * fraction);
        float f3 = startValue.right;
        rectF.right = f3 + ((endValue.right - f3) * fraction);
        float f4 = startValue.bottom;
        rectF.bottom = f4 + ((endValue.bottom - f4) * fraction);
        return rectF;
    }
}
