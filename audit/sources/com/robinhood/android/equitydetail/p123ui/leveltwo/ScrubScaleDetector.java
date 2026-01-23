package com.robinhood.android.equitydetail.p123ui.leveltwo;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import com.robinhood.android.common.view.ScrubGestureDetector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScrubScaleDetector.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016R\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/ScrubScaleDetector;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "Lcom/robinhood/android/common/view/ScrubGestureDetector$ScrubListener;", "context", "Landroid/content/Context;", "scaleListener", "scrubListener", "<init>", "(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;Lcom/robinhood/android/common/view/ScrubGestureDetector$ScrubListener;)V", "getScaleListener", "()Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "getScrubListener", "()Lcom/robinhood/android/common/view/ScrubGestureDetector$ScrubListener;", "scaleGestureDector", "Landroid/view/ScaleGestureDetector;", "scrubGestureDetector", "Lcom/robinhood/android/common/view/ScrubGestureDetector;", "scrubbing", "", "scaling", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "onScaleBegin", "detector", "onScale", "onScaleEnd", "", "onScrubbed", "x", "", "y", "onScrubEnded", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ScrubScaleDetector implements ScaleGestureDetector.OnScaleGestureListener, ScrubGestureDetector.ScrubListener {
    public static final int $stable = 8;
    private final ScaleGestureDetector scaleGestureDector;
    private final ScaleGestureDetector.OnScaleGestureListener scaleListener;
    private boolean scaling;
    private final ScrubGestureDetector scrubGestureDetector;
    private final ScrubGestureDetector.ScrubListener scrubListener;
    private boolean scrubbing;

    public ScrubScaleDetector(Context context, ScaleGestureDetector.OnScaleGestureListener scaleListener, ScrubGestureDetector.ScrubListener scrubListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scaleListener, "scaleListener");
        Intrinsics.checkNotNullParameter(scrubListener, "scrubListener");
        this.scaleListener = scaleListener;
        this.scrubListener = scrubListener;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.scaleGestureDector = scaleGestureDetector;
        this.scrubGestureDetector = new ScrubGestureDetector(this, new Handler(), ViewConfiguration.get(context).getScaledTouchSlop());
    }

    @Override // com.robinhood.android.common.view.ScrubGestureDetector.ScrubListener
    public void onScrubStarted() {
        ScrubGestureDetector.ScrubListener.DefaultImpls.onScrubStarted(this);
    }

    public final ScaleGestureDetector.OnScaleGestureListener getScaleListener() {
        return this.scaleListener;
    }

    public final ScrubGestureDetector.ScrubListener getScrubListener() {
        return this.scrubListener;
    }

    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.scaleGestureDector.onTouchEvent(event);
        if (this.scrubbing && this.scaling) {
            MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            ScrubGestureDetector scrubGestureDetector = this.scrubGestureDetector;
            Intrinsics.checkNotNull(motionEventObtain);
            scrubGestureDetector.onTouch(motionEventObtain);
        } else if (event.getPointerCount() == 1) {
            this.scrubGestureDetector.onTouch(event);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.scaleListener.onScaleBegin(detector);
        this.scaling = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.scaleListener.onScale(detector);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.scaleListener.onScaleEnd(detector);
        this.scaling = false;
    }

    @Override // com.robinhood.android.common.view.ScrubGestureDetector.ScrubListener
    public void onScrubbed(float x, float y) {
        if (this.scaling) {
            return;
        }
        this.scrubListener.onScrubbed(x, y);
        this.scrubbing = true;
    }

    @Override // com.robinhood.android.common.view.ScrubGestureDetector.ScrubListener
    public void onScrubEnded() {
        this.scrubListener.onScrubEnded();
        this.scrubbing = false;
    }
}
