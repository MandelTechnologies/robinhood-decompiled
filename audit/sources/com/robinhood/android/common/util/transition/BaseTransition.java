package com.robinhood.android.common.util.transition;

import android.animation.Animator;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseTransition.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0004J1\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0011\"\u00020\u0007H\u0004¢\u0006\u0002\u0010\u0012J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\tH$¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/BaseTransition;", "Landroid/transition/Transition;", "<init>", "()V", "captureBoundsAndPosition", "", "view", "Landroid/view/View;", "transitionValues", "Landroid/transition/TransitionValues;", "getLocationInWindow", "", "setTranslations", "translationX", "", "translationY", "views", "", "(FF[Landroid/view/View;)V", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "endValues", "createAnimatorInternal", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseTransition extends Transition {
    public static final String PROPERTY_BOUNDS = "com.robinhood.android:bounds";
    public static final String PROPERTY_POSITION = "com.robinhood.android:position";
    public static final int $stable = 8;

    protected abstract Animator createAnimatorInternal(ViewGroup sceneRoot, TransitionValues startValues, TransitionValues endValues);

    protected final void captureBoundsAndPosition(View view, TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        if (view == null) {
            return;
        }
        Map values = transitionValues.values;
        Intrinsics.checkNotNullExpressionValue(values, "values");
        values.put(PROPERTY_BOUNDS, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        int[] locationInWindow = getLocationInWindow(view);
        Map values2 = transitionValues.values;
        Intrinsics.checkNotNullExpressionValue(values2, "values");
        values2.put(PROPERTY_POSITION, locationInWindow);
    }

    protected final int[] getLocationInWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr;
    }

    protected final void setTranslations(float translationX, float translationY, View... views) {
        Intrinsics.checkNotNullParameter(views, "views");
        for (View view : views) {
            view.setTranslationX(translationX);
            view.setTranslationY(translationY);
        }
    }

    @Override // android.transition.Transition
    public Animator createAnimator(ViewGroup sceneRoot, TransitionValues startValues, TransitionValues endValues) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        try {
            return createAnimatorInternal(sceneRoot, startValues, endValues);
        } catch (Throwable unused) {
            return null;
        }
    }
}
