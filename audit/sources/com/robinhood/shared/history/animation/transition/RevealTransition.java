package com.robinhood.shared.history.animation.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.robinhood.android.common.util.transition.BaseTransition;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RevealTransition.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0014J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0014J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/history/animation/transition/RevealTransition;", "Lcom/robinhood/android/common/util/transition/BaseTransition;", "transitionName", "", "<init>", "(Ljava/lang/String;)V", "captureStartValues", "", "transitionValues", "Landroid/transition/TransitionValues;", "captureEndValues", "getTargetEndView", "Landroid/view/View;", "endView", "getTargetColor", "", "targetView", "createAnimatorInternal", "Landroid/animation/Animator;", "sceneRoot", "Landroid/view/ViewGroup;", "startValues", "endValues", "Companion", "lib-history-animation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public class RevealTransition extends BaseTransition {
    private static final int TRANSITIONING_CIRCLE_RADIUS = 100;
    private final String transitionName;

    protected View getTargetEndView(View endView) {
        Intrinsics.checkNotNullParameter(endView, "endView");
        return endView;
    }

    public RevealTransition(String transitionName) {
        Intrinsics.checkNotNullParameter(transitionName, "transitionName");
        this.transitionName = transitionName;
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        captureBoundsAndPosition(transitionValues.view, transitionValues);
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        View view = transitionValues.view;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        captureBoundsAndPosition(getTargetEndView(view), transitionValues);
    }

    protected int getTargetColor(View targetView) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        Drawable background = targetView.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
        return ((ColorDrawable) background).getColor();
    }

    @Override // com.robinhood.android.common.util.transition.BaseTransition
    protected Animator createAnimatorInternal(final ViewGroup sceneRoot, TransitionValues startValues, TransitionValues endValues) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        if (startValues != null && endValues != null && Intrinsics.areEqual(this.transitionName, endValues.view.getTransitionName())) {
            Rect rect = (Rect) startValues.values.get(BaseTransition.PROPERTY_BOUNDS);
            Rect rect2 = (Rect) endValues.values.get(BaseTransition.PROPERTY_BOUNDS);
            int[] iArr = (int[]) startValues.values.get(BaseTransition.PROPERTY_POSITION);
            int[] iArr2 = (int[]) endValues.values.get(BaseTransition.PROPERTY_POSITION);
            if (rect != null && rect2 != null && !Intrinsics.areEqual(rect, rect2)) {
                View view = endValues.view;
                Intrinsics.checkNotNullExpressionValue(view, "view");
                final View targetEndView = getTargetEndView(view);
                ArrayList<View> arrayList = new ArrayList();
                if ((view instanceof ViewGroup) && targetEndView != view) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (targetEndView != childAt) {
                            childAt.setAlpha(0.0f);
                            childAt.setTranslationY(200.0f);
                            Intrinsics.checkNotNull(childAt);
                            arrayList.add(childAt);
                        }
                    }
                }
                int targetColor = getTargetColor(targetEndView);
                ColorDrawable colorDrawable = new ColorDrawable(targetColor);
                TransitionUtils transitionUtils = TransitionUtils.INSTANCE;
                final View viewAddViewToOverlay = transitionUtils.addViewToOverlay(sceneRoot, rect.width(), rect.height(), colorDrawable);
                int[] iArr3 = new int[2];
                sceneRoot.getLocationInWindow(iArr3);
                Intrinsics.checkNotNull(iArr);
                int i2 = iArr[0] - iArr3[0];
                int i3 = iArr[1] - iArr3[1];
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(targetColor);
                final View viewAddViewToOverlay2 = transitionUtils.addViewToOverlay(sceneRoot, 200, 200, shapeDrawable);
                float width = (iArr[0] - iArr3[0]) + ((viewAddViewToOverlay.getWidth() - viewAddViewToOverlay2.getWidth()) / 2);
                float height = (iArr[1] - iArr3[1]) + ((viewAddViewToOverlay.getHeight() - viewAddViewToOverlay2.getHeight()) / 2);
                viewAddViewToOverlay2.setTranslationX(width);
                viewAddViewToOverlay2.setTranslationY(height);
                viewAddViewToOverlay.setAlpha(0.0f);
                viewAddViewToOverlay.setTranslationX(i2);
                viewAddViewToOverlay.setTranslationY(i3);
                targetEndView.setAlpha(0.0f);
                viewAddViewToOverlay2.setVisibility(4);
                Property property = View.ALPHA;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewAddViewToOverlay, (Property<View, Float>) property, 0.0f, 1.0f);
                Animator animatorCreateCircularReveal = transitionUtils.createCircularReveal(viewAddViewToOverlay, rect.width() / 2.0f, 100.0f);
                animatorCreateCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: com.robinhood.shared.history.animation.transition.RevealTransition.createAnimatorInternal.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        viewAddViewToOverlay.setVisibility(4);
                        viewAddViewToOverlay2.setVisibility(0);
                    }
                });
                Intrinsics.checkNotNull(iArr2);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewAddViewToOverlay2, (Property<View, Float>) View.TRANSLATION_X, (Property<View, Float>) View.TRANSLATION_Y, getPathMotion().getPath(width, height, (iArr2[0] - iArr3[0]) + ((targetEndView.getWidth() - viewAddViewToOverlay2.getWidth()) / 2), (iArr2[1] - iArr3[1]) + ((targetEndView.getHeight() - viewAddViewToOverlay2.getHeight()) / 2)));
                final View viewAddViewToOverlay3 = transitionUtils.addViewToOverlay(sceneRoot, targetEndView.getWidth(), targetEndView.getHeight(), colorDrawable);
                viewAddViewToOverlay3.setVisibility(4);
                float f = iArr2[0] - iArr3[0];
                float f2 = iArr2[1] - iArr3[1];
                viewAddViewToOverlay3.setTranslationX(f);
                viewAddViewToOverlay3.setTranslationY(f2);
                objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.robinhood.shared.history.animation.transition.RevealTransition.createAnimatorInternal.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        viewAddViewToOverlay2.setVisibility(4);
                        viewAddViewToOverlay3.setVisibility(0);
                        targetEndView.setAlpha(1.0f);
                    }
                });
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewAddViewToOverlay3, (Property<View, Float>) property, 1.0f, 0.0f);
                float fMax = Math.max(rect2.width(), rect2.height()) / 2.0f;
                Animator animatorCreateCircularReveal2 = transitionUtils.createCircularReveal(targetEndView, 100.0f, fMax);
                Animator animatorCreateCircularReveal3 = transitionUtils.createCircularReveal(viewAddViewToOverlay3, 100.0f, fMax);
                animatorCreateCircularReveal3.addListener(new AnimatorListenerAdapter() { // from class: com.robinhood.shared.history.animation.transition.RevealTransition.createAnimatorInternal.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        ViewGroupOverlay overlay = sceneRoot.getOverlay();
                        overlay.remove(viewAddViewToOverlay);
                        overlay.remove(viewAddViewToOverlay2);
                        overlay.remove(viewAddViewToOverlay3);
                    }
                });
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(objectAnimatorOfFloat3);
                arrayList2.add(animatorCreateCircularReveal2);
                arrayList2.add(animatorCreateCircularReveal3);
                for (View view2 : arrayList) {
                    arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f));
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfFloat, animatorCreateCircularReveal);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(arrayList2);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially(animatorSet, objectAnimatorOfFloat2, animatorSet2);
                animatorSet3.setDuration(200L);
                return animatorSet3;
            }
        }
        return null;
    }
}
