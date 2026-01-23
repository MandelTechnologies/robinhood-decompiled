package com.robinhood.android.designsystem.sparkle;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.robinhood.android.graphics.Gradient;
import com.robinhood.utils.extensions.KProperties2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty3;

/* compiled from: SparkleImageView.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020!H\u0014J(\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$H\u0014J\u0010\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020*H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\u00148V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082D¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/designsystem/sparkle/SparkleImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/robinhood/android/designsystem/sparkle/Sparkleable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sparkleDrawable", "Lcom/robinhood/android/designsystem/sparkle/SparkleDrawable;", "<set-?>", "Lcom/robinhood/android/graphics/Gradient;", "sparkleGradient", "getSparkleGradient", "()Lcom/robinhood/android/graphics/Gradient;", "setSparkleGradient", "(Lcom/robinhood/android/graphics/Gradient;)V", "sparkleGradient$delegate", "Lkotlin/reflect/KMutableProperty0;", "Landroid/content/res/ColorStateList;", "sparkleOverride", "getSparkleOverride", "()Landroid/content/res/ColorStateList;", "setSparkleOverride", "(Landroid/content/res/ColorStateList;)V", "sparkleOverride$delegate", "isInitialized", "", "verifyDrawable", "who", "Landroid/graphics/drawable/Drawable;", "drawableStateChanged", "", "onSizeChanged", "width", "", "height", "oldWidth", "oldHeight", "onDraw", "canvas", "Landroid/graphics/Canvas;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class SparkleImageView extends AppCompatImageView implements Sparkleable {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SparkleImageView.class, "sparkleGradient", "getSparkleGradient()Lcom/robinhood/android/graphics/Gradient;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SparkleImageView.class, "sparkleOverride", "getSparkleOverride()Landroid/content/res/ColorStateList;", 0))};
    private final boolean isInitialized;
    private final SparkleDrawable sparkleDrawable;

    /* renamed from: sparkleGradient$delegate, reason: from kotlin metadata */
    private final KProperty3 sparkleGradient;

    /* renamed from: sparkleOverride$delegate, reason: from kotlin metadata */
    private final KProperty3 sparkleOverride;

    public /* synthetic */ SparkleImageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        final SparkleDrawable sparkleDrawable = new SparkleDrawable(this, new RectShape(), attributeSet, 0, 8, null);
        sparkleDrawable.setCallback(this);
        sparkleDrawable.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.sparkleDrawable = sparkleDrawable;
        this.sparkleGradient = new MutablePropertyReference0Impl(sparkleDrawable) { // from class: com.robinhood.android.designsystem.sparkle.SparkleImageView$sparkleGradient$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((SparkleDrawable) this.receiver).getSparkleGradient();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((SparkleDrawable) this.receiver).setSparkleGradient((Gradient) obj);
            }
        };
        this.sparkleOverride = new MutablePropertyReference0Impl(sparkleDrawable) { // from class: com.robinhood.android.designsystem.sparkle.SparkleImageView$sparkleOverride$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((SparkleDrawable) this.receiver).getSparkleOverride();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((SparkleDrawable) this.receiver).setSparkleOverride((ColorStateList) obj);
            }
        };
        setLayerType(2, null);
        this.isInitialized = true;
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public Gradient getSparkleGradient() {
        return (Gradient) KProperties2.getValue(this.sparkleGradient, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public void setSparkleGradient(Gradient gradient) {
        KProperties2.setValue((KProperty3<Gradient>) this.sparkleGradient, this, (KProperty<?>) $$delegatedProperties[0], gradient);
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public ColorStateList getSparkleOverride() {
        return (ColorStateList) KProperties2.getValue(this.sparkleOverride, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public void setSparkleOverride(ColorStateList colorStateList) {
        KProperties2.setValue((KProperty3<ColorStateList>) this.sparkleOverride, this, (KProperty<?>) $$delegatedProperties[1], colorStateList);
    }

    @Override // android.widget.ImageView, android.view.View
    protected boolean verifyDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        return who == this.sparkleDrawable || super.verifyDrawable(who);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
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

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.sparkleDrawable.draw(canvas);
    }
}
