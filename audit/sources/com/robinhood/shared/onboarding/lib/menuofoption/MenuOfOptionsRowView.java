package com.robinhood.shared.onboarding.lib.menuofoption;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.api.identi.sortinghat.SortingHatTypes2;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.onboarding.lib.menuofoption.UiMenuOfOptionsItem;
import com.robinhood.shared.onboarding.lib.menuofoption.databinding.MergeMenuOfOptionsRowViewBinding;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: MenuOfOptionsRowView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0018\u0019B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00020\u0014*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/UiMenuOfOptionsItem;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/shared/onboarding/lib/menuofoption/databinding/MergeMenuOfOptionsRowViewBinding;", "getBinding", "()Lcom/robinhood/shared/onboarding/lib/menuofoption/databinding/MergeMenuOfOptionsRowViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "rowStyling", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsRowView$RowStyling;", "Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsItemStyle;", "getRowStyling", "(Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsItemStyle;)Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsRowView$RowStyling;", "RowStyling", "Companion", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class MenuOfOptionsRowView extends RdsRippleContainerView implements Bindable<UiMenuOfOptionsItem> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MenuOfOptionsRowView.class, "binding", "getBinding()Lcom/robinhood/shared/onboarding/lib/menuofoption/databinding/MergeMenuOfOptionsRowViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MenuOfOptionsRowView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SortingHatTypes2.values().length];
            try {
                iArr[SortingHatTypes2.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SortingHatTypes2.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SortingHatTypes2.FEATURED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuOfOptionsRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C39252R.layout.merge_menu_of_options_row_view, true);
        this.binding = ViewBinding5.viewBinding(this, MenuOfOptionsRowView2.INSTANCE);
    }

    private final MergeMenuOfOptionsRowViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeMenuOfOptionsRowViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(UiMenuOfOptionsItem state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(state, "state");
        MergeMenuOfOptionsRowViewBinding binding = getBinding();
        if (state instanceof UiMenuOfOptionsItem.Standard) {
            View rowBottomDivider = binding.rowBottomDivider;
            Intrinsics.checkNotNullExpressionValue(rowBottomDivider, "rowBottomDivider");
            UiMenuOfOptionsItem.Standard standard = (UiMenuOfOptionsItem.Standard) state;
            rowBottomDivider.setVisibility(standard.getShowBottomDivider() ? 0 : 8);
            binding.rowPrimaryText.setText(standard.getItem().getPrimaryText());
            binding.rowSecondaryText.setText(standard.getItem().getSecondaryText());
            RhTextView rowSecondaryText = binding.rowSecondaryText;
            Intrinsics.checkNotNullExpressionValue(rowSecondaryText, "rowSecondaryText");
            rowSecondaryText.setVisibility(standard.getItem().getSecondaryText() != null ? 0 : 8);
            binding.rowLeadingIcon.setImageDrawable(ViewsKt.getDrawable(this, standard.getItem().getIcon().getResourceId()));
        } else {
            if (!(state instanceof UiMenuOfOptionsItem.Support)) {
                throw new NoWhenBranchMatchedException();
            }
            View rowBottomDivider2 = binding.rowBottomDivider;
            Intrinsics.checkNotNullExpressionValue(rowBottomDivider2, "rowBottomDivider");
            rowBottomDivider2.setVisibility(0);
            UiMenuOfOptionsItem.Support support = (UiMenuOfOptionsItem.Support) state;
            binding.rowPrimaryText.setText(support.getPrimaryTextRes());
            binding.rowSecondaryText.setText(support.getSecondaryTextRes());
            binding.rowLeadingIcon.setImageDrawable(ViewsKt.getDrawable(this, support.getIconRes()));
        }
        RowStyling rowStyling = getRowStyling(state.getStyle());
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(rowStyling.getRippleColor());
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        setRippleColor(colorStateListValueOf);
        binding.rowLeadingIconBadge.setVisibility(rowStyling.getIconBadgeVisibility());
        ImageView imageView = binding.rowLeadingIcon;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        imageView.setImageTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(context, rowStyling.getTextColor())));
        RhTextView rowPrimaryText = binding.rowPrimaryText;
        Intrinsics.checkNotNullExpressionValue(rowPrimaryText, "rowPrimaryText");
        TextViewsKt.setTextAppearanceAttr(rowPrimaryText, rowStyling.getPrimaryTextAppearance());
        RhTextView rowPrimaryText2 = binding.rowPrimaryText;
        Intrinsics.checkNotNullExpressionValue(rowPrimaryText2, "rowPrimaryText");
        ScarletManager2.overrideAttribute(rowPrimaryText2, android.R.attr.textColor, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, rowStyling.getTextColor()));
    }

    /* compiled from: MenuOfOptionsRowView.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsRowView$RowStyling;", "", "primaryTextAppearance", "", "textColor", "rippleColor", "iconBadgeVisibility", "<init>", "(IIII)V", "getPrimaryTextAppearance", "()I", "getTextColor", "getRippleColor", "getIconBadgeVisibility", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RowStyling {
        public static final int $stable = 0;
        private final int iconBadgeVisibility;
        private final int primaryTextAppearance;
        private final int rippleColor;
        private final int textColor;

        public static /* synthetic */ RowStyling copy$default(RowStyling rowStyling, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = rowStyling.primaryTextAppearance;
            }
            if ((i5 & 2) != 0) {
                i2 = rowStyling.textColor;
            }
            if ((i5 & 4) != 0) {
                i3 = rowStyling.rippleColor;
            }
            if ((i5 & 8) != 0) {
                i4 = rowStyling.iconBadgeVisibility;
            }
            return rowStyling.copy(i, i2, i3, i4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPrimaryTextAppearance() {
            return this.primaryTextAppearance;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTextColor() {
            return this.textColor;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRippleColor() {
            return this.rippleColor;
        }

        /* renamed from: component4, reason: from getter */
        public final int getIconBadgeVisibility() {
            return this.iconBadgeVisibility;
        }

        public final RowStyling copy(int primaryTextAppearance, int textColor, int rippleColor, int iconBadgeVisibility) {
            return new RowStyling(primaryTextAppearance, textColor, rippleColor, iconBadgeVisibility);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RowStyling)) {
                return false;
            }
            RowStyling rowStyling = (RowStyling) other;
            return this.primaryTextAppearance == rowStyling.primaryTextAppearance && this.textColor == rowStyling.textColor && this.rippleColor == rowStyling.rippleColor && this.iconBadgeVisibility == rowStyling.iconBadgeVisibility;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.primaryTextAppearance) * 31) + Integer.hashCode(this.textColor)) * 31) + Integer.hashCode(this.rippleColor)) * 31) + Integer.hashCode(this.iconBadgeVisibility);
        }

        public String toString() {
            return "RowStyling(primaryTextAppearance=" + this.primaryTextAppearance + ", textColor=" + this.textColor + ", rippleColor=" + this.rippleColor + ", iconBadgeVisibility=" + this.iconBadgeVisibility + ")";
        }

        public RowStyling(int i, int i2, int i3, int i4) {
            this.primaryTextAppearance = i;
            this.textColor = i2;
            this.rippleColor = i3;
            this.iconBadgeVisibility = i4;
        }

        public final int getPrimaryTextAppearance() {
            return this.primaryTextAppearance;
        }

        public final int getTextColor() {
            return this.textColor;
        }

        public final int getRippleColor() {
            return this.rippleColor;
        }

        public final int getIconBadgeVisibility() {
            return this.iconBadgeVisibility;
        }
    }

    private final RowStyling getRowStyling(SortingHatTypes2 sortingHatTypes2) throws Resources.NotFoundException {
        int i = WhenMappings.$EnumSwitchMapping$0[sortingHatTypes2.ordinal()];
        if (i == 1) {
            int i2 = C20690R.attr.textAppearanceRegularMedium;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new RowStyling(i2, C20690R.attr.colorForeground1, ThemeColors.getThemeColor(context, C20690R.attr.colorRippleBackground1), 4);
        }
        if (i == 2) {
            return new RowStyling(C20690R.attr.textAppearanceRegularMediumBold, C20690R.attr.colorForeground2, 0, 4);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = C20690R.attr.textAppearanceRegularMediumBold;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new RowStyling(i3, C20690R.attr.colorForeground1, ThemeColors.getThemeColor(context2, C20690R.attr.colorRippleBackground1), 0);
    }

    /* compiled from: MenuOfOptionsRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<MenuOfOptionsRowView> {
        private final /* synthetic */ Inflater<MenuOfOptionsRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public MenuOfOptionsRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (MenuOfOptionsRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C39252R.layout.include_menu_of_options_row_view);
        }
    }
}
