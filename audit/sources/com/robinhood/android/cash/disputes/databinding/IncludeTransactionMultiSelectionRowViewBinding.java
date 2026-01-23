package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.view.transaction.TransactionMultiSelectionRowView;

/* loaded from: classes7.dex */
public final class IncludeTransactionMultiSelectionRowViewBinding implements ViewBinding {
    private final TransactionMultiSelectionRowView rootView;

    private IncludeTransactionMultiSelectionRowViewBinding(TransactionMultiSelectionRowView transactionMultiSelectionRowView) {
        this.rootView = transactionMultiSelectionRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TransactionMultiSelectionRowView getRoot() {
        return this.rootView;
    }

    public static IncludeTransactionMultiSelectionRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeTransactionMultiSelectionRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.include_transaction_multi_selection_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeTransactionMultiSelectionRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeTransactionMultiSelectionRowViewBinding((TransactionMultiSelectionRowView) view);
    }
}
