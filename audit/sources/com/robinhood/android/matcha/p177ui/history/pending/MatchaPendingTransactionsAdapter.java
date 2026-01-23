package com.robinhood.android.matcha.p177ui.history.pending;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.history.pending.MatchaPendingTransactionsState;
import com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowView;
import com.robinhood.models.p355ui.matcha.UiMatchaPendingTransaction;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaPendingTransactionsAdapter.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState$RowItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "callbacks", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowView$Callbacks;", "<init>", "(Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowView$Callbacks;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "ViewHolder", "DiffCallback", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaPendingTransactionsAdapter extends ListAdapter<MatchaPendingTransactionsState.RowItem, RecyclerView.ViewHolder> {
    public static final int $stable = 8;
    private final TransactionRowView.Callbacks callbacks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaPendingTransactionsAdapter(TransactionRowView.Callbacks callbacks) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            return new ViewHolder(this, TransactionRowView.INSTANCE.inflate(parent));
        }
        if (viewType == 1) {
            return new SimpleViewHolder(RdsHeaderRowView.INSTANCE.inflate(parent));
        }
        if (viewType == 2) {
            return new SimpleViewHolder(ViewGroups.inflate$default(parent, C21284R.layout.include_matcha_search_placeholder_row, false, 2, null));
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MatchaPendingTransactionsState.RowItem item = getItem(position);
        if (item instanceof MatchaPendingTransactionsState.RowItem.Transaction) {
            MatchaPendingTransactionsState.RowItem.Transaction transaction = (MatchaPendingTransactionsState.RowItem.Transaction) item;
            ((ViewHolder) holder).bindTransaction(transaction.getTransaction(), transaction.getRetryPrimaryAction());
        } else {
            if (item instanceof MatchaPendingTransactionsState.RowItem.Header) {
                View view = ((SimpleViewHolder) holder).itemView;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsHeaderRowView");
                RdsHeaderRowView rdsHeaderRowView = (RdsHeaderRowView) view;
                RdsHeaderRowView.bind$default(rdsHeaderRowView, ViewsKt.getString(rdsHeaderRowView, ((MatchaPendingTransactionsState.RowItem.Header) item).getTextRes()), position == 0, true, null, null, 24, null);
                return;
            }
            if (!Intrinsics.areEqual(item, MatchaPendingTransactionsState.RowItem.Placeholder.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* compiled from: MatchaPendingTransactionsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsAdapter;Landroid/view/View;)V", "bindTransaction", "", "transaction", "Lcom/robinhood/models/ui/matcha/UiMatchaPendingTransaction;", "retryPrimaryAction", "Lcom/robinhood/udf/UiEvent;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ MatchaPendingTransactionsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(MatchaPendingTransactionsAdapter matchaPendingTransactionsAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = matchaPendingTransactionsAdapter;
        }

        public final void bindTransaction(UiMatchaPendingTransaction transaction, UiEvent<Unit> retryPrimaryAction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            View view = this.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView");
            TransactionRowView transactionRowView = (TransactionRowView) view;
            transactionRowView.setCallbacks(this.this$0.callbacks);
            transactionRowView.setTransaction(transaction, retryPrimaryAction);
        }
    }

    /* compiled from: MatchaPendingTransactionsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState$RowItem;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DiffCallback extends DiffUtil.ItemCallback<MatchaPendingTransactionsState.RowItem> {
        public static final DiffCallback INSTANCE = new DiffCallback();
        public static final int $stable = 8;

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(MatchaPendingTransactionsState.RowItem oldItem, MatchaPendingTransactionsState.RowItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (newItem.getViewType() != oldItem.getViewType()) {
                return false;
            }
            return oldItem.areItemsTheSame(newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(MatchaPendingTransactionsState.RowItem oldItem, MatchaPendingTransactionsState.RowItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.areContentsTheSame(newItem);
        }
    }
}
