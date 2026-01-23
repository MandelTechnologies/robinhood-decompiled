package com.robinhood.android.verification.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.verification.C31368R;

/* loaded from: classes9.dex */
public final class FragmentPhoneUpdateBinding implements ViewBinding {
    public final RdsNumpadContainerView numpad;
    public final RdsTextButton phoneUpdateChangeCountryCodeBtn;
    private final LinearLayout rootView;
    public final RdsFormattedEditText updatePhoneInput;
    public final RdsTextInputContainerView updatePhoneInputContainer;
    public final RhTextView updatePhoneTitle;

    private FragmentPhoneUpdateBinding(LinearLayout linearLayout, RdsNumpadContainerView rdsNumpadContainerView, RdsTextButton rdsTextButton, RdsFormattedEditText rdsFormattedEditText, RdsTextInputContainerView rdsTextInputContainerView, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.numpad = rdsNumpadContainerView;
        this.phoneUpdateChangeCountryCodeBtn = rdsTextButton;
        this.updatePhoneInput = rdsFormattedEditText;
        this.updatePhoneInputContainer = rdsTextInputContainerView;
        this.updatePhoneTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPhoneUpdateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPhoneUpdateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31368R.layout.fragment_phone_update, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPhoneUpdateBinding bind(View view) {
        int i = C31368R.id.numpad;
        RdsNumpadContainerView rdsNumpadContainerView = (RdsNumpadContainerView) ViewBindings.findChildViewById(view, i);
        if (rdsNumpadContainerView != null) {
            i = C31368R.id.phone_update_change_country_code_btn;
            RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
            if (rdsTextButton != null) {
                i = C31368R.id.update_phone_input;
                RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
                if (rdsFormattedEditText != null) {
                    i = C31368R.id.update_phone_input_container;
                    RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                    if (rdsTextInputContainerView != null) {
                        i = C31368R.id.update_phone_title;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            return new FragmentPhoneUpdateBinding((LinearLayout) view, rdsNumpadContainerView, rdsTextButton, rdsFormattedEditText, rdsTextInputContainerView, rhTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
