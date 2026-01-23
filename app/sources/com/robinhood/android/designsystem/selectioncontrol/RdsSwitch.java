package com.robinhood.android.designsystem.selectioncontrol;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.robinhood.android.designsystem.C13997R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsSwitch.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 '2\u00020\u0001:\u0001'B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0013H\u0014J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000fH\u0014J\b\u0010!\u001a\u00020\"H\u0014J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0014J\b\u0010&\u001a\u00020\"H\u0002R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0013@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u0017@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/RdsSwitch;", "Lcom/google/android/material/switchmaterial/SwitchMaterial;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "Landroid/content/res/ColorStateList;", "lockIconTint", "getLockIconTint", "()Landroid/content/res/ColorStateList;", "setLockIconTint", "(Landroid/content/res/ColorStateList;)V", "", "lockIconSize", "setLockIconSize", "(I)V", "Landroid/graphics/drawable/Drawable;", "lockIconDrawable", "setLockIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "isLocked", "()Z", "setLocked", "(Z)V", "verifyDrawable", "who", "onCreateDrawableState", "", "extraSpace", "drawableStateChanged", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "updateLockIconBounds", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class RdsSwitch extends SwitchMaterial {
    private static final int[] STATE_LOCKED = {C13997R.attr.state_locked};
    private boolean isLocked;
    private Drawable lockIconDrawable;
    private int lockIconSize;
    private ColorStateList lockIconTint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] RdsSwitch = C13997R.styleable.RdsSwitch;
        Intrinsics.checkNotNullExpressionValue(RdsSwitch, "RdsSwitch");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsSwitch, 0, 0);
        setLockIconDrawable(typedArrayObtainStyledAttributes.getDrawable(C13997R.styleable.RdsSwitch_lockIcon));
        setLockIconTint(typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.RdsSwitch_lockIconTint));
        setLockIconSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C13997R.styleable.RdsSwitch_lockIconSize, this.lockIconSize));
        setLocked(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsSwitch_locked, this.isLocked));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final ColorStateList getLockIconTint() {
        return this.lockIconTint;
    }

    public final void setLockIconTint(ColorStateList colorStateList) {
        this.lockIconTint = colorStateList;
        Drawable drawable = this.lockIconDrawable;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    private final void setLockIconSize(int i) {
        this.lockIconSize = i;
        updateLockIconBounds();
    }

    private final void setLockIconDrawable(Drawable drawable) {
        Drawable drawable2 = this.lockIconDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.lockIconDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        Drawable drawable3 = this.lockIconDrawable;
        if (drawable3 != null) {
            drawable3.setTintList(this.lockIconTint);
        }
        updateLockIconBounds();
    }

    /* renamed from: isLocked, reason: from getter */
    public final boolean getIsLocked() {
        return this.isLocked;
    }

    public final void setLocked(boolean z) {
        if (this.isLocked != z) {
            this.isLocked = z;
            refreshDrawableState();
            Drawable drawable = this.lockIconDrawable;
            if (drawable != null) {
                drawable.setVisible(this.isLocked, true);
            }
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        return super.verifyDrawable(who) || Intrinsics.areEqual(who, this.lockIconDrawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int extraSpace) {
        if (this.isLocked) {
            int[] iArrMergeDrawableStates = View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), STATE_LOCKED);
            Intrinsics.checkNotNull(iArrMergeDrawableStates);
            return iArrMergeDrawableStates;
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(extraSpace);
        Intrinsics.checkNotNull(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.lockIconDrawable;
        if (drawable != null) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (!this.isLocked || (drawable = this.lockIconDrawable) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(getThumbDrawable().getBounds(), "getBounds(...)");
        int iSave = canvas.save();
        canvas.translate(r1.left + ((r1.width() - drawable.getIntrinsicWidth()) / 2.0f), r1.top + ((r1.height() - drawable.getIntrinsicHeight()) / 2.0f));
        try {
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    private final void updateLockIconBounds() {
        Drawable drawable = this.lockIconDrawable;
        if (drawable != null) {
            int intrinsicWidth = this.lockIconSize;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            int intrinsicHeight = this.lockIconSize;
            if (intrinsicHeight == 0) {
                intrinsicHeight = drawable.getIntrinsicHeight();
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
    }
}
