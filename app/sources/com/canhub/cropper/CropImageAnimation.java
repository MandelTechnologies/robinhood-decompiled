package com.canhub.cropper;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CropImageAnimation.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0001H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0001H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0001H\u0016J\u0016\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/canhub/cropper/CropImageAnimation;", "Landroid/view/animation/Animation;", "Landroid/view/animation/Animation$AnimationListener;", "imageView", "Landroid/widget/ImageView;", "cropOverlayView", "Lcom/canhub/cropper/CropOverlayView;", "(Landroid/widget/ImageView;Lcom/canhub/cropper/CropOverlayView;)V", "endBoundPoints", "", "endCropWindowRect", "Landroid/graphics/RectF;", "endImageMatrix", "startBoundPoints", "startCropWindowRect", "startImageMatrix", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "onAnimationEnd", "animation", "onAnimationRepeat", "onAnimationStart", "setEndState", "boundPoints", "imageMatrix", "Landroid/graphics/Matrix;", "setStartState", "cropper_release"}, m3637k = 1, m3638mv = {1, 7, 1}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class CropImageAnimation extends Animation implements Animation.AnimationListener {
    private final CropOverlayView cropOverlayView;
    private final float[] endBoundPoints;
    private final RectF endCropWindowRect;
    private final float[] endImageMatrix;
    private final ImageView imageView;
    private final float[] startBoundPoints;
    private final RectF startCropWindowRect;
    private final float[] startImageMatrix;

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public CropImageAnimation(ImageView imageView, CropOverlayView cropOverlayView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(cropOverlayView, "cropOverlayView");
        this.imageView = imageView;
        this.cropOverlayView = cropOverlayView;
        this.startBoundPoints = new float[8];
        this.endBoundPoints = new float[8];
        this.startCropWindowRect = new RectF();
        this.endCropWindowRect = new RectF();
        this.startImageMatrix = new float[9];
        this.endImageMatrix = new float[9];
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    public final void setStartState(float[] boundPoints, Matrix imageMatrix) {
        Intrinsics.checkNotNullParameter(boundPoints, "boundPoints");
        Intrinsics.checkNotNullParameter(imageMatrix, "imageMatrix");
        reset();
        System.arraycopy(boundPoints, 0, this.startBoundPoints, 0, 8);
        this.startCropWindowRect.set(this.cropOverlayView.getCropWindowRect());
        imageMatrix.getValues(this.startImageMatrix);
    }

    public final void setEndState(float[] boundPoints, Matrix imageMatrix) {
        Intrinsics.checkNotNullParameter(boundPoints, "boundPoints");
        Intrinsics.checkNotNullParameter(imageMatrix, "imageMatrix");
        System.arraycopy(boundPoints, 0, this.endBoundPoints, 0, 8);
        this.endCropWindowRect.set(this.cropOverlayView.getCropWindowRect());
        imageMatrix.getValues(this.endImageMatrix);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        Intrinsics.checkNotNullParameter(t, "t");
        RectF rectF = new RectF();
        RectF rectF2 = this.startCropWindowRect;
        float f = rectF2.left;
        RectF rectF3 = this.endCropWindowRect;
        rectF.left = f + ((rectF3.left - f) * interpolatedTime);
        float f2 = rectF2.top;
        rectF.top = f2 + ((rectF3.top - f2) * interpolatedTime);
        float f3 = rectF2.right;
        rectF.right = f3 + ((rectF3.right - f3) * interpolatedTime);
        float f4 = rectF2.bottom;
        rectF.bottom = f4 + ((rectF3.bottom - f4) * interpolatedTime);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            float f5 = this.startBoundPoints[i];
            fArr[i] = f5 + ((this.endBoundPoints[i] - f5) * interpolatedTime);
        }
        CropOverlayView cropOverlayView = this.cropOverlayView;
        cropOverlayView.setCropWindowRect(rectF);
        cropOverlayView.setBounds(fArr, this.imageView.getWidth(), this.imageView.getHeight());
        cropOverlayView.invalidate();
        float[] fArr2 = new float[9];
        for (int i2 = 0; i2 < 9; i2++) {
            float f6 = this.startImageMatrix[i2];
            fArr2[i2] = f6 + ((this.endImageMatrix[i2] - f6) * interpolatedTime);
        }
        ImageView imageView = this.imageView;
        imageView.getImageMatrix().setValues(fArr2);
        imageView.invalidate();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.imageView.clearAnimation();
    }
}
