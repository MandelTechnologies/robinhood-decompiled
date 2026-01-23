package com.robinhood.android.transfers.ach.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.ach.C30082R;

/* loaded from: classes9.dex */
public final class FragmentReviewAchTransferBinding implements ViewBinding {
    public final RhTextView addWithdrawBankLabelTxt;
    public final RdsButton addWithdrawBtn;
    public final RhTextView addWithdrawLabelTxt;
    public final RhTextView amountTxt;
    public final ShimmerLoadingView loadingView;
    private final FrameLayout rootView;
    public final RhTextView transferDisclaimerTxt;

    private FragmentReviewAchTransferBinding(FrameLayout frameLayout, RhTextView rhTextView, RdsButton rdsButton, RhTextView rhTextView2, RhTextView rhTextView3, ShimmerLoadingView shimmerLoadingView, RhTextView rhTextView4) {
        this.rootView = frameLayout;
        this.addWithdrawBankLabelTxt = rhTextView;
        this.addWithdrawBtn = rdsButton;
        this.addWithdrawLabelTxt = rhTextView2;
        this.amountTxt = rhTextView3;
        this.loadingView = shimmerLoadingView;
        this.transferDisclaimerTxt = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentReviewAchTransferBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentReviewAchTransferBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30082R.layout.fragment_review_ach_transfer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentReviewAchTransferBinding bind(View view) {
        int i = C30082R.id.add_withdraw_bank_label_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C30082R.id.add_withdraw_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C30082R.id.add_withdraw_label_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C30082R.id.amount_txt;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C30082R.id.loading_view;
                        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                        if (shimmerLoadingView != null) {
                            i = C30082R.id.transfer_disclaimer_txt;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null) {
                                return new FragmentReviewAchTransferBinding((FrameLayout) view, rhTextView, rdsButton, rhTextView2, rhTextView3, shimmerLoadingView, rhTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
