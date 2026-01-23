package com.robinhood.android.common.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.ExponentialDecayBounceInterpolator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlitchManager.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J2\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/common/view/GlitchManager;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "decayInterpolator", "Lcom/robinhood/android/common/util/ExponentialDecayBounceInterpolator;", "glitchOffset", "", "animator", "Landroid/animation/ValueAnimator;", "glitchFraction", "Ljava/lang/Float;", "animateGlitch", "", "cancel", "draw", "canvas", "Landroid/graphics/Canvas;", "textPaint", "Landroid/graphics/Paint;", "glitchColor", "", "drawOp", "Lkotlin/Function1;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class GlitchManager {
    public static final int $stable = 8;
    private ValueAnimator animator;
    private final ExponentialDecayBounceInterpolator decayInterpolator;
    private Float glitchFraction;
    private final float glitchOffset;
    private final View view;

    public GlitchManager(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.decayInterpolator = new ExponentialDecayBounceInterpolator(2.0f, 1.5f, 3);
        this.glitchOffset = view.getResources().getDimension(C11048R.dimen.crypto_glitch_offset);
    }

    public final View getView() {
        return this.view;
    }

    public final void animateGlitch() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(350L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.common.view.GlitchManager.animateGlitch.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                GlitchManager glitchManager = GlitchManager.this;
                glitchManager.glitchFraction = Float.valueOf(glitchManager.decayInterpolator.getInterpolation(it.getAnimatedFraction()));
                GlitchManager.this.getView().invalidate();
            }
        });
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.common.view.GlitchManager.animateGlitch.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                GlitchManager.this.glitchFraction = null;
                GlitchManager.this.getView().invalidate();
            }
        });
        this.animator = duration;
        duration.start();
    }

    public final void cancel() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void draw(Canvas canvas, Paint textPaint, int glitchColor, Function1<? super Canvas, Unit> drawOp) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(drawOp, "drawOp");
        Float f = this.glitchFraction;
        if (f != null) {
            int alpha = textPaint.getAlpha();
            int color = textPaint.getColor();
            textPaint.setAlpha(EnumC7081g.f2773x8d9721ad);
            textPaint.setColor(glitchColor);
            canvas.save();
            canvas.translate(f.floatValue() * this.glitchOffset, 0.0f);
            drawOp.invoke(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f.floatValue() * (-this.glitchOffset), 0.0f);
            drawOp.invoke(canvas);
            canvas.restore();
            textPaint.setAlpha(alpha);
            textPaint.setColor(color);
        }
    }
}
