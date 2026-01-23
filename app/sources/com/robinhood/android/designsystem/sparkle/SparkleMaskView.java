package com.robinhood.android.designsystem.sparkle;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.robinhood.android.graphics.Gradient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SparkleMaskView.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fJ\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\"H\u0014J(\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bH\u0014J\u0010\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0014J\u001e\u0010+\u001a\u00020\u000e2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/designsystem/sparkle/SparkleMaskView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/android/designsystem/sparkle/Sparkleable;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sparkleDrawable", "Lcom/robinhood/android/designsystem/sparkle/SparkleDrawable;", "value", "Lcom/robinhood/android/graphics/Gradient;", "sparkleGradient", "getSparkleGradient", "()Lcom/robinhood/android/graphics/Gradient;", "setSparkleGradient", "(Lcom/robinhood/android/graphics/Gradient;)V", "Landroid/content/res/ColorStateList;", "sparkleOverride", "getSparkleOverride", "()Landroid/content/res/ColorStateList;", "setSparkleOverride", "(Landroid/content/res/ColorStateList;)V", "isInitialized", "", "verifyDrawable", "who", "Landroid/graphics/drawable/Drawable;", "drawableStateChanged", "", "onSizeChanged", "width", "height", "oldWidth", "oldHeight", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "createDrawable", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class SparkleMaskView extends FrameLayout implements Sparkleable {
    private final boolean isInitialized;
    private final SparkleDrawable sparkleDrawable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkleMaskView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayerType(2, null);
        this.sparkleDrawable = createDrawable$default(this, null, 0, 3, null);
        this.isInitialized = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkleMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayerType(2, null);
        this.sparkleDrawable = createDrawable$default(this, attributeSet, 0, 2, null);
        this.isInitialized = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkleMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayerType(2, null);
        this.sparkleDrawable = createDrawable(attributeSet, i);
        this.isInitialized = true;
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public Gradient getSparkleGradient() {
        return this.sparkleDrawable.getSparkleGradient();
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public void setSparkleGradient(Gradient gradient) {
        this.sparkleDrawable.setSparkleGradient(gradient);
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public ColorStateList getSparkleOverride() {
        return this.sparkleDrawable.getSparkleOverride();
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public void setSparkleOverride(ColorStateList colorStateList) {
        this.sparkleDrawable.setSparkleOverride(colorStateList);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        return who == this.sparkleDrawable || super.verifyDrawable(who);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.isInitialized && this.sparkleDrawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        this.sparkleDrawable.setBounds(0, 0, width, height);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (getSparkleGradient() != null) {
            this.sparkleDrawable.draw(canvas);
        }
    }

    static /* synthetic */ SparkleDrawable createDrawable$default(SparkleMaskView sparkleMaskView, AttributeSet attributeSet, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            attributeSet = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return sparkleMaskView.createDrawable(attributeSet, i);
    }

    private final SparkleDrawable createDrawable(AttributeSet attrs, int defStyleAttr) {
        SparkleDrawable sparkleDrawable = new SparkleDrawable(this, new RectShape(), attrs, defStyleAttr);
        sparkleDrawable.setCallback(this);
        sparkleDrawable.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        return sparkleDrawable;
    }
}
