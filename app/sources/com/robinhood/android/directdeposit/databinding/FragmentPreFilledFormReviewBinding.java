package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.accountinfo.DirectDepositAccountInfoView;

/* loaded from: classes27.dex */
public final class FragmentPreFilledFormReviewBinding implements ViewBinding {
    public final DirectDepositAccountInfoView preFilledFormReviewAccountInfo;
    public final RhTextView preFilledFormReviewDisclosure;
    public final RdsButton preFilledFormReviewEditAmount;
    public final RdsButton preFilledFormReviewSignForm;
    public final RhTextView preFilledFormReviewSummary;
    public final RhTextView preFilledFormReviewTitle;
    private final LinearLayout rootView;

    private FragmentPreFilledFormReviewBinding(LinearLayout linearLayout, DirectDepositAccountInfoView directDepositAccountInfoView, RhTextView rhTextView, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = linearLayout;
        this.preFilledFormReviewAccountInfo = directDepositAccountInfoView;
        this.preFilledFormReviewDisclosure = rhTextView;
        this.preFilledFormReviewEditAmount = rdsButton;
        this.preFilledFormReviewSignForm = rdsButton2;
        this.preFilledFormReviewSummary = rhTextView2;
        this.preFilledFormReviewTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPreFilledFormReviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPreFilledFormReviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.fragment_pre_filled_form_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPreFilledFormReviewBinding bind(View view) {
        int i = C14044R.id.pre_filled_form_review_account_info;
        DirectDepositAccountInfoView directDepositAccountInfoView = (DirectDepositAccountInfoView) ViewBindings.findChildViewById(view, i);
        if (directDepositAccountInfoView != null) {
            i = C14044R.id.pre_filled_form_review_disclosure;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C14044R.id.pre_filled_form_review_edit_amount;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C14044R.id.pre_filled_form_review_sign_form;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        i = C14044R.id.pre_filled_form_review_summary;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C14044R.id.pre_filled_form_review_title;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                return new FragmentPreFilledFormReviewBinding((LinearLayout) view, directDepositAccountInfoView, rhTextView, rdsButton, rdsButton2, rhTextView2, rhTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
