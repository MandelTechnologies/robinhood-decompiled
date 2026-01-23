package com.robinhood.android.cash.disputes.p070ui.transaction;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.cash.disputes.view.transaction.TransactionSingleSelectionRowView;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransactionSingleSelectionAdapter.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0014J\u0014\u0010\u0012\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSingleSelectionAdapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/cash/disputes/view/transaction/TransactionSingleSelectionRowView;", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "callbacks", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSingleSelectionAdapter$Callbacks;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "<init>", "(Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSingleSelectionAdapter$Callbacks;Lcom/robinhood/rosetta/eventlogging/Context;)V", "selectedItemId", "Ljava/util/UUID;", "onBindViewHolder", "", "holder", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "setEventData", "transactionId", "setSelectedTransaction", "transaction", "updateSelectedItem", "newSelectedItem", "newSelectedRow", "Callbacks", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TransactionSingleSelectionAdapter extends GenericListAdapter<TransactionSingleSelectionRowView, SettledCardTransaction> {
    public static final int $stable = 8;
    private final Callbacks callbacks;
    private final Context eventContext;
    private UUID selectedItemId;

    /* compiled from: TransactionSingleSelectionAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSingleSelectionAdapter$Callbacks;", "", "onSingleTransactionSelected", "", "transaction", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSingleTransactionSelected(SettledCardTransaction transaction);
    }

    public /* synthetic */ TransactionSingleSelectionAdapter(Callbacks callbacks, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(callbacks, (i & 2) != 0 ? null : context);
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(GenericViewHolder genericViewHolder, SettledCardTransaction settledCardTransaction) {
        onBindViewHolder2((GenericViewHolder<TransactionSingleSelectionRowView>) genericViewHolder, settledCardTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionSingleSelectionAdapter(Callbacks callbacks, Context context) {
        super(TransactionSingleSelectionRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSingleSelectionAdapter$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionSingleSelectionAdapter._init_$lambda$0((SettledCardTransaction) obj);
            }
        }));
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
        this.eventContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(SettledCardTransaction byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getId();
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    protected void onBindViewHolder2(GenericViewHolder<TransactionSingleSelectionRowView> holder, final SettledCardTransaction item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        final TransactionSingleSelectionRowView transactionSingleSelectionRowView = (TransactionSingleSelectionRowView) holder.getView();
        TransactionSingleSelectionRowView.bindCardTransaction$default(transactionSingleSelectionRowView, item, false, 2, null);
        transactionSingleSelectionRowView.setChecked(Intrinsics.areEqual(item.getId(), this.selectedItemId));
        setEventData(transactionSingleSelectionRowView, item.getId());
        OnClickListeners.onClick(transactionSingleSelectionRowView, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSingleSelectionAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionSingleSelectionAdapter.onBindViewHolder$lambda$2$lambda$1(this.f$0, item, transactionSingleSelectionRowView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2$lambda$1(TransactionSingleSelectionAdapter transactionSingleSelectionAdapter, SettledCardTransaction settledCardTransaction, TransactionSingleSelectionRowView transactionSingleSelectionRowView) {
        transactionSingleSelectionAdapter.updateSelectedItem(settledCardTransaction, transactionSingleSelectionRowView);
        return Unit.INSTANCE;
    }

    private final void setEventData(TransactionSingleSelectionRowView transactionSingleSelectionRowView, final UUID uuid) {
        ViewsKt.eventData$default(transactionSingleSelectionRowView, false, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.transaction.TransactionSingleSelectionAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionSingleSelectionAdapter.setEventData$lambda$3(this.f$0, uuid);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor setEventData$lambda$3(TransactionSingleSelectionAdapter transactionSingleSelectionAdapter, UUID uuid) {
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SELECT;
        Context context = transactionSingleSelectionAdapter.eventContext;
        Component.ComponentType componentType = Component.ComponentType.RADIO_BUTTON;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new UserInteractionEventDescriptor(null, null, action, context, new Component(componentType, string2, null, 4, null), null, 35, null);
    }

    public final void setSelectedTransaction(SettledCardTransaction transaction) {
        this.selectedItemId = transaction != null ? transaction.getId() : null;
        notifyDataSetChanged();
    }

    private final void updateSelectedItem(SettledCardTransaction newSelectedItem, TransactionSingleSelectionRowView newSelectedRow) {
        UUID uuid = this.selectedItemId;
        this.selectedItemId = newSelectedItem.getId();
        newSelectedRow.setChecked(true);
        if (uuid != null) {
            List<SettledCardTransaction> currentList = getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            Iterator<SettledCardTransaction> it = currentList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual(it.next().getId(), uuid)) {
                    break;
                } else {
                    i++;
                }
            }
            notifyItemChanged(i);
        }
        this.callbacks.onSingleTransactionSelected(newSelectedItem);
    }
}
