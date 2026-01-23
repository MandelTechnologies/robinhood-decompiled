package com.robinhood.android.taxcertification.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.taxcertification.C29286R;

/* loaded from: classes9.dex */
public final class FragmentUnconfirmedTaxAlertBinding implements ViewBinding {
    public final RdsButton confirmButton;
    public final RdsButton dismissButton;
    private final LinearLayout rootView;
    public final RhTextView unconfirmedTaxMessage;
    public final RhTextView unconfirmedTaxTitle;

    private FragmentUnconfirmedTaxAlertBinding(LinearLayout linearLayout, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.confirmButton = rdsButton;
        this.dismissButton = rdsButton2;
        this.unconfirmedTaxMessage = rhTextView;
        this.unconfirmedTaxTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentUnconfirmedTaxAlertBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentUnconfirmedTaxAlertBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29286R.layout.fragment_unconfirmed_tax_alert, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentUnconfirmedTaxAlertBinding bind(View view) {
        int i = C29286R.id.confirm_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C29286R.id.dismiss_button;
            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton2 != null) {
                i = C29286R.id.unconfirmed_tax_message;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C29286R.id.unconfirmed_tax_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentUnconfirmedTaxAlertBinding((LinearLayout) view, rdsButton, rdsButton2, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
