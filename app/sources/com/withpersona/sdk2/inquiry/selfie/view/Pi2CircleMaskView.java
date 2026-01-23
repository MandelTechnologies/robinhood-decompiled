package com.withpersona.sdk2.inquiry.selfie.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.withpersona.sdk2.inquiry.selfie.R$styleable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* compiled from: Pi2CircleMaskView.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u0006\u0010\u0016\u001a\u00020\u0013J\"\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0019J\b\u0010\u001d\u001a\u00020\u000eH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "size", "", "maskColor", "mask", "Landroid/graphics/Bitmap;", "paint", "Landroid/graphics/Paint;", "clearPaint", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "open", "close", "animated", "", "onComplete", "Lkotlin/Function0;", "isClosed", "circleMask", "animDuration", "", "targetScaleX", "Companion", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class Pi2CircleMaskView extends View {
    private Paint clearPaint;
    private Bitmap mask;
    private final int maskColor;
    private Paint paint;
    private final float size;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Pi2CircleMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ Pi2CircleMaskView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Pi2CircleMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint(7);
        Paint paint = new Paint(1);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.clearPaint = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Pi2CircleMaskView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.size = typedArrayObtainStyledAttributes.getFloat(R$styleable.Pi2CircleMaskView_pi2CircleSize, 0.4f);
            this.maskColor = typedArrayObtainStyledAttributes.getColor(R$styleable.Pi2CircleMaskView_pi2MaskColor, -16777216);
            typedArrayObtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawBitmap(circleMask(), 0.0f, 0.0f, this.paint);
    }

    public final void open() {
        if (getScaleX() == 5.0f && getScaleY() == 5.0f) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
        viewPropertyAnimatorAnimate.setDuration(animDuration(5.0f));
        viewPropertyAnimatorAnimate.scaleX(5.0f);
        viewPropertyAnimatorAnimate.scaleY(5.0f);
        viewPropertyAnimatorAnimate.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void close$default(Pi2CircleMaskView pi2CircleMaskView, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        pi2CircleMaskView.close(z, function0);
    }

    public final void close(boolean animated, final Function0<Unit> onComplete) {
        if (animated) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
            viewPropertyAnimatorAnimate.setDuration(animDuration(1.0f));
            viewPropertyAnimatorAnimate.scaleX(1.0f);
            viewPropertyAnimatorAnimate.scaleY(1.0f);
            viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Pi2CircleMaskView.close$lambda$5$lambda$4(onComplete);
                }
            });
            viewPropertyAnimatorAnimate.start();
            return;
        }
        getAnimation().cancel();
        setScaleX(1.0f);
        setScaleY(1.0f);
        if (onComplete != null) {
            onComplete.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$5$lambda$4(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean isClosed() {
        return (getScaleX() == 5.0f && getScaleY() == 5.0f) ? false : true;
    }

    private final Bitmap circleMask() {
        Bitmap bitmap = this.mask;
        if (bitmap != null) {
            if (bitmap.getWidth() != getWidth() || bitmap.getHeight() != getHeight()) {
                bitmap = null;
            }
            if (bitmap != null) {
                return bitmap;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(this.maskColor);
        canvas.drawCircle(canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, this.size * Math.min(canvas.getWidth(), canvas.getHeight()), this.clearPaint);
        this.mask = bitmapCreateBitmap;
        return bitmapCreateBitmap;
    }

    private final long animDuration(float targetScaleX) {
        return MathKt.roundToLong((Math.abs(getScaleX() - targetScaleX) / 4.0f) * 500);
    }
}
