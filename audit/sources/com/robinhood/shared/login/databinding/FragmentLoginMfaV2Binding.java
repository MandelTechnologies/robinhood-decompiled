package com.robinhood.shared.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.shared.login.C39089R;

/* loaded from: classes6.dex */
public final class FragmentLoginMfaV2Binding implements ViewBinding {
    public final RdsButton challengeVerificationHelpBtn;
    public final RdsFormattedEditText challengeVerificationInput;
    public final RdsTextInputContainerView challengeVerificationInputContainer;
    public final RhTextView challengeVerificationSubtitleTxt;
    public final RhTextView challengeVerificationTitleText;
    public final RdsNumpadView numpad;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;

    private FragmentLoginMfaV2Binding(ConstraintLayout constraintLayout, RdsButton rdsButton, RdsFormattedEditText rdsFormattedEditText, RdsTextInputContainerView rdsTextInputContainerView, RhTextView rhTextView, RhTextView rhTextView2, RdsNumpadView rdsNumpadView, ScrollView scrollView) {
        this.rootView = constraintLayout;
        this.challengeVerificationHelpBtn = rdsButton;
        this.challengeVerificationInput = rdsFormattedEditText;
        this.challengeVerificationInputContainer = rdsTextInputContainerView;
        this.challengeVerificationSubtitleTxt = rhTextView;
        this.challengeVerificationTitleText = rhTextView2;
        this.numpad = rdsNumpadView;
        this.scrollView = scrollView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLoginMfaV2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLoginMfaV2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39089R.layout.fragment_login_mfa_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentLoginMfaV2Binding bind(View view) {
        int i = C39089R.id.challenge_verification_help_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C39089R.id.challenge_verification_input;
            RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
            if (rdsFormattedEditText != null) {
                i = C39089R.id.challenge_verification_input_container;
                RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                if (rdsTextInputContainerView != null) {
                    i = C39089R.id.challenge_verification_subtitle_txt;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C39089R.id.challenge_verification_title_text;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C39089R.id.numpad;
                            RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                            if (rdsNumpadView != null) {
                                i = C39089R.id.scrollView;
                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                if (scrollView != null) {
                                    return new FragmentLoginMfaV2Binding((ConstraintLayout) view, rdsButton, rdsFormattedEditText, rdsTextInputContainerView, rhTextView, rhTextView2, rdsNumpadView, scrollView);
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
