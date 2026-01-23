package androidx.camera.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.Threads;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class ScreenFlashView extends View {
    private ImageCapture.ScreenFlash mScreenFlash;
    private Window mScreenFlashWindow;

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public ScreenFlashView(Context context) {
        this(context, null);
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }

    public void setController(CameraController cameraController) {
        Threads.checkMainThread();
    }

    private void setScreenFlashUiInfo(ImageCapture.ScreenFlash screenFlash) {
        Logger.m45d("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public void setScreenFlashWindow(Window window) {
        Threads.checkMainThread();
        updateScreenFlash(window);
        this.mScreenFlashWindow = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    private void updateScreenFlash(Window window) {
        if (this.mScreenFlashWindow != window) {
            this.mScreenFlash = window == null ? null : new ImageCapture.ScreenFlash() { // from class: androidx.camera.view.ScreenFlashView.1
                private ValueAnimator mAnimator;
                private float mPreviousBrightness;

                @Override // androidx.camera.core.ImageCapture.ScreenFlash
                public void apply(long j, final ImageCapture.ScreenFlashListener screenFlashListener) {
                    Logger.m45d("ScreenFlashView", "ScreenFlash#apply");
                    this.mPreviousBrightness = ScreenFlashView.this.getBrightness();
                    ScreenFlashView.this.setBrightness(1.0f);
                    ValueAnimator valueAnimator = this.mAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ScreenFlashView screenFlashView = ScreenFlashView.this;
                    Objects.requireNonNull(screenFlashListener);
                    this.mAnimator = screenFlashView.animateToFullOpacity(new Runnable() { // from class: androidx.camera.view.ScreenFlashView$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            screenFlashListener.onCompleted();
                        }
                    });
                }

                @Override // androidx.camera.core.ImageCapture.ScreenFlash
                public void clear() {
                    Logger.m45d("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
                    ValueAnimator valueAnimator = this.mAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.mAnimator = null;
                    }
                    ScreenFlashView.this.setAlpha(0.0f);
                    ScreenFlashView.this.setBrightness(this.mPreviousBrightness);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ValueAnimator animateToFullOpacity(final Runnable runnable) {
        Logger.m45d("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.camera.view.ScreenFlashView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ScreenFlashView.$r8$lambda$A5WhddswYaiHIyNBaKDw2O1Xbt4(this.f$0, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: androidx.camera.view.ScreenFlashView.2
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
                Logger.m45d("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }

    public static /* synthetic */ void $r8$lambda$A5WhddswYaiHIyNBaKDw2O1Xbt4(ScreenFlashView screenFlashView, ValueAnimator valueAnimator) {
        screenFlashView.getClass();
        Logger.m45d("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
        screenFlashView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.mScreenFlashWindow;
        if (window == null) {
            Logger.m47e("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return Float.NaN;
        }
        return window.getAttributes().screenBrightness;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.mScreenFlashWindow == null) {
            Logger.m47e("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f)) {
            Logger.m47e("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.mScreenFlashWindow.getAttributes();
        attributes.screenBrightness = f;
        this.mScreenFlashWindow.setAttributes(attributes);
        Logger.m45d("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    public ImageCapture.ScreenFlash getScreenFlash() {
        return this.mScreenFlash;
    }
}
