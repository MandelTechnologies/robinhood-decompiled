package com.robinhood.android.designsystem.row;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.extensions.TypedArrays;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.p409ui.view.Inflater;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsDataRowView.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0016\u0018\u0000 H2\u00020\u0001:\u0003GHIB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010@\u001a\u00020A2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010>H\u0007¢\u0006\u0002\bCJ\u0016\u0010@\u001a\u00020A2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010>J\u0012\u0010D\u001a\u00020A2\b\u0010E\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010F\u001a\u00020AH\u0002R\u0014\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000bR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R(\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R(\u0010\u0019\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\f\u001a\u0004\u0018\u00010\u001c@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\f\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010(\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u00020-2\u0006\u0010\f\u001a\u00020-@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u00103\u001a\u0004\u0018\u00010\u001c2\b\u0010\f\u001a\u0004\u0018\u00010\u001c@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R(\u00106\u001a\u0004\u0018\u00010\"2\b\u0010\f\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010%\"\u0004\b8\u0010'R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010:X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u00010>X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\b\u0012\u0002\b\u0003\u0018\u00010>X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dataRowType", "", "getDataRowType$annotations", "()V", "value", "", "labelText", "getLabelText", "()Ljava/lang/CharSequence;", "setLabelText", "(Ljava/lang/CharSequence;)V", "valueText", "getValueText", "setValueText", "descriptionText", "getDescriptionText", "setDescriptionText", "visibilityValueText", "getVisibilityValueText", "setVisibilityValueText", "Landroid/graphics/drawable/Drawable;", "labelIconDrawable", "getLabelIconDrawable", "()Landroid/graphics/drawable/Drawable;", "setLabelIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/content/res/ColorStateList;", "labelIconTint", "getLabelIconTint", "()Landroid/content/res/ColorStateList;", "setLabelIconTint", "(Landroid/content/res/ColorStateList;)V", "labelIconSize", "getLabelIconSize", "()I", "setLabelIconSize", "(I)V", "", "valueTextWrapContent", "getValueTextWrapContent", "()Z", "setValueTextWrapContent", "(Z)V", "valueIconRightDrawable", "getValueIconRightDrawable", "setValueIconRightDrawable", "valueIconTint", "getValueIconTint", "setValueIconTint", "labelTextView", "Landroid/widget/TextView;", "valueTextView", "descriptionTextView", "originalLabelTextColor", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "originalValueTextColor", "overrideLabelAndValueTextColor", "", ResourceTypes.COLOR, "overrideLabelAndValueTextColorStateList", "setValueIconDrawable", "iconDrawable", "updateLabelIconBounds", "Type", "Companion", "CondensedRowInflater", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public class RdsDataRowView extends FrameLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int dataRowType;
    private final TextView descriptionTextView;
    private Drawable labelIconDrawable;
    private int labelIconSize;
    private final TextView labelTextView;
    private final ResourceReferences4<?> originalLabelTextColor;
    private final ResourceReferences4<?> originalValueTextColor;
    private Drawable valueIconRightDrawable;
    private final TextView valueTextView;
    private boolean valueTextWrapContent;

    private static /* synthetic */ void getDataRowType$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsDataRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] RdsDataRowView = C13997R.styleable.RdsDataRowView;
        Intrinsics.checkNotNullExpressionValue(RdsDataRowView, "RdsDataRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsDataRowView, 0, 0);
        int i = typedArrayObtainStyledAttributes.getInt(C13997R.styleable.RdsDataRowView_type, 0);
        this.dataRowType = i;
        View.inflate(context, i == 1 ? C13997R.layout.merge_rds_data_condensed_row : C13997R.layout.merge_rds_data_row, this);
        typedArrayObtainStyledAttributes.recycle();
        View viewFindViewById = findViewById(C13997R.id.data_row_label_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.labelTextView = textView;
        View viewFindViewById2 = findViewById(C13997R.id.data_row_value_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById2;
        this.valueTextView = textView2;
        this.descriptionTextView = (TextView) findViewById(C13997R.id.data_row_description_text);
        int[] RdsDataRowView2 = C13997R.styleable.RdsDataRowView;
        Intrinsics.checkNotNullExpressionValue(RdsDataRowView2, "RdsDataRowView");
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, RdsDataRowView2, 0, 0);
        setLabelText(typedArrayObtainStyledAttributes2.getText(C13997R.styleable.RdsDataRowView_labelText));
        setValueText(typedArrayObtainStyledAttributes2.getText(C13997R.styleable.RdsDataRowView_valueText));
        setDescriptionText(typedArrayObtainStyledAttributes2.getText(C13997R.styleable.RdsDataRowView_descriptionText));
        if (typedArrayObtainStyledAttributes2.hasValue(C13997R.styleable.RdsDataRowView_valueIcon) && this.dataRowType == 1) {
            setValueIconDrawable(TypedArrays.getDrawableCompat(typedArrayObtainStyledAttributes2, context, C13997R.styleable.RdsDataRowView_valueIcon));
        }
        if (typedArrayObtainStyledAttributes2.hasValue(C13997R.styleable.RdsDataRowView_valueIconTint)) {
            setValueIconTint(typedArrayObtainStyledAttributes2.getColorStateList(C13997R.styleable.RdsDataRowView_valueIconTint));
        }
        if (typedArrayObtainStyledAttributes2.hasValue(C13997R.styleable.RdsDataRowView_valueIconPadding)) {
            textView2.setCompoundDrawablePadding(typedArrayObtainStyledAttributes2.getDimensionPixelSize(C13997R.styleable.RdsDataRowView_valueIconPadding, textView2.getCompoundDrawablePadding()));
        }
        setValueIconRightDrawable(TypedArrays.getDrawableCompat(typedArrayObtainStyledAttributes2, context, C13997R.styleable.RdsDataRowView_valueIconRight));
        setLabelIconSize(typedArrayObtainStyledAttributes2.getDimensionPixelSize(C13997R.styleable.RdsDataRowView_labelIconSize, this.labelIconSize));
        textView.setCompoundDrawablePadding(typedArrayObtainStyledAttributes2.getDimensionPixelSize(C13997R.styleable.RdsDataRowView_labelIconPadding, textView.getCompoundDrawablePadding()));
        setLabelIconDrawable(TypedArrays.getDrawableCompat(typedArrayObtainStyledAttributes2, context, C13997R.styleable.RdsDataRowView_labelIcon));
        setLabelIconTint(typedArrayObtainStyledAttributes2.getColorStateList(C13997R.styleable.RdsDataRowView_labelIconTint));
        typedArrayObtainStyledAttributes2.recycle();
        this.originalLabelTextColor = ScarletManager2.getAttribute(textView, R.attr.textColor);
        this.originalValueTextColor = ScarletManager2.getAttribute(textView2, R.attr.textColor);
    }

    public final CharSequence getLabelText() {
        return this.labelTextView.getText();
    }

    public final void setLabelText(CharSequence charSequence) {
        this.labelTextView.setText(charSequence);
    }

    public final CharSequence getValueText() {
        return this.valueTextView.getText();
    }

    public final void setValueText(CharSequence charSequence) {
        this.valueTextView.setText(charSequence);
    }

    public final CharSequence getDescriptionText() {
        TextView textView = this.descriptionTextView;
        if (textView != null) {
            return textView.getText();
        }
        return null;
    }

    public final void setDescriptionText(CharSequence charSequence) {
        TextView textView = this.descriptionTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
        TextView textView2 = this.descriptionTextView;
        if (textView2 != null) {
            textView2.setVisibility(charSequence != null ? 0 : 8);
        }
    }

    public final CharSequence getVisibilityValueText() {
        if (getVisibility() == 0) {
            return getValueText();
        }
        return null;
    }

    public final void setVisibilityValueText(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            setValueText(null);
            setVisibility(8);
        } else {
            setValueText(charSequence);
            setVisibility(0);
        }
    }

    public final Drawable getLabelIconDrawable() {
        return this.labelIconDrawable;
    }

    public final void setLabelIconDrawable(Drawable drawable) {
        this.labelIconDrawable = drawable;
        updateLabelIconBounds();
        this.labelTextView.setCompoundDrawablesRelative(null, null, this.labelIconDrawable, null);
    }

    public final ColorStateList getLabelIconTint() {
        return this.labelTextView.getCompoundDrawableTintList();
    }

    public final void setLabelIconTint(ColorStateList colorStateList) {
        this.labelTextView.setCompoundDrawableTintList(colorStateList);
    }

    public final int getLabelIconSize() {
        return this.labelIconSize;
    }

    public final void setLabelIconSize(int i) {
        this.labelIconSize = i;
        updateLabelIconBounds();
    }

    public final boolean getValueTextWrapContent() {
        return this.valueTextWrapContent;
    }

    public final void setValueTextWrapContent(boolean z) {
        this.valueTextWrapContent = z;
        this.valueTextView.getLayoutParams().width = z ? -2 : -1;
    }

    public final Drawable getValueIconRightDrawable() {
        return this.valueIconRightDrawable;
    }

    public final void setValueIconRightDrawable(Drawable drawable) {
        this.valueIconRightDrawable = drawable;
        setValueTextWrapContent(true);
        this.valueTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.valueIconRightDrawable, (Drawable) null);
    }

    public final ColorStateList getValueIconTint() {
        return this.valueTextView.getCompoundDrawableTintList();
    }

    public final void setValueIconTint(ColorStateList colorStateList) {
        this.valueTextView.setCompoundDrawableTintList(colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmName
    public final void overrideLabelAndValueTextColorStateList(ResourceReferences4<? extends ColorStateList> color) {
        ScarletManager2.overrideAttribute(this.labelTextView, R.attr.textColor, color == null ? this.originalLabelTextColor : color);
        TextView textView = this.valueTextView;
        ResourceReferences4 resourceReferences4 = color;
        if (color == null) {
            resourceReferences4 = this.originalValueTextColor;
        }
        ScarletManager2.overrideAttribute(textView, R.attr.textColor, resourceReferences4);
    }

    public final void overrideLabelAndValueTextColor(ResourceReferences4<Integer> color) {
        overrideLabelAndValueTextColorStateList(color != null ? ResourceReferences5.toColorStateList(color) : null);
    }

    /* compiled from: RdsDataRowView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsDataRowView$Type;", "", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    /* loaded from: classes2.dex */
    public @interface Type {
        public static final int CONDENSED = 1;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int STANDARD = 0;

        /* compiled from: RdsDataRowView.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsDataRowView$Type$Companion;", "", "<init>", "()V", "STANDARD", "", "CONDENSED", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int CONDENSED = 1;
            public static final int STANDARD = 0;

            private Companion() {
            }
        }
    }

    private final void setValueIconDrawable(Drawable iconDrawable) {
        this.valueTextView.setCompoundDrawablesWithIntrinsicBounds(iconDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private final void updateLabelIconBounds() {
        Drawable drawable = this.labelIconDrawable;
        if (drawable != null) {
            int intrinsicWidth = this.labelIconSize;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            int intrinsicHeight = this.labelIconSize;
            if (intrinsicHeight == 0) {
                intrinsicHeight = drawable.getIntrinsicHeight();
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
    }

    /* compiled from: RdsDataRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsDataRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RdsDataRowView> {
        private final /* synthetic */ Inflater<RdsDataRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsDataRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsDataRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C13997R.layout.include_rds_data_row);
        }
    }

    /* compiled from: RdsDataRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsDataRowView$CondensedRowInflater;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class CondensedRowInflater implements Inflater<RdsDataRowView> {
        public static final CondensedRowInflater INSTANCE = new CondensedRowInflater();
        private final /* synthetic */ Inflater<RdsDataRowView> $$delegate_0 = Inflater.INSTANCE.include(C13997R.layout.include_rds_data_row_condensed);

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsDataRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsDataRowView) this.$$delegate_0.inflate(parent);
        }

        private CondensedRowInflater() {
        }
    }
}
