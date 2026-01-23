package com.robinhood.android.securitycenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.securitycenter.C28186R;

/* loaded from: classes5.dex */
public final class FragmentMfaAuthAppVerifyBinding implements ViewBinding {
    public final RdsFormattedEditText mfaAuthAppVerifyInput;
    public final ShimmerLoadingView mfaAuthAppVerifyLoadingView;
    public final RdsNumpadView mfaAuthAppVerifyNumpad;
    public final RhTextView mfaAuthAppVerifySubtitle;
    public final RhTextView mfaAuthAppVerifyTitle;
    private final ConstraintLayout rootView;

    private FragmentMfaAuthAppVerifyBinding(ConstraintLayout constraintLayout, RdsFormattedEditText rdsFormattedEditText, ShimmerLoadingView shimmerLoadingView, RdsNumpadView rdsNumpadView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.mfaAuthAppVerifyInput = rdsFormattedEditText;
        this.mfaAuthAppVerifyLoadingView = shimmerLoadingView;
        this.mfaAuthAppVerifyNumpad = rdsNumpadView;
        this.mfaAuthAppVerifySubtitle = rhTextView;
        this.mfaAuthAppVerifyTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMfaAuthAppVerifyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMfaAuthAppVerifyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28186R.layout.fragment_mfa_auth_app_verify, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMfaAuthAppVerifyBinding bind(View view) {
        int i = C28186R.id.mfa_auth_app_verify_input;
        RdsFormattedEditText rdsFormattedEditText = (RdsFormattedEditText) ViewBindings.findChildViewById(view, i);
        if (rdsFormattedEditText != null) {
            i = C28186R.id.mfa_auth_app_verify_loading_view;
            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
            if (shimmerLoadingView != null) {
                i = C28186R.id.mfa_auth_app_verify_numpad;
                RdsNumpadView rdsNumpadView = (RdsNumpadView) ViewBindings.findChildViewById(view, i);
                if (rdsNumpadView != null) {
                    i = C28186R.id.mfa_auth_app_verify_subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C28186R.id.mfa_auth_app_verify_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentMfaAuthAppVerifyBinding((ConstraintLayout) view, rdsFormattedEditText, shimmerLoadingView, rdsNumpadView, rhTextView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
