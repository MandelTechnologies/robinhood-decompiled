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
public final class FragmentUserCreationFullNameBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RdsTextInputEditText userCreationFirstNameInput;
    public final RdsTextInputContainerView userCreationFirstNameInputContainer;
    public final RdsButton userCreationFullNamePrimaryCta;
    public final RhTextView userCreationFullNameSubtitle;
    public final RhTextView userCreationFullNameTitle;
    public final RdsTextInputEditText userCreationLastNameInput;
    public final RdsTextInputContainerView userCreationLastNameInputContainer;

    private FragmentUserCreationFullNameBinding(LinearLayout linearLayout, RdsTextInputEditText rdsTextInputEditText, RdsTextInputContainerView rdsTextInputContainerView, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2, RdsTextInputEditText rdsTextInputEditText2, RdsTextInputContainerView rdsTextInputContainerView2) {
        this.rootView = linearLayout;
        this.userCreationFirstNameInput = rdsTextInputEditText;
        this.userCreationFirstNameInputContainer = rdsTextInputContainerView;
        this.userCreationFullNamePrimaryCta = rdsButton;
        this.userCreationFullNameSubtitle = rhTextView;
        this.userCreationFullNameTitle = rhTextView2;
        this.userCreationLastNameInput = rdsTextInputEditText2;
        this.userCreationLastNameInputContainer = rdsTextInputContainerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentUserCreationFullNameBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentUserCreationFullNameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C22739R.layout.fragment_user_creation_full_name, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentUserCreationFullNameBinding bind(View view) {
        int i = C22739R.id.user_creation_first_name_input;
        RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
        if (rdsTextInputEditText != null) {
            i = C22739R.id.user_creation_first_name_input_container;
            RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
            if (rdsTextInputContainerView != null) {
                i = C22739R.id.user_creation_full_name_primary_cta;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C22739R.id.user_creation_full_name_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C22739R.id.user_creation_full_name_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C22739R.id.user_creation_last_name_input;
                            RdsTextInputEditText rdsTextInputEditText2 = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                            if (rdsTextInputEditText2 != null) {
                                i = C22739R.id.user_creation_last_name_input_container;
                                RdsTextInputContainerView rdsTextInputContainerView2 = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                                if (rdsTextInputContainerView2 != null) {
                                    return new FragmentUserCreationFullNameBinding((LinearLayout) view, rdsTextInputEditText, rdsTextInputContainerView, rdsButton, rhTextView, rhTextView2, rdsTextInputEditText2, rdsTextInputContainerView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
