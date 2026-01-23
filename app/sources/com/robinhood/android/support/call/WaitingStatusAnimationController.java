package com.robinhood.android.support.call;

import android.annotation.SuppressLint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FlingAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WaitingStatusAnimationController.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/support/call/WaitingStatusAnimationController;", "", "lottieAnimationView", "Lcom/airbnb/lottie/LottieAnimationView;", "<init>", "(Lcom/airbnb/lottie/LottieAnimationView;)V", "pixelToProgressRatio", "", "detector", "Landroid/view/GestureDetector;", "flingAnimation", "Landroidx/dynamicanimation/animation/FlingAnimation;", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "clampProgress", "progress", "GestureListener", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes9.dex */
public final class WaitingStatusAnimationController {
    private static final float DEFAULT_SPEED = 1.0f;
    private static final float DP_TO_PROGRESS_RATIO = 0.002f;
    private static final float FLING_FRICTION = 0.5f;
    private static final float MINIMUM_VISIBLE_CHANGE = 0.1f;
    private static final float VELOCITY_TO_SPEED_RATIO = 0.01f;
    private final GestureDetector detector;
    private boolean enabled;
    private final FlingAnimation flingAnimation;
    private final LottieAnimationView lottieAnimationView;
    private final float pixelToProgressRatio;
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public final float clampProgress(float progress) {
        return progress > 1.0f ? progress - ((int) progress) : progress < 0.0f ? 1 + (progress - ((int) progress)) : progress;
    }

    public WaitingStatusAnimationController(LottieAnimationView lottieAnimationView) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "lottieAnimationView");
        this.lottieAnimationView = lottieAnimationView;
        this.pixelToProgressRatio = DP_TO_PROGRESS_RATIO / lottieAnimationView.getContext().getResources().getDisplayMetrics().density;
        GestureDetector gestureDetector = new GestureDetector(lottieAnimationView.getContext(), new GestureListener());
        gestureDetector.setIsLongpressEnabled(false);
        this.detector = gestureDetector;
        FlingAnimation flingAnimation = new FlingAnimation(lottieAnimationView, new FloatPropertyCompat<LottieAnimationView>() { // from class: com.robinhood.android.support.call.WaitingStatusAnimationController$flingAnimation$1
            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void setValue(LottieAnimationView obj, float value) {
                Intrinsics.checkNotNullParameter(obj, "obj");
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float getValue(LottieAnimationView obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.getSpeed();
            }
        });
        flingAnimation.setFriction(0.5f);
        flingAnimation.setMinimumVisibleChange(0.1f);
        flingAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: com.robinhood.android.support.call.WaitingStatusAnimationController$flingAnimation$2$1
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                float f3 = f2 * 0.01f;
                WaitingStatusAnimationController waitingStatusAnimationController = this.this$0;
                if (Math.abs(f3) < 1.0f) {
                    f3 = waitingStatusAnimationController.lottieAnimationView.getSpeed() > 0.0f ? 1.0f : -1.0f;
                }
                this.this$0.lottieAnimationView.setSpeed(f3);
            }
        });
        this.flingAnimation = flingAnimation;
        this.enabled = true;
        lottieAnimationView.setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.support.call.WaitingStatusAnimationController.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (!WaitingStatusAnimationController.this.getEnabled()) {
                    return false;
                }
                boolean zOnTouchEvent = WaitingStatusAnimationController.this.detector.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !zOnTouchEvent) {
                    WaitingStatusAnimationController.this.lottieAnimationView.resumeAnimation();
                }
                return zOnTouchEvent;
            }
        });
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    /* compiled from: WaitingStatusAnimationController.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J*\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J*\u0010\u000e\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/support/call/WaitingStatusAnimationController$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lcom/robinhood/android/support/call/WaitingStatusAnimationController;)V", "onDown", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Landroid/view/MotionEvent;", "onScroll", "e1", "e2", "distanceX", "", "distanceY", "onFling", "velocityX", "velocityY", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            WaitingStatusAnimationController.this.flingAnimation.cancel();
            WaitingStatusAnimationController.this.lottieAnimationView.pauseAnimation();
            WaitingStatusAnimationController.this.lottieAnimationView.setSpeed(1.0f);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            Intrinsics.checkNotNullParameter(e2, "e2");
            WaitingStatusAnimationController.this.lottieAnimationView.setProgress(WaitingStatusAnimationController.this.clampProgress(WaitingStatusAnimationController.this.lottieAnimationView.getProgress() - (WaitingStatusAnimationController.this.pixelToProgressRatio * distanceX)));
            float speed = WaitingStatusAnimationController.this.lottieAnimationView.getSpeed();
            if ((speed <= 0.0f || distanceX <= 0.0f) && (speed >= 0.0f || distanceX >= 0.0f)) {
                return true;
            }
            WaitingStatusAnimationController.this.lottieAnimationView.reverseAnimationSpeed();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            Intrinsics.checkNotNullParameter(e2, "e2");
            WaitingStatusAnimationController.this.lottieAnimationView.resumeAnimation();
            FlingAnimation flingAnimation = WaitingStatusAnimationController.this.flingAnimation;
            flingAnimation.setStartVelocity(velocityX);
            flingAnimation.start();
            return true;
        }
    }
}
