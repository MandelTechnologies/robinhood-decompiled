package com.withpersona.sdk2.inquiry.selfie.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.withpersona.sdk2.inquiry.selfie.R$styleable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Pi2ProgressArcView.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\rJ \u0010\u001a\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\r2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0016J \u0010\u001e\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\r2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "size", "", "startAngle", "progress", "animator", "Landroid/animation/ValueAnimator;", "indeterminateAnimator", "rotateToZeroAnimator", "_rotation", "setStrokeColor", "", "newColor", "setStrokeWidth", "newWidth", "setProgress", "onAnimationEnd", "Lkotlin/Function0;", "setIndeterminate", "setProgressInternal", "rotateToZero", "onDraw", "canvas", "Landroid/graphics/Canvas;", "Companion", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class Pi2ProgressArcView extends View {
    private float _rotation;
    private ValueAnimator animator;
    private ValueAnimator indeterminateAnimator;
    private final Paint paint;
    private float progress;
    private ValueAnimator rotateToZeroAnimator;
    private final float size;
    private final float startAngle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Pi2ProgressArcView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ Pi2ProgressArcView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Pi2ProgressArcView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.paint = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Pi2ProgressArcView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.size = typedArrayObtainStyledAttributes.getFloat(R$styleable.Pi2ProgressArcView_pi2InnerCircleSize, 0.4f);
            this.startAngle = typedArrayObtainStyledAttributes.getFloat(R$styleable.Pi2ProgressArcView_pi2StartAngle, 270.0f);
            this.progress = typedArrayObtainStyledAttributes.getFloat(R$styleable.Pi2ProgressArcView_pi2Progress, 0.0f);
            paint.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.Pi2ProgressArcView_pi2StrokeColor, -1));
            paint.setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Pi2ProgressArcView_pi2StrokeWidth, 4));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            typedArrayObtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setStrokeColor(int newColor) {
        this.paint.setColor(newColor);
    }

    public final void setStrokeWidth(float newWidth) {
        this.paint.setStrokeWidth(newWidth);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setProgress$default(Pi2ProgressArcView pi2ProgressArcView, float f, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        pi2ProgressArcView.setProgress(f, function0);
    }

    public final void setProgress(float progress, Function0<Unit> onAnimationEnd) {
        ValueAnimator valueAnimator = this.indeterminateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        rotateToZero();
        setProgressInternal(progress, onAnimationEnd);
    }

    public final void setIndeterminate() {
        ValueAnimator valueAnimator = this.rotateToZeroAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.indeterminateAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        setProgressInternal(25.0f, null);
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView$setIndeterminate$1$1
            private float lastProgress;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                Object animatedValue = valueAnimatorOfFloat.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                float fAbs = Math.abs(fFloatValue - this.lastProgress);
                Pi2ProgressArcView pi2ProgressArcView = this;
                pi2ProgressArcView._rotation = (pi2ProgressArcView._rotation + fAbs) % 360;
                this.lastProgress = fFloatValue;
                this.invalidate();
            }
        });
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.start();
        this.indeterminateAnimator = valueAnimatorOfFloat;
    }

    private final void setProgressInternal(float progress, final Function0<Unit> onAnimationEnd) {
        if (this.progress == progress) {
            if (onAnimationEnd != null) {
                onAnimationEnd.invoke();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = this.progress;
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, progress);
        valueAnimatorOfFloat.setDuration((long) (1000 * (Math.abs(progress - f) / 100.0f)));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Pi2ProgressArcView.setProgressInternal$lambda$8$lambda$5(this.f$0, valueAnimatorOfFloat, valueAnimator2);
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView$setProgressInternal$lambda$8$$inlined$doOnEnd$1
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
                Function0 function0 = onAnimationEnd;
                if (function0 != null) {
                    this.postDelayed(new Runnable(function0) { // from class: com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView$sam$java_lang_Runnable$0
                        private final /* synthetic */ Function0 function;

                        {
                            Intrinsics.checkNotNullParameter(function0, "function");
                            this.function = function0;
                        }

                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.function.invoke();
                        }
                    }, 100L);
                }
            }
        });
        valueAnimatorOfFloat.start();
        this.animator = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProgressInternal$lambda$8$lambda$5(Pi2ProgressArcView pi2ProgressArcView, ValueAnimator valueAnimator, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        pi2ProgressArcView.progress = ((Float) animatedValue).floatValue();
        pi2ProgressArcView.invalidate();
    }

    private final void rotateToZero() {
        if (this._rotation == 0.0f) {
            return;
        }
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView$rotateToZero$1$1
            private float lastProgress;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                Object animatedValue = valueAnimatorOfFloat.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                float fAbs = Math.abs(fFloatValue - this.lastProgress);
                float f = this._rotation;
                Pi2ProgressArcView pi2ProgressArcView = this;
                pi2ProgressArcView._rotation = (pi2ProgressArcView._rotation + fAbs) % 360;
                if (f > this._rotation) {
                    this._rotation = 0.0f;
                    animator.cancel();
                }
                this.lastProgress = fFloatValue;
                this.invalidate();
            }
        });
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.start();
        this.rotateToZeroAnimator = valueAnimatorOfFloat;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        float fMin = (this.size * Math.min(getWidth(), getHeight())) - (this.paint.getStrokeWidth() / 2);
        float f = width;
        float f2 = height;
        canvas.drawArc(f - fMin, f2 - fMin, f + fMin, f2 + fMin, this.startAngle + this._rotation, (this.progress * 360) / 100.0f, false, this.paint);
    }
}
