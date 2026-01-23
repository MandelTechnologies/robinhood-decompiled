package com.robinhood.shared.history.accounts.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.shared.history.accounts.AccountHistoryLoadingView;
import com.robinhood.shared.history.accounts.C38979R;

/* loaded from: classes6.dex */
public final class FragmentAccountsHistoryBinding implements ViewBinding {
    public final RdsChip accountTypeChip;
    public final LinearLayout emptyContainer;
    public final HorizontalScrollView filterList;
    public final RecyclerView historyList;
    private final ConstraintLayout rootView;
    public final AccountHistoryLoadingView shimmerLoadingView;
    public final RdsChip subTransactionTypeChip;
    public final RdsChip transactionTypeChip;

    private FragmentAccountsHistoryBinding(ConstraintLayout constraintLayout, RdsChip rdsChip, LinearLayout linearLayout, HorizontalScrollView horizontalScrollView, RecyclerView recyclerView, AccountHistoryLoadingView accountHistoryLoadingView, RdsChip rdsChip2, RdsChip rdsChip3) {
        this.rootView = constraintLayout;
        this.accountTypeChip = rdsChip;
        this.emptyContainer = linearLayout;
        this.filterList = horizontalScrollView;
        this.historyList = recyclerView;
        this.shimmerLoadingView = accountHistoryLoadingView;
        this.subTransactionTypeChip = rdsChip2;
        this.transactionTypeChip = rdsChip3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAccountsHistoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAccountsHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C38979R.layout.fragment_accounts_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAccountsHistoryBinding bind(View view) {
        int i = C38979R.id.account_type_chip;
        RdsChip rdsChip = (RdsChip) ViewBindings.findChildViewById(view, i);
        if (rdsChip != null) {
            i = C38979R.id.empty_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C38979R.id.filter_list;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                if (horizontalScrollView != null) {
                    i = C38979R.id.history_list;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C38979R.id.shimmer_loading_view;
                        AccountHistoryLoadingView accountHistoryLoadingView = (AccountHistoryLoadingView) ViewBindings.findChildViewById(view, i);
                        if (accountHistoryLoadingView != null) {
                            i = C38979R.id.sub_transaction_type_chip;
                            RdsChip rdsChip2 = (RdsChip) ViewBindings.findChildViewById(view, i);
                            if (rdsChip2 != null) {
                                i = C38979R.id.transaction_type_chip;
                                RdsChip rdsChip3 = (RdsChip) ViewBindings.findChildViewById(view, i);
                                if (rdsChip3 != null) {
                                    return new FragmentAccountsHistoryBinding((ConstraintLayout) view, rdsChip, linearLayout, horizontalScrollView, recyclerView, accountHistoryLoadingView, rdsChip2, rdsChip3);
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
