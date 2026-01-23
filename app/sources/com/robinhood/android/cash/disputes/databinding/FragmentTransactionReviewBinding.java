package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentTransactionReviewBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final RdsButton transactionReviewConfirmButton;
    public final RecyclerView transactionReviewRecyclerView;
    public final RhTextView transactionReviewTitle;

    private FragmentTransactionReviewBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RecyclerView recyclerView, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.transactionReviewConfirmButton = rdsButton;
        this.transactionReviewRecyclerView = recyclerView;
        this.transactionReviewTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTransactionReviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTransactionReviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.fragment_transaction_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTransactionReviewBinding bind(View view) {
        int i = C10007R.id.transaction_review_confirm_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10007R.id.transaction_review_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C10007R.id.transaction_review_title;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    return new FragmentTransactionReviewBinding((ConstraintLayout) view, rdsButton, recyclerView, rhTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
