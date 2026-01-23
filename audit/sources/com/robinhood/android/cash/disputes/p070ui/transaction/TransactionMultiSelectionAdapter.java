package com.robinhood.android.cash.disputes.p070ui.transaction;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.cash.disputes.view.transaction.TransactionMultiSelectionRowView;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransactionMultiSelectionAdapter.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003J\u0014\u0010\u0016\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\u0014\u0010\u001a\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionMultiSelectionAdapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/cash/disputes/view/transaction/TransactionMultiSelectionRowView;", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "callbacks", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionMultiSelectionAdapter$Callbacks;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionMultiSelectionAdapter$Callbacks;Lcom/robinhood/rosetta/eventlogging/Context;)V", "selectedTransactions", "", "Ljava/util/UUID;", "preSelectedTransaction", "onBindViewHolder", "", "holder", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "setPreSelectedTransaction", "transaction", "setSelectedTransactions", "transactions", "", "notifyTransactionsSelected", "updateEventData", "transactionId", "Callbacks", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TransactionMultiSelectionAdapter extends GenericListAdapter<TransactionMultiSelectionRowView, SettledCardTransaction> {
    public static final int $stable = 8;
    private final Callbacks callbacks;
    private final Context eventContext;
    private SettledCardTransaction preSelectedTransaction;
    private final Map<UUID, SettledCardTransaction> selectedTransactions;

    /* compiled from: TransactionMultiSelectionAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionMultiSelectionAdapter$Callbacks;", "", "onMultipleTransactionsSelected", "", "transactions", "", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onMultipleTransactionsSelected(List<SettledCardTransaction> transactions);
    }

    public /* synthetic */ TransactionMultiSelectionAdapter(Callbacks callbacks, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(callbacks, (i & 2) != 0 ? null : context);
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(GenericViewHolder genericViewHolder, SettledCardTransaction settledCardTransaction) {
        onBindViewHolder2((GenericViewHolder<TransactionMultiSelectionRowView>) genericViewHolder, settledCardTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionMultiSelectionAdapter(Callbacks callbacks, Context context) {
        super(TransactionMultiSelectionRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionMultiSelectionAdapter$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionMultiSelectionAdapter._init_$lambda$0((SettledCardTransaction) obj);
            }
        }));
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
        this.eventContext = context;
        this.selectedTransactions = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(SettledCardTransaction byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getId();
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    protected void onBindViewHolder2(GenericViewHolder<TransactionMultiSelectionRowView> holder, final SettledCardTransaction item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        final TransactionMultiSelectionRowView transactionMultiSelectionRowView = (TransactionMultiSelectionRowView) holder.getView();
        transactionMultiSelectionRowView.bindCardTransaction(item);
        transactionMultiSelectionRowView.setChecked(this.selectedTransactions.containsKey(item.getId()));
        updateEventData(transactionMultiSelectionRowView, item.getId());
        UUID id = item.getId();
        SettledCardTransaction settledCardTransaction = this.preSelectedTransaction;
        if (Intrinsics.areEqual(id, settledCardTransaction != null ? settledCardTransaction.getId() : null)) {
            transactionMultiSelectionRowView.setEnabled(false);
            transactionMultiSelectionRowView.setOnClickListener(null);
        } else {
            transactionMultiSelectionRowView.setEnabled(true);
            OnClickListeners.onClick(transactionMultiSelectionRowView, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionMultiSelectionAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransactionMultiSelectionAdapter.onBindViewHolder$lambda$2$lambda$1(transactionMultiSelectionRowView, this, item);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2$lambda$1(TransactionMultiSelectionRowView transactionMultiSelectionRowView, TransactionMultiSelectionAdapter transactionMultiSelectionAdapter, SettledCardTransaction settledCardTransaction) {
        transactionMultiSelectionRowView.toggle();
        transactionMultiSelectionAdapter.updateEventData(transactionMultiSelectionRowView, settledCardTransaction.getId());
        if (transactionMultiSelectionRowView.isChecked()) {
            transactionMultiSelectionAdapter.selectedTransactions.put(settledCardTransaction.getId(), settledCardTransaction);
        } else {
            transactionMultiSelectionAdapter.selectedTransactions.remove(settledCardTransaction.getId());
        }
        transactionMultiSelectionAdapter.notifyTransactionsSelected();
        return Unit.INSTANCE;
    }

    public final void setPreSelectedTransaction(SettledCardTransaction transaction) {
        if (transaction != null) {
            this.preSelectedTransaction = transaction;
            this.selectedTransactions.put(transaction.getId(), transaction);
            notifyDataSetChanged();
            notifyTransactionsSelected();
        }
    }

    public final void setSelectedTransactions(List<SettledCardTransaction> transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Map<UUID, SettledCardTransaction> map = this.selectedTransactions;
        map.clear();
        List<SettledCardTransaction> list = transactions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (SettledCardTransaction settledCardTransaction : list) {
            arrayList.add(new Tuples2(settledCardTransaction.getId(), settledCardTransaction));
        }
        MapsKt.putAll(map, arrayList);
        notifyDataSetChanged();
        notifyTransactionsSelected();
    }

    private final void notifyTransactionsSelected() {
        this.callbacks.onMultipleTransactionsSelected(CollectionsKt.toList(this.selectedTransactions.values()));
    }

    private final void updateEventData(final TransactionMultiSelectionRowView transactionMultiSelectionRowView, final UUID uuid) {
        ViewsKt.eventData$default(transactionMultiSelectionRowView, false, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionMultiSelectionAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionMultiSelectionAdapter.updateEventData$lambda$5(transactionMultiSelectionRowView, this, uuid);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor updateEventData$lambda$5(TransactionMultiSelectionRowView transactionMultiSelectionRowView, TransactionMultiSelectionAdapter transactionMultiSelectionAdapter, UUID uuid) {
        UserInteractionEventData.Action action = transactionMultiSelectionRowView.isChecked() ? UserInteractionEventData.Action.DESELECT : UserInteractionEventData.Action.SELECT;
        Context context = transactionMultiSelectionAdapter.eventContext;
        Component.ComponentType componentType = Component.ComponentType.RADIO_BUTTON;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new UserInteractionEventDescriptor(null, null, action, context, new Component(componentType, string2, null, 4, null), null, 35, null);
    }
}
