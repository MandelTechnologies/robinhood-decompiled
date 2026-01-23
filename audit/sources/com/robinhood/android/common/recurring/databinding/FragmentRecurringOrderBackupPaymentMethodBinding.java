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
public final class FragmentRecurringOrderBackupPaymentMethodBinding implements ViewBinding {
    public final RdsRowView backupPaymentMethodAddAccount;
    public final LegacyRdsRadioGroup backupPaymentMethodRadioGroup;
    public final RhTextView backupPaymentMethodSubtitleText;
    public final RhTextView backupPaymentMethodTitleText;
    private final LinearLayout rootView;
    public final RhTextView sourceOfFundsDisclaimerTxt;
    public final RdsButton sourceOfFundsSelectedBtn;
    public final RdsButton sourceOfFundsSkipBtn;

    private FragmentRecurringOrderBackupPaymentMethodBinding(LinearLayout linearLayout, RdsRowView rdsRowView, LegacyRdsRadioGroup legacyRdsRadioGroup, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RdsButton rdsButton, RdsButton rdsButton2) {
        this.rootView = linearLayout;
        this.backupPaymentMethodAddAccount = rdsRowView;
        this.backupPaymentMethodRadioGroup = legacyRdsRadioGroup;
        this.backupPaymentMethodSubtitleText = rhTextView;
        this.backupPaymentMethodTitleText = rhTextView2;
        this.sourceOfFundsDisclaimerTxt = rhTextView3;
        this.sourceOfFundsSelectedBtn = rdsButton;
        this.sourceOfFundsSkipBtn = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecurringOrderBackupPaymentMethodBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecurringOrderBackupPaymentMethodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11595R.layout.fragment_recurring_order_backup_payment_method, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecurringOrderBackupPaymentMethodBinding bind(View view) {
        int i = C11595R.id.backup_payment_method_add_account;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C11595R.id.backup_payment_method_radio_group;
            LegacyRdsRadioGroup legacyRdsRadioGroup = (LegacyRdsRadioGroup) ViewBindings.findChildViewById(view, i);
            if (legacyRdsRadioGroup != null) {
                i = C11595R.id.backup_payment_method_subtitle_text;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C11595R.id.backup_payment_method_title_text;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C11595R.id.source_of_funds_disclaimer_txt;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C11595R.id.source_of_funds_selected_btn;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                i = C11595R.id.source_of_funds_skip_btn;
                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton2 != null) {
                                    return new FragmentRecurringOrderBackupPaymentMethodBinding((LinearLayout) view, rdsRowView, legacyRdsRadioGroup, rhTextView, rhTextView2, rhTextView3, rdsButton, rdsButton2);
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
