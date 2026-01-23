package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.extensions.TypedArrays;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;
import com.robinhood.android.designsystem.viewstubholder.ViewStubHolder;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FrequencySelectionRowView.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u0000 92\u00020\u0001:\u00019B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00102\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0010J\u0010\u00102\u001a\u00020/2\b\b\u0001\u00103\u001a\u000204J\u000e\u00105\u001a\u00020/2\u0006\u00106\u001a\u000204J\u0010\u00107\u001a\u00020/2\u0006\u00108\u001a\u00020(H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R(\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010%\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R$\u0010)\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "textContainerView", "Lcom/robinhood/android/designsystem/row/component/RdsRowTextContainerView;", StatisticsSection2.DIVIDER, "Landroid/view/View;", "trailingIconViewStubHolder", "Lcom/robinhood/android/designsystem/viewstubholder/ViewStubHolder;", "Landroid/widget/ImageView;", "value", "", "primaryText", "getPrimaryText", "()Ljava/lang/CharSequence;", "setPrimaryText", "(Ljava/lang/CharSequence;)V", "secondaryText", "getSecondaryText", "setSecondaryText", "Landroid/graphics/drawable/Drawable;", "trailingIconDrawable", "getTrailingIconDrawable", "()Landroid/graphics/drawable/Drawable;", "setTrailingIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/content/res/ColorStateList;", "trailingIconTint", "getTrailingIconTint", "()Landroid/content/res/ColorStateList;", "setTrailingIconTint", "(Landroid/content/res/ColorStateList;)V", "trailingIconContentDescription", "getTrailingIconContentDescription", "setTrailingIconContentDescription", "", "showBottomDivider", "getShowBottomDivider", "()Z", "setShowBottomDivider", "(Z)V", "bind", "", "newPrimaryText", "newSecondaryText", "setTrailingIconResource", "iconResourceId", "", "setTrailingIconVisibility", "visibility", "setEnabled", "enabled", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public class FrequencySelectionRowView extends RdsRippleContainerView {
    private final View divider;
    private final RdsRowTextContainerView textContainerView;
    private CharSequence trailingIconContentDescription;
    private ColorStateList trailingIconTint;
    private ViewStubHolder<ImageView> trailingIconViewStubHolder;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrequencySelectionRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C30082R.layout.merge_frequency_selection_view, this);
        View viewFindViewById = findViewById(C30082R.id.row_text_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.textContainerView = (RdsRowTextContainerView) viewFindViewById;
        View viewFindViewById2 = findViewById(C30082R.id.row_bottom_divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.divider = viewFindViewById2;
        View viewFindViewById3 = findViewById(C30082R.id.row_trailing_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.trailingIconViewStubHolder = new ViewStubHolder<>((ViewStub) viewFindViewById3);
        int[] RdsRowView = C13997R.styleable.RdsRowView;
        Intrinsics.checkNotNullExpressionValue(RdsRowView, "RdsRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsRowView, 0, 0);
        setPrimaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowView_primaryText));
        setSecondaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowView_secondaryText));
        setTrailingIconDrawable(TypedArrays.getDrawableCompat(typedArrayObtainStyledAttributes, context, C13997R.styleable.RdsRowView_trailingIcon));
        setTrailingIconTint(typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.RdsRowView_trailingIconTint));
        setTrailingIconContentDescription(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowView_trailingIconContentDescription));
        setShowBottomDivider(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsRowView_showBottomDivider, false));
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsRowView_android_enabled, isEnabled()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final CharSequence getPrimaryText() {
        return this.textContainerView.getPrimaryText();
    }

    public final void setPrimaryText(CharSequence charSequence) {
        this.textContainerView.setPrimaryText(charSequence);
    }

    public final CharSequence getSecondaryText() {
        return this.textContainerView.getSecondaryText();
    }

    public final void setSecondaryText(CharSequence charSequence) {
        this.textContainerView.setSecondaryText(charSequence);
    }

    public final Drawable getTrailingIconDrawable() {
        if (this.trailingIconViewStubHolder.isInflated()) {
            return ((ImageView) this.trailingIconViewStubHolder.get()).getDrawable();
        }
        return null;
    }

    public final void setTrailingIconDrawable(Drawable drawable) {
        if (drawable != null || this.trailingIconViewStubHolder.isInflated()) {
            ImageView imageView = (ImageView) this.trailingIconViewStubHolder.get();
            imageView.setImageDrawable(drawable);
            imageView.setImageTintList(this.trailingIconTint);
            imageView.setContentDescription(this.trailingIconContentDescription);
            imageView.setVisibility(drawable != null ? 0 : 8);
            imageView.setEnabled(isEnabled());
        }
    }

    public final ColorStateList getTrailingIconTint() {
        return this.trailingIconTint;
    }

    public final void setTrailingIconTint(ColorStateList colorStateList) {
        this.trailingIconTint = colorStateList;
        if (this.trailingIconViewStubHolder.isInflated()) {
            ((ImageView) this.trailingIconViewStubHolder.get()).setImageTintList(colorStateList);
        }
    }

    public final CharSequence getTrailingIconContentDescription() {
        return this.trailingIconContentDescription;
    }

    public final void setTrailingIconContentDescription(CharSequence charSequence) {
        this.trailingIconContentDescription = charSequence;
        if (this.trailingIconViewStubHolder.isInflated()) {
            ((ImageView) this.trailingIconViewStubHolder.get()).setContentDescription(charSequence);
        }
    }

    public final boolean getShowBottomDivider() {
        return this.divider.getVisibility() == 0;
    }

    public final void setShowBottomDivider(boolean z) {
        this.divider.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void bind$default(FrequencySelectionRowView frequencySelectionRowView, CharSequence charSequence, CharSequence charSequence2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((i & 2) != 0) {
            charSequence2 = null;
        }
        frequencySelectionRowView.bind(charSequence, charSequence2);
    }

    public final void bind(CharSequence newPrimaryText, CharSequence newSecondaryText) {
        Intrinsics.checkNotNullParameter(newPrimaryText, "newPrimaryText");
        setPrimaryText(newPrimaryText);
        setSecondaryText(newSecondaryText);
    }

    public final void setTrailingIconResource(int iconResourceId) {
        setTrailingIconDrawable(ViewsKt.getDrawable(this, iconResourceId));
    }

    public final void setTrailingIconVisibility(int visibility) {
        ((ImageView) this.trailingIconViewStubHolder.get()).setVisibility(visibility);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.textContainerView.setEnabled(enabled);
        if (this.trailingIconViewStubHolder.isInflated()) {
            ((ImageView) this.trailingIconViewStubHolder.get()).setEnabled(enabled);
        }
    }

    /* compiled from: FrequencySelectionRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/FrequencySelectionRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<FrequencySelectionRowView> {
        private final /* synthetic */ Inflater<FrequencySelectionRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public FrequencySelectionRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (FrequencySelectionRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C30082R.layout.include_frequency_selection_row_view);
        }
    }
}
