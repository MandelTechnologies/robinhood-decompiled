package com.robinhood.android.lib.trade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.trade.C20649R;

/* loaded from: classes8.dex */
public final class FragmentAccountSwitcherSuitabilityDialogBinding implements ViewBinding {
    public final RdsButton completeSuitabilityCta;
    public final RdsButton dismissCta;
    private final LinearLayout rootView;
    public final RhTextView title;

    private FragmentAccountSwitcherSuitabilityDialogBinding(LinearLayout linearLayout, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.completeSuitabilityCta = rdsButton;
        this.dismissCta = rdsButton2;
        this.title = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAccountSwitcherSuitabilityDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAccountSwitcherSuitabilityDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20649R.layout.fragment_account_switcher_suitability_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAccountSwitcherSuitabilityDialogBinding bind(View view) {
        int i = C20649R.id.complete_suitability_cta;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C20649R.id.dismiss_cta;
            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton2 != null) {
                i = C20649R.id.title;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    return new FragmentAccountSwitcherSuitabilityDialogBinding((LinearLayout) view, rdsButton, rdsButton2, rhTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
