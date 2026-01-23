package com.robinhood.android.common.recurring.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class FragmentEquityRecurringSourceOfFundsBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RdsRowView sourceOfFundsAddAccount;
    public final RhTextView sourceOfFundsDisclaimerTxt;
    public final LegacyRdsRadioGroup sourceOfFundsRadioGroup;
    public final RdsButton sourceOfFundsSelectedBtn;
    public final RhTextView sourceOfFundsTitleTxt;

    private FragmentEquityRecurringSourceOfFundsBinding(LinearLayout linearLayout, RdsRowView rdsRowView, RhTextView rhTextView, LegacyRdsRadioGroup legacyRdsRadioGroup, RdsButton rdsButton, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.sourceOfFundsAddAccount = rdsRowView;
        this.sourceOfFundsDisclaimerTxt = rhTextView;
        this.sourceOfFundsRadioGroup = legacyRdsRadioGroup;
        this.sourceOfFundsSelectedBtn = rdsButton;
        this.sourceOfFundsTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEquityRecurringSourceOfFundsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEquityRecurringSourceOfFundsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.fragment_equity_recurring_source_of_funds, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEquityRecurringSourceOfFundsBinding bind(View view) {
        int i = C11595R.id.source_of_funds_add_account;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C11595R.id.source_of_funds_disclaimer_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C11595R.id.source_of_funds_radio_group;
                LegacyRdsRadioGroup legacyRdsRadioGroup = (LegacyRdsRadioGroup) ViewBindings.findChildViewById(view, i);
                if (legacyRdsRadioGroup != null) {
                    i = C11595R.id.source_of_funds_selected_btn;
                    RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton != null) {
                        i = C11595R.id.source_of_funds_title_txt;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentEquityRecurringSourceOfFundsBinding((LinearLayout) view, rdsRowView, rhTextView, legacyRdsRadioGroup, rdsButton, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
