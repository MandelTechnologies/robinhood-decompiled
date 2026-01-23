package com.robinhood.android.matcha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowView;

/* loaded from: classes8.dex */
public final class IncludeMatchaTransactionRowViewBinding implements ViewBinding {
    private final TransactionRowView rootView;

    private IncludeMatchaTransactionRowViewBinding(TransactionRowView transactionRowView) {
        this.rootView = transactionRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TransactionRowView getRoot() {
        return this.rootView;
    }

    public static IncludeMatchaTransactionRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMatchaTransactionRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C21284R.layout.include_matcha_transaction_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMatchaTransactionRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeMatchaTransactionRowViewBinding((TransactionRowView) view);
    }
}
