package com.robinhood.android.cash.transaction.p079ui.dispute;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.cash.transaction.databinding.MergeTransactionDisputeViewBinding;
import com.robinhood.android.cash.transaction.p079ui.dispute.DisputeRowView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.models.p320db.mcduckling.Dispute;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: TransactionDisputesView.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/dispute/TransactionDisputesView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "", "Lcom/robinhood/models/db/mcduckling/Dispute;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/cash/transaction/ui/dispute/DisputeRowView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/cash/transaction/ui/dispute/DisputeRowView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/cash/transaction/ui/dispute/DisputeRowView$Callbacks;)V", "binding", "Lcom/robinhood/android/cash/transaction/databinding/MergeTransactionDisputeViewBinding;", "getBinding", "()Lcom/robinhood/android/cash/transaction/databinding/MergeTransactionDisputeViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "disputeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/cash/transaction/ui/dispute/DisputeRowView;", "Lcom/robinhood/android/cash/transaction/ui/dispute/DisputeRowViewState;", "bind", "", "state", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TransactionDisputesView extends LinearLayout implements Bindable<List<? extends Dispute>> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransactionDisputesView.class, "binding", "getBinding()Lcom/robinhood/android/cash/transaction/databinding/MergeTransactionDisputeViewBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private DisputeRowView.Callbacks callbacks;
    private final GenericListAdapter<DisputeRowView, DisputeRowViewState> disputeAdapter;

    public /* synthetic */ TransactionDisputesView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public /* bridge */ /* synthetic */ void bind(List<? extends Dispute> list) {
        bind2((List<Dispute>) list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionDisputesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, TransactionDisputesView2.INSTANCE);
        GenericListAdapter<DisputeRowView, DisputeRowViewState> genericListAdapterM2987of = GenericListAdapter.INSTANCE.m2987of(DisputeRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.cash.transaction.ui.dispute.TransactionDisputesView$disputeAdapter$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((DisputeRowViewState) obj).getDispute();
            }
        }), new Function2() { // from class: com.robinhood.android.cash.transaction.ui.dispute.TransactionDisputesView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TransactionDisputesView.disputeAdapter$lambda$0(this.f$0, (DisputeRowView) obj, (DisputeRowViewState) obj2);
            }
        });
        this.disputeAdapter = genericListAdapterM2987of;
        setOrientation(1);
        ViewGroups.inflate(this, C10421R.layout.merge_transaction_dispute_view, true);
        getBinding().transactionDisputeRecyclerView.setAdapter(genericListAdapterM2987of);
    }

    public final DisputeRowView.Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(DisputeRowView.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    private final MergeTransactionDisputeViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeTransactionDisputeViewBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit disputeAdapter$lambda$0(TransactionDisputesView transactionDisputesView, DisputeRowView of, DisputeRowViewState state) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(state, "state");
        of.setCallbacks(transactionDisputesView.callbacks);
        of.bind(state);
        of.setClickable(false);
        return Unit.INSTANCE;
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(List<Dispute> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        GenericListAdapter<DisputeRowView, DisputeRowViewState> genericListAdapter = this.disputeAdapter;
        List<Dispute> list = state;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Dispute dispute : list) {
            boolean z = true;
            if (state.size() != 1) {
                z = false;
            }
            arrayList.add(new DisputeRowViewState(z, dispute));
        }
        genericListAdapter.submitList(arrayList);
    }
}
