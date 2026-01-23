package com.robinhood.android.verification.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.verification.C31368R;

/* loaded from: classes9.dex */
public final class FragmentEmailVerifySuccessBinding implements ViewBinding {
    public final RdsButton emailVerifyPrimaryCta;
    public final AppCompatImageView emailVerifySuccessImage;
    public final RhTextView emailVerifySuccessSubtitle;
    public final RhTextView emailVerifySuccessTitle;
    private final ConstraintLayout rootView;

    private FragmentEmailVerifySuccessBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, AppCompatImageView appCompatImageView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.emailVerifyPrimaryCta = rdsButton;
        this.emailVerifySuccessImage = appCompatImageView;
        this.emailVerifySuccessSubtitle = rhTextView;
        this.emailVerifySuccessTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEmailVerifySuccessBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEmailVerifySuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31368R.layout.fragment_email_verify_success, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEmailVerifySuccessBinding bind(View view) {
        int i = C31368R.id.email_verify_primary_cta;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C31368R.id.email_verify_success_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C31368R.id.email_verify_success_subtitle;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C31368R.id.email_verify_success_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentEmailVerifySuccessBinding((ConstraintLayout) view, rdsButton, appCompatImageView, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
