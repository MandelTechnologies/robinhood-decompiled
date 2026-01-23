package com.robinhood.android.trade.equity.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.equity.C29365R;

/* loaded from: classes9.dex */
public final class NotEnoughSharesV2DialogFragmentBinding implements ViewBinding {
    public final RdsButton dismissBtn;
    public final View divider;
    public final RhTextView messageTxt;
    public final RecyclerView notEnoughSharesRows;
    private final LinearLayout rootView;
    public final RdsButton sellAllBtn;
    public final RhTextView titleTxt;
    public final RdsRowView totalSellableSharesRow;
    public final RdsButton viewPendingOrdersBtn;

    private NotEnoughSharesV2DialogFragmentBinding(LinearLayout linearLayout, RdsButton rdsButton, View view, RhTextView rhTextView, RecyclerView recyclerView, RdsButton rdsButton2, RhTextView rhTextView2, RdsRowView rdsRowView, RdsButton rdsButton3) {
        this.rootView = linearLayout;
        this.dismissBtn = rdsButton;
        this.divider = view;
        this.messageTxt = rhTextView;
        this.notEnoughSharesRows = recyclerView;
        this.sellAllBtn = rdsButton2;
        this.titleTxt = rhTextView2;
        this.totalSellableSharesRow = rdsRowView;
        this.viewPendingOrdersBtn = rdsButton3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static NotEnoughSharesV2DialogFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static NotEnoughSharesV2DialogFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29365R.layout.not_enough_shares_v2_dialog_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static NotEnoughSharesV2DialogFragmentBinding bind(View view) {
        View viewFindChildViewById;
        int i = C29365R.id.dismiss_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C29365R.id.divider))) != null) {
            i = C29365R.id.message_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C29365R.id.not_enough_shares_rows;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C29365R.id.sell_all_btn;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        i = C29365R.id.title_txt;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C29365R.id.total_sellable_shares_row;
                            RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
                            if (rdsRowView != null) {
                                i = C29365R.id.view_pending_orders_btn;
                                RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton3 != null) {
                                    return new NotEnoughSharesV2DialogFragmentBinding((LinearLayout) view, rdsButton, viewFindChildViewById, rhTextView, recyclerView, rdsButton2, rhTextView2, rdsRowView, rdsButton3);
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
