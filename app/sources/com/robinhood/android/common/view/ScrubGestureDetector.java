package com.robinhood.android.common.view;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScrubGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/view/ScrubGestureDetector;", "Landroid/view/View$OnTouchListener;", "scrubListener", "Lcom/robinhood/android/common/view/ScrubGestureDetector$ScrubListener;", "handler", "Landroid/os/Handler;", "touchSlop", "", "<init>", "(Lcom/robinhood/android/common/view/ScrubGestureDetector$ScrubListener;Landroid/os/Handler;F)V", "enabled", "", "started", "downX", "downY", "longPressRunnable", "Ljava/lang/Runnable;", "setEnabled", "", "onTouch", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "ScrubListener", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ScrubGestureDetector implements View.OnTouchListener {
    public static final long LONG_PRESS_TIMEOUT_MS = 250;
    private float downX;
    private float downY;
    private boolean enabled;
    private final Handler handler;
    private final Runnable longPressRunnable;
    private final ScrubListener scrubListener;
    private boolean started;
    private final float touchSlop;
    public static final int $stable = 8;

    /* compiled from: ScrubGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/view/ScrubGestureDetector$ScrubListener;", "", "onScrubStarted", "", "onScrubbed", "x", "", "y", "onScrubEnded", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public interface ScrubListener {

        /* compiled from: ScrubGestureDetector.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes2.dex */
        public static final class DefaultImpls {
            public static void onScrubStarted(ScrubListener scrubListener) {
            }
        }

        void onScrubEnded();

        void onScrubStarted();

        void onScrubbed(float x, float y);
    }

    public ScrubGestureDetector(ScrubListener scrubListener, Handler handler, float f) {
        Intrinsics.checkNotNullParameter(scrubListener, "scrubListener");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.scrubListener = scrubListener;
        this.handler = handler;
        this.touchSlop = f;
        this.enabled = true;
        this.longPressRunnable = new Runnable() { // from class: com.robinhood.android.common.view.ScrubGestureDetector$longPressRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.scrubListener.onScrubbed(this.this$0.downX, this.this$0.downY);
            }
        };
    }

    public final void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View v, MotionEvent event) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        return onTouch(event);
    }

    public final boolean onTouch(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.enabled) {
            return false;
        }
        float x = event.getX();
        float y = event.getY();
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.downX = x;
            this.downY = y;
            this.handler.postDelayed(this.longPressRunnable, 250L);
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (event.getEventTime() - event.getDownTime() >= 250.0f) {
                    if (!this.started) {
                        this.scrubListener.onScrubStarted();
                        this.started = true;
                    }
                    this.handler.removeCallbacks(this.longPressRunnable);
                    this.scrubListener.onScrubbed(x, y);
                } else {
                    float f = x - this.downX;
                    float f2 = y - this.downY;
                    float f3 = this.touchSlop;
                    if (f >= f3 || f2 >= f3) {
                        this.handler.removeCallbacks(this.longPressRunnable);
                        return false;
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        this.handler.removeCallbacks(this.longPressRunnable);
        this.scrubListener.onScrubEnded();
        this.started = false;
        return true;
    }
}
