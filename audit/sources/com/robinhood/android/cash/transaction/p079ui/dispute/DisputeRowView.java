package com.robinhood.android.cash.transaction.p079ui.dispute;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.cash.transaction.databinding.MergeDisputeRowViewBinding;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.models.p320db.mcduckling.Dispute;
import com.robinhood.models.util.Money;
import com.robinhood.shared.history.formatters.legacy.C39006R;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DisputeRowView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u001d\u001eB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/dispute/DisputeRowView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/cash/transaction/ui/dispute/DisputeRowViewState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/cash/transaction/ui/dispute/DisputeRowView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/cash/transaction/ui/dispute/DisputeRowView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/cash/transaction/ui/dispute/DisputeRowView$Callbacks;)V", "binding", "Lcom/robinhood/android/cash/transaction/databinding/MergeDisputeRowViewBinding;", "getBinding", "()Lcom/robinhood/android/cash/transaction/databinding/MergeDisputeRowViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "lineItemAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "bind", "", "state", "Callbacks", "Companion", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DisputeRowView extends LinearLayout implements Bindable<DisputeRowViewState> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;
    private final GenericListAdapter<RdsDataRowView, TransactionLineItem> lineItemAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DisputeRowView.class, "binding", "getBinding()Lcom/robinhood/android/cash/transaction/databinding/MergeDisputeRowViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DisputeRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/dispute/DisputeRowView$Callbacks;", "", "onCancelDispute", "", "disputeId", "Ljava/util/UUID;", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCancelDispute(UUID disputeId);
    }

    public /* synthetic */ DisputeRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisputeRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, DisputeRowView2.INSTANCE);
        GenericListAdapter<RdsDataRowView, TransactionLineItem> genericListAdapterM2987of = GenericListAdapter.INSTANCE.m2987of(RdsDataRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.cash.transaction.ui.dispute.DisputeRowView$lineItemAdapter$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((TransactionLineItem) obj).getTitle();
            }
        }), new Function2() { // from class: com.robinhood.android.cash.transaction.ui.dispute.DisputeRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DisputeRowView.lineItemAdapter$lambda$0((RdsDataRowView) obj, (TransactionLineItem) obj2);
            }
        });
        this.lineItemAdapter = genericListAdapterM2987of;
        setOrientation(1);
        ViewGroups.inflate(this, C10421R.layout.merge_dispute_row_view, true);
        getBinding().disputeRowRecyclerView.setAdapter(genericListAdapterM2987of);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    private final MergeDisputeRowViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeDisputeRowViewBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lineItemAdapter$lambda$0(RdsDataRowView of, TransactionLineItem lineItem) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(lineItem, "lineItem");
        of.setLabelText(lineItem.getTitle());
        of.setValueText(lineItem.getDetail());
        of.setDescriptionText(lineItem.getDescription());
        of.setClickable(false);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(DisputeRowViewState state) {
        String string2;
        Intrinsics.checkNotNullParameter(state, "state");
        final Dispute dispute = state.getDispute();
        RhTextView rhTextView = getBinding().disputeSectionHeaderTxt;
        if (state.isSingle()) {
            string2 = ViewsKt.getString(this, C10421R.string.dispute_row_view_single_section_header);
        } else {
            string2 = ViewsKt.getString(this, C10421R.string.dispute_row_view_multiple_section_header, LocalDateFormatter.MEDIUM_WITH_OPTIONAL_YEAR.format(dispute.getOriginalContactDate()));
        }
        rhTextView.setText(string2);
        this.lineItemAdapter.submitList(CollectionsKt.listOf((Object[]) new TransactionLineItem[]{new TransactionLineItem(ViewsKt.getString(this, C39006R.string.transaction_line_item_title_dispute_amount), Money.format$default(dispute.getAmountDisputed(), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null), new TransactionLineItem(ViewsKt.getString(this, C39006R.string.transaction_line_item_title_dispute_reason), ViewsKt.getString(this, state.getDisputeReasonLabelResId()), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null), new TransactionLineItem(ViewsKt.getString(this, C39006R.string.transaction_line_item_title_dispute_submitted), LocalDateFormatter.MEDIUM.format(dispute.getOriginalContactDate()), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null), new TransactionLineItem(ViewsKt.getString(this, C39006R.string.transaction_line_item_title_last_updated), InstantFormatter.NATURAL_TIMESTAMP_IN_SYSTEM_ZONE.format((InstantFormatter) dispute.getUpdatedAt()), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null), new TransactionLineItem(ViewsKt.getString(this, C39006R.string.transaction_line_item_title_dispute_status), ViewsKt.getString(this, state.getDisputeStateLabelResId()), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null)}));
        getBinding().disputeStatusDesc.setText(ViewsKt.getString(this, state.getDisputeStateDescResId(), ViewsKt.getString(this, state.getDisputeReasonTimelineResId())));
        RdsButton rdsButton = getBinding().disputeCancelBtn;
        Intrinsics.checkNotNull(rdsButton);
        rdsButton.setVisibility(state.getIsDisputeCancelButtonVisible() ? 0 : 8);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.cash.transaction.ui.dispute.DisputeRowView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DisputeRowView.bind$lambda$2$lambda$1(this.f$0, dispute);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2$lambda$1(DisputeRowView disputeRowView, Dispute dispute) {
        Callbacks callbacks = disputeRowView.callbacks;
        if (callbacks != null) {
            callbacks.onCancelDispute(dispute.getId());
        }
        return Unit.INSTANCE;
    }

    /* compiled from: DisputeRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/dispute/DisputeRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/cash/transaction/ui/dispute/DisputeRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<DisputeRowView> {
        private final /* synthetic */ Inflater<DisputeRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public DisputeRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (DisputeRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C10421R.layout.include_dispute_row_view);
        }
    }
}
