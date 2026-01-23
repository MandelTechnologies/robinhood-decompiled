package com.robinhood.android.designsystem.selectioncontrol;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.RadioButton;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LegacyRdsRadioButton.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 42\u00020\u00012\u00020\u0002:\u0003234B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0014J\b\u0010#\u001a\u00020\u0013H\u0016J\b\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0013H\u0016J\b\u0010,\u001a\u00020\u0013H\u0016J\b\u0010-\u001a\u00020\nH\u0016J\b\u0010.\u001a\u00020/H\u0014J\u0010\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020/H\u0014R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioButton;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "Landroid/widget/Checkable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "primaryText", "getPrimaryText", "()Ljava/lang/CharSequence;", "setPrimaryText", "(Ljava/lang/CharSequence;)V", "secondaryText", "getSecondaryText", "setSecondaryText", "", "showBottomDivider", "getShowBottomDivider", "()Z", "setShowBottomDivider", "(Z)V", "onCheckedChangeListener", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioButton$OnCheckedChangeListener;", "getOnCheckedChangeListener", "()Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioButton$OnCheckedChangeListener;", "setOnCheckedChangeListener", "(Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioButton$OnCheckedChangeListener;)V", "textContainer", "Lcom/robinhood/android/designsystem/row/component/RdsRowTextContainerView;", StatisticsSection2.DIVIDER, "Landroid/view/View;", "isChecked", "onCreateDrawableState", "", "extraSpace", "", AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_TOGGLE, "", "setChecked", "checked", "performClick", "getAccessibilityClassName", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "OnCheckedChangeListener", "SavedState", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LegacyRdsRadioButton extends RdsRippleContainerView implements Checkable {
    private final View divider;
    private boolean isChecked;
    private OnCheckedChangeListener onCheckedChangeListener;
    private final RdsRowTextContainerView textContainer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    /* compiled from: LegacyRdsRadioButton.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioButton$OnCheckedChangeListener;", "", "onCheckedChanged", "", "radioButton", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioButton;", "isChecked", "", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface OnCheckedChangeListener {
        void onCheckedChanged(LegacyRdsRadioButton radioButton, boolean isChecked);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyRdsRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C13997R.layout.merge_legacy_rds_radio_button, this);
        View viewFindViewById = findViewById(C13997R.id.radio_button_text_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.textContainer = (RdsRowTextContainerView) viewFindViewById;
        View viewFindViewById2 = findViewById(C13997R.id.radio_button_bottom_divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.divider = viewFindViewById2;
        int[] LegacyRdsRadioButton = C13997R.styleable.LegacyRdsRadioButton;
        Intrinsics.checkNotNullExpressionValue(LegacyRdsRadioButton, "LegacyRdsRadioButton");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LegacyRdsRadioButton, 0, 0);
        setPrimaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.LegacyRdsRadioButton_primaryText));
        setSecondaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.LegacyRdsRadioButton_secondaryText));
        this.isChecked = typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.LegacyRdsRadioButton_android_checked, this.isChecked);
        setShowBottomDivider(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.LegacyRdsRadioButton_showBottomDivider, getShowBottomDivider()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final CharSequence getPrimaryText() {
        return this.textContainer.getPrimaryText();
    }

    public final void setPrimaryText(CharSequence charSequence) {
        this.textContainer.setPrimaryText(charSequence);
    }

    public final CharSequence getSecondaryText() {
        return this.textContainer.getSecondaryText();
    }

    public final void setSecondaryText(CharSequence charSequence) {
        this.textContainer.setSecondaryText(charSequence);
    }

    public final boolean getShowBottomDivider() {
        return this.divider.getVisibility() == 0;
    }

    public final void setShowBottomDivider(boolean z) {
        this.divider.setVisibility(z ? 0 : 8);
    }

    public final OnCheckedChangeListener getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    public final void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int extraSpace) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(extraSpace + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        Intrinsics.checkNotNull(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.isChecked;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (this.isChecked) {
            return;
        }
        setChecked(true);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        if (this.isChecked != checked) {
            this.isChecked = checked;
            refreshDrawableState();
            OnCheckedChangeListener onCheckedChangeListener = this.onCheckedChangeListener;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(this, checked);
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = RadioButton.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        boolean z = this.isChecked;
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNull(parcelableOnSaveInstanceState);
        return new SavedState(z, parcelableOnSaveInstanceState);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.getIsChecked());
    }

    /* compiled from: LegacyRdsRadioButton.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioButton$SavedState;", "Landroid/view/AbsSavedState;", "isChecked", "", "inputSuperState", "Landroid/os/Parcelable;", "<init>", "(ZLandroid/os/Parcelable;)V", "()Z", "getInputSuperState", "()Landroid/os/Parcelable;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final Parcelable inputSuperState;
        private final boolean isChecked;

        /* compiled from: LegacyRdsRadioButton.kt */
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
            dest.writeInt(this.isChecked ? 1 : 0);
            dest.writeParcelable(this.inputSuperState, flags);
        }

        /* renamed from: isChecked, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public final Parcelable getInputSuperState() {
            return this.inputSuperState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(boolean z, Parcelable inputSuperState) {
            super(inputSuperState);
            Intrinsics.checkNotNullParameter(inputSuperState, "inputSuperState");
            this.isChecked = z;
            this.inputSuperState = inputSuperState;
        }
    }

    /* compiled from: LegacyRdsRadioButton.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioButton$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsRadioButton;", "<init>", "()V", "CHECKED_STATE_SET", "", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<LegacyRdsRadioButton> {
        private final /* synthetic */ Inflater<LegacyRdsRadioButton> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public LegacyRdsRadioButton inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (LegacyRdsRadioButton) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C13997R.layout.include_legacy_rds_radio_button_with_divider);
        }
    }
}
