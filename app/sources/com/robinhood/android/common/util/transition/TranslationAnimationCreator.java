package com.robinhood.android.common.util.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import androidx.transition.R$id;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TranslationAnimationCreator.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/TranslationAnimationCreator;", "", "<init>", "()V", "createAnimation", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "values", "Landroid/transition/TransitionValues;", "viewPosX", "", "viewPosY", "startX", "", "startY", "endX", "endY", "interpolator", "Landroid/animation/TimeInterpolator;", "TransitionPositionListener", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TranslationAnimationCreator {
    public static final int $stable = 0;
    public static final TranslationAnimationCreator INSTANCE = new TranslationAnimationCreator();

    private TranslationAnimationCreator() {
    }

    public final Animator createAnimation(View view, TransitionValues values, int viewPosX, int viewPosY, float startX, float startY, float endX, float endY, TimeInterpolator interpolator) {
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(values, "values");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) values.view.getTag(R$id.transition_position)) != null) {
            f = (r6[0] - viewPosX) + translationX;
            f2 = (r6[1] - viewPosY) + translationY;
        } else {
            f = startX;
            f2 = startY;
        }
        int iRound = viewPosX + Math.round(f - translationX);
        int iRound2 = viewPosY + Math.round(f2 - translationY);
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == endX && f2 == endY) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, endX), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, endY));
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(...)");
        View view2 = values.view;
        Intrinsics.checkNotNullExpressionValue(view2, "view");
        TransitionPositionListener transitionPositionListener = new TransitionPositionListener(view, view2, iRound, iRound2, translationX, translationY);
        objectAnimatorOfPropertyValuesHolder.addListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(transitionPositionListener);
        if (interpolator != null) {
            objectAnimatorOfPropertyValuesHolder.setInterpolator(interpolator);
        }
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* compiled from: TranslationAnimationCreator.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/TranslationAnimationCreator$TransitionPositionListener;", "Landroid/animation/AnimatorListenerAdapter;", "movingView", "Landroid/view/View;", "viewInHierarchy", "startX", "", "startY", "terminalX", "", "terminalY", "<init>", "(Landroid/view/View;Landroid/view/View;IIFF)V", "pausedX", "pausedY", "transitionPosition", "", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "animator", "onAnimationPause", "onAnimationResume", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class TransitionPositionListener extends AnimatorListenerAdapter {
        private final View movingView;
        private float pausedX;
        private float pausedY;
        private final int startX;
        private final int startY;
        private final float terminalX;
        private final float terminalY;
        private int[] transitionPosition;
        private final View viewInHierarchy;

        public TransitionPositionListener(View movingView, View viewInHierarchy, int i, int i2, float f, float f2) {
            Intrinsics.checkNotNullParameter(movingView, "movingView");
            Intrinsics.checkNotNullParameter(viewInHierarchy, "viewInHierarchy");
            this.movingView = movingView;
            this.viewInHierarchy = viewInHierarchy;
            this.terminalX = f;
            this.terminalY = f2;
            this.startX = i - Math.round(movingView.getTranslationX());
            this.startY = i2 - Math.round(movingView.getTranslationY());
            int[] iArr = (int[]) viewInHierarchy.getTag(R$id.transition_position);
            this.transitionPosition = iArr;
            if (iArr != null) {
                viewInHierarchy.setTag(R$id.transition_position, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (this.transitionPosition == null) {
                this.transitionPosition = new int[2];
            }
            int[] iArr = this.transitionPosition;
            Intrinsics.checkNotNull(iArr);
            iArr[0] = Math.round(this.startX + this.movingView.getTranslationX());
            iArr[1] = Math.round(this.startY + this.movingView.getTranslationY());
            this.viewInHierarchy.setTag(R$id.transition_position, iArr);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.movingView.setTranslationX(this.terminalX);
            this.movingView.setTranslationY(this.terminalY);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.pausedX = this.movingView.getTranslationX();
            this.pausedY = this.movingView.getTranslationY();
            this.movingView.setTranslationX(this.terminalX);
            this.movingView.setTranslationY(this.terminalY);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.movingView.setTranslationX(this.pausedX);
            this.movingView.setTranslationY(this.pausedY);
        }
    }
}
