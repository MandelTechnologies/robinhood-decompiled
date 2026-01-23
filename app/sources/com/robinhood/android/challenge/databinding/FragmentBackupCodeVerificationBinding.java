package com.robinhood.android.challenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
public final class FragmentBackupCodeVerificationBinding implements ViewBinding {
    public final RdsButton backupCodeContinueBtn;
    public final RdsFormattedEditText backupCodeVerificationInput;
    public final RhTextView backupCodeVerificationTitleText;
    public final RdsTextInputContainerView backupVerificationInputContainer;
    public final ShimmerLoadingView loadingView;
    public final RdsNumpadView numpad;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;

    private FragmentBackupCodeVerificationBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RdsFormattedEditText rdsFormattedEditText, RhTextView rhTextView, RdsTextInputContainerView rdsTextInputContainerView, ShimmerLoadingView shimmerLoadingView, RdsNumpadView rdsNumpadView, ScrollView scrollView) {
        this.rootView = constraintLayout;
        this.backupCodeContinueBtn = rdsButton;
        this.backupCodeVerificationInput = rdsFormattedEditText;
        this.backupCodeVerificationTitleText = rhTextView;
        this.backupVerificationInputContainer = rdsTextInputContainerView;
        this.loadingView = shimmerLoadingView;
        this.numpad = rdsNumpadView;
        this.scrollView = scrollView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBackupCodeVerificationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBackupCodeVerificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10497R.layout.fragment_backup_code_verification, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBackupCodeVerificationBinding bind(View view) {
        int i = C10497R.id.backup_code_continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10497R.id.backup_code_verification_input;
            RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
            if (rdsFormattedEditText != null) {
                i = C10497R.id.backup_code_verification_title_text;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C10497R.id.backup_verification_input_container;
                    RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                    if (rdsTextInputContainerView != null) {
                        i = C10497R.id.loading_view;
                        ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                        if (shimmerLoadingView != null) {
                            i = C10497R.id.numpad;
                            RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                            if (rdsNumpadView != null) {
                                i = C10497R.id.scroll_view;
                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                if (scrollView != null) {
                                    return new FragmentBackupCodeVerificationBinding((ConstraintLayout) view, rdsButton, rdsFormattedEditText, rhTextView, rdsTextInputContainerView, shimmerLoadingView, rdsNumpadView, scrollView);
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
