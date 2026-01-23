package com.robinhood.android.rhyonboarding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhyonboarding.C27634R;

/* loaded from: classes5.dex */
public final class FragmentRhyPostAccountOpenApprovedBinding implements ViewBinding {
    public final RdsButton rhyOnboardingAccountApprovedDoneButton;
    public final ImageView rhyOnboardingAccountApprovedIllustration;
    public final RhTextView rhyOnboardingAccountApprovedTitle;
    private final ConstraintLayout rootView;

    private FragmentRhyPostAccountOpenApprovedBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, ImageView imageView, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.rhyOnboardingAccountApprovedDoneButton = rdsButton;
        this.rhyOnboardingAccountApprovedIllustration = imageView;
        this.rhyOnboardingAccountApprovedTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyPostAccountOpenApprovedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyPostAccountOpenApprovedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27634R.layout.fragment_rhy_post_account_open_approved, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyPostAccountOpenApprovedBinding bind(View view) {
        int i = C27634R.id.rhy_onboarding_account_approved_done_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C27634R.id.rhy_onboarding_account_approved_illustration;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C27634R.id.rhy_onboarding_account_approved_title;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    return new FragmentRhyPostAccountOpenApprovedBinding((ConstraintLayout) view, rdsButton, imageView, rhTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
