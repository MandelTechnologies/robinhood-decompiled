package com.robinhood.android.transfers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.C30065R;

/* loaded from: classes9.dex */
public final class FragmentConfirmTransferBinding implements ViewBinding {
    public final RhTextView accountTxt;
    public final RhTextView amountTxt;
    public final RdsButton approveBtn;
    public final RdsButton cancelBtn;
    public final RhTextView descriptionTxt;
    public final RhTextView disclosureTxt;
    public final ShimmerLoadingView loadingView;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final RhTextView titleTxt;

    private FragmentConfirmTransferBinding(ConstraintLayout constraintLayout, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView3, RhTextView rhTextView4, ShimmerLoadingView shimmerLoadingView, ScrollView scrollView, RhTextView rhTextView5) {
        this.rootView = constraintLayout;
        this.accountTxt = rhTextView;
        this.amountTxt = rhTextView2;
        this.approveBtn = rdsButton;
        this.cancelBtn = rdsButton2;
        this.descriptionTxt = rhTextView3;
        this.disclosureTxt = rhTextView4;
        this.loadingView = shimmerLoadingView;
        this.scrollView = scrollView;
        this.titleTxt = rhTextView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentConfirmTransferBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentConfirmTransferBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C30065R.layout.fragment_confirm_transfer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentConfirmTransferBinding bind(View view) {
        int i = C30065R.id.account_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C30065R.id.amount_txt;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C30065R.id.approve_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C30065R.id.cancel_btn;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        i = C30065R.id.description_txt;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C30065R.id.disclosure_txt;
                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView4 != null) {
                                i = C30065R.id.loading_view;
                                ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                                if (shimmerLoadingView != null) {
                                    i = C30065R.id.scroll_view;
                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                    if (scrollView != null) {
                                        i = C30065R.id.title_txt;
                                        RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView5 != null) {
                                            return new FragmentConfirmTransferBinding((ConstraintLayout) view, rhTextView, rhTextView2, rdsButton, rdsButton2, rhTextView3, rhTextView4, shimmerLoadingView, scrollView, rhTextView5);
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
