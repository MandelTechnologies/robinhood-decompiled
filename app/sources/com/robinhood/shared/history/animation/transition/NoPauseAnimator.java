package com.robinhood.shared.history.animation.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.ArrayMap;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: NoPauseAnimator.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010H\u0016J\u0016\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00070\u00070\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u000eH\u0016J\u0012\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020\tH\u0016J\b\u0010&\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/shared/history/animation/transition/NoPauseAnimator;", "Landroid/animation/Animator;", "animator", "<init>", "(Landroid/animation/Animator;)V", "listeners", "Landroid/util/ArrayMap;", "Landroid/animation/Animator$AnimatorListener;", "addListener", "", "listener", "cancel", "end", "getDuration", "", "getInterpolator", "Landroid/animation/TimeInterpolator;", "kotlin.jvm.PlatformType", "getListeners", "Ljava/util/ArrayList;", "getStartDelay", "isPaused", "", "isRunning", "isStarted", "removeAllListeners", "removeListener", "setDuration", "durationMS", "setInterpolator", "timeInterpolator", "setStartDelay", "delayMS", "setTarget", "target", "", "setupEndValues", "setupStartValues", "start", "AnimatorListenerWrapper", "lib-history-animation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class NoPauseAnimator extends Animator {
    private final Animator animator;
    private final ArrayMap<Animator.AnimatorListener, Animator.AnimatorListener> listeners;

    public NoPauseAnimator(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.animator = animator;
        this.listeners = new ArrayMap<>();
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        AnimatorListenerWrapper animatorListenerWrapper = new AnimatorListenerWrapper(this, listener);
        if (this.listeners.containsKey(listener)) {
            return;
        }
        this.listeners.put(listener, animatorListenerWrapper);
        this.animator.addListener(animatorListenerWrapper);
    }

    @Override // android.animation.Animator
    public void cancel() {
        this.animator.cancel();
    }

    @Override // android.animation.Animator
    public void end() {
        this.animator.end();
    }

    @Override // android.animation.Animator
    public long getDuration() {
        return this.animator.getDuration();
    }

    @Override // android.animation.Animator
    public TimeInterpolator getInterpolator() {
        return this.animator.getInterpolator();
    }

    @Override // android.animation.Animator
    public ArrayList<Animator.AnimatorListener> getListeners() {
        return new ArrayList<>(this.listeners.keySet());
    }

    @Override // android.animation.Animator
    public long getStartDelay() {
        return this.animator.getStartDelay();
    }

    @Override // android.animation.Animator
    public boolean isPaused() {
        return this.animator.isPaused();
    }

    @Override // android.animation.Animator
    public boolean isRunning() {
        return this.animator.isRunning();
    }

    @Override // android.animation.Animator
    public boolean isStarted() {
        return this.animator.isStarted();
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.listeners.clear();
        this.animator.removeAllListeners();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Animator.AnimatorListener animatorListener = this.listeners.get(listener);
        if (animatorListener != null) {
            this.listeners.remove(listener);
            this.animator.removeListener(animatorListener);
        }
    }

    @Override // android.animation.Animator
    public Animator setDuration(long durationMS) {
        try {
            this.animator.setDuration(durationMS);
            return this;
        } catch (Exception e) {
            Timber.INSTANCE.mo3355e(e, "NoPauseAnimator.setDuration", new Object[0]);
            return this;
        }
    }

    @Override // android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        Intrinsics.checkNotNullParameter(timeInterpolator, "timeInterpolator");
        try {
            this.animator.setInterpolator(timeInterpolator);
        } catch (Exception e) {
            Timber.INSTANCE.mo3355e(e, "NoPauseAnimator.setInterpolator", new Object[0]);
        }
    }

    @Override // android.animation.Animator
    public void setStartDelay(long delayMS) {
        try {
            this.animator.setStartDelay(delayMS);
        } catch (Exception e) {
            Timber.INSTANCE.mo3355e(e, "NoPauseAnimator.setStartDelay", new Object[0]);
        }
    }

    @Override // android.animation.Animator
    public void setTarget(Object target) {
        try {
            this.animator.setTarget(target);
        } catch (Exception e) {
            Timber.INSTANCE.mo3355e(e, "NoPauseAnimator.setTarget", new Object[0]);
        }
    }

    @Override // android.animation.Animator
    public void setupEndValues() {
        this.animator.setupEndValues();
    }

    @Override // android.animation.Animator
    public void setupStartValues() {
        this.animator.setupStartValues();
    }

    @Override // android.animation.Animator
    public void start() {
        this.animator.start();
    }

    /* compiled from: NoPauseAnimator.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/history/animation/transition/NoPauseAnimator$AnimatorListenerWrapper;", "Landroid/animation/Animator$AnimatorListener;", "animator", "Landroid/animation/Animator;", "listener", "<init>", "(Landroid/animation/Animator;Landroid/animation/Animator$AnimatorListener;)V", "onAnimationStart", "", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "lib-history-animation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class AnimatorListenerWrapper implements Animator.AnimatorListener {
        private final Animator animator;
        private final Animator.AnimatorListener listener;

        public AnimatorListenerWrapper(Animator animator, Animator.AnimatorListener listener) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.animator = animator;
            this.listener = listener;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.listener.onAnimationStart(this.animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.listener.onAnimationEnd(this.animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.listener.onAnimationCancel(this.animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.listener.onAnimationRepeat(this.animator);
        }
    }
}
