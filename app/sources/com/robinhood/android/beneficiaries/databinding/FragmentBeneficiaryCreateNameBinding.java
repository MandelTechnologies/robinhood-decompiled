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
public final class FragmentBeneficiaryCreateNameBinding implements ViewBinding {
    public final RdsButton beneficiaryCreateNameContinue;
    public final RdsTextInputEditText beneficiaryCreateNameFirstNameEdt;
    public final RdsTextInputEditText beneficiaryCreateNameLastNameEdt;
    public final RhTextView beneficiaryCreateNameSubtitle;
    public final RhTextView beneficiaryCreateNameTitle;
    private final LinearLayout rootView;

    private FragmentBeneficiaryCreateNameBinding(LinearLayout linearLayout, RdsButton rdsButton, RdsTextInputEditText rdsTextInputEditText, RdsTextInputEditText rdsTextInputEditText2, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.beneficiaryCreateNameContinue = rdsButton;
        this.beneficiaryCreateNameFirstNameEdt = rdsTextInputEditText;
        this.beneficiaryCreateNameLastNameEdt = rdsTextInputEditText2;
        this.beneficiaryCreateNameSubtitle = rhTextView;
        this.beneficiaryCreateNameTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBeneficiaryCreateNameBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBeneficiaryCreateNameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C9637R.layout.fragment_beneficiary_create_name, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBeneficiaryCreateNameBinding bind(View view) {
        int i = C9637R.id.beneficiary_create_name_continue;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C9637R.id.beneficiary_create_name_first_name_edt;
            RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
            if (rdsTextInputEditText != null) {
                i = C9637R.id.beneficiary_create_name_last_name_edt;
                RdsTextInputEditText rdsTextInputEditText2 = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                if (rdsTextInputEditText2 != null) {
                    i = C9637R.id.beneficiary_create_name_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C9637R.id.beneficiary_create_name_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentBeneficiaryCreateNameBinding((LinearLayout) view, rdsButton, rdsTextInputEditText, rdsTextInputEditText2, rhTextView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
