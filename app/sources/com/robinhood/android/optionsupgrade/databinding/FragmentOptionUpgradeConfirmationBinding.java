package com.robinhood.android.optionsupgrade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsupgrade.C25121R;

/* loaded from: classes11.dex */
public final class FragmentOptionUpgradeConfirmationBinding implements ViewBinding {
    public final RdsRowView optionUpgradeBuyingAndSellingSpreads;
    public final RdsRowView optionUpgradeBuyingCallsAndPutsRow;
    public final RdsButton optionUpgradeConfirmationContinueBtn;
    public final RhTextView optionUpgradeConfirmationDetail;
    public final RhTextView optionUpgradeConfirmationTitle;
    public final RhTextView optionUpgradeDisclosure;
    public final RdsRowView optionUpgradeExercisingOptions;
    public final RdsRowView optionUpgradeSellingCashCoveredPuts;
    public final RdsRowView optionUpgradeSellingCoveredCalls;
    private final ScrollView rootView;

    private FragmentOptionUpgradeConfirmationBinding(ScrollView scrollView, RdsRowView rdsRowView, RdsRowView rdsRowView2, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RdsRowView rdsRowView3, RdsRowView rdsRowView4, RdsRowView rdsRowView5) {
        this.rootView = scrollView;
        this.optionUpgradeBuyingAndSellingSpreads = rdsRowView;
        this.optionUpgradeBuyingCallsAndPutsRow = rdsRowView2;
        this.optionUpgradeConfirmationContinueBtn = rdsButton;
        this.optionUpgradeConfirmationDetail = rhTextView;
        this.optionUpgradeConfirmationTitle = rhTextView2;
        this.optionUpgradeDisclosure = rhTextView3;
        this.optionUpgradeExercisingOptions = rdsRowView3;
        this.optionUpgradeSellingCashCoveredPuts = rdsRowView4;
        this.optionUpgradeSellingCoveredCalls = rdsRowView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentOptionUpgradeConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionUpgradeConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25121R.layout.fragment_option_upgrade_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionUpgradeConfirmationBinding bind(View view) {
        int i = C25121R.id.option_upgrade_buying_and_selling_spreads;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C25121R.id.option_upgrade_buying_calls_and_puts_row;
            RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView2 != null) {
                i = C25121R.id.option_upgrade_confirmation_continue_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C25121R.id.option_upgrade_confirmation_detail;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C25121R.id.option_upgrade_confirmation_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C25121R.id.option_upgrade_disclosure;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C25121R.id.option_upgrade_exercising_options;
                                RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                if (rdsRowView3 != null) {
                                    i = C25121R.id.option_upgrade_selling_cash_covered_puts;
                                    RdsRowView rdsRowView4 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                    if (rdsRowView4 != null) {
                                        i = C25121R.id.option_upgrade_selling_covered_calls;
                                        RdsRowView rdsRowView5 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                                        if (rdsRowView5 != null) {
                                            return new FragmentOptionUpgradeConfirmationBinding((ScrollView) view, rdsRowView, rdsRowView2, rdsButton, rhTextView, rhTextView2, rhTextView3, rdsRowView3, rdsRowView4, rdsRowView5);
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
