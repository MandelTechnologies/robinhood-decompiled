package com.robinhood.android.beneficiaries.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.common.p088ui.view.DisclosureView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentBeneficiaryCreateAgreementBinding implements ViewBinding {
    public final RdsButton beneficiaryCreateAgreementAccept;
    public final RhTextView beneficiaryCreateAgreementText;
    public final DisclosureView beneficiaryCreateAgreementView;
    private final LinearLayout rootView;

    private FragmentBeneficiaryCreateAgreementBinding(LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView, DisclosureView disclosureView) {
        this.rootView = linearLayout;
        this.beneficiaryCreateAgreementAccept = rdsButton;
        this.beneficiaryCreateAgreementText = rhTextView;
        this.beneficiaryCreateAgreementView = disclosureView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBeneficiaryCreateAgreementBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBeneficiaryCreateAgreementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C9637R.layout.fragment_beneficiary_create_agreement, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBeneficiaryCreateAgreementBinding bind(View view) {
        int i = C9637R.id.beneficiary_create_agreement_accept;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C9637R.id.beneficiary_create_agreement_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C9637R.id.beneficiary_create_agreement_view;
                DisclosureView disclosureView = (DisclosureView) ViewBindings.findChildViewById(view, i);
                if (disclosureView != null) {
                    return new FragmentBeneficiaryCreateAgreementBinding((LinearLayout) view, rdsButton, rhTextView, disclosureView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
