package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoundedImageView.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0014J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0014J\u000e\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020\u000bJ&\u0010)\u001a\u00020!2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bJ\b\u0010/\u001a\u00020!H\u0002R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R$\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R$\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/common/ui/RoundedImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "topLeftRadius", "getTopLeftRadius", "()F", "setTopLeftRadius", "(F)V", "topRightRadius", "getTopRightRadius", "setTopRightRadius", "bottomLeftRadius", "getBottomLeftRadius", "setBottomLeftRadius", "bottomRightRadius", "getBottomRightRadius", "setBottomRightRadius", "maskPath", "Landroid/graphics/Path;", "maskPaint", "Landroid/graphics/Paint;", "dirtyMaskPath", "", "onSizeChanged", "", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setRadius", "radius", "topLeft", "topRight", "bottomLeft", "bottomRight", "updatePath", "lib-common-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RoundedImageView extends AppCompatImageView {
    public static final int $stable = 8;
    private float bottomLeftRadius;
    private float bottomRightRadius;
    private boolean dirtyMaskPath;
    private final Paint maskPaint;
    private final Path maskPath;
    private float topLeftRadius;
    private float topRightRadius;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundedImageView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoundedImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.maskPath = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.maskPaint = paint;
        this.dirtyMaskPath = true;
        setLayerType(2, null);
    }

    public final float getTopLeftRadius() {
        return this.topLeftRadius;
    }

    public final void setTopLeftRadius(float f) {
        this.topLeftRadius = f;
        this.dirtyMaskPath = true;
        invalidate();
    }

    public final float getTopRightRadius() {
        return this.topRightRadius;
    }

    public final void setTopRightRadius(float f) {
        this.topRightRadius = f;
        this.dirtyMaskPath = true;
        invalidate();
    }

    public final float getBottomLeftRadius() {
        return this.bottomLeftRadius;
    }

    public final void setBottomLeftRadius(float f) {
        this.bottomLeftRadius = f;
        this.dirtyMaskPath = true;
        invalidate();
    }

    public final float getBottomRightRadius() {
        return this.bottomRightRadius;
    }

    public final void setBottomRightRadius(float f) {
        this.bottomRightRadius = f;
        this.dirtyMaskPath = true;
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.dirtyMaskPath = true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.dirtyMaskPath) {
            this.dirtyMaskPath = false;
            updatePath();
        }
        super.onDraw(canvas);
        canvas.drawPath(this.maskPath, this.maskPaint);
    }

    public final void setRadius(float radius) {
        setTopLeftRadius(radius);
        setTopRightRadius(radius);
        setBottomLeftRadius(radius);
        setBottomRightRadius(radius);
    }

    public final void setRadius(float topLeft, float topRight, float bottomLeft, float bottomRight) {
        setTopLeftRadius(topLeft);
        setTopRightRadius(topRight);
        setBottomLeftRadius(bottomLeft);
        setBottomRightRadius(bottomRight);
    }

    private final void updatePath() {
        this.maskPath.rewind();
        Path path = this.maskPath;
        float width = getWidth();
        float height = getHeight();
        float f = this.topLeftRadius;
        float f2 = this.topRightRadius;
        float f3 = this.bottomRightRadius;
        float f4 = this.bottomLeftRadius;
        path.addRoundRect(0.0f, 0.0f, width, height, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
        this.maskPath.toggleInverseFillType();
    }
}
