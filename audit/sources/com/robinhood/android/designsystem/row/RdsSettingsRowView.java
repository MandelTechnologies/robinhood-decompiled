package com.robinhood.android.designsystem.row;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.extensions.TypedArrays;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RdsSettingsRowView.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0016\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010,\u001a\u00020-2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010*H\u0007¢\u0006\u0002\b0J\u0016\u0010,\u001a\u00020-2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010*J\u001d\u00102\u001a\u00020-2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010*H\u0007¢\u0006\u0002\b3J\u0016\u00102\u001a\u00020-2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010*J\u0016\u00104\u001a\u00020-2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208J\u0010\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020#H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R(\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R$\u0010$\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010*X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsSettingsRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "metadataTextView", "Landroid/widget/TextView;", "labelTextView", "valueTextView", "trailingIconView", "Landroid/widget/ImageView;", StatisticsSection2.DIVIDER, "Landroid/view/View;", "value", "", "labelText", "getLabelText", "()Ljava/lang/CharSequence;", "setLabelText", "(Ljava/lang/CharSequence;)V", "valueText", "getValueText", "setValueText", "Landroid/graphics/drawable/Drawable;", "trailingIcon", "getTrailingIcon", "()Landroid/graphics/drawable/Drawable;", "setTrailingIcon", "(Landroid/graphics/drawable/Drawable;)V", "metadataText", "getMetadataText", "setMetadataText", "", "showBottomDivider", "getShowBottomDivider", "()Z", "setShowBottomDivider", "(Z)V", "originalLabelTextColor", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "originalValueTextColor", "overrideLabelAndValueTextColor", "", ResourceTypes.COLOR, "Landroid/content/res/ColorStateList;", "overrideLabelAndValueTextColorStateList", "", "setMetadataTextColor", "setMetadataTextColorStateList", "rotateTrailingIcon", "rotateBy", "", "animationDuration", "", "setEnabled", "enabled", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class RdsSettingsRowView extends RdsRippleContainerView {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final View divider;
    private final TextView labelTextView;
    private final TextView metadataTextView;
    private final ResourceReferences4<?> originalLabelTextColor;
    private final ResourceReferences4<?> originalValueTextColor;
    private final ImageView trailingIconView;
    private final TextView valueTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsSettingsRowView(Context context, AttributeSet attributeSet) {
        TextView textView;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] RdsSettingsRowView = C13997R.styleable.RdsSettingsRowView;
        Intrinsics.checkNotNullExpressionValue(RdsSettingsRowView, "RdsSettingsRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsSettingsRowView, 0, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsSettingsRowView_isCondensed, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            View.inflate(context, C13997R.layout.merge_rds_settings_row_condensed, this);
            textView = null;
        } else {
            View.inflate(context, C13997R.layout.merge_rds_settings_row_stacked, this);
            textView = (TextView) findViewById(C13997R.id.settings_row_metadata_text);
        }
        this.metadataTextView = textView;
        View viewFindViewById = findViewById(C13997R.id.settings_row_label_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById;
        this.labelTextView = textView2;
        View viewFindViewById2 = findViewById(C13997R.id.settings_row_value_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView3 = (TextView) viewFindViewById2;
        this.valueTextView = textView3;
        View viewFindViewById3 = findViewById(C13997R.id.settings_row_trailing_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.trailingIconView = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C13997R.id.settings_row_bottom_divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.divider = viewFindViewById4;
        int[] RdsSettingsRowView2 = C13997R.styleable.RdsSettingsRowView;
        Intrinsics.checkNotNullExpressionValue(RdsSettingsRowView2, "RdsSettingsRowView");
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, RdsSettingsRowView2, 0, 0);
        setLabelText(typedArrayObtainStyledAttributes2.getText(C13997R.styleable.RdsSettingsRowView_labelText));
        setValueText(typedArrayObtainStyledAttributes2.getText(C13997R.styleable.RdsSettingsRowView_valueText));
        setMetadataText(typedArrayObtainStyledAttributes2.getText(C13997R.styleable.RdsSettingsRowView_metadataText));
        setTrailingIcon(TypedArrays.getDrawableCompat(typedArrayObtainStyledAttributes2, context, C13997R.styleable.RdsSettingsRowView_trailingIcon));
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(C13997R.styleable.RdsSettingsRowView_android_enabled, isEnabled()));
        setShowBottomDivider(typedArrayObtainStyledAttributes2.getBoolean(C13997R.styleable.RdsSettingsRowView_showBottomDivider, getShowBottomDivider()));
        typedArrayObtainStyledAttributes2.recycle();
        this.originalLabelTextColor = ScarletManager2.getAttribute(textView2, R.attr.textColor);
        this.originalValueTextColor = ScarletManager2.getAttribute(textView3, R.attr.textColor);
    }

    public final CharSequence getLabelText() {
        return this.labelTextView.getText();
    }

    public final void setLabelText(CharSequence charSequence) {
        this.labelTextView.setText(charSequence);
        this.labelTextView.setVisibility(charSequence == null || StringsKt.isBlank(charSequence) ? 8 : 0);
    }

    public final CharSequence getValueText() {
        return this.valueTextView.getText();
    }

    public final void setValueText(CharSequence charSequence) {
        this.valueTextView.setText(charSequence);
        this.valueTextView.setVisibility(charSequence == null || StringsKt.isBlank(charSequence) ? 8 : 0);
    }

    public final Drawable getTrailingIcon() {
        return this.trailingIconView.getDrawable();
    }

    public final void setTrailingIcon(Drawable drawable) {
        this.trailingIconView.setImageDrawable(drawable);
        this.trailingIconView.setVisibility(drawable != null ? 0 : 8);
    }

    public final CharSequence getMetadataText() {
        TextView textView = this.metadataTextView;
        if (textView != null) {
            return textView.getText();
        }
        return null;
    }

    public final void setMetadataText(CharSequence charSequence) {
        TextView textView = this.metadataTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
        TextView textView2 = this.metadataTextView;
        if (textView2 != null) {
            textView2.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        }
    }

    public final boolean getShowBottomDivider() {
        return this.divider.getVisibility() == 0;
    }

    public final void setShowBottomDivider(boolean z) {
        this.divider.setVisibility(z ? 0 : 8);
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

    @JvmName
    public final void setMetadataTextColorStateList(ResourceReferences4<? extends ColorStateList> color) {
        TextView textView = this.metadataTextView;
        if (textView != null) {
            ScarletManager2.overrideAttribute(textView, R.attr.textColor, color);
        }
    }

    public final void setMetadataTextColor(ResourceReferences4<Integer> color) {
        TextView textView = this.metadataTextView;
        if (textView != null) {
            ScarletManager2.overrideAttribute(textView, R.attr.textColor, color);
        }
    }

    public final void rotateTrailingIcon(float rotateBy, long animationDuration) {
        this.trailingIconView.animate().rotationBy(rotateBy).setDuration(animationDuration);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.labelTextView.setEnabled(enabled);
        this.valueTextView.setEnabled(enabled);
        this.trailingIconView.setEnabled(enabled);
        TextView textView = this.metadataTextView;
        if (textView != null) {
            textView.setEnabled(enabled);
        }
    }

    /* compiled from: RdsSettingsRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsSettingsRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/row/RdsSettingsRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RdsSettingsRowView> {
        private final /* synthetic */ Inflater<RdsSettingsRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsSettingsRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsSettingsRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C13997R.layout.include_rds_settings_row);
        }
    }
}
