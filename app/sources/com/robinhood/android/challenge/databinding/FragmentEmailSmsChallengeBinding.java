package com.robinhood.android.challenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.challenge.C10497R;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;

/* loaded from: classes7.dex */
public final class FragmentEmailSmsChallengeBinding implements ViewBinding {
    public final RdsButton emailSmsChallengeHelpBtn;
    public final RdsFormattedEditText emailSmsChallengeInput;
    public final RdsTextInputContainerView emailSmsChallengeInputContainer;
    public final RhTextView emailSmsChallengeSummaryTxt;
    public final RhTextView emailSmsChallengeTitleText;
    public final ShimmerLoadingView loadingView;
    public final RdsNumpadView numpad;
    private final FrameLayout rootView;

    private FragmentEmailSmsChallengeBinding(FrameLayout frameLayout, RdsButton rdsButton, RdsFormattedEditText rdsFormattedEditText, RdsTextInputContainerView rdsTextInputContainerView, RhTextView rhTextView, RhTextView rhTextView2, ShimmerLoadingView shimmerLoadingView, RdsNumpadView rdsNumpadView) {
        this.rootView = frameLayout;
        this.emailSmsChallengeHelpBtn = rdsButton;
        this.emailSmsChallengeInput = rdsFormattedEditText;
        this.emailSmsChallengeInputContainer = rdsTextInputContainerView;
        this.emailSmsChallengeSummaryTxt = rhTextView;
        this.emailSmsChallengeTitleText = rhTextView2;
        this.loadingView = shimmerLoadingView;
        this.numpad = rdsNumpadView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEmailSmsChallengeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEmailSmsChallengeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10497R.layout.fragment_email_sms_challenge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEmailSmsChallengeBinding bind(View view) {
        int i = C10497R.id.email_sms_challenge_help_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10497R.id.email_sms_challenge_input;
            RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
            if (rdsFormattedEditText != null) {
                i = C10497R.id.email_sms_challenge_input_container;
                RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                if (rdsTextInputContainerView != null) {
                    i = C10497R.id.email_sms_challenge_summary_txt;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C10497R.id.email_sms_challenge_title_text;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C10497R.id.loading_view;
                            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                            if (shimmerLoadingView != null) {
                                i = C10497R.id.numpad;
                                RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                                if (rdsNumpadView != null) {
                                    return new FragmentEmailSmsChallengeBinding((FrameLayout) view, rdsButton, rdsFormattedEditText, rdsTextInputContainerView, rhTextView, rhTextView2, shimmerLoadingView, rdsNumpadView);
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
