package com.robinhood.android.beneficiaries.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class IncludeBeneficiaryDetailEditBinding implements ViewBinding {
    public final RdsTextButton fragmentBeneficiaryDetailEdit;
    public final RhTextView fragmentBeneficiaryDetailTitle;
    private final LinearLayout rootView;

    private IncludeBeneficiaryDetailEditBinding(LinearLayout linearLayout, RdsTextButton rdsTextButton, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.fragmentBeneficiaryDetailEdit = rdsTextButton;
        this.fragmentBeneficiaryDetailTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeBeneficiaryDetailEditBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeBeneficiaryDetailEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C9637R.layout.include_beneficiary_detail_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeBeneficiaryDetailEditBinding bind(View view) {
        int i = C9637R.id.fragment_beneficiary_detail_edit;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            i = C9637R.id.fragment_beneficiary_detail_title;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new IncludeBeneficiaryDetailEditBinding((LinearLayout) view, rdsTextButton, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
