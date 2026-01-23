package com.robinhood.shared.trade.crypto.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.robinhood.shared.trade.crypto.C40095R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: PerspectiveTranslateLayout.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0017\u0018\u0000 12\u00020\u0001:\u00011B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J0\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001aH\u0014J \u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R&\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0012\u001a\u00020\u001a8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00062"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/views/PerspectiveTranslateLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "matrixValues", "", "perspectiveMatrix", "Landroid/graphics/Matrix;", "perspectiveInterpolator", "Landroid/view/animation/DecelerateInterpolator;", "translationInterpolator", "Landroid/view/animation/LinearInterpolator;", "targetSize", "Landroid/graphics/PointF;", "value", "", "ratio", "getRatio", "()F", "setRatio", "(F)V", "_target", "", "target", "getTarget", "()I", "setTarget", "(I)V", "findTarget", "", "recompute", "onLayout", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "", "left", "top", "right", "bottom", "drawChild", "canvas", "Landroid/graphics/Canvas;", "child", "Landroid/view/View;", "drawingTime", "", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public class PerspectiveTranslateLayout extends ConstraintLayout {
    public static final float PERSPECTIVE_MAX = 0.9f;
    public static final float PERSPECTIVE_STOP = 0.5f;
    public static final float TRANSLATION_START = 0.0f;
    private int _target;
    private final float[] matrixValues;
    private final DecelerateInterpolator perspectiveInterpolator;
    private final Matrix perspectiveMatrix;
    private float ratio;
    private final PointF targetSize;
    private final LinearInterpolator translationInterpolator;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerspectiveTranslateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.matrixValues = new float[9];
        this.perspectiveMatrix = new Matrix();
        this.perspectiveInterpolator = new DecelerateInterpolator();
        this.translationInterpolator = new LinearInterpolator();
        this.targetSize = new PointF();
        setClipChildren(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C40095R.styleable.PerspectiveTranslateLayout);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this._target = typedArrayObtainStyledAttributes.getResourceId(C40095R.styleable.PerspectiveTranslateLayout_transformTarget, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final void setRatio(float f) {
        this.ratio = RangesKt.coerceIn(f, 0.0f, 1.0f);
        recompute();
    }

    /* renamed from: getTarget, reason: from getter */
    public final int get_target() {
        return this._target;
    }

    public final void setTarget(int i) {
        this._target = i;
        findTarget();
    }

    private final void findTarget() {
        View viewFindViewById = findViewById(this._target);
        PointF pointF = this.targetSize;
        if (viewFindViewById != null) {
            pointF.x = viewFindViewById.getWidth();
            pointF.y = viewFindViewById.getHeight();
        } else {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
        }
    }

    private final void recompute() {
        PointF pointF = this.targetSize;
        float f = pointF.x;
        float f2 = pointF.y;
        if (f == 0.0f || f2 == 0.0f) {
            this.perspectiveMatrix.reset();
            return;
        }
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        float interpolation = this.perspectiveInterpolator.getInterpolation(1.0f - (RangesKt.coerceAtLeast(0.5f - this.ratio, 0.0f) / 0.5f)) * 0.9f;
        Matrix matrix = this.perspectiveMatrix;
        matrix.reset();
        matrix.preTranslate(0.0f, f4);
        float[] fArr = this.matrixValues;
        matrix.getValues(fArr);
        fArr[7] = interpolation / f;
        matrix.setValues(fArr);
        matrix.preSkew(interpolation * 0.5f, 0.0f);
        matrix.postScale(1.0f, -1.0f, f3, f4);
        matrix.preScale(1.0f, -1.0f, f3, f4);
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        findTarget();
        recompute();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long drawingTime) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        PointF pointF = this.targetSize;
        float f = pointF.x;
        float f2 = pointF.y;
        if (child.getId() != get_target() || f == 0.0f || f2 == 0.0f) {
            return super.drawChild(canvas, child, drawingTime);
        }
        canvas.save();
        canvas.translate(child.getX(), child.getY());
        canvas.concat(this.perspectiveMatrix);
        canvas.translate(-child.getX(), -child.getY());
        canvas.translate(0.0f, f2 / 2.0f);
        canvas.translate(0.0f, (-this.translationInterpolator.getInterpolation(RangesKt.coerceAtLeast(this.ratio - 0.0f, 0.0f) / 1.0f)) * f2);
        boolean zDrawChild = super.drawChild(canvas, child, drawingTime);
        canvas.restore();
        return zDrawChild;
    }
}
