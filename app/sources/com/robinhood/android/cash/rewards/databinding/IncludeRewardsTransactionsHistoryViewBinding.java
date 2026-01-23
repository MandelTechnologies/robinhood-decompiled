package com.robinhood.android.cash.rewards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.p074ui.overview.p075v2.RewardsTransactionsHistoryView;

/* loaded from: classes7.dex */
public final class IncludeRewardsTransactionsHistoryViewBinding implements ViewBinding {
    private final RewardsTransactionsHistoryView rootView;

    private IncludeRewardsTransactionsHistoryViewBinding(RewardsTransactionsHistoryView rewardsTransactionsHistoryView) {
        this.rootView = rewardsTransactionsHistoryView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RewardsTransactionsHistoryView getRoot() {
        return this.rootView;
    }

    public static IncludeRewardsTransactionsHistoryViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRewardsTransactionsHistoryViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10176R.layout.include_rewards_transactions_history_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRewardsTransactionsHistoryViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRewardsTransactionsHistoryViewBinding((RewardsTransactionsHistoryView) view);
    }
}
