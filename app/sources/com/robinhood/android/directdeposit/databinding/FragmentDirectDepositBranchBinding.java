package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;

/* loaded from: classes27.dex */
public final class FragmentDirectDepositBranchBinding implements ViewBinding {
    public final RdsRowView directDepositAccountInfo;
    public final RhTextView directDepositBranchDetail;
    public final RhTextView directDepositBranchTitle;
    public final RdsRowView directDepositPreFilled;
    private final LinearLayout rootView;

    private FragmentDirectDepositBranchBinding(LinearLayout linearLayout, RdsRowView rdsRowView, RhTextView rhTextView, RhTextView rhTextView2, RdsRowView rdsRowView2) {
        this.rootView = linearLayout;
        this.directDepositAccountInfo = rdsRowView;
        this.directDepositBranchDetail = rhTextView;
        this.directDepositBranchTitle = rhTextView2;
        this.directDepositPreFilled = rdsRowView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectDepositBranchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectDepositBranchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.fragment_direct_deposit_branch, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectDepositBranchBinding bind(View view) {
        int i = C14044R.id.direct_deposit_account_info;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C14044R.id.direct_deposit_branch_detail;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C14044R.id.direct_deposit_branch_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C14044R.id.direct_deposit_pre_filled;
                    RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsRowView2 != null) {
                        return new FragmentDirectDepositBranchBinding((LinearLayout) view, rdsRowView, rhTextView, rhTextView2, rdsRowView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
