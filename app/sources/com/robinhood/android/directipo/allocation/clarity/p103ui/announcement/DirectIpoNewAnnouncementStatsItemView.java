package com.robinhood.android.directipo.allocation.clarity.p103ui.announcement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.databinding.MergeIpoAnnouncementStatsItemViewBinding;
import com.robinhood.directipo.models.p292db.IpoAnnouncementAllocationStat;
import com.robinhood.utils.extensions.ViewGroups;
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

/* compiled from: DirectIpoNewAnnouncementStatsItemView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0019B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementStatsItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/directipo/models/db/IpoAnnouncementAllocationStat;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoAnnouncementStatsItemViewBinding;", "getBinding", "()Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoAnnouncementStatsItemViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "showVerticalDivider", "", "getShowVerticalDivider", "()Z", "setShowVerticalDivider", "(Z)V", "bind", "", "state", "Companion", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectIpoNewAnnouncementStatsItemView extends ConstraintLayout implements Bindable<IpoAnnouncementAllocationStat> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private boolean showVerticalDivider;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoNewAnnouncementStatsItemView.class, "binding", "getBinding()Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoAnnouncementStatsItemViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectIpoNewAnnouncementStatsItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.binding = ViewBinding5.viewBinding(this, DirectIpoNewAnnouncementStatsItemView2.INSTANCE);
        this.showVerticalDivider = true;
        ViewGroups.inflate(this, C14172R.layout.merge_ipo_announcement_stats_item_view, true);
    }

    private final MergeIpoAnnouncementStatsItemViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeIpoAnnouncementStatsItemViewBinding) value;
    }

    public final boolean getShowVerticalDivider() {
        return this.showVerticalDivider;
    }

    public final void setShowVerticalDivider(boolean z) {
        this.showVerticalDivider = z;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(IpoAnnouncementAllocationStat state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getBinding().ipoAnnouncementStatsTitle.setText(state.getTitle());
        getBinding().ipoAnnouncementStatsSubtitle.setText(state.getSubtitle());
        View ipoAnnouncementStatsVerticalDivider = getBinding().ipoAnnouncementStatsVerticalDivider;
        Intrinsics.checkNotNullExpressionValue(ipoAnnouncementStatsVerticalDivider, "ipoAnnouncementStatsVerticalDivider");
        ipoAnnouncementStatsVerticalDivider.setVisibility(this.showVerticalDivider ? 0 : 8);
    }

    /* compiled from: DirectIpoNewAnnouncementStatsItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementStatsItemView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementStatsItemView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<DirectIpoNewAnnouncementStatsItemView> {
        private final /* synthetic */ Inflater<DirectIpoNewAnnouncementStatsItemView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public DirectIpoNewAnnouncementStatsItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (DirectIpoNewAnnouncementStatsItemView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C14172R.layout.include_ipo_announcement_stats_item_view);
        }
    }
}
