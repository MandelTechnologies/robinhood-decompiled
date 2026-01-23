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
public final class FragmentEmailExceededNumberOfAttemptsBinding implements ViewBinding {
    public final AppCompatImageView emailExceededNumberOfAttemptsCautionImg;
    public final RdsButton emailExceededNumberOfAttemptsPrimaryCta;
    public final RhTextView emailExceededNumberOfAttemptsSummaryTxt;
    public final RhTextView emailExceededNumberOfAttemptsTitleTxt;
    private final ConstraintLayout rootView;

    private FragmentEmailExceededNumberOfAttemptsBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, RdsButton rdsButton, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = constraintLayout;
        this.emailExceededNumberOfAttemptsCautionImg = appCompatImageView;
        this.emailExceededNumberOfAttemptsPrimaryCta = rdsButton;
        this.emailExceededNumberOfAttemptsSummaryTxt = rhTextView;
        this.emailExceededNumberOfAttemptsTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEmailExceededNumberOfAttemptsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEmailExceededNumberOfAttemptsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31368R.layout.fragment_email_exceeded_number_of_attempts, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEmailExceededNumberOfAttemptsBinding bind(View view) {
        int i = C31368R.id.email_exceeded_number_of_attempts_caution_img;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C31368R.id.email_exceeded_number_of_attempts_primary_cta;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C31368R.id.email_exceeded_number_of_attempts_summary_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C31368R.id.email_exceeded_number_of_attempts_title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentEmailExceededNumberOfAttemptsBinding((ConstraintLayout) view, appCompatImageView, rdsButton, rhTextView, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
