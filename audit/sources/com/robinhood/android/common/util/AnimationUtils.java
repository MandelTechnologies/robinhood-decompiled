package com.robinhood.android.common.util;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnimationUtils.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/util/AnimationUtils;", "", "<init>", "()V", "LENGTH_SHORT", "", "LENGTH_MED", "LENGTH_LONG", "LENGTH_EXTRA_LONG", "MIN_LOADING_TIME", "ALPHA_MAX", "", "SHAKE_WIDTH_RATIO", "", "animateErrorShake", "", "Landroid/view/View;", "duration", "widthRatio", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AnimationUtils {
    public static final int $stable = 0;
    public static final int ALPHA_MAX = 255;
    public static final AnimationUtils INSTANCE = new AnimationUtils();
    public static final long LENGTH_EXTRA_LONG = 1500;
    public static final long LENGTH_LONG = 500;
    public static final long LENGTH_MED = 350;
    public static final long LENGTH_SHORT = 200;
    public static final long MIN_LOADING_TIME = 1000;
    private static final float SHAKE_WIDTH_RATIO = 0.25f;

    private AnimationUtils() {
    }

    public static /* synthetic */ void animateErrorShake$default(AnimationUtils animationUtils, View view, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        if ((i & 2) != 0) {
            f = 0.25f;
        }
        animationUtils.animateErrorShake(view, j, f);
    }

    public final void animateErrorShake(View view, long j, float f) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        float width = view.getWidth() * f;
        float f2 = -width;
        ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, 0.0f, f2, width, f2, width, 0.0f).setDuration(j).start();
    }
}
