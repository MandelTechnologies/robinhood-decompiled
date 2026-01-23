package com.robinhood.android.designsystem.container;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.helper.RippleColorHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

/* compiled from: RdsRippleContainerView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nJ\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017*\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "initialized", "", "rippleColorHelper", "Lcom/robinhood/android/designsystem/helper/RippleColorHelper;", "<set-?>", "Landroid/content/res/ColorStateList;", "rippleColor", "getRippleColor$delegate", "(Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;)Ljava/lang/Object;", "getRippleColor", "()Landroid/content/res/ColorStateList;", "setRippleColor", "(Landroid/content/res/ColorStateList;)V", "setBackground", "", "background", "Landroid/graphics/drawable/Drawable;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public class RdsRippleContainerView extends FrameLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RdsRippleContainerView.class, "rippleColor", "getRippleColor()Landroid/content/res/ColorStateList;", 0))};
    private final boolean initialized;
    private final RippleColorHelper rippleColorHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsRippleContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.initialized = true;
        RippleColorHelper rippleColorHelper = new RippleColorHelper();
        rippleColorHelper.setBackgroundDrawable(getBackground());
        this.rippleColorHelper = rippleColorHelper;
        int[] RdsRippleContainerView = C13997R.styleable.RdsRippleContainerView;
        Intrinsics.checkNotNullExpressionValue(RdsRippleContainerView, "RdsRippleContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsRippleContainerView, 0, 0);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.RdsRippleContainerView_rippleColor);
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(colorStateList, "valueOf(...)");
        }
        setRippleColor(colorStateList);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RdsRippleContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final ColorStateList getRippleColor() {
        return this.rippleColorHelper.getValue((View) this, $$delegatedProperties[0]);
    }

    public final void setRippleColor(ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(colorStateList, "<set-?>");
        this.rippleColorHelper.setValue2((View) this, $$delegatedProperties[0], colorStateList);
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        super.setBackground(background);
        if (this.initialized) {
            this.rippleColorHelper.setBackgroundDrawable(background);
        }
    }
}
