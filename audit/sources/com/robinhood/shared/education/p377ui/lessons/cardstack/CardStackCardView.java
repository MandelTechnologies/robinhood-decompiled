package com.robinhood.shared.education.p377ui.lessons.cardstack;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CardStackCardView.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/CardStackCardView;", "", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "animateContentAppear", "", "delay", "", "doOnAnimationEnd", "Lkotlin/Function0;", "hideContent", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface CardStackCardView {
    void animateContentAppear(long delay, Function0<Unit> doOnAnimationEnd);

    View getContentView();

    void hideContent();

    /* compiled from: CardStackCardView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static void animateContentAppear(final CardStackCardView cardStackCardView, long j, final Function0<Unit> doOnAnimationEnd) {
            Intrinsics.checkNotNullParameter(doOnAnimationEnd, "doOnAnimationEnd");
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(600L);
            valueAnimatorOfFloat.setStartDelay(j);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.CardStackCardView$animateContentAppear$1$1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator animator) {
                    Intrinsics.checkNotNullParameter(animator, "animator");
                    View contentView = cardStackCardView.getContentView();
                    Object animatedValue = animator.getAnimatedValue();
                    Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    contentView.setAlpha(((Float) animatedValue).floatValue());
                }
            });
            Intrinsics.checkNotNull(valueAnimatorOfFloat);
            valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.CardStackCardView$DefaultImpls$animateContentAppear$lambda$2$$inlined$doOnStart$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    cardStackCardView.getContentView().setAlpha(0.0f);
                    cardStackCardView.getContentView().setVisibility(0);
                }
            });
            valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.CardStackCardView$DefaultImpls$animateContentAppear$lambda$2$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    doOnAnimationEnd.invoke();
                }
            });
            valueAnimatorOfFloat.start();
        }

        public static void hideContent(CardStackCardView cardStackCardView) {
            cardStackCardView.getContentView().setVisibility(4);
        }
    }
}
