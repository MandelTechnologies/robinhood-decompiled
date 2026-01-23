package com.robinhood.android.transfers.transferhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.history.p082ui.UnifiedHistoryView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.transferhub.C30556R;

/* loaded from: classes9.dex */
public final class FragmentI18nTransfersHubBinding implements ViewBinding {
    public final ComposeView accountsView;
    public final UnifiedHistoryView moveMoneyHistory;
    public final RhTextView moveMoneyHistorySectionHeaderText;
    public final UnifiedHistoryView moveMoneyPendingHistory;
    public final RhTextView moveMoneyPendingHistorySectionHeaderText;
    private final NestedScrollView rootView;
    public final ComposeView transfersHubActions;
    public final ComposeView transfersHubHeader;
    public final ComposeView withdrawableCashInfoView;

    private FragmentI18nTransfersHubBinding(NestedScrollView nestedScrollView, ComposeView composeView, UnifiedHistoryView unifiedHistoryView, RhTextView rhTextView, UnifiedHistoryView unifiedHistoryView2, RhTextView rhTextView2, ComposeView composeView2, ComposeView composeView3, ComposeView composeView4) {
        this.rootView = nestedScrollView;
        this.accountsView = composeView;
        this.moveMoneyHistory = unifiedHistoryView;
        this.moveMoneyHistorySectionHeaderText = rhTextView;
        this.moveMoneyPendingHistory = unifiedHistoryView2;
        this.moveMoneyPendingHistorySectionHeaderText = rhTextView2;
        this.transfersHubActions = composeView2;
        this.transfersHubHeader = composeView3;
        this.withdrawableCashInfoView = composeView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentI18nTransfersHubBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentI18nTransfersHubBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30556R.layout.fragment_i18n_transfers_hub, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentI18nTransfersHubBinding bind(View view) {
        int i = C30556R.id.accounts_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C30556R.id.move_money_history;
            UnifiedHistoryView unifiedHistoryView = (UnifiedHistoryView) ViewBindings.findChildViewById(view, i);
            if (unifiedHistoryView != null) {
                i = C30556R.id.move_money_history_section_header_text;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C30556R.id.move_money_pending_history;
                    UnifiedHistoryView unifiedHistoryView2 = (UnifiedHistoryView) ViewBindings.findChildViewById(view, i);
                    if (unifiedHistoryView2 != null) {
                        i = C30556R.id.move_money_pending_history_section_header_text;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C30556R.id.transfers_hub_actions;
                            ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
                            if (composeView2 != null) {
                                i = C30556R.id.transfers_hub_header;
                                ComposeView composeView3 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                if (composeView3 != null) {
                                    i = C30556R.id.withdrawable_cash_info_view;
                                    ComposeView composeView4 = (ComposeView) ViewBindings.findChildViewById(view, i);
                                    if (composeView4 != null) {
                                        return new FragmentI18nTransfersHubBinding((NestedScrollView) view, composeView, unifiedHistoryView, rhTextView, unifiedHistoryView2, rhTextView2, composeView2, composeView3, composeView4);
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
