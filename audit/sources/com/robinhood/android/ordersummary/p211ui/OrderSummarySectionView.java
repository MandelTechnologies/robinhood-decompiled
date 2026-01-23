package com.robinhood.android.ordersummary.p211ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.ordersummary.C25242R;
import com.robinhood.android.ordersummary.databinding.MergeOrderSummaryExplanationSectionBinding;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.ordersummary.models.api.ApiRow;
import com.robinhood.ordersummary.models.api.ApiSection;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OrderSummarySectionView.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002$%B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010 \u001a\u00020!H\u0014J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0003H\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/ordersummary/ui/OrderSummarySectionView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/ordersummary/models/api/ApiSection;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/ordersummary/databinding/MergeOrderSummaryExplanationSectionBinding;", "getBinding", "()Lcom/robinhood/android/ordersummary/databinding/MergeOrderSummaryExplanationSectionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/ordersummary/ui/OrderSummarySectionView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/ordersummary/ui/OrderSummarySectionView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/ordersummary/ui/OrderSummarySectionView$Callbacks;)V", "rowsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/ordersummary/models/api/ApiRow;", "onAttachedToWindow", "", "bind", "state", "Callbacks", "Companion", "feature-lib-order-summary_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OrderSummarySectionView extends Hammer_OrderSummarySectionView implements Bindable<ApiSection> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderSummarySectionView.class, "binding", "getBinding()Lcom/robinhood/android/ordersummary/databinding/MergeOrderSummaryExplanationSectionBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;
    public Markwon markwon;
    private final GenericListAdapter<RdsRowView, ApiRow> rowsAdapter;

    /* compiled from: OrderSummarySectionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/ordersummary/ui/OrderSummarySectionView$Callbacks;", "", "onLinkClicked", "", "feature-lib-order-summary_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onLinkClicked();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderSummarySectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, OrderSummarySectionView2.INSTANCE);
        GenericListAdapter<RdsRowView, ApiRow> genericListAdapterM2985of = GenericListAdapter.INSTANCE.m2985of(C25242R.layout.view_order_summary_explanation_row, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.ordersummary.ui.OrderSummarySectionView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderSummarySectionView.rowsAdapter$lambda$0(this.f$0, (RdsRowView) obj, (ApiRow) obj2);
            }
        });
        this.rowsAdapter = genericListAdapterM2985of;
        setOrientation(1);
        ViewGroups.inflate(this, C25242R.layout.merge_order_summary_explanation_section, true);
        RecyclerView recyclerView = getBinding().recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(genericListAdapterM2985of);
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    private final MergeOrderSummaryExplanationSectionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeOrderSummaryExplanationSectionBinding) value;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rowsAdapter$lambda$0(OrderSummarySectionView orderSummarySectionView, RdsRowView of, ApiRow row) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(row, "row");
        RdsRowView.bind$default(of, row.getTitle(), orderSummarySectionView.getMarkwon().toMarkdown(row.getSubtitle_markdown()), null, null, null, 28, null);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(Markwons.linkClicks(getMarkwon()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.ordersummary.ui.OrderSummarySectionView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderSummarySectionView.onAttachedToWindow$lambda$2(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2(OrderSummarySectionView orderSummarySectionView, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Callbacks callbacks = orderSummarySectionView.callbacks;
        if (callbacks != null) {
            callbacks.onLinkClicked();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(ApiSection state) {
        Intrinsics.checkNotNullParameter(state, "state");
        MergeOrderSummaryExplanationSectionBinding binding = getBinding();
        binding.titleTxt.setText(state.getTitle());
        binding.descriptionTxt.setText(getMarkwon().toMarkdown(state.getDescription_markdown()));
        this.rowsAdapter.submitList(state.getRows());
    }

    /* compiled from: OrderSummarySectionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/ordersummary/ui/OrderSummarySectionView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/ordersummary/ui/OrderSummarySectionView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-order-summary_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OrderSummarySectionView> {
        private final /* synthetic */ Inflater<OrderSummarySectionView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OrderSummarySectionView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OrderSummarySectionView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C25242R.layout.include_order_summary_section);
        }
    }
}
