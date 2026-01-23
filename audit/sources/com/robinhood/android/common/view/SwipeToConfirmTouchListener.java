package com.robinhood.android.common.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.core.view.OneShotPreDrawListener;
import com.robinhood.android.common.view.SwipeToConfirmTouchListener;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SwipeToConfirmTouchListener.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002./B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J*\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0002J*\u0010\u001e\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0016J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020$H\u0002J(\u0010)\u001a\u00020$2\u0006\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/common/view/SwipeToConfirmTouchListener;", "Lcom/robinhood/android/common/view/DiscreteTouchListener;", "view", "Landroid/view/View;", "flingThreshold", "", "<init>", "(Landroid/view/View;F)V", "maxDragDistance", "currentAnimationRatio", "animator", "Landroid/animation/ValueAnimator;", "callbacks", "Lcom/robinhood/android/common/view/SwipeToConfirmTouchListener$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/view/SwipeToConfirmTouchListener$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/common/view/SwipeToConfirmTouchListener$Callbacks;)V", "onDown", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Landroid/view/MotionEvent;", "onScroll", "e1", "e2", "distanceX", "distanceY", "onUp", "onCancel", "handleDone", "onFling", "velocityX", "velocityY", "onSingleTapUp", "isOverSubmitThreshold", "animateReset", "", "animateSubmission", "duration", "", "removeTouchListener", "animateToRatio", "startRatio", "endRatio", "submitBehavior", "Lcom/robinhood/android/common/view/SwipeToConfirmTouchListener$SubmitBehavior;", "SubmitBehavior", "Callbacks", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SwipeToConfirmTouchListener extends DiscreteTouchListener {
    public static final int $stable = 8;
    private ValueAnimator animator;
    private Callbacks callbacks;
    private float currentAnimationRatio;
    private final float flingThreshold;
    private float maxDragDistance;
    private final View view;

    /* compiled from: SwipeToConfirmTouchListener.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/view/SwipeToConfirmTouchListener$Callbacks;", "", "_", "", "submitBeforeAnimation", "getSubmitBeforeAnimation", "()Z", "setSubmitBeforeAnimation", "(Z)V", "onAnimationStep", "", "ratio", "", "maxDragDistance", "onSubmit", "onSwipeToSubmitAnimationStart", "duration", "", "onSwipeToSubmitAnimationComplete", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {

        /* compiled from: SwipeToConfirmTouchListener.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static boolean getSubmitBeforeAnimation(Callbacks callbacks) {
                return false;
            }

            public static void onSwipeToSubmitAnimationComplete(Callbacks callbacks) {
            }

            public static void onSwipeToSubmitAnimationStart(Callbacks callbacks, long j) {
            }

            public static void setSubmitBeforeAnimation(Callbacks callbacks, boolean z) {
            }
        }

        boolean getSubmitBeforeAnimation();

        void onAnimationStep(float ratio, float maxDragDistance);

        void onSubmit();

        void onSwipeToSubmitAnimationComplete();

        void onSwipeToSubmitAnimationStart(long duration);

        void setSubmitBeforeAnimation(boolean z);
    }

    /* compiled from: SwipeToConfirmTouchListener.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubmitBehavior.values().length];
            try {
                iArr[SubmitBehavior.BEFORE_ANIMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubmitBehavior.AFTER_ANIMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubmitBehavior.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean isOverSubmitThreshold(float currentAnimationRatio) {
        return currentAnimationRatio > 0.33f;
    }

    @Override // com.robinhood.android.common.view.DiscreteTouchListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwipeToConfirmTouchListener(final View view, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        super(context);
        this.view = view;
        this.flingThreshold = f;
        OneShotPreDrawListener.add(view, new Runnable() { // from class: com.robinhood.android.common.view.SwipeToConfirmTouchListener$special$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.maxDragDistance = r0.view.getHeight();
            }
        });
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // com.robinhood.android.common.view.DiscreteTouchListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        float f = this.maxDragDistance;
        float f2 = this.currentAnimationRatio + (distanceY / f);
        this.currentAnimationRatio = f2;
        Callbacks callbacks = this.callbacks;
        if (callbacks == null) {
            return true;
        }
        callbacks.onAnimationStep(f2, f);
        return true;
    }

    @Override // com.robinhood.android.common.view.DiscreteTouchListener
    public boolean onUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return handleDone();
    }

    @Override // com.robinhood.android.common.view.DiscreteTouchListener
    public boolean onCancel(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return handleDone();
    }

    private final boolean handleDone() {
        if (isOverSubmitThreshold(this.currentAnimationRatio)) {
            animateSubmission(200L);
        } else {
            animateReset();
        }
        this.currentAnimationRatio = 0.0f;
        return true;
    }

    @Override // com.robinhood.android.common.view.DiscreteTouchListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        boolean zIsOverSubmitThreshold = isOverSubmitThreshold(this.currentAnimationRatio);
        boolean z = velocityY <= (-this.flingThreshold);
        if (zIsOverSubmitThreshold || z) {
            animateSubmission(z ? Math.max(200L, Math.min(500L, Math.abs(Math.round((((1.0f - this.currentAnimationRatio) * this.maxDragDistance) / velocityY) * 1000)))) : 200L);
        } else {
            animateReset();
        }
        this.currentAnimationRatio = 0.0f;
        return true;
    }

    @Override // com.robinhood.android.common.view.DiscreteTouchListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.1f, 0.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.common.view.SwipeToConfirmTouchListener$onSingleTapUp$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SwipeToConfirmTouchListener.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    Object animatedValue = it.getAnimatedValue();
                    Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    callbacks.onAnimationStep(((Float) animatedValue).floatValue(), this.this$0.maxDragDistance);
                }
            }
        });
        valueAnimatorOfFloat.start();
        return true;
    }

    public final void animateReset() {
        animateToRatio(200L, this.currentAnimationRatio, 0.0f, SubmitBehavior.NONE);
    }

    private final void animateSubmission(long duration) {
        SubmitBehavior submitBehavior;
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onSwipeToSubmitAnimationStart(duration);
        }
        float f = this.currentAnimationRatio;
        Callbacks callbacks2 = this.callbacks;
        Boolean boolValueOf = callbacks2 != null ? Boolean.valueOf(callbacks2.getSubmitBeforeAnimation()) : null;
        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            submitBehavior = SubmitBehavior.BEFORE_ANIMATION;
        } else {
            if (!Intrinsics.areEqual(boolValueOf, Boolean.FALSE) && boolValueOf != null) {
                throw new NoWhenBranchMatchedException();
            }
            submitBehavior = SubmitBehavior.AFTER_ANIMATION;
        }
        animateToRatio(duration, f, 1.0f, submitBehavior);
        removeTouchListener();
    }

    private final void removeTouchListener() {
        this.view.setOnTouchListener(null);
    }

    private final void animateToRatio(long duration, float startRatio, float endRatio, SubmitBehavior submitBehavior) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(startRatio, endRatio);
        valueAnimatorOfFloat.setDuration(duration);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.common.view.SwipeToConfirmTouchListener$animateToRatio$animator$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SwipeToConfirmTouchListener.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks != null) {
                    Object animatedValue = it.getAnimatedValue();
                    Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    callbacks.onAnimationStep(((Float) animatedValue).floatValue(), this.this$0.maxDragDistance);
                }
            }
        });
        int i = WhenMappings.$EnumSwitchMapping$0[submitBehavior.ordinal()];
        if (i == 1) {
            Callbacks callbacks = this.callbacks;
            if (callbacks != null) {
                callbacks.onSubmit();
            }
            Intrinsics.checkNotNull(valueAnimatorOfFloat);
            valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.android.common.view.SwipeToConfirmTouchListener$animateToRatio$$inlined$addListener$default$1
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
                    SwipeToConfirmTouchListener.Callbacks callbacks2 = this.this$0.getCallbacks();
                    if (callbacks2 != null) {
                        callbacks2.onSwipeToSubmitAnimationComplete();
                    }
                    this.this$0.animator = null;
                }
            });
        } else if (i == 2) {
            Intrinsics.checkNotNull(valueAnimatorOfFloat);
            valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.android.common.view.SwipeToConfirmTouchListener$animateToRatio$$inlined$addListener$default$2
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
                    SwipeToConfirmTouchListener.Callbacks callbacks2 = this.this$0.getCallbacks();
                    if (callbacks2 != null) {
                        callbacks2.onSwipeToSubmitAnimationComplete();
                    }
                    SwipeToConfirmTouchListener.Callbacks callbacks3 = this.this$0.getCallbacks();
                    if (callbacks3 != null) {
                        callbacks3.onSubmit();
                    }
                    this.this$0.animator = null;
                }
            });
        } else if (i == 3) {
            Unit unit = Unit.INSTANCE;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        valueAnimatorOfFloat.start();
        this.animator = valueAnimatorOfFloat;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SwipeToConfirmTouchListener.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/view/SwipeToConfirmTouchListener$SubmitBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BEFORE_ANIMATION", "AFTER_ANIMATION", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class SubmitBehavior {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SubmitBehavior[] $VALUES;
        public static final SubmitBehavior NONE = new SubmitBehavior("NONE", 0);
        public static final SubmitBehavior BEFORE_ANIMATION = new SubmitBehavior("BEFORE_ANIMATION", 1);
        public static final SubmitBehavior AFTER_ANIMATION = new SubmitBehavior("AFTER_ANIMATION", 2);

        private static final /* synthetic */ SubmitBehavior[] $values() {
            return new SubmitBehavior[]{NONE, BEFORE_ANIMATION, AFTER_ANIMATION};
        }

        public static EnumEntries<SubmitBehavior> getEntries() {
            return $ENTRIES;
        }

        private SubmitBehavior(String str, int i) {
        }

        static {
            SubmitBehavior[] submitBehaviorArr$values = $values();
            $VALUES = submitBehaviorArr$values;
            $ENTRIES = EnumEntries2.enumEntries(submitBehaviorArr$values);
        }

        public static SubmitBehavior valueOf(String str) {
            return (SubmitBehavior) Enum.valueOf(SubmitBehavior.class, str);
        }

        public static SubmitBehavior[] values() {
            return (SubmitBehavior[]) $VALUES.clone();
        }
    }
}
