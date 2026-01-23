package com.robinhood.android.beneficiaries.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.designsystem.numpad.RdsNumpadContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;

/* loaded from: classes7.dex */
public final class FragmentBeneficiaryCreateDobBinding implements ViewBinding {
    public final RdsFormattedEditText beneficiaryCreateDobEdt;
    public final RhTextView beneficiaryCreateDobSubtitle;
    public final RhTextView beneficiaryCreateDobTitle;
    public final RdsNumpadContainerView beneficiaryCreateNumpadContainer;
    private final LinearLayout rootView;

    private FragmentBeneficiaryCreateDobBinding(LinearLayout linearLayout, RdsFormattedEditText rdsFormattedEditText, RhTextView rhTextView, RhTextView rhTextView2, RdsNumpadContainerView rdsNumpadContainerView) {
        this.rootView = linearLayout;
        this.beneficiaryCreateDobEdt = rdsFormattedEditText;
        this.beneficiaryCreateDobSubtitle = rhTextView;
        this.beneficiaryCreateDobTitle = rhTextView2;
        this.beneficiaryCreateNumpadContainer = rdsNumpadContainerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBeneficiaryCreateDobBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBeneficiaryCreateDobBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C9637R.layout.fragment_beneficiary_create_dob, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBeneficiaryCreateDobBinding bind(View view) {
        int i = C9637R.id.beneficiary_create_dob_edt;
        RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
        if (rdsFormattedEditText != null) {
            i = C9637R.id.beneficiary_create_dob_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C9637R.id.beneficiary_create_dob_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C9637R.id.beneficiary_create_numpad_container;
                    RdsNumpadContainerView rdsNumpadContainerView = (RdsNumpadContainerView) ViewBindings.findChildViewById(view, i);
                    if (rdsNumpadContainerView != null) {
                        return new FragmentBeneficiaryCreateDobBinding((LinearLayout) view, rdsFormattedEditText, rhTextView, rhTextView2, rdsNumpadContainerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
