package com.robinhood.android.designsystem.sparkle;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import androidx.appcompat.content.res.AppCompatResources;
import com.google.android.material.ripple.RippleUtils;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.graphics.Gradient;
import com.robinhood.utils.extensions.KProperties2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty3;

/* compiled from: SparkleButton.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\nH\u0016J\u0012\u0010)\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010\u000eH\u0017J\n\u0010+\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\nH\u0016J\b\u0010.\u001a\u00020\nH\u0016J\u0010\u0010/\u001a\u00020!2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020!2\u0006\u00100\u001a\u000201H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R/\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/designsystem/sparkle/SparkleButton;", "Lcom/robinhood/android/designsystem/button/RdsButton;", "Lcom/robinhood/android/designsystem/sparkle/Sparkleable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_cornerRadius", "", "sparkleDrawable", "Lcom/robinhood/android/designsystem/sparkle/SparkleDrawable;", "_rippleColor", "Landroid/content/res/ColorStateList;", "rippleDrawable", "Landroid/graphics/drawable/RippleDrawable;", "<set-?>", "Lcom/robinhood/android/graphics/Gradient;", "sparkleGradient", "getSparkleGradient", "()Lcom/robinhood/android/graphics/Gradient;", "setSparkleGradient", "(Lcom/robinhood/android/graphics/Gradient;)V", "sparkleGradient$delegate", "Lkotlin/reflect/KMutableProperty0;", "sparkleOverride", "getSparkleOverride", "()Landroid/content/res/ColorStateList;", "setSparkleOverride", "(Landroid/content/res/ColorStateList;)V", "sparkleOverride$delegate", "setRippleColorResource", "", "rippleColorResourceId", "value", "", "isLoading", "()Z", "setLoading", "(Z)V", "setRippleColor", "rippleColor", "getRippleColor", "setCornerRadius", "cornerRadius", "getCornerRadius", "setBackground", "background", "Landroid/graphics/drawable/Drawable;", "setBackgroundDrawable", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SparkleButton extends RdsButton implements Sparkleable {
    private int _cornerRadius;
    private ColorStateList _rippleColor;
    private final RippleDrawable rippleDrawable;
    private final SparkleDrawable sparkleDrawable;

    /* renamed from: sparkleGradient$delegate, reason: from kotlin metadata */
    private final KProperty3 sparkleGradient;

    /* renamed from: sparkleOverride$delegate, reason: from kotlin metadata */
    private final KProperty3 sparkleOverride;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SparkleButton.class, "sparkleGradient", "getSparkleGradient()Lcom/robinhood/android/graphics/Gradient;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SparkleButton.class, "sparkleOverride", "getSparkleOverride()Landroid/content/res/ColorStateList;", 0))};
    private static final int[] ATTRIBUTES = {C13997R.attr.cornerRadius, C13997R.attr.rippleColor};

    @Override // com.google.android.material.button.MaterialButton, android.view.View
    public void setBackground(Drawable background) {
        Intrinsics.checkNotNullParameter(background, "background");
    }

    @Override // com.google.android.material.button.MaterialButton, androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable background) {
        Intrinsics.checkNotNullParameter(background, "background");
    }

    public /* synthetic */ SparkleButton(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRIBUTES, 0, 0);
        this._cornerRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        float f = this._cornerRadius;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        final SparkleDrawable sparkleDrawable = new SparkleDrawable(this, new RoundRectShape(fArr, null, null), attributeSet, 0, 8, null);
        this.sparkleDrawable = sparkleDrawable;
        this._rippleColor = ColorStateList.valueOf(0);
        ColorStateList colorStateList = this._rippleColor;
        Intrinsics.checkNotNull(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, sparkleDrawable, null);
        this.rippleDrawable = rippleDrawable;
        this.sparkleGradient = new MutablePropertyReference0Impl(sparkleDrawable) { // from class: com.robinhood.android.designsystem.sparkle.SparkleButton$sparkleGradient$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((SparkleDrawable) this.receiver).getSparkleGradient();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((SparkleDrawable) this.receiver).setSparkleGradient((Gradient) obj);
            }
        };
        this.sparkleOverride = new MutablePropertyReference0Impl(sparkleDrawable) { // from class: com.robinhood.android.designsystem.sparkle.SparkleButton$sparkleOverride$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((SparkleDrawable) this.receiver).getSparkleOverride();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((SparkleDrawable) this.receiver).setSparkleOverride((ColorStateList) obj);
            }
        };
        super.setBackgroundDrawable(rippleDrawable);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ATTRIBUTES, 0, 0);
        setRippleColor(typedArrayObtainStyledAttributes2.getColorStateList(1));
        typedArrayObtainStyledAttributes2.recycle();
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

    @Override // com.google.android.material.button.MaterialButton
    public void setRippleColorResource(int rippleColorResourceId) {
        setRippleColor(AppCompatResources.getColorStateList(getContext(), rippleColorResourceId));
    }

    @Override // com.robinhood.android.designsystem.button.RdsButton
    /* renamed from: isLoading */
    public boolean getIsLoading() {
        return super.getIsLoading();
    }

    @Override // com.robinhood.android.designsystem.button.RdsButton
    public void setLoading(boolean z) {
        setTextScaleX(z ? 0.0f : 1.0f);
        super.setLoading(z);
    }

    @Override // com.google.android.material.button.MaterialButton
    @SuppressLint({"RestrictedApi"})
    public void setRippleColor(ColorStateList rippleColor) {
        ColorStateList colorStateListSanitizeRippleDrawableColor = RippleUtils.sanitizeRippleDrawableColor(rippleColor);
        Intrinsics.checkNotNullExpressionValue(colorStateListSanitizeRippleDrawableColor, "sanitizeRippleDrawableColor(...)");
        this._rippleColor = colorStateListSanitizeRippleDrawableColor;
        this.rippleDrawable.setColor(colorStateListSanitizeRippleDrawableColor);
    }

    @Override // com.google.android.material.button.MaterialButton
    /* renamed from: getRippleColor, reason: from getter */
    public ColorStateList get_rippleColor() {
        return this._rippleColor;
    }

    @Override // com.google.android.material.button.MaterialButton
    public void setCornerRadius(int cornerRadius) {
        super.setCornerRadius(cornerRadius);
        float f = cornerRadius;
        SparkleDrawable sparkleDrawable = this.sparkleDrawable;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        sparkleDrawable.setShape(new RoundRectShape(fArr, null, null));
        this._cornerRadius = cornerRadius;
    }

    @Override // com.google.android.material.button.MaterialButton
    /* renamed from: getCornerRadius, reason: from getter */
    public int get_cornerRadius() {
        return this._cornerRadius;
    }
}
