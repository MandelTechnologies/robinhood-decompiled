package com.withpersona.sdk2.inquiry.governmentid.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.R$attr;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScanningView.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u0000 H2\u00020\u0001:\u0001HB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J/\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u0010R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020,8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00102\u001a\u00020,2\u0006\u0010-\u001a\u00020,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010/\u001a\u0004\b3\u00104\"\u0004\b5\u00101R*\u00107\u001a\u0002062\u0006\u0010-\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b7\u00109\"\u0004\b:\u0010;R*\u0010<\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00138\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010B\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00138\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?\"\u0004\bD\u0010AR$\u0010G\u001a\u00020,2\u0006\u0010-\u001a\u00020,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u00104\"\u0004\bF\u00101¨\u0006I"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/view/ScanningView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Path;", "generatePath", "()Landroid/graphics/Path;", "Landroid/graphics/SweepGradient;", "generateGradient", "()Landroid/graphics/SweepGradient;", "", "updateGradient", "()V", "updatePath", "updateMatrix", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "Landroid/graphics/Matrix;", "gradientMatrix", "Landroid/graphics/Matrix;", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "gradient", "Landroid/graphics/SweepGradient;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "", "value", "animationRotation", "F", "setAnimationRotation", "(F)V", "cornerRadius", "getCornerRadius", "()F", "setCornerRadius", "", "isScanningAnimationEnabled", "Z", "()Z", "setScanningAnimationEnabled", "(Z)V", "highlightColor", "I", "getHighlightColor", "()I", "setHighlightColor", "(I)V", "borderColor", "getBorderColor", "setBorderColor", "getStrokeWidth", "setStrokeWidth", "strokeWidth", "Companion", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ScanningView extends View {
    private float animationRotation;
    private final ValueAnimator animator;
    private int borderColor;
    private float cornerRadius;
    private SweepGradient gradient;
    private final Matrix gradientMatrix;
    private int highlightColor;
    private boolean isScanningAnimationEnabled;
    private final Paint paint;
    private Path path;

    private final void setAnimationRotation(float f) {
        if (this.animationRotation == f) {
            return;
        }
        this.animationRotation = f;
        updateMatrix();
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final void setCornerRadius(float f) {
        if (this.cornerRadius == f) {
            return;
        }
        this.cornerRadius = f;
        updatePath();
    }

    public final void setScanningAnimationEnabled(boolean z) {
        if (this.isScanningAnimationEnabled == z) {
            return;
        }
        this.isScanningAnimationEnabled = z;
        updateGradient();
    }

    public final int getHighlightColor() {
        return this.highlightColor;
    }

    public final void setHighlightColor(int i) {
        if (this.highlightColor == i) {
            return;
        }
        this.highlightColor = i;
        updateGradient();
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final void setBorderColor(int i) {
        if (this.borderColor == i) {
            return;
        }
        this.borderColor = i;
        updateGradient();
    }

    public final float getStrokeWidth() {
        return this.paint.getStrokeWidth();
    }

    public final void setStrokeWidth(float f) {
        if (this.paint.getStrokeWidth() == f) {
            return;
        }
        this.paint.setStrokeWidth(f);
        invalidate();
    }

    public ScanningView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gradientMatrix = new Matrix();
        this.cornerRadius = (float) ExtensionsKt.getDpToPx(8.0d);
        this.isScanningAnimationEnabled = true;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.highlightColor = ResTools.getColorFromAttr$default(context2, R$attr.colorPrimary, null, false, 6, null);
        this.borderColor = -1;
        this.gradient = generateGradient();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) ExtensionsKt.getDpToPx(3.0d));
        paint.setShader(this.gradient);
        this.paint = paint;
        this.path = generatePath();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(4000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.view.ScanningView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ScanningView.$r8$lambda$eSCIYGun8qb3KF0R7SE_0OtQgOI(this.f$0, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.start();
        this.animator = valueAnimatorOfFloat;
    }

    public static void $r8$lambda$eSCIYGun8qb3KF0R7SE_0OtQgOI(ScanningView scanningView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        scanningView.setAnimationRotation(it.getAnimatedFraction() * 360.0f);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updatePath();
        updateMatrix();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.path, this.paint);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.animator.cancel();
    }

    private final Path generatePath() {
        Path path = new Path();
        float strokeWidth = this.paint.getStrokeWidth();
        float f = strokeWidth / 2.0f;
        if (getMeasuredWidth() > strokeWidth && getMeasuredHeight() > strokeWidth) {
            float f2 = this.cornerRadius;
            path.addRoundRect(f, f, getMeasuredWidth() - f, getMeasuredHeight() - f, new float[]{f2, f2, f2, f2, f2, f2, f2, f2}, Path.Direction.CW);
        }
        return path;
    }

    private final SweepGradient generateGradient() {
        int[] iArr;
        if (this.isScanningAnimationEnabled) {
            int i = this.borderColor;
            iArr = new int[]{i, i, this.highlightColor};
        } else {
            int i2 = this.borderColor;
            iArr = new int[]{i2, i2, i2};
        }
        return new SweepGradient(0.5f, 0.5f, iArr, new float[]{0.0f, 0.5f, 1.0f});
    }

    private final void updateGradient() {
        SweepGradient sweepGradientGenerateGradient = generateGradient();
        this.gradient = sweepGradientGenerateGradient;
        this.paint.setShader(sweepGradientGenerateGradient);
        updateMatrix();
        invalidate();
    }

    private final void updatePath() {
        this.path = generatePath();
        invalidate();
    }

    private final void updateMatrix() {
        int iMax = Integer.max(getMeasuredWidth(), getMeasuredHeight());
        this.gradientMatrix.setRotate(this.animationRotation, 0.5f, 0.5f);
        float f = iMax;
        this.gradientMatrix.postScale(f, f);
        this.gradientMatrix.postTranslate((r0 - iMax) / 2.0f, (r1 - iMax) / 2.0f);
        this.gradient.setLocalMatrix(this.gradientMatrix);
        invalidate();
    }
}
