package com.robinhood.shared.history.animation.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.common.util.transition.BaseTransition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShrinkTransition.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/history/animation/transition/ShrinkTransition;", "Lcom/robinhood/android/common/util/transition/BaseTransition;", "transitionName", "", "backgroundColor", "", "<init>", "(Ljava/lang/String;I)V", "captureStartValues", "", "transitionValues", "Landroid/transition/TransitionValues;", "captureEndValues", "createAnimatorInternal", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "endValues", "lib-history-animation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ShrinkTransition extends BaseTransition {
    private final int backgroundColor;
    private final String transitionName;

    public ShrinkTransition(String transitionName, int i) {
        Intrinsics.checkNotNullParameter(transitionName, "transitionName");
        this.transitionName = transitionName;
        this.backgroundColor = i;
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        captureBoundsAndPosition(transitionValues.view, transitionValues);
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        captureBoundsAndPosition(transitionValues.view, transitionValues);
    }

    @Override // com.robinhood.android.common.util.transition.BaseTransition
    protected Animator createAnimatorInternal(final ViewGroup sceneRoot, TransitionValues startValues, TransitionValues endValues) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        if (startValues != null && endValues != null && Intrinsics.areEqual(this.transitionName, startValues.view.getTransitionName())) {
            Rect rect = (Rect) startValues.values.get(BaseTransition.PROPERTY_BOUNDS);
            Rect rect2 = (Rect) endValues.values.get(BaseTransition.PROPERTY_BOUNDS);
            final int[] iArr = (int[]) startValues.values.get(BaseTransition.PROPERTY_POSITION);
            final int[] iArr2 = (int[]) endValues.values.get(BaseTransition.PROPERTY_POSITION);
            if (rect != null && rect2 != null && !Intrinsics.areEqual(rect, rect2)) {
                View view = startValues.view;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
                final ViewGroup viewGroup = (ViewGroup) view;
                final int iWidth = rect.width();
                final int iHeight = rect.height();
                final int iWidth2 = rect2.width();
                final int iHeight2 = rect2.height();
                TransitionUtils transitionUtils = TransitionUtils.INSTANCE;
                transitionUtils.positionView(viewGroup, 0, 0, iWidth, iHeight);
                Intrinsics.checkNotNull(iArr);
                final View viewAddViewToOverlay = transitionUtils.addViewToOverlay(sceneRoot, iArr[0], iArr[1], iWidth, iHeight, new ColorDrawable(this.backgroundColor));
                viewAddViewToOverlay.setAlpha(0.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewAddViewToOverlay, (Property<View, Float>) View.ALPHA, 1.0f);
                objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.robinhood.shared.history.animation.transition.ShrinkTransition.createAnimatorInternal.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        viewGroup.setAlpha(0.0f);
                    }
                });
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.shared.history.animation.transition.ShrinkTransition.createAnimatorInternal.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        float animatedFraction = animation.getAnimatedFraction();
                        float f = iArr[0];
                        int[] iArr3 = iArr2;
                        Intrinsics.checkNotNull(iArr3);
                        int i = iArr3[0];
                        float f2 = f + ((i - r3[0]) * animatedFraction);
                        float f3 = iArr[1] + ((iArr2[1] - r2) * animatedFraction);
                        viewAddViewToOverlay.layout((int) f2, (int) f3, (int) (f2 + iWidth + ((iWidth2 - r5) * animatedFraction)), (int) (f3 + iHeight + ((iHeight2 - r5) * animatedFraction)));
                    }
                });
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.robinhood.shared.history.animation.transition.ShrinkTransition.createAnimatorInternal.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        sceneRoot.getOverlay().remove(viewAddViewToOverlay);
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(objectAnimatorOfFloat, valueAnimatorOfFloat);
                animatorSet.setDuration(200L);
                return animatorSet;
            }
        }
        return null;
    }
}
