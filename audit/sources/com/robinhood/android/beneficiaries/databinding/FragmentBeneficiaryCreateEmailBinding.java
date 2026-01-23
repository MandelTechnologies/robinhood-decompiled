package com.robinhood.android.beneficiaries.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;

/* loaded from: classes7.dex */
public final class FragmentBeneficiaryCreateEmailBinding implements ViewBinding {
    public final RdsButton beneficiaryCreateEmailContinue;
    public final RhTextView beneficiaryCreateEmailSubtitle;
    public final RhTextView beneficiaryCreateEmailTitle;
    public final RdsTextInputEditText beneficiaryCreateNameEmailEdt;
    private final LinearLayout rootView;

    private FragmentBeneficiaryCreateEmailBinding(LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2, RdsTextInputEditText rdsTextInputEditText) {
        this.rootView = linearLayout;
        this.beneficiaryCreateEmailContinue = rdsButton;
        this.beneficiaryCreateEmailSubtitle = rhTextView;
        this.beneficiaryCreateEmailTitle = rhTextView2;
        this.beneficiaryCreateNameEmailEdt = rdsTextInputEditText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBeneficiaryCreateEmailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBeneficiaryCreateEmailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C9637R.layout.fragment_beneficiary_create_email, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBeneficiaryCreateEmailBinding bind(View view) {
        int i = C9637R.id.beneficiary_create_email_continue;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C9637R.id.beneficiary_create_email_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C9637R.id.beneficiary_create_email_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C9637R.id.beneficiary_create_name_email_edt;
                    RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                    if (rdsTextInputEditText != null) {
                        return new FragmentBeneficiaryCreateEmailBinding((LinearLayout) view, rdsButton, rhTextView, rhTextView2, rdsTextInputEditText);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
