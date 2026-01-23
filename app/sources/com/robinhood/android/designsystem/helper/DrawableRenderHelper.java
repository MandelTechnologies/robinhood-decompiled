package com.robinhood.android.designsystem.helper;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DrawableRenderHelper.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0014\u0010\u0019\u001a\u00020\u0014*\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0014\u0010\u001c\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\r@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/designsystem/helper/DrawableRenderHelper;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "value", "Landroid/graphics/drawable/Drawable;", ResourceTypes.DRAWABLE, "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/content/res/ColorStateList;", "tint", "getTint", "()Landroid/content/res/ColorStateList;", "setTint", "(Landroid/content/res/ColorStateList;)V", "verifyDrawable", "", "who", "drawableStateChanged", "", "applyTint", "setStateIfStateful", "drawableState", "", "setStateAndInvalidate", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DrawableRenderHelper {
    private Drawable drawable;
    private ColorStateList tint;
    private final View view;

    public DrawableRenderHelper(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.drawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.view.unscheduleDrawable(this.drawable);
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        this.drawable = drawableMutate;
        if (drawableMutate != null) {
            drawableMutate.setCallback(this.view);
        }
        applyTint();
    }

    public final ColorStateList getTint() {
        return this.tint;
    }

    public final void setTint(ColorStateList colorStateList) {
        this.tint = colorStateList;
        applyTint();
    }

    public final boolean verifyDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        return Intrinsics.areEqual(who, this.drawable);
    }

    public final void drawableStateChanged() {
        Drawable drawable = this.drawable;
        if (drawable != null) {
            int[] drawableState = this.view.getDrawableState();
            Intrinsics.checkNotNullExpressionValue(drawableState, "getDrawableState(...)");
            setStateAndInvalidate(drawable, drawableState);
        }
    }

    private final void applyTint() {
        Drawable drawable;
        ColorStateList colorStateList = this.tint;
        if (colorStateList == null || (drawable = this.drawable) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        int[] drawableState = this.view.getDrawableState();
        Intrinsics.checkNotNullExpressionValue(drawableState, "getDrawableState(...)");
        setStateIfStateful(drawable, drawableState);
    }

    private final boolean setStateIfStateful(Drawable drawable, int[] iArr) {
        return drawable.isStateful() && drawable.setState(iArr);
    }

    private final void setStateAndInvalidate(Drawable drawable, int[] iArr) {
        if (setStateIfStateful(drawable, iArr)) {
            drawable.invalidateSelf();
        }
    }
}
