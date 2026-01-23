package com.robinhood.android.acatsin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class FragmentAcatsInConfirmEligibleBinding implements ViewBinding {
    public final RdsButton choosePartialsButton;
    public final RdsTextButton confirmEligibleLink;
    public final RhTextView confirmEligibleText;
    public final RhTextView confirmEligibleTitle;
    public final RdsButton continueButton;
    public final RhTextView feeWarningText;
    public final LottieAnimationView lottieview;
    private final LinearLayout rootView;

    private FragmentAcatsInConfirmEligibleBinding(LinearLayout linearLayout, RdsButton rdsButton, RdsTextButton rdsTextButton, RhTextView rhTextView, RhTextView rhTextView2, RdsButton rdsButton2, RhTextView rhTextView3, LottieAnimationView lottieAnimationView) {
        this.rootView = linearLayout;
        this.choosePartialsButton = rdsButton;
        this.confirmEligibleLink = rdsTextButton;
        this.confirmEligibleText = rhTextView;
        this.confirmEligibleTitle = rhTextView2;
        this.continueButton = rdsButton2;
        this.feeWarningText = rhTextView3;
        this.lottieview = lottieAnimationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAcatsInConfirmEligibleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAcatsInConfirmEligibleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7725R.layout.fragment_acats_in_confirm_eligible, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAcatsInConfirmEligibleBinding bind(View view) {
        int i = C7725R.id.choose_partials_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C7725R.id.confirm_eligible_link;
            RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
            if (rdsTextButton != null) {
                i = C7725R.id.confirm_eligible_text;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C7725R.id.confirm_eligible_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C7725R.id.continue_button;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            i = C7725R.id.fee_warning_text;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C7725R.id.lottieview;
                                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                if (lottieAnimationView != null) {
                                    return new FragmentAcatsInConfirmEligibleBinding((LinearLayout) view, rdsButton, rdsTextButton, rhTextView, rhTextView2, rdsButton2, rhTextView3, lottieAnimationView);
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
