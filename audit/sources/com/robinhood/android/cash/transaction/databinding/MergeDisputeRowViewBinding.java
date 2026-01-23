package com.robinhood.android.cash.transaction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class MergeDisputeRowViewBinding implements ViewBinding {
    public final RdsButton disputeCancelBtn;
    public final RecyclerView disputeRowRecyclerView;
    public final RhTextView disputeSectionHeaderTxt;
    public final RdsInfoBannerView disputeStatusDesc;
    private final View rootView;

    private MergeDisputeRowViewBinding(View view, RdsButton rdsButton, RecyclerView recyclerView, RhTextView rhTextView, RdsInfoBannerView rdsInfoBannerView) {
        this.rootView = view;
        this.disputeCancelBtn = rdsButton;
        this.disputeRowRecyclerView = recyclerView;
        this.disputeSectionHeaderTxt = rhTextView;
        this.disputeStatusDesc = rdsInfoBannerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeDisputeRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C10421R.layout.merge_dispute_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeDisputeRowViewBinding bind(View view) {
        int i = C10421R.id.dispute_cancel_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10421R.id.dispute_row_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C10421R.id.dispute_section_header_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C10421R.id.dispute_status_desc;
                    RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
                    if (rdsInfoBannerView != null) {
                        return new MergeDisputeRowViewBinding(view, rdsButton, recyclerView, rhTextView, rdsInfoBannerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
