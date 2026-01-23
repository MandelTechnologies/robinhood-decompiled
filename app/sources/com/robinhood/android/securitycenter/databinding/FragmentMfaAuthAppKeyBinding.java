package com.robinhood.android.securitycenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.securitycenter.C28186R;

/* loaded from: classes5.dex */
public final class FragmentMfaAuthAppKeyBinding implements ViewBinding {
    public final RdsButton mfaAuthAppContinueBtn;
    public final RdsTextButton mfaAuthAppKeyCopyBtn;
    public final RhTextView mfaAuthAppKeyLabel;
    public final RhTextView mfaAuthAppKeySubtitle;
    private final LinearLayout rootView;

    private FragmentMfaAuthAppKeyBinding(LinearLayout linearLayout, RdsButton rdsButton, RdsTextButton rdsTextButton, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.mfaAuthAppContinueBtn = rdsButton;
        this.mfaAuthAppKeyCopyBtn = rdsTextButton;
        this.mfaAuthAppKeyLabel = rhTextView;
        this.mfaAuthAppKeySubtitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMfaAuthAppKeyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMfaAuthAppKeyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28186R.layout.fragment_mfa_auth_app_key, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMfaAuthAppKeyBinding bind(View view) {
        int i = C28186R.id.mfa_auth_app_continue_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C28186R.id.mfa_auth_app_key_copy_btn;
            RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
            if (rdsTextButton != null) {
                i = C28186R.id.mfa_auth_app_key_label;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C28186R.id.mfa_auth_app_key_subtitle;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentMfaAuthAppKeyBinding((LinearLayout) view, rdsButton, rdsTextButton, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
