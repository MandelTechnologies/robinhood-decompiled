package com.robinhood.android.equitydetail.p123ui.ipo;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.ipo.IpoHeaderProgressBar;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IpoHeaderProgressBar.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020#H\u0014J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0014J(\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000bH\u0014J\u0010\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u000200H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u000b8G@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012*\u0004\b\r\u0010\u000eR-\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u000b8G@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012*\u0004\b\u0014\u0010\u000eR-\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u000b8G@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012*\u0004\b\u0018\u0010\u000eR(\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001b\u001a\u00020\u001c8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/ipo/IpoHeaderProgressBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", ResourceTypes.DRAWABLE, "Lcom/robinhood/android/equitydetail/ui/ipo/IpoHeaderProgressBar$ProgressBarDrawable;", "<set-?>", "", "trackColor", "getTrackColor$delegate", "(Lcom/robinhood/android/equitydetail/ui/ipo/IpoHeaderProgressBar;)Ljava/lang/Object;", "getTrackColor", "()I", "setTrackColor", "(I)V", "progressBarColor", "getProgressBarColor$delegate", "getProgressBarColor", "setProgressBarColor", "highlightColor", "getHighlightColor$delegate", "getHighlightColor", "setHighlightColor", "value", "", "progress", "getProgress", "()F", "setProgress", "(F)V", "onAttachedToWindow", "", "onDetachedFromWindow", "verifyDrawable", "", "who", "Landroid/graphics/drawable/Drawable;", "onSizeChanged", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "ProgressBarDrawable", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class IpoHeaderProgressBar extends View {
    public static final int $stable = 8;
    private final ProgressBarDrawable drawable;
    private float progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IpoHeaderProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ProgressBarDrawable progressBarDrawable = new ProgressBarDrawable();
        progressBarDrawable.setCallback(this);
        this.drawable = progressBarDrawable;
        int[] IpoHeaderProgressBar = C15314R.styleable.IpoHeaderProgressBar;
        Intrinsics.checkNotNullExpressionValue(IpoHeaderProgressBar, "IpoHeaderProgressBar");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, IpoHeaderProgressBar, 0, 0);
        setTrackColor(typedArrayObtainStyledAttributes.getColor(C15314R.styleable.IpoHeaderProgressBar_trackColor, getTrackColor()));
        setProgressBarColor(typedArrayObtainStyledAttributes.getColor(C15314R.styleable.IpoHeaderProgressBar_progressBarColor, getProgressBarColor()));
        setHighlightColor(typedArrayObtainStyledAttributes.getColor(C15314R.styleable.IpoHeaderProgressBar_highlightColor, getHighlightColor()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int getTrackColor() {
        return this.drawable.getTrackColor();
    }

    public final void setTrackColor(int i) {
        this.drawable.setTrackColor(i);
    }

    public final int getProgressBarColor() {
        return this.drawable.getProgressBarColor();
    }

    public final void setProgressBarColor(int i) {
        this.drawable.setProgressBarColor(i);
    }

    public final int getHighlightColor() {
        return this.drawable.getHighlightColor();
    }

    public final void setHighlightColor(int i) {
        this.drawable.setHighlightColor(i);
    }

    public final float getProgress() {
        return this.progress;
    }

    public final void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        this.drawable.setTargetProgress(f);
        if (isAttachedToWindow()) {
            this.drawable.startAnimation();
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.drawable.isAnimating()) {
            return;
        }
        this.drawable.startAnimation();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.drawable.isAnimating()) {
            this.drawable.stopAnimation();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        return super.verifyDrawable(who) || Intrinsics.areEqual(who, this.drawable);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.drawable.setBounds(0, 0, w, h);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.drawable.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IpoHeaderProgressBar.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\tH\u0016J\u0012\u0010.\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020\tH\u0016J\u0010\u00102\u001a\u00020,2\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020'H\u0002J\u0006\u00106\u001a\u00020,J\u0006\u00107\u001a\u00020,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\t8G@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010*\u0004\b\u000b\u0010\fR-\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\t8G@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010*\u0004\b\u0012\u0010\fR-\u0010\u0015\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\t8G@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010*\u0004\b\u0016\u0010\fR$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b!\u0010\u001fR\u001e\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b(\u0010*¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/ipo/IpoHeaderProgressBar$ProgressBarDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "trackPaint", "Landroid/graphics/Paint;", "progressBarPaint", "highlightPaint", "<set-?>", "", "trackColor", "getTrackColor$delegate", "(Lcom/robinhood/android/equitydetail/ui/ipo/IpoHeaderProgressBar$ProgressBarDrawable;)Ljava/lang/Object;", "getTrackColor", "()I", "setTrackColor", "(I)V", "progressBarColor", "getProgressBarColor$delegate", "getProgressBarColor", "setProgressBarColor", "highlightColor", "getHighlightColor$delegate", "getHighlightColor", "setHighlightColor", "value", "", "targetProgress", "getTargetProgress", "()F", "setTargetProgress", "(F)V", "progress", "setProgress", "highlightProgress", "setHighlightProgress", "highlightSize", "getHighlightSize", "animator", "Landroid/animation/Animator;", "isAnimating", "", "()Z", "setAlpha", "", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "draw", "canvas", "Landroid/graphics/Canvas;", "createAnimator", "startAnimation", "stopAnimation", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes3.dex */
    static final class ProgressBarDrawable extends Drawable {
        private static final long DELAY_PROGRESS = 500;
        private static final long DURATION_HIGHLIGHT = 2000;
        private static final long DURATION_PROGRESS = 500;
        private Animator animator;
        private float highlightProgress;
        private float progress;
        private float targetProgress;
        private final Paint trackPaint = new Paint();
        private final Paint progressBarPaint = new Paint();
        private final Paint highlightPaint = new Paint();

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int alpha) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public final int getTrackColor() {
            return this.trackPaint.getColor();
        }

        public final void setTrackColor(int i) {
            this.trackPaint.setColor(i);
        }

        public final int getProgressBarColor() {
            return this.progressBarPaint.getColor();
        }

        public final void setProgressBarColor(int i) {
            this.progressBarPaint.setColor(i);
        }

        public final int getHighlightColor() {
            return this.highlightPaint.getColor();
        }

        public final void setHighlightColor(int i) {
            this.highlightPaint.setColor(i);
        }

        public final float getTargetProgress() {
            return this.targetProgress;
        }

        public final void setTargetProgress(float f) {
            if (this.targetProgress == f) {
                return;
            }
            this.targetProgress = f;
            Animator animator = this.animator;
            if (animator != null) {
                animator.cancel();
            }
            this.animator = createAnimator();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setProgress(float f) {
            if (this.progress == f) {
                return;
            }
            this.progress = f;
            invalidateSelf();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setHighlightProgress(float f) {
            if (this.highlightProgress == f) {
                return;
            }
            this.highlightProgress = f;
            invalidateSelf();
        }

        private final float getHighlightSize() {
            return getBounds().width() / 4;
        }

        public final boolean isAnimating() {
            Animator animator = this.animator;
            return animator != null && animator.isRunning();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            float fWidth = getBounds().width();
            float fHeight = getBounds().height();
            float f = fWidth * this.progress;
            canvas.drawRect(0.0f, 0.0f, fWidth, fHeight, this.trackPaint);
            canvas.drawRect(0.0f, 0.0f, f, fHeight, this.progressBarPaint);
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, f, fHeight);
            try {
                canvas.translate((-getHighlightSize()) + ((f + getHighlightSize()) * this.highlightProgress), 0.0f);
                canvas.drawRect(0.0f, 0.0f, getHighlightSize(), fHeight, this.highlightPaint);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }

        private final Animator createAnimator() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f, 1.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(2000L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setRepeatMode(1);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.equitydetail.ui.ipo.IpoHeaderProgressBar$ProgressBarDrawable$createAnimator$highlightAnimator$1$1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator animator) {
                    Intrinsics.checkNotNullParameter(animator, "animator");
                    IpoHeaderProgressBar.ProgressBarDrawable progressBarDrawable = this.this$0;
                    Object animatedValue = animator.getAnimatedValue();
                    Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    progressBarDrawable.setHighlightProgress(((Float) animatedValue).floatValue());
                }
            });
            float f = this.progress;
            float f2 = this.targetProgress;
            if (f != f2) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f, f2);
                valueAnimatorOfFloat2.setStartDelay(500L);
                valueAnimatorOfFloat2.setDuration(500L);
                valueAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.17f, 0.17f, 0.1f, 1.0f));
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.equitydetail.ui.ipo.IpoHeaderProgressBar$ProgressBarDrawable$createAnimator$progressAnimator$1$1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator animator) {
                        Intrinsics.checkNotNullParameter(animator, "animator");
                        IpoHeaderProgressBar.ProgressBarDrawable progressBarDrawable = this.this$0;
                        Object animatedValue = animator.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        progressBarDrawable.setProgress(((Float) animatedValue).floatValue());
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(valueAnimatorOfFloat2, valueAnimatorOfFloat);
                return animatorSet;
            }
            Intrinsics.checkNotNull(valueAnimatorOfFloat);
            return valueAnimatorOfFloat;
        }

        public final void startAnimation() {
            Animator animatorCreateAnimator = this.animator;
            if (animatorCreateAnimator == null) {
                animatorCreateAnimator = createAnimator();
            }
            animatorCreateAnimator.start();
            this.animator = animatorCreateAnimator;
        }

        public final void stopAnimation() {
            Animator animator = this.animator;
            if (animator != null) {
                animator.cancel();
            }
            this.animator = null;
        }
    }
}
