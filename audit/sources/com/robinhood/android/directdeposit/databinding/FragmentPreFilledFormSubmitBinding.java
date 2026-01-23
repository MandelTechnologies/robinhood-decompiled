package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.accountinfo.DirectDepositAccountInfoView;

/* loaded from: classes27.dex */
public final class FragmentPreFilledFormSubmitBinding implements ViewBinding {
    public final RhTextView directDepositAccountInfoBankInfoDisclosure;
    public final DirectDepositAccountInfoView preFilledFormAccountInfo;
    public final ShimmerLoadingView preFilledFormLoadingView;
    public final RdsButton preFilledFormReviewEditAmount;
    public final RdsButton preFilledFormReviewEmailAction;
    public final ConstraintLayout preFilledFormSubmitLayout;
    public final FrameLayout preFilledFormSubmitRoot;
    public final RhTextView preFilledFormSubmitSummary;
    public final RhTextView preFilledFormSubmitTitle;
    private final FrameLayout rootView;

    private FragmentPreFilledFormSubmitBinding(FrameLayout frameLayout, RhTextView rhTextView, DirectDepositAccountInfoView directDepositAccountInfoView, ShimmerLoadingView shimmerLoadingView, RdsButton rdsButton, RdsButton rdsButton2, ConstraintLayout constraintLayout, FrameLayout frameLayout2, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = frameLayout;
        this.directDepositAccountInfoBankInfoDisclosure = rhTextView;
        this.preFilledFormAccountInfo = directDepositAccountInfoView;
        this.preFilledFormLoadingView = shimmerLoadingView;
        this.preFilledFormReviewEditAmount = rdsButton;
        this.preFilledFormReviewEmailAction = rdsButton2;
        this.preFilledFormSubmitLayout = constraintLayout;
        this.preFilledFormSubmitRoot = frameLayout2;
        this.preFilledFormSubmitSummary = rhTextView2;
        this.preFilledFormSubmitTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPreFilledFormSubmitBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPreFilledFormSubmitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.fragment_pre_filled_form_submit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPreFilledFormSubmitBinding bind(View view) {
        int i = C14044R.id.direct_deposit_account_info_bank_info_disclosure;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C14044R.id.pre_filled_form_account_info;
            DirectDepositAccountInfoView directDepositAccountInfoView = (DirectDepositAccountInfoView) ViewBindings.findChildViewById(view, i);
            if (directDepositAccountInfoView != null) {
                i = C14044R.id.pre_filled_form_loading_view;
                ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                if (shimmerLoadingView != null) {
                    i = C14044R.id.pre_filled_form_review_edit_amount;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C14044R.id.pre_filled_form_review_email_action;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            i = C14044R.id.pre_filled_form_submit_layout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                FrameLayout frameLayout = (FrameLayout) view;
                                i = C14044R.id.pre_filled_form_submit_summary;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C14044R.id.pre_filled_form_submit_title;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        return new FragmentPreFilledFormSubmitBinding(frameLayout, rhTextView, directDepositAccountInfoView, shimmerLoadingView, rdsButton, rdsButton2, constraintLayout, frameLayout, rhTextView2, rhTextView3);
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
