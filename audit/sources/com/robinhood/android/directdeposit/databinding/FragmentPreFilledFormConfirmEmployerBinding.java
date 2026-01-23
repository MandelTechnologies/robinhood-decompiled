package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;

/* loaded from: classes27.dex */
public final class FragmentPreFilledFormConfirmEmployerBinding implements ViewBinding {
    public final RdsButton preFilledFormConfirmEmployer;
    public final RhTextView preFilledFormConfirmEmployerDescription;
    public final RhTextView preFilledFormConfirmEmployerName;
    public final RhTextView preFilledFormConfirmEmployerTitle;
    public final RdsButton preFilledFormUpdateEmployer;
    private final ConstraintLayout rootView;

    private FragmentPreFilledFormConfirmEmployerBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3, RdsButton rdsButton2) {
        this.rootView = constraintLayout;
        this.preFilledFormConfirmEmployer = rdsButton;
        this.preFilledFormConfirmEmployerDescription = rhTextView;
        this.preFilledFormConfirmEmployerName = rhTextView2;
        this.preFilledFormConfirmEmployerTitle = rhTextView3;
        this.preFilledFormUpdateEmployer = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPreFilledFormConfirmEmployerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPreFilledFormConfirmEmployerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.fragment_pre_filled_form_confirm_employer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPreFilledFormConfirmEmployerBinding bind(View view) {
        int i = C14044R.id.pre_filled_form_confirm_employer;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C14044R.id.pre_filled_form_confirm_employer_description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C14044R.id.pre_filled_form_confirm_employer_name;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C14044R.id.pre_filled_form_confirm_employer_title;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        i = C14044R.id.pre_filled_form_update_employer;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            return new FragmentPreFilledFormConfirmEmployerBinding((ConstraintLayout) view, rdsButton, rhTextView, rhTextView2, rhTextView3, rdsButton2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
