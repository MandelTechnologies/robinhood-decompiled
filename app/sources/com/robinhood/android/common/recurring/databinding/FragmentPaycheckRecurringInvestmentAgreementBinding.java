package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentPaycheckRecurringInvestmentAgreementBinding implements ViewBinding {
    public final RhTextView agreement;
    public final RhTextView agreementFooter;
    public final ScrollView agreementScrollView;
    public final RhTextView agreementTitle;
    public final RdsButton continueButton;
    private final LinearLayout rootView;

    private FragmentPaycheckRecurringInvestmentAgreementBinding(LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, ScrollView scrollView, RhTextView rhTextView3, RdsButton rdsButton) {
        this.rootView = linearLayout;
        this.agreement = rhTextView;
        this.agreementFooter = rhTextView2;
        this.agreementScrollView = scrollView;
        this.agreementTitle = rhTextView3;
        this.continueButton = rdsButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPaycheckRecurringInvestmentAgreementBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPaycheckRecurringInvestmentAgreementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.fragment_paycheck_recurring_investment_agreement, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPaycheckRecurringInvestmentAgreementBinding bind(View view) {
        int i = C11595R.id.agreement;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11595R.id.agreement_footer;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                i = C11595R.id.agreement_scroll_view;
                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                if (scrollView != null) {
                    i = C11595R.id.agreement_title;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C11595R.id.continue_button;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            return new FragmentPaycheckRecurringInvestmentAgreementBinding((LinearLayout) view, rhTextView, rhTextView2, scrollView, rhTextView3, rdsButton);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
