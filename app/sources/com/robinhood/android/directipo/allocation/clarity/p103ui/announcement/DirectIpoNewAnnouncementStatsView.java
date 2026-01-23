package com.robinhood.android.directipo.allocation.clarity.p103ui.announcement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.databinding.MergeIpoAnnouncementStatsViewBinding;
import com.robinhood.android.directipo.allocation.clarity.p103ui.announcement.DirectIpoNewAnnouncementStatsItemView;
import com.robinhood.directipo.models.p292db.IpoAnnouncementAllocationStat;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DirectIpoNewAnnouncementStatsView.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementStatsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoAnnouncementStatsViewBinding;", "getBinding", "()Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoAnnouncementStatsViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "", "Lcom/robinhood/directipo/models/db/IpoAnnouncementAllocationStat;", "Companion", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectIpoNewAnnouncementStatsView extends LinearLayout {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoNewAnnouncementStatsView.class, "binding", "getBinding()Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoAnnouncementStatsViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectIpoNewAnnouncementStatsView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.binding = ViewBinding5.viewBinding(this, DirectIpoNewAnnouncementStatsView2.INSTANCE);
        ViewGroups.inflate(this, C14172R.layout.merge_ipo_announcement_stats_view, true);
    }

    private final MergeIpoAnnouncementStatsViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeIpoAnnouncementStatsViewBinding) value;
    }

    public final void bind(List<IpoAnnouncementAllocationStat> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getBinding().ipoAnnouncementStatsContainer.removeAllViews();
        int i = 0;
        for (Object obj : state) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            IpoAnnouncementAllocationStat ipoAnnouncementAllocationStat = (IpoAnnouncementAllocationStat) obj;
            DirectIpoNewAnnouncementStatsItemView.Companion companion = DirectIpoNewAnnouncementStatsItemView.INSTANCE;
            LinearLayout ipoAnnouncementStatsContainer = getBinding().ipoAnnouncementStatsContainer;
            Intrinsics.checkNotNullExpressionValue(ipoAnnouncementStatsContainer, "ipoAnnouncementStatsContainer");
            DirectIpoNewAnnouncementStatsItemView directIpoNewAnnouncementStatsItemViewInflate = companion.inflate((ViewGroup) ipoAnnouncementStatsContainer);
            boolean z = true;
            if (i >= state.size() - 1) {
                z = false;
            }
            directIpoNewAnnouncementStatsItemViewInflate.setShowVerticalDivider(z);
            directIpoNewAnnouncementStatsItemViewInflate.bind(ipoAnnouncementAllocationStat);
            getBinding().ipoAnnouncementStatsContainer.addView(directIpoNewAnnouncementStatsItemViewInflate);
            i = i2;
        }
    }

    /* compiled from: DirectIpoNewAnnouncementStatsView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementStatsView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementStatsView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<DirectIpoNewAnnouncementStatsView> {
        private final /* synthetic */ Inflater<DirectIpoNewAnnouncementStatsView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public DirectIpoNewAnnouncementStatsView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (DirectIpoNewAnnouncementStatsView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C14172R.layout.include_ipo_announcement_stats_view);
        }
    }
}
