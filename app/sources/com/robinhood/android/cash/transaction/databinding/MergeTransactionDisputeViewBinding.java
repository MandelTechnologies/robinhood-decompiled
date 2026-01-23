package com.robinhood.android.cash.transaction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.transaction.C10421R;

/* loaded from: classes7.dex */
public final class MergeTransactionDisputeViewBinding implements ViewBinding {
    private final View rootView;
    public final RecyclerView transactionDisputeRecyclerView;

    private MergeTransactionDisputeViewBinding(View view, RecyclerView recyclerView) {
        this.rootView = view;
        this.transactionDisputeRecyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeTransactionDisputeViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C10421R.layout.merge_transaction_dispute_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeTransactionDisputeViewBinding bind(View view) {
        int i = C10421R.id.transaction_dispute_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new MergeTransactionDisputeViewBinding(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
