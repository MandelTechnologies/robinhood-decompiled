package com.withpersona.sdk2.camera.camera2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Camera2PreviewView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010*\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "newSurfaceView", "()V", "", "w", "h", "orientationDegrees", "setCameraPreviewSize", "(III)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "previewW", "I", "previewH", "Landroid/view/SurfaceView;", "surfaceView", "Landroid/view/SurfaceView;", "getSurfaceView", "()Landroid/view/SurfaceView;", "setSurfaceView", "(Landroid/view/SurfaceView;)V", "Landroid/view/SurfaceHolder;", "getHolder", "()Landroid/view/SurfaceHolder;", "holder", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class Camera2PreviewView extends ViewGroup {
    private int previewH;
    private int previewW;
    private SurfaceView surfaceView;

    public final SurfaceView getSurfaceView() {
        return this.surfaceView;
    }

    public final void setSurfaceView(SurfaceView surfaceView) {
        Intrinsics.checkNotNullParameter(surfaceView, "<set-?>");
        this.surfaceView = surfaceView;
    }

    public final SurfaceHolder getHolder() {
        SurfaceHolder holder = this.surfaceView.getHolder();
        Intrinsics.checkNotNullExpressionValue(holder, "getHolder(...)");
        return holder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.surfaceView = surfaceView;
        addView(surfaceView);
    }

    public final void newSurfaceView() {
        removeAllViews();
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.surfaceView = surfaceView;
        addView(surfaceView);
        requestLayout();
    }

    public final void setCameraPreviewSize(int w, int h, int orientationDegrees) {
        if (orientationDegrees == 90 || orientationDegrees == 270) {
            this.previewW = h;
            this.previewH = w;
        } else {
            this.previewW = w;
            this.previewH = h;
        }
        getHolder().setFixedSize(w, h);
        requestLayout();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSize(Integer.MAX_VALUE, widthMeasureSpec), View.resolveSize(Integer.MAX_VALUE, heightMeasureSpec));
        this.surfaceView.measure(View.MeasureSpec.makeMeasureSpec(this.previewW, 1073741824), View.MeasureSpec.makeMeasureSpec(this.previewH, 1073741824));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.previewW == 0 || this.previewH == 0) {
            this.surfaceView.layout(left, top, right, bottom);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        double dMax = Double.max(measuredWidth / this.previewW, measuredHeight / this.previewH);
        int iCeil = (int) Math.ceil(this.previewW * dMax);
        int iCeil2 = (int) Math.ceil(dMax * this.previewH);
        int iCoerceAtLeast = (RangesKt.coerceAtLeast(iCeil - measuredWidth, 0) / 2) * (-1);
        int iCoerceAtLeast2 = (RangesKt.coerceAtLeast(iCeil2 - measuredHeight, 0) / 2) * (-1);
        this.surfaceView.layout(iCoerceAtLeast, iCoerceAtLeast2, iCeil + iCoerceAtLeast, iCeil2 + iCoerceAtLeast2);
    }
}
