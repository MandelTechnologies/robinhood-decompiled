package com.robinhood.android.designsystem.selectioncontrol;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.selectioncontrol.AbstractCheckableView;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.view.DefStyleProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RdsSelectionRowView.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u0000 @2\u00020\u0001:\u0001@B\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010)\u001a\u00020*2\u001a\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020*\u0018\u00010,J\u000e\u0010-\u001a\u00020*2\u0006\u0010\"\u001a\u00020!J\u0010\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020!H\u0016J\b\u0010=\u001a\u00020!H\u0016J\b\u0010>\u001a\u00020*H\u0002J\b\u0010?\u001a\u00020*H\u0002R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR(\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\b\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u00020!2\u0006\u0010\b\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000101X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\u0002088eX¤\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/RdsSelectionRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "primaryText", "getPrimaryText", "()Ljava/lang/CharSequence;", "setPrimaryText", "(Ljava/lang/CharSequence;)V", "secondaryText", "getSecondaryText", "setSecondaryText", "secondaryHighlightText", "getSecondaryHighlightText", "setSecondaryHighlightText", "Landroid/graphics/drawable/Drawable;", "leadingIconDrawable", "getLeadingIconDrawable", "()Landroid/graphics/drawable/Drawable;", "setLeadingIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/content/res/ColorStateList;", "leadingIconTint", "getLeadingIconTint", "()Landroid/content/res/ColorStateList;", "setLeadingIconTint", "(Landroid/content/res/ColorStateList;)V", "", "isChecked", "()Z", "setChecked", "(Z)V", "showBottomDivider", "getShowBottomDivider", "setShowBottomDivider", "onCheckedChange", "", "listener", "Lkotlin/Function2;", "setCheckedProgrammatically", "selectionControl", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsSelectionControl;", "primaryTextView", "Landroid/widget/TextView;", "secondaryTextView", "secondaryHighlightTextView", "secondaryHighlightTextContainer", "Landroid/view/View;", StatisticsSection2.DIVIDER, "layoutRes", "", "getLayoutRes", "()I", "setEnabled", "enabled", "performClick", "updateLabelIconBounds", "updateSecondaryHighlightTextContainerVisibility", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public abstract class RdsSelectionRowView extends RdsRippleContainerView {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final View divider;
    private Drawable leadingIconDrawable;
    private final TextView primaryTextView;
    private final View secondaryHighlightTextContainer;
    private final TextView secondaryHighlightTextView;
    private final TextView secondaryTextView;
    private final RdsSelectionControl selectionControl;

    protected abstract int getLayoutRes();

    /* JADX WARN: Illegal instructions before constructor call */
    public RdsSelectionRowView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        Companion companion = INSTANCE;
        super(context, attributeSet, companion.getDefStyleAttr());
        View.inflate(context, getLayoutRes(), this);
        setClickable(true);
        View viewFindViewById = findViewById(C13997R.id.selection_row_control);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RdsSelectionControl rdsSelectionControl = (RdsSelectionControl) viewFindViewById;
        this.selectionControl = rdsSelectionControl;
        rdsSelectionControl.setClickable(false);
        View viewFindViewById2 = findViewById(C13997R.id.selection_row_primary_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.primaryTextView = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C13997R.id.selection_row_secondary_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.secondaryTextView = (TextView) viewFindViewById3;
        this.secondaryHighlightTextView = (TextView) findViewById(C13997R.id.selection_row_secondary_highlight_text);
        this.secondaryHighlightTextContainer = findViewById(C13997R.id.selection_row_secondary_text_container);
        View viewFindViewById4 = findViewById(C13997R.id.selection_row_divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.divider = viewFindViewById4;
        int[] RdsSelectionRowView = C13997R.styleable.RdsSelectionRowView;
        Intrinsics.checkNotNullExpressionValue(RdsSelectionRowView, "RdsSelectionRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsSelectionRowView, companion.getDefStyleAttr(), 0);
        setPrimaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsSelectionRowView_primaryText));
        setSecondaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsSelectionRowView_secondaryText));
        setChecked(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsSelectionRowView_android_checked, isChecked()));
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsSelectionRowView_android_enabled, isEnabled()));
        setShowBottomDivider(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsSelectionRowView_showBottomDivider, getShowBottomDivider()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final CharSequence getPrimaryText() {
        return this.primaryTextView.getText();
    }

    public final void setPrimaryText(CharSequence charSequence) {
        this.primaryTextView.setText(charSequence);
        this.primaryTextView.setVisibility(charSequence != null ? 0 : 8);
    }

    public final CharSequence getSecondaryText() {
        return this.secondaryTextView.getText();
    }

    public final void setSecondaryText(CharSequence charSequence) {
        this.secondaryTextView.setText(charSequence);
        this.secondaryTextView.setVisibility(charSequence != null ? 0 : 8);
        updateSecondaryHighlightTextContainerVisibility();
    }

    public final CharSequence getSecondaryHighlightText() {
        TextView textView = this.secondaryHighlightTextView;
        if (textView != null) {
            return textView.getText();
        }
        return null;
    }

    public final void setSecondaryHighlightText(CharSequence charSequence) {
        TextView textView = this.secondaryHighlightTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
        TextView textView2 = this.secondaryHighlightTextView;
        if (textView2 != null) {
            textView2.setVisibility(charSequence != null ? 0 : 8);
        }
        updateSecondaryHighlightTextContainerVisibility();
    }

    public final Drawable getLeadingIconDrawable() {
        return this.leadingIconDrawable;
    }

    public final void setLeadingIconDrawable(Drawable drawable) {
        this.leadingIconDrawable = drawable;
        updateLabelIconBounds();
        TextView textView = this.secondaryHighlightTextView;
        if (textView != null) {
            textView.setCompoundDrawablesRelative(this.leadingIconDrawable, null, null, null);
        }
        updateSecondaryHighlightTextContainerVisibility();
    }

    public final ColorStateList getLeadingIconTint() {
        TextView textView = this.secondaryHighlightTextView;
        if (textView != null) {
            return textView.getCompoundDrawableTintList();
        }
        return null;
    }

    public final void setLeadingIconTint(ColorStateList colorStateList) {
        TextView textView = this.secondaryHighlightTextView;
        if (textView != null) {
            textView.setCompoundDrawableTintList(colorStateList);
        }
    }

    public final boolean isChecked() {
        return this.selectionControl.getIsChecked();
    }

    public final void setChecked(boolean z) {
        this.selectionControl.setChecked(z);
    }

    public final boolean getShowBottomDivider() {
        return this.divider.getVisibility() == 0;
    }

    public final void setShowBottomDivider(boolean z) {
        this.divider.setVisibility(z ? 0 : 8);
    }

    public final void onCheckedChange(final Function2<? super RdsSelectionRowView, ? super Boolean, Unit> listener) {
        this.selectionControl.onCheckedChange(new AbstractCheckableView.OnCheckedChangeListener() { // from class: com.robinhood.android.designsystem.selectioncontrol.RdsSelectionRowView.onCheckedChange.1
            @Override // com.robinhood.android.designsystem.selectioncontrol.AbstractCheckableView.OnCheckedChangeListener
            public final void onCheckedChange(AbstractCheckableView abstractCheckableView, boolean z) {
                Intrinsics.checkNotNullParameter(abstractCheckableView, "<unused var>");
                Function2<RdsSelectionRowView, Boolean, Unit> function2 = listener;
                if (function2 != null) {
                    function2.invoke(this, Boolean.valueOf(z));
                }
            }
        });
    }

    public final void setCheckedProgrammatically(boolean isChecked) {
        AbstractCheckableView.OnCheckedChangeListener onCheckedChangeListener = this.selectionControl.getOnCheckedChangeListener();
        this.selectionControl.setOnCheckedChangeListener(null);
        setChecked(isChecked);
        this.selectionControl.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.selectionControl.setEnabled(enabled);
        this.primaryTextView.setEnabled(enabled);
        this.secondaryTextView.setEnabled(enabled);
        TextView textView = this.secondaryHighlightTextView;
        if (textView != null) {
            textView.setEnabled(enabled);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        this.selectionControl.performClick();
        return super.performClick();
    }

    private final void updateLabelIconBounds() {
        Drawable drawable = this.leadingIconDrawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    private final void updateSecondaryHighlightTextContainerVisibility() {
        CharSequence secondaryHighlightText;
        View view = this.secondaryHighlightTextContainer;
        if (view != null) {
            CharSequence secondaryText = getSecondaryText();
            view.setVisibility((secondaryText != null && !StringsKt.isBlank(secondaryText)) || (((secondaryHighlightText = getSecondaryHighlightText()) != null && !StringsKt.isBlank(secondaryHighlightText)) || this.leadingIconDrawable != null) ? 0 : 8);
        }
    }

    /* compiled from: RdsSelectionRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/selectioncontrol/RdsSelectionRowView$Companion;", "Lcom/robinhood/scarlet/view/DefStyleProvider;", "<init>", "()V", "defStyleAttr", "", "getDefStyleAttr", "()I", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DefStyleProvider {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleRes() {
            return DefStyleProvider.DefaultImpls.getDefStyleRes(this);
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleAttr() {
            return C20690R.attr.rowContainerStyle;
        }
    }
}
