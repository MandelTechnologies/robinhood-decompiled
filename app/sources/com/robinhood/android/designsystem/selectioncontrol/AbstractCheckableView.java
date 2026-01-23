package com.robinhood.android.designsystem.selectioncontrol;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.C13997R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AbstractCheckableView.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0004()*+B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\fJ\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\bH\u0014J\u0016\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012J\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0012J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010 \u001a\u00020\u0018H\u0016J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0015J\u0006\u0010\"\u001a\u00020\u0012J\n\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0012\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010$H\u0014J\b\u0010'\u001a\u00020\u0018H\u0002R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u0014X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView;", "Landroid/widget/FrameLayout;", "Landroid/widget/Checkable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onCheckedChangeListener", "Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView$OnCheckedChangeListener;", "getOnCheckedChangeListener", "()Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView$OnCheckedChangeListener;", "setOnCheckedChangeListener", "(Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView$OnCheckedChangeListener;)V", "isChecked", "", "accessibilityOptions", "Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView$AccessibilityOptions;", "getAccessibilityOptions", "()Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView$AccessibilityOptions;", "onCheckedChange", "", "listener", "onCreateDrawableState", "", "extraSpace", "setChecked", "checked", "notify", AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_TOGGLE, "performCheckedChange", "performClick", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "updateContentDescription", "OnCheckedChangeListener", "AccessibilityOptions", "SavedState", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public abstract class AbstractCheckableView extends FrameLayout implements Checkable {
    private boolean isChecked;
    private OnCheckedChangeListener onCheckedChangeListener;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    /* compiled from: AbstractCheckableView.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView$OnCheckedChangeListener;", "", "onCheckedChange", "", "view", "Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView;", "isChecked", "", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface OnCheckedChangeListener {
        void onCheckedChange(AbstractCheckableView view, boolean isChecked);
    }

    protected abstract AccessibilityOptions getAccessibilityOptions();

    public /* synthetic */ AbstractCheckableView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractCheckableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] RdsSelectionControl = C13997R.styleable.RdsSelectionControl;
        Intrinsics.checkNotNullExpressionValue(RdsSelectionControl, "RdsSelectionControl");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsSelectionControl, 0, 0);
        setChecked(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsSelectionControl_android_checked, this.isChecked));
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsSelectionControl_android_enabled, isEnabled()));
        typedArrayObtainStyledAttributes.recycle();
        setClickable(true);
        updateContentDescription();
    }

    public final OnCheckedChangeListener getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    public final void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public final void onCheckedChange(OnCheckedChangeListener listener) {
        this.onCheckedChangeListener = listener;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int extraSpace) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(extraSpace + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    public final void setChecked(boolean checked, boolean notify) {
        if (this.isChecked == checked) {
            return;
        }
        performCheckedChange(checked, notify);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean checked) {
        setChecked(checked, true);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.isChecked;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.isChecked);
    }

    protected void performCheckedChange(boolean checked, boolean notify) {
        OnCheckedChangeListener onCheckedChangeListener;
        this.isChecked = checked;
        refreshDrawableState();
        updateContentDescription();
        if (!notify || (onCheckedChangeListener = this.onCheckedChangeListener) == null) {
            return;
        }
        onCheckedChangeListener.onCheckedChange(this, checked);
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(this.isChecked, super.onSaveInstanceState());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNull(state, "null cannot be cast to non-null type com.robinhood.android.designsystem.selectioncontrol.AbstractCheckableView.SavedState");
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.getChecked());
    }

    private final void updateContentDescription() {
        setContentDescription(getAccessibilityOptions().getDescription(this.isChecked));
    }

    /* compiled from: AbstractCheckableView.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0084\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView$AccessibilityOptions;", "", "checkedDescription", "", "uncheckedDescription", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getCheckedDescription", "()Ljava/lang/CharSequence;", "getUncheckedDescription", "getDescription", "isChecked", "", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    protected static final /* data */ class AccessibilityOptions {
        private final CharSequence checkedDescription;
        private final CharSequence uncheckedDescription;

        public static /* synthetic */ AccessibilityOptions copy$default(AccessibilityOptions accessibilityOptions, CharSequence charSequence, CharSequence charSequence2, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = accessibilityOptions.checkedDescription;
            }
            if ((i & 2) != 0) {
                charSequence2 = accessibilityOptions.uncheckedDescription;
            }
            return accessibilityOptions.copy(charSequence, charSequence2);
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getCheckedDescription() {
            return this.checkedDescription;
        }

        /* renamed from: component2, reason: from getter */
        public final CharSequence getUncheckedDescription() {
            return this.uncheckedDescription;
        }

        public final AccessibilityOptions copy(CharSequence checkedDescription, CharSequence uncheckedDescription) {
            Intrinsics.checkNotNullParameter(checkedDescription, "checkedDescription");
            Intrinsics.checkNotNullParameter(uncheckedDescription, "uncheckedDescription");
            return new AccessibilityOptions(checkedDescription, uncheckedDescription);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccessibilityOptions)) {
                return false;
            }
            AccessibilityOptions accessibilityOptions = (AccessibilityOptions) other;
            return Intrinsics.areEqual(this.checkedDescription, accessibilityOptions.checkedDescription) && Intrinsics.areEqual(this.uncheckedDescription, accessibilityOptions.uncheckedDescription);
        }

        public int hashCode() {
            return (this.checkedDescription.hashCode() * 31) + this.uncheckedDescription.hashCode();
        }

        public String toString() {
            return "AccessibilityOptions(checkedDescription=" + ((Object) this.checkedDescription) + ", uncheckedDescription=" + ((Object) this.uncheckedDescription) + ")";
        }

        public AccessibilityOptions(CharSequence checkedDescription, CharSequence uncheckedDescription) {
            Intrinsics.checkNotNullParameter(checkedDescription, "checkedDescription");
            Intrinsics.checkNotNullParameter(uncheckedDescription, "uncheckedDescription");
            this.checkedDescription = checkedDescription;
            this.uncheckedDescription = uncheckedDescription;
        }

        public final CharSequence getCheckedDescription() {
            return this.checkedDescription;
        }

        public final CharSequence getUncheckedDescription() {
            return this.uncheckedDescription;
        }

        public final CharSequence getDescription(boolean isChecked) {
            return isChecked ? this.checkedDescription : this.uncheckedDescription;
        }
    }

    /* compiled from: AbstractCheckableView.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView$SavedState;", "Landroid/view/AbsSavedState;", "checked", "", "savedState", "Landroid/os/Parcelable;", "<init>", "(ZLandroid/os/Parcelable;)V", "getChecked", "()Z", "getSavedState", "()Landroid/os/Parcelable;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final boolean checked;
        private final Parcelable savedState;

        /* compiled from: AbstractCheckableView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState(parcel.readInt() != 0, parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.checked ? 1 : 0);
            dest.writeParcelable(this.savedState, flags);
        }

        public final boolean getChecked() {
            return this.checked;
        }

        public final Parcelable getSavedState() {
            return this.savedState;
        }

        public SavedState(boolean z, Parcelable parcelable) {
            super(parcelable);
            this.checked = z;
            this.savedState = parcelable;
        }
    }
}
