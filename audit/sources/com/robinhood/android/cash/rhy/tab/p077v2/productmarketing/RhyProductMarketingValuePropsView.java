package com.robinhood.android.cash.rhy.tab.p077v2.productmarketing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.productmarketing.RhyProductMarketingView;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhyProductMarketingValuePropsView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001cB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/productmarketing/RhyProductMarketingValuePropsView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/cash/rhy/tab/v2/productmarketing/RhyProductMarketingView$ValueProps;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "title", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getTitle", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "title$delegate", "Lkotlin/properties/ReadOnlyProperty;", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "getRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "recycler$delegate", "valuePropsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "", "bind", "", "state", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RhyProductMarketingValuePropsView extends FrameLayout implements Bindable<RhyProductMarketingView.ValueProps> {

    /* renamed from: recycler$delegate, reason: from kotlin metadata */
    private final Interfaces2 recycler;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    private final Interfaces2 title;
    private final GenericListAdapter<RdsRowView, String> valuePropsAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyProductMarketingValuePropsView.class, "title", "getTitle()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(RhyProductMarketingValuePropsView.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ RhyProductMarketingValuePropsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyProductMarketingValuePropsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C10285R.layout.merge_rhy_product_marketing_value_props, true);
        this.title = BindViewDelegate2.bindView$default(this, C10285R.id.product_marketing_card_title, null, 2, null);
        this.recycler = BindViewDelegate2.bindView$default(this, C10285R.id.product_marketing_card_value_props, null, 2, null);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        int i = C10285R.layout.include_rhy_product_marketing_value_prop_row;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        GenericListAdapter<RdsRowView, String> genericListAdapterM2985of = companion.m2985of(i, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.productmarketing.RhyProductMarketingValuePropsView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RhyProductMarketingValuePropsView.valuePropsAdapter$lambda$0((RdsRowView) obj, (String) obj2);
            }
        });
        this.valuePropsAdapter = genericListAdapterM2985of;
        getRecycler().setAdapter(genericListAdapterM2985of);
    }

    private final RhTextView getTitle() {
        return (RhTextView) this.title.getValue(this, $$delegatedProperties[0]);
    }

    private final RecyclerView getRecycler() {
        return (RecyclerView) this.recycler.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit valuePropsAdapter$lambda$0(RdsRowView of, String valueProp) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(valueProp, "valueProp");
        of.setPrimaryText(valueProp);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(RhyProductMarketingView.ValueProps state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getTitle().setText(state.getTitle());
        this.valuePropsAdapter.submitList(state.getValueProps());
    }

    /* compiled from: RhyProductMarketingValuePropsView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/productmarketing/RhyProductMarketingValuePropsView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/cash/rhy/tab/v2/productmarketing/RhyProductMarketingValuePropsView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RhyProductMarketingValuePropsView> {
        private final /* synthetic */ Inflater<RhyProductMarketingValuePropsView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RhyProductMarketingValuePropsView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RhyProductMarketingValuePropsView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C10285R.layout.include_rhy_product_marketing_value_props);
        }
    }
}
