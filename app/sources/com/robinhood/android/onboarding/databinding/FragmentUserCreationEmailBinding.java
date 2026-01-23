package com.robinhood.android.onboarding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.onboarding.C22739R;

/* loaded from: classes10.dex */
public final class FragmentUserCreationEmailBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RdsTextButton userCreationAlreadyHaveAccountBtn;
    public final RhTextView userCreationEmailDisclosure;
    public final RdsTextInputEditText userCreationEmailInput;
    public final RdsTextInputContainerView userCreationEmailInputContainer;
    public final RdsButton userCreationEmailPrimaryCta;
    public final NestedScrollView userCreationEmailScrollView;
    public final RhTextView userCreationEmailSubtitle;
    public final RhTextView userCreationEmailTitle;

    private FragmentUserCreationEmailBinding(LinearLayout linearLayout, RdsTextButton rdsTextButton, RhTextView rhTextView, RdsTextInputEditText rdsTextInputEditText, RdsTextInputContainerView rdsTextInputContainerView, RdsButton rdsButton, NestedScrollView nestedScrollView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = linearLayout;
        this.userCreationAlreadyHaveAccountBtn = rdsTextButton;
        this.userCreationEmailDisclosure = rhTextView;
        this.userCreationEmailInput = rdsTextInputEditText;
        this.userCreationEmailInputContainer = rdsTextInputContainerView;
        this.userCreationEmailPrimaryCta = rdsButton;
        this.userCreationEmailScrollView = nestedScrollView;
        this.userCreationEmailSubtitle = rhTextView2;
        this.userCreationEmailTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentUserCreationEmailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentUserCreationEmailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C22739R.layout.fragment_user_creation_email, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentUserCreationEmailBinding bind(View view) {
        int i = C22739R.id.user_creation_already_have_account_btn;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            i = C22739R.id.user_creation_email_disclosure;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C22739R.id.user_creation_email_input;
                RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) ViewBindings.findChildViewById(view, i);
                if (rdsTextInputEditText != null) {
                    i = C22739R.id.user_creation_email_input_container;
                    RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                    if (rdsTextInputContainerView != null) {
                        i = C22739R.id.user_creation_email_primary_cta;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C22739R.id.user_creation_email_scroll_view;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = C22739R.id.user_creation_email_subtitle;
                                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView2 != null) {
                                    i = C22739R.id.user_creation_email_title;
                                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView3 != null) {
                                        return new FragmentUserCreationEmailBinding((LinearLayout) view, rdsTextButton, rhTextView, rdsTextInputEditText, rdsTextInputContainerView, rdsButton, nestedScrollView, rhTextView2, rhTextView3);
                                    }
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
