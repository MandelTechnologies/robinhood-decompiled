package com.robinhood.android.equitydetail.p123ui.relatedlists;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.common.p088ui.CuratedListChipRecyclerView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.MergeRelatedIndustryViewBinding;
import com.robinhood.android.equitydetail.p123ui.RelatedIndustryViewData;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView;
import com.robinhood.android.equitydetail.p123ui.analytics.SdpEvent;
import com.robinhood.rosetta.eventlogging.Component;
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

/* compiled from: RelatedListsView.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u001fB\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004H\u0016R\u0018\u0010\u000b\u001a\u00060\fj\u0002`\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/relatedlists/RelatedListsView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/equitydetail/ui/RelatedIndustryViewData;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "getComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "analyticsCallbacks", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "getAnalyticsCallbacks", "()Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "setAnalyticsCallbacks", "(Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;)V", "binding", "Lcom/robinhood/android/equitydetail/databinding/MergeRelatedIndustryViewBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/MergeRelatedIndustryViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RelatedListsView extends FrameLayout implements LoggableSdpView, Bindable<RelatedIndustryViewData> {
    private LoggableSdpView.Callbacks analyticsCallbacks;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final Component.ComponentType componentType;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RelatedListsView.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/MergeRelatedIndustryViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ RelatedListsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView, android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        LoggableSdpView.DefaultImpls.onViewAttachedToWindow(this, view);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView, android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        LoggableSdpView.DefaultImpls.onViewDetachedFromWindow(this, view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelatedListsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.componentType = Component.ComponentType.RELATED_LISTS_SECTION;
        ViewGroups.inflate(this, C15314R.layout.merge_related_industry_view, true);
        this.binding = ViewBinding5.viewBinding(this, RelatedListsView3.INSTANCE);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public Component.ComponentType getComponentType() {
        return this.componentType;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public LoggableSdpView.Callbacks getAnalyticsCallbacks() {
        return this.analyticsCallbacks;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public void setAnalyticsCallbacks(LoggableSdpView.Callbacks callbacks) {
        this.analyticsCallbacks = callbacks;
    }

    private final MergeRelatedIndustryViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRelatedIndustryViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(RelatedIndustryViewData state) {
        Intrinsics.checkNotNullParameter(state, "state");
        CuratedListChipRecyclerView curatedListChipRecyclerView = getBinding().relatedIndustryCuratedListRecyclerView;
        curatedListChipRecyclerView.setCallbacks(new CuratedListChipRecyclerView.Callbacks() { // from class: com.robinhood.android.equitydetail.ui.relatedlists.RelatedListsView$bind$1$1
            @Override // com.robinhood.android.common.ui.CuratedListChipRecyclerView.Callbacks
            public void onChipClick(CuratedListChipItem data) {
                Intrinsics.checkNotNullParameter(data, "data");
                LoggableSdpView.Callbacks analyticsCallbacks = this.this$0.getAnalyticsCallbacks();
                if (analyticsCallbacks != null) {
                    analyticsCallbacks.logEvent(new SdpEvent.RelatedInstrumentSelected(data.getDisplayName()));
                }
            }
        });
        int size = state.getRelatedIndustryLists().size();
        int i = 3;
        if (size < 3) {
            i = 1;
        } else if (size < 6) {
            i = 2;
        }
        curatedListChipRecyclerView.setRowCount(i);
        curatedListChipRecyclerView.bind(state.getRelatedIndustryLists());
    }

    /* compiled from: RelatedListsView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/relatedlists/RelatedListsView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/equitydetail/ui/relatedlists/RelatedListsView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RelatedListsView> {
        private final /* synthetic */ Inflater<RelatedListsView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RelatedListsView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RelatedListsView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C15314R.layout.include_related_industry_view);
        }
    }
}
