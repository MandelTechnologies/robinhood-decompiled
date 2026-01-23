package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.view.transaction.TransactionSingleSelectionRowView;

/* loaded from: classes7.dex */
public final class IncludeTransactionSingleSelectionRowViewBinding implements ViewBinding {
    private final TransactionSingleSelectionRowView rootView;

    private IncludeTransactionSingleSelectionRowViewBinding(TransactionSingleSelectionRowView transactionSingleSelectionRowView) {
        this.rootView = transactionSingleSelectionRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TransactionSingleSelectionRowView getRoot() {
        return this.rootView;
    }

    public static IncludeTransactionSingleSelectionRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeTransactionSingleSelectionRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.include_transaction_single_selection_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeTransactionSingleSelectionRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeTransactionSingleSelectionRowViewBinding((TransactionSingleSelectionRowView) view);
    }
}
