package com.robinhood.android.designsystem.helper;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: RippleColorHelper.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u001d\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0096\u0002J%\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0002R\u001e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\n@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/designsystem/helper/RippleColorHelper;", "Lkotlin/properties/ReadWriteProperty;", "Landroid/view/View;", "Landroid/content/res/ColorStateList;", "<init>", "()V", "value", "rippleColor", "setRippleColor", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/drawable/RippleDrawable;", "rippleDrawable", "setRippleDrawable", "(Landroid/graphics/drawable/RippleDrawable;)V", "setBackgroundDrawable", "", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "setValue", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RippleColorHelper implements Interfaces3<View, ColorStateList> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private ColorStateList rippleColor;
    private RippleDrawable rippleDrawable;

    public RippleColorHelper() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        this.rippleColor = colorStateListValueOf;
    }

    @Override // kotlin.properties.Interfaces3, kotlin.properties.Interfaces2
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((View) obj, (KProperty<?>) kProperty);
    }

    @Override // kotlin.properties.Interfaces3
    public /* bridge */ /* synthetic */ void setValue(View view, KProperty kProperty, ColorStateList colorStateList) {
        setValue2(view, (KProperty<?>) kProperty, colorStateList);
    }

    private final void setRippleColor(ColorStateList colorStateList) {
        this.rippleColor = colorStateList;
        RippleDrawable rippleDrawable = this.rippleDrawable;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    private final void setRippleDrawable(RippleDrawable rippleDrawable) {
        this.rippleDrawable = rippleDrawable;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(this.rippleColor);
        }
    }

    public final void setBackgroundDrawable(Drawable backgroundDrawable) {
        setRippleDrawable(INSTANCE.findRippleDrawable(backgroundDrawable));
    }

    public ColorStateList getValue(View thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return this.rippleColor;
    }

    /* renamed from: setValue, reason: avoid collision after fix types in other method */
    public void setValue2(View thisRef, KProperty<?> property, ColorStateList value) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        setRippleColor(value);
    }

    /* compiled from: RippleColorHelper.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/helper/RippleColorHelper$Companion;", "", "<init>", "()V", "findRippleDrawable", "Landroid/graphics/drawable/RippleDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final RippleDrawable findRippleDrawable(Drawable backgroundDrawable) {
            if (backgroundDrawable instanceof RippleDrawable) {
                return (RippleDrawable) backgroundDrawable;
            }
            if (backgroundDrawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) backgroundDrawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    Drawable drawable = layerDrawable.getDrawable(i);
                    if (drawable instanceof RippleDrawable) {
                        return (RippleDrawable) drawable;
                    }
                }
            }
            return null;
        }
    }
}
