package com.robinhood.android.rhy.waitlist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhy.waitlist.C27560R;

/* loaded from: classes5.dex */
public final class FragmentRhyWaitlistSignUpConfirmationBinding implements ViewBinding {
    public final RdsButton rhyWaitlistSignUpConfirmationDoneButton;
    public final LottieAnimationView rhyWaitlistSignUpConfirmationLottie;
    public final RhTextView rhyWaitlistSignUpConfirmationText;
    public final RhTextView rhyWaitlistSignUpConfirmationTitle;
    public final LinearLayout rhyWaitlistSignUpConfirmationTooltip;
    private final ConstraintLayout rootView;

    private FragmentRhyWaitlistSignUpConfirmationBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, LottieAnimationView lottieAnimationView, RhTextView rhTextView, RhTextView rhTextView2, LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.rhyWaitlistSignUpConfirmationDoneButton = rdsButton;
        this.rhyWaitlistSignUpConfirmationLottie = lottieAnimationView;
        this.rhyWaitlistSignUpConfirmationText = rhTextView;
        this.rhyWaitlistSignUpConfirmationTitle = rhTextView2;
        this.rhyWaitlistSignUpConfirmationTooltip = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRhyWaitlistSignUpConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRhyWaitlistSignUpConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27560R.layout.fragment_rhy_waitlist_sign_up_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRhyWaitlistSignUpConfirmationBinding bind(View view) {
        int i = C27560R.id.rhy_waitlist_sign_up_confirmation_done_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C27560R.id.rhy_waitlist_sign_up_confirmation_lottie;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C27560R.id.rhy_waitlist_sign_up_confirmation_text;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C27560R.id.rhy_waitlist_sign_up_confirmation_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C27560R.id.rhy_waitlist_sign_up_confirmation_tooltip;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            return new FragmentRhyWaitlistSignUpConfirmationBinding((ConstraintLayout) view, rdsButton, lottieAnimationView, rhTextView, rhTextView2, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
