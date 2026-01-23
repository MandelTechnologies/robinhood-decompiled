package com.robinhood.android.graph.spark;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScrubGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/ScrubGestureDetector;", "Landroid/view/View$OnTouchListener;", "scrubListener", "Lcom/robinhood/android/graph/spark/ScrubGestureDetector$ScrubListener;", "handler", "Landroid/os/Handler;", "touchSlop", "", "<init>", "(Lcom/robinhood/android/graph/spark/ScrubGestureDetector$ScrubListener;Landroid/os/Handler;F)V", "enabled", "", "downX", "downY", "longPressRunnable", "Ljava/lang/Runnable;", "setEnabled", "", "onTouch", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "ScrubListener", "Companion", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ScrubGestureDetector implements View.OnTouchListener {
    public static final long LONG_PRESS_TIMEOUT_MS = 250;
    private float downX;
    private float downY;
    private boolean enabled;
    private final Handler handler;
    private final Runnable longPressRunnable;
    private final ScrubListener scrubListener;
    private final float touchSlop;
    public static final int $stable = 8;

    /* compiled from: ScrubGestureDetector.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/ScrubGestureDetector$ScrubListener;", "", "onScrubbed", "", "x", "", "y", "onScrubEnded", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public interface ScrubListener {
        void onScrubEnded();

        void onScrubbed(float x, float y);
    }

    public ScrubGestureDetector(ScrubListener scrubListener, Handler handler, float f) {
        Intrinsics.checkNotNullParameter(scrubListener, "scrubListener");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.scrubListener = scrubListener;
        this.handler = handler;
        this.touchSlop = f;
        this.longPressRunnable = new Runnable() { // from class: com.robinhood.android.graph.spark.ScrubGestureDetector$longPressRunnable$1
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
        return true;
    }
}
