package com.robinhood.shared.cards;

import android.R;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SwipeDismissTouchListener.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001)B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cH\u0002J\b\u0010'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020%H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/cards/SwipeDismissTouchListener;", "Landroid/view/View$OnTouchListener;", "view", "Landroid/view/View;", "token", "", "callbacks", "Lcom/robinhood/shared/cards/SwipeDismissTouchListener$DismissCallbacks;", "<init>", "(Landroid/view/View;Ljava/lang/Object;Lcom/robinhood/shared/cards/SwipeDismissTouchListener$DismissCallbacks;)V", "mSlop", "", "mMinFlingVelocity", "mMaxFlingVelocity", "mAnimationTime", "", "mView", "getMView", "()Landroid/view/View;", "mToken", "getMToken", "()Ljava/lang/Object;", "mCallbacks", "mViewWidth", "mDownX", "", "mDownY", "mSwiping", "", "mSwipingSlop", "mVelocityTracker", "Landroid/view/VelocityTracker;", "mTranslationX", "onTouch", "motionEvent", "Landroid/view/MotionEvent;", "dismiss", "", "dismissRight", "cancel", "resetState", "DismissCallbacks", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public class SwipeDismissTouchListener implements View.OnTouchListener {
    public static final int $stable = 8;
    private final long mAnimationTime;
    private final DismissCallbacks mCallbacks;
    private float mDownX;
    private float mDownY;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int mSlop;
    private boolean mSwiping;
    private int mSwipingSlop;
    private final Object mToken;
    private float mTranslationX;
    private VelocityTracker mVelocityTracker;
    private final View mView;
    private int mViewWidth;

    /* compiled from: SwipeDismissTouchListener.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0001H&J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/cards/SwipeDismissTouchListener$DismissCallbacks;", "", "canDismiss", "", "token", "onTouchInitiated", "", "onAnimationStep", "fraction", "", "onCanceled", "view", "Landroid/view/View;", "onDismissing", "onDismissed", "shouldLogEvent", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface DismissCallbacks {
        boolean canDismiss(Object token);

        void onAnimationStep(float fraction);

        void onCanceled(View view, Object token);

        void onDismissed(View view, Object token, boolean shouldLogEvent);

        void onDismissing(View view, Object token);

        void onTouchInitiated();
    }

    public SwipeDismissTouchListener(View view, Object token, DismissCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.mViewWidth = 1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.mSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mAnimationTime = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.mView = view;
        this.mToken = token;
        this.mCallbacks = callbacks;
    }

    protected final View getMView() {
        return this.mView;
    }

    protected final Object getMToken() {
        return this.mToken;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        motionEvent.offsetLocation(this.mTranslationX, 0.0f);
        if (this.mViewWidth < 2) {
            this.mViewWidth = this.mView.getWidth();
        }
        this.mView.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mDownX = motionEvent.getRawX();
            this.mDownY = motionEvent.getRawY();
            if (this.mCallbacks.canDismiss(this.mToken)) {
                this.mCallbacks.onTouchInitiated();
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                velocityTrackerObtain.addMovement(motionEvent);
                this.mVelocityTracker = velocityTrackerObtain;
            }
            return true;
        }
        if (actionMasked == 1) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                float rawX = motionEvent.getRawX() - this.mDownX;
                velocityTracker.addMovement(motionEvent);
                velocityTracker.computeCurrentVelocity(1000);
                float xVelocity = velocityTracker.getXVelocity();
                float fAbs = (float) Math.abs(xVelocity);
                float fAbs2 = (float) Math.abs(velocityTracker.getYVelocity());
                if (Math.abs(rawX) > this.mViewWidth / 2 && this.mSwiping) {
                    z = rawX > 0.0f;
                } else if (this.mMinFlingVelocity > fAbs || fAbs > this.mMaxFlingVelocity || fAbs2 >= fAbs || !this.mSwiping) {
                    z = false;
                    z = false;
                } else {
                    boolean z2 = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX > 0.0f ? 1 : (rawX == 0.0f ? 0 : -1)) < 0);
                    z = velocityTracker.getXVelocity() > 0.0f;
                    z = z2;
                }
                if (z) {
                    dismiss(z);
                } else if (this.mSwiping) {
                    cancel();
                }
                resetState();
            }
        } else if (actionMasked != 2) {
            if (actionMasked == 3 && this.mVelocityTracker != null) {
                cancel();
                resetState();
            }
        } else {
            VelocityTracker velocityTracker2 = this.mVelocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                float rawX2 = motionEvent.getRawX() - this.mDownX;
                float rawY = motionEvent.getRawY() - this.mDownY;
                if (!this.mSwiping) {
                    double d = rawX2;
                    if (Math.abs(d) > this.mSlop && Math.abs(rawY) <= Math.abs(d)) {
                        this.mSwiping = true;
                        this.mSwipingSlop = rawX2 > 0.0f ? this.mSlop : -this.mSlop;
                        this.mView.getParent().requestDisallowInterceptTouchEvent(true);
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                        this.mView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                }
                float f = rawX2 - this.mSwipingSlop;
                if (this.mSwiping) {
                    float fAbs3 = (float) Math.abs(f / this.mViewWidth);
                    this.mTranslationX = f;
                    this.mView.setTranslationX(f);
                    this.mCallbacks.onAnimationStep(fAbs3);
                    return true;
                }
            }
        }
        return false;
    }

    private final void dismiss(boolean dismissRight) {
        this.mCallbacks.onDismissing(this.mView, this.mToken);
        this.mView.animate().translationX(dismissRight ? this.mViewWidth : -this.mViewWidth).setDuration(this.mAnimationTime).withEndAction(new Runnable() { // from class: com.robinhood.shared.cards.SwipeDismissTouchListener.dismiss.1
            @Override // java.lang.Runnable
            public final void run() {
                SwipeDismissTouchListener.this.mCallbacks.onDismissed(SwipeDismissTouchListener.this.getMView(), SwipeDismissTouchListener.this.getMToken(), true);
            }
        });
    }

    private final void cancel() {
        this.mCallbacks.onCanceled(this.mView, this.mToken);
        this.mView.animate().translationX(0.0f).setDuration(this.mAnimationTime);
    }

    private final void resetState() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.mVelocityTracker = null;
        this.mDownX = 0.0f;
        this.mDownY = 0.0f;
        this.mSwiping = false;
        this.mSwipingSlop = 0;
        this.mTranslationX = 0.0f;
    }
}
