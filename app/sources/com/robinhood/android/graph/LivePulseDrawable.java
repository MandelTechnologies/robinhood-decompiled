package com.robinhood.android.graph;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: LivePulseDrawable.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u000fH\u0016J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u000fH\u0016J\u0012\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0012\u0010(\u001a\u00020\u001b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\rH\u0016J\u0010\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020.H\u0014J\u0010\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\tH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/graph/LivePulseDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "centerX", "", "centerY", "radius", "animating", "", "value", "", "animationColor", "getAnimationColor", "()I", "setAnimationColor", "(I)V", "staticColor", "getStaticColor", "setStaticColor", "paint", "Landroid/graphics/Paint;", "updatePaintColor", "", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "draw", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "setTintList", "tint", "Landroid/content/res/ColorStateList;", "isStateful", "onStateChange", "state", "", "getAnimationAlpha", "ratio", "Companion", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class LivePulseDrawable extends Drawable {
    private static final long ANIMATION_DURATION = 1600;
    private static final int MAX_ALPHA = 255;
    private static final int MIN_ALPHA = 51;
    private boolean animating;
    private int animationColor;
    private float centerX;
    private float centerY;
    private final Context context;
    private final Paint paint;
    private float radius;
    private int staticColor;
    public static final int $stable = 8;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public LivePulseDrawable(Context context) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C18339R.dimen.pulse_drawable_diameter);
        setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        setAnimationColor(context.getColor(C11048R.color.rh_white_1));
        setStaticColor(ThemeColors.getThemeColor(context, C20690R.attr.colorPrimary));
    }

    public final Context getContext() {
        return this.context;
    }

    public final int getAnimationColor() {
        return this.animationColor;
    }

    public final void setAnimationColor(int i) {
        this.animationColor = i;
        updatePaintColor();
    }

    public final int getStaticColor() {
        return this.staticColor;
    }

    public final void setStaticColor(int i) {
        this.staticColor = i;
        updatePaintColor();
    }

    private final void updatePaintColor() {
        this.paint.setColor(this.animating ? this.animationColor : this.staticColor);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.centerX = bounds.centerX();
        this.centerY = bounds.centerY();
        this.radius = Math.min(bounds.width(), bounds.height());
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.paint.setAlpha(getAnimationAlpha((SystemClock.elapsedRealtime() % ANIMATION_DURATION) / 1600.0f));
        canvas.drawCircle(this.centerX, this.centerY, this.radius, this.paint);
        if (this.animating) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        super.setTintList(tint);
        setStaticColor(tint != null ? tint.getDefaultColor() : this.animationColor);
        updatePaintColor();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.animating = ArraysKt.contains(state, android.R.attr.state_checked);
        updatePaintColor();
        invalidateSelf();
        return true;
    }

    private final int getAnimationAlpha(float ratio) {
        int i;
        float fCoerceIn = RangesKt.coerceIn(ratio, 0.0f, 1.0f);
        if (fCoerceIn <= 0.5f) {
            i = (int) (204 * (1.0f - (ratio / 0.5f)));
        } else {
            if (fCoerceIn > 1.0f) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(Float.valueOf(ratio));
                throw new ExceptionsH();
            }
            i = (int) (204 * ((ratio - 0.5f) / 0.5f));
        }
        return 255 - i;
    }
}
