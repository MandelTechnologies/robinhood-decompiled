package com.robinhood.android.designsystem.animation;

import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CircularReveal.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/designsystem/animation/CircularRevealBuilder;", "", "view", "Landroid/view/View;", "reveal", "", "centerX", "", "centerY", "startRadius", "", "endRadius", "<init>", "(Landroid/view/View;ZIIFF)V", "duration", "", "listener", "Landroid/animation/Animator$AnimatorListener;", "setDuration", "setListener", "start", "", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.designsystem.animation.CircularRevealBuilder, reason: use source file name */
/* loaded from: classes2.dex */
public final class CircularReveal2 {
    private final int centerX;
    private final int centerY;
    private long duration;
    private final float endRadius;
    private Animator.AnimatorListener listener;
    private final boolean reveal;
    private final float startRadius;
    private final View view;

    public CircularReveal2(View view, boolean z, int i, int i2, float f, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.reveal = z;
        this.centerX = i;
        this.centerY = i2;
        this.startRadius = f;
        this.endRadius = f2;
    }

    public final CircularReveal2 setDuration(long duration) {
        this.duration = duration;
        return this;
    }

    public final CircularReveal2 setListener(Animator.AnimatorListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        return this;
    }

    public final void start() {
        if (this.reveal) {
            this.view.setVisibility(0);
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(this.view, this.centerX, this.centerY, this.startRadius, this.endRadius);
        long j = this.duration;
        if (j != 0) {
            animatorCreateCircularReveal.setDuration(j);
        }
        Animator.AnimatorListener animatorListener = this.listener;
        if (animatorListener != null) {
            animatorCreateCircularReveal.addListener(animatorListener);
        }
        if (!this.reveal) {
            Intrinsics.checkNotNull(animatorCreateCircularReveal);
            animatorCreateCircularReveal.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.android.designsystem.animation.CircularRevealBuilder$start$$inlined$doOnEnd$1
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
                    this.this$0.view.setVisibility(4);
                }
            });
        }
        animatorCreateCircularReveal.start();
    }
}
