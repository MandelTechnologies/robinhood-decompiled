package com.robinhood.android.directipo.allocation.p104ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.C14171R;
import com.robinhood.android.directipo.allocation.databinding.MergeDirectIpoSummaryStatItemBinding;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.directipo.models.p293ui.UiDirectIpoSummary;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DirectIpoSummaryStatItemView.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSummaryStatItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/directipo/allocation/databinding/MergeDirectIpoSummaryStatItemBinding;", "getBinding", "()Lcom/robinhood/android/directipo/allocation/databinding/MergeDirectIpoSummaryStatItemBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "statItem", "Lcom/robinhood/directipo/models/ui/UiDirectIpoSummary$StatItem;", "Companion", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectIpoSummaryStatItemView extends ConstraintLayout {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoSummaryStatItemView.class, "binding", "getBinding()Lcom/robinhood/android/directipo/allocation/databinding/MergeDirectIpoSummaryStatItemBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectIpoSummaryStatItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C14171R.layout.merge_direct_ipo_summary_stat_item, true);
        this.binding = ViewBinding5.viewBinding(this, DirectIpoSummaryStatItemView2.INSTANCE);
    }

    private final MergeDirectIpoSummaryStatItemBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeDirectIpoSummaryStatItemBinding) value;
    }

    public final void bind(UiDirectIpoSummary.StatItem statItem) throws Resources.NotFoundException {
        Integer numResolve;
        Intrinsics.checkNotNullParameter(statItem, "statItem");
        MergeDirectIpoSummaryStatItemBinding binding = getBinding();
        binding.directIpoSummaryStatRowTitle.setText(statItem.getTitle());
        binding.directIpoSummaryStatRowValue.setText(statItem.getValue());
        ImageView directIpoSummaryStatRowIcon = binding.directIpoSummaryStatRowIcon;
        Intrinsics.checkNotNullExpressionValue(directIpoSummaryStatRowIcon, "directIpoSummaryStatRowIcon");
        directIpoSummaryStatRowIcon.setVisibility(8);
        Space directIpoSummaryStatRowSpace = binding.directIpoSummaryStatRowSpace;
        Intrinsics.checkNotNullExpressionValue(directIpoSummaryStatRowSpace, "directIpoSummaryStatRowSpace");
        directIpoSummaryStatRowSpace.setVisibility(8);
        if (statItem.isEmphasized()) {
            RhTextView directIpoSummaryStatRowValue = binding.directIpoSummaryStatRowValue;
            Intrinsics.checkNotNullExpressionValue(directIpoSummaryStatRowValue, "directIpoSummaryStatRowValue");
            TextViewsKt.setTextAppearanceAttr(directIpoSummaryStatRowValue, C20690R.attr.textAppearanceDisplayMedium);
        } else {
            RhTextView directIpoSummaryStatRowValue2 = binding.directIpoSummaryStatRowValue;
            Intrinsics.checkNotNullExpressionValue(directIpoSummaryStatRowValue2, "directIpoSummaryStatRowValue");
            TextViewsKt.setTextAppearanceAttr(directIpoSummaryStatRowValue2, C20690R.attr.textAppearanceRegularLarge);
        }
        ThemedColor iconColor = statItem.getIconColor();
        String string2 = null;
        if (iconColor != null) {
            ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor = ServerToBentoColorMapper.INSTANCE.mapDayNightSelectorServerColor(iconColor.getLight(), iconColor.getDark());
            if (resourceReferences4MapDayNightSelectorServerColor != null) {
                Resources.Theme theme = getContext().getTheme();
                Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                numResolve = resourceReferences4MapDayNightSelectorServerColor.resolve(theme);
            } else {
                numResolve = null;
            }
            if (numResolve != null) {
                binding.directIpoSummaryStatRowIcon.setImageTintList(ColorStateList.valueOf(numResolve.intValue()));
            }
        }
        ServerToBentoAssetMapper2 icon = statItem.getIcon();
        if (icon != null) {
            int resourceId = icon.getResourceId();
            ImageView directIpoSummaryStatRowIcon2 = binding.directIpoSummaryStatRowIcon;
            Intrinsics.checkNotNullExpressionValue(directIpoSummaryStatRowIcon2, "directIpoSummaryStatRowIcon");
            directIpoSummaryStatRowIcon2.setVisibility(0);
            Space directIpoSummaryStatRowSpace2 = binding.directIpoSummaryStatRowSpace;
            Intrinsics.checkNotNullExpressionValue(directIpoSummaryStatRowSpace2, "directIpoSummaryStatRowSpace");
            directIpoSummaryStatRowSpace2.setVisibility(0);
            binding.directIpoSummaryStatRowIcon.setImageResource(resourceId);
            ImageView imageView = binding.directIpoSummaryStatRowIcon;
            ServerToBentoAssetMapper2 icon2 = statItem.getIcon();
            String strName = icon2 != null ? icon2.name() : null;
            if (Intrinsics.areEqual(strName, "ARROW_UP_FILL_16")) {
                string2 = getContext().getResources().getString(C11048R.string.general_label_delta_up);
            } else if (Intrinsics.areEqual(strName, "ARROW_DOWN_FILL_16")) {
                string2 = getContext().getResources().getString(C11048R.string.general_label_delta_down);
            }
            imageView.setContentDescription(string2);
        }
    }

    /* compiled from: DirectIpoSummaryStatItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSummaryStatItemView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSummaryStatItemView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<DirectIpoSummaryStatItemView> {
        private final /* synthetic */ Inflater<DirectIpoSummaryStatItemView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public DirectIpoSummaryStatItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (DirectIpoSummaryStatItemView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C14171R.layout.merge_direct_ipo_summary_stat_item);
        }
    }
}
