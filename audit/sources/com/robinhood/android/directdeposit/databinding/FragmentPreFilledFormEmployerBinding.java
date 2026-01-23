package com.robinhood.android.directdeposit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.directdeposit.C14044R;

/* loaded from: classes27.dex */
public final class FragmentPreFilledFormEmployerBinding implements ViewBinding {
    public final RdsTextInputEditText preFilledFormEmployer;
    public final RdsButton preFilledFormEmployerContinueBtn;
    public final RhTextView preFilledFormEmployerDescription;
    public final RhTextView preFilledFormEmployerTitle;
    private final ConstraintLayout rootView;

    private FragmentPreFilledFormEmployerBinding(ConstraintLayout constraintLayout, RdsTextInputEditText rdsTextInputEditText, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.preFilledFormEmployer = rdsTextInputEditText;
        this.preFilledFormEmployerContinueBtn = rdsButton;
        this.preFilledFormEmployerDescription = rhTextView;
        this.preFilledFormEmployerTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPreFilledFormEmployerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPreFilledFormEmployerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14044R.layout.fragment_pre_filled_form_employer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPreFilledFormEmployerBinding bind(View view) {
        int i = C14044R.id.pre_filled_form_employer;
        RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
        if (rdsTextInputEditText != null) {
            i = C14044R.id.pre_filled_form_employer_continue_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C14044R.id.pre_filled_form_employer_description;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C14044R.id.pre_filled_form_employer_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentPreFilledFormEmployerBinding((ConstraintLayout) view, rdsTextInputEditText, rdsButton, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
