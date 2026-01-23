package com.robinhood.android.taxcertification.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.taxcertification.C29286R;

/* loaded from: classes9.dex */
public final class FragmentSsnLockoutBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final RdsButton ssnLockoutCancelCta;
    public final AppCompatImageView ssnLockoutErrorTriangle;
    public final RhTextView ssnLockoutMessage;
    public final RdsButton ssnLockoutSubmitPhotoCta;
    public final RhTextView ssnLockoutTitle;

    private FragmentSsnLockoutBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, AppCompatImageView appCompatImageView, RhTextView rhTextView, RdsButton rdsButton2, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.ssnLockoutCancelCta = rdsButton;
        this.ssnLockoutErrorTriangle = appCompatImageView;
        this.ssnLockoutMessage = rhTextView;
        this.ssnLockoutSubmitPhotoCta = rdsButton2;
        this.ssnLockoutTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSsnLockoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSsnLockoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29286R.layout.fragment_ssn_lockout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSsnLockoutBinding bind(View view) {
        int i = C29286R.id.ssn_lockout_cancel_cta;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C29286R.id.ssn_lockout_error_triangle;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C29286R.id.ssn_lockout_message;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C29286R.id.ssn_lockout_submit_photo_cta;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        i = C29286R.id.ssn_lockout_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentSsnLockoutBinding((ConstraintLayout) view, rdsButton, appCompatImageView, rhTextView, rdsButton2, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
