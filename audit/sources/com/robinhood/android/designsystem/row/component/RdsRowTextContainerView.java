package com.robinhood.android.designsystem.row.component;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.extensions.TypedArrays;
import com.robinhood.android.designsystem.infotag.RdsInfoTag;
import com.robinhood.android.designsystem.viewstubholder.ViewStubHolder;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsRowTextContainerView.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u00102\u001a\u0002032\u000e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u000105J\u001d\u00106\u001a\u0002032\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u000108H\u0000¢\u0006\u0002\b9J\u001d\u0010:\u001a\u0002032\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u000108H\u0000¢\u0006\u0002\b;J\u001d\u0010<\u001a\u0002032\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u000108H\u0000¢\u0006\u0002\b=J\u0010\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020@H\u0002J\u0010\u0010A\u001a\u0002032\u0006\u0010B\u001a\u00020@H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R$\u0010\"\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R(\u0010*\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/component/RdsRowTextContainerView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "infoTagViewStubHolder", "Lcom/robinhood/android/designsystem/viewstubholder/ViewStubHolder;", "Lcom/robinhood/android/designsystem/infotag/RdsInfoTag;", "value", "", "primaryText", "getPrimaryText", "()Ljava/lang/CharSequence;", "setPrimaryText", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "primaryTextIcon", "getPrimaryTextIcon", "()Landroid/graphics/drawable/Drawable;", "setPrimaryTextIcon", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/content/res/ColorStateList;", "primaryTextIconTint", "getPrimaryTextIconTint", "()Landroid/content/res/ColorStateList;", "setPrimaryTextIconTint", "(Landroid/content/res/ColorStateList;)V", "secondaryText", "getSecondaryText", "setSecondaryText", "", "primaryTextMaxLines", "getPrimaryTextMaxLines", "()I", "setPrimaryTextMaxLines", "(I)V", "secondaryTextMaxLines", "getSecondaryTextMaxLines", "setSecondaryTextMaxLines", "infoTagText", "getInfoTagText", "setInfoTagText", "primaryTextView", "Landroid/widget/TextView;", "secondaryTextView", "minHeightWhenSingleLine", "minHeightWhenMultiLine", "onPrimaryTextClick", "", "action", "Lkotlin/Function0;", "setPrimaryTextColor", ResourceTypes.COLOR, "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "setPrimaryTextColor$lib_design_system_externalDebug", "setSecondaryTextColor", "setSecondaryTextColor$lib_design_system_externalDebug", "setSecondaryTextLinkColor", "setSecondaryTextLinkColor$lib_design_system_externalDebug", "updateMinHeight", "hasSecondaryText", "", "setEnabled", "enabled", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class RdsRowTextContainerView extends LinearLayout {
    private final ViewStubHolder<RdsInfoTag> infoTagViewStubHolder;
    private int minHeightWhenMultiLine;
    private int minHeightWhenSingleLine;
    private final TextView primaryTextView;
    private final TextView secondaryTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsRowTextContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C13997R.layout.merge_row_text_container, this);
        View viewFindViewById = findViewById(C13997R.id.row_info_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.infoTagViewStubHolder = new ViewStubHolder<>((ViewStub) viewFindViewById);
        View viewFindViewById2 = findViewById(C13997R.id.row_primary_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.primaryTextView = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C13997R.id.row_secondary_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.secondaryTextView = (TextView) viewFindViewById3;
        int[] RdsRowTextContainerView = C13997R.styleable.RdsRowTextContainerView;
        Intrinsics.checkNotNullExpressionValue(RdsRowTextContainerView, "RdsRowTextContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsRowTextContainerView, 0, 0);
        this.minHeightWhenSingleLine = typedArrayObtainStyledAttributes.getDimensionPixelSize(C13997R.styleable.RdsRowTextContainerView_minHeightWhenSingleLine, getMinimumHeight());
        this.minHeightWhenMultiLine = typedArrayObtainStyledAttributes.getDimensionPixelSize(C13997R.styleable.RdsRowTextContainerView_minHeightWhenMultiLine, getMinimumHeight());
        setPrimaryTextMaxLines(typedArrayObtainStyledAttributes.getInteger(C13997R.styleable.RdsRowTextContainerView_primaryTextMaxLines, getPrimaryTextMaxLines()));
        setSecondaryTextMaxLines(typedArrayObtainStyledAttributes.getInteger(C13997R.styleable.RdsRowTextContainerView_secondaryTextMaxLines, getSecondaryTextMaxLines()));
        setPrimaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowTextContainerView_primaryText));
        setPrimaryTextIcon(TypedArrays.getDrawableCompat(typedArrayObtainStyledAttributes, context, C13997R.styleable.RdsRowTextContainerView_primaryTextIcon));
        setPrimaryTextIconTint(typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.RdsRowTextContainerView_primaryTextIconTint));
        setSecondaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowTextContainerView_secondaryText));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final CharSequence getPrimaryText() {
        CharSequence text = this.primaryTextView.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final void setPrimaryText(CharSequence charSequence) {
        this.primaryTextView.setText(charSequence);
        this.primaryTextView.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
    }

    public final Drawable getPrimaryTextIcon() {
        return TextViewsKt.getDrawableEnd(this.primaryTextView);
    }

    public final void setPrimaryTextIcon(Drawable drawable) {
        TextViewsKt.setDrawableEnd(this.primaryTextView, drawable);
    }

    public final ColorStateList getPrimaryTextIconTint() {
        return this.primaryTextView.getCompoundDrawableTintList();
    }

    public final void setPrimaryTextIconTint(ColorStateList colorStateList) {
        this.primaryTextView.setCompoundDrawableTintList(colorStateList);
    }

    public final CharSequence getSecondaryText() {
        CharSequence text = this.secondaryTextView.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final void setSecondaryText(CharSequence charSequence) {
        this.secondaryTextView.setText(charSequence);
        boolean z = charSequence == null || charSequence.length() == 0;
        boolean z2 = !z;
        this.secondaryTextView.setVisibility(z ? 8 : 0);
        updateMinHeight(z2);
    }

    public final int getPrimaryTextMaxLines() {
        return this.primaryTextView.getMaxLines();
    }

    public final void setPrimaryTextMaxLines(int i) {
        this.primaryTextView.setMaxLines(i);
    }

    public final int getSecondaryTextMaxLines() {
        return this.secondaryTextView.getMaxLines();
    }

    public final void setSecondaryTextMaxLines(int i) {
        this.secondaryTextView.setMaxLines(i);
    }

    public final CharSequence getInfoTagText() {
        if (this.infoTagViewStubHolder.isInflated()) {
            return ((RdsInfoTag) this.infoTagViewStubHolder.get()).getText();
        }
        return null;
    }

    public final void setInfoTagText(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.infoTagViewStubHolder.isInflated()) {
                this.infoTagViewStubHolder.get().setVisibility(8);
            }
        } else {
            RdsInfoTag rdsInfoTag = (RdsInfoTag) this.infoTagViewStubHolder.get();
            rdsInfoTag.setIconVisible(false);
            rdsInfoTag.setTagType(RdsInfoTag.TagType.INLINE);
            rdsInfoTag.setText(charSequence);
            rdsInfoTag.setVisibility(0);
            rdsInfoTag.setEnabled(isEnabled());
        }
    }

    public final void onPrimaryTextClick(Function0<Unit> action) {
        OnClickListeners.onClick(this.primaryTextView, action);
    }

    public final void setPrimaryTextColor$lib_design_system_externalDebug(ResourceReferences4<? extends ColorStateList> color) {
        ScarletManager2.overrideAttribute(this.primaryTextView, R.attr.textColor, color);
    }

    public final void setSecondaryTextColor$lib_design_system_externalDebug(ResourceReferences4<? extends ColorStateList> color) {
        ScarletManager2.overrideAttribute(this.secondaryTextView, R.attr.textColor, color);
    }

    public final void setSecondaryTextLinkColor$lib_design_system_externalDebug(ResourceReferences4<? extends ColorStateList> color) {
        ScarletManager2.overrideAttribute(this.secondaryTextView, R.attr.textColorLink, color);
    }

    private final void updateMinHeight(boolean hasSecondaryText) {
        int i;
        if (hasSecondaryText) {
            i = this.minHeightWhenMultiLine;
        } else {
            i = this.minHeightWhenSingleLine;
        }
        setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (this.infoTagViewStubHolder.isInflated()) {
            ((RdsInfoTag) this.infoTagViewStubHolder.get()).setEnabled(enabled);
        }
    }
}
