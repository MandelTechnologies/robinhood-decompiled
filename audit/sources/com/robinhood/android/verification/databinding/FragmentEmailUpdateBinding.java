package com.robinhood.android.verification.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.verification.C31368R;

/* loaded from: classes9.dex */
public final class FragmentEmailUpdateBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RdsTextInputEditText updateEmailInput;
    public final RdsTextInputContainerView updateEmailInputContainer;
    public final RdsButton updateEmailPrimaryCta;
    public final RhTextView updateEmailTitle;

    private FragmentEmailUpdateBinding(LinearLayout linearLayout, RdsTextInputEditText rdsTextInputEditText, RdsTextInputContainerView rdsTextInputContainerView, RdsButton rdsButton, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.updateEmailInput = rdsTextInputEditText;
        this.updateEmailInputContainer = rdsTextInputContainerView;
        this.updateEmailPrimaryCta = rdsButton;
        this.updateEmailTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEmailUpdateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEmailUpdateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31368R.layout.fragment_email_update, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEmailUpdateBinding bind(View view) {
        int i = C31368R.id.update_email_input;
        RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
        if (rdsTextInputEditText != null) {
            i = C31368R.id.update_email_input_container;
            RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
            if (rdsTextInputContainerView != null) {
                i = C31368R.id.update_email_primary_cta;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C31368R.id.update_email_title;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        return new FragmentEmailUpdateBinding((LinearLayout) view, rdsTextInputEditText, rdsTextInputContainerView, rdsButton, rhTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
