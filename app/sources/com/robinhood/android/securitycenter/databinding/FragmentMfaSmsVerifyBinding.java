package com.robinhood.android.securitycenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.securitycenter.C28186R;

/* loaded from: classes5.dex */
public final class FragmentMfaSmsVerifyBinding implements ViewBinding {
    public final RdsButton mfaSmsVerifyChangeNumberBtn;
    public final RdsFormattedEditText mfaSmsVerifyInput;
    public final RdsTextInputContainerView mfaSmsVerifyInputContainer;
    public final ShimmerLoadingView mfaSmsVerifyLoadingView;
    public final RdsNumpadView mfaSmsVerifyNumpad;
    public final RdsButton mfaSmsVerifyResendBtn;
    public final RhTextView mfaSmsVerifySubtitle;
    public final RhTextView mfaSmsVerifyTitle;
    private final ConstraintLayout rootView;

    private FragmentMfaSmsVerifyBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RdsFormattedEditText rdsFormattedEditText, RdsTextInputContainerView rdsTextInputContainerView, ShimmerLoadingView shimmerLoadingView, RdsNumpadView rdsNumpadView, RdsButton rdsButton2, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.mfaSmsVerifyChangeNumberBtn = rdsButton;
        this.mfaSmsVerifyInput = rdsFormattedEditText;
        this.mfaSmsVerifyInputContainer = rdsTextInputContainerView;
        this.mfaSmsVerifyLoadingView = shimmerLoadingView;
        this.mfaSmsVerifyNumpad = rdsNumpadView;
        this.mfaSmsVerifyResendBtn = rdsButton2;
        this.mfaSmsVerifySubtitle = rhTextView;
        this.mfaSmsVerifyTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMfaSmsVerifyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMfaSmsVerifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28186R.layout.fragment_mfa_sms_verify, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMfaSmsVerifyBinding bind(View view) {
        int i = C28186R.id.mfa_sms_verify_change_number_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C28186R.id.mfa_sms_verify_input;
            RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
            if (rdsFormattedEditText != null) {
                i = C28186R.id.mfa_sms_verify_input_container;
                RdsTextInputContainerView rdsTextInputContainerView = (RdsTextInputContainerView) ViewBindings.findChildViewById(view, i);
                if (rdsTextInputContainerView != null) {
                    i = C28186R.id.mfa_sms_verify_loading_view;
                    ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                    if (shimmerLoadingView != null) {
                        i = C28186R.id.mfa_sms_verify_numpad;
                        RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                        if (rdsNumpadView != null) {
                            i = C28186R.id.mfa_sms_verify_resend_btn;
                            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton2 != null) {
                                i = C28186R.id.mfa_sms_verify_subtitle;
                                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView != null) {
                                    i = C28186R.id.mfa_sms_verify_title;
                                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView2 != null) {
                                        return new FragmentMfaSmsVerifyBinding((ConstraintLayout) view, rdsButton, rdsFormattedEditText, rdsTextInputContainerView, shimmerLoadingView, rdsNumpadView, rdsButton2, rhTextView, rhTextView2);
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
