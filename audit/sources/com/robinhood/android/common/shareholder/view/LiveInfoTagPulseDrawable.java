package com.robinhood.android.common.shareholder.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.shareholder.C11820R;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: LiveInfoTagPulseDrawable.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\nH\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\nH\u0016J\u0012\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0010H\u0016J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020(H\u0014J\u0010\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0007H\u0002J\b\u0010+\u001a\u00020\nH\u0016J\b\u0010,\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/common/shareholder/view/LiveInfoTagPulseDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "centerX", "", "centerY", "maxAlpha", "", "rectDiameter", "innerDiameter", "animationColor", "staticColor", "shouldAnimate", "", "getShouldAnimate", "()Z", "setShouldAnimate", "(Z)V", "outerCirclePaint", "Landroid/graphics/Paint;", "innerCirclePaint", "onBoundsChange", "", "bounds", "Landroid/graphics/Rect;", "draw", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "isStateful", "onStateChange", "state", "", "getAnimationAlpha", "ratio", "getIntrinsicWidth", "getIntrinsicHeight", "Companion", "feature-lib-shareholderx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class LiveInfoTagPulseDrawable extends Drawable {
    private static final long ANIMATION_DURATION = 1500;
    private static final int MAX_ALPHA = 62;
    private static final int MIN_ALPHA = 1;
    private int animationColor;
    private float centerX;
    private float centerY;
    private final Context context;
    private final Paint innerCirclePaint;
    private int innerDiameter;
    private int maxAlpha;
    private final Paint outerCirclePaint;
    private int rectDiameter;
    private boolean shouldAnimate;
    private int staticColor;

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

    public LiveInfoTagPulseDrawable(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.maxAlpha = 62;
        this.rectDiameter = context.getResources().getDimensionPixelSize(C11820R.dimen.live_infotag_pulse_outer_diameter);
        this.innerDiameter = context.getResources().getDimensionPixelSize(C11820R.dimen.live_infotag_pulse_inner_diameter);
        this.animationColor = ThemeColors.getThemeColor(context, C20690R.attr.colorPositive);
        this.staticColor = context.getColor(C11048R.color.rh_white_1);
        this.shouldAnimate = true;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.animationColor);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.outerCirclePaint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(this.staticColor);
        paint2.setStyle(style);
        this.innerCirclePaint = paint2;
        int i = this.rectDiameter;
        setBounds(0, 0, i, i);
    }

    public final boolean getShouldAnimate() {
        return this.shouldAnimate;
    }

    public final void setShouldAnimate(boolean z) {
        this.shouldAnimate = z;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.centerX = bounds.centerX();
        this.centerY = bounds.centerY();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float fElapsedRealtime = (SystemClock.elapsedRealtime() % 1500) / 1500.0f;
        this.outerCirclePaint.setAlpha(getAnimationAlpha(fElapsedRealtime));
        if (this.shouldAnimate) {
            canvas.drawCircle(this.centerX, this.centerY, this.rectDiameter * fElapsedRealtime, this.outerCirclePaint);
        }
        canvas.drawCircle(this.centerX, this.centerY, this.innerDiameter, this.innerCirclePaint);
        if (this.shouldAnimate) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.outerCirclePaint.setAlpha(alpha);
        this.innerCirclePaint.setAlpha(alpha);
        this.maxAlpha = alpha;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] state) {
        Intrinsics.checkNotNullParameter(state, "state");
        invalidateSelf();
        return true;
    }

    private final int getAnimationAlpha(float ratio) {
        int i;
        float fCoerceIn = RangesKt.coerceIn(ratio, 0.0f, 1.0f);
        int i2 = this.maxAlpha;
        int i3 = i2 - 1;
        if (fCoerceIn <= 0.5f) {
            i = (int) (i3 * (1.0f - (ratio / 0.5f)));
        } else {
            if (fCoerceIn > 1.0f) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(Float.valueOf(ratio));
                throw new ExceptionsH();
            }
            i = (int) (i3 * ((ratio - 0.5f) / 0.5f));
        }
        return i2 - i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.context.getResources().getDimensionPixelSize(C13997R.dimen.info_tag_icon_size);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.context.getResources().getDimensionPixelSize(C13997R.dimen.info_tag_icon_size);
    }
}
