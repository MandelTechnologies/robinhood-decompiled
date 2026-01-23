package com.robinhood.android.common.util.transition;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import kotlin.Metadata;

/* compiled from: Interpolators.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/Interpolators;", "", "<init>", "()V", "accelerateDecelerate", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "getAccelerateDecelerate", "()Landroid/view/animation/AccelerateDecelerateInterpolator;", "fastOutSlowIn", "Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;", "getFastOutSlowIn", "()Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;", "fastOutLinearIn", "Landroidx/interpolator/view/animation/FastOutLinearInInterpolator;", "getFastOutLinearIn", "()Landroidx/interpolator/view/animation/FastOutLinearInInterpolator;", "expandCurveInterpolator", "Landroid/view/animation/PathInterpolator;", "getExpandCurveInterpolator", "()Landroid/view/animation/PathInterpolator;", "defaultCurveInterpolator", "getDefaultCurveInterpolator", "accelCurveInterpolator", "getAccelCurveInterpolator", "decelCurveInterpolator", "getDecelCurveInterpolator", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class Interpolators {
    public static final Interpolators INSTANCE = new Interpolators();
    private static final AccelerateDecelerateInterpolator accelerateDecelerate = new AccelerateDecelerateInterpolator();
    private static final FastOutSlowInInterpolator fastOutSlowIn = new FastOutSlowInInterpolator();
    private static final FastOutLinearInInterpolator fastOutLinearIn = new FastOutLinearInInterpolator();
    private static final PathInterpolator expandCurveInterpolator = new PathInterpolator(0.33f, 0.0f, 0.0f, 1.0f);
    private static final PathInterpolator defaultCurveInterpolator = new PathInterpolator(0.5f, 0.0f, 0.1f, 1.0f);
    private static final PathInterpolator accelCurveInterpolator = new PathInterpolator(0.9f, 0.0f, 0.83f, 0.83f);
    private static final PathInterpolator decelCurveInterpolator = new PathInterpolator(0.17f, 0.17f, 0.1f, 1.0f);
    public static final int $stable = 8;

    private Interpolators() {
    }

    public final AccelerateDecelerateInterpolator getAccelerateDecelerate() {
        return accelerateDecelerate;
    }

    public final FastOutSlowInInterpolator getFastOutSlowIn() {
        return fastOutSlowIn;
    }

    public final FastOutLinearInInterpolator getFastOutLinearIn() {
        return fastOutLinearIn;
    }

    public final PathInterpolator getExpandCurveInterpolator() {
        return expandCurveInterpolator;
    }

    public final PathInterpolator getDefaultCurveInterpolator() {
        return defaultCurveInterpolator;
    }

    public final PathInterpolator getAccelCurveInterpolator() {
        return accelCurveInterpolator;
    }

    public final PathInterpolator getDecelCurveInterpolator() {
        return decelCurveInterpolator;
    }
}
