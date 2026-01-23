package com.robinhood.android.taxcertification.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.taxcertification.C29286R;

/* loaded from: classes9.dex */
public final class FragmentCheckSsnBinding implements ViewBinding {
    public final RdsButton checkSsnCta;
    public final RhTextView checkSsnMessage;
    public final RdsNumpadView checkSsnNumpad;
    public final RhTextView checkSsnTitle;
    private final ConstraintLayout rootView;
    public final RdsTextInputContainerView ssnInputContainer;
    public final RdsTextInputEditText ssnInputEditText;

    private FragmentCheckSsnBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RhTextView rhTextView, RdsNumpadView rdsNumpadView, RhTextView rhTextView2, RdsTextInputContainerView rdsTextInputContainerView, RdsTextInputEditText rdsTextInputEditText) {
        this.rootView = constraintLayout;
        this.checkSsnCta = rdsButton;
        this.checkSsnMessage = rhTextView;
        this.checkSsnNumpad = rdsNumpadView;
        this.checkSsnTitle = rhTextView2;
        this.ssnInputContainer = rdsTextInputContainerView;
        this.ssnInputEditText = rdsTextInputEditText;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCheckSsnBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCheckSsnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29286R.layout.fragment_check_ssn, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCheckSsnBinding bind(View view) {
        int i = C29286R.id.check_ssn_cta;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C29286R.id.check_ssn_message;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C29286R.id.check_ssn_numpad;
                RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                if (rdsNumpadView != null) {
                    i = C29286R.id.check_ssn_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C29286R.id.ssn_input_container;
                        RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                        if (rdsTextInputContainerView != null) {
                            i = C29286R.id.ssn_input_edit_text;
                            RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                            if (rdsTextInputEditText != null) {
                                return new FragmentCheckSsnBinding((ConstraintLayout) view, rdsButton, rhTextView, rdsNumpadView, rhTextView2, rdsTextInputContainerView, rdsTextInputEditText);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
