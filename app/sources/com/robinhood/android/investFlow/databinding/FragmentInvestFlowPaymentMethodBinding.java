package com.robinhood.android.investFlow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;

/* loaded from: classes10.dex */
public final class FragmentInvestFlowPaymentMethodBinding implements ViewBinding {
    public final RhTextView paymentMethodBackupDescription;
    public final RdsButton paymentMethodContinueBtn;
    public final RhTextView paymentMethodDisclaimerTxt;
    public final RdsButton paymentMethodSkipBtn;
    public final RhTextView paymentMethodTitleTxt;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;

    private FragmentInvestFlowPaymentMethodBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsButton rdsButton, RhTextView rhTextView2, RdsButton rdsButton2, RhTextView rhTextView3, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.paymentMethodBackupDescription = rhTextView;
        this.paymentMethodContinueBtn = rdsButton;
        this.paymentMethodDisclaimerTxt = rhTextView2;
        this.paymentMethodSkipBtn = rdsButton2;
        this.paymentMethodTitleTxt = rhTextView3;
        this.recyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentInvestFlowPaymentMethodBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentInvestFlowPaymentMethodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C19349R.layout.fragment_invest_flow_payment_method, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentInvestFlowPaymentMethodBinding bind(View view) {
        int i = C19349R.id.payment_method_backup_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C19349R.id.payment_method_continue_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C19349R.id.payment_method_disclaimer_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C19349R.id.payment_method_skip_btn;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        i = C19349R.id.payment_method_title_txt;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C19349R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                return new FragmentInvestFlowPaymentMethodBinding((LinearLayout) view, rhTextView, rdsButton, rhTextView2, rdsButton2, rhTextView3, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
