package com.robinhood.android.common.util.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Rotation.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/Rotation;", "Landroid/transition/Transition;", "<init>", "()V", "captureStartValues", "", "transitionValues", "Landroid/transition/TransitionValues;", "captureEndValues", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "endValues", "captureValues", "getRotationProperty", "", "(Landroid/transition/TransitionValues;)Ljava/lang/Float;", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class Rotation extends Transition {
    private static final String PROPERTY_ROTATION = "robinhood:rotation:rotation";
    public static final int $stable = 8;

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    @Override // android.transition.Transition
    public Animator createAnimator(ViewGroup sceneRoot, TransitionValues startValues, TransitionValues endValues) {
        Float rotationProperty;
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        if (startValues == null || endValues == null || (rotationProperty = getRotationProperty(startValues)) == null) {
            return null;
        }
        float fFloatValue = rotationProperty.floatValue();
        Float rotationProperty2 = getRotationProperty(endValues);
        if (rotationProperty2 != null) {
            return ObjectAnimator.ofFloat(endValues.view, "rotation", fFloatValue, rotationProperty2.floatValue());
        }
        return null;
    }

    private final void captureValues(TransitionValues transitionValues) {
        if (transitionValues == null) {
            return;
        }
        Map values = transitionValues.values;
        Intrinsics.checkNotNullExpressionValue(values, "values");
        values.put(PROPERTY_ROTATION, Float.valueOf(transitionValues.view.getRotation()));
    }

    private final Float getRotationProperty(TransitionValues transitionValues) {
        return (Float) transitionValues.values.get(PROPERTY_ROTATION);
    }
}
