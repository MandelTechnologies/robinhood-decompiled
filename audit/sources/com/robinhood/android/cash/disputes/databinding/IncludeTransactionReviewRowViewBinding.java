package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.view.transaction.TransactionReviewRowView;

/* loaded from: classes7.dex */
public final class IncludeTransactionReviewRowViewBinding implements ViewBinding {
    private final TransactionReviewRowView rootView;

    private IncludeTransactionReviewRowViewBinding(TransactionReviewRowView transactionReviewRowView) {
        this.rootView = transactionReviewRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TransactionReviewRowView getRoot() {
        return this.rootView;
    }

    public static IncludeTransactionReviewRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeTransactionReviewRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.include_transaction_review_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeTransactionReviewRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeTransactionReviewRowViewBinding((TransactionReviewRowView) view);
    }
}
