package com.robinhood.android.withdrawableamount.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.history.p082ui.UnifiedHistoryView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.withdrawableamount.C31570R;

/* loaded from: classes16.dex */
public final class FragmentWithdrawableAmountDetailBinding implements ViewBinding {
    public final RhTextView detailTxt;
    private final ConstraintLayout rootView;
    public final NestedScrollView scrollView;
    public final RhTextView titleAmountTxt;
    public final RhTextView titleTxt;
    public final UnifiedHistoryView unifiedHistory;
    public final RdsButton withdrawBtn;
    public final RecyclerView withdrawableAmountBreakdownItems;

    private FragmentWithdrawableAmountDetailBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, NestedScrollView nestedScrollView, RhTextView rhTextView2, RhTextView rhTextView3, UnifiedHistoryView unifiedHistoryView, RdsButton rdsButton, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.detailTxt = rhTextView;
        this.scrollView = nestedScrollView;
        this.titleAmountTxt = rhTextView2;
        this.titleTxt = rhTextView3;
        this.unifiedHistory = unifiedHistoryView;
        this.withdrawBtn = rdsButton;
        this.withdrawableAmountBreakdownItems = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWithdrawableAmountDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentWithdrawableAmountDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31570R.layout.fragment_withdrawable_amount_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentWithdrawableAmountDetailBinding bind(View view) {
        int i = C31570R.id.detail_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C31570R.id.scroll_view;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
            if (nestedScrollView != null) {
                i = C31570R.id.title_amount_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C31570R.id.title_txt;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C31570R.id.unified_history;
                        UnifiedHistoryView unifiedHistoryView = (UnifiedHistoryView) ViewBindings.findChildViewById(view, i);
                        if (unifiedHistoryView != null) {
                            i = C31570R.id.withdraw_btn;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                i = C31570R.id.withdrawable_amount_breakdown_items;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    return new FragmentWithdrawableAmountDetailBinding((ConstraintLayout) view, rhTextView, nestedScrollView, rhTextView2, rhTextView3, unifiedHistoryView, rdsButton, recyclerView);
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
