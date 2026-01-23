package com.robinhood.android.onboarding.databinding;

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
import com.robinhood.android.onboarding.C22739R;

/* loaded from: classes10.dex */
public final class FragmentUserCreationPasswordBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RdsTextInputEditText userCreationPasswordInput;
    public final RdsTextInputContainerView userCreationPasswordInputContainer;
    public final RdsButton userCreationPasswordPrimaryCta;
    public final RhTextView userCreationPasswordSubtitle;
    public final RhTextView userCreationPasswordTitle;

    private FragmentUserCreationPasswordBinding(LinearLayout linearLayout, RdsTextInputEditText rdsTextInputEditText, RdsTextInputContainerView rdsTextInputContainerView, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.userCreationPasswordInput = rdsTextInputEditText;
        this.userCreationPasswordInputContainer = rdsTextInputContainerView;
        this.userCreationPasswordPrimaryCta = rdsButton;
        this.userCreationPasswordSubtitle = rhTextView;
        this.userCreationPasswordTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentUserCreationPasswordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentUserCreationPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C22739R.layout.fragment_user_creation_password, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentUserCreationPasswordBinding bind(View view) {
        int i = C22739R.id.user_creation_password_input;
        RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
        if (rdsTextInputEditText != null) {
            i = C22739R.id.user_creation_password_input_container;
            RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
            if (rdsTextInputContainerView != null) {
                i = C22739R.id.user_creation_password_primary_cta;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C22739R.id.user_creation_password_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C22739R.id.user_creation_password_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentUserCreationPasswordBinding((LinearLayout) view, rdsTextInputEditText, rdsTextInputContainerView, rdsButton, rhTextView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
