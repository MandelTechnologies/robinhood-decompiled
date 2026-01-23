package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.C26245R;

/* loaded from: classes11.dex */
public final class FragmentPaycheckRecurringInvestmentsDdOnboardingSplashBinding implements ViewBinding {
    public final RdsButton alreadySetUpDdButton;
    public final RdsButton continueButton;
    public final ComposeView paycheckRecurringDisclosure;
    public final RhTextView paycheckRecurringInvestmentDisclosureCta;
    public final ComposeView paycheckRecurringSteps;
    private final LinearLayout rootView;
    public final RdsButton setUpDdButton;

    private FragmentPaycheckRecurringInvestmentsDdOnboardingSplashBinding(LinearLayout linearLayout, RdsButton rdsButton, RdsButton rdsButton2, ComposeView composeView, RhTextView rhTextView, ComposeView composeView2, RdsButton rdsButton3) {
        this.rootView = linearLayout;
        this.alreadySetUpDdButton = rdsButton;
        this.continueButton = rdsButton2;
        this.paycheckRecurringDisclosure = composeView;
        this.paycheckRecurringInvestmentDisclosureCta = rhTextView;
        this.paycheckRecurringSteps = composeView2;
        this.setUpDdButton = rdsButton3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPaycheckRecurringInvestmentsDdOnboardingSplashBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPaycheckRecurringInvestmentsDdOnboardingSplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C26245R.layout.fragment_paycheck_recurring_investments_dd_onboarding_splash, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPaycheckRecurringInvestmentsDdOnboardingSplashBinding bind(View view) {
        int i = C26245R.id.already_set_up_dd_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C26245R.id.continue_button;
            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton2 != null) {
                i = C26245R.id.paycheck_recurring_disclosure;
                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                if (composeView != null) {
                    i = C26245R.id.paycheck_recurring_investment_disclosure_cta;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C26245R.id.paycheck_recurring_steps;
                        ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
                        if (composeView2 != null) {
                            i = C26245R.id.set_up_dd_button;
                            RdsButton rdsButton3 = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton3 != null) {
                                return new FragmentPaycheckRecurringInvestmentsDdOnboardingSplashBinding((LinearLayout) view, rdsButton, rdsButton2, composeView, rhTextView, composeView2, rdsButton3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
