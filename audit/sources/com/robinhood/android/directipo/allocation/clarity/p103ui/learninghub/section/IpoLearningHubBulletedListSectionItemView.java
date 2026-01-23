package com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.databinding.MergeIpoLearningHubBulletedListSectionItemViewBinding;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.directipo.models.p292db.BulletItem;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: IpoLearningHubBulletedListSectionItemView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/section/IpoLearningHubBulletedListSectionItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/directipo/models/db/BulletItem;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoLearningHubBulletedListSectionItemViewBinding;", "getBinding", "()Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoLearningHubBulletedListSectionItemViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Companion", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class IpoLearningHubBulletedListSectionItemView extends ConstraintLayout implements Bindable<BulletItem> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IpoLearningHubBulletedListSectionItemView.class, "binding", "getBinding()Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoLearningHubBulletedListSectionItemViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IpoLearningHubBulletedListSectionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, IpoLearningHubBulletedListSectionItemView2.INSTANCE);
        ViewGroups.inflate(this, C14172R.layout.merge_ipo_learning_hub_bulleted_list_section_item_view, true);
    }

    private final MergeIpoLearningHubBulletedListSectionItemViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeIpoLearningHubBulletedListSectionItemViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(BulletItem state) {
        Integer numResolve;
        Intrinsics.checkNotNullParameter(state, "state");
        getBinding().bulletedListItemLabel.setText(state.getLabel());
        getBinding().bulletedListItemIcon.setImageDrawable(ViewsKt.getDrawable(this, state.getIcon().getResourceId()));
        ThemedColor iconColor = state.getIconColor();
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
                getBinding().bulletedListItemIcon.setImageTintList(ColorStateList.valueOf(numResolve.intValue()));
            }
        }
    }

    /* compiled from: IpoLearningHubBulletedListSectionItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/section/IpoLearningHubBulletedListSectionItemView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/section/IpoLearningHubBulletedListSectionItemView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<IpoLearningHubBulletedListSectionItemView> {
        private final /* synthetic */ Inflater<IpoLearningHubBulletedListSectionItemView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public IpoLearningHubBulletedListSectionItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (IpoLearningHubBulletedListSectionItemView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C14172R.layout.include_ipo_learning_hub_bulleted_list_section_item_view);
        }
    }
}
