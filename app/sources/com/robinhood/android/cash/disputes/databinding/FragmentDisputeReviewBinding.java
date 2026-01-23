package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.view.transaction.TransactionReviewRowView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes7.dex */
public final class FragmentDisputeReviewBinding implements ViewBinding {
    public final ConstraintLayout disputeReviewContent;
    public final RdsRowView disputeReviewMultiTransactionHeaderRow;
    public final RdsHeaderRowView disputeReviewResponsesHeader;
    public final RecyclerView disputeReviewResponsesRecyclerView;
    public final TransactionReviewRowView disputeReviewSingleTransactionRow;
    public final RdsButton disputeReviewSubmitButton;
    public final RhTextView disputeReviewTitle;
    public final RdsHeaderRowView disputeReviewTransactionsHeader;
    public final RecyclerView disputeReviewTransactionsRecyclerView;
    private final FocusSafeNestedScrollView rootView;

    private FragmentDisputeReviewBinding(FocusSafeNestedScrollView focusSafeNestedScrollView, ConstraintLayout constraintLayout, RdsRowView rdsRowView, RdsHeaderRowView rdsHeaderRowView, RecyclerView recyclerView, TransactionReviewRowView transactionReviewRowView, RdsButton rdsButton, RhTextView rhTextView, RdsHeaderRowView rdsHeaderRowView2, RecyclerView recyclerView2) {
        this.rootView = focusSafeNestedScrollView;
        this.disputeReviewContent = constraintLayout;
        this.disputeReviewMultiTransactionHeaderRow = rdsRowView;
        this.disputeReviewResponsesHeader = rdsHeaderRowView;
        this.disputeReviewResponsesRecyclerView = recyclerView;
        this.disputeReviewSingleTransactionRow = transactionReviewRowView;
        this.disputeReviewSubmitButton = rdsButton;
        this.disputeReviewTitle = rhTextView;
        this.disputeReviewTransactionsHeader = rdsHeaderRowView2;
        this.disputeReviewTransactionsRecyclerView = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FocusSafeNestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentDisputeReviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDisputeReviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.fragment_dispute_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDisputeReviewBinding bind(View view) {
        int i = C10007R.id.dispute_review_content;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C10007R.id.dispute_review_multi_transaction_header_row;
            RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView != null) {
                i = C10007R.id.dispute_review_responses_header;
                RdsHeaderRowView rdsHeaderRowView = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                if (rdsHeaderRowView != null) {
                    i = C10007R.id.dispute_review_responses_recycler_view;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C10007R.id.dispute_review_single_transaction_row;
                        TransactionReviewRowView transactionReviewRowView = (TransactionReviewRowView) ViewBindings.findChildViewById(view, i);
                        if (transactionReviewRowView != null) {
                            i = C10007R.id.dispute_review_submit_button;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                i = C10007R.id.dispute_review_title;
                                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView != null) {
                                    i = C10007R.id.dispute_review_transactions_header;
                                    RdsHeaderRowView rdsHeaderRowView2 = (RdsHeaderRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsHeaderRowView2 != null) {
                                        i = C10007R.id.dispute_review_transactions_recycler_view;
                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView2 != null) {
                                            return new FragmentDisputeReviewBinding((FocusSafeNestedScrollView) view, constraintLayout, rdsRowView, rdsHeaderRowView, recyclerView, transactionReviewRowView, rdsButton, rhTextView, rdsHeaderRowView2, recyclerView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
