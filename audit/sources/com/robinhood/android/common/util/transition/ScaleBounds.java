package com.robinhood.android.common.util.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.utils.extensions.ViewsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScaleBounds.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/ScaleBounds;", "Landroid/transition/Transition;", "<init>", "()V", "getTransitionProperties", "", "", "()[Ljava/lang/String;", "captureStartValues", "", "transitionValues", "Landroid/transition/TransitionValues;", "captureEndValues", "captureValues", "createAnimator", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "endValues", "Companion", "RelativeScaleBoundsProperty", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ScaleBounds extends Transition {
    public static final int $stable = 8;
    private static final String PROPERTY_NAME_BOUNDS = "robinhood:scaleBounds:bounds";
    private static final String[] TRANSITION_PROPERTIES = {PROPERTY_NAME_BOUNDS};

    @Override // android.transition.Transition
    public String[] getTransitionProperties() {
        return TRANSITION_PROPERTIES;
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        captureValues(transitionValues);
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        captureValues(transitionValues);
    }

    private final void captureValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        Map values = transitionValues.values;
        Intrinsics.checkNotNullExpressionValue(values, "values");
        values.put(PROPERTY_NAME_BOUNDS, ViewsKt.getBoundsF$default(view, null, 1, null));
    }

    @Override // android.transition.Transition
    public Animator createAnimator(ViewGroup sceneRoot, TransitionValues startValues, TransitionValues endValues) {
        RectF rectF;
        RectF rectF2;
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        if (startValues == null || endValues == null || (rectF = (RectF) startValues.values.get(PROPERTY_NAME_BOUNDS)) == null || (rectF2 = (RectF) endValues.values.get(PROPERTY_NAME_BOUNDS)) == null) {
            return null;
        }
        View view = endValues.view;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return ObjectAnimator.ofObject(view, new RelativeScaleBoundsProperty(rectF2), RectFEvaluator.INSTANCE, rectF, rectF2);
    }

    /* compiled from: ScaleBounds.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0002R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/ScaleBounds$RelativeScaleBoundsProperty;", "Landroid/util/Property;", "Landroid/view/View;", "Landroid/graphics/RectF;", "endBounds", "<init>", "(Landroid/graphics/RectF;)V", "matrix", "Landroid/graphics/Matrix;", "matrixValues", "", "get", "view", "set", "", "value", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class RelativeScaleBoundsProperty extends Property<View, RectF> {
        private final RectF endBounds;
        private final Matrix matrix;
        private final float[] matrixValues;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RelativeScaleBoundsProperty(RectF endBounds) {
            super(RectF.class, "relativeScaleBounds");
            Intrinsics.checkNotNullParameter(endBounds, "endBounds");
            this.endBounds = endBounds;
            this.matrix = new Matrix();
            this.matrixValues = new float[9];
        }

        @Override // android.util.Property
        public RectF get(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return ViewsKt.getBoundsF$default(view, null, 1, null);
        }

        @Override // android.util.Property
        public void set(View view, RectF value) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(value, "value");
            this.matrix.setRectToRect(this.endBounds, value, Matrix.ScaleToFit.FILL);
            this.matrix.getValues(this.matrixValues);
            view.setTranslationX(-this.matrixValues[2]);
            view.setTranslationY(-this.matrixValues[5]);
            view.setScaleX(this.matrixValues[0]);
            view.setScaleY(this.matrixValues[4]);
        }
    }
}
